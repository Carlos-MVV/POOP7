/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Profesor extends Trabajador{
    

    /**
     * Constructor vacio
     */
    public Profesor() {
    }

    /**
     * 
     * @param salario es el salario del profesor
     * @param horario es el horario del profesor
     * @param nombre es el nombre del profesor
     * @param edad es la edad del profesor
     * @param peso es el peso del profesor
     */
    public Profesor(int salario, String horario, String nombre, int edad, int peso) {
        super(salario, horario, nombre, edad, peso);
    }
   
   
    /**
     * Método para dar clase
     */
    public void darClase(){       
        System.out.println("Dando clase");
    }
    
    /**
     * Método para calificar
     */
    public void calificar(){
        System.out.println("calificando");
    }
    /**
     * Método para dejar tarea
     */
    public void dejarTarea(){
        System.out.println("Tarea asignada");
    }
    
    
}
