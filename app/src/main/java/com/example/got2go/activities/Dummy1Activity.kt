package com.example.got2go.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.got2go.R
import com.example.got2go.fragments.HomeFragment
import com.example.got2go.fragments.WikiFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dummy1Activity : AppCompatActivity() {
    //TODO: update activity w/g2g stuff


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)
        val actionBar: ActionBar? = supportActionBar
        var bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        var etItemName: EditText = findViewById(R.id.etItemName)
        var etItemType: EditText = findViewById(R.id.etItemType)
        var btnCheck: Button = findViewById(R.id.btnCheck)
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            val fragment: Fragment? = null
            when (item.itemId) {
                R.id.action_home -> {
                    supportFragmentManager.beginTransaction()
                            .replace(R.id.flContainer, HomeFragment()).commit()
                    finish()
                    true
                }

                R.id.action_wiki -> {
                    supportFragmentManager.beginTransaction()
                            .replace(R.id.flContainer, WikiFragment()).commit()
                    finish()
                    true
                }

                else -> false
            }
        })
        val itemName = etItemName.text.toString()
        val itemType = etItemType.text.toString()
        btnCheck.setOnClickListener(View.OnClickListener {
            //TODO: fix &&
            if (TextUtils.isEmpty(etItemName.text.toString()) && TextUtils.isEmpty(etItemType.getText().toString())) {
                Toast.makeText(this@Dummy1Activity, "Please fill out all fields!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@Dummy1Activity, "Checking!", Toast.LENGTH_SHORT).show()

                //TODO: DB checking here
                // Configure Query
                // Store an object
                //TODO: upon success navigate to results, upon error indicate no match/can't be recycled
                goResultActivity()
            }
        })
    }

    private fun goResultActivity() {
        val i = Intent(this, Dummy2Activity::class.java)
        startActivity(i)
        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.Logout) {
            goLoginActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun goLoginActivity() {
        val i = Intent(this, LoginActivity::class.java)
        startActivity(i)
        finish()
    }
}
