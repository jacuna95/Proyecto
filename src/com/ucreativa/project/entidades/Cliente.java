package com.ucreativa.project.entidades;

public class Cliente {

    private int usuarioID;
    private String nombreCompleto;
    private String email;

    public String getNombre() {
        return nombreCompleto;
    }

    public int getCedula() {
        return usuarioID;
    }

    public String getEmail() {
        return email;
    }

    public Cliente(int usuarioID, String nombreCompleto, String email) {
        this.usuarioID = usuarioID;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
}
    public String imprimir() {
        return "ID:"+" "+getCedula() +" "+ "Nombre usuario:"+" "+getNombre()+" "+"Contacto usuario:"+" "+ getEmail();
    }

}




