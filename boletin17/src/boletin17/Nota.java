
package boletin17;

import javax.swing.JOptionPane;


public class Nota {
    float exaT1;
    float exaT2;
    float exaP;
    float cantbol;
    float bol;

    public Nota() {
    }

    public Nota(float exaT1, float exaT2, float exaP) {
        this.exaT1 = exaT1;
        this.exaT2 = exaT2;
        this.exaP = exaP;
    }
    public void setExaT1(float exaT1){
        this.exaT1=exaT1;
    }
    public void setExaT2(float exaT2){
        this.exaT2=exaT2;
    }
    public void setExaP(float exaP) {
        this.exaP=exaP;
    }
    public void setCantBol(float cantbol){
        this.cantbol=cantbol;
    }
    public void Medias(){
    String respuesta;       
                do{ 
                double notaTe= (exaT1+exaT2)/2;
                double notaFte=notaTe*0.40;
                double notaPra=exaP*0.40;
                
                if(cantbol>=90){
                   bol=2;
                }else if(cantbol>=70&&cantbol<90){
                    bol=1;
                 }
                double notaF=notaFte+notaPra + bol;
                JOptionPane.showMessageDialog(null,"NOTA TEORICA "+notaFte + "\nNOTA PRACTICA "+ notaPra + "\nNOTA BOLETINES " + bol + " \nNOTA FINAL " + notaF );
                respuesta=JOptionPane.showInputDialog("¿desexas calcular outra nota?  \n1.si  \n2.no ");
                }while("si".equals(respuesta));
                
     
        JOptionPane.showMessageDialog(null, "Fin do programa");
        }

    
        
      
    }
        
        
      
    

       
    
        

    
