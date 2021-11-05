
package Modelo;

import Modelo.dao.EmpresaDao;
public class Producto implements Comparable<Producto>{
  private int idProducto;
  private String codigoProducto;
  private String nombreProducto;
  private int cantidad;
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

    public Producto(int idProducto, String codigoProducto, String nombreProducto, int cantidad, double gananciaUni, double precioVenta, Empresa empresa) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.gananciaUni = gananciaUni;
        this.precioVenta = precioVenta;
        this.empresa = empresa;
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



    public int getCantidad() {
        return cantidad;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
