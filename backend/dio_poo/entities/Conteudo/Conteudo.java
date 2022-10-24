package dio_poo.entities.Conteudo;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    protected final String titulo;
    protected final String descricao;

    protected Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
