/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import javax.swing.*;
import java.awt.*;
import sistema.ControleUsuario;
import ui.MessageFrame;
/**
 *
 * @author Administrator
 */
public class CadastreDialog extends JDialog {
    public CadastreDialog(JFrame parent, ControleUsuario controle) {
        super(parent, "Cadastrar usuário", true);
        setSize(320,180);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());
        JPanel campos = new JPanel(new GridLayout(2,2,5,5));
        campos.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JTextField nome = new JTextField();
        JPasswordField senha = new JPasswordField();
        campos.add(new JLabel("Usuário:"));
        campos.add(nome);
        campos.add(new JLabel("Senha:"));
        campos.add(senha);
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(e -> {
            String u = nome.getText().trim();
            String s = new String(senha.getPassword()).trim();
            if (u.isEmpty() || s.isEmpty()) {
                new MessageFrame("Erro","Preencha todos os campos").setVisible(true);
                return;
            }
            controle.cadastrar(u, s);
            new MessageFrame("Sucesso","Usuário cadastrado com sucesso").setVisible(true);
            dispose();
        });
        JPanel p = new JPanel();
        p.add(btnOk);

        add(campos, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
    }
}
