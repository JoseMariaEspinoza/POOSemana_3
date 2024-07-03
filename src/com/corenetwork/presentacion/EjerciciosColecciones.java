package com.corenetwork.presentacion;

import java.lang.reflect.Constructor;
import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        //   Ejercicio 1
        // Cree una clase que tenga un objeto de la clase HashSet, que añada varias cadenas al objeto e imprima todas las cadenas.
        // Utilizar el tipo genérico String.
        Set<String> ejercicio1 = new HashSet<>();
        ejercicio1.add("Hola mundo");
        ejercicio1.add("Hello world");
        ejercicio1.add("Hola");
        ejercicio1.add("mundo");
        ejercicio1.add("Hello");
        ejercicio1.add("world");
        System.out.println("Ejercicio1");
        for (Object elemento : ejercicio1) {
            System.out.println(elemento);
        }

        // Ejercicio 2
        // Cree un objeto de la clase ArrayList, añada una lista de cadenas y utilice un bucle for each.
        List<String> ejercicio2 = new ArrayList<>();
        ejercicio2.add("Hola mundo");
        ejercicio2.add("Hello world");
        ejercicio2.add("Hola");
        ejercicio2.add("mundo");
        ejercicio2.add("Hello");
        ejercicio2.add("world");
        System.out.println("\n" + "Ejercicio2");
        for (Object elemento : ejercicio2) {
            System.out.println(elemento);
        }

        // Ejercicio 3
        // Cree un programa almacene números del 0 al 9 en un array y en una lista, e imprima sus valores.
        int[] arrayEj3 = new int[10];
        List<Integer> listaEj3 = new ArrayList<>();
        for ( int i =0 ; i<=9 ; i++) {
            arrayEj3[i]=i;
            listaEj3.add(i);
        }
        System.out.println("\n" + "Ejercicio3");
        System.out.println("\n" + "Array");
        for (Object elemento : arrayEj3) {
            System.out.println(elemento);
        }System.out.println(Arrays.toString(arrayEj3));

        System.out.println("\n" + "Lista");
        for (Object elemento : listaEj3) {
            System.out.println(elemento);
        }System.out.println(listaEj3);

        // Ejercicio 4
        // Cree un programa que almacene la nota de una asignatura de varios alumnos en una colección de tipo Map.
        // El alumno se identificará por su nombre.
        // Cada elemento del mapa estará formado por nombre de tipo String y nota de tipo Integer. Utilizar tipos genéricos.
        Map<String,Integer> mapEj4 = new HashMap<>();
        mapEj4.put("Juan Perez", 9);
        mapEj4.put("Jose Alvarez", 7);
        mapEj4.put("Sara Espinoza",4);
        System.out.println("\n" + "Ejercicio4");
        for (Object elemento : mapEj4.keySet()) {
            System.out.println("Nombre -> " + elemento
            + "- " + mapEj4.get(elemento));
            if (mapEj4.get(elemento)>=5) {
                System.out.println("Está aprobado");
            }
        }

        // Ejercicio 5
        // Cree un programa que implemente un diccionario.
        // El diccionario debe contener palabras en castellano y una lista de posibles significados de cada palabra.
        // Crear la clase Palabra que permita almacenar la información de una palabra, junto con sus definiciones.
        // Utilizar un objeto HashMap para almacenar palabras en la clase Diccionario.
        Map<String,List<String>> diccionario = new HashMap<>();
        List<String> genero = new ArrayList<>();
        genero.add("\n " +"1. " + "nombre masculino" +"\n"+ "Conjunto de seres que tienen uno o varios caracteres comunes."+"\n ");
        genero.add("\n " +"2. " + "nombre masculino" + "\n "+ "Clase o tipo a que pertenecen personas o cosas."+"\n "+ "Ej: \"Ese género de bromas no me gusta.\""+"\n ");
        diccionario.put("genero",genero);
        System.out.println("\n" + "Ejercicio5");
        System.out.println(diccionario);
        List<String> valor = new ArrayList<>();
        valor.add("\n " +"1. " + "nombre masculino"+"\n "+ "Grado de utilidad o aptitud de las cosas para satisfacer las necesidades o proporcionar bienestar o deleite."+"\n ");
        valor.add("\n " +"2. "+ "nombre masculino"+"\n "+ "Cualidad de las cosas, en virtud de la cual se da por poseerlas cierta suma de dinero o equivalente."+"\n ");
        diccionario.put("valor",valor);
        System.out.println(diccionario);


//                Enunciado 3
//        Defina los siguientes elementos:
//        - interface Puerta: con los métodos abrir y cerrar.
//        - interface PuertaBloqueable: extiende de Puerta, con los métodos bloquea y desbloquea.
//                - interface Alarma: con los métodos isAlarmaActivada, activarAlarma y desactivarAlarma.
//        - clase ComponentedeCoche: con los atributos descripción, peso y coste, y un método que muestre dichos atributos.
//        - clase PuertaCoche, con el atributo boolean estaBloqueada, y que extienda la clase ComponentedeCoche e implemente las interfaces Alarma y Puertabloqueable.
//        Escriba un programa que pruebe la clase PuertaCoche y todas las operaciones que admite.
    }

}
