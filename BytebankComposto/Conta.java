package BecaJavaEveris.BytebankComposto;

import java.util.Random;

public class Conta {
    
    private double saldo;
    private int agencia;
    private int conta;
    private Cliente titular;
    private static int total;

    public Conta() {
        Conta.total++;
        Random randAgencia = new Random();
        Random randConta = new Random();
        
        System.out.println("Criando conta...");
        
        this.agencia = randAgencia.nextInt(9999);
        this.conta = randConta.nextInt(9999999);

        System.out.println("O total de contas é: " + Conta.total);
    }

    public void deposita(double valor) {

        this.saldo = this.saldo + valor;

    }

    public boolean saque(double valor) {

        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;

    }

    public boolean transfere(double valor, Conta conta) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            conta.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
