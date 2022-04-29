package com.testpro;

public class Felino extends Animal{

    protected String nombre= "Felino";
    @Override
    public void mimir() {
        System.out.println("El "+nombre+" esta durmiendo");
    }
}
