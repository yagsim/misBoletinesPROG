
package boletinextra3_1;

import javax.swing.JOptionPane;

/**
 *
 * @author yagos
 */
public class Abonos {
    public void Descontos(){
   int cota=800;
   int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce a edad"));
   boolean socio=Boolean.parseBoolean(JOptionPane.showInputDialog("É SOCIO?(true,false)"));
        if(edad>65){
        int desconto= (int) (cota -(cota*0.40));
        JOptionPane.showMessageDialog(null,"El abono sera " +  desconto);
        }else if(socio==false&&edad<21){
         int desconto2= (int) (cota -(cota*0.25));
          JOptionPane.showMessageDialog(null,"El abono sera " +  desconto2);
        }else if(socio==true&&edad<21){
          int desconto3= (int) (cota -(cota*0.45));
           JOptionPane.showMessageDialog(null,"El abono sera " +  desconto3);
        }else{
             JOptionPane.showMessageDialog(null,"El abono sera " +  cota);
        }
    
 
    }
}
