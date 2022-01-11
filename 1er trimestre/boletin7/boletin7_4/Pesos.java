
package boletin7_4;


import javax.swing.JOptionPane;
public class Pesos {
    public void Peso(){
    String nombre1=lerNombre();
    float pesos1=lerPesos();
    String nombre2=lerNombre();
    float pesos2=lerPesos();
    float pesodif= pesos1 - pesos2;
    
    if (pesos1>pesos2){
    JOptionPane.showMessageDialog(null,nombre1 + " pesa mas que" + nombre2);
    }
    else if (pesos1< pesos2){
        JOptionPane.showMessageDialog(null,nombre2 + " pesa mas que " + nombre1);
    }
    if(pesodif>0){
     JOptionPane.showMessageDialog(null, "A diferenza de peso é : "+ pesodif );
    }
    else{
         JOptionPane.showMessageDialog(null, "A diferenza de peso é : "+ -pesodif );
    }
 
    }
   public String lerNombre(){
   String nom=JOptionPane.showInputDialog("teclea nombre enteiro: ");
   return nom;
   }
    public float lerPesos(){
        String resposta = JOptionPane.showInputDialog("teclea peso: ");
        float pes= Float.parseFloat(resposta);
        return pes;
}
}


