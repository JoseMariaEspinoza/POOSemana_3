package com.corenetwork.modelo;

public class PuertaCoche extends ComponentedeCoche implements Alarma,PuertaBloqueable{
    public boolean estaBloqueada;
    public boolean alarmaActivada;
    public boolean puertaAbierta;

    @Override
    public String abrir() {
        String resultado;
        if (puertaAbierta=true) {
            resultado = "La puerta ya está abierta";
        }
        else {
        if (estaBloqueada=true) {
            resultado = "Desbloquea la puerta antes";
        }
        else if (alarmaActivada=true) {
            resultado = "Desactiva la alarma antes";
        }
        else {
            this.puertaAbierta=true;
            resultado = "Puerta abierta";
        }}
        return resultado;
    }

    @Override
    public String cerrar() {
        String resultado;
        if (puertaAbierta=false) {
            resultado = "La puerta ya está cerrada";
        }
        else {
            this.puertaAbierta=false;
            resultado = "Puerta cerrada";
        }
        return resultado;
    }

    @Override
    public String bloquea() {
        String resultado;
        if (estaBloqueada=false) {
            this.estaBloqueada=true;
            resultado="Puerta bloqueada";
        }
        else {
            resultado="La puerta ya está bloqueada";
        }
        return resultado;
    }

    @Override
    public String desbloquea() {
        String resultado;
        if (alarmaActivada=true) {
            resultado = "Desbloquea la alarma antes";
        }
        else {
         if (estaBloqueada=true) {
            this.estaBloqueada=false;
            resultado = "Puerta desbloqueada";
        }
         else {
             resultado = "La puerta ya estaba desbloqueada";
         }}
        return resultado;
    }

    @Override
    public String activarAlarma() {
        String resultado;
       if (alarmaActivada==false) {
           if (estaBloqueada==true) {
           this.alarmaActivada=true;
           resultado = "Alarma activada";
           }
           else {
               resultado = "Bloquea la puerta antes";
           }
       }
       else {
           resultado = "La alarma ya está activada";
       }
        return resultado;
    }

    @Override
    public String desactivarAlarma() {
        String resultado;
        if (alarmaActivada=true) {
            this.alarmaActivada=false;
            resultado = "Alarma desactivada";
        }
        else {
            resultado = "La alarma ya está desactivada";
        }
        return resultado;

    }

    @Override
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }
}
