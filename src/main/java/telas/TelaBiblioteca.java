package telas;

import javax.swing.*;
import java.awt.*;
import entidades.Usuario;
import entidades.Jogo;

public class TelaBiblioteca extends JFrame {
    public TelaBiblioteca (Usuario usuario) {
        setTitle("MiniSteam - Biblioteca - " + usuario.getNome());
        setSize(360, 260);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        DefaultListModel<Jogo> model = new DefaultListModel<>();
        for (Jogo j : usuario.getBiblioteca()) model.addElement(j);
        JList<Jogo> lista = new JList<>(model);
        JScrollPane scroll = new JScrollPane(lista);
        JButton detalhes = new JButton("Detalhes");
        detalhes.addActionListener(e -> {
            Jogo j = lista.getSelectedValue();
            if (j == null) {
                JOptionPane.showMessageDialog(this, "Selecione um jogo para ver detalhes.");
                return;
            }
            new TelaDetalhesJogo(j);
        });
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(detalhes);
        add(scroll, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }
    
}
