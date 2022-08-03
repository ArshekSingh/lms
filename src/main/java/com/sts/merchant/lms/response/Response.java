package com.sts.merchant.lms.response;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * @author Ajay
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {

    private int code;
    private String message;
    private HttpStatus status;
    private T data;
    private Long totalCount;

    public Response(String message, HttpStatus status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public Response(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
        this.code = status.value();
    }

    public Response(String message, T responseObject, HttpStatus status) {
        this.message = message;
        this.status = status;
        this.code = status.value();
        this.data = responseObject;
    }

}
