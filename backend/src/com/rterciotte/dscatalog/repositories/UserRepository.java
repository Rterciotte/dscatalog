package com.rterciotte.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rterciotte.dscatalog.entitites.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}