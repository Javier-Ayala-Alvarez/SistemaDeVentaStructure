package Modelo.dao;

import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.Producto;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductoDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ProductoDao() {

    }

    public ArrayList<Producto> selectAll() {
        String sql = "select * from producto";
        return select(sql);
    }

    public ArrayList<Producto> selectAllTo(String atributo, String condicion) {
        String sql = "select * from producto where " + atributo + "='" + condicion + "'";
        return select(sql);
    }

    public ArrayList<Producto> selectId(int id) {
        String sql = "select * from producto where idProducto=" + id;
        return select(sql);
    }

    public ArrayList<Producto> buscar(String dato) {////////////////////////////
        String sql = "select * from producto where idProducto like '" + dato + "%' or codigoProducto like '" + dato + "%' or nombreProducto like '" + dato + "%' or precioCompra like '" + dato + "%'  or cantidad like '" + dato + "%' or fechaVencimiento like '" + dato + "%' or max like '" + dato + "%' or min like '" + dato + "%' or estado like '" + dato + "%' or gananciaUni like '" + dato + "%' or iva like '" + dato + "%' or precioVenta like'" + dato + "%' or idEmpresa like '" + dato + "%' ";
         return select(sql);
    }

    public boolean insert(Producto obj) {
        String sql = "insert into producto(idProducto, codigoProducto, nombreProducto, precioCompra, cantidad, fechaVencimiento, max, min, estado, gananciaUni, iva, precioVenta, idEmpresa)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public void update(Producto obj) {
        String sql = "update producto set idProducto =?, codigoProducto =?, nombreProducto =?, precioCompra =?, cantida =?, fechaVencimiento =?, max =?, min =?, estado =?, gananciaUni =?, iva =?, precioVenta =?, idEmpresa =? where idProducto=" + obj.getIdProducto();
        alterarRegistro(sql, obj);
    }

    
    
    public boolean insertProducto(Producto obj) {
        String sql = "INSERT INTO producto(codigoProducto, nombreProducto, precioCompra, cantidad, fechaVencimiento, max, min, estado, gananciaUni, iva, precioVenta, idEmpresa)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }
    public boolean updateProducto(Producto obj) {
        String sql = "UPDATE producto SET codigoProducto =?, nombreProducto =?, precioCompra =?, cantidad =?, fechaVencimiento =?, max =?, min =?, estado =?, gananciaUni =?, iva =?, precioVenta =?, idEmpresa =? WHERE idProducto=" + obj.getIdProducto();
        return alterarRegistro(sql, obj);
    }
    
    
    
    
    
    
    public boolean updateCantidad(Producto obj) {
        String sql = "update producto set codigoProducto =?, nombreProducto =?, precioCompra =?, cantidad =?, fechaVencimiento =?, max =?, min =?, estado =?, gananciaUni =?, iva =?, precioVenta =? where idProducto=" + obj.getIdProducto();
        return alterarRegistroCantidad(sql, obj);
    }
    public ArrayList<Producto> listaProductComb() {
        ArrayList<Producto> listaProduc = new ArrayList();
        ArrayList<Producto> listaProdT = new ArrayList();
        Producto obj = null;
        try {
            String sql = "SELECT * FROM producto WHERE estado = 1";//1= estado producto activo
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Producto();
                obj.setCodigoProducto(rs.getString("codigoProducto"));
                obj.setNombreProducto(rs.getString("nombreProducto"));
                obj.setPrecioVenta(rs.getDouble("precioVenta"));
                listaProduc.add(obj);
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

        return listaProduc;
    }
    private boolean alterarRegistroCantidad(String sql, Producto obj) {
        try {
            

            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdProducto());
            ps.setString(1, obj.getCodigoProducto());
            ps.setString(2, obj.getNombreProducto());
            ps.setDouble(3, obj.getPrecioCompra());
                ps.setDouble(4, obj.getCantidad());
                            ps.setDate(5, new java.sql.Date(obj.getFechaVencimiento().getTime()));
                            ps.setInt(6, obj.getMax());
                            ps.setInt(7, obj.getMin());
                            ps.setInt(8, obj.getEstado());
                            ps.setDouble(9, obj.getGananciaUni());
                            ps.setDouble(10, obj.getIva());
            ps.setDouble(11, obj.getPrecioVenta());
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
    
    
    

    private ArrayList<Producto> select(String sql) {
        ArrayList<Producto> lista = new ArrayList();
        Producto obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Producto();
                obj.setIdProducto(rs.getInt("idProducto"));
                obj.setCodigoProducto(rs.getString("codigoProducto"));
                obj.setNombreProducto(rs.getString("nombreProducto"));
                obj.setPrecioCompra(rs.getDouble("precioCompra"));
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setFechaVencimiento(rs.getDate("fechaVencimiento"));
                obj.setMax(rs.getInt("max"));
                obj.setMin(rs.getInt("min"));
                obj.setEstado(rs.getInt("estado"));
                obj.setGananciaUni(rs.getDouble("gananciaUni"));
                obj.setIva(rs.getDouble("iva"));
                obj.setPrecioVenta(rs.getDouble("precioVenta"));
                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
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

    private boolean alterarRegistro(String sql, Producto obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdProducto());
            ps.setString(1, obj.getCodigoProducto());
            ps.setString(2, obj.getNombreProducto());
            ps.setDouble(3, obj.getPrecioCompra());
            ps.setInt(4, obj.getCantidad());
            ps.setDate(5, new java.sql.Date(obj.getFechaVencimiento().getTime()));
            ps.setInt(6, obj.getMax());
            ps.setInt(7, obj.getMin());
            ps.setInt(8, obj.getEstado());
            ps.setDouble(9, obj.getGananciaUni());
            ps.setDouble(10, obj.getIva());
            ps.setDouble(11, obj.getPrecioVenta());
            ps.setInt(12, obj.getEmpresa().getIdEmpresa());

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
    
    
    public boolean delete(Producto obj) {
        String sql = "delete from producto where idProducto='" + obj.getIdProducto() +"'";
        
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
