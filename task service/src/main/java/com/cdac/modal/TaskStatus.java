package com.cdac.modal;

import org.hibernate.id.Assigned;

public enum TaskStatus {

    PENDING("PENDING"),

    ASSIGNED("ASSIGNED"),

    DONE("DONE");

    TaskStatus(String done) {
    }
}
