package fr.univcotedazur.simpletcfs.exceptions;

import java.io.Serializable;

public class AlreadyExistingCustomerException extends Exception {

    private String conflictingName;

    public AlreadyExistingCustomerException(String name) {
        conflictingName = name;
    }

    public AlreadyExistingCustomerException() {
    }

    public String getConflictingName() {
        return conflictingName;
    }

    public void setConflictingName(String conflictingName) {
        this.conflictingName = conflictingName;
    }

}
