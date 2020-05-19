package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sinfloo.demo.modelo.conquista;

public interface IConquistaService{

	public List<conquista>listar();
	public Optional<conquista>listarId(int id);
	public int save(conquista c);
	public void delete(int id);
}
