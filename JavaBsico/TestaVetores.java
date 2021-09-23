package BecaJavaEveris.JavaBsico;

import java.util.Arrays;

public class TestaVetores {
    
    public static void main(String[] args) {
        
        //Vetores
        int numeros[] = {5, 6, 7, 1, 4, 0, 7, 5};

        for(int i=0; i <= numeros.length - 1 ; i++) {
            System.out.print(numeros[i]);
        }

        //Vetor de mes
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String dias[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        
        for(int i=0; i < mes.length; i++) {

            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias");

        }

        int num[] = {3, 5, 1, 8, 4};

        Arrays.sort(num);

        for (int valor: num) {
            System.out.println("Teste Foreach: " + valor);
        }

        int num2[] = {3, 5, 1, 8, 4};

        int pos = Arrays.binarySearch(num2, 1);

        System.out.println("Encontrei o valor na posição: " + pos);


        int num3[] = new int[20];
        Arrays.fill(num2, 0);

        for(int val:num3) {
            System.out.println(val);
        }

    }

}
