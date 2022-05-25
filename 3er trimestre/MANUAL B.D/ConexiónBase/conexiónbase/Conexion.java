/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiónbase;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author yagos
 */
public  class Conexion {
    static String url = ".\\jugador.db";  //definimos la url que usaremos para establecer la conexión
    static Connection connect;   //la conexion
    public static void connect(){
 try {
     connect = DriverManager.getConnection("jdbc:sqlite:"+url);       //a través del jdbc que debemos añadir en librerias
     if (connect!=null) {
         System.out.println("Conectado");
     }
 }catch (SQLException ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
 }
}
 public static void close(){                         //cerrar la conexión
        try {
            connect.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
}