package com.example.itsme.uts_geometricalculator;

import android.preference.TwoStatePreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inp1, inp2;
    private Button btnHitung;
    private TextView hasil,kel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        inp1 = (EditText) findViewById(R.id.inp1);
        inp2 = (EditText) findViewById(R.id.inp2);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        kel = (TextView) findViewById(R.id.kel);
        Spinner spNamen;
        spNamen = (Spinner) findViewById(R.id.spn);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String panjang = inp1.getText().toString().trim();
                String lebar = inp2.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                setContentView(R.layout.activity_main);

                double luas = p * l;
                double keliling = p*2+l*2;


                hasil.setText("Luas : " + luas);
                kel.setText("Keliling : " + keliling);
            }
        });
    }
}
