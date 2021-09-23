package BecaJavaEveris.BytebankHerdadoConta.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public  ContaCorrente() {
        super();
    }

    @Override
    public boolean saque(double valor) {
        double valorASacar = valor + 0.2;
        return super.saque(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
