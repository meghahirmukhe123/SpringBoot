package com.exceptionHandling2Way.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exceptionHandling2Way.entity.book;


public interface bookrepo extends MongoRepository<book, String> {

	List<book> findByname(String bookname);

	

}
