
package Modelo;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import java.util.ArrayList;
import java.util.Date;

public class Venta  implements Comparable<Venta>{
   private int  idFactura;
   private String  nFactura;
   private Date fechaVenta;
   private double saldoTotal;
   private int estado;
   private ArrayList<Registros> registros;
   private Cliente cliente;
   private Empleados empleado;
   private Empresa empresa;
   private int max;
   
    

    public Venta(){
    }

    public Venta(int idFactura) {
        this.idFactura = idFactura;
    }
    

    public Venta(int idFactura, Date fechaVenta, double saldoTotal) {
        this.idFactura = idFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
    }

    public Venta(Date fechaVenta, double saldoTotal) {
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
    }

    public Venta(int idFactura, Date fechaVenta, double saldoTotal, ArrayList<Registros> registros, Empleados empleado) {
        this.idFactura = idFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
        this.registros = registros;
        this.empleado = empleado;
    }

    public Venta(int idFactura, String nFactura, Date fechaVenta, double saldoTotal, ArrayList<Registros> registros,  Cliente cliente, Empleados empleado) {
        this.idFactura = idFactura;
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
        this.registros = registros;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Venta(String nFactura, Date fechaVenta, double saldoTotal, Cliente cliente, Empleados empleado) {
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Venta(String nFactura, Date fechaVenta,  Cliente cliente, Empleados empleado,double saldoTotal) {
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.saldoTotal = saldoTotal;
    }
    

    public int getEstado() {

        return estado;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setEstado(int estado) {

        this.estado = estado;
    }

    public Empresa getEmpresa() {
       EmpresaDao daoEmpresa = new EmpresaDao();
       empresa = daoEmpresa.selectId(empresa.getIdEmpresa()).get(0);
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
    }



    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public ArrayList<Registros> getRegistros() {
        return registros;
    }
    
    public void addRegistro(Registros x){
       registros.add(x);   
    }
    
   
    
    public void addCliente(String nombre, String apellido, String telefono, String direccion){
        cliente = new Cliente(nombre, apellido, telefono, direccion);
    }

    public Cliente getCliente() {
        ClienteDao daoCliente = new ClienteDao();
        cliente = daoCliente.selectId(cliente.getIdCliente()).get(0);
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleado() {
        EmpleadoDao daoEmpleado = new EmpleadoDao();
        empleado = (Empleados)daoEmpleado.selectId(empleado.getIdEmpleado()).toArrayAsc().get(0);
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public void setRegistros(ArrayList<Registros> registros) {
        this.registros = registros;
    }

  

    @Override
    public int compareTo(Venta t) {
         Venta actual = this;
        return(actual.getFechaVenta().compareTo(t.getFechaVenta()));
    }

    @Override
    public String toString() {
        return nFactura;
    }

 
    

  
}
