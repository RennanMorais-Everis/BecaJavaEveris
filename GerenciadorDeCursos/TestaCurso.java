package BecaJavaEveris.GerenciadorDeCursos;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleçoes do java", "Rennan Morais");

        final List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));

        System.out.println(javaColecoes.getAulas());

    }

}
