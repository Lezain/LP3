package com.example.lesly.lp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button botonIngresar = (Button) findViewById(R.id.btnIngresar);

        Button btnClave = (Button) findViewById(R.id.btnClave);

        btnClave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent newform = new Intent(Main1.this,Clave.class);
                startActivity(newform);
            }});
        botonIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                String usuario = ((EditText)findViewById(R.id.editUsuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.editPassword)).getText().toString();
                if (usuario.equals("Admin")&& password.equals("123456")){
                    Intent newform =new Intent(Main1.this, com.example.lesly.lp3.MainMenu.class);
                    startActivity(newform);

                }else{
                    Toast.makeText(getApplicationContext(),"<<<< Clave Incorrecta >>>>",Toast.LENGTH_SHORT).show();
                }
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
