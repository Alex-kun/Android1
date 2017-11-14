package com.example.alejandroquiros.prueba;

import android.content.Intent;
import android.view.View;

/**
 * Created by alejandroquiros on 10/11/17.
 */

public class SecondActivityEvents implements View.OnClickListener{

    private SecondActivity secondActivity;
    public SecondActivityEvents(SecondActivity secondActivity){
        this.secondActivity = secondActivity;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.backbtn){


            Intent intent = new Intent(secondActivity, MainActivity.class);
            secondActivity.startActivity(intent);
            secondActivity.finish();
        }
        }
    }

