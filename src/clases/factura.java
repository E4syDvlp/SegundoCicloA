package clases;

public class factura {

//Cabecera factura    
private String numFactura;    
private String fecha;    
private String cedulaCliente;    
private String nombresCliente;    
private double subtFactura;    
private double descFactura;    
private double ivaFactua;    
private double totalFactura;

//Detalle factura
private String idProducto;    
private String nombreProducto;    
private int cantProducto;    
private double precioProducto;    
private double totalLinea; 

    public factura() {
    }

    public factura(String numFactura, String fecha, String cedulaCliente, String nombresCliente, double subtFactura, double descFactura, double ivaFactua, double totalFactura) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.nombresCliente = nombresCliente;
        this.subtFactura = subtFactura;
        this.descFactura = descFactura;
        this.ivaFactua = ivaFactua;
        this.totalFactura = totalFactura;
    }

    public factura(String idProducto, String nombreProducto, int cantProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantProducto = cantProducto;
        this.precioProducto = precioProducto;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public double getSubtFactura() {
        return subtFactura;
    }

    public void setSubtFactura(double subtFactura) {
        this.subtFactura = subtFactura;
    }

    public double getDescFactura() {
        return descFactura;
    }

    public void setDescFactura(double descFactura) {
        this.descFactura = descFactura;
    }

    public double getIvaFactua() {
        return ivaFactua;
    }

    public void setIvaFactua(double ivaFactua) {
        this.ivaFactua = ivaFactua;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

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

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getTotalLinea() {
        return totalLinea=getCantProducto()*getPrecioProducto();
    }
}
