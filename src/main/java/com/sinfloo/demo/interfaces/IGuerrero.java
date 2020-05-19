package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.guerrero;

@Repository
public interface IGuerrero extends CrudRepository<guerrero, Integer> {

}
