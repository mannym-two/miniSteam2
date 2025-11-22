package telas;

import javax.swing.*;
import java.awt.*;
import sistema.ControleLoja;
import entidades.Jogo;
import entidades.Usuario;
import ui.MessageFrame;

public class TelaLoja extends JFrame {
    private ControleLoja loja = new ControleLoja();
    private Usuario usuario;
    
    public TelaLoja(Usuario usuario) {
        this.usuario = usuario;
        
        setTitle("MiniSteam - Loja - Usuário: " + usuario.getNome());
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        DefaultListModel<Jogo> model = new DefaultListModel<>();
        for (Jogo j : loja.getJogos()) model.addElement(j);
        
        JList<Jogo> lista = new JList<>(model);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(lista);
        
        JButton comprar = new JButton("Comprar");
        JButton verBiblioteca = new JButton("Minha Biblioteca");
        JButton detalhes = new JButton("Detalhes");
        
        comprar.addActionListener(e -> {
            Jogo j = lista.getSelectedValue();
            if (j == null) {
                new MessageFrame("Aviso","Selecione um jogo para comprar").setVisible(true);
                return;
            }
            usuario.adicionarJogo(j);
            new MessageFrame("Sucesso","Jogo comprado: " + j.getNome()).setVisible(true);
        });
        
        detalhes.addActionListener(e -> {
            Jogo j = lista.getSelectedValue();
            if (j == null) {
                new MessageFrame("Aviso","Selecione um jogo para ver detalhes").setVisible(true);
                return;
            }
            new TelaDetalhesJogo(j);
        });
        
        verBiblioteca.addActionListener(e -> {
            TelaBiblioteca b = new TelaBiblioteca(usuario);
            b.setVisible(true);
        });
        
        JPanel botoes = new JPanel();
        botoes.add(comprar);
        botoes.add(verBiblioteca);
        botoes.add(detalhes);
        
        add(new JLabel("Disponível na loja:"), BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(botoes, BorderLayout.SOUTH);  
    }
    
    
    
}
