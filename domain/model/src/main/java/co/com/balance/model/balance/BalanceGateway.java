package co.com.balance.model.balance;

import reactor.core.publisher.Mono;

public interface BalanceGateway {

    Mono<Balance> getBalance();
}
