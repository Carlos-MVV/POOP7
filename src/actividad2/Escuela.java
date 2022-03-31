/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Escuela extends Persona{
    
    private String escuela;

    /**
     * Constructor vacio
     */
    public Escuela() {
        
    }

    /**
     * 
     * @param escuela es el nombre de la escuela
     * @param horario es el horario 
     * @param nombre es el nombre de la escuela
     * @param edad es la edad 
     * @param peso es el peso
     */
    public Escuela(String escuela, String horario, String nombre, int edad, int peso) {
        super(horario, nombre, edad, peso);
        this.escuela = escuela;
    }

    /**
     * 
     * @return regresa el nombre de la escuela
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * 
     * @param escuela es el nombre de la escuela
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     * Método para estudiar
     */
    public void estudiar(){
        System.out.println("Estudió");
    }
    
    /**
     * 
     * @return regresa los datos de escuela
     */
    @Override
    public String toString() {
        return super.toString()+" Escuela{" + "escuela=" + escuela + '}';
    }
    
    
    
    
}
