package com.dsi.chaldal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsi.chaldal.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
}
