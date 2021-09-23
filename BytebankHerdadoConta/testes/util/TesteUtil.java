package BecaJavaEveris.BytebankHerdadoConta.testes.util;

import BecaJavaEveris.BytebankHerdadoConta.modelo.Conta;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaCorrente;
import BecaJavaEveris.BytebankHerdadoConta.modelo.ContaPoupanca;
import java.util.ArrayList;

public class TesteUtil {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente();
        lista.add(cc);

        ContaPoupanca cp = new ContaPoupanca();
        lista.add(cp);

        System.out.println("O tamanho do array é: " + lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getConta());

//        lista.remove(0);

        System.out.println("O tamanho do array é: " + lista.size());

        for(Object o: lista) {
            System.out.println(o);
        }

    }
}
