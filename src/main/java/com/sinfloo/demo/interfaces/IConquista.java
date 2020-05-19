package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.conquista;

@Repository
public interface IConquista extends CrudRepository<conquista, Integer>{

}
