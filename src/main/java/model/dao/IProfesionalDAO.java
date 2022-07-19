package model.dao;

import java.util.List;

import model.entity.Profesional;

public interface IProfesionalDAO {
	
	/*
	C -> Create
	R -> Read
	U -> Update
	D -> Delete
	*/

	public void create(Profesional p);
	public List<Profesional> read();
	public Profesional read(int idProfesional);
	public Profesional readRun(int run);
	public void update(Profesional p);
}
