package com.spring.knowYourNeighborhood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.knowYourNeighborhood.Entity.Store;
import com.spring.knowYourNeighborhood.Entity.User;
import com.spring.knowYourNeighborhood.dao.RepoUser;
import com.spring.knowYourNeighborhood.dao.ShopRepo;

@Service("MyService")
public class ImpService implements MyService{
    @Autowired()
    ShopRepo shopRepo;
    RepoUser repoUser;
	@Override
	public void savestore(Store store) {
		shopRepo.save(store);
		
	}
	@Override
	public List<Store> getAllData() {
        return shopRepo.findAll();
    }
	@Override
	public void deletedata(Long shpid) {
		shopRepo.deleteById(shpid);;
		
	}
	@Override
	public Store findById(Long shpid) {
		return shopRepo.findById(shpid).orElse(null);
	}
	

	

	
}
