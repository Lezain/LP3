package com.example.lesly.lp3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainCalculadora extends AppCompatActivity {
    TextView txtDisplay;
    String operation;
    int numero1;
    int numero2;
    int resultado;
    double resultadomult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        Button btn01 =(Button) findViewById(R.id.btn01);
        Button btn02 =(Button) findViewById(R.id.btn02);
        Button btn03 =(Button) findViewById(R.id.btn03);
        Button btnPlus =(Button) findViewById(R.id.btnSum);
        Button btnEquals =(Button) findViewById(R.id.btnIgual);
        Button btnClear =(Button) findViewById(R.id.btnClean);
        Button btnRest =(Button) findViewById(R.id.btnRest);
        Button btnMult =(Button) findViewById(R.id.btnMult);
        Button btnDiv =(Button) findViewById(R.id.btnDivc);


        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Integer.parseInt(txtDisplay.getText().toString());
                operation = "/";
                txtDisplay.setText("");
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Integer.parseInt(txtDisplay.getText().toString());
                operation = "X";
                txtDisplay.setText("");
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Integer.parseInt(txtDisplay.getText().toString());
                operation = "-";
                txtDisplay.setText("");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = 0;
                txtDisplay.setText("");
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero2 = Integer.parseInt(txtDisplay.getText().toString());
                if(operation.equals("+")){
                    resultado = numero2 + numero1;
                    txtDisplay.setText(resultado + "");
                }if(operation.equals("-")){
                    resultado = numero2 - numero1;
                    txtDisplay.setText(resultado + "");
                }if(operation.equals("X")){
                    resultado = numero2 * numero1;
                    txtDisplay.setText(resultado + "");
                }if(operation.equals("/")){
                    resultadomult = numero2 / numero1;
                    txtDisplay.setText(resultadomult+"");
                }else{
                    txtDisplay.setText("nob");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                numero1 = Integer.parseInt(txtDisplay.getText().toString());
                operation="+";
                txtDisplay.setText("");
            }
        });


        btn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"1");
            }
        });

        btn02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"2");
            }
        });
        btn03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"3");
            }
        });

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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
