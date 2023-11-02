package com.bankProject.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bankProject.entity.bank;

public interface bankrepo extends MongoRepository<bank, String> {

}
