package com.springbootaccadamy.batch8.pos1.repo;

import com.springbootaccadamy.batch8.pos1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface CustomerRPO extends JpaRepository<Customer,Integer> {

    List<Customer> findAllByAciveStateEquals(boolean state);
}
