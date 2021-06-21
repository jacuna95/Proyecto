package com.ucreativa.project.entidades;

public class Reserva {

    private int id;
    private Cliente usuario;
    private boolean esSedan;
    private int vehiculo;
    private String fechaReserva;
    private double monto;
    private boolean finalizada;

    public Reserva(int id, Cliente usuario, boolean esSedan, int vehiculo, String fechaReserva, double monto, boolean finalizada) {
        this.id = id;
        this.usuario = usuario;
        this.esSedan = esSedan;
        this.vehiculo = vehiculo;
        this.fechaReserva = fechaReserva;
        this.monto = monto;
        this.finalizada = finalizada;
    }

    public String imprimir() {
        return "ID:" + getId() + "Nombre Usuario: " + getUsuario() + "Vehiculo" + getVehiculo() + "Tipo de vehiculo: " + getEsSedan() + "Fecha reserva:" + getFechaReserva()
                + " Costo de la Reserva: " + getMonto();
    }

    public int getId() {
        return id;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public boolean getEsSedan() {
        return esSedan;
    }

    public int getVehiculo() {
        return vehiculo;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public double getMonto() {
        return monto;
    }

}




