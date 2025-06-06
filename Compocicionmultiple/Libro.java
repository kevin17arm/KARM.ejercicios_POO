/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compocicionmultiple;

/**
 *
 * @author Formacion
 */

public class Libro extends Publicacion {
    String titulo, autor, referenciaBibliografica;

    public Libro(String titulo, String autor, String editorial, String referenciaBibliografica, int anioPublicacion) {
        super(editorial, anioPublicacion);
        this.titulo = titulo;
        this.autor = autor;
        this.referenciaBibliografica = referenciaBibliografica;
    }

    @Override
    public void imprimir() {
        System.out.println("LIBRO");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Referencia: " + referenciaBibliografica);
        super.imprimir();
        System.out.println(); // Espacio en blanco
    }
}



