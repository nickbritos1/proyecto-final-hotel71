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
public class huespedData {
    private Connection con = null;
    private Object huespedes;

    public huespedData() {
        
        con=conexion.getConexion();
        
    }
    
    
    
}
