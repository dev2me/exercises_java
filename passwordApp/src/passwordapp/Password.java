/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;

/**
 *
 * @author Erick Cástulo Cóporo
 */
public class Password {
    // Constantes
    
    private final static int LONG_DEF = 8;
    
    //Atributos
    
    private int longitud;
    private String contraseña;
    
    //Métodos públicos
    
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    //Genera una contraseña al azar
    public String generarPassword() {
        String password = "";
        for (int i=0; i<longitud;i++) {
            int eleccion = ( (int)Math.floor(Math.random())* 3+1);
            
            if (eleccion == 1) {
                char minusculas = (char) ((int)Math.floor(Math.random() * (123-97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ( (int)Math.floor(Math.random() * (91-65) + 65 ) );
                    password += mayusculas;
                } else {
                    char numeros = (char) ( (int)Math.floor(Math.random() * (58-48) + 48) );
                    password += numeros;
                }
            }
        }
        return password;
    }    
    public boolean esFuerte() {
        int cuenta_numeros = 0;
        int cuenta_minusculas = 0;
        int cuenta_mayusculas = 0;
        
        // vamos caracter por caracter y comprobamos que tipo de caracter es
        
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122 ) {
                cuenta_minusculas +=1;
            } else {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    cuenta_mayusculas += 1;
                } else {
                    cuenta_numeros += 1;
                }
            }
        }
        
        // si la contraseña tiene mas de 5 numeros, mas de 1 minuscula y más de
        // 2 mayusculas 
        
        if (cuenta_numeros >= 5 && cuenta_minusculas >= 1 && cuenta_mayusculas >= 2) {
            return true;
        } else {
            return false;
        }
    }
    
    // constructores 
    
    public Password() {
        this(LONG_DEF);
    }
    
    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword();
    }
}