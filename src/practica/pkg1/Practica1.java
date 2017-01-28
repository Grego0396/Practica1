/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 *
 * @author Gregory
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro;
        perro = new Animal("Lobo");
       
        perro.setEdad(5);
        
        System.out.println("El nombre del animal es:"+ perro.getNombre());
        System.out.println("Y la edad es de:"+ perro.getEdad());
    }
    
}
