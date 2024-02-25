package com.example.got2go.fragments;

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

import com.example.got2go.R;
import com.example.got2go.activities.Dummy1Activity;
import com.example.got2go.activities.Dummy3Activity;

public class HomeFragment extends Fragment {
    //TODO: update fragment w/g2g stuff
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
        Intent i = new Intent(getActivity(), Dummy3Activity.class);
        startActivity(i);
    }
    private void goManualActivity() {
        Intent i = new Intent(getActivity(), Dummy1Activity.class);
        startActivity(i);
    }
}
