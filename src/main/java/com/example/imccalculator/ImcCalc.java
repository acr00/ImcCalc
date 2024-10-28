package com.example.imccalculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImcCalc {
    public String  calculaImc(int weight, double height) {
        double imc = weight / Math.pow(height, 2);
        if (imc < 16) {
            return  "Delgadez Severa";
        }else if(imc >= 16  && imc < 17){
            return "Delgadez Moderada";
        }else if(imc >=17  && imc < 18.5){
            return "Delgadez Leve";
        }else if(imc >= 18.5  && imc < 25){
            return  "Peso Normal";
        }else if(imc  >= 25  && imc < 30){
            return "Sobrepeso";
        }else if(imc >= 30  && imc < 35){
            return  "Obesidad leve";
        }else if(imc >=  35  && imc < 40){
            return "Obesidad Moderada";
        }else if(imc >= 40){
            return "Obesidad Morbida";
        }
        return null;
    }
}
