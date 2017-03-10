/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaapp;

/**
 *
 * @author Jesús Rosas
 */
public class AulaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creamos el objeto
        Aula aula=new Aula();
        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
        }

    }
    
}
