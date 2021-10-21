package Modelo.dao;
import Modelo.Conexion;
import Modelo.Usuario;
import Modelo.Empresa;
import Modelo.Usuario;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public UsuarioDao(){
        
    }
    
    public ArrayList<Usuario> selectAll() {
        String sql = "SELECT * fROM usuario";
        return select(sql);
    }
    
    public ArrayList<Usuario> selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM usuario WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Usuario> selectId(int id) {
        String sql = "SELECT * fROM usuario WHERE  idUsuario = " + id;
        return select(sql);
    } 
    
    public ArrayList<Usuario> buscar(String dato) {
            String sql = "SELECT * fROM usuario WHERE usuario like '" + dato 
                       + "%' or idUsuario like '" + dato + "%'";
        return select(sql);
    }
    
    public boolean insert(Usuario obj){
        String sql = "INSERT  INTO usuario (usuario, contraseña) VALUES (?,?)";
        return alterarRegistro(sql, obj);
    }
   
    public boolean update(Usuario obj) {
        System.out.println(obj.getUsuario() + "  1");
        String sql = "UPDATE usuario SET  usuario = ?, contraseña = ? WHERE idUsuario = " + obj.getIdUsuario();
        return alterarRegistro(sql, obj);
    }
   
    
    
    private ArrayList<Usuario> select(String sql){
        ArrayList<Usuario> lista = new ArrayList();
        Usuario obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
              
                obj = new Usuario();
               
                obj.setIdUsuario(rs.getInt("idUsuario"));
                obj.setUsuario(rs.getString("usuario"));
                obj.setContraseña(rs.getString("contraseña"));
                
                lista.add(obj);
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
    
    private boolean alterarRegistro(String sql, Usuario obj){
        try {
           //codigoUsuario, nombre, apellido, telefonoUsuario,dirrecionUsuario,"
             //         + "salarioUsuario,cargoUsuario,afp,isss,contatacion,estado,idEmpresa,usuario_idUsuario
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,obj.getUsuario());
            ps.setString(2,obj.getContraseña());
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
    
    /* public boolean darBaja( Usuario obj){
        try {
          
          String sql ="UPDATE empleado SET estado = '0' WHERE idUsuario = " + obj.getIdPersona();
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
           
            ps.execute();
           
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
    }*/
      
    public boolean validarUsuario(int k){
        boolean existe=false;
        String sql="SELECT * FROM usuario WHERE idUsuario='"+k+"'"; 
        
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
             while(rs.next())
                  {
                      existe=true;
                  }
            return existe; 
            
        } catch (Exception e){
            Alerta alert = new Alerta(null, true, "Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conectar.closeConexion(con);
            } catch (Exception ex) {
            }
        }
        
        return existe;
    }
}
