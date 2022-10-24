package dio_poo.entities.Conteudo;

public class Curso extends Conteudo{
    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
