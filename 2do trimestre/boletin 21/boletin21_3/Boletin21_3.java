
package boletin21_3;

import javax.swing.JOptionPane;

public class Boletin21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]alumnos={"Alan"," Jacinto","Martinez", "Alicia","Jesús" ,"Francisco"," Andrea", "Colombo", "Mónica" ,"Andrés", "Juan", "Nicolás"," Antonia","Juana","Noé" ,"Antonio","Juárez","Noelia", "Azul","Julia","Paula", "Bartolomé","Julián","Patricio","Belén","Juliana","Renzo" ,"Celeste","Julio","Rodrigo"};
        int[]notas={1,3,4,2,7,9,10,7,6,9,4,3,5,7,6,4,3,5,9,8,7,0,9,8,7,4,2,1,6,7};


        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1.Buscar elementos \n2.Buscar aprobados \n3.Ordenar \n4.Mostrar \n5.Buscar Alumno"));
        switch(opcion){
            case 1:NotAlum.buscarNota(notas, alumnos);
            break;
            case 2: NotAlum.buscarAprobados(notas, alumnos);
            break;
            case 3:NotAlum.OrdNotas(notas, alumnos);
            break;
            case 4:NotAlum.mostrar(notas,alumnos);
            break;
            case 5:NotAlum.buscarAlumno(notas,alumnos);
            break;
        }
        
    }while(opcion<=5);
    
}
}
