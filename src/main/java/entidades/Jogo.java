package entidades;

public class Jogo {
    private String nome;
    private String genero;
    private String descricao;
    private double preco;
    
    public Jogo(String nome, String genero, double preco) {
        this(nome, genero, "", preco);
    }
    
    public Jogo(String nome, String genero, String descricao, double preco){
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    
    @Override
    public String toString() {
        return nome + " (" + genero + ") - R$ " + String.format("%.2f", preco);
    }
    
}
