
package boletin21_3;

import javax.swing.JOptionPane;


public class NotAlum {
    
        public static void buscarNota(int[]lista,String[]lista1){
   
        float elemento=Float.parseFloat(JOptionPane.showInputDialog("Que nota desea buscar?"));
        
        boolean buscar=false ;
        for(int i=0;i<lista.length;i++){
            if(lista[i]==elemento){
                System.out.println("La nota " + elemento + " pertenece a  " + lista1[i]);
                buscar=true;
            }
        }
        if(buscar==false){
            JOptionPane.showMessageDialog(null, "La nota no pertenece a nadie");
        }
    }
        
        public static void buscarAprobados(int[]lista,String[]alumnos){
            for(int i =0;i<lista.length;i++){
            if(lista[i]>5){
                System.out.println("El alumno " + alumnos[i] + " esta aprobado");
            }
            }
        }
        
        public static void OrdNotas(int[]lista,String[]alumnos){
        float[] lista1=new float[lista.length];
        float aux;
        for(int i=0; i<lista.length ;i++){
            for(int j=i+1 ;j<lista.length; j++){
                if(lista[i]>lista[j]){
                    aux=  lista[i];
                    lista[i]=lista[j];
                    lista[j]=(int) aux;
                }     
                }
            }
       
        }
         public static void mostrar(int[]lista,String[]lista1){
        for(int i=0; i<lista.length; i++){
            System.out.println("posicion " + i + "--> " + lista[i] + "---->" + lista1[i]);  
        }
        }
         
        public static  void buscarAlumno(int[]lista,String []alumno){
            String elemento=JOptionPane.showInputDialog("Que alumno desea buscar?");
        
        boolean buscar=false ;
        for(int i=0;i<lista.length;i++){
            if(alumno[i].equals(elemento)){
                System.out.println("El alumno " + alumno[i] + " tiene nota de  " + lista[i]);
                buscar=true;
            }
        }
        if(buscar==false){
            JOptionPane.showMessageDialog(null, "El alumno no existe");
        }
         }
    
}

