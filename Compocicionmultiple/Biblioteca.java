/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compocicionmultiple;
import java.util.ArrayList;
/**
 *
 * @author Formacion
 */

public class Biblioteca {
    String nombre;
    ArrayList<Libro> coleccionLibros;
    ArrayList<Revista> coleccionRevistas;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new ArrayList<>();
        coleccionRevistas = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
    }

    public void agregarRevista(Revista revista) {
        coleccionRevistas.add(revista);
    }

    public void mostrarLibros() {
        System.out.println("=== LIBROS EN LA BIBLIOTECA ===");
        for (Libro libro : coleccionLibros) {
            libro.imprimir();
        }
    }

    public void mostrarRevistas() {
        System.out.println("=== REVISTAS EN LA BIBLIOTECA ===");
        for (Revista revista : coleccionRevistas) {
            revista.imprimir();
        }
    }
}
