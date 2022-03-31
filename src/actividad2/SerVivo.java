/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class SerVivo extends Object{
    
    private String nombre;
    private int edad,peso;

    /**
     * Constructor vacío
     */
    public SerVivo() {
    }

    /**
     * 
     * @param nombre es el nombre del ser vivo
     * @param edad es la edad del ser vivo
     * @param peso es el peso del ser vivo
     */
    public SerVivo(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * 
     * @return regresa el nombre del ser vivo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre es el nombre del ser vivo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return regresa la edad del ser vivo
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad es la edad del ser vivo
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return regresa el peso del ser vivo
     */
    public int getPeso() {
        return peso;
    }

    /**
     * 
     * @param peso es el peso del ser vivo
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Método para comer
     */
    public void comer(){
        System.out.println("Comió");
    }
    
    /**
     * Método para dormir
     */
    public void dormir(){
        System.out.println("Durmió");
    }
    
    /**
     * Método para correr
     */
    public void correr(){
        System.out.println("Corrió"); 
    }
    
    /**
     * 
     * @return regresa los dato del ser vivo
     */
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
}
