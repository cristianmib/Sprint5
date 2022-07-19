package model.entity;

public class Profesional extends Usuario {
	
	// ****************************** ******************************
	// Atributos.
	private int idProfesional;
	private String titulo;
	private String fechaIngreso;
	
	// ****************************** ******************************
	// Constructores.
	public Profesional() {
		super();
	}

	public Profesional(String nombreUsuario, String fechaNacimiento, int run, String clave, String perfil,
			int idProfesional, String titulo, String fechaIngreso) {
		super(nombreUsuario, fechaNacimiento, run, clave, perfil);
		this.idProfesional = idProfesional;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	// ****************************** ******************************
	// Accesores y mutadores.
	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	// ****************************** ******************************
	// toString().
	@Override
	public String toString() {
		return "Profesional [idProfesional=" + idProfesional + ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso
				+ "]";
	}
	
}
