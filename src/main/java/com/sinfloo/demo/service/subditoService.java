package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.ISubditoService;
import com.sinfloo.demo.interfaces.ISubdito;
import com.sinfloo.demo.modelo.subdito;

@Service
public class subditoService implements ISubditoService{

	@Autowired
	private ISubdito data;
	
	@Override
	public List<subdito> listarSubdito() {
		return (List<subdito>)data.findAll();
	}

	@Override
	public Optional<subdito> listarIdSubdito(int id) {
		return data.findById(id);
	}

	@Override
	public int saveSubdito(subdito s) {
		int res=0;
		subdito sub = data.save(s);
		if(sub.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteSubdito(int id) {
		data.deleteById(id);		
	}

	
	
}
