package model.entity;

public class Usuario {
	
	// ****************************** ******************************
	// Atributos.
	private String nombreUsuario;
	private String fechaNacimiento;
	private int run;
	private String clave;
	private String perfil;
	
	// ****************************** ******************************
	// Constructores.
	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String fechaNacimiento, int run, String clave, String perfil) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
		this.clave = clave;
		this.perfil = perfil;
	}

	// ****************************** ******************************
	// Accesores y mutadores.
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	// ****************************** ******************************
	// toString().
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ ", clave=" + clave + ", perfil=" + perfil + "]";
	}
	
}
