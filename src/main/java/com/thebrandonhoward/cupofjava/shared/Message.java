package com.thebrandonhoward.cupofjava.shared;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.net.URL;

@Builder
@Getter
@ToString
public class Message<T> {
    private String id;
    private URL destination;
    private Payload<T> payload;
}
