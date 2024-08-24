package com.thebrandonhoward.cupofjava.shared;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Payload<T> {
    private String id;
    private T data;
}
