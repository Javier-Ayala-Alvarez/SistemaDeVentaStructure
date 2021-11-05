
package Modelo;

import Modelo.dao.EmpleadoDao;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Usuario{
    private int idUsuario;
    private String usuario;
    private String contraseña;
    Empleados empleados;

    public Usuario() {
        empleados = new Empleados();
    }

    public Usuario(String usuario, String contraseña) {
        empleados = new Empleados();
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(int estado, String usuario, String contraseña) {
        empleados = new Empleados();
        
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
      
    }
 

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void AddEpleado(String id)
    {
        EmpleadoDao empleadoDao = new EmpleadoDao();
        if (empleadoDao.selectCodigo(id).get(0) != null) {
            this.empleados = empleadoDao.selectCodigo(id).get(0);
        }
    }
        public void AddEpleado1(String id)
    {
        EmpleadoDao empleadoDao = new EmpleadoDao();
//        if (empleadoDao.selectCodigo(id).get(0) != null) {
            this.empleados = empleadoDao.selectAllTo("idUsuario", id).get(0);
        //}
    }

    public Empleados getEmpleados() {
        return empleados;
    }
    
}
