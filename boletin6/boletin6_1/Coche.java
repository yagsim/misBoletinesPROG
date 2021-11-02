
package boletin6;

public class Coche {
    
 //atributos
private double velocidade;

//constructores
public Coche(){
    velocidade=0;
}

//metodos
public void setVelocidade(int a){
 velocidade = velocidade;
}
public double getVelocidade(){
return velocidade;  
}

    /**
     * Description of what the method does
     * @param valor acelerar
     */
    public void acelerar(int valor){
velocidade += valor;
}

    /**
     * Description of what the method does
     * @param frenada
     */
    public void frear (int frenada){
 velocidade -= frenada  ;
}
}



