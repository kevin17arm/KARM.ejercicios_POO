/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compocicionmultiple;

/**
 *
 * @author Formacion
 */
public class CompocicionMultiple {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Sudamericana", "REF001", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "Secker & Warburg", "REF002", 1949);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear revistas
        Revista revista1 = new Revista("National Geographic", 2024, "Mensual", "NatGeo", "Estados Unidos");
        Revista revista2 = new Revista("Muy Interesante", 2023, "Mensual", "G+J", "España");
        biblioteca.agregarRevista(revista1);
        biblioteca.agregarRevista(revista2);

        // Mostrar libros y revistas
        biblioteca.mostrarLibros();
        biblioteca.mostrarRevistas();
    }
}

