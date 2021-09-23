package BecaJavaEveris;

public class TestaCondicionais2 {
    
    public static void main(String[] args) {
        
        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("Valor de acompanhado: " + acompanhado);

        if(idade >= 18 && acompanhado) {
            System.out.println("Seja bem-vindo");
        } else {
            System.out.println("Infelizmente voce nao pode entrar!");
        }

    }

}
