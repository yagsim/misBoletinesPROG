
package boletin26;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;


public class Distribuccion implements ActionListener {
     JFrame marco;
    JPanel panel;
    JLabel etiqueta,etiqueta2;
    JButton boton1,boton2;
    JTextField liñaTexto,liñaTexto1;
    JPasswordField liñaTexto2;
    
    public void etiquetas(){
         marco=new JFrame();
        panel=new JPanel();
        etiqueta=new JLabel("NOME");
        etiqueta2=new JLabel("PASSWORD");
        boton1=new JButton("PREMER");
        boton2=new JButton("LIMPAR");
        liñaTexto=new JTextField();
        liñaTexto1=new JTextField();
        liñaTexto2=new JPasswordField();
    
     marco.setSize(650,650);
        marco.setBackground(Color.white);
        
        panel.setSize(300,600);
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
        
        marco.setLocationRelativeTo(marco);    //Para mostrar a ventana no centro
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //pecha  a aplicación cando prememos a x
        marco.setVisible(true); //facemos visible o marco
        
           
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
    
    @Override
        public void actionPerformed(ActionEvent e) {  
             Object ob= e.getSource();
            if(ob==boton1){
            liñaTexto.setText("Hola "+ liñaTexto1.getText());
                
            marco.setForeground(Color.red);
            }else if(ob==boton2){
             liñaTexto.setText(null);
             liñaTexto1.setText(null);
             liñaTexto2.setText(null);
            }     
       
       
       }
}
    
    

