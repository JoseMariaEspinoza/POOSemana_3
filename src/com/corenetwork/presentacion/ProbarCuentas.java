package com.corenetwork.presentacion;

import com.corenetwork.modelo.CuentaMovimientos;

import java.util.Scanner;

public class ProbarCuentas {
    static CuentaMovimientos c1 = new CuentaMovimientos(1500);
    static Scanner teclado = new Scanner(System.in);
    static String seguir;
    static double cantidad=0;
    static int opcion;
    public static void main(String[] args) {
        do {
            mostrarMenu();
            opciones();
            }
        while (seguir.equalsIgnoreCase("s"));
    }
    public static void mostrarMenu(){
        System.out.println("Que acción desea realizar?" + "\n" +
                "1. Ingresar" +"\n" + "2. Extraer" +"\n" + "3. Mostrar saldo" +"\n" + "4. Mostrar movimientos");
    }
    public static void opciones(){
        try {
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> ingresar();
                case 2 -> extraer();
                case 3 -> System.out.println("Su saldo es de : " + c1.obtenerSaldo());
                case 4 -> System.out.println(c1.obtenerMovimentos());
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
            mostrarMenu();
        }
        System.out.println("Desea continuar?");
        seguir = teclado.next();
    }
    public static void ingresar(){
        System.out.println("Que cantidad desea ingresar?");
        cantidad = teclado.nextDouble();
        c1.ingresar(cantidad);
    }
    public static void extraer(){
        System.out.println("Que cantidad desea extraer?");
        c1.ajustarLimite();
        try {
            cantidad = teclado.nextDouble();
            c1.extraer(cantidad);
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
