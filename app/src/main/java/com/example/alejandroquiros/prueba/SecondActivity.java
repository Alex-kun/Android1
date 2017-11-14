package com.example.alejandroquiros.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public Button editbtn;
    public Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editbtn = this.findViewById(R.id.editbtn);
        backbtn = this.findViewById(R.id.backbtn);


    }
}
