package Modelo.dao;

import Estructura.ListaDobleCircular;
import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.Producto;
import Modelo.Venta;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public VentaDao() {

    }

    public ListaDobleCircular<Venta> selectAll() {
        String sql = "select * from venta";
        return select(sql);
    }

    public ArrayList<Venta> selectId(int id) {
        String sql = "select * from venta where idVenta=" + id;
        ArrayList<Venta> lista = new ArrayList();
        Venta obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Venta();
                //obj.setIdGasto(rs.getInt("idGastos"));
                obj.setIdFactura(rs.getInt("idVenta"));
                obj.setnFactura(rs.getString("nFactura"));
                obj.setFechaVenta(rs.getDate("fechaVenta"));
                obj.setSaldoTotal(rs.getDouble("precioTotal"));
                obj.setEstado(rs.getInt("estado"));
                obj.setCliente(new Cliente(rs.getInt("idCliente")));
            
                obj.setEmpleado(new Empleados(rs.getInt("idEmpleado")));
                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
                lista.add(obj);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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

    public boolean insert(Venta obj) {
        String sql = "insert into venta(nFactura, fechaVenta, precioTotal)VALUES(?,?,?)";
        return alterarRegistro(sql, obj);
    }

    public boolean update(Venta obj) {
        String sql = "update venta set idVenta =?, nFactura =?, fechaVenta =?, precioTotal =? where idVenta=" + obj.getIdFactura();
        return alterarRegistro(sql, obj);
    }

    public boolean updateVenta(Venta obj) {
        String sql = "update venta set nFactura =?, fechaVenta =?, precioTotal =?, estado=?, idCliente=?, idCaja=?, idEmpleado=?, idEmpresa=? where idVenta=" + obj.getIdFactura();
        return alterarVenta(sql, obj);
    }

    public boolean insertarVenta(Venta obj) {
        String sql = "insert into venta(nFactura, fechaVenta, precioTotal, estado,idCliente,  idEmpleado, idEmpresa)VALUES(?,?,?,?,?,?,?)";
        return insertarVenta(sql, obj);
    }

    private ListaDobleCircular<Venta> select(String sql) {
        ListaDobleCircular<Venta> lista = new ListaDobleCircular();
        Venta obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Venta();
                //obj.setIdGasto(rs.getInt("idGastos"));
                obj.setIdFactura(rs.getInt("idVenta"));
                obj.setnFactura(rs.getString("nFactura"));
                obj.setFechaVenta(rs.getDate("fechaVenta"));
                obj.setSaldoTotal(rs.getDouble("precioTotal"));
                obj.setEstado(rs.getInt("estado"));
                obj.setCliente(new Cliente(rs.getInt("idCliente")));
               
                obj.setEmpleado(new Empleados(rs.getInt("idEmpleado")));
                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
                lista.insertar(obj);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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

    private boolean alterarVenta(String sql, Venta obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdFactura());
            ps.setString(1, obj.getnFactura());//aqui
//            ps.setDate(2, (Date) obj.getFechaVenta());//aqui
            ps.setDate(2, new java.sql.Date(obj.getFechaVenta().getTime()));
            ps.setDouble(3, obj.getSaldoTotal());//aqui
            ps.setInt(4, obj.getEstado());
            ps.setInt(5, obj.getCliente().getIdCliente());
            ps.setInt(6, obj.getEmpleado().getIdEmpleado());
            ps.setInt(7, obj.getEmpresa().getIdEmpresa());
            ps.execute();
            Alerta alerta = new Alerta(null, true, "Venta exitosa", "/img/exito.png");
            alerta.show();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Venta no exitosa en sql");
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

    private boolean alterarRegistro(String sql, Venta obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, obj.getIdFactura());//aqui
            ps.setDate(2, (Date) obj.getFechaVenta());//aqui
            ps.setDouble(3, obj.getSaldoTotal());//aqui

            ps.execute();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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

    public boolean delete(Venta obj) {
        String sql = "delete from venta where idVenta='" + obj.getIdFactura() + "'";//aqui

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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

    private boolean insertarVenta(String sql, Venta obj) {
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            //ps.setInt(0, obj.getIdFactura());
            ps.setString(1, obj.getnFactura());//aqui
//            ps.setDate(2, (Date) obj.getFechaVenta());//aqui
            ps.setDate(2, new java.sql.Date(obj.getFechaVenta().getTime()));
            ps.setDouble(3, obj.getSaldoTotal());//aqui
            ps.setInt(4, obj.getEstado());
            ps.setInt(5, obj.getCliente().getIdCliente());
            ps.setInt(6, obj.getEmpleado().getIdEmpleado());
            ps.setInt(7, obj.getEmpresa().getIdEmpresa());
            ps.execute();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en insertar Venta sql");
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

    public ArrayList<Empleados> listaEmpleaComb() {
        ArrayList<Empleados> listaEmple = new ArrayList();
        Empleados obj = null;
        try {
            String sql = "SELECT * FROM empleado WHERE estado = 1 and cargoEmpleado = 'cajero'";//1= estado producto activo
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Empleados();
                obj.setNombre(rs.getString("nombre"));
                listaEmple.add(obj);
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

        return listaEmple;
    }
}
