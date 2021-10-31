
package Modelo;

import Modelo.dao.EmpresaDao;
import java.util.Date;

public class Producto implements Comparable<Producto>{
  private int idProducto;
  private String codigoProducto;
  private String nombreProducto;
  private double precioCompra;
  private int cantidad;
  private Date fecha;
  private int estado;
  private double gananciaUni;
  private double precioVenta;
  private Empresa empresa;

    public Producto() {
        
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Producto(String codigoProducto, String nombreProducto, double precioCompra, int cantidad, Date fecha, int estado, double gananciaUni, double precioVenta, Empresa empresa) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.estado = estado;
        this.gananciaUni = gananciaUni;
        this.precioVenta = precioVenta;
        this.empresa = empresa;
    }

    public Producto(int idProducto, double precioCompra, int cantidad, Date fecha) {
        this.idProducto = idProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

   

    public Producto(String codigoProducto, String nombreProducto, int cantidad, double gananciaUni, double precioVenta, Empresa empresa) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.gananciaUni = gananciaUni;
        this.precioVenta = precioVenta;
        this.empresa = empresa;
    }



    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getGananciaUni() {
        return gananciaUni;
    }

    public void setGananciaUni(double gananciaUni) {
        this.gananciaUni = gananciaUni;
    }



    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Empresa getEmpresa() {
        EmpresaDao daoEmpresa = new EmpresaDao();
        empresa = daoEmpresa.selectId(empresa.getIdEmpresa()).get(0);

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public int compareTo(Producto t) {
         Producto actual = this;
        return(actual.getNombreProducto().compareToIgnoreCase(t.getNombreProducto()));
    }

    @Override
    public String toString() {
        return  codigoProducto;
    }
    
}
