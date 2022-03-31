/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author alumno
 */
//El extends Object ya esta implicito, no es necesario ponerlo

public class Empleado {//extends Object{
    private int numEmpleado,sueldo;
    private String nombre;

    /**
     * Consttructor vacío
     */
    public Empleado() {
    }

    /**
     * 
     * @param numEmpleado es el número de empleados
     * @param sueldo es el sueldo del empleado
     * @param nombre es el nombre del empleado
     */
    public Empleado(int numEmpleado, int sueldo, String nombre) {
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    /**
     * 
     * @return regresa el numero de empleados
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * 
     * @param numEmpleado  es el numero de empleados
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * 
     * @return regresa el sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * 
     * @param sueldo es el sueldo del empleado
     */
    public void setSueldo(int sueldo) {
        if(sueldo >=0)
            this.sueldo = sueldo;
    }

    /**
     * 
     * @return regresa el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre es el nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    /**
     * 
     * @param porcentaje es el porcentaje de sueldo que se va a aumentar
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += (int)(sueldo*porcentaje/100);
    }

    /**
     * 
     * @return regresa los datos del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" + "numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + ", nombre=" + nombre + '}';
    }
    
}
