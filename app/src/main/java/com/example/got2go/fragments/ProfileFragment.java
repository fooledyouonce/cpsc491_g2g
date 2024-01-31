package com.example.got2go.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.got2go.R;
import com.parse.ParseUser;

public class ProfileFragment extends Fragment {
    //TODO: update fragment w/g2g stuff
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