package com.example.diogo.conversao;

import java.util.Locale;

/**
 * Created by Diogo on 24/11/2017.
 */

public class CalcularTangente {
    double resultado;

    public double calcular(double angulo){
        angulo = Math.toRadians(angulo);
        resultado = Math.tan(angulo);
        resultado=Double.valueOf(String.format(Locale.US, "%.2f", resultado));
        return resultado;
    }
}
