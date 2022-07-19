package model.entity;

public class Administrativo extends Usuario {
	
	// ****************************** ******************************
	// Atributos.
	private int idAdministrativo;
	private String area;
	private String experienciaPrevia;
	
	// ****************************** ******************************
	// Constructores.
	public Administrativo() {
		super();
	}

	public Administrativo(String nombreUsuario, String fechaNacimiento, int run, String clave, String perfil,
			int idAdministrativo, String area, String experienciaPrevia) {
		super(nombreUsuario, fechaNacimiento, run, clave, perfil);
		this.idAdministrativo = idAdministrativo;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	// ****************************** ******************************
	// Accesores y mutadores.
	public int getIdAdministrativo() {
		return idAdministrativo;
	}

	public void setIdAdministrativo(int idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	// ****************************** ******************************
	// toString().
	@Override
	public String toString() {
		return "Administrativo [idAdministrativo=" + idAdministrativo + ", area=" + area + ", experienciaPrevia="
				+ experienciaPrevia + "]";
	}
	
}
