package com.divisascomp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner listDiv, listDiv2;
    TextView txtFrom, txtTo;
    EditText edt1From;
    double mon1;
    double cambio;
    String cambioc;
    String select, select2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listDiv =  (Spinner) findViewById(R.id.lisDiv);
        listDiv2 =  (Spinner) findViewById(R.id.lisDiv2);
        txtFrom = (TextView) findViewById(R.id.txtFrom);
        txtTo = (TextView) findViewById(R.id.txtTo);
        edt1From = (EditText) findViewById(R.id.edtFrom);
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


    public void convertBtn(View view){
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
    public void ctuUtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("USD $")){
            cambio= mon1 / 3900;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("USD $")&&select2.equals("COP $")){
            cambio= mon1 * 3900;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void ctaAtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("AUD A$")){
            cambio= mon1 / 2847.08;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("AUD A$")&&select2.equals("COP $")){
            cambio= mon1 * 2847.08;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void ctyYtc (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("JPY ¥")){
            cambio= mon1 / 34.09;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("COP $")){
            cambio= mon1 * 34.09;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void ctwWtc(){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("COP $")&&select2.equals("KRW ₩")){
            cambio = mon1 / 3;
            cambioc = String.valueOf(cambio);
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
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("AUD A$")&&select2.equals("USD $")){
            cambio= mon1 * 0.73;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void utjJtu (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("USD $")&&select2.equals("JPY ¥")){
            cambio= mon1 / 0.0088;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("USD $")){
            cambio= mon1 * 0.0088;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void utwWtu (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("USD $")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.00085;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("USD $")){
            cambio= mon1 * 0.00085;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void atjJta (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("AUD A$")&&select2.equals("JPY ¥")){
            cambio= mon1 / 0.012;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("JPY ¥")&&select2.equals("AUD A$")){
            cambio= mon1 * 0.012;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void atwWta (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("AUD A$")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.0012;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("AUD A$")){
            cambio= mon1 * 0.0012;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
    public void jtwWtj (){
        mon1 = Integer.parseInt(edt1From.getText().toString());
        select = listDiv.getSelectedItem().toString();
        select2 = listDiv2.getSelectedItem().toString();
        if(select.equals("JPY ¥")&&select2.equals("KRW ₩")){
            cambio= mon1 / 0.097;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }else if (select.equals("KRW ₩")&&select2.equals("JPY ¥")){
            cambio= mon1 * 0.097;
            cambioc = String.valueOf(cambio);
            txtTo.setText(cambioc);
        }
    }
}