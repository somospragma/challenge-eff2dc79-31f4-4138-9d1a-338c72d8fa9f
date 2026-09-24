package com.bank.system.domain.service;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public Account createAccount(String accountNumber, String customerId, BigDecimal initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be empty");
        }
        if (initialBalance == null || initialBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Initial balance must be positive");
        }

        return accountRepository.save(new Account(accountNumber, customerId, initialBalance));
    }

    public Account getAccount(UUID id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    }

    public Account getAccountByNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    }

    public Account deposit(UUID id, BigDecimal amount) {
        Account account = getAccount(id);
        account.deposit(amount);
        return accountRepository.save(account);
    }

    public Account withdraw(UUID id, BigDecimal amount) {
        Account account = getAccount(id);
        account.withdraw(amount);
        return accountRepository.save(account);
    }

    public void closeAccount(UUID id) {
        Account account = getAccount(id);
        account.close();
        accountRepository.save(account);
    }
}