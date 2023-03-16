package mttechne.challenge.api.cashflow.repository;

import mttechne.challenge.api.cashflow.domain.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository <Operation, Long>
{ }
