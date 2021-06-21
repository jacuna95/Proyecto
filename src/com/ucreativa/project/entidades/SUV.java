package com.ucreativa.project.entidades;

public class SUV extends Vehiculo {

    private boolean dobleTraccion;

    public SUV(int id, String marca, boolean disponible, boolean dobleTraccion) {
        super(id, marca, disponible);
        this.dobleTraccion = dobleTraccion;
    }

    public boolean isDobleTraccion() {
        return dobleTraccion;
    }

    public String imprimir() {
        return "ID:"+" "+ super.getId() +" "+ "Marca:"+" "+ super.getMarca() + " " + "Disponible " +" "+ super.isDisponible() + " " + "Es 4*4 " + dobleTraccion;
    }
}



