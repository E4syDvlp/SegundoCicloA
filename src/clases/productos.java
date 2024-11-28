/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class productos {
    private String idProducto;
    private String nombreProducto;
    private String desProducto;
    private int stockMinimo;
    private int stockMaximo;
    private double prCompra;
    private double prVenta;
    private String fechaRegistro;
    private String fechaExpiracion;
    private double porcentajeDescuento;
    private String nombreMarca;
    private String categoria;
    //CONSTRUCTOR DE LA CLASE

    public productos(String idProducto, String nombreProducto, String desProducto, int stockMinimo, int stockMaximo, double prCompra, double prVenta, String fechaRegistro, String fechaExpiracion, double porcentajeDescuento, String nombreMarca, String categoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.desProducto = desProducto;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.prCompra = prCompra;
        this.prVenta = prVenta;
        this.fechaRegistro = fechaRegistro;
        this.fechaExpiracion = fechaExpiracion;
        this.porcentajeDescuento = porcentajeDescuento;
        this.nombreMarca = nombreMarca;
        this.categoria = categoria;
    }
    //ENCAPSULAMIENTO 

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public double getPrCompra() {
        return prCompra;
    }

    public void setPrCompra(double prCompra) {
        this.prCompra = prCompra;
    }

    public double getPrVenta() {
        return prVenta;
    }

    public void setPrVenta(double prVenta) {
        this.prVenta = prVenta;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
