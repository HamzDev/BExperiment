package com.main.bexperiment.contact;

public class MailInstance {

    private String subject, message;

    public MailInstance(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
