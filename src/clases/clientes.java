/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RYZEN 7
 */
public class clientes {


    //ATRIBUTOS DE LA CLASE
    private int cedulaRUC;
    private String nombres;
    private String correo;
    private String direccion;
    private int celular;
    private String genero;
    private int saldo;
    //CONSTRUCTOR DE LA CLASE

    public clientes(int cedulaRUC, String nombres, String correo, String direccion, int celular, String genero, int saldo) {
        this.cedulaRUC = cedulaRUC;
        this.nombres = nombres;
        this.correo = correo;
        this.direccion = direccion;
        this.celular = celular;
        this.genero = genero;
        this.saldo = saldo;
    }
    //ENCAPSULAMIENTO DE LOS DATOS

    public int getCedulaRUC() {
        return cedulaRUC;
    }

    public void setCedulaRUC(int cedulaRUC) {
        this.cedulaRUC = cedulaRUC;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
        public String medDatos(){
        return "Cedula: " +getCedulaRUC()+"\n"+
                "Nombres: " +getNombres()+"\n"+
                "Correo: " +getCorreo()+"\n"+
                "Dirección: " +getDireccion()+"\n"+
                "Celular: " +getCelular()+"\n"+
"Genero: " +getGenero()+"\n"+
                "Saldo: " +getSaldo()+"\n";

        
    }
}
