package com.getOnefeildData.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.getOnefeildData.entity.student;

public interface studentrepo extends MongoRepository<student, String>{

}
