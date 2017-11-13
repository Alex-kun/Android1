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


            Intent intent = new Intent(mainActivity, SecondActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
        if(view.getId() == R.id.siguiente) {
            if(mainActivity.numero == 1){
                mainActivity.title.setText(R.string.titulo2);
                mainActivity.text.setText(R.string.capitulo2);
                mainActivity.numero = 2;
            } else if(mainActivity.numero == 2){
                mainActivity.title.setText(R.string.titulo3);
                mainActivity.text.setText(R.string.capitulo3);
                mainActivity.numero = 3;
            } else if(mainActivity.numero == 3){
                mainActivity.title.setText(R.string.titulo1);
                mainActivity.text.setText(R.string.capitulo1);
                mainActivity.numero = 1;
            }
        }
        if(view.getId() == R.id.anterior) {
            if(mainActivity.numero == 1){
                mainActivity.title.setText(R.string.titulo3);
                mainActivity.text.setText(R.string.capitulo3);
                mainActivity.numero = 3;
            } else if(mainActivity.numero == 2){
                mainActivity.title.setText(R.string.titulo1);
                mainActivity.text.setText(R.string.capitulo1);
                mainActivity.numero = 1;
            } else if(mainActivity.numero == 3){
                mainActivity.title.setText(R.string.titulo2);
                mainActivity.text.setText(R.string.capitulo2);
                mainActivity.numero = 2;
            }
        }
    }
}
