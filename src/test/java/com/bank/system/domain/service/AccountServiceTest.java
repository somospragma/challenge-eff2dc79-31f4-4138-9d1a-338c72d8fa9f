package com.bank.system.domain.service;


import com.bank.system.domain.model.AccountStatus;
import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account account;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.save(account)).thenReturn(account);
        accountService.createAccount("1234567890", "customer-1", BigDecimal.ZERO);
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        assertEquals(account, accountService.getAccount(id));
    }

    @Test
    void testGetAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        assertEquals(account, accountService.getAccount(id));
    }

    @Test
    void testDeposit() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.deposit(id, BigDecimal.TEN);
        assertEquals(BigDecimal.TEN, account.getBalance());
    }

    @Test
    void testWithdraw() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.deposit(id, BigDecimal.TEN);
        accountService.withdraw(id, BigDecimal.ONE);
        assertEquals(BigDecimal.valueOf(9), account.getBalance());
    }

    @Test
    void testCloseAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.closeAccount(id);
        assertEquals(Account.AccountStatus.CLOSED, account.getStatus());
    }
}