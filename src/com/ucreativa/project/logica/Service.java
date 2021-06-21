package com.ucreativa.project.logica;

import com.ucreativa.project.entidades.Reserva;
import com.ucreativa.project.db.Repository;
import com.ucreativa.project.entidades.Cliente;
import com.ucreativa.project.entidades.SUV;
import com.ucreativa.project.entidades.Sedan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service implements serviceInterface {

    private Repository repository;

    public Service() {
        repository = new Repository();
    }

    @Override
    public String agregarReserva(int cedulaUsuario, boolean esSedan, int idVehiculo, double monto, String fecha) {
        Random rand = new Random();

        if(obtenerCliente(cedulaUsuario) != null){
            if(esSedan){
                boolean resultado = validarSedan(idVehiculo);
                if(resultado){
                    Reserva reserva = new Reserva(rand.nextInt(4536),obtenerCliente(cedulaUsuario),esSedan,idVehiculo,fecha,monto,false);
                    List<Reserva> reservas= repository.getReservas();
                    reservas.add(reserva);
                    repository.setReservas(reservas);
                } else {
                    return "Vehiculo no existe o no está disponible";
                }
            }else{

                boolean resultado = validarSUV(idVehiculo);
                if(resultado){
                    Reserva reserva = new Reserva(rand.nextInt(4536),obtenerCliente(cedulaUsuario),esSedan,idVehiculo,fecha,monto,false);
                    List<Reserva> reservas= repository.getReservas();
                    reservas.add(reserva);
                    repository.setReservas(reservas);
                } else {
                    return "Vehiculo no existe o no está disponible";
                }
            }
        }else{
            return "Cliente no existe";
        }

        return "Reserva realizada";
    }

    public Cliente obtenerCliente(int cedula){
        List<Cliente> clientes = repository.getUsuarios();
        for (Cliente cliente:clientes){
            if(cliente.getCedula()==cedula){
                return cliente;
            }
        }
        return null;
    }

    public boolean validarSedan(int id){
        List<Sedan> sedanes = repository.getSedanes();
        for (Sedan sedan:sedanes){
            if (sedan.getId()==id && sedan.isDisponible()){
                actualizarListaSedan(id);
                return true;
            }
        }
        return false;
    }

    public boolean validarSUV(int id){
        List<SUV> suvs = repository.getSuvs();
        for (SUV suv:suvs){
            if (suv.getId()==id && suv.isDisponible()){
                actualizarListaSUV(id);
                return true;
            }
        }
        return false;
    }

    public void actualizarListaSedan(int id){
        List<Sedan> old = repository.getSedanes();
        List<Sedan> nueva = new ArrayList<Sedan>();
        for(Sedan sedan:old){
            if(sedan.getId() == id){
                nueva.add(new Sedan(sedan.getId(),sedan.getMarca(),false,sedan.getCantidadPuertas()));
            }else{
                nueva.add(sedan);
            }
        }
        repository.setSedanes(nueva);
    }

    public void actualizarListaSUV(int id){
        List<SUV> old = repository.getSuvs();
        List<SUV> nueva = new ArrayList<SUV>();
        for(SUV suv:old){
            if(suv.getId() == id){
                nueva.add(new SUV(suv.getId(),suv.getMarca(),false,suv.isDobleTraccion()));
            }else{
                nueva.add(suv);
            }
        }
        repository.setSuvs(nueva);
    }

    @Override
    public String terminarReserva(int reservaID) {
        List<Reserva> reservas=repository.getReservas();
        List<Reserva> reservasnew = new ArrayList<Reserva>();
        boolean r=false;
        for(Reserva reserva:reservas){
            if(reserva.getId()==reservaID){
                r=true;
                reservasnew.add(new Reserva(reserva.getId(),reserva.getUsuario(),reserva.getEsSedan(),reserva.getVehiculo(),reserva.getFechaReserva(),reserva.getMonto(),true));
            }else{
                reservasnew.add(reserva);
            }
        }
        repository.setReservas(reservasnew);
        if(r){
            return "Reserva finalizada";
        }else{
            return "Reserva no existe";
        }
    }

    @Override
    public String obtenerSedan() {
        List<Sedan> sedanes=repository.getSedanes();
        String resultado="";
        for (Sedan sedan:sedanes) {
            resultado= resultado+sedan.imprimir()+"\n";
        }
        return resultado;
    }

    @Override
    public String obtenerSUV() {
        List<SUV> suvs=repository.getSuvs();
        String resultado="";
        for(SUV suv:suvs){
            resultado=resultado+suv.imprimir()+"\n";
        }
        return resultado;
    }

    @Override
    public String obtenerUsuario() {
        List<Cliente> clientes=repository.getUsuarios();
        String resultado="";
        for(Cliente cliente:clientes){
            resultado=resultado+cliente.imprimir()+"\n";
        }
        return resultado;
    }

    @Override
    public String obtenerReserva() {
        List<Reserva> reserva=repository.getReservas();
        String resultado="";
        for(Reserva reservas:reserva){
            resultado=resultado+ reservas.imprimir()+"\n";
        }
        return resultado;
    }
}




