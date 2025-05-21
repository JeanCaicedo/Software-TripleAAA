/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario_RCUL46
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    private String Nroreferencia;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String Municipio;
    private String Barrio;
    private String Sexo;
    private String Estrato;

    public Cliente(String Nroreferencia, String Cedula, String Nombres, String Apellidos, String Municipio, String Barrio, String Sexo, String Estrato) {
        this.Nroreferencia = Nroreferencia;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Municipio = Municipio;
        this.Barrio = Barrio;
        this.Sexo = Sexo;
        this.Estrato = Estrato;
    }

    public String getNroreferencia() {
        return Nroreferencia;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getBarrio() {
        return Barrio;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setNroreferencia(String Nroreferencia) {
        this.Nroreferencia = Nroreferencia;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
