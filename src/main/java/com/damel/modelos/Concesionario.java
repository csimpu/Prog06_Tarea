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
    
    public int obtenerPosicionVehiculo(String matricula){
        
        for (int i = 0; i < numVehiculo; i++){
            if (vehiculosAlmacenados[i].getMatricula().equalsIgnoreCase(matricula)) {
                return i;
            }
        }
        return -1;
    }
    
    public int insertarVehiculo(Vehiculo nuevoVehiculo) {
        
        if (numVehiculo >= vehiculosAlmacenados.length) {
            return -1;
        }
        
        if (!Validaciones.matriculaEsUnica(nuevoVehiculo, this)) {
            return -2;
        }
        
        vehiculosAlmacenados[numVehiculo] = nuevoVehiculo;
        numVehiculo++;
        return 0;
    }

    public String buscaVehiculo(String matricula) {
        
        int posicion = obtenerPosicionVehiculo(matricula);
        
        if (posicion != -1) {
            return vehiculosAlmacenados[posicion].toString();
        }
        return null;
    }

    public String listaVehiculos() {

        StringBuilder lista = new StringBuilder();

        lista.append("Vehiculos en el concesionario:\n");

        for (int k = 0; k < numVehiculo; k++) {
            lista.append("Vehiculo ")
                    .append(k + 1)
                    .append("\n")
                    .append(vehiculosAlmacenados[k].toString())
                    .append("\n          ***\n");
        }

        return lista.toString();
    }

    public int modificarKm(String matricula, double nuevoKm) {
        
        int posicion = obtenerPosicionVehiculo(matricula);
        
        if (posicion !=-1) {
            vehiculosAlmacenados[posicion].setKm(nuevoKm);
            return 0;
        }
        return -1;
//        for (int m = 0; m < numVehiculo; m++) {
//            if (vehiculosAlmacenados[m].getMatricula().equals(matricula)) {
//
//                vehiculosAlmacenados[m].setKm(nuevoKm);
//                return 0;
//            }
//
//        }
//        return -1;
    }
    
//    public boolean eliminarVehiculo() {
//        
//    }
}
