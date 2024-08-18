package com.group13.shopping.controller;

import com.group13.shopping.repository.AccountRepository;
import com.group13.shopping.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts")
    List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    Account getAccountById(@PathVariable Long id) {
        return accountRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @PostMapping("/account")
    Account createAccount(@RequestBody Account newAccount) {
        return accountRepository.save(newAccount);
    }

}
