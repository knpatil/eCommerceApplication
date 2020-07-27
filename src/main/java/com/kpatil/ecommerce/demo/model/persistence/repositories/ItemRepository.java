package com.kpatil.ecommerce.demo.model.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpatil.ecommerce.demo.model.persistence.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	public List<Item> findByName(String name);

}
