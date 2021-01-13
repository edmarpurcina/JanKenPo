package com.example.jankenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String player_choice){

        System.out.println("Opção Selecionada " + player_choice);
        int number_random = new Random().nextInt(3);
        String[] app_choice = {"pedra","papel", "tesoura"};
        ImageView imageView = findViewById(R.id.ImageResultado);
        TextView result = findViewById(R.id.textView2);
        Score score = new Score();
        TextView scorePlayer = findViewById(R.id.textPointsPlayer);
        TextView scoreApp = findViewById(R.id.textPointsApp);

        switch (app_choice[number_random]){
            case "pedra":
                imageView.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageView.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageView.setImageResource(R.drawable.tesoura);
                break;
        }

        if (app_choice[number_random] == player_choice){ //empate
            result.setText("Houve um Empate");
        }else if(
                (app_choice[number_random] == "pedra" && player_choice== "tesoura" ) ||
                (app_choice[number_random] == "tesoura" && player_choice== "papel" ) ||
                (app_choice[number_random] == "papel" && player_choice== "pedra" )
        ){ // maquina ganhou

            result.setText("App Venceu :(");
            score.setScoreApp();
            scoreApp.setText(""+score.getScoreApp());


        }else{ // usuario ganhou
            result.setText("Você Venceu :D");
            score.setScorePlayer();
            scorePlayer.setText(""+score.getScorePlayer());
        }

    }


}
