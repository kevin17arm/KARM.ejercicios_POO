/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batalla;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
// Clase principal que ejecuta la batalla por turnos entre Deadpool y Wolverine
public class Batalla {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Solicita la vida inicial de cada personaje al usuario
        System.out.print("Vida inicial de Deadpool: ");
        int vidaDeadpool = sc.nextInt();

        System.out.print("Vida inicial de Wolverine: ");
        int vidaWolverine = sc.nextInt();

        // Crea los personajes con sus valores iniciales
        Personajes deadpool = new Deadpool(vidaDeadpool);
        Personajes wolverine = new Wolverine(vidaWolverine);

        int turno = 1;

        // Bucle que se ejecuta mientras ambos estén vivos
        while (deadpool.estaVivo() && wolverine.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Turno de Deadpool
            if (deadpool.puedeActuar()) {
                deadpool.regenerarVida(); // Regenera vida antes de atacar
                int danio = deadpool.atacar(wolverine); // Ataca a Wolverine
                if (danio > 0) {
                    System.out.println(deadpool.getNombre() + " ataca con " + danio + " de daño");
                    System.out.println(wolverine.getNombre()+ " recibio "+danio);
                    if (danio == 100) System.out.println("¡Golpe crítico! Wolverine pierde su siguiente turno.");
                } else {
                    System.out.println("Wolverine esquivó el ataque de Deadpool");
                }
            } else {
                System.out.println("Deadpool se recupera y no ataca este turno.");
            }

            // Si Wolverine muere, se detiene la batalla
            if (!wolverine.estaVivo()) break;

            Thread.sleep(1000); // Pausa para dramatismo

            // Turno de Wolverine
            if (wolverine.puedeActuar()) {
                wolverine.regenerarVida(); // Regenera vida antes de atacar
                int danio = wolverine.atacar(deadpool); // Ataca a Deadpool
                if (danio > 0) {
                    System.out.println(wolverine.getNombre() + " ataca con " + danio + " de daño");
                    System.out.println(deadpool.getNombre() + " recibio " + danio);
                    if (danio == 120) System.out.println("¡Golpe crítico! Deadpool pierde su siguiente turno.");
                } else {
                    System.out.println("Deadpool esquivó el ataque de Wolverine");
                }
            } else {
                System.out.println("Wolverine se recupera y no ataca este turno.");
            }

            // Muestra la vida restante de cada personaje
            System.out.println("Vida de Deadpool: " + deadpool.getVida());
            System.out.println("Vida de Wolverine: " + wolverine.getVida());

            Thread.sleep(1000);
            turno++;
        }

        // Resultado final de la batalla
        System.out.println("\n--- ¡La batalla ha terminado! ---");
        if (deadpool.estaVivo()) {
            System.out.println("Deadpool es el ganador.");
        } else {
            System.out.println("Wolverine es el ganador.");
        }
    }
}
