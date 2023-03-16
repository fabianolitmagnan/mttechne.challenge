package mttechne.challenge.api.cashflow.controller;

import jakarta.validation.Valid;
import mttechne.challenge.api.cashflow.domain.*;
import mttechne.challenge.api.cashflow.record.AllocatedCashFlowRegistrationData;
import mttechne.challenge.api.cashflow.record.OperationDetailData;
import mttechne.challenge.api.cashflow.repository.ConsolidatedDailyBalanceRepository;
import mttechne.challenge.api.cashflow.repository.OperationRepository;
import mttechne.challenge.api.cashflow.vo.DailyBalanceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("allocated")
public class AllocatedCashFlowController
{
    @Autowired
    private OperationRepository repository;

    @Autowired
    private ConsolidatedDailyBalanceRepository consolidatedDailyBalanceRepository;

    @PostMapping
    @Transactional
    public ResponseEntity allocatedCashFlow(@RequestBody @Valid AllocatedCashFlowRegistrationData data, UriComponentsBuilder uriBuilder)
    {
        var operation = new Operation(data);
        repository.save(operation);
        var uri= uriBuilder.path("/allocated/{id}").buildAndExpand(operation.getId()).toUri();
        return ResponseEntity.created(uri).body(new OperationDetailData(operation));
    }

    @GetMapping
    public ResponseEntity<List<DailyBalanceVo>> issueBalance()
    {
        List<DailyBalanceVo> list = consolidatedDailyBalanceRepository.findAllConsolidatedDailyBalance().stream().toList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id)
    {
        var operation = repository.getReferenceById(id) ;
        return ResponseEntity.ok(new OperationDetailData(operation));
    }

}
