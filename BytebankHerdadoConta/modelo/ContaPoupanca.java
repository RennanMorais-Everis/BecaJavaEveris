package BecaJavaEveris.BytebankHerdadoConta.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
