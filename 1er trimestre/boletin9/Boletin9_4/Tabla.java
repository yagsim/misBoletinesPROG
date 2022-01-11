/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author yagos
 */
public class Tabla {
    public Tabla(){
        
    }
    
    public void Multiplicar(){
    Scanner fd=new Scanner(System.in);
    int num = 1;

            while(num>0){
            num = fd.nextInt();
            for(int i=0;i<=10;i++){
            System.out.println(num+ "*" +i+"=" + num*i) ;
            }
         
            System.out.println(num+ "*" +"=" + num) ;
           
    }  
    
}
}