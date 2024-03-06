package com.example.got2go.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.got2go.R
import android.widget.TextView


class LocationReviewsFragment: Fragment() {

    private lateinit var rootView: View
    private lateinit var reviewTextView: TextView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_location_review, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        reviewTextView = rootView.findViewById(R.id.reviewTextView)


    }
}