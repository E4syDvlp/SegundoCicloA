/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author RYZEN 7
 */
public class persona {
    private String cedPersona;
    private String nomPersona;
    private String direcPersona;
    private String telPersona;
    private String mailPersona;

    public persona() {
    }

    public persona(String cedPersona, String nomPersona, String direcPersona, String telPersona, String mailPersona) {
        this.cedPersona = cedPersona;
        this.nomPersona = nomPersona;
        this.direcPersona = direcPersona;
        this.telPersona = telPersona;
        this.mailPersona = mailPersona;
    }

    public String getCedPersona() {
        return cedPersona;
    }

    public void setCedPersona(String cedPersona) {
        this.cedPersona = cedPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getDirecPersona() {
        return direcPersona;
    }

    public void setDirecPersona(String direcPersona) {
        this.direcPersona = direcPersona;
    }

    public String getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(String telPersona) {
        this.telPersona = telPersona;
    }

    public String getMailPersona() {
        return mailPersona;
    }

    public void setMailPersona(String mailPersona) {
        this.mailPersona = mailPersona;
    }

}
