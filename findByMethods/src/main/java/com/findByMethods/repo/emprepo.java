package com.findByMethods.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.findByMethods.entity.emp;

public interface emprepo extends MongoRepository<emp, String> {

	List<emp> findBysalory(int salory);

	List<emp> findBydept(String dept);

}
