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

    public int insertarVehiculo(Vehiculo vehiculo) {

        for (int i = 0; i < numVehiculo; i++) {
            if (vehiculos[i].getMatricula().equalsIgnoreCase(vehiculo.getMatricula()));
            return -2;

        }
        if (numVehiculo < vehiculos.length) {
            vehiculos[numVehiculo] = vehiculo;
            numVehiculo++;
            return 0;

        } else {
            return -1;
        }

    }

    public String buscaVehiculo(String matricula) {
        
        for (int j = 0; j < numVehiculo; j++) {
            if (vehiculos[j].getMatricula().equalsIgnoreCase(matricula)){
                return vehiculos[j].toString();
            }
            
        }
        return null;

    }
    
    public String listaVehiculos(){
        
        StringBuilder lista = new StringBuilder();
                
        for (int k = 0; k < numVehiculo; k++) {
            lista.append(vehiculos[k].toString()).append("\n");
        }
        
        return lista.toString();
    }

}
