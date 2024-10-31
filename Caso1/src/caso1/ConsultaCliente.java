/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class ConsultaCliente {
    private final String archivo = "clientes.txt";
    
    public void agregarCliente(Cliente cliente) {
        try(FileOutputStream fos = new FileOutputStream(archivo, true);ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(cliente); JOptionPane.showMessageDialog(null,"Cliente agregado");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
                }
    }

    public void mostrarClientes(){
        try (FileInputStream fis = new FileInputStream(archivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                Cliente cliente = (Cliente) ois.readObject();
                cliente.mostrarInfo();
            }
        } catch (EOFException e) {
            System.out.println("Fin de archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
 }
