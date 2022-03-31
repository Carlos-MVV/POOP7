/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Perro extends Mascota{

    /**
     * Constructor vacio
     */
    public Perro() {
    }

    /**
     * 
     * @param raza es la raza del perro
     * @param color es el color del perro
     * @param tamaño es el tamaño del perro
     * @param nombre es el nombre del perro
     * @param edad es la edad del perro
     * @param peso es el peso del perro
     */
    public Perro(String raza, String color, char tamaño, String nombre, int edad, int peso) {
        super(raza, color, tamaño, nombre, edad, peso);
    }
    
    /**
     * Método para ladrar
     */
    public void ladrar(){
        System.out.println("Ladró");
    }
    
    
}
