package mttechne.challenge.api.cashflow.record;

import mttechne.challenge.api.cashflow.domain.Operation;
import mttechne.challenge.api.cashflow.domain.Typed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OperationDetailData(
        Long account,
        BigDecimal amount,
        Typed typed,
        LocalDateTime operationdateOperation
)
{
    public OperationDetailData (Operation operation)
    {
        this(operation.getAccount(), operation.getAmount(), operation.getTyped(), operation.getOperationdate());
    }
}
