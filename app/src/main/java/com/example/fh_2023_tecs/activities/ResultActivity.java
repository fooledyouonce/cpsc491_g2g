package com.example.fh_2023_tecs.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fh_2023_tecs.R;

public class ResultActivity extends AppCompatActivity {

    TextView tvItem;
    TextView tvRecycle;
    TextView tvWhere;
    ImageButton btnReturn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvItem.findViewById(R.id.tvItem);
        tvRecycle.findViewById(R.id.tvRecycle);
        tvWhere.findViewById(R.id.tvWhere);
        btnReturn.findViewById(R.id.btnReturn);

        tvItem.setText("Test");
        tvRecycle.setText("Test");
        tvWhere.setText("Test");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMainActivity();
            }
        });
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish(); //makes main activity the "default" page, closes login activity for access
    }
}
