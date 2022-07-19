package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Cliente;

public class ClienteDAO implements IClienteDAO {
	

	@Override
	public void create(Cliente cl) {
		
		String sql = "";
		try {
							
			sql = "insert into cliente (nombreUsuario, fechaNacimiento, run, clave, perfil, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad) " + "values ('"
					+ cl.getNombreUsuario() + "', '" + cl.getFechaNacimiento() + "', '" + cl.getRun() + "', '"
					+ cl.getClave() + "', '" + cl.getPerfil() + "', '" + cl.getRun() + "', '"
					+ cl.getNombres() + "', '" + cl.getApellidos() + "', '"
					+ cl.getTelefono() + "', '" + cl.getAfp() + "', '" + cl.getSistemaSalud() + "', '"
					+ cl.getDireccion() + "', '" + cl.getComuna() + "', '" + cl.getEdad() + "') ";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD: " + sql);
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Cliente> read() {
		
		List<Cliente> lista = new ArrayList<Cliente>();

		try {

			String sql = "select idCliente, nombreUsuario, fechaNacimiento, run, clave, perfil, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad from cliente";

			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {

				lista.add(new Cliente(						
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idCliente"),
						rs.getInt("rut"),
						rs.getString("nombres"),
						rs.getString("apellidos"),
						rs.getInt("telefono"),
						rs.getString("afp"),
						rs.getInt("sistemaSalud"),
						rs.getString("direccion"),
						rs.getString("comuna"),
						rs.getInt("edad")));
			}


			
			
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Cliente read(int idCliente) {
		
		Cliente cliente = new Cliente();

		try {
								
			String sql = "select idCliente, nombreUsuario, fechaNacimiento, run, clave, perfil, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad from cliente where idCliente = " + idCliente;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				cliente = new Cliente(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idCliente"),
						rs.getInt("rut"),
						rs.getString("nombres"),
						rs.getString("apellidos"),
						rs.getInt("telefono"),
						rs.getString("afp"),
						rs.getInt("sistemaSalud"),
						rs.getString("direccion"),
						rs.getString("comuna"),
						rs.getInt("edad"));
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return cliente;		
	}
	
	@Override
	public Cliente readRun(int run) {
		
		Cliente cliente = new Cliente();

		try {
								
			String sql = "select idCliente, nombreUsuario, fechaNacimiento, run, clave, perfil, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad from cliente where run = " + run;
						
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {				
				cliente = new Cliente(
						rs.getString("nombreUsuario"),
						rs.getString("fechaNacimiento"),
						rs.getInt("run"),
						rs.getString("clave"),
						rs.getString("perfil"),
						rs.getInt("idCliente"),
						rs.getInt("rut"),
						rs.getString("nombres"),
						rs.getString("apellidos"),
						rs.getInt("telefono"),
						rs.getString("afp"),
						rs.getInt("sistemaSalud"),
						rs.getString("direccion"),
						rs.getString("comuna"),
						rs.getInt("edad"));
			}			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}

		return cliente;		
	}

	@Override
	public void update(Cliente cl) {

		try {

			String sql = "update cliente set nombreUsuario = '" + cl.getNombreUsuario()
					+ "', fechaNacimiento = '" + cl.getFechaNacimiento()
					+ "', run = '" + cl.getRun()
					+ "', clave = '" + cl.getClave()
					+ "', rut = '" + cl.getRut()
					+ "', nombres = '" + cl.getNombres()
					+ "', apellidos = '" + cl.getApellidos()
					+ "', telefono = '" + cl.getTelefono()
					+ "', afp = '" + cl.getAfp()
					+ "', sistemaSalud = '" + cl.getSistemaSalud()
					+ "', direccion = '" + cl.getDireccion()
					+ "', comuna = '" + cl.getComuna()
					+ "', edad = '" + cl.getEdad()					
					+ "' where idCliente = " + cl.getIdCliente();
			
			Connection cnn = Conexion.getConnection();

			Statement stm = cnn.createStatement();

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
	}

}
