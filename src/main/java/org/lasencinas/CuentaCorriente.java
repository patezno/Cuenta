package org.lasencinas;

public class CuentaCorriente {

    // Atributos

    private String nombre = null;
    private String apellidos = null;
    private String direccion = null;
    private String telefono = null;
    private Dni dni = null;
    private double saldo = 0d;

    // Constructores

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, Dni dni, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.saldo = saldo;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos

    public void retirarDinero(double importe) {
        setSaldo(getSaldo() - importe);
    }

    public void ingresarDinero(double importe) {
        setSaldo(getSaldo() + importe);
    }

    public String consultarCuenta() {
        return "Nombre y apellidos de la cuenta: " + getNombre() + " " + getApellidos() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Teléfono: " + getTelefono() + "\n" +
                "Dni: " + getDni().getDni() + "\n" +
                "Saldo: " + getSaldo();
    }

    public boolean saldoNegativo() {
        return getSaldo() < 0;
    }
}
