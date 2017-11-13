package com.example.alejandroquiros.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button btnMain;
    public Button siguiente;
    public Button anterior;
    public TextView title;
    public TextView text;
    private MainActivityEvents events;
    public TextView txtvHolaMundo;
    public int numero = 1;

    public LinearLayout vistaUno,vistaDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);

        btnMain = this.findViewById(R.id.btnmain);
        siguiente = this.findViewById(R.id.siguiente);
        anterior = this.findViewById(R.id.anterior);

        title = this.findViewById(R.id.title);
        text = this.findViewById(R.id.text);


        //txtvHolaMundo=(TextView)this.findViewById(R.id.lblMain);
        vistaUno = (LinearLayout) this.findViewById(R.id.vistaUno);
        vistaDos = (LinearLayout) this.findViewById(R.id.vistaDos);


        btnMain.setOnClickListener(events);
        siguiente.setOnClickListener(events);
        anterior.setOnClickListener(events);
    }
}
