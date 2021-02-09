package co.com.balance.api;

import co.com.balance.model.balance.Balance;
import co.com.balance.usecase.balance.BalanceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private BalanceUseCase balanceUseCase;

    public Mono<ServerResponse> getBalanceAccount(ServerRequest serverRequest) {

        Mono<Balance>  result =  balanceUseCase.getBalanceAccount();
        return ServerResponse.ok().body(result, Balance.class);
    }

}
