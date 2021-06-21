package com.ucreativa.project.entidades;

public class Vehiculo {

    private int id;
    private String marca;
    private boolean disponible;

    public Vehiculo(int id, String marca, boolean disponible) {
        this.id = id;
        this.marca = marca;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }


    public boolean isDisponible() {
        return disponible;
    }




}

