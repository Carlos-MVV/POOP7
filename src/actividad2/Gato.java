/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Gato extends Mascota{
    
    private int numVidas;

    /**
     * Constructor vacío
     */
    public Gato() {
    }

    /**
     * 
     * @param numVidas es el numero de vidas del gato
     * @param raza es la raza del gato
     * @param color es el color del gato
     * @param tamaño es el tamaño del gato
     * @param nombre es el nombre del gato
     * @param edad es la edad del gato
     * @param peso es el peso del gato
     */
    public Gato(int numVidas, String raza, String color, char tamaño, String nombre, int edad, int peso) {
        super(raza, color, tamaño, nombre, edad, peso);
        this.numVidas = numVidas;
    }

    /**
     * 
     * @return regresa el numero de vidas
     */
    public int getNumVidas() {
        return numVidas;
    }

    /**
     * 
     * @param numVidas es el numero de vidas
     */
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }
    
    /**
     * Metodo para bañarse
     */
    public void bañarse(){
        System.out.println("Bañado");
    }
    /**
     * metodo para maullar
     */
    public void maullar(){
        System.out.println("maulló");
    }
    /**
     * metodo para abandonar
     */
    public void abandonar(){
        System.out.println("Lo abandonó");
    }
    /**
     * 
     * @return regresa los datos del gato
     */
    @Override
    public String toString() {
        return super.toString()+" Gato{" + "numVidas=" + numVidas + '}';
    }
    
    
    
    
}
