package com.example.OrderSystem.repository;


import com.example.OrderSystem.entities.Customer;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail (String email);
    boolean existByEmail (String email);
}
