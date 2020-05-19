package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.IDragonService;
import com.sinfloo.demo.interfaces.IDragon;
import com.sinfloo.demo.modelo.dragon;

@Service
public class dragonService implements IDragonService{

	@Autowired
	private IDragon data;
	@Override
	public List<dragon> listar() {
		return (List<dragon>)data.findAll();
	}

	@Override
	public Optional<dragon> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(dragon d) {
		int res=0;
		dragon dr = data.save(d);
		if(dr.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
