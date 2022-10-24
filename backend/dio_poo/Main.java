package dio_poo;

import dio_poo.entities.Bootcamp;
import dio_poo.entities.Conteudo.Curso;
import dio_poo.entities.Conteudo.Mentoria;
import dio_poo.entities.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java", "Descrição Curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição Curso JS", 4);
        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcap Java", "Descição Bootcap Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev joao = new Dev("João");
        joao.inscreverBootcamp(bootcamp);
        joao.progredir();

        System.out.println(joao.getConteudosInscritos());
        System.out.println(joao.getConteudosConcluidos());
        System.out.println(joao.calcularTotalXP());
    }
}
