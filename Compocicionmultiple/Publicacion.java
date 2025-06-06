/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compocicionmultiple;

/**
 *
 * @author Formacion
 */
public class Publicacion {
    String editorial;
    int anioPublicacion;

    public Publicacion(String editorial, int anioPublicacion) {
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    public void imprimir() {
        System.out.println("Editorial: " + editorial);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}