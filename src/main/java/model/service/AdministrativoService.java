package model.service;

import java.util.List;

import model.entity.Administrativo;

public interface AdministrativoService {
	
	public void create(Administrativo a);
	public List<Administrativo> read();
	public Administrativo read(int idAdministrativo);
	public Administrativo readRun(int run);
	public void update(Administrativo administrativo);

}
