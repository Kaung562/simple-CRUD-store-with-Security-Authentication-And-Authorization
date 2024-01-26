package com.spring.knowYourNeighborhood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.knowYourNeighborhood.Entity.User;
import com.spring.knowYourNeighborhood.dao.RepoUser;

@Service("MyUserService")
public class MyUserServicImp implements MyUserService {
  
	private PasswordEncoder passwordencoder;
	@Autowired
	RepoUser repoUser;
	
	@Autowired
	public MyUserServicImp(PasswordEncoder encoder) {
		this.passwordencoder=encoder;
	}
	@Override
	public String addUser(User us) {
		// TODO Auto-generated method stub
		us.setRole("USER");
		us.setPassword(passwordencoder.encode(us.getPassword()));
		System.out.println(us);
		 repoUser.save(us);
		 return "DATA ADDED";
	}


}
