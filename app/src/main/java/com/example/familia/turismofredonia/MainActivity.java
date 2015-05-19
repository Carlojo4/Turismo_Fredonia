package com.example.familia.turismofredonia;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_hoteles) {

            HotelsFragment fragment = new HotelsFragment();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
            /*Intent i = new Intent(this,HotelActivity.class);
            startActivity(i);*/
        }
        else if (id == R.id.action_bares) {
            BarsFragment fragment = new BarsFragment();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
            /*Intent i = new Intent(this,BarActivity.class);
            startActivity(i);*/
        }
        else if (id == R.id.action_turismo) {
            TurismFragment fragment = new TurismFragment();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
            /*Intent i = new Intent(this,TurismActivity.class);
            startActivity(i);*/
        }
        else if (id == R.id.action_about) {
            AboutFragment fragment = new AboutFragment();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
            /*Intent i = new Intent(this,AboutActivity.class);
            startActivity(i);*/
        }
        else if (id == R.id.action_info) {
            InfoFragment fragment = new InfoFragment();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
            /*Intent i = new Intent(this,InfoActivity.class);
            startActivity(i);*/
        }


        return super.onOptionsItemSelected(item);
    }
}
