package com.example.miapp2.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.miapp2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    Button btnRegister,btnLogin;
    LoginFragmentsEvents events;
    public LoginFragmentListener listener;

    public void setListener(LoginFragmentListener listener){
        this.listener = listener;
    }
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        btnRegister = v.findViewById(R.id.btnRegister);
        btnLogin = v.findViewById(R.id.btnlogin);
        events = new LoginFragmentsEvents(this);
        btnRegister.setOnClickListener(events);
        btnLogin.setOnClickListener(events);
        return v;
    }

}
class LoginFragmentsEvents implements View.OnClickListener{

    LoginFragment loginFragment;

    public LoginFragmentsEvents(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }


    @Override
    public void onClick(View view){
        if(view.getId() == R.id.btnRegister){
            if(this.loginFragment.listener!=null){
                this.loginFragment.listener.OnRegisteredCLicked();
            }
        }
        if(view.getId() == R.id.btnlogin){
            if(this.loginFragment.listener!=null){
                this.loginFragment.listener.OnLoginCLicked();
            }
        }
    }

}

