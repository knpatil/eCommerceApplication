package com.kpatil.ecommerce.demo.model.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpatil.ecommerce.demo.model.persistence.Cart;
import com.kpatil.ecommerce.demo.model.persistence.User;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUser(User user);
}
