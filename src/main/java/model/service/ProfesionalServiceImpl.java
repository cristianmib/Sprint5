package model.service;

import java.util.List;

import model.dao.IProfesionalDAO;
import model.dao.ProfesionalDAO;
import model.entity.Profesional;

public class ProfesionalServiceImpl implements ProfesionalService {
	
	IProfesionalDAO dao = new ProfesionalDAO();

	@Override
	public void create(Profesional p) {
		dao.create(p);	
	}

	@Override
	public List<Profesional> read() {
		return dao.read();
	}

	@Override
	public Profesional read(int idProfesional) {
		return dao.read(idProfesional);
	}
	
	@Override
	public Profesional readRun(int run) {
		return dao.readRun(run);
	}

	@Override
	public void update(Profesional profesional) {
		dao.update(profesional);	
	}

}
