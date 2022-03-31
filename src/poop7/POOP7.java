/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

//Se tiene que importar de el otro paquete
import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.ProfesorAsignatura;
import actividad2.Mesero;
import actividad2.ProfesorCarrera;
import actividad2.Gato;
import actividad2.Perro;

        

/**
 *
 * @author alumno
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Pedro");
        empleado.setNumEmpleado(997755);
        //Se le puede poner un guiòn bajo por formato, no afecta al nùmero
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        //Constructor normal
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(228855);
        gerente.setSueldo(20_000);
        gerente.asignarPresupuesto(300_000);
        System.out.println(gerente);
        
        //Se usa el constructor que pied paràmetros y usa el super para llamar a los atributos de Empleado
        Gerente gerente2 = new Gerente(500_000,119922,30_000,"Jorch");
        System.out.println(gerente2);
        
        //Podemos almacenar a los hijos en los padres
        Empleado gerente3 = new Gerente(1_000_000,11,50_000,"Frida");
        System.out.println(gerente3);
        
        //instanceof nos dice si este objeto es una instancia de una clase
        if(gerente instanceof Gerente){
            System.out.println("Instancia de Gerente");
        }if(gerente instanceof Empleado){
            System.out.println("Instancia del empleado");
        }if(gerente instanceof Object){
            System.out.println("Instancia de object");
        }
        
        
        
        gerente.aumentarSueldo(100);
        gerente.aumentarSueldo(50_000.5);
        
        //Instancia de Perro con herencias
        Perro perro = new Perro("Bulldog","cafe",'m',"Pupi",2,6);
        System.out.println(perro);
        perro.ladrar();
        perro.jugar();
        perro.comer();
        perro.dormir();
        perro.correr();
        
        //Instancia Gato con herencias
        Gato gato = new Gato(8,"Egipcio","blanco",'c',"Michi",3,2);
        System.out.println(gato);
        gato.abandonar();
        gato.bañarse();
        gato.maullar();
        gato.comer();
        gato.dormir();
        gato.correr();
        gato.jugar();
        
        //Instancia Alumno con herencias
        Alumno alumno = new Alumno("Ingenieria",3,9.21,"UNAM-FI","7:00am-7:00pm","George",20,55);
        System.out.println(alumno);
        alumno.hacerTarea();
        alumno.estudiar();
        alumno.hablar();
        alumno.escribir();
        alumno.comer();
        alumno.dormir();
        alumno.correr();
        
        //Instancia ProfesorCarrera
        ProfesorAsignatura profesorA = new ProfesorAsignatura("EDA",3000,"7:00-9:00","José",25,60);
        System.out.println(profesorA);
        profesorA.calificar();
        profesorA.comer();
        profesorA.correr();
        profesorA.darClase();
        profesorA.dormir();
        profesorA.dejarTarea();
        profesorA.cobrar();
        profesorA.hablar();
        profesorA.escribir();
        
        //Instancia ProfesorCarrera
        ProfesorCarrera profesorC = new ProfesorCarrera(3000,"7:00-9:00","José",25,60);
        System.out.println(profesorA);
        profesorC.calificar();
        profesorC.comer();
        profesorC.correr();
        profesorC.darClase();
        profesorC.dormir();
        profesorC.dejarTarea();
        profesorC.cobrar();
        profesorC.hablar();
        profesorC.escribir();
        
        //Instancia Mesero
        Mesero mesero = new Mesero(3500,"8:00-9:00","Juan",55,70);
        System.out.println(mesero);
        mesero.cargar();
        mesero.cobrar();
        mesero.hablar();
        mesero.escribir();
        mesero.comer();
        mesero.dormir();
        mesero.correr();       
    }
    
}
