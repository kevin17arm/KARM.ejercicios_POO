/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compocicionmultiple;

/**
 *
 * @author Formacion
 */

public class Revista extends Publicacion {
    String nombreRevista, periodicidad, pais;

    public Revista(String nombreRevista, int anioPublicacion, String periodicidad, String editorial, String pais) {
        super(editorial, anioPublicacion);
        this.nombreRevista = nombreRevista;
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    @Override
    public void imprimir() {
        System.out.println("REVISTA");
        System.out.println("Nombre: " + nombreRevista);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("País: " + pais);
        super.imprimir();
        System.out.println(); // Espacio en blanco
    }
}

