/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 * Clase que modela un triangulo rectangulo
 */

public class Triangulo {
    
    private float cateto1;
    private float cateto2;
    private float hipotenusa;
    private float angulo1;
    private float angulo2;

   /**
   * Constructor sin argumentos 
   */
    public Triangulo() {
    }

   /**
   * Constructor que recibe como parametros todos los valores de los atrubutos de la clase
   * @param cateto1
   * @param cateto2
   * @param hipotenusa
   * @param angulo1
   * @param angulo2
   */
    public Triangulo(float cateto1, float cateto2, float hipotenusa, float angulo1, float angulo2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }
    
   /**
   * Constructor que recibe como parametros todos los valores de los catetos
   * @param cateto1
   * @param cateto2
   */
    public Triangulo(float cateto1, float cateto2){
        this.cateto1=cateto1;
        this.cateto2=cateto2;
        hipotenusa();
        angulos();
    }

   /**
   * Metodo que decuelve el valor del cateto1
   * @return cateto1
   */
    public float getCateto1() {
        return cateto1;
    }
    
   /**
   * Metodo que decuelve el valor del cateto2
   * @return cateto2
   */
    public float getCateto2() {
        return cateto2;
    }

   /**
   * Metodo que decuelve el valor de la hiputenusa 
   * @return hipotenusa
   */
    public float getHipotenusa() {
        return hipotenusa;
    }

   /**
   * Metodo que decuelve el valor del angulo1
   * @return angulo1
   */
    public float getAngulo1() {
        return angulo1;
    }

   /**
   * Metodo que decuelve el valor del angulo2
   * @return angulo2
   */
    public float getAngulo2() {
        return angulo2;
    }

   /**
   * Metodo que asigna un valor al atributo cateto1
   * @param cateto1
   */
    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

   /**
   * Metodo que asigna un valor al atributo cateto2
   * @param cateto2
   */
    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

   /**
   * Metodo que asigna un valor al atributo hipotenusa
   * @param hipotenusa
   */
    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

   /**
   * Metodo que asigna un valor al atributo angulo1
   * @param angulo1
   */
    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

   /**
   * Metodo que asigna un valor al atributo angulo2
   * @param angulo2
   */
    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }
  
   /**
   * Metodo que regresa una cadena con todos los valores de todos los atrubutos
   */
    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", hipotenusa=" + hipotenusa + ", angulo1=" + angulo1 + ", angulo2=" + angulo2 + '}';
    }

   /**
   * Metodo que calcula la hipotenusa
   */
    private void hipotenusa(){
        this.hipotenusa=(float)Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    }
    
   /**
   * Metodo que calcula el valor de los dos angulos
   */
    private void angulos(){
        this.angulo1=(float)Math.toDegrees(Math.atan(cateto2/cateto1));
        this.angulo2=90-angulo1;
    }

   /**
   * Metodo que calcula el area del triangulo
   * @return area del circulo
   */
    public float area(){
        return cateto1*cateto2/2;
    }
    
   /**
   * Metodo que calcula el perimetro del triangulo
   * @return perimetro del trisngulo
   */
    public float perimetro(){
        return cateto1+cateto2+hipotenusa;
    }
    
}
