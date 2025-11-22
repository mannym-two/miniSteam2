package telas;

import entidades.Jogo;
import javax.swing.*;
import java.awt.*;

public class TelaDetalhesJogo extends JFrame {
    
    public TelaDetalhesJogo(Jogo jogo) {
        
        setTitle("Detalhes do Jogo");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JTextArea txtInfo = new JTextArea();
        txtInfo.setEditable(false);
        txtInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        
        txtInfo.setText(
                "Nome: " + jogo.getNome() + "\n\n" +
                "Gênero: " + jogo.getGenero() + "\n\n" +
                "Descrição:\n" + jogo.getDescricao() + "\n\n" +
                "Preço: R$ " + String.format("%.2f", jogo.getPreco())
        );
        
        JScrollPane scroll = new JScrollPane(txtInfo);
        
        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> dispose());
        
        JPanel painelBotao = new JPanel();
        painelBotao.add(btnFechar);
        painel.add(scroll, BorderLayout.CENTER);
        painel.add(painelBotao, BorderLayout.SOUTH);
        
        add(painel);
        setVisible(true);
    }
}
