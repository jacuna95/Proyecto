package com.ucreativa.project.logica;

public interface serviceInterface{

        String agregarReserva(int cedulaUsuario, boolean esSedan, int idVehiculo, double monto, String fecha);
        String terminarReserva(int reservaID);
        String obtenerSedan();
        String obtenerSUV();
        String obtenerUsuario();
        String obtenerReserva();



}

