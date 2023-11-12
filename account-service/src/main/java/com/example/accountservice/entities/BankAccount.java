package com.example.accountservice.entities;

import com.example.accountservice.enums.AccountType;
import com.example.accountservice.models.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString @Builder
@Entity
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
<<<<<<< HEAD
    @Transient //this annotation tells spring to ignore this attribute cause Customer is not an entity in this service
=======
    @Transient //this annotation tells spring to ignore this attribute cause 
    Customer is not an entity in this service
>>>>>>> 47894891bd0cbe98d1890f65f21b265a33478e10
    private Customer customer;
    private Long CustomerId;
}
