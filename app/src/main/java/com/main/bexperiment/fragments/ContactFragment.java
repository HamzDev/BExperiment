package com.main.bexperiment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.main.bexperiment.R;
import com.main.bexperiment.contact.MailExecutor;
import com.main.bexperiment.contact.MailInstance;

/**
 * @author Hamza Fethi
 * @version 0.1
 */
public class ContactFragment extends Fragment {

    private Button sendButton;
    private EditText subject, email, message;

    /**
     * Displays the given view on class call
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);
        sendButton = (Button) view.findViewById(R.id.sendEmailId);
        subject = (EditText) view.findViewById(R.id.subjectId);
        email = (EditText) view.findViewById(R.id.emailId);
        message = (EditText) view.findViewById(R.id.messageId);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getRestrictions()) {
                    MailInstance mailInstance = new MailInstance(subject.getText().toString(), message.getText().toString());
                    new MailExecutor(v, mailInstance).send();
                }
            }
        });
        return view;
    }

    /**
     * Checks for restrictions
     * @return
     */
    private boolean getRestrictions() {
        if(!email.getText().toString().contains("@") ||
                email.getText().toString().isEmpty()) {
            System.out.println("Something went wrong with the email input!");
            return false;
        } else if (subject.getText().toString().isEmpty()) {
            System.out.println("Something went wrong with the subject input");
            return false;
        } else if (message.getText().toString().isEmpty()) {
            System.out.println("Something went wrong with the message input");
            return false;
        }
        return true;
    }

}
