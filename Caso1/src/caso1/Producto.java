/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author Aulas Heredia
 */
public class Producto {
    private String nombre;
    private String precio;
    private String cantidad;

    public Producto(String nombre, String precio, String cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
   public void mostrarInfoProducto(){
       System.out.println("Produrcto: " + nombre + "- Precio: " + precio + "- Cantidad: " + cantidad);
   }
}
