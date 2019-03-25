package com.main.bexperiment.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.main.bexperiment.R;
import com.main.bexperiment.opleidingen.OpleidingenData;
import com.main.bexperiment.opleidingen.Pop;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hamza Fethi
 * @version 0.1
 */
public class OpleidingenFragment extends Fragment {

    private ListView listView;
    private List<String> ITEMS = Arrays.asList("Informatica", "Media technolgy");

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
        View view = inflater.inflate(R.layout.opleidingen_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1, ITEMS);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(OpleidingenData opleidingenData : OpleidingenData.values()) {
                    String name = opleidingenData.name().replace("_", " ");
                    if(name.equalsIgnoreCase(ITEMS.get(position))) {
                        Intent i = new Intent(view.getContext(), Pop.class);
                        i.putExtra("opleiding-title", opleidingenData.name());
                        i.putExtra("opleiding-date", opleidingenData.getDate());
                        i.putExtra("opleiding-content", opleidingenData.getContent());
                        view.getContext().startActivity(i);
                    }
                }
            }
        });
        return view;
    }
}
