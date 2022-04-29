package com.testpro;

public class Principal {
    public static void main(String[] args) {

        Canino canino =new Canino();
        Gato gato= new Gato();

        DormirAnimal(gato);
        DormirAnimal(canino);
    }
   public static void DormirAnimal(Animal a){
        a.mimir();
    }
}
