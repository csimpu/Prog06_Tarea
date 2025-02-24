/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damel.modelos;

/**
 * Programación DAM Modalidad Virtual
 *
 * Curso 2024/2025
 *
 * @author Borja Piñero
 */
public class Vehiculo {

    private String matricula,
            marca,
            descripcion,
            nombrePropietario,
            dni;
    private double precio,
            km;

    public Vehiculo(String matricula, String marca, String descripcion,
            String nombrePropietario, String dni, double precio, double km) {
        this.matricula = matricula;
        this.marca = marca;
        this.descripcion = descripcion;
        this.nombrePropietario = nombrePropietario;
        this.dni = dni;
        this.precio = precio;
        this.km = km;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula 
                + "\nmarca=" + marca 
                + "\ndescripcion=" + descripcion 
                + "\nnombrePropietario=" + nombrePropietario 
                + "\ndni=" + dni 
                + "\nprecio=" + precio 
                + "\nkm=" + km +"\n";
    }

}
