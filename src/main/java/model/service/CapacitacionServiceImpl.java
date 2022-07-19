package model.service;

import java.util.List;

import model.dao.CapacitacionDAO;
import model.dao.ICapacitacionDAO;
import model.entity.Capacitacion;

public class CapacitacionServiceImpl implements CapacitacionService {
	
	ICapacitacionDAO dao = new CapacitacionDAO();

	@Override
	public void create(Capacitacion c) {
		dao.create(c);		
	}

	@Override
	public List<Capacitacion> read() {
		return dao.read();
	}

	@Override
	public Capacitacion read(int idCapacitacion) {
		return dao.read(idCapacitacion);
	}

}
