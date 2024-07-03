package com.corenetwork.modelo;

import java.time.LocalTime;

public class NotaAlarma extends Nota {
//    b) Clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma.
//    Defina constructores, getters y setter y toString.
    public LocalTime hora;

    @Override
    public String toString() {
        return "NotaAlarma{" +
                "hora=" + hora +
                "} " + super.toString();
    }

    public NotaAlarma() {
    }

    public NotaAlarma(int idNota, String text, LocalTime hora) {
        super(idNota, text);
        this.hora = hora;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
