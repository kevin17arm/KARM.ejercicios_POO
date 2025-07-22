/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenafiltrado;

/**
 *
 * @author Aprendiz
 */
public class CadenaFiltrado {
    
    public static void main(String[] args) {
        FiltroEmail spam = new FiltroSpam();
        FiltroEmail virus = new FiltroVirus();
        FiltroEmail contenido = new FiltroContenido();

        spam.setSiguiente(virus);
        virus.setSiguiente(contenido);

        String correo1 = "¡Gana ya dinero fácil desde casa!";
        String correo2 = "Adjunto archivo peligroso: adjunto.exe";
        String correo3 = "Este mensaje contiene contenido ofensivo";
        String correo4 = "Reunión programada para mañana a las 10am";

        System.out.println("\nProcesando correo 1:");
        spam.procesar(correo1);

        System.out.println("\nProcesando correo 2:");
        spam.procesar(correo2);

        System.out.println("\nProcesando correo 3:");
        spam.procesar(correo3);

        System.out.println("\nProcesando correo 4:");
        spam.procesar(correo4);
    }
}
