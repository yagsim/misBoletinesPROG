
package boletin4;

public class Libro {
    //atributos
private String titulo;
private String autor;
 private int ano;
private short numPaginas;
private float valoracion;

//constructores
public Libro (){

}
public Libro(String ti,String aut, int an, short numPag, float valora){
    titulo=ti;
    autor=aut;
    ano= an;
    numPaginas= numPag;
    valoracion= valora;
    
}
//metodos
public void setTitulo(String a){
    titulo=a;
}
public String getTitulo(String a){
return titulo;
}
public void setAutor(String b){
    autor=b;
}
public String getAutor(String b){
return autor;
}
public void setAno(int c){
ano=c;
}
public int getAno(int d){
return ano;
}
public void setNumPag (short e){
numPaginas=e;
}
public short getNumPag (short f){
return numPaginas;
}
public void setValora (float g){
valoracion=g;
}
public float getValora(float h){
    return valoracion;
}
public void amosar(){
    System.out.println ("Titulo "+ titulo +"\n autor "+ autor + "\n ano " + ano+ " Numero de páginas" + numPaginas + "\n valoracion " +valoracion);
}
    
}

