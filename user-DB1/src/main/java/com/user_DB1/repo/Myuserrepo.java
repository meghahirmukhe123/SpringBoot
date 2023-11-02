package com.user_DB1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user_DB1.entity.Myuser;

public interface Myuserrepo extends MongoRepository<Myuser, String> {

	Myuser findByUsername(String username);

}
