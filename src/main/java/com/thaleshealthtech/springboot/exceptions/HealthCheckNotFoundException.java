package com.thaleshealthtech.springboot.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

public class HealthCheckFailedException extends HealthCheckResponseError {

    private HttpStatus status = getStatus() ;

    public HealthCheckFailedException(HttpStatus status) {
        super("health check has failed. Endpoint is not up");
        this.status = status;
    }

    public HealthCheckFailedException(String message) {
        super(message);
    }

    public HealthCheckFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
