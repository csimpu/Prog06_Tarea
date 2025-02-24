/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Principal;

import java.util.Scanner;
import Modelos.*;

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
                dni;
        double precio,
                km;
        int opcion;

        Concesionario concesionario = new Concesionario();

        Vehiculo nuevoVehiculo = new Vehiculo();

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

            opcion = entrada.nextInt();
            System.out.println("*************************************");
            System.out.println();
            entrada.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.println("*************************************");
                    System.out.println("*          Nuevo vehiculo           *");
                    System.out.println("*************************************");
                    System.out.println("Introduce la matricula: ");
                    matricula = entrada.nextLine();
                    nuevoVehiculo.setMatricula(matricula);
                    System.out.println("Introduce la marca: ");
                    marca = entrada.nextLine();
                    nuevoVehiculo.setMarca(marca);
                    System.out.println("Introduce una descripción: ");
                    descripcion = entrada.nextLine();
                    nuevoVehiculo.setDescripcion(descripcion);
                    System.out.println("Introduce el nombre del propietario: ");
                    nombrePropietario = entrada.nextLine();
                    nuevoVehiculo.setNombrePropietario(nombrePropietario);
                    System.out.println("Introduce el DNI del propietario");
                    dni = entrada.nextLine();
                    nuevoVehiculo.setDni(dni);
                    System.out.println("Introduce el precio del vehiculo");
                    precio = entrada.nextDouble();
                    nuevoVehiculo.setPrecio(precio);
                    System.out.println("Introduce los kilometros del ");
                    System.out.println("vehiculo");
                    km = entrada.nextDouble();
                    nuevoVehiculo.setKm(km);
                    concesionario.insertarVehiculo(nuevoVehiculo);
                    System.out.println("*************************************");
                    System.out.println();

                }

                case 2 -> {
                    System.out.println("*************************************");
                    System.out.println("*          Listar vehiculo          *");
                    System.out.println("*************************************");
                    concesionario.listaVehiculos();
                    System.out.println("*************************************");
                    System.out.println();
                }

                case 3 -> {
                    System.out.println("*************************************");
                    System.out.println("*          Buscar vehiculo          *");
                    System.out.println("*************************************");

                }

                case 4 -> {
                    System.out.println("*************************************");
                    System.out.println("*           Modificar km            *");
                    System.out.println("*************************************");

                }

                case 5 -> {
                    System.out.println("*************************************");
                    System.out.println("*         Eliminar vehiculo         *");
                    System.out.println("*************************************");

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

                }
            }

        } while (opcion != 6);

    }
}
