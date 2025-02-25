/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.damel.validaciones;

import com.damel.modelos.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Programación DAM Modalidad Virtual
 *
 * Curso 2024/2025
 *
 * @author Borja Piñero
 */
public class Validaciones {
    
    public static boolean matriculaEsUnica (Vehiculo nuevoVehiculo, 
            Vehiculo[] vehiculosAlmacenados, int numVehiculo){
          
        for (int i = 0; i < numVehiculo; i++) {
            if (vehiculosAlmacenados[i].getMatricula().equalsIgnoreCase(nuevoVehiculo.getMatricula())){
            }
           
        } return true;
    }
    
    public boolean formatoMatricula(String matricula){
        String regEx = "^\\d {4}^[EIÑOQU]]{3}$";
        
        Pattern patron = Pattern.compile(regEx);
        Matcher coincide = patron.matcher(matricula);
        return coincide.matches();
    }

}
