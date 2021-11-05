package Modelo.dao;

import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.Reporte;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Estructura.ListaDobleCircular;
import Modelo.Producto;
import java.sql.Date;

public class ReporteDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ReporteDao() {

    }

    public ListaDobleCircular<Reporte> selectRe() {
        ListaDobleCircular<Reporte> lista = new ListaDobleCircular();

        String sql = "SELECT p.idProducto id,r.idReporte idr,p.codigoProducto codigo, p.nombreProducto nombre,r.precioCompra precio,r.cantidad cantidad, p.precioVenta precioV, r.fechaCompra fecha FROM producto p INNER JOIN reporte r ON p.idProducto = r.idProducto";

        Reporte obj = null;

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Reporte();
                obj.setIdReporte(rs.getInt("idr"));
                obj.setFechaCompra(rs.getDate("fecha"));
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setPrecioCompra(rs.getDouble("precio"));
                obj.setProducto(new Producto(rs.getInt("id")));

                lista.insertar(obj);
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
     public ListaDobleCircular<Reporte> selectReporteTo(int codigo) {
        ListaDobleCircular<Reporte> lista = new ListaDobleCircular();

         String sql = "select * from reporte where idProducto=" + codigo;

        Reporte obj = null;

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Reporte();
                obj.setIdReporte(rs.getInt("idReporte"));
                obj.setFechaCompra(rs.getDate("fechaCompra"));
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setPrecioCompra(rs.getDouble("precioCompra"));
                obj.setProducto(new Producto(rs.getInt("idProducto")));

                lista.insertar(obj);
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
   public ListaDobleCircular<Reporte> selectReporte() {
        ListaDobleCircular<Reporte> lista = new ListaDobleCircular();

        String sql = "SELECT * FROM reporte";

        Reporte obj = null;

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Reporte();
                obj.setIdReporte(rs.getInt("idReporte"));
                obj.setFechaCompra(rs.getDate("fechaCompra"));
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setPrecioCompra(rs.getDouble("precioCompra"));
                obj.setProducto(new Producto(rs.getInt("idProducto")));

                lista.insertar(obj);
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

 
    public boolean insert(Reporte obj) {
        String sql = "insert into reporte(fechaCompra,cantidad,precioCompra,idProducto)VALUES(?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public boolean update(Reporte obj) {
        String sql = "update reporte set  fechaCompra =?,cantidad =?, precioCompra =?, idProducto =? where idReporte=" + obj.getIdReporte();
        return alterarRegistro(sql, obj);
        
    }

    public boolean updateCantidad(Reporte obj) {
        String sql = "update producto set codigoReporte =?, nombreReporte =?, precioCompra =?, cantidad =?, fechaVencimiento =?, max =?, min =?, estado =?, gananciaUni =?, iva =?, precioVenta =? where idReporte=" + obj.getIdReporte();
        return alterarRegistroCantidad(sql, obj);
    }

    private boolean alterarRegistroCantidad(String sql, Reporte obj) {
        try {

            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdReporte());
//            ps.setString(1, obj.getCodigoReporte());
//            ps.setString(2, obj.getNombreReporte());
//            ps.setDouble(3, obj.getPrecioCompra());
//            ps.setDouble(4, obj.getCantidad());
//            ps.setDate(5, new java.sql.Date(obj.getFecha().getTime()));
//            ps.setInt(8, obj.getEstado());
//            ps.setDouble(9, obj.getGananciaUni());
//
//            ps.setDouble(11, obj.getPrecioVenta());
//            ps.setInt(12, obj.getEmpresa().getIdEmpresa());

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


    private boolean alterarRegistro(String sql, Reporte obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(obj.getFechaCompra().getTime()));
            ps.setInt(2, obj.getCantidad());
             ps.setDouble(3, obj.getPrecioCompra());
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

    public boolean delete(Reporte obj) {
        String sql = "delete from producto where idReporte='" + obj.getIdReporte() + "'";

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
