/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankeurope.cuentas;

/**
 * Subclase que representa una cuenta de ahorros.
 * @author braga
 */
public class CuentaAhorros extends CuentaBancaria {

    /**
     * Constructor que llama al constructor de la superclase.
     * @param numeroCuenta Número de cuenta.
     * @param saldo Saldo inicial.
     */
    public CuentaAhorros(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    /**
     * Implementación del cálculo de interés para cuenta de ahorros.
     * @return interés del 3% del saldo.
     */
    @Override
    public double calcularInteres() {
        return getSaldo() * 0.03;
    }
}

