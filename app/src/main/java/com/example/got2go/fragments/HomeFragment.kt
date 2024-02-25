package com.example.got2go.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.got2go.R
import com.example.got2go.activities.Dummy1Activity
import com.example.got2go.activities.Dummy3Activity

class HomeFragment : Fragment() {
    //TODO: update fragment w/g2g stuff

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnScan: Button = view.findViewById(R.id.btnScan)
        var overall_rate: RatingBar = view.findViewById(R.id.overall_rate)
        var tvWelcome: TextView = view.findViewById(R.id.tvWelcome)
        tvWelcome.text = "Write a Review for Location"
        btnScan.setOnClickListener(View.OnClickListener { goScanActivity() })
    }

    private fun goScanActivity() {
        val i = Intent(activity, Dummy3Activity::class.java)
        startActivity(i)
    }

    private fun goManualActivity() {
        val i = Intent(activity, Dummy1Activity::class.java)
        startActivity(i)
    }
}
