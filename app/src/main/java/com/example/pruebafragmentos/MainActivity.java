package com.example.pruebafragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;



public class MainActivity extends AppCompatActivity {

    private com.google.android.material.tabs.TabLayout tabs;
    private Fragment fragmentInicio;
    private Fragment fragmentSegundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentInicio = new PrimerFragmento();
        fragmentSegundo = new SegundoFragmento();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragment, fragmentInicio).commit();

        // Componente TabLayout
        tabs = (com.google.android.material.tabs.TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setIcon(android.R.drawable.arrow_down_float));
        tabs.addTab(tabs.newTab().setIcon(android.R.drawable.arrow_up_float));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:

                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_fragment, fragmentInicio).commit();
                        break;
                    case 1:

                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_fragment, fragmentSegundo).commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}