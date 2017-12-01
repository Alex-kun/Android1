package com.example.miapp2;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;

import com.example.miapp2.fragments.LoginFragment;
import com.example.miapp2.fragments.LoginFragmentListener;
import com.example.milib.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {


    LoginFragment loginFragment;
    RegisterFragment registerFragment;
    MainActivityEvents mainActivityEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityEvents = new MainActivityEvents(this);
        loginFragment.setListener(mainActivityEvents);

        loginFragment = (LoginFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        registerFragment = (RegisterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);

        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.hide(registerFragment);
        transition.show(loginFragment);
        transition.commit();
    }
}

class MainActivityEvents implements LoginFragmentListener{

    MainActivity mainActivity;
    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void OnRegisteredCLicked(){
        FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transition.hide(this.mainActivity.registerFragment);
        transition.show(this.mainActivity.loginFragment);
        transition.commit();
    }

    @Override
    public void OnLoginCLicked(){
        //firebase
    }


}