package com.corenetwork.presentacion;

import com.corenetwork.modelo.Factura;

public class ProbarFactura {
    public static void main(String[] args) throws Exception {
        Factura f1 = new Factura(0,1);
        Factura f2 = new Factura(1,1);
        try {
            f1.comprobarFactura();
            f2.comprobarFactura();
        }
        catch(Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
