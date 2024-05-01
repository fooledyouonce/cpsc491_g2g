package com.example.got2go.activities

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.got2go.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpDialogFragment : DialogFragment() {

    lateinit var etEmail: EditText
    lateinit var etConfPass: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnSignUp: Button
    private lateinit var auth : FirebaseAuth
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
//        val btnSignUp = view.findViewById<Button>(R.id.btnRedirectSignUp)

        etEmail = view.findViewById(R.id.etEmailAddress)
        etPassword = view.findViewById(R.id.etPassword)
        etConfPass = view.findViewById(R.id.etConfPassword)
        btnSignUp = view.findViewById(R.id.btnSigned)

        auth = Firebase.auth

        btnSignUp.setOnClickListener {
            Log.i(TAG, "Sign-up button tapped")
            signUpUser()
        }

        return view
    }

    private fun signUpUser() {
        // var username = etUsername.text.toString()
        val email = etEmail.text.toString()
        val pass = etPassword.text.toString()
        val confirmPassword = etConfPass.text.toString()

        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(requireContext(), "Fields cannot be blank", Toast.LENGTH_SHORT).show()
            return
        }

        if (pass != confirmPassword) {
            Toast.makeText(requireContext(), "Passwords do not match", Toast.LENGTH_SHORT).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Toast.makeText(requireContext(), "Successfully Signed Up", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Sign Up Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }

    }

    companion object {
        const val TAG = "SignUpDialogFragment"
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }


}