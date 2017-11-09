/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author LP 13
 */
public class Interfaz extends JFrame{
  JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JButton boton2;
      public Interfaz() 
    {
        
    panel = new JPanel();
    label = new JLabel();
    text = new JTextField(20);
    boton = new JButton();
     boton2 = new JButton(); 
this.add(panel);
    panel.add(label);
    panel.add(text);
   panel.add(boton2);
    
    label.setText("Atributo");
    boton.setText("Conectar");
    boton2.setText("Desconectar");
    //panel.setBackground(Color.LIGHT_GRAY);
    }
}
