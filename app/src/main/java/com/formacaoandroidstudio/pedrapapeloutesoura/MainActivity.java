package com.formacaoandroidstudio.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* O parâmetro View é obrigatório! */
    public void selecionadoPedra(View view){

        this.opcaoSelecionado("pedra");
    }

    public void selecionadoPapel(View view){

        this.opcaoSelecionado("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String opcaoSelecionada){
        System.out.println( opcaoSelecionada );
    }
}
