

package Modelo;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import java.io.Serializable;
import java.util.Date;
//Asociacion, Agregacion y herencia
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GastoEmpresa implements  Serializable,Comparable<GastoEmpresa>{
    private int idGasto;
    private String codigoGastos;
    private Date fecha;
    private String categoria;
    private double saldo;
    private Empresa empresa; //Asociacion 
    private Empleados empleado;

    public GastoEmpresa(int idGasto, Date fecha, String categoria, double saldo) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo, Empresa empresa) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
        this.empresa = empresa;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo, Empleados empleado) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
        this.empleado = empleado;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo, Empresa empresa, Empleados empleado) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
        this.empresa = empresa;
        this.empleado = empleado;
    }
    public GastoEmpresa() {
        }
    public GastoEmpresa(Empleados empleado) {
        this.empleado = empleado;
    }
    public Empleados getEmpleado() {
        try {
            EmpleadoDao daoEmpleado = new EmpleadoDao();
        empleado = (Empleados)daoEmpleado.selectId(empleado.getIdEmpleado()).toArrayAsc().get(0);
        } catch (Exception e) {
            System.out.println(e);
            empleado = null;
        }
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public String getCodigoGastos() {
        return codigoGastos;
    }

    public void setCodigoGastos(String codigoGastos) {
        this.codigoGastos = codigoGastos;
    }

    public Empresa getEmpresa() {
        try {
             EmpresaDao daoEmpresa = new EmpresaDao();
        empresa = daoEmpresa.selectId(empresa.getIdEmpresa()).get(0);
        } catch (Exception e) {
            System.out.println(e);
            empresa = null;
        }

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }   

    @Override
    public int compareTo(GastoEmpresa t) {
        GastoEmpresa actual = this;
        return (actual.getCodigoGastos().compareToIgnoreCase(t.getCodigoGastos()));
    }

}
