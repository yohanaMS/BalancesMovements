package co.com.balance.usecase.balance;

import co.com.balance.model.balance.Balance;
import co.com.balance.model.balance.BalanceGateway;
import co.com.balance.model.movements.Movements;
import co.com.balance.model.movements.MovementsGateway;
import reactor.core.publisher.Mono;


public class BalanceUseCase {

    private BalanceGateway balanceGateway;
    private MovementsGateway movementsGateway;

    public BalanceUseCase(BalanceGateway balanceGateway,MovementsGateway movementsGateway) {
        this.balanceGateway = balanceGateway;
        this.movementsGateway = movementsGateway;
    }

    public Mono<Balance> getBalanceAccount(){
        return balanceGateway.getBalance();
    }

    public Mono<Movements> geMovements(){
        return movementsGateway.getMovements();
    }





}
