/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.damel.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.damel.modelos.*;
import com.damel.validaciones.*;

/**
 *
 * @author borja
 */
public class pruebas {
    
    @Test
    void testFormatoMatriculaValido() {
        assertTrue(Validaciones.formatoMatricula("1234BCD"));
        assertFalse(Validaciones.formatoMatricula("123BCD"));
        assertFalse(Validaciones.formatoMatricula("1234BCÑ"));
        assertFalse(Validaciones.formatoMatricula("asdasd"));
    }

    @Test
    void testNombrePropietarioValido() {
        assertTrue(Validaciones.nombreEsValido("Juan Perez Lopez"),
                "El nombre deberia ser Nombre Apellido Apellido");
        assertTrue(Validaciones.nombreEsValido("Meño Piñero Piña"),
                "El nombre debe poder contener ñ");        
        assertFalse(Validaciones.nombreEsValido("JuanPerez"),
                "El nombre deberia ser Nombre Apellido Apellido");
        assertFalse(Validaciones.nombreEsValido("J P L"),
                "El nombre no pueden ser iniciales");
        assertFalse(Validaciones.nombreEsValido("Este Nombre Laaaaaaaaaaaaaaaaaaaaaaaaaaaaargo"),
                "El nombre tiene demasiados caracteres");
    }

    @Test
    void testDniValido() {
        assertTrue(Validaciones.dniEsValido("12345678Z"),
                "El DNI deberia tener 8 numeros y la letra correcta");
        assertFalse(Validaciones.dniEsValido("1234567Z"), 
                "El DNI no tiene 8 numeros");
        assertFalse(Validaciones.dniEsValido("12345678A"), 
                "El DNI tiene una letra incorrecta");
        assertFalse(Validaciones.dniEsValido("12345678"), 
                "El DNI no tiene letra");
    }

    @Test
    void testConcesionario() {
        Concesionario concesionario = new Concesionario();
        Vehiculo vehiculo1 = new Vehiculo("1234BCD", "Toyota", "Descripcion", "Juan Perez Lopez", "12345678Z", 20000, 15000);
        
         assertEquals(0,concesionario.insertarVehiculo(vehiculo1), "0: Vehiculo anadido");
                
        Vehiculo vehiculo2 = new Vehiculo("1234BCD", "Honda", "Otra Descripcion", "Maria Garcia Gomez", "87654321X", 25000, 10000);
         
        assertEquals(-2, concesionario.insertarVehiculo(vehiculo2), "-2: Matricula duplicada");
        
        for (int i = 0; i < 50; i++) {
        concesionario.insertarVehiculo(new Vehiculo("000" + i + "BBB", "Ford", "Otro", "Carlos Ruiz Lopez", "11111111H", 18000, 5000));
    }
    Vehiculo vehiculo51 = new Vehiculo("5678EFG", "BMW", "Lujo", "Luis Fernandez", "22222222J", 50000, 20000);
    assertEquals(-1, concesionario.insertarVehiculo(vehiculo51), "-1: concesionario lleno.");
    }
}
