
package boletin23;

/**
 *
 * @author yagos
 */
public class Boletin23 {

   
    public static void main(String[] args) {
        System.out.println("1.");
        String st="Esto é Java";
        String st1="Java";
        System.out.println(st.length());
        
        System.out.println("2.");
         for(int i=0;i<st1.length();i++){
           System.out.print(st1.charAt(i)+ "  ");
        }
         
        System.out.println("\n3." );
        String s1="Java desde cero";
        StringBuilder strb=new StringBuilder(s1);
        s1= strb.reverse().toString();
        System.out.println(s1);
        
        System.out.println("4.");
        String a4="James Gosling Created Xava" ;
        System.out.println(a4.replace(" ",""));
        
        System.out.println("5.");
        String s2="java java java";
        int cons=0;
            int voc=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a' ||s2.charAt(i)=='e'||s2.charAt(i)=='i'|| s2.charAt(i)=='o'|| s2.charAt(i)=='u'){
                voc++;
            }else if(Character.isLetter(s2.charAt(i))){
                cons++;
            }        
        }
        System.out.println("vocales "+ voc + "\nconsonantes "+ cons); 
        
        
        System.out.println("6.");
        String s3= "www. javadesde0. com";
        System.out.println(s3.substring(0,9) + " and " + s3.substring(9));
        
        System.out.println("7.");
        String s4="javeros";
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());
        
        System.out.println("8.");
        String s5="Java";
        String st5="JavaScript";
        if(s5.compareToIgnoreCase(st5)<0){
            System.out.println("false");  
        }else{
            System.out.println("true");
        }
    
        System.out.println("9.");
        String s6="jeve";
        System.out.println(s6.replace("e", "a"));
        
        System.out.println("10.");
        String s7="ABCD";
        int ascii;
        for(int i=0;i<s7.length();i++){
            ascii=s7.charAt(i);
            System.out.print(s7.charAt(i) + "=" + ascii);
        }
        
        
        
        
         System.out.print("11. ");
        calculador("Ola, son alumno de DAM1, e son programador desde o 2021");
        
        
    }
    
    public static void calculador(String str) {
        int nLetras=0, nDigit=0, nEsp=0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                nLetras++;
            } else if (Character.isDigit(str.charAt(i))) {
                nDigit++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                nEsp++;
            }
        }
        
        System.out.println(str+"\nContiene: "+nLetras+" letras, "+nDigit+" dígitos, "+nEsp+" espacios");
}
}
