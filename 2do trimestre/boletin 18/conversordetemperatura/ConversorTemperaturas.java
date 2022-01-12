
package conversordetemperatura;

import javax.swing.JOptionPane;


public class ConversorTemperaturas {
   final float temp= 80;
   
   public float centigradosAFharenheit()throws  Exception{
       float centigrados= Float.parseFloat(JOptionPane.showInputDialog("Introduzca a temperatura en grados centigrados"));
      
       
       if(centigrados<80){
           throw new TemperaturaErradaExcepcion("Erro 2 : A temperatura non pode ser menor de 80º Grados");
       }else{
         double fahrenhein=(9.0 / 5.0 * centigrados + 32.4);
        float fah=(float)fahrenhein;
       
       return fah;
        }
    }
   public float centigradosAReamur()throws  Exception{
       float centigrados= Float.parseFloat(JOptionPane.showInputDialog("Introduzca a temperatura en grados centigrados"));
      
       
       if(centigrados<80){
           throw new TemperaturaErradaExcepcion("Erro 3 : A temperatura non pode ser menor de 80º Grados");
       }else{
         double reamur=(4.0 / 5.0 * centigrados);
        float re=(float)reamur;
       
       return re;
        }
   }
}
    