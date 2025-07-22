/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadenafiltrado;

/**
 *
 * @author Aprendiz
 */
// Clase base
abstract class FiltroEmail {
    
    protected FiltroEmail siguiente;

    public void setSiguiente(FiltroEmail siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesar(String mensaje);
}

// Filtro de spam
class FiltroSpam extends FiltroEmail {
    public void procesar(String mensaje) {
        if (mensaje.contains("dinero fácil") || mensaje.contains("gana ya")) {
            System.out.println("FiltroSpam: Marcado como spam.");
        } else if (siguiente != null) {
            siguiente.procesar(mensaje);
        } else {
            System.out.println("FiltroSpam: No pudo procesar.");
        }
    }
}

// Filtro de virus
class FiltroVirus extends FiltroEmail {
    public void procesar(String mensaje) {
        if (mensaje.contains("adjunto.exe") || mensaje.contains("archivo peligroso")) {
            System.out.println("FiltroVirus: Eliminado por virus.");
        } else if (siguiente != null) {
            siguiente.procesar(mensaje);
        } else {
            System.out.println("FiltroVirus: No pudo procesar.");
        }
    }
}

// Filtro de contenido sensible
class FiltroContenido extends FiltroEmail {
    public void procesar(String mensaje) {
        if (mensaje.contains("contenido ofensivo")) {
            System.out.println("FiltroContenido: Movido a papelera por contenido sensible.");
        } else {
            System.out.println("FiltroContenido: Aprobado. Llega a la bandeja de entrada.");
        }
    }
}
