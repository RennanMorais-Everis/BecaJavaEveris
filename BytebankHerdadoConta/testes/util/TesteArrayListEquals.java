package BecaJavaEveris.BytebankHerdadoConta.testes.util;

import BecaJavaEveris.BytebankHerdadoConta.modelo.Conta;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaPoupanca;
import java.util.List;
import java.util.Vector;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        //Generics
        List<Conta> lista = new Vector<Conta>();

        ContaCorrente cc = new ContaCorrente();
        lista.add(cc);

        ContaPoupanca cp = new ContaPoupanca();
        lista.add(cp);

        for(Object o: lista) {
            System.out.println(o);
        }
    }
}
