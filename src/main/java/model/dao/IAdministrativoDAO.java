package model.dao;

import java.util.List;

import model.entity.Administrativo;

public interface IAdministrativoDAO {

	/*
	C -> Create
	R -> Read
	U -> Update
	D -> Delete
	*/

	public void create(Administrativo a);
	public List<Administrativo> read();
	public Administrativo read(int idAdministrativo);
	public Administrativo readRun(int run);
	public void update(Administrativo a);
}
