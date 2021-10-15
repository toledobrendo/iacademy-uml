package com.iacademy.uml.sample3.model;

import com.iacademy.uml.sample3.reference.PatronStatus;

public class Patron {
    private String name;
    private PatronStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatronStatus getStatus() {
        return status;
    }

    public void setStatus(PatronStatus status) {
        this.status = status;
    }
}
