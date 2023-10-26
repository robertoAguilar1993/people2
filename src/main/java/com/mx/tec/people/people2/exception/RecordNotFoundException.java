package com.mx.tec.people.people2.exception;



public class RecordNotFoundException extends PeopleDataException {

    public RecordNotFoundException(String message, String process) {
        super(message, process);
    }

    public RecordNotFoundException(String message, String process, String error) {
        super(message, process, error);
    }


}
