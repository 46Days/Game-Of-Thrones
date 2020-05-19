package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.sinfloo.demo.modelo.subdito;

public interface ISubditoService {

	public List<subdito>listarSubdito();
	public Optional<subdito>listarIdSubdito(int id);
	public int saveSubdito(subdito s);
	public void deleteSubdito(int id);
	
}
