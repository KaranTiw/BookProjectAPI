package com.book.Id.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.Data; // For Lombok @Data annotation


@Getter
@Setter
public class ErrorSolve {

    private String message;

    private Data date;

    private String request;

    public ErrorSolve(String message, String request) {

        this.message=message;
        this.date=date;
        this.request=request;

    }


}
