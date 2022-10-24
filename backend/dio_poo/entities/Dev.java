package dio_poo.entities;

import dio_poo.entities.Conteudo.Conteudo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private final String nome;
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        conteudosInscritos.stream().findFirst().ifPresentOrElse(e -> {
            conteudosConcluidos.add(e);
            conteudosInscritos.remove(e);
        }, () -> System.out.println("Você não está matriculado"));
    }

    public double calcularTotalXP() {
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
