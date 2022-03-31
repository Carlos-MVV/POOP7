/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class ProfesorAsignatura extends Profesor{
    
    private String Asignatura;

    /**
     * constructor vacio
     */
    public ProfesorAsignatura() {
    }

    /**
     * 
     * @param Asignatura es la asignatura del profesor de asignatura
     * @param salario es el salario del profesor de asignatura
     * @param horario es el horario del profesor de asignatura
     * @param nombre es el nombre del profesor de asignatura
     * @param edad es la edad del profesor de asignatura    
     * @param peso es el peso del profesor de asignatura
     */
    public ProfesorAsignatura(String Asignatura, int salario, String horario, String nombre, int edad, int peso) {
        super(salario, horario, nombre, edad, peso);
        this.Asignatura = Asignatura;
    }

    /**
     * 
     * @return regresa la asignatura que imparte
     */
    public String getAsignatura() {
        return Asignatura;
    }

    /**
     * 
     * @param Asignatura es la asignatura que imparte
     */
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    /**
     * 
     * @return regresa los datos del profesor de asignatura
     */
    @Override
    public String toString() {
        return super.toString()+" ProfesorAsignatura{" + "Asignatura=" + Asignatura + '}';
    }
    
    
    
}
