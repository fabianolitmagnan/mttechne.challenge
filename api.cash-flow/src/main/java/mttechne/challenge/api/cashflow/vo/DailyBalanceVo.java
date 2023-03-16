package mttechne.challenge.api.cashflow.vo;

import lombok.Getter;
import mttechne.challenge.api.cashflow.domain.Typed;

import java.math.BigDecimal;

@Getter
public class DailyBalanceVo
{
    private Long account;
    private BigDecimal totalAmount;
    private Typed typed;
}
