package BecaJavaEveris.BankTeste.run;

import BecaJavaEveris.BankTeste.model.Cliente;
import BecaJavaEveris.BankTeste.model.Conta;
import java.util.List;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Criando o cliente
        Cliente cliente1 = new Cliente();

        System.out.println("Criando conta...");
        System.out.println("Digite o nome do cliente:");
        String nome = sc.next();
        cliente1.setNome(nome);

        System.out.println("Digite o cpf do cliente:");
        String cpf = sc.next();
        cliente1.setCpf(cpf);

        System.out.println("Digite a profissão do cliente:");
        String prof = sc.next();
        cliente1.setProfissao(prof);

        //Criando a conta
        Conta conta1 = new Conta();

        System.out.println("Informe a agencia:");
        int ag = sc.nextInt();
        conta1.setAgencia(ag);

        System.out.println("Informe a numero da conta:");
        int c = sc.nextInt();
        conta1.setConta(c);

        System.out.println("Informe a saldo inicial da conta:");
        double saldo = sc.nextDouble();
        conta1.setSaldo(saldo);

        //Vinculando a conta criada com o cliente
        cliente1.setContas(conta1);

        //Saída da criação do cliente e conta mostrando todos os dados vinculados.
        System.out.println("Conta criada!");
        System.out.println("Titular: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Profissao: " + cliente1.getProfissao());
        System.out.println("Agencia: " + cliente1.getContas().get(0).getAgencia());
        System.out.println("Conta: " + cliente1.getContas().get(0).getConta());
        System.out.println("Saldo Inicial: R$" + cliente1.getContas().get(0).getSaldo());
    }

}
