package com.corenetwork.presentacion;

import com.corenetwork.modelo.CuentaMovimientos;

import java.util.Scanner;

public class ProbarCuentas {
    public static void main(String[] args) {
        CuentaMovimientos c1 = new CuentaMovimientos(1500);
        Scanner teclado = new Scanner(System.in);
        String seguir; double cantidad=0; int opcion;
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Que cantidad desea ingresar?");
                        cantidad = teclado.nextDouble();
                        c1.ingresar(cantidad);
                    }
                    case 2 -> {
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
                    case 3 -> {
                        System.out.println("Su saldo es de : " + c1.obtenerSaldo());
                    }
                    case 4 -> System.out.println(c1.obtenerMovimentos());
                }
            System.out.println("Desea continuar?");
            seguir = teclado.next();
            }
        while (seguir.equalsIgnoreCase("s"));
    }
    public static void mostrarMenu(){
        System.out.println("Que acción desea realizar?" + "\n" +
                "1. Ingresar" +"\n" + "2. Extraer" +"\n" + "3. Mostrar saldo" +"\n" + "4. Mostrar movimientos");
    }
}
