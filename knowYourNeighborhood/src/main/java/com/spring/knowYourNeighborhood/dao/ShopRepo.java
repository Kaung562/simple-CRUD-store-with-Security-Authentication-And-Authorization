package com.spring.knowYourNeighborhood.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.knowYourNeighborhood.Entity.Store;

@Repository
public interface ShopRepo extends JpaRepository <Store, Long>{

}
