package com.corenetwork.modelo;

public class Nota {
    //a) Clase Nota. Una nota contiene un identificador numérico y una línea de texto. Defina
    //constructores, getters y setter y toString.
    public int idNota;
    public String text;

    @Override
    public String toString() {
        return "Nota{" +
                "idNum=" + idNota +
                ", text='" + text + '\'' +
                '}';
    }

    public Nota() {
    }

    public Nota(int idNota, String text) {
        this.idNota = idNota;
        this.text = text;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
