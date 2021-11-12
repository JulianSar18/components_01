package com.divisascomp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner listDiv, listDiv2;
    TextView txtFrom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDiv =  (Spinner) findViewById(R.id.lisDiv);
        listDiv2 =  (Spinner) findViewById(R.id.lisDiv2);
        txtFrom = (TextView) findViewById(R.id.txtFrom);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.divisas_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        listDiv.setAdapter(adapter);
        listDiv2.setAdapter(adapter);
        listDiv.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String from = parent.getItemAtPosition(position).toString();
        txtFrom.setText(from);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}