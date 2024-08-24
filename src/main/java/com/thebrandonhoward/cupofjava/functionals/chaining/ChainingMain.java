package com.thebrandonhoward.cupofjava.functionals.chaining;

import com.thebrandonhoward.cupofjava.shared.Call;
import com.thebrandonhoward.cupofjava.shared.Message;
import com.thebrandonhoward.cupofjava.shared.Payload;
import com.thebrandonhoward.cupofjava.shared.Reply;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class ChainingMain {
    private final String HOST_A = "http://localhost:8080/calla";
    private final String HOST_B = "http://localhost:8080/callb";
    private final String HOST_C = "http://localhost:8080/callc";

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
                        return getCallB((Call) call);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                },
                (call) -> {
                    try {
                        return getCallC((Call) call);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                });

        router.send(getCallA());

        router.setReversedCallChain(
                (call) -> {
                    try {
                        return getCallB((Call) call);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                },
                (call) -> {
                    try {
                        return getCallC((Call) call);
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
                    .destination(new URL(HOST_A))
                    .payload(payload)
                    .build();

        Call call = Call.builder()
                .id(message.getId())
                .message(message)
                .build();

        System.out.printf(" Making a call using: %s%n", call.toString());

        Reply reply = Reply.builder()
                .data(HOST_A + " response")
                .build();

        return Call.builder()
                .id(call.getId())
                .message(call.getMessage())
                .reply(reply)
                .build();
    }

    private Call getCallB(Call incomingCall) throws MalformedURLException {
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
                .destination(new URL(HOST_B))
                .payload(payload)
                .build();

        Call call = Call.builder()
                .id(message.getId())
                .message(message)
                .build();

        System.out.printf(" Making a call using: %s%n", incomingCall.toString());

        Reply reply = Reply.builder()
                .data(HOST_B + " response")
                .build();

        return Call.builder()
                .id(call.getId())
                .message(call.getMessage())
                .reply(reply)
                .build();
    }

    private Call getCallC(Call incomingCall) throws MalformedURLException {
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
                    .destination(new URL(HOST_C))
                    .payload(payload)
                    .build();

        Call call = Call.builder()
                .id(message.getId())
                .message(message)
                .build();

        System.out.printf(" Making a call using: %s%n", incomingCall.toString());

        Reply reply = Reply.builder()
                .data(HOST_C + " response")
                .build();

        return Call.builder()
                .id(call.getId())
                .message(call.getMessage())
                .reply(reply)
                .build();
        }
}
