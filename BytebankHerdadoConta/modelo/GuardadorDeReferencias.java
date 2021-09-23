package BecaJavaEveris.BytebankHerdadoConta.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
    }

    public void adiciona(Object c) {
        this.referencias[posicaoLivre] = c;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return referencias[pos];
    }
}

