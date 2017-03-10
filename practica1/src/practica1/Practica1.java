/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Cástulo Cóporo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // introducimos los datos
        
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        
        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
        
        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);
        
        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);
        // creamos objetos con cada constructor
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
        
        // los datos que no esén completos los insertamos con los métodos set
        
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
        
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
        
        //usammos métodos para realizar la misma acción para cada objeto
        
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        MuestraInformacion(persona1);
        
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        MuestraInformacion(persona2);
        
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        MuestraInformacion(persona3);
    }
    
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        
        if(IMC == p.PESO_IDEAL) {
            System.out.println("La persona esta en su peso ideal");
        } else if ( IMC == p.INFRAPESO) {
            System.out.println("La persona está por debajo de su peso ideal");
        } else {
            System.out.println("La persona está por encima de su peso ideal");
        }
    }
    
    public static void MuestraMayorDeEdad(Persona p) {
        boolean mayor = p.esMayorDeEdad();
        
        if(mayor) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
    
    public static void MuestraInformacion(Persona p) { 
        // Invoca el método toString
        
        System.out.println(p);
    }
    
}
