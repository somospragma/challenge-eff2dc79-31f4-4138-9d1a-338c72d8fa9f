package com.bank.system.infrastructure.exception;


import com.bank.system.domain.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final UUID accountId;
    private final String accountNumber;

    public AccountNotFoundException(UUID accountId, String accountNumber) {
        super("Account not found for ID: " + accountId + " and account number: " + accountNumber);
        this.accountId = accountId;
        this.accountNumber = accountNumber;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}