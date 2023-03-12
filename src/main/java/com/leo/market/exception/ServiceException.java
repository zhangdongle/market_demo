package com.leo.market.exception;

public class ServiceException extends RuntimeException {

    /**
     * 
     */
    public ServiceException() {
    }

    /**
     * @param message
     */
    public ServiceException(String message) {
        super(message);
    }

}
