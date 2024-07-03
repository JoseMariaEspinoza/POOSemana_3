package com.corenetwork.modelo;

import java.util.Arrays;

public class BlocNotas extends Nota {
//    c) Clase BlocNotas. Modela un bloc de notas en el que se pueden introducir notas, listar
//    todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuántas
//    notas contiene el bloc de notas. Debe utilizar la clase Array.
    public Nota[] blocNotas;

    public void introducirNotas(Nota n) throws Exception {
        //Validar el espacio este vacio
        blocNotas[n.idNota-1] = n;
    }

    public String listarNotas() {
        String listado ="";
        for (Nota elemento : blocNotas) {
            if (elemento!=null ) {
//                listado = listado + blocNotas.toString() + "\n";
                listado += elemento + "\n";
            }
        }
        return listado;
    }

    public boolean eliminarNotas(int idNota) {
        //Validar la posicion null y posicion menor que indice
        if (blocNotas[idNota-1]!=null) {
            //todo ok
            blocNotas[idNota-1] = null;
            return true;
        }
        else {
            return false;
        }
    }

    public int numeroNotas() {
        int contador=0;
        for (Nota elemento : blocNotas) {
            if (elemento != null) {
                contador++;
            }
        }
        return contador;
    }

    public BlocNotas (int numeroNotas) {
        blocNotas =new Nota[numeroNotas];
    }

}