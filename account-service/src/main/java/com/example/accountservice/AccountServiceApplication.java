package com.example.accountservice;

import com.example.accountservice.entities.BankAccount;
import com.example.accountservice.enums.AccountType;
import com.example.accountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository){
		return args -> {
			bankAccountRepository.save(BankAccount.builder()
							.accountId(UUID.randomUUID().toString())
							.currency("MAD")
							.balance(98000)
							.createdAt(LocalDate.now())
							.type(AccountType.CURRENT_ACCOUNT)
							.CustomerId(1L)
					.build());

			bankAccountRepository.save(BankAccount.builder()
					.accountId(UUID.randomUUID().toString())
					.currency("MAD")
					.balance(12000)
					.createdAt(LocalDate.now())
					.type(AccountType.SAVING_ACDOUNT)
					.CustomerId(2L)
					.build());
		};
	}
}
