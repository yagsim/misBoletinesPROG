/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin27;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Distribuccion{
    JFrame marco;
    JPanel panel;
    JLabel etiqueta,etiqueta2;
    JButton boton1,boton2;
    JTextField liñaTexto,liñaTexto1;
    JPasswordField liñaTexto2;
    JPanel panel2;
    JButton boton3;
    JTextField el2;
    JList lista;
    

    
     public void compoñentes(){
         
   
    
        marco=new JFrame();
        panel=new JPanel();
        etiqueta=new JLabel("NOME");
        etiqueta2=new JLabel("PASSWORD");
        boton1=new JButton("PREMER");
        boton2=new JButton("LIMPAR");
        liñaTexto=new JTextField();
        liñaTexto1=new JTextField();
        liñaTexto2=new JPasswordField();
        
       
        
        marco.setSize(1000,1000);
        marco.setBackground(Color.white);
        
        panel.setBounds(0,0,10000,500);
        panel.setLayout(null);
        
     
        
        
        etiqueta.setLocation(70, 75);
        etiqueta.setSize(50,50);
        
        etiqueta2.setSize(70,50);
        etiqueta2.setLocation(70,150);
        
        liñaTexto.setBounds(70, 250, 400, 170);
        liñaTexto.setText("AREA TEXTO.");
        
        
        liñaTexto1.setBounds(200, 75, 300, 50);
       
        
        liñaTexto2.setBounds(200, 150, 300, 50);
        
        
        
        
        boton1.setSize(100, 50);
        boton1.setLocation(150,450);
        
        
        boton2.setText("LIMPAR");
        boton2.setLocation(300, 450);
        boton2.setToolTipText("limpa o texto");
        boton2.setSize(100,50);
       
        
        //engadimos compoñentes o panel e o panel o marco
        panel.add(etiqueta);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(liñaTexto1);
        panel.add(liñaTexto);
        panel.add(etiqueta2);
        panel.add(liñaTexto2);
        
        marco.add(panel);
        
      
        panel2=new JPanel();
        el2=new JTextField();
        boton3=new JButton("BOTON");
        
        
        panel2.setLayout(null);
        panel2.setSize(500,500);
        
        
       
        
         lista = new JList();
        DefaultListModel modelo=new DefaultListModel();
        modelo.addElement("Elemento lista 1");
        modelo.addElement("Elemento lista 2");
        modelo.addElement("Elemento lista 3");
        lista.setModel(modelo);
        lista.setBounds(20,550,150,150);
        
        
        boton3.setBounds(220,600,100,50);
        
        
        el2.setBounds(370, 570, 150, 125);
        el2.setText("Area de texto.");
        
        
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(el2);
        
        marco.add(panel2);
        
        
        marco.setLocationRelativeTo(marco);   
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        marco.setVisible(true);
     
        
        
        
    }
        
    
}
