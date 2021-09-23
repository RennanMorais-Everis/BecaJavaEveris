package BecaJavaEveris.BytebankHerdadoConta.testes;

import BecaJavaEveris.BytebankHerdadoConta.modelo.CalculadorDeImposto;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaPoupanca;
import BecaJavaEveris.BytebankHerdadoConta.modelo.SeguroDeVida;

public class TestaTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca();
        cp.deposita(200);

        SeguroDeVida sv = new SeguroDeVida();
        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(sv);
        calc.registra(cc);

        System.out.println("O valor de tributação da CC é: " + calc.getTotalImposto());
    }

}
