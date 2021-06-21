package com.ucreativa.project.entidades;

public class Sedan extends Vehiculo{

    private int cantidadPuertas;

    public Sedan(int id, String marca, boolean disponible, int cantidadPuertas) {
        super(id, marca, disponible);
        this.cantidadPuertas = cantidadPuertas;
    }

    public String imprimir(){
        return "ID: "+" "+super.getId()+" "+"Marca:"+" "+super.getMarca()+" " +"Disponible "+" "+super.isDisponible()+" "+"Puertas "+" "+cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

}




