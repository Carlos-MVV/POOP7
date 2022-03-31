/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class ProfesorCarrera extends Profesor{

    /**
     * Constructor vacio
     */
    public ProfesorCarrera() {
    }

    /**
     * 
     * @param salario es el salario el profesor de carrera
     * @param horario es el horario del profesor de carrera
     * @param nombre es el nombre del profesor de carrera
     * @param edad es la edad del profesor de carrera
     * @param peso es el peso del profesor de carrera
     */
    public ProfesorCarrera(int salario, String horario, String nombre, int edad, int peso) {
        super(salario, horario, nombre, edad, peso);
    }

    /**
     * Método para cambiar de clase
     */
    public void cambiarClase(){
        System.out.println("Se cambio de clase");
    }
    
}
