/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author alumno
 */
public class Gerente extends Empleado{ //subclase de empleado
    private int presupuesto;

    /**
     * Constructor vacío
     */
    public Gerente() {
    }

    /**
     * @param presupuesto es el presupuesto del gerente
     * @param numEmpleado es el número del gerente
     * @param sueldo es el sueldo del gerente
     * @param nombre es el nombre del gerente
    */
    public Gerente(int presupuesto, int numEmpleado, int sueldo, String nombre) {
        //super manda a llamar las variables del contructor de la clase padre
        super(numEmpleado, sueldo, nombre);
        this.presupuesto = presupuesto;
    }

    //No ocupa generar getter o setters de los atributos que heredó
    
    /**
     * 
     * @return regrese el presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    
    //No es necesario el mètodo asignar presupuesto hace lo mismo
    /*public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    */
    
    /**
     * 
     * @param presupuesto es el presupuesto del gerente
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }
    
    
    
    //@Overload
    
    /**
     * 
     * @param sueldo es el nuevo sueldo del gerente
     * 
     */
    public void aumentarSueldo(double sueldo){
        super.setSueldo((int)(sueldo));
    }

    /**
     * 
     * @return imprime los datos del gerente
     */
    @Override
    //con super se llama a la clase padre, es el "this" para usar otras clases    
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
