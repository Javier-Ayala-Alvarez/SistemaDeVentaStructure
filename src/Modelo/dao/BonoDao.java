package Modelo.dao;
import Estructura.ListaDoble;
import Modelo.Conexion;
import Modelo.Bono;
import Modelo.Empresa;
import Modelo.Usuario;
import VistaLogin.Alerta;
import arboles.ArbolBB;
import arboles.ArbolBinario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BonoDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public BonoDao(){
        
    }
    
    public ListaDoble selectAll() {
        String sql = "SELECT * fROM bono";
        return select(sql);
    }
    
    public ListaDoble selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM bono WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ListaDoble selectId(int id) {
        String sql = "SELECT * fROM bono WHERE  idBono = " + id;
        return select(sql);
    } 
    
    public ListaDoble buscar(String dato) {
        String sql = "SELECT * fROM bono WHERE cargoEmpleado like '" + dato 
                       + "%' or bono like '" + dato + "%' ";
        return select(sql);
    }
    
    public boolean insert(Bono obj){
        String sql = "INSERT  INTO bono (bono, cargoEmpleado) VALUES (?,?)";
        return alterarRegistro(sql, obj);
    }
    
    public boolean update(Bono obj) {
        String sql = "UPDATE bono SET bono = ?, cargoEmpleado = ? WHERE idBono = " + obj.getIdBono();
        return alterarRegistro(sql, obj);
    }
    
    
    private ListaDoble select(String sql){
        ListaDoble lista = new ListaDoble();
        Bono obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
              
                obj = new Bono();
                obj.setIdBono(rs.getInt("idBono"));
                obj.setBono(rs.getDouble("bono"));
                obj.setCargoEmpleado(rs.getString("cargoEmpleado"));
          
                
                lista.insertar(obj);
            }
            
        }catch(Exception e) {
            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
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
    
    private boolean alterarRegistro(String sql, Bono obj){
        try {
           //codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
             //         + "salarioEmpleado,cargoEmpleado,afp,isss,contatacion,estado,idEmpresa,usuario_idUsuario
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setDouble(1,obj.getBono());
            ps.setString(2, obj.getCargoEmpleado());
            
            
            ps.execute();
            //System.out.println("ujhuuj");
            return true;
        }catch(Exception e) {
            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
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
    
     private boolean deleteBono(Bono obj) {
        try {
            String sql = "DELETE FROM curso WHERE  idCurso = " + obj.getIdBono();
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //
            //
            ps.setInt(1, obj.getIdBono());
            ///
            //
            //ps.setString(1, );

            ps.execute();
            return true;
        } catch (Exception e) {

            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                conectar.closeConexion(con);
            }
        }
        return false;
    }
    
}
