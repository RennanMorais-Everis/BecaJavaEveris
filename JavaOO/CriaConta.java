package BecaJavaEveris.JavaOO;

public class CriaConta {
    
    public static void main(String[] args) {
        
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 7472;
        primeiraConta.conta = 107262;
        primeiraConta.titular = "Rennan Silva de Morais";
        
        System.out.println("Dados da conta");
        System.out.println("Agência: " + primeiraConta.agencia);
        System.out.println("Conta: " + primeiraConta.conta);
        System.out.println("Títular: " + primeiraConta.titular);
        System.err.println("Saldo: " + primeiraConta.saldo);

        System.out.println();
        System.out.println("Dados da segunda conta");
        System.out.println();

        Conta segundaConta = new Conta();
        segundaConta.saldo = 100.50;
        segundaConta.agencia = 1432;
        segundaConta.conta = 1005065;
        segundaConta.titular = "Chamir dos Santos Melo";

        System.out.println("Dados da conta");
        System.out.println("Agência: " + segundaConta.agencia);
        System.out.println("Conta: " + segundaConta.conta);
        System.out.println("Títular: " + segundaConta.titular);
        System.err.println("Saldo: " + segundaConta.saldo);

    }

}
