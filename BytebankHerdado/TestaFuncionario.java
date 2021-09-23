package BecaJavaEveris.BytebankHerdado;

public class TestaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Funcionario");
        f1.setCpf("222.222.222-22");
        f1.setSalario(3000.50);

        System.out.println(f1.getNome());;
        System.out.println(f1.getBonificacao());

        Gerente g1 = new Gerente();
        g1.setNome("Gerente");
        g1.setCpf("111.111.111-11");
        g1.setSalario(5000);
        g1.setSenha(1111);

        //boolean autenticou = g1.autentica(1111);

        System.out.println(g1.getNome());;
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());
        //System.out.println(autenticou);

    }

}
