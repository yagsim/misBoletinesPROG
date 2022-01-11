
package boletinextra3_2;

import javax.swing.JOptionPane;

public class Fechas {
 
   public void esFechaValida(){
       int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o dia"));
       int mes= Integer.parseInt(JOptionPane.showInputDialog("Introduzca o mes"));
       int ano=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o ano"));
       boolean valido=true;
       if(ano>1600&&ano<3000){
           if(mes>1&&mes<12){
               switch(mes){
                   case 1:
                   case 3:
                   case 5:
                   case 7:
                   case 8:
                   case 10:
                   case 12:
                       if(dia<31){
                           JOptionPane.showMessageDialog(null,"Dia no válido");
                           valido=false;
                       }
                       break;
                       
                   case 4:
                   case 6:
                   case 9:
                   case 11:
                       if(dia>30){
                           JOptionPane.showMessageDialog(null,"Dia no válido");
                           valido=false;
                       }
                       break;
                       
                   case 2: 
                       if(ano%4==0&&ano%100!=0){
                       if(dia>29){
                           JOptionPane.showMessageDialog(null,"Dia no válido");
                           valido=false;
                       }
                       }else{
                           if(dia>28){
                               JOptionPane.showMessageDialog(null,"Dia no válido");
                               valido=false;
                       }
                       }
                        break;
                        }
                            }else{
                           JOptionPane.showMessageDialog(null,"Mes no válido");
                           valido=false;
                        }
                        }else{
                           JOptionPane.showMessageDialog(null,"Año no  válido");
                           valido=false;
               }
                        if(valido==true) {
                                  JOptionPane.showMessageDialog(null, "La fecha es correcta");
                                }
                            JOptionPane.showMessageDialog(null,dia + " / " + mes + "/" + ano);
           }
       
       }
   
   


