package org.lasencinas;

public class Fecha {

    private int dia = 0;
    private int mes = 0;
    private int año = 0;
    private String fecha = null;

    public Fecha() {
        setFechaVacia();
    }

    public Fecha(int dia, int mes, int año) {
        if ((dia < 32) || (mes < 13)) {
            setDia(dia);
            setMes(mes);
            setAño(año);
            setFecha(getDia() + "-" + getMes() + "-" + getAño());
        } else {
            setFechaVacia();
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void incrementarFecha(int dias) {
        setDia(getDia() + dias);
    }

    public String imprimirFecha() {
        String mes = mesLetra();
        return getDia() + "-" + mes + "-" + getAño();
    }

    private void setFechaVacia() {
        setDia(1);
        setMes(1);
        setAño(1900);
        setFecha(getDia() + "-" + getMes() + "-" + getAño());
    }

    private String mesLetra() {
        Mes mes[] = Mes.values();
        String mesCorrecto = null;
        for (Mes mesInt : mes) {
            if (getMes() == mesInt.getMes()) {
                mesCorrecto = mesInt.name();
            }
        }
        return mesCorrecto;
    }
}
