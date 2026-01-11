package com.example.OrderSystem.service;


import com.example.OrderSystem.entities.Customer;
import com.example.OrderSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;



    public List<Customer> obtenerTodosLosClientes (){
        return customerRepository.findAll();
    }

    public Customer obtenerClientePorEmail (String email) {
        return customerRepository.findByEmail(email).orElseThrow( () -> new RuntimeException("No se encontro ningun cliente con este email: " + email));
    }

    public Customer guardarCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public boolean existeClientePorEmail (String email) {
        return  customerRepository.existByEmail(email);
    }



}
