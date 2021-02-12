package co.com.balance.model.movements;


import co.com.balance.model.account.Account;
import reactor.core.publisher.Mono;

public interface MovementsGateway {

    Mono<Movements> getMovements();

}
