
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
public void acelerar(int valor){
velocidade += valor;
}
public void frear (int frenada){
 velocidade -= frenada  ;
}
}



