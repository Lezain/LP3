package com.example.lesly.lp3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainJuego extends AppCompatActivity implements View.OnClickListener {

    protected Button a1, a2, a3, b1, b2, b3, c1, c2, c3;
    protected Button [] ArrButton;

    int [][] matriz;
    boolean turno;
    int contador;

    public void init(){
        matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriz[i][j]=R.drawable.t;
            }
        }
        turno = true;
        contador = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_juego);

        a1 = (Button)findViewById(R.id.a1);
        a2 = (Button)findViewById(R.id.a2);
        a3 = (Button)findViewById(R.id.a3);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        c1 = (Button)findViewById(R.id.c1);
        c2 = (Button)findViewById(R.id.c2);
        c3 = (Button)findViewById(R.id.c3);

        this.init();

        ArrButton = new Button[] {a1, a2, a3, b1, b2, b3, c1, c2, c3};

        for (Button b : ArrButton){
            b.setOnClickListener(this);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Button b = (Button)v;
        this.click(b);
    }

    public void click (Button b)
    {
        int x = 0;
        if (turno)
        {
            x=R.drawable.x;
            b.setBackgroundResource(x);
        }
        else
        {
            x = R.drawable.o;
            b.setBackgroundResource(x);
        }

        switch (b.getId())
        {
            case R.id.a1:
                matriz[0][0] = x;
                break;

            case R.id.a2:
                matriz[0][1] = x;
                break;

            case R.id.a3:
                matriz[0][2] = x;
                break;

            case R.id.b1:
                matriz[1][0] = x;
                break;

            case R.id.b2:
                matriz[1][1] = x;
                break;

            case R.id.b3:
                matriz[1][2] = x;
                break;

            case R.id.c1:
                matriz[2][0] = x;
                break;

            case R.id.c2:
                matriz[2][1] = x;
                break;

            case R.id.c3:
                matriz[2][2] = x;
                break;

        }

        turno = !turno;
        b.setClickable(true);
        contador++;
        this.verificarMatriz();
    }

    public void verificarMatriz(){
        int contador_X_F = 0, contador_O_F = 0, contador_X_C =0,contador_O_C = 0,
                contador_X_DP = 0, contador_X_DI = 0,contador_O_DI = 0,tamanioGato = 3;
        boolean ganador = false;

        for(int i = 0; i < matriz.length; i++)
        {
            for (int j=0;j< matriz.length; j++)
            {
               if (matriz[i][j]==R.drawable.x)
               {
                   contador_X_F ++;
                   if (contador_X_F==3){
                       ganador= true;
                   }
               }

                if (matriz[i][j]==R.drawable.o)
                {
                    contador_O_F ++;
                    if (contador_O_F==3){
                        ganador= true;
                    }
                }
            }
            contador_X_F=0; contador_O_F = 0; contador_X_C =0;contador_O_C = 0;
            // finnn
        }

    }
}
