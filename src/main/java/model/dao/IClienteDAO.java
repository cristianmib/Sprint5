package model.dao;

import java.util.List;

import model.entity.Cliente;

public interface IClienteDAO {	
	
	/*
	C -> Create
	R -> Read
	U -> Update
	D -> Delete
	*/

	public void create(Cliente cl);
	public List<Cliente> read();
	public Cliente read(int idCliente);
	public Cliente readRun(int run);
	public void update(Cliente cl);
}
