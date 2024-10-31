/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Cliente extends Persona {
    private String direccion;

    public Cliente(String direccion, String nombre, String cedula) {
        super(nombre, cedula);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null,"Cliente: " + getNombre() + "- Cedula: " + getCedula() + "- Dirección: " + direccion);
    }
}
