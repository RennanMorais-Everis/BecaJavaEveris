package BecaJavaEveris.JavaOO;

public class TestaMetodo {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.saldo = 100;

        System.out.println("O saldo é: " + conta.saldo);

        double valor = 400;
        conta.deposita(valor);

        System.out.println("O novo saldo é: " + conta.saldo);

        double valorSaque = 501;

        System.out.println("Sacando...");

        if(conta.saque(valorSaque)) {
            System.out.println("Saque efetuado com sucesso! Saldo atual:  " + conta.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

        Conta conta2 = new Conta();

        if(conta.transfere(100, conta2)) {
            System.out.println("Tranferencia realizada com sucesso! - Saldo Conta: " + conta2.saldo + " Saldo Conta2: " + conta.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

}
