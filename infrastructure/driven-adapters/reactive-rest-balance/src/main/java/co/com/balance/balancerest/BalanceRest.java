package co.com.balance.balancerest;


import co.com.balance.model.balance.*;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Component;

@Component
public class BalanceRest implements BalanceGateway {

    @Override
    public Mono<Balance> getBalanceAccount() {
        Mono<Balance> balance = Mono.just(Balance.builder()
                .build());
        return balance;
    }
}
