package com.mycompany.bibliotecavirtual;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class BibliotecaServicio {
    private ArrayList<usuario> usuarios;
    private ArrayList<libro> libros;
    Scanner leer = new Scanner(System.in);

    public BibliotecaServicio() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void crearLibro() {
        System.out.println("Ingrese el ID del libro:");
        int id = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el nombre del libro:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = leer.nextLine();

        System.out.println("Ingrese el precio del libro:");
        double precio = leer.nextDouble();

        libro nuevoLibro = new libro(id, nombre, autor, precio);
        libros.add(nuevoLibro);

        System.out.println("Libro agregado con éxito.");
    }
    public void listarLibro() {
    if (libros.isEmpty()) {
        System.out.println("No hay libros en la lista");
    } else {
        System.out.println("Lista de libros:");
        for (libro l : libros) {
            System.out.println("Nombre del libro: " + l.getNombre());
            System.out.println("ID del libro: " + l.getID());
            System.out.println("Nombre del autor: " + l.getAutor());
            System.out.println("Precio del libro: $" + l.getPrecio());
            System.out.println("-------------------------");
        }
    }
}
    
   public void eliminarLibro() {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el ID del libro que desee eliminar: ");
       int id = leer.nextInt();
       
       boolean eliminado = false;
       Iterator<libro> iterator = libros.iterator();  
       while (iterator.hasNext()){
           libro libro = iterator.next();
           if (libro.getID() == id){
               iterator.remove();
               eliminado = true;
               System.out.println("Libro se ha eliminado con exito");
               break;
                       
           }
       }
       if(!eliminado) {
           System.out.println("No se encontró el libro con ese ID.");
       }
       
   }

        
}




