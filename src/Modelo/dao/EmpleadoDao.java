package Modelo.dao;

import Estructura.ListaDobleCircular;
import Modelo.Bono;
import Modelo.Conexion;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.Usuario;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDao {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public EmpleadoDao() {

    }

    public ListaDobleCircular selectAll() {
        String sql = "SELECT * fROM Empleado";
        return select(sql);
    }

    public ListaDobleCircular selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM empleado WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    public ListaDobleCircular selectAllUsu() {
        String sql = "SELECT * fROM empleado WHERE  cargoEmpleado = 'Administrador' AND estado = '1' AND idUsuario != 'null'";
        return select(sql);
    }
    
    public ListaDobleCircular selectAllTo(String atributo, int condicion) {
        String sql = "SELECT * fROM empleado WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }

    public ListaDobleCircular selectId(int id) {
        String sql = "SELECT * fROM empleado WHERE  idEmpleado = " + id;
        return select(sql);
    }
        public ListaDobleCircular selectCodigo(String id) {
        String sql = "SELECT * fROM empleado WHERE codigoEmpleado  = '" + id + "'";
        return select(sql);
    }
        


    public ListaDobleCircular buscar(String dato) {
        String sql = "SELECT * fROM empleado WHERE codigoEmpleado like '" + dato
                + "%' or cargoEmpleado like '" + dato + "%' or nombre like '" + dato + "%' ";
        return select(sql);
    }
    
        public int  ultimoRegistro () {
        String sql = "select idempleado from empleado  order  by idempleado desc limit 1;";
        
        
        
       
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int ultimo = 0;

            while (rs.next()) {
                
                ultimo = rs.getInt(1);
            }
            return ultimo;
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
       return 0;
    }

    public boolean insert(Empleados obj) {
        String sql = "INSERT  INTO empleado (codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
                + "salarioEmpleado,cargoEmpleado,afp,isss,contratacion,estado,idEmpresa) VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }

    //UPDATE `Empleado` SET `codigoEmpleados`='2', `nombreEmpleados`='Tienda1', `dirrecionEmpleados`='San vicente1' WHERE (`idEmpleados`='1')
    public boolean update(Empleados obj) {
        String sql = "UPDATE empleado SET codigoEmpleado = ?, nombre = ?, apellido = ?, telefonoEmpleado = ?,dirrecionEmpleado = ?,"
                + "salarioEmpleado = ?,cargoEmpleado = ?,afp = ?,isss = ?,contratacion = ?,estado = ?,idEmpresa = ?"
                + " WHERE idEmpleado = " + obj.getIdPersona();
        return alterarRegistro(sql, obj);
    }

    public boolean agregarUsuario(Usuario obj) {
        String sql = "UPDATE empleado SET idUsuario = '"+obj.getIdUsuario()+"'  WHERE idEmpleado = " + obj.getEmpleados().getIdPersona();
        return addSql(sql);
    }
     
       public boolean agregarBono(Empleados obj) {
        String sql = "UPDATE empleado SET idBono = ? WHERE codigoEmpleado = ?";
        return addBonoSql(sql,obj);
    }
       public boolean quitarBono(Empleados obj) {
        String sql = "UPDATE empleado SET idBono = NULL WHERE idEmpleado = " + obj.getIdPersona();
        return addSql(sql);
    }


    private ListaDobleCircular select(String sql) {
       ListaDobleCircular lista = new ListaDobleCircular();
        Empleados obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                obj = new Empleados();
                obj.setIdEmpleado(rs.getInt("idEmpleado"));
                obj.setIdPersona(rs.getInt("idEmpleado"));
                obj.setCodigoEmpleado(rs.getString("codigoEmpleado"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefonoEmpleado"));
                obj.setDireccion(rs.getString("dirrecionEmpleado"));
                obj.setSalarioEmpleado(rs.getDouble("salarioEmpleado"));
                obj.setCargoEmpleado(rs.getString("cargoEmpleado"));
                obj.setAfp(rs.getDouble("afp"));
                obj.setIsss(rs.getDouble("isss"));
                obj.setFechaContratacion(rs.getDate("contratacion"));
                obj.setEstado(rs.getInt("estado"));
                Empresa empresa = new Empresa(rs.getInt("idEmpresa"));
                obj.setIdUsuario(rs.getInt("idUsuario"));
                Usuario usuario = new Usuario(rs.getInt(("idUsuario")));
                Bono bono = new Bono(rs.getInt("idBono"));
                obj.setEmpresa(empresa);
                obj.addUsuario(usuario);
                obj.setBono(bono);

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

    private boolean alterarRegistro(String sql, Empleados obj) {
        try {
            //codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
            //         + "salarioEmpleado,cargoEmpleado,afp,isss,contatacion,estado,idEmpresa,usuario_idUsuario
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, obj.getCodigoEmpleado());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getTelefono());
            ps.setString(5, obj.getDireccion());
            ps.setDouble(6, obj.getSalarioEmpleado());
            ps.setString(7, obj.getCargoEmpleado());
            ps.setDouble(8, obj.getAfp());
            ps.setDouble(9, obj.getIsss());

            ps.setDate(10, new java.sql.Date(obj.getFechaContratacion().getTime()));
            ps.setInt(11, obj.getEstado());
            ps.setInt(12, obj.getEmpresa().getIdEmpresa());

            System.out.println(new java.sql.Date(obj.getFechaContratacion().getTime()));

            ps.execute();
            //System.out.println("ujhuuj");
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

    public boolean darBaja(Empleados obj) {
        try {

            String sql = "UPDATE empleado SET estado = '0' WHERE idEmpleado = " + obj.getIdPersona();
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
            } catch (Exception ex) {

            }
            conectar.closeConexion(con);
        }
        return false;
    }

    private boolean addSql(String sql) {
        try {

            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.execute();
            //System.out.println("ujhuuj");
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

    public ArrayList<Empleados> selectConCondicion(String a) {

        String sql = "Select * FROM empleado " + a;
        ArrayList<Empleados> lista = new ArrayList();
        Empleados obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                obj = new Empleados();
                Usuario usuario = new Usuario(rs.getInt(("idUsuario")));
                Empresa empresa = new Empresa(rs.getInt("idEmpresa"));
                Bono bono = new Bono(rs.getInt("idBono"));
                obj.setIdPersona(rs.getInt("idEmpleado"));
                obj.setCodigoEmpleado(rs.getString("codigoEmpleado"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefonoEmpleado"));
                obj.setDireccion(rs.getString("dirrecionEmpleado"));
                obj.setSalarioEmpleado(rs.getDouble("salarioEmpleado"));
                obj.setCargoEmpleado(rs.getString("cargoEmpleado"));
                obj.setAfp(rs.getDouble("afp"));
                obj.setIsss(rs.getDouble("isss"));
                obj.setFechaContratacion(rs.getDate("contratacion"));
                obj.setEstado(rs.getInt("estado"));
                obj.addUsuario(usuario);
                obj.setEmpresa(empresa);
                obj.setBono(bono);
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
    
       private boolean addBonoSql(String sql, Empleados obj) {
        try {
            //codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
            //         + "salarioEmpleado,cargoEmpleado,afp,isss,contatacion,estado,idEmpresa,usuario_idUsuario
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, obj.getBono().getIdBono());
            ps.setString(2, obj.getCodigoEmpleado());
            
           
            ps.execute();
            //System.out.println("ujhuuj");
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

}
