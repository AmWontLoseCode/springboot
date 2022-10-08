package com.thaleshealthtech.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoPersonFoundToCreatePersonsException extends HealthCheckResponseError {

    private HttpStatus status = getStatus();

    public NoPersonFoundToCreatePersonsException() {
        super("No Person Found to add person");
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    public NoPersonFoundToCreatePersonsException(String message) {
        super(message);
    }

    public NoPersonFoundToCreatePersonsException(String message, Throwable cause) {
        super(message, cause);
    }
}
