package com.pablo.persistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pablo.persistencia.bundles.BundlesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_bundle, btn_shared, btn_files, btn_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_bundle = (Button)findViewById(R.id.btn_bundle);
        btn_shared = (Button)findViewById(R.id.btn_shared);
        btn_files = (Button)findViewById(R.id.btn_files);
        btn_sqlite = (Button)findViewById(R.id.btn_sqlite);

        btn_bundle.setOnClickListener(this);
        btn_shared.setOnClickListener(this);
        btn_files.setOnClickListener(this);
        btn_sqlite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_bundle:{
                Intent intent = new Intent(MainActivity.this, BundlesActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_shared:{
                break;
            }
            case R.id.btn_files:{
                break;
            }
            case R.id.btn_sqlite:{
                break;
            }
        }
    }
}
