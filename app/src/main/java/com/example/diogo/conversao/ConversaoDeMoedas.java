package com.example.diogo.conversao;

import java.util.Locale;

/**
 * Created by Diogo on 23/11/2017.
 */

public class ConversaoDeMoedas {
    double resultadoEmReais;
    double resultadoEmEuros;

    public double converterParaReais(double valorParaConverter){
        resultadoEmReais= valorParaConverter*3.22466;
        resultadoEmReais= Double.valueOf(String.format(Locale.US, "%.2f", resultadoEmReais));
        return resultadoEmReais;
    }
    public double converterParaEuros(double valorParaConverter){
        resultadoEmEuros=valorParaConverter* 0.843846251;
        resultadoEmEuros= Double.valueOf(String.format(Locale.US, "%.2f", resultadoEmEuros));
        return resultadoEmEuros;
    }
}
