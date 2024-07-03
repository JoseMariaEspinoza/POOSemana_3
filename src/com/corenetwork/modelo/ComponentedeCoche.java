package com.corenetwork.modelo;

public class ComponentedeCoche {
    public String descripcion;
    public double peso;
    public double coste;

    @Override
    public String toString() {
        return "ComponentedeCoche{" +
                "descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", coste=" + coste +
                '}';
    }


}
