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
    ImageButton btnCardboard;
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
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPaperDialog();
            }
        });
    }

    private void showPaperDialog() {
        FragmentManager fm = getFragmentManager();
        FragmentPaper fragmentPaper = FragmentPaper.newInstance("Some Title");
        fragmentPaper.show(fm, "fragment_paper");
    }
}
