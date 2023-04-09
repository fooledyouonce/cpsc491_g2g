package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fh_2023_tecs.R;

import com.example.fh_2023_tecs.activities.ScanActivity;

import com.example.fh_2023_tecs.activities.ManualActivity;

public class HomeFragment extends Fragment {

    Button btnScan;
    Button btnManual;

    public HomeFragment() {/*Required empty public constructor*/}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnScan = view.findViewById(R.id.btnScan);
        btnManual = view.findViewById(R.id.btnManual);

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goScanActivity();
            }
        });

        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goManualActivity();
            }
        });
    }
    private void goScanActivity() {
        Intent i = new Intent(getContext(), ScanActivity.class);
        startActivity(i);
    }
    private void goManualActivity() {
        Intent i = new Intent(getContext(), ManualActivity.class);
        startActivity(i);
    }
}
