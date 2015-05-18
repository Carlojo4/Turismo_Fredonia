package com.example.familia.turismofredonia;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AbrirHoteles(View view){
        Intent i = new Intent(this,HotelActivity.class);
        startActivity(i);
    }
    public void AbrirBares(View view){
        Intent i = new Intent(this,BarActivity.class);
        startActivity(i);
    }
    public void AbrirTurismo(View view){
        Intent i = new Intent(this,TurismActivity.class);
        startActivity(i);
    }
    public void AbrirInfo(View view){
        Intent i = new Intent(this,InfoActivity.class);
        startActivity(i);
    }
    public void AbrirAcercaDe(View view){
        Intent i = new Intent(this,AboutActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_hoteles) {
            Intent i = new Intent(this,HotelActivity.class);
            startActivity(i);
        }
        else if (id == R.id.action_bares) {
            Intent i = new Intent(this,BarActivity.class);
            startActivity(i);
        }
        else if (id == R.id.action_turismo) {
            Intent i = new Intent(this,TurismActivity.class);
            startActivity(i);
        }
        else if (id == R.id.action_about) {
            Intent i = new Intent(this,AboutActivity.class);
            startActivity(i);
        }
        else if (id == R.id.action_info) {
            Intent i = new Intent(this,InfoActivity.class);
            startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }
}
