//package com.randomPickweb.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.randomPickweb.model.myEntity;
//import com.randomPickweb.repo.myEntityRepo;
//
//
//@RestController
//public class myEntityController {
//	@Autowired
//	private myEntityRepo repo;
//	
//	@PostMapping("/save")
//	public myEntity saveData(@RequestBody myEntity entity)
//	{
//		return repo.save(entity);
//	}
//	
//	@GetMapping("/get")
//	public List<myEntity> getall()
//	{
//		return repo.findAll();
//	}
//	
//    @GetMapping("/getRandom")
//    public List<myEntity> getRandomData() {
//        // Get the total number of documents in the collection
//        long totalDocuments = mongoTemplate.count(new Query(), myEntity.class);
//
//        // Generate random indices to select 5 random documents
//        Random random = new Random();
//        int numRandomDocuments = 5;
//        int[] randomIndices = random.ints(0, (int) totalDocuments)
//                .distinct()
//                .limit(numRandomDocuments)
//                .toArray();
//
//        // Create a query to fetch the random documents by their indices
//        Query query = new Query();
//        query.addCriteria(Criteria.where("_id").in(randomIndices));
//
//        // Retrieve and return the random documents
//        return mongoTemplate.find(query, myEntity.class);
//    }
//
//}




package com.randomPickweb.controller;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.randomPickweb.model.myEntity;

@RestController
public class myEntityController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("/save")
    public myEntity saveData(@RequestBody myEntity entity) {
        return mongoTemplate.save(entity);
    }

    @GetMapping("/get")
    public List<myEntity> getAll() {
        return mongoTemplate.findAll(myEntity.class);
    }

    @GetMapping("/getRandom")
    public List<myEntity> getRandomData() {
        // Get the total number of documents in the collection
        long totalDocuments = mongoTemplate.count(new Query(), myEntity.class);

        // Generate random indices to select 5 random documents
        Random random = new Random();
        int numRandomDocuments = 5;
        int[] randomIndices = random.ints(0, (int) totalDocuments)
                .distinct()
                .limit(numRandomDocuments)
                .toArray();

        // Convert the random indices to corresponding _id values as strings
        List<String> objectIdStrings = Arrays.stream(randomIndices)
                .mapToObj(index -> {
                    Query query = new Query().skip(index).limit(1);
                    myEntity randomEntity = mongoTemplate.findOne(query, myEntity.class);
                    return randomEntity.getEntityId();
                })
                .collect(Collectors.toList());

        // Create a query to fetch the random documents by their _id field
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").in(objectIdStrings));

        // Retrieve and return the random documents
        return mongoTemplate.find(query, myEntity.class);
    }
}
