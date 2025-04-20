package com.mycompany.bibliotecavirtual;

public class libro {
    private int ID;
    private String nombre;
    private String autor;
    private double precio;

    public libro(int ID, String nombre, String autor, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    public String ToString(){
    return "ID:"+ ID + "Nombre del libro: " + nombre + "Autor: " + autor;
    
}
    
}
