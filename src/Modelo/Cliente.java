
package Modelo;

import Modelo.dao.VentaDao;
import java.util.ArrayList;


public class Cliente extends Persona{
    private int idCliente; 
    private String codigo;
    ArrayList<Venta> ventas;

    public Cliente(int idPersona, String nombre, String apellido, String telefono, String direccion) {
        super(idPersona, nombre, apellido, telefono, direccion);
        ventas = new ArrayList();
    }

    public Cliente() {
        ventas = new ArrayList();
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        ventas = new ArrayList();
       
    }

    public Cliente(String codigo, String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        this.codigo = codigo;
    }
    

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String codigo, ArrayList<Venta> ventas, String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        this.idCliente = idCliente;
        this.codigo = codigo;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    private void addVenta(Venta x){
        ventas.add(x);
    }

    public ArrayList<Venta> getVentas() {
        
        return ventas;
    }
    public void setVentas(ArrayList<Venta> venta) {
        VentaDao daoVenta = new VentaDao();
        this.ventas = daoVenta.selectAllTo("idCliente", String.valueOf(this.getIdCliente()));
        this.ventas = venta;
    }
    
   
    
    
    
}
