package Modelo.dao;

import Modelo.Conexion;
import Modelo.InicioCaja;
import Modelo.Usuario;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InicioCajaDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Usuario usuario; 

//////    public InicioCajaDao(Usuario usuario) {
//////        this.usuario = usuario;
//////    }

    public InicioCajaDao() {
    }



    public ArrayList<InicioCaja> selectAll() {
        String sql = "select * from iniciocaja";
        return select(sql);
    }

    public ArrayList<InicioCaja> selectAll1() {
        String sql = "select * from iniciocaja";
        return select1(sql);
    }

    public ArrayList<InicioCaja> selectAllTo(String atributo, String condicion) {
        String sql = "select * from iniciocaja where " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    public ArrayList<InicioCaja> selectAllWithCondition( String condicion) {
        //select * FROM iniciocaja WHERE fechaCierre LIKE '2021%' ORDER BY fechaCierre ASC;
        String sql = "select * FROM iniciocaja WHERE "  + condicion;
        return select(sql);
    }

    public ArrayList<InicioCaja> selectId(int id) {
        String sql = "select * from iniciocaja where idCaja=" + id;
        return select(sql);
    }

    public ArrayList<InicioCaja> buscar(String dato) {
        String sql = "select * from iniciocaja where idCaja like '" + dato + "%' or codigoCaja like '" + dato + "%' or fechaInicio like '" + dato + "%'  or fechaCierre like '" + dato + "%'  or dineroCajaInicio like '" + dato + "%' or dineroCajaCierre like '" + dato + "%' or idUsuario like '" + dato + "%'";
        return select(sql);
    }

    public boolean insert1(InicioCaja obj) {
        String sql = "insert into iniciocaja(codigoCaja,fechaInicio,fechaCierre,dineroCajaInicio,dineroCajaCierre)VALUES(?,?,?,?,?)";
        return alterarRegistro1(sql, obj);
    }

    public boolean insert(InicioCaja obj) {
        String sql = "insert into iniciocaja(codigoCaja,fechaInicio,fechaCierre,dineroCajaInicio,dineroCajaCierre,idUsuario)VALUES(?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public boolean update(InicioCaja obj) {
        String sql = "UPDATE `iniciocaja` SET `fechaCierre`=?,`dineroCajaCierre`=? WHERE `idCaja`='" + obj.getIdAdminCaja()+"'";
        return alterarRegistro1(sql, obj);
    }

    private ArrayList<InicioCaja> select(String sql) {
        ArrayList<InicioCaja> lista = new ArrayList();
        InicioCaja obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new InicioCaja();
                obj.setIdAdminCaja(rs.getInt("idCaja"));
                obj.setCodigoCaja(rs.getString("codigoCaja"));
                obj.setFechaInicio(rs.getDate("fechaInicio"));
                obj.setFechaCierre(rs.getDate("fechaCierre"));
                obj.setDineroInicio(rs.getDouble("dineroCajaInicio"));
                obj.setDineroCierre(rs.getDouble("dineroCajaCierre"));
                obj.setUsuario(new Usuario(rs.getInt("idUsuario")));
                lista.add(obj);
            }

        } catch (Exception e) {
            Alerta alert = new Alerta(null, true, "Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {

            }
            conectar.closeConexion(con);
        }

        return lista;
    }

    private ArrayList<InicioCaja> select1(String sql) {
        ArrayList<InicioCaja> lista = new ArrayList();
        InicioCaja obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new InicioCaja();
                obj.setIdAdminCaja(rs.getInt("idCaja"));
                obj.setCodigoCaja(rs.getString("codigoCaja"));
                obj.setFechaInicio(rs.getDate("fechaInicio"));
                obj.setFechaCierre(rs.getDate("fechaCierre"));
                obj.setDineroInicio(rs.getDouble("dineroCajaInicio"));
                obj.setDineroCierre(rs.getDouble("dineroCajaCierre"));
                obj.setUsuario(new Usuario(rs.getInt("idUsuario")));
                lista.add(obj);
            }

        } catch (Exception e) {
            Alerta alert = new Alerta(null, true, "Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {

            }
            conectar.closeConexion(con);
        }

        return lista;
    }

    private boolean alterarRegistro(String sql, InicioCaja obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdGasto());
            ps.setString(1, obj.getCodigoCaja());
            ps.setDate(2, new java.sql.Date(obj.getFechaInicio().getTime()));
            ps.setDate(3, new java.sql.Date(obj.getFechaCierre().getTime()));
            ps.setDouble(4, obj.getDineroInicio());
            ps.setDouble(5, obj.getDineroCierre());
            ps.setInt(6, obj.getUsuario().getIdUsuario());
            ps.execute();

            return true;
        } catch (Exception e) {
            Alerta alert = new Alerta(null, true,"Error en sql Dao Insertar", "/img/error.png");
            alert.show();
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {

            }
            conectar.closeConexion(con);
        }
        return false;
    }

    private boolean alterarRegistro1(String sql, InicioCaja obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(obj.getFechaCierre().getTime()));
            ps.setDouble(2, obj.getDineroCierre());
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            Alerta alert = new Alerta(null, true, "Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
            return false;
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {

            }
            conectar.closeConexion(con);
        }
        
    }

    public boolean delete(InicioCaja obj) {
        String sql = "delete from iniciocaja where idCaja='" + obj.getIdAdminCaja() + "'";

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (Exception e) {
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

        return false;
    }
    
    
}
