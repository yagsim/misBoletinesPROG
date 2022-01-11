
package boletinextra5;


import javax.swing.JOptionPane;


public class Universidad {
    private String cod;
    private String nome;
    private String cat;
    private String estPos;
    private int anosAnt;
    private int horasClase;
    private float soldoBruto;
    private double porcEstPos;
    private float porcBonAnt;
    private int montoAFP;
    private int montoSaude;
    private float soldoNeto;

    public Universidad() {
    }
   
    public Universidad(String cod, String nome, String cat, String estPos, int anosAnt, int horasClase, float soldoBruto, float porcEstPos, float porcBonAnt, int montoAFP, int montoSaude, float soldoNeto) {
        this.cod = cod;
        this.nome = nome;
        this.cat = cat;
        this.estPos = estPos;
        this.anosAnt = anosAnt;
        this.horasClase = horasClase;
        this.soldoBruto = soldoBruto;
        this.porcEstPos = porcEstPos;
        this.porcBonAnt = porcBonAnt;
        this.montoAFP = montoAFP;
        this.montoSaude = montoSaude;
        this.soldoNeto = soldoNeto;
    }
    
    
   
    public void setCod(String cod){
        this.cod=cod;
    }
    public void setNome(String nome){
    this.nome=nome;
    }
   public void setCat(String cat){

       this.cat=cat;
   }
    public void setEstPos(String estPos){

        this.estPos=estPos;
    }
    public void setAnosAnt(int anosAnt){

        this.anosAnt=anosAnt;
    }
    public void setHorasClase(int horasClase){
        this.horasClase=horasClase;
    }
   
    
        public double pagoParcial(){
            double pagoParcial=0;
            if("1".equals(cat)){
                pagoParcial=horasClase*25;
            }else if("2".equals(cat)){
                pagoParcial=horasClase*18;
            }else if("3".equals(cat)){
                pagoParcial=horasClase*15;
            }

            return pagoParcial;
            
        }
        
        public double soldoBruto(){
            double pagoParcial=pagoParcial();
            double soldoBruto=0;
            if(cat=="1"){
                if(estPos=="a"){                  
                    porcEstPos=0.20;
                }else if(estPos=="b"){
                    porcEstPos=0.17;
                }else if(estPos=="c"){
                    porcEstPos=0.17;
                }
            }
                if("2".equals(cat)){
                    if("a".equals(estPos)){                  
                    porcEstPos=0.15;
                    }else if("b".equals(estPos)){
                    porcEstPos=0.10;
                    }else if("c".equals(estPos)){
                    porcEstPos=0.20;
                    }
            }
                if("3".equals(cat)){
                    if("a".equals(estPos)){                  
                    porcEstPos=0.12;
                    }else if("b".equals(estPos)){
                    porcEstPos=0.08;
                    }else if("c".equals(estPos)){
                    porcEstPos=0.02;
                    }
            }
                if("principal".equals(cat)){
                    if("doctorado".equals(estPos)){
                        if(anosAnt<7){
                            porcBonAnt=(float) 0.05;
                        }else if(anosAnt>=8){
                            porcBonAnt=(float) 0.08;
                        }
                    }
                }
                soldoBruto=pagoParcial+(pagoParcial*porcEstPos)+pagoParcial*porcBonAnt;
                
            return soldoBruto;
        
        
}
}
