
package conversordetemperatura;




public class ConversordeTemperatura {

    
    public static void main(String[] args) {
        TemperaturaErradaExcepcion err= new TemperaturaErradaExcepcion();
        try {
            err.TemperaturaErradaExcepcion();
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("erro 1 " + ex.toString());
        }
        
        ConversorTemperaturas trm=new ConversorTemperaturas();
        try {
            trm.centigradosAFharenheit();
        } catch (Exception ex) {
           System.out.println("erro 2" + ex.toString());
        }
        try {
            trm.centigradosAReamur();
        } catch (Exception ex) {
            System.out.println("erro 3" + ex.toString());
        }
    }
    
}
