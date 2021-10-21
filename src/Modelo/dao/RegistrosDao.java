package Modelo.dao;

import Modelo.Conexion;
import Modelo.Producto;
import Modelo.Registros;
import Modelo.Venta;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RegistrosDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<Registros> selectAll() {
        String sql = "select * from registros";
        return select(sql);
    }

    public ArrayList<Registros> selectAllTo(String atributo, String condicion) {
        String sql = "select * from registros where " + atributo + "='" + condicion + "'";
        return select(sql);
    }

    public ArrayList<Registros> selectId(int id) {
        String sql = "select * from registros where idRegistros=" + id;
        return select(sql);
    }

    public ArrayList<Registros> buscar(String dato) {
        String sql = "select * from registros where idRegistros like '" + dato + "%' or cantidadProducto like '" + dato + "%' or precioTotalProducto like '" + dato + "%'  or idVenta like '" + dato + "%'  or idProducto like '" + dato + "%'";
        return select(sql);
    }

    public boolean insert(Registros obj) {
        String sql = "insert into registros(cantidadProducto,precioTotalProducto,idVenta,idProducto)VALUES(?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public void update(Registros obj) {
        String sql = "update registros set cantidadProducto =?, precioTotalProducto =?, idVenta =?, idProducto =? where idRegistros=" + obj.getIdRegistros();
        alterarRegistro(sql, obj);
    }

    private ArrayList<Registros> select(String sql) {
        ArrayList<Registros> lista = new ArrayList();
        Registros obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Registros();
                obj.setIdRegistros(rs.getInt("idRegistros"));
                obj.setCantidadProducto(rs.getInt("cantidadProducto"));
                obj.setPrecioTotalProducto(rs.getDouble("precioTotalProducto"));
                obj.setVenta(new Venta(rs.getInt("idVenta")));
                obj.setProducto(new Producto(rs.getInt("idProducto")));

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

    private boolean alterarRegistro(String sql, Registros obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdGasto());
            ps.setInt(1, obj.getCantidadProducto());
            ps.setDouble(2, obj.getPrecioTotalProducto());
            ps.setInt(3, obj.getVenta().getIdFactura());
            ps.setInt(4, obj.getProducto().getIdProducto());
            ps.execute();

            return true;
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
        return false;
    }

    public boolean delete(int m, double n, int id) { 
        String sqlNew = "delete from registros where cantidadProducto='" + m + "' AND precioTotalProducto='" + n + "' AND idVenta='" + id + "'";

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sqlNew);
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
