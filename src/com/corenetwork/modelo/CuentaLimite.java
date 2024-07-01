package com.corenetwork.modelo;

public class CuentaLimite extends Cuenta{
    /*clase CuentaLimite
	Clase que hereda Cuenta. Incorporará un atributo "limite",
	para limitar la extracción a dicho valor.
	Además, añadiremos un método ajustarLimite(), que fijará el límite
	en la mitad del saldo */
    private double limite;

    public void ajustarLimite(){
        this.limite = getSaldo()/2;
    }

    @Override
    public void ingresar(double cantidad) {
        super.ingresar(cantidad);
    }

    @Override
    public void extraer(double cantidad) throws Exception {
        if(cantidad<limite) {
        super.extraer(cantidad);
        }
    }
    @Override
    public double obtenerSaldo() {
        return super.obtenerSaldo();
    }

    public CuentaLimite() {
    }

    public CuentaLimite(double saldo) {
        super(saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
