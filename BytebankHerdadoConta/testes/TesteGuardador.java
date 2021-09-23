package BecaJavaEveris.BytebankHerdadoConta.testes;

import BecaJavaEveris.BytebankHerdadoConta.modelo.Conta;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;
import BecaJavaEveris.BytebankHerdadoConta.modelo.GuardadorDeContas;

public class TesteGuardador {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente();
        guardador.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente();
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();

        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);

        System.out.println("A conta da posição 0 é: " + ref.getConta());

    }

}
