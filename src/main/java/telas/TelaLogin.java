package telas;

import javax.swing.*;
import java.awt.*;
import sistema.ControleUsuario;
import entidades.Usuario;
import ui.MessageFrame;

public class TelaLogin extends JFrame {
    private JTextField campoUsuario = new JTextField(15);
    private JPasswordField campoSenha = new JPasswordField(15);
    private ControleUsuario controle = new ControleUsuario();
    
    public TelaLogin() {
        setTitle("MiniSteam - Login");
        setSize(360, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel campos = new JPanel(new GridLayout(2,2,5,5));
        campos.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        campos.add(new JLabel("Usuário:"));
        campos.add(campoUsuario);
        campos.add(new JLabel("Senha:"));
        campos.add(campoSenha);
        
        JPanel botoes = new JPanel();
        JButton btnEntrar = new JButton("Entrar");
        JButton btnCadastrar = new JButton("Cadastrar");
        
        btnEntrar.addActionListener(e -> {
            String u = campoUsuario.getText().trim();
            String s = new String(campoSenha.getPassword()).trim();
            
            if (u.isEmpty() || s.isEmpty()) {
                new MessageFrame("Erro","Preencha usuário e senha").setVisible(true);
                return;
            }
            
            Usuario user = controle.login(u, s);
            if (user != null) {
                TelaLoja loja = new TelaLoja (user);
                loja.setVisible(true);
                dispose();
            } 
            else {
                new MessageFrame("Erro","Usuário ou senha incorretos").setVisible(true);
            }
        });
        
        btnCadastrar.addActionListener(e -> {
            CadastreDialog dialog = new CadastreDialog(this, controle);
            dialog.setVisible(true);
        });
        
        botoes.add(btnEntrar);
        botoes.add(btnCadastrar);

        add(campos, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);
    }
}
