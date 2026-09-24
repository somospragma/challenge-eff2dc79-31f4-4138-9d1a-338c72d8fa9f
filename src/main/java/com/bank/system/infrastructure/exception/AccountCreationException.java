package com.bank.system.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AccountCreationException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String accountNumber;
    private final String customerId;
    private final BigDecimal initialBalance;

    public AccountCreationException(String accountNumber, String customerId, BigDecimal initialBalance) {
        super("Failed to create account with number: " + accountNumber + ", customer ID: " + customerId + ", and initial balance: " + initialBalance);
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.initialBalance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }
}