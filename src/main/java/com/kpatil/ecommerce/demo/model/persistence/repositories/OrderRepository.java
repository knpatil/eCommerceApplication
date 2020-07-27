package com.kpatil.ecommerce.demo.model.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpatil.ecommerce.demo.model.persistence.User;
import com.kpatil.ecommerce.demo.model.persistence.UserOrder;

public interface OrderRepository extends JpaRepository<UserOrder, Long> {
	List<UserOrder> findByUser(User user);
}
