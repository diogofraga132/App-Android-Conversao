package com.example.diogo.conversao;

import java.util.Locale;

/**
 * Created by Diogo on 23/11/2017.
 */

public class ConversaoDeMedidas {
    double resultadoEmKm;
    double resultadoEmPes;

    public double converterParaKm(double valorParaConverter){
        resultadoEmKm= valorParaConverter/0.62137;
        resultadoEmKm= Double.valueOf(String.format(Locale.US, "%.2f", resultadoEmKm));
        return resultadoEmKm;
    }
    public double converterParaPes(double valorParaConverter){
         resultadoEmPes=valorParaConverter* 5280.0;
        resultadoEmPes= Double.valueOf(String.format(Locale.US, "%.2f", resultadoEmPes));
        return resultadoEmPes;
    }

}
