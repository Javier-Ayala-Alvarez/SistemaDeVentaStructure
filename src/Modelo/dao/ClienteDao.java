package Modelo.dao;

import Estructura.ListaDobleCircular;
import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.Cliente;
import Modelo.Venta;
import VistaLogin.Alerta;
import VistaMA.GastosGM;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ClienteDao(){
        
    }
    
    public ListaDobleCircular<Cliente> selectAll() {
        String sql = "select * from cliente";
        return select(sql);
    }
    
    public ArrayList<Cliente> selectId(int id) {
        String sql = "select * from cliente where idCliente=" + id;
         ArrayList<Cliente> lista = new ArrayList();
        Cliente obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new Cliente();
                obj.setIdCliente(rs.getInt("idCliente"));
                obj.setCodigo(rs.getString("codigoCliente"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefonoCliente"));
                obj.setDireccion(rs.getString("direccionCliente"));
                //obj.getVentas(new Ventas(rs.getInt("idVenta")));
                 lista.add(obj);
                
               
            }
            
        }catch(Exception e) {
             Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        
        return lista;
    } 
  
    
    public boolean insert(Cliente obj){
        String sql = "insert into cliente(codigoCliente,nombre,apellido,telefonoCliente,direccionCliente)VALUES(?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }
    
    public void update(Cliente obj) {
        String sql = "update cliente set codigoCliente =?, nombre =?, apellido =?, telefonoCliente =?, direccionCliente =? where idCliente=" + obj.getIdCliente();
        alterarRegistro(sql, obj);
    }
    
    
    private ListaDobleCircular<Cliente> select(String sql){
        ListaDobleCircular<Cliente> lista = new ListaDobleCircular();
        Cliente obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new Cliente();
                obj.setIdCliente(rs.getInt("idCliente"));
                obj.setCodigo(rs.getString("codigoCliente"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefonoCliente"));
                obj.setDireccion(rs.getString("direccionCliente"));
                //obj.getVentas(new Ventas(rs.getInt("idVenta")));
                 lista.insertar(obj);
                
               
            }
            
        }catch(Exception e) {
             Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        
        return lista;
    }
    
    private boolean alterarRegistro(String sql, Cliente obj){
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdGasto());
            ps.setString(1, obj.getCodigo());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getTelefono());
            ps.setString(5, obj.getDireccion());
            ps.execute();
            
            return true;
        }catch(Exception e) {
            Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        return false; 
    }
    public boolean delete(Cliente obj) {
        String sql = "delete from cliente where idCliente='" + obj.getIdCliente() + "'";
        
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        }catch(Exception e) {
             Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                conectar.closeConexion(con);
            } catch (Exception ex) {
            }
        }

        return false;
    }

}
