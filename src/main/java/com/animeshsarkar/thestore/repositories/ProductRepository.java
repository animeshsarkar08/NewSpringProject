package com.animeshsarkar.thestore.repositories;

import com.animeshsarkar.thestore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//This a repository which allow us to read and write into the database
//JpaRepository takes two types the <Model,PrimaryKey>, here the Class of 
//model is Product and Class of PrimaryKey(id) is Integer
public interface ProductRepository extends JpaRepository<Product,Integer>{

}