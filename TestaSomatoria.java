package BecaJavaEveris;

public class TestaSomatoria {

    public static void main(String[] args) {
        
        int contador = 0;
        int total = 0;

        while(contador <= 10) {
            total = total + contador;
            System.out.println(total);
            contador++;
        }

        //Procedimento de laços utilizando o For
        for(int count = 0; count <= 10; count++) {
            System.out.println(count);
        }
    }

}
