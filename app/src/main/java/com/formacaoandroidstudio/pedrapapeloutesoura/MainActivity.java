package com.formacaoandroidstudio.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* O parâmetro View é obrigatório! */
    public void selecionadoPedra(View view) {

        this.opcaoSelecionado("pedra");
    }

    public void selecionadoPapel(View view) {

        this.opcaoSelecionado("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String opcaoSelecionada) {

        /* Capturando o id da imagem_padrao */
        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3);

        /* Opções selecionadas pelo usuário */
        String[] opcoes = {"pedra", "papel", "tesoura"};

        /* Opções selecionadas pelo app */
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {

            case "pedra":

                /* setImageResource é para configurar o recebimento de uma nova imagem através de um recurso.
                 * Essa imagem vai ser retirada da pasta res > drawable */

                imageResultado.setImageResource(R.drawable.pedra);

                break;

            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println("item clicado: " + opcaoApp);

    }
}
