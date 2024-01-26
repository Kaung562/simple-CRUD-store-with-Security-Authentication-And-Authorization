package com.spring.knowYourNeighborhood.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.knowYourNeighborhood.Entity.User;
import com.spring.knowYourNeighborhood.dao.RepoUser;
import com.spring.knowYourNeighborhood.security.ApplicationUserDetail;

@Service
public class CustomService implements UserDetailsService{
    @Autowired
	RepoUser repoUser;
    User user;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		user=repoUser.findByuserName(username);
		if (user==null) {
			System.out.println("Invalid user name");
		}
		return new ApplicationUserDetail(user);
	}

}
