package com.example.admin.myapplication_udacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        ViewHolder viewHolder=new ViewHolder();
        
        viewHolder.button1=(Button) findViewById(R.id.button1);
        viewHolder.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Spotify App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.button2=(Button) findViewById(R.id.button2);
        viewHolder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Scores App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.button3=(Button) findViewById(R.id.button3);
        viewHolder.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Library App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.button4=(Button) findViewById(R.id.button4);
        viewHolder.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.button5=(Button) findViewById(R.id.button5);
        viewHolder.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.button6=(Button) findViewById(R.id.button6);
        viewHolder.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    class ViewHolder{
        
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;
        
    }
}
