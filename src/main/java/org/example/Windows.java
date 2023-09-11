package org.example;

import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame {
public Windows(){
    this.setSize(700,700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    this.setResizable(false);
    this.setTitle("Ball Blast");
    this.setLocationRelativeTo(null);
    this.add(new Panel());
    this.setVisible(true);
}
}
