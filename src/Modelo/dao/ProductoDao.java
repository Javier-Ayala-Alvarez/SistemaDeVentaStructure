package Modelo.dao;

import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.Producto;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Estructura.ListaDobleCircular;

public class ProductoDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ProductoDao() {

    }

    public ListaDobleCircular<Producto> selectAll() {
        String sql = "select * from producto";
        return select(sql);
    }

    public ListaDobleCircular<Producto> selectRe() {
        ListaDobleCircular<Producto> lista = new ListaDobleCircular();
        String sql = "SELECT p.IdProducto id,p.codigoProducto codigo, p.nombreProducto nombre,r.precioCompra precio,r.cantidad cantidad, p.precioVenta precioV, r.fechaCompra fecha FROM producto p INNER JOIN reporte r ON p.idProducto = r.idProducto";

        Producto obj = null;

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Producto();
                obj.setIdProducto(rs.getInt("id"));
                obj.setCodigoProducto(rs.getString("codigo"));
                obj.setNombreProducto(rs.getString("nombre"));
        
                obj.setCantidad(rs.getInt("cantidad"));
  
                obj.setPrecioVenta(rs.getDouble("precioV"));
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
    

    public ListaDobleCircular<Producto> selectAllTo(String atributo, String condicion) {
        String sql = "select * from producto where " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    public ArrayList<Producto> selectId(String atributo, String condicion) {
        String sql = "select * from producto where " + atributo + "='" + condicion + "'";
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
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setGananciaUni(rs.getDouble("gananciaUni"));
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

    public ArrayList<Producto> selectId(String codigo) {
        String sql = "select * from producto where codigoProducto=" + codigo;
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
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setGananciaUni(rs.getDouble("gananciaUni"));
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
      public ArrayList<Producto> selectId(int codigo) {
        String sql = "select * from producto where idProducto=" + codigo;
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
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setGananciaUni(rs.getDouble("gananciaUni"));
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

    public ListaDobleCircular<Producto> buscar(String dato) {////////////////////////////
        String sql = "select * from producto where idProducto like '" + dato + "%' or codigoProducto like '" + dato + "%' or nombreProducto like '" + dato + "%' or precioCompra like '" + dato + "%'  or cantidad like '" + dato + "%' or fechaVencimiento like '" + dato + "%' or max like '" + dato + "%' or min like '" + dato + "%' or estado like '" + dato + "%' or gananciaUni like '" + dato + "%' or iva like '" + dato + "%' or precioVenta like'" + dato + "%' or idEmpresa like '" + dato + "%' ";
        return select(sql);
    }

    public boolean insert(Producto obj) {
        String sql = "insert into producto(idProducto, codigoProducto, nombreProducto, precioCompra, cantidad, fecha, estado, gananciaUni, iva, precioVenta, idEmpresa)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public boolean insertRe(Producto obj) {
        String sql = "insert into reporte( fechaCompra,cantidad, precioCompra, idProducto)VALUES(?,?,?,?)";
        return alterarRegistroRe(sql, obj);
    }
    public boolean insertProducto(Producto obj) {
        String sql = "INSERT INTO producto(codigoProducto, nombreProducto, cantidad, gananciaUni, precioVenta, idEmpresa)VALUES(?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public boolean updateProducto(Producto obj) {
        String sql = "UPDATE producto SET codigoProducto =?, nombreProducto =?, cantidad =?, gananciaUni =?, precioVenta =?, idEmpresa =? WHERE idProducto=" + obj.getIdProducto();
        return alterarRegistro(sql, obj);
    }

    public ListaDobleCircular<Producto> listaProductComb() {
         ListaDobleCircular<Producto> lista = new ListaDobleCircular();
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

    private boolean alterarRegistroCantidad(String sql, Producto obj) {
        try {

            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdProducto());
            ps.setString(1, obj.getCodigoProducto());
            ps.setString(2, obj.getNombreProducto());

            ps.setDouble(4, obj.getCantidad());
   
            ps.setDouble(9, obj.getGananciaUni());

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

    private ListaDobleCircular<Producto> select(String sql) {
        ListaDobleCircular<Producto> lista = new ListaDobleCircular();
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
                obj.setCantidad(rs.getInt("cantidad"));
                obj.setGananciaUni(rs.getDouble("gananciaUni"));
                obj.setPrecioVenta(rs.getDouble("precioVenta"));
                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
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

    private boolean alterarRegistro(String sql, Producto obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, obj.getCodigoProducto());
            ps.setString(2, obj.getNombreProducto());
            ps.setInt(3, obj.getCantidad());
            ps.setDouble(4, obj.getGananciaUni());
            ps.setDouble(5, obj.getPrecioVenta());
            ps.setInt(6, obj.getEmpresa().getIdEmpresa());

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

    private boolean alterarRegistroRe(String sql, Producto obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdProducto());

            ps.setInt(2, obj.getCantidad());

            ps.setInt(4, obj.getIdProducto());

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
        String sql = "delete from producto where idProducto='" + obj.getIdProducto() + "'";

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
