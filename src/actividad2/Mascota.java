/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Mascota extends SerVivo{
    
    private String raza,color;
    private char tamaño;

    /**
     * Constructor vacio
     */
    public Mascota() {
    }


    /**
     * 
     * @param raza es la raza de la mascota
     * @param color es el color de la mascota
     * @param tamaño es el tamaño de la mascota
     * @param nombre es le nombre de la mascota
     * @param edad es la edad de la mascota
     * @param peso es el peso de la mascota
     */
    public Mascota(String raza, String color, char tamaño, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
    }
    

    /**
     * 
     * @return regresa la raza de la mascota
     */
    public String getRaza() {
        return raza;
    }

    /**
     * 
     * @param raza es la raza de la mascota
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * 
     * @return regresa el color de la mascota
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color es el color de la mascota
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return regresa el tamaño de la mascota
     */
    public char getTamaño() {
        return tamaño;
    }

    /**
     * 
     * @param tamaño es el tamaño de la mascota
     */
    public void setTamaño(char tamaño) {
        this.tamaño = tamaño;
    }
    
    /**
     * Método para jugar
     */
    public void jugar(){
        System.out.println("Jugó");
    }
    

    /**
     * 
     * @return regresa los datos de la mascota 
     */
    @Override
    public String toString() {
        return super.toString()+" Mascota{" + "raza=" + raza + ", color=" + color + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
