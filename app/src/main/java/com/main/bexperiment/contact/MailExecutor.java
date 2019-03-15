package com.main.bexperiment.contact;

import android.content.Intent;
import android.view.View;

public class MailExecutor {

    private View view;
    private MailInstance mailInstance;

    /**
     * Constructor mail executor
     * @param view Current view instance
     * @param mailInstance Mail Credentials
     */
    public MailExecutor(View view, MailInstance mailInstance) {
        this.mailInstance = mailInstance;
        this.view = view;
    }

    /**
     * Receivers of the email that is being sent
     */
    private final String[] RECEIVERS = {"hamzarsfethi@gmail.com"};

    /**
     * Sends a intent with listed email providers
     * Also pre-saves the input of the text fields
     */
    public void send() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, RECEIVERS);
        intent.putExtra(Intent.EXTRA_SUBJECT, mailInstance.getSubject());
        intent.putExtra(Intent.EXTRA_TEXT, mailInstance.getMessage());

        intent.setType("message/rfc822");
        view.getContext().startActivity(Intent.createChooser(intent, "Select your email provider"));
    }
}
