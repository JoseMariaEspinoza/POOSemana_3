package com.corenetwork.presentacion;

import com.corenetwork.modelo.Linea;
import com.corenetwork.modelo.Punto;

public class ProbarLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(5,5);
        Linea l1 = new Linea(p1,p2);
        l1.mueveDerecha(2);
        System.out.println("Posicion actual de la linea l1 -> " + l1);
        l1.mueveIzquierda(5);
        System.out.println("Posicion actual de la linea l1 -> " + l1);
        l1.mueveArriba(10);
        System.out.println("Posicion actual de la linea l1 -> " + l1);
        l1.mueveAbajo(5);
        System.out.println("Posicion actual de la linea l1 -> " + l1);

    }
}
