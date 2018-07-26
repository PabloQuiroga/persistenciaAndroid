package com.pablo.persistencia.bundles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pablo.persistencia.R;

public class BundlesActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String CLAVE = "texto";
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundles);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    /** persistencia en la rotacion de pantalla  **/
    protected void onSaveInstanceState(Bundle estado) {
        estado.putString(CLAVE, String.valueOf(editText.getText()));

        super.onSaveInstanceState(estado);
    }
    @Override
    protected void onRestoreInstanceState(Bundle estado) {
        super.onRestoreInstanceState(estado);
        if(estado != null){
            editText.setText(estado.getString(CLAVE));
        }
    }
    /******************************************************/

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:{
                //TODO aqui pasar datos a otra actividad por bundle
                break;
            }
        }
    }
}
