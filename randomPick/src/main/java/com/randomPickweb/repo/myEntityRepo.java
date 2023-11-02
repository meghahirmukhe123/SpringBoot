package com.randomPickweb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.randomPickweb.model.myEntity;

public interface myEntityRepo extends MongoRepository<myEntity, String> {

}
