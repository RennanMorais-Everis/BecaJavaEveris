package BecaJavaEveris.BytebankHerdadoConta.testes;

import BecaJavaEveris.BytebankHerdadoConta.modelo.*;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        ContaCorrente cc = new ContaCorrente();
        guardador.adiciona(cc);

        ContaPoupanca cp = new ContaPoupanca();
        guardador.adiciona(cp);

        int tamanho = guardador.getQuantidadeDeElementos();

        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        Conta ref2 = (Conta) guardador.getReferencia(1);

        System.out.println("A conta da posição 0 é: " + ref.getConta());
        System.out.println("A conta da posição 1 é: " + ref2.getConta());

    }

}
