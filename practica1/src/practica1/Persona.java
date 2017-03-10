/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Jesús Rosas
 */
public class Persona {
    
    // sexo por defecto 
    
    private final static char SEXO_DEF = 'H';
    // Constantes 
    
    public final int INFRAPESO = -1; // El peso de la persona está por debajo del ideal
    public final int PESO_IDEAL = 0; // El peso de la persona está en su peso ideal
    private final int SOBREPESO = 1; // El peso de la persona está por encima del ideal
    
    // Atributos
    
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    // Métodos privados
    
    private void comprobarSexo(char sexo) {
        if(sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        } else {
            this.sexo = sexo;
        }
    }
    
    private void generarDni() {
        //generación de un número de 8 digitos
        final int divisor = 23;
        int numDNI = ( (int)Math.floor(Math.random() * (100000000-100000000) + 100000000) );
        int res = numDNI - (numDNI/divisor * divisor);
        
        //calculo de la letra del DNI
        char letraDNI = generarLetraDni(res);
        
        DNI = Integer.toString(numDNI) + letraDNI;
    }
    
    private char generarLetraDni(int res) {
        char letras[] = {
            'T', 'R', 'W', 'A', 'G', 'N', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'j',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        return letras[res];
    };
    
    //Métodos públicos
    
    /*
    
    * Modifica el nombre de la persona
    * @param nombre a cambiar
    */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*
    * Modifica el sexo de la persona, comprueba que es correcto
    * @param sexoa a cambiar
    */
    
    public void setSexo(char sexo){ 
        this.sexo = sexo;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /*
    * Modifica la altura de la persona
    * @param altura a cambiar
    */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*
    * Calcula el indice de masa corporal
    * @return codigo numerico
    
    * -1 : La persona está por debajo de su peso ideal
    * 0 : La persona está en su peso ideal
    * 1 : La persona está por encima del peso ideal
    */
    
    public int calcularIMC() {
        //calculamos el peso de la persona
        
        double pesoActual = peso / (Math.pow(altura, 2));
        //según el peso, devuelve el código
        
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        }else if(pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }
    /*
        * Indica si la persona es mayor de edad
        * @return true si es mayor de edad y false si es menor de edad
    */
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if(edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
    /*
    * Devuelve la información del objeto
    * @return cadena con toda la información    
    */
    
    @Override
    public String toString() {
        String sexo = "";
        if(this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        
        return "Información de la persobna:n" +
                "Nombre: "+ nombre+"n" +
                "Sexo: "+ sexo+"n"+
                "Edad: "+DNI+" n" +
                "Peso: "+peso+" kgn" +
                "Altura: "+altura+" metrosn";
    }
    
    /*
    * Constructo por defecto
    */
    
    
    public Persona() {
        this("", 0, SEXO_DEF, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        comprobarSexo(sexo);
    }
}



