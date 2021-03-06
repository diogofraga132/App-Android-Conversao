package com.example.diogo.conversao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button converterMedidas;
    TextView resultEmKM;
    TextView resultEmPES;
    EditText etValorParaConverter;
    ConversaoDeMedidas conversaoDeMedidas = new ConversaoDeMedidas();


    TextView resultEmReais;
    TextView resultEmEuros;
    Button btnConverterMoedas;
    EditText etValorDollarParaConverter;
    ConversaoDeMoedas conversaoDeMoedas = new ConversaoDeMoedas();

    TextView resultTangente;
    EditText angulo;
    Button btnCalcularTangente;
    CalcularTangente calcularTangente = new CalcularTangente();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        converterMedidas= (Button) findViewById(R.id.btnConverter);
        resultEmKM=(TextView) findViewById(R.id.resultKM);
        resultEmPES=(TextView) findViewById(R.id.resultPES);
        etValorParaConverter= (EditText) findViewById(R.id.etValorParaConverter);

        converterMedidas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                if(etValorParaConverter.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Campo vazio !", Toast.LENGTH_SHORT).show();
                }else{
                    double valorConverter = Double.parseDouble(etValorParaConverter.getText().toString());
                    double resultado =conversaoDeMedidas.converterParaKm(valorConverter);
                    resultEmKM.setText("KM: ".concat(String.valueOf(resultado)));
                    resultado=conversaoDeMedidas.converterParaPes(valorConverter);
                    resultEmPES.setText("Pés: ".concat(String.valueOf(resultado)));
                }
            }
        });


        btnConverterMoedas=(Button) findViewById(R.id.btnConverterMoedas);
        resultEmReais=(TextView) findViewById(R.id.tvReais);
        resultEmEuros=(TextView) findViewById(R.id.tvEuros);
        etValorDollarParaConverter=(EditText) findViewById(R.id.etValorDollarParaConverter);

        btnConverterMoedas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(etValorDollarParaConverter.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Campo vazio !", Toast.LENGTH_SHORT).show();
                }else{
                    double valorConverter = Double.parseDouble(etValorDollarParaConverter.getText().toString());
                    double resultado =conversaoDeMoedas.converterParaReais(valorConverter);
                    resultEmReais.setText("Reais: ".concat(String.valueOf(resultado)));
                    resultado=conversaoDeMoedas.converterParaEuros(valorConverter);
                    resultEmEuros.setText("Euros: ".concat(String.valueOf(resultado)));
                }
            }
        });


        btnCalcularTangente=(Button) findViewById(R.id.btnCalcularTangente);
        resultTangente=(TextView) findViewById(R.id.tvTangente);
        angulo=(EditText) findViewById(R.id.etAngulo);


        btnCalcularTangente.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(angulo.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Campo vazio !", Toast.LENGTH_SHORT).show();
                }else{
                    double anguloCalcular = Double.parseDouble(angulo.getText().toString());
                    double resultado = calcularTangente.calcular(anguloCalcular);
                    resultTangente.setText("Tangente: ".concat(String.valueOf(resultado)));
                }
            }
        });
    }
}
