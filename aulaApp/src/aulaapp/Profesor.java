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
public class Profesor extends Persona{
    /*Atributos*/
    private String materia;
    
    /*Constructores*/
    public Profesor(){
       super(); //Llama al constructor padre
        
       super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,50)); //llama al metodo padre
        
       materia=Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
    }
 
    /*Metodos*/
     
    /**
     * Devuelve la materia del profesor
     * @return 
     */
    public String getMateria() {
        return materia;
    }
 
    /**
     * Modifica la materia del profesor
     * @param materia 
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
 
    /**
     * Calcula la disponibilidad del profesor(20%)
     */
    @Override
    public void disponibilidad() {
        
        int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
         
        if(prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
         
    }
}
