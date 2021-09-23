package BecaJavaEveris;

import java.util.Random;

public class TesteArray {

    public static void main(String[] args) {

        int[] idades = new int[5];
        Random numRand = new Random();

        for(int i=0; i < idades.length; i++) {
            idades[i] = numRand.nextInt(100);
            System.out.println(idades[i]);
        }

    }

}
