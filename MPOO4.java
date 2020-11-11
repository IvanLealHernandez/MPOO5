/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOO4 {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.setRadio(3.4f);
        System.out.println("El radio del circulo igual a: "+circulo.getRadio());
        Circulo circulo1 = new Circulo(6.0f);
        System.out.println("El radio del segundo circulo es igual a: "+circulo1.getRadio());
        circulo1.setRadio(9.0f);
        System.out.println("Ahora, el radio sera de: "+circulo1.getRadio());
        System.out.println("Perimetro del circulo 1: "+circulo.perimetro());
        System.out.println("Información del circulo 1: "+circulo.toString());
        System.out.println("*************************************************");
        
        Persona amigo = new Persona();
        System.out.println("Mi amigo"+amigo.toString());
        amigo.setNombre("Juan");
        amigo.setApellido("Ramirez");
        amigo.setfNacimiento(new Fecha(29,1,2000));
        
        System.out.println("Info Amigo"+amigo.toString());
        System.out.println("Info Amigo"+amigo);
        
        Persona persona = new Persona("Jose","Rodriguez",4,8,1990);
        System.out.println("Info persona"+persona);
        
        System.out.println("*************************************************");
        
        
        Triangulo triangulo = new Triangulo(12,8);
        System.out.println("Info Triangulo"+triangulo.toString());
        System.out.println("*************************************************");
        
        
        
    }
}
