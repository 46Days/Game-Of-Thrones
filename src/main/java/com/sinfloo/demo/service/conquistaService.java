package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaceService.IConquistaService;
import com.sinfloo.demo.interfaces.IConquista;
import com.sinfloo.demo.modelo.conquista;


@Service
public class conquistaService implements IConquistaService{

	@Autowired
	private IConquista data;
	
	@Override
	public List<conquista> listar() {
		// TODO Auto-generated method stub
		return (List<conquista>)data.findAll();
	}

	@Override
	public Optional<conquista> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(conquista c) {
		int res=0;
		conquista dr = data.save(c);
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
