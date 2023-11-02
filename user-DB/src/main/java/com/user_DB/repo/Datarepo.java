package com.user_DB.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user_DB.entity.Data;

public interface Datarepo extends MongoRepository<Data, String>{

}


