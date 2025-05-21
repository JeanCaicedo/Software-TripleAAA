/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jean
 */
public class Factura {

    private String Nrofactura;
    private String Poliza;
    private String Nitocc;
    private String Recorrido;
    private String Estrato;
    private String Barriodefacturacion;
    private String Clasificaciondelpredio;
    private String Unidadesdelpredio;

    public Factura(String Nrofactura, String Poliza, String Nitocc, String Recorrido, String Estrato, String Barriodefacturacion, String Clasificaciondelpredio, String Unidadesdelpredio) {
        this.Nrofactura = Nrofactura;
        this.Poliza = Poliza;
        this.Nitocc = Nitocc;
        this.Recorrido = Recorrido;
        this.Estrato = Estrato;
        this.Barriodefacturacion = Barriodefacturacion;
        this.Clasificaciondelpredio = Clasificaciondelpredio;
        this.Unidadesdelpredio = Unidadesdelpredio;
    }

    public String getNrofactura() {
        return Nrofactura;
    }

    public String getPoliza() {
        return Poliza;
    }

    public String getNitocc() {
        return Nitocc;
    }

    public String getRecorrido() {
        return Recorrido;
    }

    public String getEstrato() {
        return Estrato;
    }

    public String getBarriodefacturacion() {
        return Barriodefacturacion;
    }

    public String getClasificaciondelpredio() {
        return Clasificaciondelpredio;
    }

    public String getUnidadesdelpredio() {
        return Unidadesdelpredio;
    }

    public void setNrofactura(String Nrofactura) {
        this.Nrofactura = Nrofactura;
    }

    public void setPoliza(String Poliza) {
        this.Poliza = Poliza;
    }

    public void setNitocc(String Nitocc) {
        this.Nitocc = Nitocc;
    }

    public void setRecorrido(String Recorrido) {
        this.Recorrido = Recorrido;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }

    public void setBarriodefacturacion(String Barriodefacturacion) {
        this.Barriodefacturacion = Barriodefacturacion;
    }

    public void setClasificaciondelpredio(String Clasificaciondelpredio) {
        this.Clasificaciondelpredio = Clasificaciondelpredio;
    }

    public void setUnidadesdelpredio(String Unidadesdelpredio) {
        this.Unidadesdelpredio = Unidadesdelpredio;
    }

}
