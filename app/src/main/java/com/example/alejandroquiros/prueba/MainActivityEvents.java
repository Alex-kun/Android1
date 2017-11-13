package com.example.alejandroquiros.prueba;

import android.content.Intent;
import android.view.View;

/**
 * Created by alejandroquiros on 10/11/17.
 */

public class MainActivityEvents implements View.OnClickListener{

    private MainActivity mainActivity;
    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnmain){
            mainActivity.vistaUno.setVisibility(View.GONE);
            mainActivity.vistaDos.setVisibility(View.VISIBLE);

            //mainActivity.txtvHolaMundo.setText("Bien");
            //mainActivity.btnMain.setVisibility(View.GONE);
            //mainActivity.btnMain.setEnabled(false);


            //Intent intent = new Intent(mainActivity, SecondActivity.class);
            //mainActivity.startActivity(intent);
            //mainActivity.finish();
        }
    }
}
