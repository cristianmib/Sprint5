package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Capacitacion;

public class CapacitacionDAO implements ICapacitacionDAO {
	

	@Override
	public void create(Capacitacion c) {
		
		String sql = "";
		try {

			sql = "insert into capacitacion (rutCliente, diaSemana, hora, lugar, duracion, cantidadAsistentes) " + "values ('"
					+ c.getRutCliente() + "', '" + c.getDiaSemana() + "', '" + c.getHora() + "', '" + c.getLugar() + "', '" + c.getDuracion()
					+ "', '" + c.getCantidadAsistentes() + "' ) ";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD: " + sql);
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Capacitacion> read() {
		
		List<Capacitacion> lista = new ArrayList<Capacitacion>();

		try {

			String sql = "select idCapacitacion, rutCliente, diaSemana, hora, lugar, duracion, cantidadAsistentes from capacitacion";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				lista.add(new Capacitacion(rs.getInt("idCapacitacion"), rs.getInt("rutCliente"), rs.getString("diaSemana"),
						rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidadAsistentes")));
			}

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Capacitacion read(int idCapacitacion) {
		
		Capacitacion capacitacion = new Capacitacion();

		try {

			String sql = "select idCapacitacion, rutCliente, diaSemana, hora, lugar,"
					+ "duracion, cantidadAsistentes from capacitacion where idCapacitacion = " + idCapacitacion;
					
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				capacitacion = new Capacitacion(rs.getInt("idCapacitacion"), rs.getInt("rutCliente"), rs.getString("diaSemana"),
						rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidadAsistentes"));		
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return capacitacion;		
	}

}
