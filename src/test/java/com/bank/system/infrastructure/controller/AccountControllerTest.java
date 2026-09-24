package com.bank.system.infrastructure.controller;

import com.bank.system.application.AccountCreator;
import com.bank.system.domain.model.Account;
import com.bank.system.infrastructure.dto.AccountRequest;
import com.bank.system.infrastructure.dto.AccountResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountControllerTest {

    @Mock
    private AccountCreator accountCreator;

    @InjectMocks
    private AccountController accountController;

    private Account account;
    private AccountRequest accountRequest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
        accountRequest = new AccountRequest("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        when(accountCreator.createAccount("1234567890", "customer-1", BigDecimal.ZERO)).thenReturn(account);
        ResponseEntity<AccountResponse> response = accountController.createAccount(accountRequest);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(new AccountResponse(account), response.getBody());
    }
}