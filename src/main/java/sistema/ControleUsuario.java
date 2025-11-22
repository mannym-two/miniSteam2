package sistema;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ControleUsuario {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public ControleUsuario() {
        usuarios.add(new Usuario("admin", "123"));
    }
    
    public void cadastrar(String nome, String senha) {
        usuarios.add(new Usuario(nome, senha));
    }
    
    public Usuario login(String nome, String senha) {
         for (Usuario u : usuarios) {
             if (u.getNome().equals(nome) && u.getSenha().equals(senha)) {
                 return u;
             }
         }
         return null;
    }
}
