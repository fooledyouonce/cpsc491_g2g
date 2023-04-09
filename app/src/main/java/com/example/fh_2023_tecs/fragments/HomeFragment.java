package com.example.fh_2023_tecs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    Button btnManual;
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
        btnManual = view.findViewById(R.id.btnManual);
        tvWelcome = view.findViewById(R.id.tvWelcome);

        ArrayList<String> facts = new ArrayList<String>();
        facts.add("Recycling is in a crisis in the U.S. due to public confusion about recycling.");
        facts.add("U.S. recycling levels are currently 21.4%.");
        facts.add("When U.S. recycling levels reach 75% it will be the environmental and CO2 equivalent of removing 55 million cars from U.S. roads each year.");
        facts.add("When U.S. recycling levels reach 75% it will generate 1.5 million new jobs in the U.S.");
        facts.add("Manufacturers truly want these materials back to reuse in their manufacturing, but they aren't able to reuse the materials if people don't recycle right.");
        facts.add("Recycling conserves finite natural resources.");
        facts.add("Recycling conserves fresh water up to 95% in the mining and manufacturing process for many materials.");
        facts.add("Recycling prevents waste from going into oceans - it is proven, when there is a strong recycling culture, there is less litter and less waste going into ocean.");
        facts.add("According to a recent Yale University/EPA study, the U.S. recycles less than 22% of its discarded materials.");
        facts.add("The U.S. recycling levels have not improved in 20 years despite the billions of dollars spent on recycling competitions, symposiums, awareness campaigns and new sorting technologies.");
        facts.add("Despite only representing 5% of the world population, the U.S. generates more waste than any other country in the world.");
        facts.add("In less than 15 years, worldwide waste is expected to double.");

        Random rand = new Random();

        tvWelcome.setText("Did you know...?\n" + facts.get(rand.nextInt(facts.size())));

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goScanActivity();
            }
        });

        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goManualActivity();
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
