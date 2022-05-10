/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Entidades.PersoalDestajo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Datos.ListaEmpleado;
import Entidades.PersonalContratado;
import java.util.Scanner;

/**
 *
 * @author yagos
 */
public class Presentacion {
    
    ListaEmpleado listaContratados=new ListaEmpleado();
    ListaEmpleado listaDestajo=new ListaEmpleado();
   

    public void pedirDatos(){
         String tipo=JOptionPane.showInputDialog("Personal contratado o arreo?");
        String DNI=JOptionPane.showInputDialog("Ingrese DNI");
         String nome=JOptionPane.showInputDialog("Ingrese nombre");
         String apelido=JOptionPane.showInputDialog("Ingrese apelido");
        int anio = Integer.parseInt( JOptionPane.showInputDialog("Año") );
        int mes = Integer.parseInt( JOptionPane.showInputDialog("Mes (1-12)") );
        int dia = Integer.parseInt( JOptionPane.showInputDialog("Día") );
        GregorianCalendar fechaIngreso = new GregorianCalendar(anio,mes-1,dia);
        
         
         if(tipo.equals("contratado")){
             float salarioBase=Float.parseFloat(JOptionPane.showInputDialog("Ingrese salario base"));
             listaContratados.addEmpleado(new PersonalContratado(salarioBase,DNI,nome,apelido,fechaIngreso));        //añadimos un contratado
              JOptionPane.showMessageDialog(null,listaContratados.toString());
             }else{
          int clientesObtidos=Integer.parseInt(JOptionPane.showInputDialog("Clientes Obtidos:"));
          int complemento=Integer.parseInt(JOptionPane.showInputDialog("Complemento:"));
          listaDestajo.addEmpleado(new PersoalDestajo(clientesObtidos,complemento,nome,apelido,DNI,fechaIngreso));
          JOptionPane.showMessageDialog(null,listaDestajo.toString());
        }
         
         
    }
    public void mostrarSalarios(){
        JOptionPane.showMessageDialog(null,"SALARIOS DE PERSOAL CONTRATADO");
        for(int i=0;i<=listaContratados.getPosicion();i++){
            JOptionPane.showMessageDialog(null,listaContratados.getEmpleado(i));
        }
        JOptionPane.showMessageDialog(null,"SALARIOS DE PERSOAL DESTAJO");
        for(int i=0;i<=listaDestajo.getPosicion();i++){
            JOptionPane.showMessageDialog(null,listaDestajo.getEmpleado(i));
        }
    }
  
      
       
    
    public void menu(){
         int opcion;
       Scanner sc=new Scanner(System.in);
      do{
            
           opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Añadir Personal  \n3.Mostrar personal y sus salarios \n3.Cerrar  "));
          switch(opcion) {   
            case 1:
                pedirDatos();
                break;
            case 2:
                mostrarSalarios();
                break;
            case 3:
                System.out.println("Cerrando programa . . .");
                sc.close();
                break;
            default:
                System.err.println("Al menos ingresa una opción válida ._.");
            }
        }while(opcion<=5);
   
    }
}


