package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sinfloo.demo.modelo.dragon;

public interface IDragonService {

	public List<dragon>listar();
	public Optional<dragon>listarId(int id);
	public int save(dragon d);
	public void delete(int id);
	
}
