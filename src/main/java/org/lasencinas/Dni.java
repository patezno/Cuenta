package org.lasencinas;

public class Dni {

    private int numeros = 0;
    private String letra = null;
    private String dni = null;

    public Dni() {
    }

    public Dni(int numeros, String letra) {
        this.numeros = numeros;
        this.letra = letra;
        this.dni = getNumeros() + getLetra();
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
