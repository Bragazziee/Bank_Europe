/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankeurope.cuentas;

/**
 * Subclase que representa una cuenta digital.
 * @author braga
 */
public class CuentaDigital extends CuentaBancaria {

    /**
     * Constructor que llama al constructor de la superclase.
     * @param numeroCuenta Número de cuenta.
     * @param saldo Saldo inicial.
     */
    public CuentaDigital(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    /**
     * Implementación del cálculo de interés para cuenta digital.
     * @return interés del 1.5% del saldo.
     */
    @Override
    public double calcularInteres() {
        return getSaldo() * 0.015;
    }
}
