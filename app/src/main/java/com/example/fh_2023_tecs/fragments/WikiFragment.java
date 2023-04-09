package com.example.fh_2023_tecs.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.fh_2023_tecs.R;

public class WikiFragment extends Fragment {

    public WikiFragment() {
        // Required empty public constructor
    }
    ImageButton btnPaper;
    ImageButton btnPlastic;
    ImageButton btnGlass;
    ImageButton btnMetal;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wiki, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnPaper = view.findViewById(R.id.btnPaper);
        btnPlastic = view.findViewById(R.id.btnPlastic);
        btnGlass = view.findViewById(R.id.btnGlass);
        btnMetal = view.findViewById(R.id.btnMetal);
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPaperDialog();
            }
        });

        btnPlastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPlasticDialog();
            }
        });

        btnGlass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGlassDialog();
            }
        });

        btnMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMetalDialog();
            }
        });

    }

    private void showMetalDialog() {
        FragmentManager fm = getFragmentManager();
        FragmentMetal fragmentMetal = FragmentMetal.newInstance("Some Title");
        fragmentMetal.show(fm, "fragment_metal");
    }

    private void showGlassDialog() {
        FragmentManager fm = getFragmentManager();
        FragmentGlass fragmentGlass = FragmentGlass.newInstance("Some Title");
        fragmentGlass.show(fm, "fragment_glass");
    }

    private void showPlasticDialog() {
        FragmentManager fm = getFragmentManager();
        FragmentPlastic fragmentPlastic = FragmentPlastic.newInstance("Some Title");
        fragmentPlastic.show(fm, "fragment_plastic");
    }

    private void showPaperDialog() {
        FragmentManager fm = getFragmentManager();
        FragmentPaper fragmentPaper = FragmentPaper.newInstance("Some Title");
        fragmentPaper.show(fm, "fragment_paper");
    }
}
