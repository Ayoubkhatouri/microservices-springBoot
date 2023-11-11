package com.example.accountservice.web;


import com.example.accountservice.entities.BankAccount;
import com.example.accountservice.repositories.BankAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private BankAccountRepository bankAccountRepository;

    @GetMapping("/accounts")
    public List<BankAccount> accountList(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public BankAccount getBankAccount(@PathVariable String id){
        return bankAccountRepository.findById(id).get();
    }
}
