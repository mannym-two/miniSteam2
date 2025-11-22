package ui;

import javax.swing.*;
import java.awt.*;

public class MessageFrame extends JFrame {
    public MessageFrame(String title, String message){
        setTitle(title);
        setSize(300, 120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel lbl = new JLabel("<html><body style='width:250px;'>" + message + "</body></html>");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl, BorderLayout.CENTER);
        
        JButton ok = new JButton("OK");
        ok.addActionListener(e -> dispose());
        JPanel p = new JPanel();
        p.add(ok);
        
        add(p, BorderLayout.SOUTH);
        
    }
}