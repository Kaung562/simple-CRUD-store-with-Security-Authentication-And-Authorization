package com.spring.knowYourNeighborhood.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.knowYourNeighborhood.Entity.User;


public interface RepoUser extends JpaRepository<User,Long>{
	User findByuserName(String name);
}
