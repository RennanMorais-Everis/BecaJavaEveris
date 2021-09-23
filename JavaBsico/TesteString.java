package BecaJavaEveris.JavaBsico;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";
        System.out.println(nome);

        //Laço para imprimir ALURA em sequencia
        for(int i=0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        //Contando quantos caracteres tem
        System.out.println(nome.length());

        String sub = nome.substring(1);
        System.out.println(sub);

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        char c = nome.charAt(0);
        System.out.println(c);

//        String outro = nome.replace("A", "a");
//        System.out.println(outro);

    }

}
