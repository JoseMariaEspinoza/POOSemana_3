package com.corenetwork.presentacion;

import com.corenetwork.modelo.Factura;

import java.util.*;

public class ProbarColecciones {
    public static void main(String[] args) {
        //Set No acepta repetidos y no guarda el orden
        Set conjunto = new HashSet();
        conjunto.add("Hola");
        conjunto.add(2);
        conjunto.add(2.5f);
        System.out.println(conjunto);

        System.out.println("Existe el elemento hola -> " + conjunto.contains("Hola"));
        System.out.println("Existe el elemento hola -> " + conjunto.contains("Hola mundo"));

        System.out.println("Número de elementos -> " + conjunto.size());
        conjunto.add("Hola mundo");
        System.out.println("Número de elementos -> " + conjunto.size());

        System.out.println("La colección está vacía ? -> " + conjunto.isEmpty());

        System.out.println("Se ha podido eliminar el elemento hola -> " + conjunto.remove("Hola"));

        System.out.println("Se ha podido añadir el elemento hola -> " + conjunto.add("Hola"));
        System.out.println("Se ha podido añadir el elemento hola -> " + conjunto.add("Hola"));

        Factura f1 = new Factura();
        conjunto.add(f1);
        System.out.println(conjunto);

        //List - Acepta repetidos - Respeta el orden de entrada
        List l1 = new ArrayList();
        l1.add(5);
        l1.add(f1);
        l1.add("hola");
        l1.add("Hola mundo");
        l1.add(5.5f);

        System.out.println(l1);
        System.out.println("Cuantos elementos tiene ? -> " + l1.size());
        System.out.println("contiene el elemento hola -> " + l1.contains("hola"));
        System.out.println("Está vacía la lista -> " + l1.isEmpty());
        System.out.println("Obtenme el elemento 0 -> " + l1.get(0));
        //Cambiar el elemento 0
        l1.set(0,7);
        System.out.println(l1);
        System.out.println("En que posición se encuentra \"Hola mundo\" -> " +
                l1.indexOf("Hola mundo"));
        System.out.println("Mostrando cada uno de los elementos");
        for (Object elemento : l1) {
            System.out.println(elemento);
        }
        System.out.println("Se pudo eliminar hola ? -> " + l1.remove("hola"));
        System.out.println(l1);

        //Estructura HashMap
        Map m1 = new HashMap();
        m1.put(1,"Hola");
        m1.put(2,"Hola mundo");
        m1.put(3,f1);
        m1.put(1,"Buenos días");
        m1.put("h", "Hola ");
        m1.put("f2",f1);
        System.out.println("Elementos del map -> " + m1);
        System.out.println("Obtener el elemento f2 -> " + m1.get("f2"));
        System.out.println("Obtener el elemento f2 -> " + ((Factura) m1.get("f2")).getIdFactura());
        System.out.println("Recorrer la columna de la tabla");
        //Recorrer los valores del Map (Tabla)
        for (Object elemento : m1.values()) {
            System.out.println(elemento);
        }
        System.out.println("Recorrer las claves del mapa");
        for (Object elemento : m1.keySet()) {
            System.out.println("Clave -> " + elemento);
            System.out.println("Valor -> " + m1.get(elemento));
        }
    }
}
