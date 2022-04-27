/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin33;

/**
 *
 * @author yagos
 */
public class Boletin33 {

    
    public static void main(String[] args) {
    Float[] matriz={6.7f,8f,6.9f,7.3f};    //Objecto de floats por eso con mayuscula
    String[] matriz1={"1","2","3","8.98" };
    System.out.println(Operacions.calcularMin(matriz));
    System.out.println(Operacions.calcularMax(matriz1));
    System.out.println(Operacions.buscarElemento( matriz1,"3"));
    System.out.println(Operacions.borrarElemento(matriz1,"8.98"));
    }
    
}
