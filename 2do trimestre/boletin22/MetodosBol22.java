
package boletin22;


import javax.swing.JOptionPane;


public class MetodosBol22 {
    public static void crear(int[][]taboa,String[]nombres,String[]xornada){
        for(int jor=0; jor<xornada.length; jor++){ 
            xornada[jor]="X" + (jor+1);  
        }
        for(int i=0;i<taboa.length;i++){           //for doble porque recorro los nombres y los goles
            for(int e=0;e<taboa[i].length;e++){    //[i] porque recorre el bucle i
                taboa[i][e]=Integer.parseInt(JOptionPane.showInputDialog(null,nombres[i]+("   ") + xornada[e] ));
            
            }
        }   
    }
    
    
    public static void amosar(int[][]taboa,String[] xornada,String[]nombres) {
        System.out.println("\n");
       for(int jor=0;jor<xornada.length;jor++){     //Recorre la fila de jornadas y pone nombre
           
             System.out.print("     " + xornada[jor]);
       }
             for(int filas=0;filas<taboa.length;filas++){     //Recorre la fila nombre y pone nombre
             System.out.print("\n" + nombres[filas]+ "  ");
            for(int columna=0;columna<taboa[filas].length;columna++){     //Recorre la tabla y muestra los goles,taboa[filas] se utiliza par recorrer la matriz por dentro
                System.out.print(taboa[filas][columna]+ "   " );
            }   
        }
    }
    public static int[] suma(int[][]goles,String[]xornada,String[]nombres){
        int suma;
        
         int[]sumas=new int[goles.length];
         for(int fila=0;fila<goles.length;fila++){ 
             suma=0;         //no suma primera fila nombres, al empezar una nueva fila=0
            for(int jor=0;jor<goles[fila].length;jor++){   
                suma+=goles[fila][jor];
            }
            sumas[fila]=suma;
        }
         return sumas;
    }
        
    public static void amosarTaboaCompleta(int[][]goles,String[]xornada,String[]nombres){
        int[]total=MetodosBol22.suma(goles, xornada, nombres);
        for(int columna=0;columna<goles.length;columna++){
            System.out.println("\n");
            System.out.print("     " + xornada[columna]+ "   ");
        }
        for(int fila=0;fila<goles.length;fila++){
            System.out.print("\n"+ nombres[fila]+ "    ");
            for(int columna = 0;columna<goles[fila].length;columna++){
               System.out.print(goles[fila][columna]+ "     "); 
            }
            System.out.println("\n");
            System.out.println(" goles totales:     " + total[fila]);
        }
        
    }
    public static void ordenar(int[][]goles,String[]xornada, String[]nombres){
       int[]total =MetodosBol22.suma(goles, xornada, nombres);      // se recoge el metodo de arriba 
       int[] aux;                                                   // se crea una copia para mover los elementos
       String copia;                                                //se crea una copia para mover los nombres
       
        for(int i=0;i<goles.length;i++){           //bucle que recorre normal y que se compara con el de abajo
            for(int e = i+1;e<goles.length;e++){   //estos dos for son para comparar 0 con 1 
                if(total[i]>total[e]){             //y el if para cambiar las posiciones
                    aux =  goles[i];
                    goles[i]=goles[e];
                    goles[e]=aux;
                    
                    copia = nombres[i];
                    nombres[i]=nombres[e];
                    nombres[e]=copia;
                } 
            }
        }
    }
    
    
    public static void maisGoles(int[][]goles,String[]xornada, String[]nombres){
        int mayor=goles[0][0];
        for(int i =0;i<goles.length;i++){
        mayor=goles[i][0];       //para contar los goles de la primera fila
            System.out.println("    \n"+ nombres[i] + "   " );
            for(int j=0; j<goles.length;j++){
                if(goles[i][j]>mayor){    //si siguiente fila es mayor...
                    mayor=goles[i][j];
                    System.out.println("  \n " + xornada[j]);
                    
                    
                }  
            }
            
            
        }
        System.out.println("Máximo Goleador   " + mayor);
    }
}


    

