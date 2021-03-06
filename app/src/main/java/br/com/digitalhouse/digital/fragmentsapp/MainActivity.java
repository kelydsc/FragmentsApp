package br.com.digitalhouse.digital.fragmentsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.digital.fragmentsapp.fragments.Fragment2;
import br.com.digitalhouse.digital.fragmentsapp.fragments.Fragmento1;

public class MainActivity extends AppCompatActivity {

    private Button btnFragment1;
    private Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   FragmentManager manager = getSupportFragmentManager();
             //   FragmentTransaction transaction = manager.beginTransaction();
             //container = main activity
             //   transaction.add(R.id.container,new Fragmento1());
             //inclui a pilha de fragments
             //   transaction.addToBackStack("FRAGMENTS");
             //   transaction.commit();

                addFragment(new Fragmento1());
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addFragment(new Fragment2());
            }
        });
    }

    private void addFragment(Fragment fragment){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //container = main activity
        //transaction.add(R.id.container,new Fragmento1());
        //transaction.add(R.id.container,fragment);
        transaction.replace(R.id.container,fragment);
        //inclui a pilha de fragments
        transaction.addToBackStack("FRAGMENTS");
        transaction.commit();

        //OU pode ser feito, conforme abaixo:
        /*
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,fragment)
                .addToBackStack("FRAGMENTS")
                .commit();
       */

    }

    private void initViews() {
        btnFragment1 = findViewById(R.id.btnFragmento1);
        btnFragment2 = findViewById(R.id.btnFragmento2);
    }
}
