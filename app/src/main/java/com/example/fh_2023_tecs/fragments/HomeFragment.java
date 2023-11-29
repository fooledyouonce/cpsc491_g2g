package com.example.fh_2023_tecs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fh_2023_tecs.R;
import com.example.fh_2023_tecs.activities.ManualActivity;
import com.example.fh_2023_tecs.activities.ScanActivity;

import java.util.ArrayList;
import java.util.Random;

public class HomeFragment extends Fragment {

    Button btnScan;
    RatingBar overall_rate;
    TextView tvWelcome;

    public HomeFragment() {/*Required empty public constructor*/}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnScan = view.findViewById(R.id.btnScan);
        overall_rate = view.findViewById(R.id.overall_rate);
        tvWelcome = view.findViewById(R.id.tvWelcome);
        tvWelcome.setText("Write a Review for Location");

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goScanActivity();
            }
        });


    }
    private void goScanActivity() {
        Intent i = new Intent(getActivity(), ScanActivity.class);
        startActivity(i);
    }
    private void goManualActivity() {
        Intent i = new Intent(getActivity(), ManualActivity.class);
        startActivity(i);
    }
}
