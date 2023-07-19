package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Bank;
public interface CustomersRepo extends JpaRepository<Bank,Integer>{

}