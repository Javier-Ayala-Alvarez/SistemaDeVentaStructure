/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InicioCaja {

    private int idAdminCaja;
    private Date fechaInicio, fechaCierre;
    private double dineroInicio, dineroCierre;
    private ArrayList<Venta> ventas;
    private Usuario usuario;

    private String codigoCaja;

    public InicioCaja(int idAdminCaja, Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre) {
        this.idAdminCaja = idAdminCaja;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;

    }

    public InicioCaja() {
    }

    public InicioCaja(Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre) {
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;

    }

    public InicioCaja(int idAdminCaja) {
        this.idAdminCaja = idAdminCaja;
    }

    public int getIdAdminCaja() {
        return idAdminCaja;
    }

    public void setIdAdminCaja(int idAdminCaja) {
        this.idAdminCaja = idAdminCaja;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getDineroInicio() {
        return dineroInicio;
    }

    public void setDineroInicio(double dineroInicio) {
        this.dineroInicio = dineroInicio;
    }

    public double getDineroCierre() {
        return dineroCierre;
    }

    public void setDineroCierre(double dineroCierre) {
        this.dineroCierre = dineroCierre;
    }

    public void addVenta(Venta x) {
        ventas.add(x);
    }

    public void addUsuario(Usuario x) {
        this.usuario = x;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCodigoCaja() {
        return codigoCaja;
    }

    public void setCodigoCaja(String codigoCaja) {
        this.codigoCaja = codigoCaja;
    }

}
