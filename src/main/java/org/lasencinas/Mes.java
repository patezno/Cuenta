package org.lasencinas;

public enum Mes {

    Enero(1),
    Febrero(2),
    Marzo(3),
    Abril(4),
    Mayo(5),
    Junio(6),
    Julio(7),
    Agosto(8),
    Septiembre(9),
    Octubre(10),
    Noviembre(11),
    Diciembre(12);

    private int mes = 0;

    Mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }
}
