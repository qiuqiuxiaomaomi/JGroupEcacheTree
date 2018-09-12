package com.bonaparte.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by yangmingquan on 2018/9/12.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND,reason="User not found")
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
