package com.enterprise.version1.ejemplosensorproximidadyherenciajava.herencia;

import com.enterprise.version1.ejemplosensorproximidadyherenciajava.clases.Valores;

public class Grados extends Valores {

    public double calcularCentigradosAFarenheit(){
        return ((this.getGrados() * 9/5) + 32);
    }

    public double calcularCentigradosAKelvin(){
        return (this.getGrados() + 273.15);
    }

}
