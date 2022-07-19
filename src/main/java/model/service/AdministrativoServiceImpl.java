package model.service;

import java.util.List;

import model.dao.AdministrativoDAO;
import model.dao.IAdministrativoDAO;
import model.entity.Administrativo;

public class AdministrativoServiceImpl implements AdministrativoService {
	
	IAdministrativoDAO dao = new AdministrativoDAO();

	@Override
	public void create(Administrativo a) {
		dao.create(a);		
	}

	@Override
	public List<Administrativo> read() {
		return dao.read();
	}

	@Override
	public Administrativo read(int idAdministrativo) {
		return dao.read(idAdministrativo);
	}
	
	@Override
	public Administrativo readRun(int run) {
		return dao.readRun(run);
	}

	@Override
	public void update(Administrativo administrativo) {
		dao.update(administrativo);
	}

}
