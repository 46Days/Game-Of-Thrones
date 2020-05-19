package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.IGuerreroService;
import com.sinfloo.demo.interfaces.IGuerrero;
import com.sinfloo.demo.modelo.guerrero;

@Service
public class guerreroService implements IGuerreroService{

	@Autowired
	private IGuerrero data;

	@Override
	public List<guerrero> listar1() {
		return (List<guerrero>)data.findAll();
	}

	@Override
	public Optional<guerrero> listarId1(int id) {
		return data.findById(id);
	}

	@Override
	public int save1(guerrero g) {
		int res=0;
		guerrero dr = data.save(g);
		if(dr.equals(null)) {
			res=1;
		}
		return res;
	}


	@Override
	public void delete1(int id) {
		data.deleteById(id);		
	}

}
