/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author RYZEN 7
 */
public class clientes extends persona{
    private String tipoCliente;
     private double saldoCliente;

    public clientes() {
    }

    public clientes(String tipoCliente, double saldoCliente, String cedulaPersona, String nombrePersona, String direccionPersona, String telefonoPersona, String emailPersona) {
        super(cedulaPersona, nombrePersona, direccionPersona, telefonoPersona, emailPersona);
        this.tipoCliente = tipoCliente;
        this.saldoCliente = saldoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
    
     
}
