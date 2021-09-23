package BecaJavaEveris.BytebankHerdado;

public class Gerente extends Funcionario implements Autenticavel {
    
    private int senha;

    public double getBonificacao() {
        System.out.println("Executando metodo de bonificação para gerentes...");
        return super.getBonificacao() + super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autrentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}