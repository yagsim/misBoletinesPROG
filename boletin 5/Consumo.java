
package boletin5;


public class Consumo {
     //atributos
    private float kilometros;
    private float litros;
    private float vMedia;
    private double prezoGasolina;
    
    //constructores
    public Consumo (){

}
public Consumo(float km,float lit,float vMed, double pGas){
    kilometros=km;
    litros=lit;
    vMedia=vMed;
    prezoGasolina =pGas;
    
    
}
    //metodos
    public void setKm (float a){
    kilometros =a;
    }
    
    public void setLit(float b){
    litros= b;
    }

    public void setVmedia(float c ){
    vMedia= c;
    }
    public float getVmedia(float g){
    return vMedia;
    }
    
      public void setPgas(double d ){
    prezoGasolina= d;
    }
      
      
    public float getTempo(float km,float vMed){
    float tempo=vMedia/kilometros;
    return tempo;
    }
    public float calcularConsumoMedio(){
    float consumoMedio= kilometros/litros;
    return consumoMedio;
    }
    public float calcularConsumoEuros(){
    float consumoEuros=(float)(litros  * prezoGasolina  / kilometros);
    return consumoEuros;
    }
    public void amosar(){
    System.out.println ("O primeiro consumo é; \n Kilometros "+ kilometros +"\n litros "+ litros + "\n Velocidad media " + vMedia + " \n Prezo da gasolina " + prezoGasolina );
}
     public void amosar2(){
    System.out.println (" O segundo consumo é; \n Kilometros "+ kilometros +"\n litros "+ litros + "\n Velocidad media " + vMedia + " \n Prezo da gasolina " + prezoGasolina );
}
    
}


    
    
















