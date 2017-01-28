package practica.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gregory
 */
public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    
    public Animal (String nombreN){
        nombre = nombreN;
    }
    
    public String getNombre(){
        return  nombre;
    }
            
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int EdadN){
        edad = EdadN;
    }
}
