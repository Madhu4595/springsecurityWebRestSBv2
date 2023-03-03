package com.app.tutus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tutus.entity.AppUser;
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long>{
	
	AppUser findByEmail(String email);

}
