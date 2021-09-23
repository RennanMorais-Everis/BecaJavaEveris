package BecaJavaEveris.BytebankComposto;

public class TestaBanco {
    
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("Programador");

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.setTitular(paulo);
        
        System.out.println("Agencia: " + contaDoPaulo.getAgencia());
        System.out.println("Conta: " + contaDoPaulo.getConta());
        System.out.println(contaDoPaulo.getTitular());

        Conta conta2 = new Conta();
        
        System.out.println("Agencia: " + conta2.getAgencia());
        System.out.println("Conta: " + conta2.getConta());
        System.out.println(conta2.getTitular());

        Conta conta3 = new Conta();
        
        System.out.println("Agencia: " + conta3.getAgencia());
        System.out.println("Conta: " + conta3.getConta());
        System.out.println(conta3.getTitular());

    }

}
