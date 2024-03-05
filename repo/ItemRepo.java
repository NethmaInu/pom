package com.springbootaccadamy.batch8.pos1.repo;

import com.springbootaccadamy.batch8.pos1.DTO.responce.ItemResponceDTO;
import com.springbootaccadamy.batch8.pos1.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ItemRepo extends JpaRepository<Item,Integer> {



    List<Item> findAllByItemNameEqualsAndAciveStateEquals(String itemName, boolean b);


    List<Item> findAllByAciveStateEquals(boolean status);

    Page<Item> findAllByAciveStateEquals(boolean status, Pageable pageable);

    int countAllByAciveStateEquals(boolean status);
}
