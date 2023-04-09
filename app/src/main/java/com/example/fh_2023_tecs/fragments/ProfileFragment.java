package com.example.fh_2023_tecs.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.fh_2023_tecs.R;
import com.parse.ParseUser;

public class ProfileFragment extends Fragment {

    private ParseUser currentUser;

    public ProfileFragment(ParseUser currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // set up any views or event listeners for the fragment
        // For example, you could access the current user's name using:
        // String username = currentUser.getUsername();

        return view;
    }
}