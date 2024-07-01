package com.corenetwork.modelo;

public class Cuenta {
    /*Crear una clase llamada Cuenta, que defina operaciones
	sobre una cuenta bancaria.
	La clase tendrá un atributo saldo y los siguientes métodos:
	-ingresar(double cantidad)
	-extraer(double cantidad)
	-obtenerSaldo() */
    private double saldo;

    public void ingresar(double cantidad) {
        this.saldo = saldo + cantidad;
    }

    public void extraer(double cantidad) throws Exception {
        if(cantidad>saldo){
            throw new Exception("La cantidad a extraer no puede ser mayor al saldo");
        }
        this.saldo = saldo - cantidad;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

