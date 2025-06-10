/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bankeurope.cuentas;

/**
 * Clase abstracta que representa una cuenta bancaria básica.
 * Contiene atributos comunes y define un método abstracto para calcular interés.
 * @author braga
 */
public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    /**
     * Constructor para inicializar los atributos principales de la cuenta.
     * @param numeroCuenta Número único de la cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta.
     */
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos getter y setter para acceder y modificar los atributos

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método abstracto que deberá ser implementado por las subclases
     * para calcular el interés específico de cada tipo de cuenta.
     * @return interés calculado.
     */
    public abstract double calcularInteres();
}
