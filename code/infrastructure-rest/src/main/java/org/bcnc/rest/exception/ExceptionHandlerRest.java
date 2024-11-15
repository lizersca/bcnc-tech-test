package org.bcnc.rest.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice(basePackages = "org.bcnc.rest")
public class ExceptionHandlerRest {

    private final String MISSING_PARAMETER_MSG = "The request is missing one or more parameters";

    @ExceptionHandler(MissingParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleBadRequest() {
        return new ResponseEntity<>(
                MISSING_PARAMETER_MSG, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
