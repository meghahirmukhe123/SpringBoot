package com.DB_Security3.repo;


import com.DB_Security3.entity.user;

public interface userrepo extends <user, String>{
	
	user findbyusername(String username);

}
