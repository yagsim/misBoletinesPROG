
package boletin21_2;

import javax.swing.JOptionPane;


public class Boletin21_2 {

    
    public static void main(String[] args) {
        int opcion;
        Notas not=new Notas();
        int[]notas={1,3,4,2,7,9,10,7,6,9,4,3,5,7,6,4,3,5,9,8,7,0,9,8,7,4,2,1,6,7};
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Aprobados y suspensos \n2.Notas medias  \n3.Orden notas \n4.Mostrar"));
        switch(opcion){    
                case 1: Notas.AprobYSusp(notas);
                break;
                case 2: JOptionPane.showMessageDialog(null,Notas.NotasMedia(notas));
                break;
                case 3: JOptionPane.showMessageDialog(null,Notas.NotaAlta(notas));
                break;
                case 4:Notas.mostrar(notas);
                break;
        }
        }while(opcion<=4);
    }
}

    

        

