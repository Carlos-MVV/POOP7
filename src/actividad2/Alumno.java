/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Alumno extends Escuela{
    
    private String carrera;
    private int semestre;
    private double promedio;

    /**
     * Constructor vacio
     */
    public Alumno() {
    }
    

    /**
     * 
     * @param carrera es la carrera del alumno
     * @param semestre es el semestre del alumno
     * @param promedio es el promedio del alumno
     * @param escuela es la escuela del alumno
     * @param horario es el horario del alumno
     * @param nombre es el nombre del alumno
     * @param edad es la edad del alumno
     * @param peso es el peso del alumno
     */
    public Alumno(String carrera, int semestre, double promedio, String escuela, String horario, String nombre, int edad, int peso) {
        super(escuela, horario, nombre, edad, peso);
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    /**
     * 
     * @return regresa la carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * 
     * @param carrera es la carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * 
     * @return regresa el semestre del alumno
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * 
     * @param semestre es el semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * 
     * @return regresa el promedio del alumno
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * 
     * @param promedio es el promedio del alumno
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    /**
     * Hace la tarea 
     */
    public void hacerTarea(){
        System.out.println("Haciendo Tarea");
    }

    /**
     * 
     * @return regresa los datos del alumno
     */
    @Override
    public String toString() {
        return super.toString()+" Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
   
    
    
    
    
}
