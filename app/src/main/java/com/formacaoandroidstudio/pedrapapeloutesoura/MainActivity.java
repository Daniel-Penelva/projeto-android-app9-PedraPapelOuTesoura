package com.formacaoandroidstudio.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* selecionadoPedra vai ser uma ação ao clicar - para isso
     * usaremos a propriedade onclick do componente.  */

    public void selecionadoPedra(View view) {

        this.opcaoSelecionado("pedra");
    }

    public void selecionadoPapel(View view) {

        this.opcaoSelecionado("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String escolhaUsuario) {

        /* Capturando o id da imagem_padrao */
        ImageView imageResultado = findViewById(R.id.imageResultado);

        /* Capturando o id do textView para gerar o resultado do jokempo*/
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);

        /* Opções selecionadas pelo usuário */
        String[] opcoes = {"pedra", "papel", "tesoura"};

        /* Opções selecionadas pelo app */
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {

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

        /* Condicionando if app é o ganhador/ else if usuario é ganhador/ else empate */
        if (
                (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra")) {
            textResultado.setText(" Você perdeu :( ");

        } else if (
                (escolhaUsuario == "papel" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra")) {
            textResultado.setText(" Você ganhou :) ");

        }else{
            textResultado.setText(" Empatamos :) ");
        }

        System.out.println("item clicado: " + escolhaApp);
    }
}
