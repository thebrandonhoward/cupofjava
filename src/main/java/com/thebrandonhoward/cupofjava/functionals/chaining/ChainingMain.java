package com.thebrandonhoward.cupofjava.functionals.chaining;

import com.thebrandonhoward.cupofjava.shared.Call;
import com.thebrandonhoward.cupofjava.shared.Message;
import com.thebrandonhoward.cupofjava.shared.Payload;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class ChainingMain {
    public static void main(String[] args) throws MalformedURLException {
        ChainingMain chainingMain = new ChainingMain();
        chainingMain.invoke();
    }

    public void invoke() throws MalformedURLException {
        Router router = new Router();

        router.send(getCallA());

        router.setCallChain(
                (call) -> {
                    try {
                        return getCallB();
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                },
                (call) -> {
                    try {
                        return getCallC();
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                });

        router.send(getCallA());
    }

    private Call getCallA() throws MalformedURLException {
        System.out.println("CALL_A");

        final String id = UUID.randomUUID().toString();

        Payload payload = Payload.builder()
                .id(id)
                .data("""
                        {"data":"CALL_A"}
                        """)
                .build();

        Message message = Message.builder()
                    .id(payload.getId())
                    .destination(new URL("http://localhost:8080/calla"))
                    .payload(payload)
                    .build();

        return Call.builder()
                .id(message.getId())
                .message(message)
                .build();
    }

    private Call getCallB() throws MalformedURLException {
        System.out.println("CALL_B");

        final String id = UUID.randomUUID().toString();

        Payload payload = Payload.builder()
                .id(id)
                .data("""
                        {"data":"CALL_B"}
                        """)
                .build();

        Message message = Message.builder()
                .id(payload.getId())
                .destination(new URL("http://localhost:8080/callb"))
                .payload(payload)
                .build();

        return Call.builder()
                .id(message.getId())
                .message(message)
                .build();
    }

    private Call getCallC() throws MalformedURLException {
        System.out.println("CALL_C");

        final String id = UUID.randomUUID().toString();

            Payload payload = Payload.builder()
                    .id(id)
                    .data("""
                        {"data":"CALL_C"}
                        """)
                    .build();

            Message message = Message.builder()
                    .id(payload.getId())
                    .destination(new URL("http://localhost:8080/callc"))
                    .payload(payload)
                    .build();

            return Call.builder()
                    .id(message.getId())
                    .message(message)
                    .build();
        }
}
