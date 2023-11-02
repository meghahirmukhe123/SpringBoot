package com.DB_security.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.DB_security.entity.demo;

public interface demorepo extends MongoRepository<demo, String>{

}
