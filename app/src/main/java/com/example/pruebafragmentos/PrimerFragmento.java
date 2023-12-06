package com.example.pruebafragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class PrimerFragmento extends Fragment {

    public PrimerFragmento() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.primer_fragmento, container, false);
    }
}
