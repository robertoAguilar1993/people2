package com.mx.tec.people.people2.exception;

public class BusinessException extends PeopleDataException {
    public BusinessException(String message, String process) {
        super(message, process);
    }

    public BusinessException(String message, String process, String error) {
        super(message, process, error);
    }
}
