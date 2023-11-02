package com.randomPickweb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Document(collection = "randomPick")
public class myEntity {
	@Id
	private String entityId;
	private String name;
	private int age;

}
