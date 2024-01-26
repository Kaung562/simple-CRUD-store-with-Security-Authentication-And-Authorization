package com.spring.knowYourNeighborhood.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{

	 private PasswordEncoder passwordencoder;
		@Autowired
	UserDetailsService UserDetails;
		@Autowired
	UserDetailsService userservice;
	@Autowired
	ApplicationSecurityConfig (PasswordEncoder encoder){
		this.passwordencoder=encoder;
	}
	@Autowired
	RoleHandlers roles;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/","/addStore", "/saveUser", "/saveData", "/register").permitAll()
		.antMatchers("/edit/{shpid}", "/showall").hasAuthority("ADMIN")
		.antMatchers("/images/**").permitAll()
		.antMatchers("/styles/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.successHandler(roles)
		.and()
		.logout()
		.logoutUrl("/logout")
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.clearAuthentication(true)
		.invalidateHttpSession(true);
		
	}
	
	@Autowired
	AuthenticationProvider authProvider() {
		DaoAuthenticationProvider  dao=new DaoAuthenticationProvider();
		dao.setPasswordEncoder(passwordencoder);
		dao.setUserDetailsService(userservice);
		return dao;
	}
	

	
}
