package com.book.Id.Exception;

import com.book.Id.payload.ErrorSolve;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class HendlerException {



    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorSolve> globaleException(
            Exception e,
            WebRequest request
    ){


        ErrorSolve errorDetails = new ErrorSolve(
                e.getMessage(),
                request.getDescription(false)

        );


        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);



    }

    }



