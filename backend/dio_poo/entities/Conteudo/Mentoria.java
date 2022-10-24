package dio_poo.entities.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
