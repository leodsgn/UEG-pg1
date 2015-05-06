package com.ueg.semestre1.lista1.ex11;

import com.ueg.semestre1.lista1.ex1.Pessoa;

/**
 * Created by root on 5/6/2015.
 */
public class Paciente extends Pessoa {

    public Paciente(double peso, double altura, String name) {
        super(peso, altura, name);
    }

    public String calculaFaixaPeso(){
        double imc = super.getImc();
        if (imc < 20) return "peso ideal abaixo.";
        if (imc >= 20 || imc <=25) return "peso normal.";
        if (imc > 25 || imc <= 30) return "excesso de peso.";
        if (imc > 30 || imc <= 35) return "obesidade";
        if (imc > 35) return "obesidade mórbida.";
        return "";
    }
}
