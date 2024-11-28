package com.rterciotte.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rterciotte.dscatalog.entitites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
