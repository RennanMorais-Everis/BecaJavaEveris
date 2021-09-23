package BecaJavaEveris.BytebankHerdadoConta.testes;

import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaPoupanca;

public class TestaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca();
        cp.deposita(200);

        System.out.println("O saldo da CC é: " + cc.getSaldo());
        System.out.println("O saldo da CP é: " + cp.getSaldo());

        cc.transfere(10, cp);

        System.out.println("Realizando transferencia...");
        System.out.println("O saldo da CC é: " + cc.getSaldo());
        System.out.println("O saldo da CP é: " + cp.getSaldo());

        cc.saque(10);

        System.out.println("Realizando saque...");
        System.out.println("O saldo da CC é: " + cc.getSaldo());
        System.out.println("O saldo da CP é: " + cp.getSaldo());
    }

}
