package com.main.bexperiment.contact;

public class MailInstance {

    private String subject, message;

    /**
     * Constructor mail instance
     * @param subject Subject of the email (title)
     * @param message Message of the email
     */
    public MailInstance(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    /**
     * Returns the subject
     * @return
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Returns the message
     * @return
     */
    public String getMessage() {
        return message;
    }
}
