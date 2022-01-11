
package boletin8_1;

import javax.swing.JOptionPane;


public class Productos{
  private String nombre;
  private int vendasAnuais;
  private String tipoProducto;
  
  
  public void Producto(){
  String nom1=lerNombre();
  int tip1= numVendas();
  
  
  


  
  if(tip1<=100){
  JOptionPane.showMessageDialog(null,nom1+ " é de tipo baixo");
}
  else if(tip1>100){
  if(tip1<=500){
      JOptionPane.showMessageDialog(null,nom1 + " é de tipo medio");
  }
  }
  else if(tip1>500){
      if (tip1<=1000){
           JOptionPane.showMessageDialog(null,nom1 + " é de tipo alto");
  }
      else {
           JOptionPane.showMessageDialog(null,nom1 + " é de tipo 1ª necesidade");
  }
  }
  

  
  

  }
  public String lerNombre(){
   String nom=JOptionPane.showInputDialog("teclea nombre enteiro: ");
   return nom;
   }
  
  
  
  

  public int numVendas(){
      String resposta=JOptionPane.showInputDialog("teclea o numero de vendas");
      int numero=Integer.parseInt(resposta);
      return numero;
  }
}
