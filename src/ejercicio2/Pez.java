/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
/**
 *
 * @author zunig
 */
public class Pez extends Animal {
    protected String tipoDeAgua;
    
    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
