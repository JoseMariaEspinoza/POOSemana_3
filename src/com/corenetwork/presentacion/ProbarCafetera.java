package com.corenetwork.presentacion;

import com.corenetwork.modelo.Cafetera;

public class ProbarCafetera {
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera(2000,1500);
        System.out.println("Cantidad actual en la cafetera -> " +c1.getCantidadActual()+"cc");
        System.out.println(c1.servirTaza(250));
        System.out.println("Cantidad actual en la cafetera -> " +c1.getCantidadActual()+"cc");
        System.out.println(c1.vaciarCafetera());
        System.out.println("Cantidad actual en la cafetera -> " +c1.getCantidadActual()+"cc");
        System.out.println(c1.agregarCafe(1500));
        System.out.println("Cantidad actual en la cafetera -> " +c1.getCantidadActual()+"cc");
        System.out.println(c1.llenarCafetera());
        System.out.println("Cantidad actual en la cafetera -> " +c1.getCantidadActual()+"cc");
    }
}
