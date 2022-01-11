
package boletinextra5;

import javax.swing.JOptionPane;


public class Boletinextra5 {

    
    public static void main(String[] args) {
       Universidad uni=new Universidad();
       uni.setHorasClase(Integer.parseInt(JOptionPane.showInputDialog("horas de clase")));
       uni.setCat(JOptionPane.showInputDialog("1.principal \n2.asociado \n3.auxiliar"));
       JOptionPane.showMessageDialog(null, uni.pagoParcial());
       uni.setCat(JOptionPane.showInputDialog("1.principal \n2.asociado \n3.auxiliar"));
       uni.setAnosAnt(Integer.parseInt(JOptionPane.showInputDialog("1.menos de 7 \n 2.8 o mas de 8 ")));
       uni.setEstPos((JOptionPane.showInputDialog("a.doctorado \nb.maestría \nc.ambas")));
       JOptionPane.showMessageDialog(null,uni.soldoBruto());
               
    }
    
}
