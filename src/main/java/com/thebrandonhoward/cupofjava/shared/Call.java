package com.thebrandonhoward.cupofjava.shared;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Call<T,R> {
    private String id;
    private Message<T> message;
    private Reply<T> reply;
}
