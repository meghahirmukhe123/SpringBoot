package com.user_DB.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user_DB.entity.Myuser;

public interface Myuserrepo extends MongoRepository<Myuser, String> {
	
	Myuser findByusername(String username);

}
