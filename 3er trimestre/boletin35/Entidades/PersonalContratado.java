/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Datos.DatosEmpleado;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class PersonalContratado extends DatosEmpleado {
    private float soldoBase;

    

    public PersonalContratado() {
    }

    public PersonalContratado(float soldoBase, String DNI, String nome, String apelido, GregorianCalendar data) {
        super(DNI, nome, apelido, data);
        this.soldoBase = soldoBase;

    }
    
    public float salario(){
        GregorianCalendar Actual=new GregorianCalendar();           //ponemos la fecha actual
        int anhos=Actual.get(Calendar.YEAR) - data.get(Calendar.YEAR);     //a la actual le restamos la de ingreso que ponemos a mano
        if(data.get(Calendar.MONTH)>Actual.get(Calendar.MONTH)|| data.get(Calendar.MONTH)==Actual.get(Calendar.MONTH)&& data.get(Calendar.DAY_OF_MONTH)>Actual.get(Calendar.DAY_OF_MONTH)) anhos--;         //si el mes es mayor o igual al actual y dia tambien pues 
   //con esto vemos el numero de anhos que lleva en la empresa       
         switch(anhos){
            case 0: return 1.05f*soldoBase;
            case 1:return 1.05f*soldoBase;
            case 2:return 1.05f*soldoBase;
            case 3: return 1.05f*soldoBase;        // si es de 0 a 3 años + 5%
            
            case 4: return 1.10f*soldoBase;
            case 5: return 1.10f*soldoBase;
            case 6: return 1.10f*soldoBase;
            case 7: return 1.10f*soldoBase;   // si es de  4 a 7 años + 10%
            
            case 8:return 1.15f*soldoBase;
            case 9:return 1.15f*soldoBase;
            case 10:return 1.15f*soldoBase;
            case 11:return 1.15f*soldoBase;
            case 12:return 1.15f*soldoBase;
            case 13:return 1.15f*soldoBase;
            case 14:return 1.15f*soldoBase;
            case 15: return 1.15f*soldoBase;      // si es de  8 a 15 años + 15%
            default: return 1.20f* soldoBase;
        }
    }

    public float getSoldoBase() {
        return soldoBase;
    }

    public void setSoldoBase(float soldoBase) {
        this.soldoBase = soldoBase;
    }

    @Override
    public String toString() {
        return "\nPersonalContratado{" + super.toString() + "\nSoldo=" + this.salario() + '}';
    }

   



  
    
    
}
