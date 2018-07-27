package com.pablo.persistencia.archivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pablo.persistencia.R;

public class FilesActivity extends AppCompatActivity {

    private Button btn_in, btn_from, btn_sys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);

        btn_in = (Button)findViewById(R.id.btn_in);
        btn_from = (Button)findViewById(R.id.btn_from);
        btn_sys = (Button)findViewById(R.id.btn_sys);

        btn_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
