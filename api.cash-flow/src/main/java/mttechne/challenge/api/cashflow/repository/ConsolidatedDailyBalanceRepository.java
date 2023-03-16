package mttechne.challenge.api.cashflow.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import mttechne.challenge.api.cashflow.vo.DailyBalanceVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsolidatedDailyBalanceRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public List<DailyBalanceVo> findAllConsolidatedDailyBalance()
    {
        Query query = entityManager.createNativeQuery(
                "SELECT op.account as account, SUM(op.amount) as totalAmount, op.typed as typed "+
                        "FROM operations op "+
                        "GROUP BY op.account, op.typed, YEAR(op.operationdate), month(op.operationdate), day(op.operationdate) " +
                        "ORDER BY op.typed asc ");

        List<DailyBalanceVo> dailyBalances = query.getResultList();
        return dailyBalances;
    }
}
