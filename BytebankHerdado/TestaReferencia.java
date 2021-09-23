package BecaJavaEveris.BytebankHerdado;

public class TestaReferencia {

    public static void main(String[] args) {

        //Cria um gerente
        Gerente g1 = new Gerente();
        g1.setNome("Rennan");
        g1.setSalario(5000.0);

        //Cria um funcionario
        Funcionario f1 = new Funcionario();
        f1.setNome("Chamir");
        f1.setSalario(1500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        System.out.println(controle.getSoma());

        ControleBonificacao controle2 = new ControleBonificacao();
        controle2.registra(f1);
        System.out.println(controle2.getSoma());

    }

}
