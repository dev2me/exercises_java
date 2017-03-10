/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raicesapp;

/**
 *
 * @author Erick Cástulo Cóporo
 */
public class RaicesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices ecuacion=new Raices(1,4,4); //creamos el objeto
        ecuacion.calcular(); //Calculamos
    }
    
}
