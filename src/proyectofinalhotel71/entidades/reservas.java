/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.entidades;

import java.time.LocalDate;

/**
 *
 * @author brito
 */
public class reservas {
    private huesped datosHuesped;
    private tipoHabitacion tipoHabitaciones;
    private int cantPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public reservas() {
    }

    public reservas(int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    
    
}
