/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 * Clase que modela un circulo
 */


 public class Circulo
 {
   static double Pi = Math.PI;
   private float radio;
   
   /**
   * Constructor sin argumetos
   */
   public Circulo()
   {
       
   /**
   * Constructor que recibe el valor del atrubuto radio
   * @param radio 
   */
   }
   public Circulo(float radio){
     this.radio = radio;
   }
   
   /**
   * Metodo que devuelve el radio de la circunfenrcia
   * @return radio
   */
   public float getRadio(){
     return radio;
   }
   
   /**
   * Metodo que devuelve el radio de la circunfenrcia
   * @param radio 
   */
   public void setRadio(float radio) {
     this.radio = radio;
   }
 
   /**
   * Metodo que regresa el perimetro de la circunferencia
   * @return perimetro
   */
   public float perimetro(){
       return (float)(2*Math.PI*radio);
   }
   
   /**
   * Metodo que regresa una cadena con el valor del atributo radio
   */
   @Override
   public String toString(){
     return "Circulo{" + "radio=" + radio + '}';
   }

   
 }
