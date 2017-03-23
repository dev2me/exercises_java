// Definición del paquete 
package cineapp;

/**
 *
 * @author Erick Cástulo Cóporo
 */

// Se crea una clase de acceso público
public class Cine {
    /*Atributos privados de la clase*/

    // variable de tipo asiento que almacena un arreglo de dos dimensiones
    private Asiento asientos[][];
    // variable de tipo double para el precio
    private double precio;
    // variable de tipo Pelcula para almacenar el tipo de película
    private Pelicula pelicula;
 
    /*Constructor*/
    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
        // objeto instaciado a partir de la clase Asiento
        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        // Se ejecuta un método 
        rellenaButacas();
    }
 
    /*Metodos*/
    // Método que obtiene todos los asientos disponibles
    public Asiento[][] getAsientos() {
        return asientos;
    }
    // Método que permite agregar Asientos 
    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    // Método que permite obtener el precio
    public double getPrecio() {
        return precio;
    }
    // Método que permite agregar el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método que perimte obtener una película
    public Pelicula getPelicula() {
        return pelicula;
    }
    // Método que permite agregar una película
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
 
    /**
     * Rellena nuestros asientos, dandoles una fila y una letra
     */
    private void rellenaButacas() {
 
        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                //Recuerda que los char se pueden sumar
                asientos[i][j] = new Asiento((char) ('A' + j), fila);
            }
            fila--; //Decremento la fila para actualizar la fila
        }
 
    }
 
    /**
     * Indicamos si hay sitio en el cine, cuando vemos una vacia salimos de la
     * función
     *
     * @return
     */
    public boolean haySitio() {
 
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
 
                if (!asientos[i][j].ocupado()) {
                    return true;
                }
 
            }
        }
 
        return false;
    }
 
    /**
     * Indico si en una posicion concreta esta ocupada
     *
     * @param fila
     * @param letra
     * @return
     */
    public boolean haySitioButaca(int fila, char letra) {
        return getAsiento(fila, letra).ocupado();
    }
 
    /**
     * Indicamos si el espectador cumple lo necesario para entrar: - Tiene
     * dinero - Tiene edad El tema de si hay sitio, se controla en el main
     *
     * @param e
     * @return
     */
    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }
 
    /**
     * Siento al espectador en un asiento
     *
     * @param fila
     * @param letra
     * @param e
     */
    public void sentar(int fila, char letra, Espectador e) {
        getAsiento(fila, letra).setEspectador(e);
    }
 
    /**
     * Devuelvo un asiento concreto por su fila y letra
     *
     * @param fila
     * @param letra
     * @return
     */
    public Asiento getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }
 
    /**
     * Numero de filas de nuestro cine
     *
     * @return
     */
    public int getFilas() {
        return asientos.length;
    }
 
    /**
     * Numero de columas de nuestro cine
     *
     * @return
     */
    public int getColumnas() {
        return asientos[0].length;
    }
 
    /**
     * Mostramos la información de nuestro cine (Tambien se puede hacer en un
     * toString pero hay que devolver un String)
     */
    public void mostrar() {
 
        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }

}
