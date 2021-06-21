package com.ucreativa.project.db;

import com.ucreativa.project.entidades.Reserva;
import com.ucreativa.project.entidades.Cliente;
import com.ucreativa.project.entidades.SUV;
import com.ucreativa.project.entidades.Sedan;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Cliente> usuarios = new ArrayList<Cliente>();
    private List<Sedan> sedanes = new ArrayList<Sedan>();
    private List<SUV> suvs = new ArrayList<SUV>();
    private List<Reserva> reservas = new ArrayList<Reserva>();

    public Repository() {
        sedanes.add(new Sedan(1," Toyota ",true,4));
        sedanes.add(new Sedan(2,"Honda",true,4));
        sedanes.add(new Sedan(3,"Nissan Skyline",true,2));
        sedanes.add(new Sedan(4,"Nissan",true,4));
        suvs.add(new SUV(1,"Suzuki",true,false));
        suvs.add(new SUV(2,"Nissan",true,true));
        suvs.add(new SUV(3,"Toyota",true,true));
        suvs.add(new SUV(4,"Hyundai",true,false));
        usuarios.add(new Cliente(1,"Jose Acuna","jacuna@jacuna.es"));
        usuarios.add(new Cliente(2,"Marco Vargas","mvargas@mvargas.es"));
        usuarios.add(new Cliente(3,"Bryner Araya","baraya@baraya.es"));
        usuarios.add(new Cliente(4,"Josue Gaitan","jgaitan@jgaitan.es"));
    }

    public List<Cliente> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Cliente> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Sedan> getSedanes() {
        return sedanes;
    }

    public void setSedanes(List<Sedan> sedanes) {
        this.sedanes = sedanes;
    }

    public List<SUV> getSuvs() {
        return suvs;
    }

    public void setSuvs(List<SUV> suvs) {
        this.suvs = suvs;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
