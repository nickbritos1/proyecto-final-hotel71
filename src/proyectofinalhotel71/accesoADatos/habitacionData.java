/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.accesoADatos;

import java.sql.Connection;

/**
 *
 * @author brito
 */
public class habitacionData {
    private Connection con = null;
    private Object habitaciones;

    public habitacionData() {
        
        con=conexion.getConexion();
        
    }
    
    
}
