package com.corenetwork.modelo;

public class Fecha {
    //atributos
    private int ano;
    private int mes;
    private int dia;

    @Override
    public String toString() {
        return "Fecha{" +
                "ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }

    public Fecha() {
    }

    public Fecha(int ano, int mes, int dia) throws Exception {
        this.ano = ano;
        setMes(mes);
        setDia(dia);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes>=1 && mes<=12) {
            this.mes = mes;}
        else{
            throw new Exception("El mes tiene que entrar en el rango de 1 a 12");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        //Validar que esté em el rango de 1 a 30
        int diasMes =0;
        switch (mes) {
            case 1,3,5,7,8,10,12 -> diasMes=31;
            case 2 -> {
                if (ano%4==0) {
                    diasMes=29;}
                else {
                    diasMes=28;}}
            case 4,6,9,11 -> diasMes=30;
        }
        if(dia>=1 && dia<=diasMes) {
            this.dia = dia;}
        else{
            throw new Exception("El día tiene que entrar en el rango de 1 a " + diasMes);
        }


    }
}
