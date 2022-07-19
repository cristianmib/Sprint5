package model.service;

import java.util.List;

import model.entity.Cliente;

public interface ClienteService {
	
	public void create(Cliente cl);
	public List<Cliente> read();
	public Cliente read(int idCliente);
	public Cliente readRun(int run);
	public void update(Cliente cliente);

}
