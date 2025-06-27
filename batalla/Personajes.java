/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalla;
import java.util.Random;
/**
 *
 * @author Personal
 */
// Clase abstracta que define las propiedades y comportamientos comunes de todos los personajes
public abstract class Personajes {
    String nombre;            // Nombre del personaje
    int vida;                 // Vida actual del personaje
    int vidaMaxima;           // Vida máxima que puede tener
    int maxDanio;             // Daño máximo que puede causar
    int evasion;              // Probabilidad de evadir ataques (%)
    int regeneracion;         // Vida que regenera por turno
    boolean saltaTurno = false; // Si debe omitir su siguiente turno
    boolean recibioGolpeCritico = false; // recibe golpe critico
    static final Random random = new Random(); // Generador de números aleatorios

    // Constructor para inicializar todos los atributos
    public Personajes(String nombre, int vida, int maxDanio, int evasion, int regeneracion) {
    this.nombre = nombre;
    this.vida = vida;
    this.vidaMaxima = vida;
    this.maxDanio = maxDanio;
    this.evasion = evasion;
    this.regeneracion = regeneracion;
}
    // Indica si el personaje puede actuar este turno (si no perdió turno)
    public boolean puedeActuar() {
        if (saltaTurno) {
            saltaTurno = false;
            return false;
        }
        return true;
    }

    // Determina si el personaje esquiva un ataque
    public boolean esquivaAtaque() {
        return random.nextInt(100) < evasion;
    }
    

    // Método para atacar a otro personaje
    public int atacar(Personajes objetivo) {
    int danio = random.nextInt(maxDanio - 9) + 10;
    boolean critico = danio == maxDanio;
    if (!objetivo.esquivaAtaque()) {
        objetivo.recibirDanio(danio, critico);
    } else {
        danio = 0;
    }
    if (critico) {
        objetivo.saltaTurno = true;
    }
    return danio;
}



    // Reduce la vida del personaje al recibir daño
    public void recibirDanio(int danio, boolean critico) {
    vida -= danio;
    if (critico) {
        recibioGolpeCritico = true;
        System.out.println("danio"+danio);
    }
}


    // Aumenta la vida del personaje hasta el máximo permitido
    public void regenerarVida() {
    if (recibioGolpeCritico && vida < vidaMaxima) {
        int antes = vida;
        vida += regeneracion;
        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }
        System.out.println(nombre + " regenera " + (vida - antes) + " puntos de vida por haber recibido un golpe crítico.");
        recibioGolpeCritico = false;
    }
}



    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    // Devuelve la vida actual, sin permitir números negativos
    public int getVida() {
        return Math.max(vida, 0);
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return nombre;
    }
}