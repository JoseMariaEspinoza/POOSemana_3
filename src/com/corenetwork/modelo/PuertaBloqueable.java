package com.corenetwork.modelo;

public interface PuertaBloqueable extends Puerta{
    @Override
    String abrir();

    @Override
    String cerrar();

    public String bloquea();
    public String desbloquea();
}
