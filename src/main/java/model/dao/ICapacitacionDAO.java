package model.dao;

import java.util.List;

import model.entity.Capacitacion;

public interface ICapacitacionDAO {
	
	/*
	C -> Create
	R -> Read
	U -> Update
	D -> Delete
	*/

	public void create(Capacitacion c);
	public List<Capacitacion> read();
	public Capacitacion read(int idCapacitacion);
}
