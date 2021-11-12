package com.divisascomp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner listDiv, listDiv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDiv =  (Spinner) findViewById(R.id.lisDiv);
        listDiv2 =  (Spinner) findViewById(R.id.lisDiv2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.divisas_array, android.R.layout.simple_spinner_item);
        listDiv.setAdapter(adapter);
        listDiv2.setAdapter(adapter);
    }

}