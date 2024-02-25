package com.example.got2go.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.got2go.R;

public class WikiFragment extends Fragment {
    //TODO: update fragment w/g2g stuff
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
        Fragment2 fragmentMetal = Fragment2.newInstance("Some Title");
        fragmentMetal.show(fm, "fragment_metal");
    }

    private void showGlassDialog() {
        FragmentManager fm = getFragmentManager();
        Fragment1 fragmentGlass = Fragment1.newInstance("Some Title");
        fragmentGlass.show(fm, "fragment_glass");
    }

    private void showPlasticDialog() {
        FragmentManager fm = getFragmentManager();
        Fragment4 fragmentPlastic = Fragment4.newInstance("Some Title");
        fragmentPlastic.show(fm, "fragment_plastic");
    }

    private void showPaperDialog() {
        FragmentManager fm = getFragmentManager();
        Fragment3 fragmentPaper = Fragment3.newInstance("Some Title");
        fragmentPaper.show(fm, "fragment_paper");
    }
}
