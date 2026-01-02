package com.example.OrderSystem.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name", length = 80, nullable = false)
    private String fullName;

    @Column (name = "email", unique = true, length = 50, nullable = false)
    private String email;

    @Column (name = "password", nullable = false)
    private String password;

    @Column (name = "address")
    private String address;

    @Column (name = "enaStatus", nullable = false)
    private String enabledStatus;

    public Customer() {
    }

    public Customer(long id, String fullName, String email, String password, String address, String enabledStatus) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.enabledStatus = enabledStatus;
    }



}
