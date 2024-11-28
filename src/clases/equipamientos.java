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
public class equipamientos {
    //ATRIBUTOS DE LA CLASE
    private String numSerieEquip;
    private String tipoEquip;
    private String disponibilidadEquip;
    private String estadoEquip;
    private String categoriaEquip;
    //CONSTRUCTOR DE LA CLASE

    public equipamientos(String numSerieEquip, String tipoEquip, String disponibilidadEquip, String estadoEquip, String categoriaEquip) {
        this.numSerieEquip = numSerieEquip;
        this.tipoEquip = tipoEquip;
        this.disponibilidadEquip = disponibilidadEquip;
        this.estadoEquip = estadoEquip;
        this.categoriaEquip = categoriaEquip;
    }
 
     
    //ENCAPSULAMIENTO DE DATOS
    public String getNumSerieEquip() {
        return numSerieEquip;
    }

    public void setNumSerieEquip(String numSerieEquip) {
        this.numSerieEquip = numSerieEquip;
    }

    public String getTipoEquip() {
        return tipoEquip;
    }

    public void setTipoEquip(String tipoEquip) {
        this.tipoEquip = tipoEquip;
    }

 
    public String getEstadoEquip() {
        return estadoEquip;
    }

    public void setEstadoEquip(String estadoEquip) {
        this.estadoEquip = estadoEquip;
    }

    public String getCategoriaEquip() {
        return categoriaEquip;
    }

    public void setCategoriaEquip(String categoriaEquip) {
        this.categoriaEquip = categoriaEquip;
    }
   
   

    public String getDisponibilidadEquip() {
        return disponibilidadEquip;
    }

    public void setDisponibilidadEquip(String disponibilidadEquip) {
        this.disponibilidadEquip = disponibilidadEquip;
    }
    
}
