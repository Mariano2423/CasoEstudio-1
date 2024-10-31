/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Aulas Heredia
 */
public class Empleado extends Persona {
    private String puesto;

    public Empleado(String puesto, String nombre, String cedula) {
        super(nombre, cedula);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Empleado: " + getNombre() + "- Cedula: " + getCedula() + "- Puesto: " + puesto);
    }
}