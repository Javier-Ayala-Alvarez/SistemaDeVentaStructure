/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Estructura.ListaDobleCircular;
import Modelo.dao.ProductoDao;
import java.util.Date;

public class Reporte implements Comparable<Reporte> {

    private int idReporte;
    private Date fechaCompra;
    private int cantidad;
    private double precioCompra;
    private Producto producto = new Producto();

    public Reporte() {
    }

    public Reporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Reporte(int idReporte, Date fechaCompra, int cantidad, double precioCompra, Producto producto) {
        this.idReporte = idReporte;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.producto = producto;
    }

    public Reporte(Date fechaCompra, int cantidad, double precioCompra, Producto producto) {
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.producto = producto;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Producto getProducto() {
        ProductoDao daoProducto = new ProductoDao();
        producto = daoProducto.selectId(producto.getIdProducto()).get(0);

        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int compareTo(Reporte t) {
        Reporte actual = this;
        return (actual.getProducto().getNombreProducto().compareToIgnoreCase(t.getProducto().getNombreProducto()));
    }

    @Override
    public String toString() {
        return  String.valueOf(idReporte);
    }

   
    

}
