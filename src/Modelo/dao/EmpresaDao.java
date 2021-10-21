package Modelo.dao;
import Modelo.Conexion;
import Modelo.Empresa;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpresaDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public EmpresaDao(){
        
    }
    
    public ArrayList<Empresa> selectAll() {
        String sql = "SELECT * fROM empresa";
        return select(sql);
    }
    
    public ArrayList<Empresa> selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM empresa WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Empresa> selectId(int id) {
        String sql = "SELECT * fROM empresa WHERE  idEmpresa = " + id;
        return select(sql);
    } 
    
    public ArrayList<Empresa> buscar(String dato) {
        String sql = "SELECT * fROM empresa WHERE idEmpresa like '" + dato 
                       + "%' or codigoEmpresa like '" + dato + "%' or nombreEmpresa like '" + dato + "%' ";
        return select(sql);
    }
    
    public boolean insert(Empresa obj){
      //iNSERT INTO `ventasjava`.`empresa` (`codigoEmpresa`, `nombreEmpresa`, `dirrecionEmpresa`, `correoEmpresa`) VALUES ('1', '2', '2', '2');
        String sql = "INSERT INTO empresa (codigoEmpresa , nombreEmpresa , dirrecionEmpresa , correoEmpresa) VALUES (?,?,?,?)";
        return alterarRegistro(sql, obj);
    }
    //UPDATE `empresa` SET `codigoEmpresa`='2', `nombreEmpresa`='Tienda1', `dirrecionEmpresa`='San vicente1' WHERE (`idEmpresa`='1')
    public boolean update(Empresa obj) {
        String sql = "UPDATE empresa SET codigoEmpresa = ? , nombreEmpresa = ?, dirrecionEmpresa = ?, correoEmpresa = ? WHERE idEmpresa = " + obj.getIdEmpresa();
        return alterarRegistro(sql, obj);
    }
    
    
    private ArrayList<Empresa> select(String sql){
        ArrayList<Empresa> lista = new ArrayList();
        Empresa obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new Empresa();
                obj.setIdEmpresa(rs.getInt("idEmpresa"));
                obj.setCodigoEmpresa(rs.getString("codigoEmpresa"));
                obj.setNombre(rs.getString("nombreEmpresa"));
                obj.setDireccion(rs.getString("dirrecionEmpresa"));
                obj.setCorreo(rs.getString("correoEmpresa"));
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
    
    private boolean alterarRegistro(String sql, Empresa obj){
        try {
            //UNSERT INTO `ventasjava`.`empresa` (`codigoEmpresa`, `nombreEmpresa`, `dirrecionEmpresa`, `correoEmpresa`) VALUES ('1', '2', '2', '2');
           con = conectar.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, obj.getCodigoEmpresa());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getDireccion());
            ps.setString(4, obj.getCorreo());
            ps.execute();
            System.out.println("ujhuuj");
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
    
    
}
