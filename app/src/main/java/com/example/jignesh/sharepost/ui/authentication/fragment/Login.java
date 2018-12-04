package com.example.jignesh.sharepost.ui.authentication.fragment;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jignesh.sharepost.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {
    TextInputLayout layout;

    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.login_fragment, container, false);
    }

}
