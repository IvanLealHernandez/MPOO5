/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 * Clase de apoyo para representar una fecha de nacimiento
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;

   /**
   * Constructor vacio
   */
    public Fecha() {
    }

   /**
   * Constructor que recibe todos los valores de todos los atrubutos
   * @param dia
   * @param mes
   * @param anio
   */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

   /**
   * Metodo que devuele el atributo dia
   * @return dia
   */
    public int getDia() {
        return dia;
    }

   /**
   * Metodo que devuele el atributo mes
   * @return mes
   */
    public int getMes() {
        return mes;
    }

   /**
   * Metodo que devuele el atributo anio
   * @return anio
   */
    public int getAnio() {
        return anio;
    }

   /**
   * Metodo que asigna un valor al atributo dia
   * @param dia
   */
    public void setDia(int dia) {
        this.dia = dia;
    }

   /**
   * Metodo que asigna un valor al atributo mes
   * @param mes
   */
    public void setMes(int mes) {
        this.mes = mes;
    }

   /**
   * Metodo que asigna un valor al atributo anio
   * @param anio
   */
    public void setAnio(int anio) {
        this.anio = anio;
    }

   /**
   * Metodo que regresa una cadena con todos los valores de todos los atrubutos
   */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
     
}
