package com.rterciotte.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rterciotte.dscatalog.entitites.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

}
