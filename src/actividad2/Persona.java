/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Persona extends SerVivo{
    
    private String horario;

    /**
     * Constructor vacio
     */
    public Persona() {
    }

    /**
     * 
     * @param horario es el horario de la persona
     * @param nombre es el nombre de la persona
     * @param edad es la edad de la persona
     * @param peso es el peso de la persona
     */
    public Persona(String horario, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.horario = horario;
    }

    /**
     * 
     * @return regresa el horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * 
     * @param horario es el horario
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
   * Método para hablar
   */
    public void hablar(){
        System.out.println("habló");
    }
    
    /**
     * Método para escribir
     */
    public void escribir(){
        System.out.println("escribió");
    }
    
    /**
     * 
     * @return regresa los datos de la persona
     */
    @Override
    public String toString() {
        return super.toString()+" Persona{" + "horario=" + horario + '}';
    }
    
    
    
}
