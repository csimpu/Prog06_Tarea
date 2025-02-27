/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.damel.principal;

import com.damel.utilidades.Utilidades;
import com.damel.modelos.Vehiculo;
import com.damel.modelos.Concesionario;
import com.damel.validaciones.Validaciones;
import java.util.Scanner;

/**
 *
 * @author borja
 */
public class Principal {

    public static void main(String[] args) {

        String matricula,
                marca,
                descripcion,
                nombrePropietario,
                dni,
                buscaMatricula,
                vehiculoEncontrado;
        double precio,
                km;
        int opcion;

        Concesionario concesionario = new Concesionario();

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("*************************************");
            System.out.println("*      Gestor de concesionario      *");
            System.out.println("*************************************");
            System.out.println("[1] - Nuevo vehiculo");
            System.out.println("[2] - Listar vehiculo");
            System.out.println("[3] - Buscar vehiculo");
            System.out.println("[4] - Modificar km vehiculo");
            System.out.println("[5] - Eliminar vehiculo");
            System.out.println("[6] - Salir               [0] - Ayuda");
            System.out.println("*************************************");
            System.out.print("Introduce una opcion: ");
            
            opcion = entrada.nextInt();
            
            System.out.println("*************************************");
            System.out.println();
            entrada.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.println("*************************************");
                    System.out.println("*          Nuevo vehiculo           *");
                    System.out.println("*************************************");

                    do{
                        System.out.println("Introduce la matricula: ");
                    

                    matricula = entrada.nextLine();
                    
                    if (!Validaciones.formatoMatricula(matricula))
                        System.out.println("Error");
                    } while (!Validaciones.formatoMatricula(matricula));

                    System.out.println("Introduce la marca: ");

                    marca = entrada.nextLine();

                    System.out.println("Introduce una descripcion: ");

                    descripcion = entrada.nextLine();
                    
                    do {
                    System.out.println("Introduce el nombre del propietario: ");
                    
                    nombrePropietario = entrada.nextLine();
                                        
                    if (!Validaciones.nombreEsValido(nombrePropietario))
                        System.out.println("Error");
                    
                    } while (!Validaciones.nombreEsValido(nombrePropietario));
                    
                    do {
                    System.out.println("Introduce el DNI del propietario");

                    dni = entrada.nextLine();
                    
                    if (!Validaciones.dniEsValido(dni))
                        System.out.println("Error");
                    } while (!Validaciones.dniEsValido(dni));

                    System.out.println("Introduce el precio del vehiculo");

                    precio = entrada.nextDouble();

                    System.out.println("Introduce los kilometros del ");
                    System.out.println("vehiculo");

                    km = entrada.nextDouble();

                    Vehiculo nuevoVehiculo = new Vehiculo(matricula, marca, 
                            descripcion, nombrePropietario, dni, precio, km);
                    
                    concesionario.insertarVehiculo(nuevoVehiculo);
                    
                    if (concesionario.insertarVehiculo(nuevoVehiculo) == -1)
                        System.err.println("Error -1: El concesionario está lleno");
                    
                    if (concesionario.insertarVehiculo(nuevoVehiculo) == -2)
                        System.err.println("""
                                           Error -2: La matricula ya esta en
                                           el concesionario""");
                    
                    if (concesionario.insertarVehiculo(nuevoVehiculo) == 0)
                        System.out.println("Vehiculo anadido");
                    
                                        
                    System.out.println("*************************************");
                    
                    Utilidades.enterParaSalir();

                }

                case 2 -> {
                    System.out.println("*************************************");
                    System.out.println("*         Lista de vehiculos        *");
                    System.out.println("*************************************");
                    
                    System.out.println(concesionario.listaVehiculos());
                    
                    System.out.println("*************************************");
                    Utilidades.enterParaSalir();
                }

                case 3 -> {
                    System.out.println("*************************************");
                    System.out.println("*          Buscar vehiculo          *");
                    System.out.println("*************************************");
                    System.out.println("Introduce la matricula que quieres");
                    System.out.print("buscar: ");
                    
                    buscaMatricula = entrada.nextLine();
                    
                    vehiculoEncontrado = concesionario.buscaVehiculo(buscaMatricula);
                    
                    System.out.println("El vehiculo que buscas es:");
                    System.err.println(vehiculoEncontrado);
                                     
                    System.out.println("*************************************");
                    Utilidades.enterParaSalir();
                }

                case 4 -> {
                    System.out.println("*************************************");
                    System.out.println("*           Modificar km            *");
                    System.out.println("*************************************");
                    
                    
                    
                    System.out.println("*************************************");
                    Utilidades.enterParaSalir();

                }

                case 5 -> {
                    System.out.println("*************************************");
                    System.out.println("*         Eliminar vehiculo         *");
                    System.out.println("*************************************");
                    
                    
                    
                    System.out.println("*************************************");
                    Utilidades.enterParaSalir();                    
                }

                case 6 -> {
                    System.out.println("Cerrando inventario. Hasta pronto");

                }

                case 0 -> {
                    System.out.println("*************************************");
                    System.out.println("*               Ayuda               *");
                    System.out.println("*************************************");
                    System.out.println("[1] - Anade un nuevo vehiculo");
                    System.out.println("[2] - Lista los vehiculos del");
                    System.out.println("      concesionario");
                    System.out.println("[3] - Busca un vehiculo por");
                    System.out.println("      matricula");
                    System.out.println("[4] - Modifica los km de un");
                    System.out.println("      vehiculo");
                    System.out.println("[5] - Elimina un vehiculo del");
                    System.out.println("      concesionario");
                    System.out.println("*************************************");

                    Utilidades.enterParaSalir();
                }
            }

        } while (opcion != 6);

    }

}
