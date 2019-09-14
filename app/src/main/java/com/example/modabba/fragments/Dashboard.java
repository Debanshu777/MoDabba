package com.example.modabba.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.modabba.AddressActivity;
import com.example.modabba.MainActivity;
import com.example.modabba.R;
import com.google.android.material.chip.Chip;
import com.kofigyan.stateprogressbar.StateProgressBar;

public class Dashboard extends Fragment {
    String[] descriptionData = {"Preparing", "On Way", "Delivered"};
    Button sub;
    Chip non_veg,extra;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_dashboard, container, false);
        StateProgressBar stateProgressBar = v.findViewById(R.id.progress_bar);
        stateProgressBar.setStateDescriptionData(descriptionData);
        sub=v.findViewById(R.id.sub);
        //non_veg=v.findViewById(R.id.Non_veg);
        //extra=v.findViewById(R.id.extra);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDetail();
            }
        });
        non_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }
    public void updateDetail() {
        Intent intent = new Intent(getActivity(), AddressActivity.class);
        startActivity(intent);
    }
}
