package com.bank.system.infrastructure.controller;

import com.bank.system.application.AccountCreator;
import com.bank.system.domain.model.Account;
import com.bank.system.infrastructure.dto.AccountRequest;
import com.bank.system.infrastructure.dto.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountCreator accountCreator;

    @Autowired
    public AccountController(AccountCreator accountCreator) {
        this.accountCreator = accountCreator;
    }

    @PostMapping
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest accountRequest) {
        Account account = accountCreator.createAccount(accountRequest.getAccountNumber(), accountRequest.getCustomerId(), accountRequest.getInitialBalance());
        return new ResponseEntity<>(new AccountResponse(account.getId(), account.getAccountNumber(), account.getCustomerId(), account.getBalance()), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountResponse> getAccountById(@PathVariable UUID id) {
        return new ResponseEntity<>(new AccountResponse(), HttpStatus.OK);
    }
}