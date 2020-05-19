package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.sinfloo.demo.modelo.guerrero;

public interface IGuerreroService {

	public List<guerrero>listar1();
	public Optional<guerrero>listarId1(int id);
	public int save1(guerrero g);
	public void delete1(int id);
	
}
