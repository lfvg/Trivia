package com.redflag.lfvg.trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TriviaActivity extends AppCompatActivity {
    private int aux = 0;
    private int scoreTotal = 0;
    private Pergunta[] perguntas =  {new Pergunta("Qual o melhor professor do Foundations",  "Kiev", new String[]{"Kiev" , "Fernando Castor",  "Cristiano"}, new Random().nextInt(11)), new Pergunta("Pode levar o Mac pra casa",  "Não seu mamão!",  new String[]{"Sim", "Não seu mamão!",  "Claro"}, new Random().nextInt(11)), new Pergunta("Qual a linguagem de programacão a gente aprende",  "Swift",  new String[]{ "Swift", "Java",  "C#"}, new Random().nextInt(11)), new Pergunta("Sim",  "Sim",  new String[]{"Não",  "Talvez", "Sim"}, new Random().nextInt(11))};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        redesenhar(aux);

        final Button aButton = findViewById(R.id.answerA);
        final Button bButton = findViewById(R.id.answerB);
        final Button cButton = findViewById(R.id.answerC);

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(perguntas[aux].respostaECorreta(aButton.getText().toString())) scoreTotal += perguntas[aux].getValorPergunta();
                aux++;
                redesenhar(aux);
            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(perguntas[aux].respostaECorreta(bButton.getText().toString())) scoreTotal += perguntas[aux].getValorPergunta();
                aux++;
                redesenhar(aux);
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(perguntas[aux].respostaECorreta(cButton.getText().toString())) scoreTotal += perguntas[aux].getValorPergunta();
                aux++;
                redesenhar(aux);
            }
        });
    }


    private void redesenhar(int v){
        Button aButton = findViewById(R.id.answerA);
        Button bButton = findViewById(R.id.answerB);
        Button cButton = findViewById(R.id.answerC);
        TextView score = findViewById(R.id.score);
        TextView pergunta = findViewById(R.id.question);
        if(aux < perguntas.length){
            aButton.setText(perguntas[v].getListaRespostas()[0]);
            bButton.setText(perguntas[v].getListaRespostas()[1]);
            cButton.setText(perguntas[v].getListaRespostas()[2]);
            score.setText("Score: " + scoreTotal);
            pergunta.setText(perguntas[v].getPergunta());
        }
        else{
            aButton.setVisibility(View.GONE);
            bButton.setVisibility(View.GONE);
            cButton.setVisibility(View.GONE);
            pergunta.setVisibility(View.GONE);
            score.setText("Score Final: " + scoreTotal);
        }
    }
}
