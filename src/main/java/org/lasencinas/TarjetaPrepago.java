package org.lasencinas;

public class TarjetaPrepago {

    private String numeroTelefono = null;
    private Dni nif = null;
    private Double saldo = 0d;
    private Hora consumo = null;
    private int establecimiento = 15;

    public TarjetaPrepago() {
    }

    public TarjetaPrepago(String numeroTelefono, Dni nif, Double saldo) {
        this.numeroTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
        this.consumo = new Hora();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Dni getNif() {
        return nif;
    }

    public void setNif(Dni nif) {
        this.nif = nif;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Hora getConsumo() {
        return consumo;
    }

    public void setConsumo(Hora consumo) {
        this.consumo = consumo;
    }

    public void ingresarSaldo(Double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    public void enviarMensaje(int cantidad) {
        double dinero = cantidad * 9;
        dinero = dinero / 100;
        setSaldo(getSaldo() - dinero);
    }

    public void realizarLlamada(int segundos) {
        double dinero = segundos + establecimiento;
        dinero = dinero / 100;
        setSaldo(getSaldo() - dinero);
        double tiempo = calcularHora() + segundos;
        guardarHora(tiempo);

    }

    public String consultarTarjeta() {
        return "Número de teléfono: " + getNumeroTelefono() + "\n" +
                "DNI: " + getNif().getDni() + "\n" +
                "Saldo disponible: " + getSaldo() + "\n" +
                "Consumo total: " + getConsumo().imprimirHora();
    }

    private double calcularHora() {
        double horas = consumo.getTime() * 3600;
        double minutos = consumo.getMinutos() * 60;
        double segundos = consumo.getSegundos();
        return horas + minutos + segundos;
    }

    private void guardarHora(double tiempo) {
        Double horas = tiempo / 3600;
        Double resto = tiempo % 3600;
        Double minutos = resto / 60;
        Double segundos = resto % 60;
        consumo.setHora(horas.intValue(), minutos.intValue(), segundos.intValue());
    }
}
