/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 * Clase que modela a una persona
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

   /**
   * Constructor sin argumetos
   */
    public Persona() {
    }

   /**
   * Constructor que recibe todos loa valores de todos los atributos
   * @param nombre
   * @param apellido
   * @param fNacimiento
   */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

   /**
   * Constructor que recibe todos loa valores de todos los atributos y de el objeto fNacimiento
   * @param nombre
   * @param apellido
   * @param dia
   * @param mes
   * @param anio
   */
    public Persona(String nombre, String apellido, int dia, int mes, int anio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNacimiento=new Fecha(dia,mes,anio);
    }
    
   /**
   * Metodo que devuele el atributo nombre
   * @return nombre
   */
    public String getNombre() {
        return nombre;
    }

   /**
   * Metodo que asigna un valor al atributo nombre
   * @param nombre
   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /**
   * Metodo que devuele el atributo apellido
   * @return apellido
   */
    public String getApellido() {
        return apellido;
    }

   /**
   * Metodo que asigna un valor al atributo apellido
   * @param apellido
   */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   /**
   * Metodo que devuele el atributo fNacimiento
   * @return fNacimiento
   */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

   /**
   * Metodo que asigna un valor al atributo fNacimiento
   * @param fNacimiento
   */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

   /**
   * Metodo que regresa una cadena con todos los valores de todos los atrubutos
   */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
    
}
