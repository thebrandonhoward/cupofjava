package com.thebrandonhoward.cupofjava.shared;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Payload<T> {
    private String id;
    private T data;
}
