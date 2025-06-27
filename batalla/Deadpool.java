/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalla;

/**
 *
 * @author Personal
 */
// Subclase de Personaje que representa al personaje Deadpool
// Clase que representa al personaje Deadpool
public class Deadpool extends Personajes {
    
    // Constructor con valores específicos para Deadpool
    public Deadpool(int vida) {
        super("Deadpool", vida, 100, 25, 15); // nombre, vida, daño máx, evasión %, regeneración
    }
}
