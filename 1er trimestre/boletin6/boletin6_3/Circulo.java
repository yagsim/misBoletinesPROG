
package boletin6_3;


public class Circulo {
    //atributos
    private double radio;
    private final double PI=3.14;
     

//constructores
public Circulo(){
}
public Circulo(double rad){
radio = rad;
}
public void setRadio(double a){
 radio=a;
}
public double getRadio(){
 return radio;
}
public double calcularArea(){
double area= Math.round(Math.pow(radio, 2)*PI);
return area;
}
public double calcularLonxitude(){
    double lonxitude= radio*2*PI;
    return lonxitude;
}
}



 

