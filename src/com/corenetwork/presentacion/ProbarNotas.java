package com.corenetwork.presentacion;

import com.corenetwork.modelo.BlocNotas;
import com.corenetwork.modelo.Nota;
import com.corenetwork.modelo.NotaAlarma;

import java.time.LocalTime;

public class ProbarNotas {
    public static void main(String[] args) {
        Nota n1 = new Nota(1,"Hola mundo");
        NotaAlarma n2 = new NotaAlarma(2,"Hello world", LocalTime.now());
        BlocNotas b1 = new BlocNotas(10);
        try {
            b1.introducirNotas(n1);
            b1.introducirNotas(n2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(b1.listarNotas());
        System.out.println(b1.eliminarNotas(5));
        System.out.println(b1.listarNotas());

    }
}
