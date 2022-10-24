package dio_poo.entities;

import dio_poo.entities.Conteudo.Conteudo;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private final String nome;
    private final String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final Set<Dev> devsInscritos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFinal, conteudos, devsInscritos);
    }
}
