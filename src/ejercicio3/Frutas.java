/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
/**
 *
 * @author zunig
 */
public class Frutas {
    
    protected String tipo;
    
    public Frutas(String tipo) {
        this.tipo = tipo;
    }
    
    public void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
}
