/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Jean
 */
import modelo.Factura;
import java.io.FileWriter;
import java.io.IOException; 

public class Ffactura {
    
    public void Registar(Factura nueva) throws IOException {
        String ruta = "Factura.txt";
        FileWriter BaseDeDatos = new FileWriter(ruta, true);
        BaseDeDatos.append(nueva.getNrofactura() + "::" + nueva.getPoliza() + "::"
                + nueva.getNitocc() + "::" + nueva.getRecorrido() + "::" + nueva.getEstrato() + "::"
                + nueva.getBarriodefacturacion() + "::" + nueva.getClasificaciondelpredio() + "::" + nueva.getUnidadesdelpredio() + "\r\n");
        BaseDeDatos.close();
        
        

    }
}
