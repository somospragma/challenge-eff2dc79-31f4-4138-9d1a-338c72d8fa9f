package com.bank.system.infrastructure.dto;

import com.bank.system.domain.model.AccountStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record AccountRequest(
    @NotNull String accountNumber,
    @NotNull String customerId,
    @Positive BigDecimal initialBalance,
    AccountStatus status
) {
}