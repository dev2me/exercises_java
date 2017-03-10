/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick Cástulo Cóporo
 */
public class PasswordApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducimos el tamaño del array y la longitud del password;
        String texto;
        int tamanio, longitud;
        texto = JOptionPane.showInputDialog("Introduce el tamaño del array");
        tamanio = Integer.parseInt(texto);
      
        texto = JOptionPane.showInputDialog("Introduce la longitud del password");
        longitud = Integer.parseInt(texto);
        
        // creamos los arrays
        
        Password listaPassword[] = new Password[tamanio];
        boolean fortalezaPassword[] = new boolean[tamanio];
        
        // Creamos objetis, indicamos si es fuerte y mostramos la contraseña y su fortaleza
        
        for(int i = 0; i<listaPassword.length;i++) {
            listaPassword[i] = new Password(longitud);
            fortalezaPassword[i] = listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña() + " " + fortalezaPassword[i]);
        }
    }
    
}
