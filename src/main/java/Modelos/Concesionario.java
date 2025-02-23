/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * Programación DAM Modalidad Virtual
 *
 * Curso 2024/2025
 *
 * @author Borja Piñero
 */
public class Concesionario {

    private Vehiculo[] vehiculos;
    private int numVehiculo;

    public Concesionario() {
        this.vehiculos = new Vehiculo[50];
        this.numVehiculo = 0;

    }

    public void insertarVehiculo(Vehiculo vehiculo) {
        if (numVehiculo < vehiculos.length) {
            vehiculos[numVehiculo] = vehiculo;
            System.out.println("Has anadido el vehiculo numero " + numVehiculo);
            numVehiculo++;
        } else {
            System.out.println("No hay espacio para mas vehiculos");
        }

    }
    
    

}
