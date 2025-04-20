package com.mycompany.bibliotecavirtual;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        BibliotecaServicio servicio = new BibliotecaServicio();
        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Bienvenido a la biblioteca virtual, dueño. ¿ Qué eliges?");
            System.out.println("1. Agregar un libro.");
            System.out.println("2. Listar Libros.");
            System.out.println("3. Eliminar un libro por ID.");
            System.out.println("Selecciona una opción.");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    servicio.crearLibro();
                    break;
                case 2:
                    servicio.listarLibro();
                    break;
                case 3:
                    servicio.eliminarLibro();
                    break;
                case 4:
                    System.out.println("Gracias por entrar a la biblioteca virtual!!!");
                    break;
                default:
                    System.out.println("ERROR. Por favor, elija una opción válida.");
            }
        } while (opcion != 3); 

        leer.close();  
    }
}
