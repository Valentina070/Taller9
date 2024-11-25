/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
/**
 *
 * @author zunig
 */
public class Papaya {
    
    protected String Vitaminas;
    
    // Constructor
    public Papaya(String tipo, String Vitaminas) {
        super(tipo);
        this.Vitaminas = Vitaminas;
    }
    
    @Override
    public void mostrarTipo() {
        super.mostrarTipo();
        System.out.println("Vitaminas que contiene: " + Vitaminas);
    }
}
