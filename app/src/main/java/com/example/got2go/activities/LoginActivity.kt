package com.example.got2go.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.got2go.R
import com.example.got2go.fragments.SignUpDialogFragment
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var btnRedirectSignUp: Button
    lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnRedirectSignUp = findViewById(R.id.btnRedirectSignUp)

        auth = FirebaseAuth.getInstance()

        btnLogin.setOnClickListener(View.OnClickListener {
            Log.i(TAG, "Login button tapped")
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
        })

        btnRedirectSignUp.setOnClickListener {
            Log.i(TAG, "Sign-up button tapped")
            //login fragment
            val signUpDialogFragment = SignUpDialogFragment()
            signUpDialogFragment.show(supportFragmentManager, SignUpDialogFragment.TAG)
        }


//        btnRedirectSignUp.setOnClickListener {
//            val intent = Intent(this, RegisterActivity::class.java)
//            startActivity(intent)
//        }
    }

    private fun login() {
        val email = etUsername.text.toString()
        val pass = etPassword.text.toString()
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goMainActivity() {
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
        finish() //makes main activity the "default" page, closes login activity for access
    }

    companion object {
        const val TAG = "LoginActivity"
    }
}
