package com.example.pruebafragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;



public class SegundoFragmento extends Fragment {

    public SegundoFragmento() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.segundo_fragmento, container, false);


    }
}
