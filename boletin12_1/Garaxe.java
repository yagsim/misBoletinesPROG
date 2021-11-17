
package boletin12_1;


import javax.swing.JOptionPane;



public class Garaxe {
    Coche obxCoche=new Coche();
   
    private final int capacidade=5;
    private int numCoches;
    private final float prezoTempo=0.20f;
    private final float prezo=1.5f;
    private float prezoFinal;
    private float cartosDevoltos;
    private float cartosRecibidos;
    private String matricula;
    
    
     public void registro(){
       
        
        numCoches=numCoches();
        
            if(numCoches<capacidade){
                numCoches++;
                JOptionPane.showMessageDialog(null,"PLAZAS DISPOÑIBLES");
                matricula=obxCoche.lerMatricula();
                int tempo= Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de minutos que estivo aparcado  "));
           
                if(tempo>0&&tempo<=180){
                prezoFinal=prezo;
                } else if(tempo>180){
                float tempoExtra=(tempo-180)/60;
                prezoFinal=(prezo)+(prezoTempo*tempoExtra);       
                }  
                cartosRecibidos=Float.parseFloat(JOptionPane.showInputDialog("PRECIO "+ prezoFinal));
                cartosDevoltos=(cartosRecibidos-prezoFinal);
                JOptionPane.showMessageDialog(null,"MATRICULA " + matricula + "\nTEMPO " + tempo + " \nPRECIO " + prezoFinal + "\nCARTOS RECIBIDOS " + cartosRecibidos + "\nCARTOS DEVOLTOS " +cartosDevoltos);
            
            }else {
                 JOptionPane.showMessageDialog(null,"AFORO COMPLETO");
            }
            
            
            
            
   
    
            }
     
     
         
         
     
     
     
     
     
    public int numCoches(){
        String resposta=JOptionPane.showInputDialog("nº coches aparcados");
        int num=Integer.parseInt(resposta);
        return num;
        
    }
    
 
    
    
   }



