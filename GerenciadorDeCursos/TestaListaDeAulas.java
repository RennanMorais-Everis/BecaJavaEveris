package BecaJavaEveris.GerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

    public static void main(String[] args) {

        Aula aula1 = new Aula("Revisando os ArrayList", 21);
        Aula aula2 = new Aula("Lista de objetos", 20);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas.toString());

        aulas.forEach(aula -> {
            System.out.println("Título da aula: " + aula.getTitulo() + " Duração: " + aula.getTempo() + " minutos");
        });

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }

}
