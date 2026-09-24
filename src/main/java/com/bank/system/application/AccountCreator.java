package com.bank.system.application;


import com.bank.system.infrastructure.exception.AccountCreationException;
import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import com.bank.system.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class AccountCreator {
    private final AccountService accountService;
    private final AccountRepository accountRepository;

    @Autowired
    public AccountCreator(AccountService accountService, AccountRepository accountRepository) {
        this.accountService = accountService;
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String accountNumber, String customerId, BigDecimal initialBalance) {
        if (accountRepository.findByAccountNumber(accountNumber).isPresent()) {
            throw new AccountCreationException("Account with number " + accountNumber + " already exists");
        }
        return accountService.createAccount(accountNumber, customerId, initialBalance);
    }
}