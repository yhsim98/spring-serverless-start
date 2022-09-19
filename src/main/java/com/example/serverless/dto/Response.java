package com.example.serverless.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
public class Response<T> {
    private HttpStatus httpStatus;
    private T Data;

    public Response(HttpStatus httpStatus, T data) {
        this.httpStatus = httpStatus;
        Data = data;
    }
}
