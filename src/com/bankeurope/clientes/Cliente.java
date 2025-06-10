/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankeurope.clientes;

/**
 * Clase que representa a un cliente bancario.
 * Implementa la interfaz InfoCliente.
 * @author braga
 */

public class Cliente implements InfoCliente {
    private String nombre;
    private String rut;

    /**
     * Constructor que inicializa los datos del cliente.
     * @param nombre Nombre del cliente.
     * @param rut RUT del cliente.
     */
    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    /**
     * Implementación del método para mostrar los datos del cliente.
     */
    @Override
    public void mostrarInformacionCliente() {
        System.out.println("Cliente: " + nombre + " | RUT: " + rut);
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
}
