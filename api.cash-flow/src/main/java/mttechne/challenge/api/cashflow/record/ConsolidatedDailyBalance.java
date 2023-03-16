package mttechne.challenge.api.cashflow.record;

import mttechne.challenge.api.cashflow.domain.Typed;

import java.math.BigDecimal;

public record ConsolidatedDailyBalance(
        Long account,
        BigDecimal totalAmount,
        Typed typed
        )
{}
