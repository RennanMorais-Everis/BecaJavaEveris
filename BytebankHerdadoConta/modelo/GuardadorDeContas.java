package BecaJavaEveris.BytebankHerdadoConta.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta c) {
        this.referencias[posicaoLivre] = c;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return referencias[pos];
    }
}
