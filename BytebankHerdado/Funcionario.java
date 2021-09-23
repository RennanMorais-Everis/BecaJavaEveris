package BecaJavaEveris.BytebankHerdado;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        System.out.println("Executando metodo de bonificação para funcionários...");
        return this.salario * 0.1;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
