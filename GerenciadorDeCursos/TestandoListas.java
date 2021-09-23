package BecaJavaEveris.GerenciadorDeCursos;

import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

        System.out.println("Ordenando as aulas");

        int ordem = 0;

        for(int i=0; i < aulas.size(); i++) {
            ordem++;
            System.out.println("Aula " + ordem + ": " + aulas.get(i));
        }

    }

}
