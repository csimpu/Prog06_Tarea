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

        if (!Validaciones.matriculaEsUnica(nuevoVehiculo, vehiculosAlmacenados, numVehiculo)) {
            return -2;
        } else if (numVehiculo < vehiculosAlmacenados.length) {
            vehiculosAlmacenados[numVehiculo] = nuevoVehiculo;
            numVehiculo++;
            return 0;

        } else {
            return -1;
        }

    }

    public String buscaVehiculo(String matricula) {

        for (int j = 0; j < numVehiculo; j++) {
            if (vehiculosAlmacenados[j].getMatricula().equals(matricula)) {
                return vehiculosAlmacenados[j].toString();
            }

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
        for (int m = 0; m < numVehiculo; m++) {
            if (vehiculosAlmacenados[m].getMatricula().equals(matricula)) {

                vehiculosAlmacenados[m].setKm(nuevoKm);
                return 0;
            }

        }
        return -1;
    }
}
