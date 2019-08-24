package org.lasencinas;

import java.util.ArrayList;
import java.util.List;

public class Hora {

    private int time = 0;
    private int minutos = 0;
    private int segundos = 0;

    public Hora() {
    }

    public Hora(int time, int minutos, int segundos) {
        setHora(time, minutos, segundos);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setHora(int hora, int minutos, int segundos) {
        if ((hora > 24) || (minutos > 59) || (segundos > 59)) {
            this.time = 0;
            this.minutos = 0;
            this.segundos = 0;
        } else {
            this.time = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    public List<Integer> getHora() {
        List<Integer> fullHora = new ArrayList<>();
        fullHora.add(getTime());
        fullHora.add(getMinutos());
        fullHora.add(getSegundos());
        return fullHora;
    }

    public String imprimirHora() {
        return getTime() + ":" + getMinutos() + ":" + getSegundos();
    }
}
