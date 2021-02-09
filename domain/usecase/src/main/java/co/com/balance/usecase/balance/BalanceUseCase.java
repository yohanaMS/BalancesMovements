package co.com.balance.usecase.balance;

import co.com.balance.model.balance.Balance;
import co.com.balance.model.balance.BalanceGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BalanceUseCase {

    private BalanceGateway balanceGateway;

    public Mono<Balance> getBalanceAccount(){
        return balanceGateway.getBalanceAccount();
    }



}
