package com.example.alejandroquiros.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public Button editbtn;
    public Button backbtn;
    public TextView InputName;
    public TextView InputName2;
    public TextView InputName3;
    public TextView InputName4;

    private SecondActivityEvents events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        events = new SecondActivityEvents(this);

        editbtn = this.findViewById(R.id.editbtn);
        backbtn = this.findViewById(R.id.backbtn);

        backbtn.setOnClickListener(events);

    }
}
