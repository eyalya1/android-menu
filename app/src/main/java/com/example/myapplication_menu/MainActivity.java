package com.example.myapplication_menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);//shows menu - helps connect menu to java
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {//what to do when an option is clicked
        super.onOptionsItemSelected(item);
        if(item.getItemId()==R.id.login){
            Toast.makeText(this,"login",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.logout){
            Toast.makeText(this,"logout",Toast.LENGTH_LONG).show();

        }
        return true;
    }
}