package com.example.pau.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Hipoteques extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hipoteques);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hipoteques, menu);
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

    public void Calcular(View view) {
        EditText Preu_In = (EditText) findViewById(R.id.eT_pIn);
        EditText Estalvis = (EditText) findViewById(R.id.eT_est);
        EditText Plaç = (EditText) findViewById(R.id.eT_plaç);
        EditText Euribor = (EditText) findViewById(R.id.eT_eu);
        EditText Diferencial = (EditText) findViewById(R.id.eT_dif);
        TextView mes = (TextView) findViewById(R.id.tV_mes);
        TextView total = (TextView) findViewById(R.id.tV_total);
        


    }
}
