/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalla;

/**
 *
 * @author Personal
 */
// Subclase de Personaje que representa al personaje Wolverine
public class Wolverine extends Personajes {
    
    // Constructor con valores específicos para Wolverine
    public Wolverine(int vida) {
        super("Wolverine", vida, 120, 20, 20); // nombre, vida, daño máx, evasión %, regeneración
    }
}


