/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.damel.validaciones;

import com.damel.modelos.*;
import com.damel.utilidades.Utilidades;
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
            if (vehiculosAlmacenados[i].getMatricula().equals(nuevoVehiculo.getMatricula())){
                return false;
            }
           
        } return true;
    }
    
    public  static boolean formatoMatricula(String matricula){
        String regEx = "^\\d{4}[B-DF-HJ-NPR-TW-Z]{3}$";

        
        Pattern patron = Pattern.compile(regEx);
        Matcher coincide = patron.matcher(matricula);
        return coincide.matches();
    }
    
    public static boolean nombreEsValido (String propietario){
        String regEx = "^[A-ZÑ][a-zñ]+\\s[A-ZÑ][a-zñ]+\\s[A-ZÑ][a-zñ]+$";
        
        if (propietario.length() > 40){
            return false;
        }
        
        Pattern patron = Pattern.compile(regEx);
        Matcher coincide = patron.matcher(propietario);
        return coincide.matches();
    }
    
    public static boolean dniEsValido (String dni){
        
        String regEx = "^[0-9]{8}[A-Z]{1}$";
        
        Pattern patron = Pattern.compile(regEx);
        Matcher coincide = patron.matcher(dni);

        if (coincide.matches()){
            
            String dniSinNumero = dni.substring(8);
            boolean letraCorrecta = dniSinNumero.equals(Utilidades.calcularLetraDni(dni));
            return letraCorrecta;
            
        } return false; 
        
    }

}
