package BecaJavaEveris.BytebankHerdadoConta.testes;

import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;

public class TestaArrayComObjetos {

    public static void main(String[] args) {

        //int[] idades = new int[5];
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente();

        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente();

        contas[1] = cc2;

        System.out.println(contas[1].getConta());

    }

}
