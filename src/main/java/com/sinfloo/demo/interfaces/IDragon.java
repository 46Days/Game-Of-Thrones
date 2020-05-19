package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.dragon;

@Repository
public interface IDragon extends CrudRepository<dragon, Integer>{

}
