package com.bank.system.application;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountCreatorTest {

    @Mock
    private AccountService accountService;

    @InjectMocks
    private AccountCreator accountCreator;

    private Account account;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        UUID id = UUID.randomUUID();
        when(accountService.createAccount("1234567890", "customer-1", BigDecimal.ZERO)).thenReturn(account);
        assertEquals(account, accountCreator.createAccount("1234567890", "customer-1", BigDecimal.ZERO));
    }
}