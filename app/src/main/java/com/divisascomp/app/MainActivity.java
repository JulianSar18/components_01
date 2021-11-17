package com.divisascomp.app;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("#0.00");
    Spinner listDiv, listDiv2;
    TextView txtFrom, txtTo;
    EditText edt1From;
    double mon1;
    double cambio;
    String cambioc;
    String from, to;
    String select, select2;
    int selectedItemSpinner1, selectedItemSpinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDiv = findViewById(R.id.lisDiv);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.divisas_array, android.R.layout.simple_spinner_dropdown_item);
        listDiv.setAdapter(adapter);
        listDiv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemSpinner1 = position;
                from = parent.getItemAtPosition(position).toString();
                txtFrom.setText(from);
                if(!txtTo.getText().equals("")){
                    resetInputs(view);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        listDiv2 = findViewById(R.id.lisDiv2);
        listDiv2.setAdapter(adapter);
        listDiv2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemSpinner2 = position;
                to = parent.getItemAtPosition(position).toString();
                if(!txtTo.getText().equals("")){
                    resetInputs(view);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        txtFrom = findViewById(R.id.txtFrom);
        txtTo = findViewById(R.id.txtTo);
        edt1From = findViewById(R.id.edtFrom);



    }

    public  void resetInputs(View view){
        edt1From.setText("");
        txtTo.setText("");
    }


    public void convertBtn(View view){
        if(selectedItemSpinner1 == selectedItemSpinner2){
            Toast toast = Toast.makeText(this, "Las divisas deben ser diferentes", Toast.LENGTH_SHORT);
            toast.show();
        }else if (edt1From.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(this, "Ingrese una cantidad a convertir", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            ctuUtc();
            ctaAtc();
            ctyYtc();
            ctwWtc();
            utaAtu();
            utjJtu();
            utwWtu();
            atjJta();
            atwWta();
            jtwWtj();
        }
    }
    public void ctuUtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("USD $")){
            cambio= mon1 / 3900;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("USD $")&&select2.equals("COP $")){
            cambio= mon1 * 3900;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void ctaAtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("AUD A$")){
            cambio= mon1 / 2847.08;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("AUD A$")&&select2.equals("COP $")){
            cambio= mon1 * 2847.08;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void ctyYtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("JPY ¥")){
            cambio= mon1 / 34.09;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("COP $")){
            cambio= mon1 * 34.09;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void ctwWtc(){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("KRW ₩")){
            cambio = mon1 / 3;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("COP $")){
            cambio = mon1 * 3;
            txtTo.setText(cambioc);
        }
    }
    public void utaAtu (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("USD $")&&select2.equals("AUD A$")){
            cambio= mon1 / 0.73;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("AUD A$")&&select2.equals("USD $")){
            cambio= mon1 * 0.73;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void utjJtu (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("USD $")&&select2.equals("JPY ¥")){
            cambio= mon1 / 0.0088;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("USD $")){
            cambio= mon1 * 0.0088;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void utwWtu (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("USD $")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.00085;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("USD $")){
            cambio= mon1 * 0.00085;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void atjJta (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("AUD A$")&&select2.equals("JPY ¥")){
            cambio= mon1 / 0.012;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("AUD A$")){
            cambio= mon1 * 0.012;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void atwWta (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("AUD A$")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.0012;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("AUD A$")){
            cambio= mon1 * 0.0012;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
    public void jtwWtj (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("JPY ¥")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.097;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("JPY ¥")){
            cambio= mon1 * 0.097;
            cambioc = df.format(cambio) + "  " +to;
            txtTo.setText(cambioc);
        }
    }
}