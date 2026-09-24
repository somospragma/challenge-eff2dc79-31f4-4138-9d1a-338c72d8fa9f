package com.bank.system.infrastructure.dto;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.model.AccountStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record AccountResponse(
    UUID id,
    String accountNumber,
    String customerId,
    BigDecimal balance,
    @Enumerated(EnumType.STRING) AccountStatus status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
    public AccountResponse(Account account) {
        this(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerId(),
            account.getBalance(),
            account.getStatus(),
            account.getCreatedAt(),
            account.getUpdatedAt()
        );
    }
}