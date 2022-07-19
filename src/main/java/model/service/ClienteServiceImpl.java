package model.service;

import java.util.List;

import model.dao.ClienteDAO;
import model.dao.IClienteDAO;
import model.entity.Cliente;

public class ClienteServiceImpl implements ClienteService {
	
	IClienteDAO dao = new ClienteDAO();

	@Override
	public void create(Cliente cl) {
		dao.create(cl);		
	}

	@Override
	public List<Cliente> read() {
		return dao.read();
	}

	@Override
	public Cliente read(int idCliente) {
		return dao.read(idCliente);
	}
	
	@Override
	public Cliente readRun(int run) {
		return dao.readRun(run);
	}

	@Override
	public void update(Cliente cliente) {
		dao.update(cliente);		
	}

}
