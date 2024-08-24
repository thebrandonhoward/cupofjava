package com.thebrandonhoward.cupofjava.functionals.chaining;

import com.thebrandonhoward.cupofjava.shared.Call;
import lombok.AllArgsConstructor;

import java.util.function.Function;
import java.util.stream.Stream;

@AllArgsConstructor
public class Router<T> {
    private Function<Call, Call> callChain;

    Router() {
        setCallChain();
    }

    public Call send(final Call message) {
        final Call processedMessage = callChain.apply(message);

        System.out.println();

        return processedMessage;
    }

    public void setCallChain(Function<Call,Call> ...calls) {
        callChain = Stream.of(calls)
                .reduce((call,nextCall) -> call.andThen(nextCall))
                .orElse(call -> call);
    }
}
