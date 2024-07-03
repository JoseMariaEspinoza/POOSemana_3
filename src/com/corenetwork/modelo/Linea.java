package com.corenetwork.modelo;

import java.util.ArrayList;
import java.util.List;

public class Linea extends Punto{
    //Enunciado 1
//        Defina una clase Linea con dos atributos: puntoA y_puntoB. Son dos puntos por los que pasa
//        la línea en un espacio de dos dimensiones.
        private Punto puntoA;
        private Punto puntoB;
//        La clase dispondrá de los siguientes métodos:
//        - Linea(): Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y
//                (0,0).
//        - Linea(Punto, Punto): Constructor que recibe como parámetros dos objetos de la clase
//        Punto, que son utilizados para inicializar los atributos.

    public Linea() {
    }

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    //        - mueveDerecha(double): Desplaza la línea a la derecha la distancia que se indique.
//                - mueveIzquierda(double): Desplaza la línea a la izquierda la distancia que se indique.
//                - mueveArriba(double): Desplaza la línea hacia arriba la distancia que se indique.
//        - mueveAbajo(double): Desplaza la línea hacia abajo la distancia que se indique.
    public void mueveDerecha(double desplazar){
        puntoA.setX(puntoA.getX()+desplazar);
        puntoB.setX(puntoB.getX()+desplazar);
    }
    public void mueveIzquierda(double desplazar){
        puntoA.setX(puntoA.getX()-desplazar);
        puntoB.setX(puntoB.getX()-desplazar);
    }
    public void mueveArriba(double desplazar){
        puntoA.setY(puntoA.getY()+desplazar);
        puntoB.setY(puntoB.getY()+desplazar);
    }
    public void mueveAbajo(double desplazar){
        puntoA.setY(puntoA.getY()-desplazar);
        puntoB.setY(puntoB.getY()-desplazar);
    }
//        - Getters y setters.

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

//        - Método que nos permita mostrar la información de la línea de la forma [puntoA,puntoB].
//        Por ejemplo: [(0.0,0.0),(1.0,1.0)].

    @Override
    public String toString() {
        return "[" + puntoA +","+ puntoB + "].";
    }
}
