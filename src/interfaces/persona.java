/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author RYZEN 7
 */
public class persona {
    private String cedulaPersona;
     private String nombrePersona;
     private String direccionPersona;
      private String telefonoPersona;
     private String emailPersona;

    public persona() {
    }

    public persona(String cedulaPersona, String nombrePersona, String direccionPersona, String telefonoPersona, String emailPersona) {
        this.cedulaPersona = cedulaPersona;
        this.nombrePersona = nombrePersona;
        this.direccionPersona = direccionPersona;
        this.telefonoPersona = telefonoPersona;
        this.emailPersona = emailPersona;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }
     
}
