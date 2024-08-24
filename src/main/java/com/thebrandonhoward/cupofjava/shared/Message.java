package com.thebrandonhoward.cupofjava.shared;

import lombok.Builder;
import lombok.Getter;

import java.net.URL;

@Builder
@Getter
public class Message<T> {
    private String id;
    private URL destination;
    private Payload<T> payload;
}
