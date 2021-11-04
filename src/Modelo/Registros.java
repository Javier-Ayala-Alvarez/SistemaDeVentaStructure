
package Modelo;

import Modelo.dao.ProductoDao;
import java.util.ArrayList;

public class Registros implements Comparable<Registros>{
    private int idRegistros;
    private int cantidadProducto;
    private double precioTotalProducto;
    Producto producto;
    Venta venta;
    public Registros() {
        
    }

    public Registros(int cantidadProducto, double precioTotalProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioTotalProducto = precioTotalProducto;
        
    }

    public Registros(int cantidadProducto, double precioTotalProducto, Producto producto, Venta venta) {
        this.cantidadProducto = cantidadProducto;
        this.precioTotalProducto = precioTotalProducto;
        this.producto = producto;
        this.venta = venta;
    }

    public Registros(int idRegistros) {
        this.idRegistros = idRegistros;
    }
    

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioTotalProducto() {
        return precioTotalProducto;
    }
   
    public void setPrecioTotalProducto(double precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }
     
    public void addProducto(Producto x){
        this.producto = x;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        ProductoDao daoproducto = new ProductoDao();
       producto = daoproducto.selectId(producto.getIdProducto()).get(0);
        return producto;
    }

    public int getIdRegistros() {
        return idRegistros;
    }

    public void setIdRegistros(int idRegistrod) {
        this.idRegistros = idRegistros;
    }

    public Venta getVenta() {
        
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }       

    @Override
    public int compareTo(Registros t) {
        Registros actual = this;
        return(String.valueOf(actual.getPrecioTotalProducto()).compareToIgnoreCase(String.valueOf(t.getPrecioTotalProducto())));
    }

    @Override
    public String toString() {
        return  String.valueOf(idRegistros) ;
    }
    
    
}
