
package com.mycompany.bibliotecavirtual;


public class usuario {
    private int  legajo;
    private String nombre;
    private String login;
    private String contraseña;

    public usuario(int legajo, String nombre, String login, String contraseña) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.login = login;
        this.contraseña = contraseña;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int Legajo) {
        this.legajo = Legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
