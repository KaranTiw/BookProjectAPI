package com.book.Id.Exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String meg) {
        super(meg);
    }
}
