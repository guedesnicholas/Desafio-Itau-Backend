package com.nicholas.desafio_itau_backend.services.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e, HttpServletRequest request){

        HttpStatus status = HttpStatus.UNPROCESSABLE_CONTENT;
        ValidationError err = new ValidationError(System.currentTimeMillis(), status.value(), "Erro de validação", request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<StandardError> badRequest(
            HttpMessageNotReadableException e,
            HttpServletRequest request) {

        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "O corpo da requisição está inválido", request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
