package com.corenetwork.presentacion;

import com.corenetwork.modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args)  {
        Fecha f1 = null;
        try {
            f1 = new Fecha(2024, 12,32);
            System.out.println(f1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
