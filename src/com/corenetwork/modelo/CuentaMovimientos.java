package com.corenetwork.modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CuentaMovimientos extends CuentaLimite {
    /*ADMIN dice:Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un Array con los movimientos realizados en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción) */
    public int contador = 0;
    public String[] movimientos = new String[10];
    public DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    @Override
    public void ingresar(double cantidad) {
        super.ingresar(cantidad);
        movimientos[contador++] = "cantidad: " + cantidad +"€" + "  fecha y hora: " + LocalDateTime.now().format(formato) + "  Ingreso ";
    }

    @Override
    public void extraer(double cantidad) throws Exception {
        if(cantidad<=getLimite()) {
            setSaldo((getSaldo()-cantidad));
            movimientos[contador++] = "cantidad: " + cantidad +"€" + "  fecha y hora: " + LocalDateTime.now().format(formato) + "  Extracción ";
        }
        else{
            throw new Exception("El saldo excede el limite");
        }
    }

    @Override
    public double obtenerSaldo() {
        return super.obtenerSaldo();
    }

    public String obtenerMovimentos(){
        String historial = "";
        for(String elemento : movimientos) {
            if(elemento != null) {
            historial += elemento + "\n";
            }
        }
        return historial;
    }

    public CuentaMovimientos() {
    }

    public CuentaMovimientos(double saldo) {
        super(saldo);
    }

}

