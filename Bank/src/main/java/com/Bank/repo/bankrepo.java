package com.Bank.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Bank.entity.mybank;

public interface bankrepo extends MongoRepository<mybank, String> {

}
