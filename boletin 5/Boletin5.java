
package boletin5;


public class Boletin5 {

  
    public static void main(String[] args) {
    Consumo consumo=new Consumo();
    consumo.setKm(10);
    consumo.setLit(50);
    consumo.setVmedia(99);
    consumo.setPgas(1.57);
    consumo.getTempo(10, 99);
    consumo.calcularConsumoMedio();
    consumo.calcularConsumoEuros();
    consumo.amosar();
    
    Consumo consumo2=new Consumo();
    consumo.setKm(18);
    consumo.setLit(57);
    consumo.setVmedia(78);
    consumo.setPgas(7.98);
    consumo.calcularConsumoMedio();
    consumo.amosar2();
    }
    
}
