/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class Marcas {
    private String IdMarca;
    private String nombreMarca;
    private String descripcionMarca;

    public Marcas(String IdMarca, String nombreMarca, String descripcionMarca) {
        this.IdMarca = IdMarca;
        this.nombreMarca = nombreMarca;
        this.descripcionMarca = descripcionMarca;
    }

    public String getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(String IdMarca) {
        this.IdMarca = IdMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }
    
}
