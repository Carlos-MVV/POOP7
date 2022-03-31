/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *
 * @author alumno
 */
public class Trabajador extends Persona{
    
    private int salario;

    /**
     * Constructor vacío
     */
    public Trabajador() {
        
    }

    /**
     * 
     * @param salario es el salario del trabajador
     * @param horario es el horario del trabajador
     * @param nombre es el nombre del trabajador
     * @param edad es la edad del trabajador
     * @param peso es el peso del trabajador
     */
    public Trabajador(int salario, String horario, String nombre, int edad, int peso) {
        super(horario, nombre, edad, peso);
        this.salario = salario;
    }

    /**
     * 
     * @return regresa el salario del trabajador
     */
    public int getSalario() {
        return salario;
    }

    /**
     * 
     * @param salario es el salario del trabajador
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    /**
     * EMétodo para cobrar
     */
    public void cobrar(){
        System.out.println("Cobró");
    }
    

    /**
     * 
     * @return regresa los datos del trabajador
     */
    @Override
    public String toString() {
        return super.toString()+" Trabajador{" + "salario=" + salario + '}';
    }
    
    
    
    
}
