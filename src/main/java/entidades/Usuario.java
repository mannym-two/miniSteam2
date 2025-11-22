package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String senha;
    private List<Jogo> biblioteca = new ArrayList<>();
    
    public Usuario (String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome() { return nome;
    
    }
    public String getSenha() { return senha;
    
    }
    
    public void adicionarJogo(Jogo j) { biblioteca.add(j);
    }
    public List<Jogo> getBiblioteca() {return biblioteca;
    }
}
