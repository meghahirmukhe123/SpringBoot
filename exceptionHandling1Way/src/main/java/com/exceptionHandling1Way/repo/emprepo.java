package com.exceptionHandling1Way.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exceptionHandling1Way.entity.emp;

public interface emprepo extends MongoRepository<emp, String> {

	

}
