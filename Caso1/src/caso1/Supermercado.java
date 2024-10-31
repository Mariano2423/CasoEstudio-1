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
public class Supermercado {
    public static void main(String[] args){
        ConsultaCliente consultaCliente = new ConsultaCliente();
         
        int opcion = JOptionPane.showConfirmDialog(null, "Desea agregar un cliente?","supermercado El Último Colón", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente: ");
            String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
            
            Cliente cliente = new Cliente(nombre, cedula, direccion);
            consultaCliente.agregarCliente(cliente);
        }
        
        int mostrar = JOptionPane.showConfirmDialog(null,"Desea ver la lista de clientes?", "Supermercado El Último Colón", JOptionPane.YES_NO_OPTION);
        if (mostrar == JOptionPane.YES_OPTION){
            consultaCliente.mostrarClientes();
        }
    }
}
