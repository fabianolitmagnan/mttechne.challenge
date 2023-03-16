package mttechne.challenge.api.cashflow.record;

import jakarta.validation.constraints.NotNull;
import mttechne.challenge.api.cashflow.domain.Typed;

import java.math.BigDecimal;

public record AllocatedCashFlowRegistrationData(
        @NotNull
        Long account,
        @NotNull
        BigDecimal amount,
        @NotNull
        Typed typed
        )
{ }
