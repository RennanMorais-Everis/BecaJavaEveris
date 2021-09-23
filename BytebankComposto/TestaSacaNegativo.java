package BecaJavaEveris.BytebankComposto;

public class TestaSacaNegativo {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();

        conta.deposita(100);
        conta.setAgencia(1432);
        conta.setConta(1005065);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getConta());

    }

}
