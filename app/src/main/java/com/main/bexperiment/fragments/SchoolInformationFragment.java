package com.main.bexperiment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.main.bexperiment.R;

/**
 * @author Hamza Fethi
 * @version 0.1
 */
public class SchoolInformationFragment extends Fragment {

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
        return inflater.inflate(R.layout.school_informatie, container, false);
    }
}
