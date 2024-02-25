package com.example.got2go.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.got2go.R

class Dummy2Activity : AppCompatActivity() {
    //TODO: update activity w/g2g stuff

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var tvItem: TextView = findViewById(R.id.tvItem)
        var tvRecycle: TextView = findViewById(R.id.tvRecycle)
        var tvWhere: TextView = findViewById(R.id.tvWhere)
        var btnReturn: ImageButton = findViewById(R.id.btnReturn)
        tvItem.text = "Test"
        tvRecycle.text = "Test"
        tvWhere.text = "Test"
        btnReturn.setOnClickListener(View.OnClickListener { view: View? -> goMainActivity() })
    }

    private fun goMainActivity() {
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
        finish() //makes main activity the "default" page, closes login activity for access
    }
}
