package com.ucreativa.project;

import com.ucreativa.project.logica.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner print = new Scanner(System.in);
            Service service = new Service();
            int Ruser = 10;
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*>>>>>>>>>>>>>>>>>>>>>>-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*<Bienvenido Renta Car>-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

            while (Ruser != 7) {
                System.out.println("Menu de Opciones");
                System.out.println("Digite:" + "\n" +
                        "1 mostrar la lista de clientes" + "\n" +
                        "2 mostrar la lista de vehiculos Sedan" + "\n" +
                        "3 mostrar la lista de vehiculos SUV" + "\n" +
                        "4 mostrar la lista de reservas realizadas" + "\n" +
                        "5 realizar un nuevo alquiler de vehiculo" + "\n" +
                        "6 para terminar un proceso de alquiler" + "\n" +
                        "7 salir del programa");

                Ruser = Integer.parseInt(print.nextLine());

                if (Ruser == 1) {
                    System.out.println(service.obtenerUsuario());
                }
                if (Ruser == 2) {
                    System.out.println(service.obtenerSedan());
                }
                if (Ruser == 3) {
                    System.out.println(service.obtenerSUV());
                }
                if (Ruser == 4) {
                    System.out.println(service.obtenerReserva());
                }
                if (Ruser == 5) {
                    System.out.println("Indique la Cédula del Usuario: ");
                    int cedulaUsuario = Integer.parseInt(print.nextLine());

                    System.out.println("Indique si es un vehiculo tipo sedan: ");
                    boolean esSedan = Boolean.parseBoolean(print.nextLine());

                    System.out.println("ID del Vehiculo: ");
                    int idVehiculo = Integer.parseInt(print.nextLine());

                    System.out.println("Costo del alquiler del Vehiculo: ");
                    double monto = Double.parseDouble(print.nextLine());

                    System.out.println("Indique la fecha: ");
                    String fecha = print.nextLine();

                    System.out.println(service.agregarReserva(cedulaUsuario, esSedan, idVehiculo, monto, fecha));
                }
                if (Ruser == 6) {
                    System.out.println("Indique el ID del alquiler:");
                    int reservaID = Integer.parseInt(print.nextLine());
                    System.out.println(service.terminarReserva(reservaID));
                }
                if (Ruser == 7) {
                    System.out.println("Fin de programa");
                } else
                    System.out.println("---ingrese una opción del menú---");
            }
        } catch (Exception e) {
            System.out.println("Digite una opción valida");

        }
    }}

