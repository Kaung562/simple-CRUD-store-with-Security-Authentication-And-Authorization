package com.spring.knowYourNeighborhood.service;

import java.util.List;
import java.util.Optional;

import com.spring.knowYourNeighborhood.Entity.Store;
import com.spring.knowYourNeighborhood.Entity.User;

public interface MyService {
public void savestore(Store store);
public List<Store> getAllData();
public void deletedata(Long shpid);
public Store findById(Long shpid);
}
