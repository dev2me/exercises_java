/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticapp;

/**
 *
 * @author Erick Cástulo Cóporo
 */
public class ElectrodomesticApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
        
        listaElectrodomesticos[0] = new Electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos[1] = new Lavadora(150, 30);
        listaElectrodomesticos[2] = new Television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3] = new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "naranja", 30, true);
        
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;
        
        for(int i = 0; i< listaElectrodomesticos.length; i++) {
            if(listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora) {
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
        }
        
        System.out.println("La suma del precio de los electrodomesticos es de: " +sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de: " +sumaLavadoras);
        System.out.println("La suma del precio de los televisores es de: " +sumaTelevisiones);
    }
    
}
