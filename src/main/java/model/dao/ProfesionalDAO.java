package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Profesional;

public class ProfesionalDAO implements IProfesionalDAO {
	

	@Override
	public void create(Profesional p) {
		
		String sql = "";
		try {
							
			sql = "insert into profesional (nombreUsuario, fechaNacimiento, run, clave, perfil, titulo, fechaIngreso) " + "values ('"
					+ p.getNombreUsuario() + "', '" + p.getFechaNacimiento() + "', '" + p.getRun() + "', '"
					+ p.getClave() + "', '" + p.getPerfil() + "', '" + p.getTitulo() + "', '" + p.getFechaIngreso() + "') ";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD: " + sql);
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Profesional> read() {
		
		List<Profesional> lista = new ArrayList<Profesional>();

		try {
			
			String sql = "select idProfesional, nombreUsuario, fechaNacimiento, run,clave, perfil, titulo, fechaIngreso from profesional";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				lista.add(new Profesional(						
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idProfesional"),
						rs.getString("titulo"),
						rs.getString("fechaIngreso")));
			}

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Profesional read(int idProfesional) {
		
		Profesional profesional = new Profesional();

		try {
			
			String sql = "select idProfesional, nombreUsuario, fechaNacimiento, run, clave, perfil, titulo, fechaIngreso from profesional where idProfesional = " + idProfesional;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				profesional = new Profesional(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idProfesional"),
						rs.getString("titulo"),
						rs.getString("fechaIngreso"));				
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return profesional;		
	}
	
	@Override
	public Profesional readRun(int run) {
		
		Profesional profesional = new Profesional();

		try {
			
			String sql = "select idProfesional, nombreUsuario, fechaNacimiento, run, clave, perfil, titulo, fechaIngreso from profesional where run = " + run;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				profesional = new Profesional(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idProfesional"),
						rs.getString("titulo"),
						rs.getString("fechaIngreso"));				
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return profesional;		
	}

	@Override
	public void update(Profesional p) {

		try {

			String sql = "update profesional set nombreUsuario = '" + p.getNombreUsuario()
					+ "', fechaNacimiento = '" + p.getFechaNacimiento()
					+ "', run = '" + p.getRun()
					+ "', clave = '" + p.getClave()
					+ "', titulo = '" + p.getTitulo()
					+ "', fechaIngreso = '" + p.getFechaIngreso() + "' where IdProfesional = " + p.getIdProfesional();
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
	}

}
