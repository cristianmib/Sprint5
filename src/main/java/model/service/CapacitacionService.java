package model.service;

import java.util.List;

import model.entity.Capacitacion;

public interface CapacitacionService {
	
	public void create(Capacitacion c);
	public List<Capacitacion> read();
	public Capacitacion read(int idCapacitacion);
}
