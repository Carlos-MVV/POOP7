/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Mesero extends Trabajador{

    /**
     * Constructor vacío
     */
    public Mesero() {
    }

    /**
     * 
     * @param salario es el salario del mesero
     * @param horario es el horario del mesero
     * @param nombre es el nombre del mesero
     * @param edad es la edad del mesero
     * @param peso es el peso del mesero
     */
    public Mesero(int salario, String horario, String nombre, int edad, int peso) {
        super(salario, horario, nombre, edad, peso);
    }
    
    /**
     * Método para cargar
     */
    public void cargar(){
        System.out.println("Cargando");
    }
    
    
    
}
