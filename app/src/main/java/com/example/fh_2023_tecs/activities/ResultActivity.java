package com.example.fh_2023_tecs.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fh_2023_tecs.R;
import com.example.fh_2023_tecs.models.Material;

import org.parceler.Parcels;

public class ResultActivity extends AppCompatActivity {

    TextView tvItem;
    TextView tvRecycle;
    TextView tvWhere;
    ImageButton btnReturn;
    private Material material;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvItem = findViewById(R.id.tvItem);
        tvRecycle = findViewById(R.id.tvRecycle);
        tvWhere = findViewById(R.id.tvWhere);
        btnReturn = findViewById(R.id.btnReturn);

        material = Parcels.unwrap(getIntent().getParcelableExtra("material"));

        tvItem.setText("Test");
        tvRecycle.setText("Test");
        tvWhere.setText("Test");

        btnReturn.setOnClickListener(view -> goMainActivity());
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish(); //makes main activity the "default" page, closes login activity for access
    }
}
