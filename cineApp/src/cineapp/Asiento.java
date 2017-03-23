/*

 */
// Definción del paquete
package cineapp; 

/**
 *
 * @author Erick Cástulo Cóporo
 */

// definición de una clase pública
public class Asiento {
    /*Atributos*/
    private char letra;
    private int fila;
    // informacion del espectador que esta sentado, null si es vacio
    private Espectador espectador; 
 
    /*Constructores*/
    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        //al iniciar el asiento, no habrá nadie sentado
        this.espectador = null; 
    }
 
    /*Metodos getters y setters*/
    // Este método permite obtener la letra que identifica a cada una de las filas
    public char getLetra() {
        return letra;
    }
 
    // Este método permite agregar una letra que identifica a cada una de las filas
    public void setLetra(char letra) {
        this.letra = letra;
    }
 
    // Este método permite obtener el numero de la fila
    public int getFila() {
        return fila;
    }
    // Este método permite agregar el número de la fila
    public void setFila(int fila) {
        this.fila = fila;
    }
    // Este método de tipo Espectador permite obtener el espectador
    public Espectador getEspectador() {
        return espectador;
    }
    // Este método de tipo Espectador permite agregar un espectador
    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
 
    /**
     * Indica si el asiento esta ocupado
     *
     * @return
     */

    // Método de tipo boolean que retorna un valor verdadero o falso, en este caso si está reservado el asiento o no
    public boolean ocupado() {
        return espectador != null;
    }
 
    @Override
    // Método que returna un string  con el status del asiento si este está ocupado o no
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador;
        }
 
        return "Asiento: " + fila + letra + " y este asiento está vacio ";
 
    }

}
