package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Administrativo;

public class AdministrativoDAO implements IAdministrativoDAO {
	

	@Override
	public void create(Administrativo a) {
		
		String sql = "";
		try {
							
			sql = "insert into administrativo (nombreUsuario, fechaNacimiento, run, clave, perfil, area, experienciaPrevia) " + "values ('"
					+ a.getNombreUsuario() + "', '" + a.getFechaNacimiento() + "', '" + a.getRun() + "', '"
					+ a.getClave() + "', '" + a.getPerfil() + "', '" + a.getArea() + "', '" + a.getExperienciaPrevia() + "') ";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD: " + sql);
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Administrativo> read() {
		
		List<Administrativo> lista = new ArrayList<Administrativo>();

		try {
			
			String sql = "select idAdministrativo, nombreUsuario, fechaNacimiento, run, clave, perfil, area, experienciaPrevia from administrativo";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				lista.add(new Administrativo(						
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idAdministrativo"),
						rs.getString("area"),
						rs.getString("experienciaPrevia")));
			}

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Administrativo read(int idAdministrativo) {
		
		Administrativo administrativo = new Administrativo();

		try {
			
			
			String sql = "select idAdministrativo, nombreUsuario, fechaNacimiento, run, clave, perfil, area, experienciaPrevia from administrativo where idAdministrativo = " + idAdministrativo;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				administrativo = new Administrativo(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idAdministrativo"),
						rs.getString("area"),
						rs.getString("experienciaPrevia"));				
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return administrativo;		
	}
	
	@Override
	public Administrativo readRun(int run) {
		
		Administrativo administrativo = new Administrativo();

		try {
			
			
			String sql = "select idAdministrativo, nombreUsuario, fechaNacimiento, run, clave, perfil, area, experienciaPrevia from administrativo where run = " + run;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				administrativo = new Administrativo(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idAdministrativo"),
						rs.getString("area"),
						rs.getString("experienciaPrevia"));				
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return administrativo;		
	}

	@Override
	public void update(Administrativo a) {

		try {

			String sql = "update administrativo set nombreUsuario = '" + a.getNombreUsuario()
					+ "', fechaNacimiento = '" + a.getFechaNacimiento()
					+ "', run = '" + a.getRun()
					+ "', clave = '" + a.getClave()
					+ "', area = '" + a.getArea()
					+ "', experienciaPrevia = '" + a.getExperienciaPrevia() + "' where idAdministrativo = " + a.getIdAdministrativo();
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
	}

}
