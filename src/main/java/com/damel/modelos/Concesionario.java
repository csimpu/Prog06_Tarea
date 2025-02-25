/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damel.modelos;

import com.damel.validaciones.Validaciones;

/**
 * Programación DAM Modalidad Virtual
 *
 * Curso 2024/2025
 *
 * @author Borja Piñero
 */
public class Concesionario {

    private Vehiculo[] vehiculosAlmacenados;
    private int numVehiculo;

    public Concesionario() {
        this.vehiculosAlmacenados = new Vehiculo[50];
        this.numVehiculo = 0;

    }

    public int insertarVehiculo(Vehiculo nuevoVehiculo) {

//        for (int i = 0; i < numVehiculo; i++) {
//            if (vehiculosAlmacenados[i].getMatricula().equalsIgnoreCase(nuevoVehiculo.getMatricula())){
//            return -2;
//            }
//        }
        
        if (!Validaciones.matriculaEsUnica(nuevoVehiculo, vehiculosAlmacenados, numVehiculo)){
            return -2;
        }

        else if (numVehiculo < vehiculosAlmacenados.length) {
            vehiculosAlmacenados[numVehiculo] = nuevoVehiculo;
            numVehiculo++;
            return 0;

        } else {
            return -1;
        }

    }

    public String buscaVehiculo(String matricula) {
        
        for (int j = 0; j < numVehiculo; j++) {
            if (vehiculosAlmacenados[j].getMatricula().equalsIgnoreCase(matricula)){
                return vehiculosAlmacenados[j].toString();
            }
            
        }
        return null;

    }
    
    public String listaVehiculos(){
        
        StringBuilder lista = new StringBuilder();
        
        lista.append("Vehiculos en el concesionario");
                
        for (int k = 0; k < numVehiculo; k++) {
            lista.append(k+1)
                    .append(" - ")
                    .append(vehiculosAlmacenados[k].toString())
                    .append("\n");
        }
        
        return lista.toString();
    }

}
