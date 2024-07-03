package com.corenetwork.modelo;

public class Cafetera {
//    Enunciado 2
//        Desarrolle una clase Cafetera con atributos_capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//        _cantidadActual (la cantidad actual de café que hay en la cafetera).
        private double capacidadMaxima;
        private double cantidadActual;
//        Implemente, al menos, los siguientes métodos:
//        - Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero (cafetera vacía).
    public Cafetera() {
        this.capacidadMaxima=1000;
        this.cantidadActual =0;
    }

//        - Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

//        - Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual >capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }
        else {
            this.cantidadActual = cantidadActual;
        }
    }

//                - Getters y setter.

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

//        - llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
    public String llenarCafetera() {
        this.cantidadActual=capacidadMaxima;
        return "La cafetera se llena";
    }

//                - servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
//                Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    public String servirTaza(int cantidadServir) {
        if (cantidadServir>cantidadActual) {
            cantidadActual-=cantidadActual;
        }
        else {
            cantidadActual-=cantidadServir;
        }
        return "Se sirve una taza de " + cantidadServir +"cc";
    }

//        - vaciarCafetera(): pone la cantidad de café actual en cero.
    public String vaciarCafetera() {
        cantidadActual=0;
        return "La cafetera se vacía";
    }

//        - agregarCafe(int): añade a la cafetera la cantidad de café indicada.
    public String agregarCafe(int cantidadAgregar){
        String resultado ="";
        if ((cantidadActual+cantidadAgregar<=capacidadMaxima)) {
            this.cantidadActual += cantidadAgregar;
            resultado = "Se agregan " + cantidadAgregar + "cc";
        }
        else {
            cantidadActual=capacidadMaxima;
            resultado = "Solo caben " + (capacidadMaxima-cantidadActual) + "cc";
        }
        return resultado;
    }
}
