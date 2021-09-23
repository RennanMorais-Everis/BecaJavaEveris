package BecaJavaEveris;

public class TestaCondicionais {
    
    public static void main(String[] args) {
        
        int idade = 17;
        int responsaveis = 0;

        if(idade >= 18) {
            System.out.println("É maior ou tem 18 anos!");
        } else {

            System.out.println("É Menor de idade!");

            if(idade < 18 && responsaveis > 0) {
                System.out.println("Você é menor mas esta acompanhado");
            } else {
                System.out.println("Você é menor e nao esta acompanhado por um resposavel");
            }

        }

    }

}
