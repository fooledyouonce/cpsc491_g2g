package com.example.got2go.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.got2go.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        //retrieve from SharedPreferences if used
        val sharedPreferences = requireActivity().getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("email", "") ?: ""
        val username = sharedPreferences.getString("username", "") ?: ""

        val emailTextView: TextView = view.findViewById(R.id.emailTextView)
        val usernameTextView: TextView = view.findViewById(R.id.usernameTextView)

        //sets email and username to TextViews
        emailTextView.text = "Email: $userEmail"
        usernameTextView.text = "Username: $username"

        return view
    }
}
