package mttechne.challenge.api.cashflow.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mttechne.challenge.api.cashflow.record.AllocatedCashFlowRegistrationData;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name="operations")
@Entity(name="Operation")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Operation
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long account;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private Typed typed;
    private LocalDateTime operationdate;
    public Operation(AllocatedCashFlowRegistrationData data) {
        this.account = data.account();
        this.amount = data.amount();
        this.typed = data.typed();
        this.operationdate = LocalDateTime.now();
    }
}
