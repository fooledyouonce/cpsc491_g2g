package com.example.got2go.activities

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.got2go.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.database.FirebaseDatabase


class LoginActivity : AppCompatActivity() {

    private lateinit var btnRedirectSignUp: Button
    lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var btnGoogleLogin: Button
    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var database: FirebaseDatabase
    var RC_SIGN_IN = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnRedirectSignUp = findViewById(R.id.btnRedirectSignUp)

        btnLogin.setOnClickListener(View.OnClickListener {
            Log.i(TAG, "Login button tapped")
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            if (username.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Username and password are required", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            login()
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

        // google sso
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()

        val googleSso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build()
        googleSignInClient = GoogleSignIn.getClient(this, googleSso)

        btnGoogleLogin.setOnClickListener {
            val signInIntent = googleSignInClient?.signInIntent
            if (signInIntent != null) {
                startActivityForResult(signInIntent, RC_SIGN_IN)
            }
        }
    }

//    private fun moveNext() {
//        val currentUser = FirebaseAuth.getInstance().currentUser
//        if(currentUser != null) {
//            startActivity(Intent(this, HomeActivity::class.java))
//            this.finish()
//        }
//    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)

            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuth(account?.idToken)

            } catch (_: ApiException) {
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun firebaseAuth(idToken: String?) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
                .addOnCompleteListener(OnCompleteListener<AuthResult> () { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser

                        val map = mutableMapOf<String, Any?>()
                        map["id"] = user?.uid
                        map["name"] = user?.displayName
                        map["profile"] = user?.photoUrl.toString()

                        if (user != null) {
                            database.reference.child("users").child(user.uid).setValue(map)
                            goMainActivity()
                        }
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()

                    }
                })
    }

    private fun login() {
        val email = etUsername.text.toString()
        val pass = etPassword.text.toString()
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                goMainActivity()
                Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goMainActivity() {
        val currentUser = FirebaseAuth.getInstance().currentUser
        if(currentUser != null) {
            startActivity(Intent(this, HomeActivity::class.java))
            this.finish() //makes main activity the "default" page, closes login activity for access
        }
    }



//    companion object {
//        const val TAG = "LoginActivity"
//    }
}