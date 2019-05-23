package br.com.digitalhouse.digital.fragmentsapp.fragments;

//da suporte para versoes mais antigas do android

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.digital.fragmentsapp.R;

public class Fragmento1 extends Fragment {

    public Fragmento1() {

    }

    //incluir o metodo onCreateView: infla o XML da view do fregmento
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //container espaço onde o fragmento fica atrelado
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Button btnMessage = view.findViewById(R.id.btnMessage);
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,"Botão clicado", Snackbar.LENGTH_SHORT).show();

            }
        });

        return view;

    }
}
