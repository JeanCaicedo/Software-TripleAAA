/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author usuario_RCUL46
 */
import modelo.Cliente;
import java.io.FileWriter;
import java.io.IOException;

public class Ccliente {

    public void Registar(Cliente nueva) throws IOException {
        String ruta = "Clientes.txt";
        FileWriter BaseDeDatos = new FileWriter(ruta, true);
        BaseDeDatos.append(nueva.getNroreferencia() + "::" + nueva.getCedula() + "::"
                + nueva.getNombres() + "::" + nueva.getApellidos() + "::" + nueva.getBarrio() + "::"
                + nueva.getMunicipio() + "::" + nueva.getSexo() + "::" + nueva.getEstrato() + "\r\n");
        BaseDeDatos.close();
        
        

    }

}
