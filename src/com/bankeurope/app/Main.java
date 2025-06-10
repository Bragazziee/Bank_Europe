/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankeurope.app;

import com.bankeurope.cuentas.*;
import com.bankeurope.clientes.*;

/**
 * Clase principal que prueba la funcionalidad del sistema bancario.
 * Crea un cliente, una cuenta de ahorros y muestra los datos correspondientes.
 * @author braga
 */
public class Main {
    public static void main(String[] args) {
        // Crear cliente con nombre y RUT
        Cliente cliente = new Cliente("Edgar Bragazzi", "12.345.678-9");

        // Crear una cuenta de ahorros con número de cuenta y saldo inicial
        CuentaAhorros cuenta = new CuentaAhorros("123456789", 1000000);

        // Mostrar información del cliente
        cliente.mostrarInformacionCliente();

        // Mostrar detalles de la cuenta
        System.out.println("N° Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println("Interés estimado: $" + cuenta.calcularInteres());
    }
}
