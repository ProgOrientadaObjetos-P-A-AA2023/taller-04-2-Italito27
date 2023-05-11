/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg1;

/**
 *
 * @author Italo
 */
public class Universidad {
    
    private String nombre;
    private String direccion;
    
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerDireccion(String n){
        direccion = n;
    }
   
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }
}
