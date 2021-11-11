/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleados;
import Modelo.Encriptacion;
import Modelo.Usuario;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.UsuarioDao;
import VistaLogin.Alerta;
import VistaLogin.Login;
import VistaMA.ClienteMA;
import VistaMA.ConsultarVentas;
import VistaMA.EmpleadoGM;
import VistaMA.vistaEmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.MenuAdministrador;
import VistaMA.ProductoModi;
import VistaMA.RegistrosDeProductos;
import VistaMA.RegistrosDeVentas;
import VistaMV.BuscarProducto;
import VistaMV.Factura;
import VistaMV.Mensaje;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kathy
 */
public class ControlLogin extends MouseAdapter implements ActionListener, KeyListener {

    /*Objetos para el Constructor de esta clase*/
    Login login;
    Factura factura;
    MenuAdministrador menuAdministrador;
    String acceso;
    /*Objetos para el Constructor de ControlMA*/
    EmpleadoGM empleadoGM;
    GastosGM gastosGM;
    ClienteMA clienteMA;
    RegistrosDeProductos registrosDeProductos;
    ProductoModi productoModi;
    RegistrosDeVentas registrosDeVentas;
    ConsultarVentas consultarVentas;
    /*Objetos para el Constructor de ControlFactura*/
    Mensaje mensaje;
    BuscarProducto tablaProducto;

    UsuarioDao daoUsuario = new UsuarioDao();
     EmpleadoDao daoEmpleado = new EmpleadoDao();
    String g;

    public ControlLogin(Login login, Factura factura, MenuAdministrador menuAdministrador, String acceso) {
        this.login = login;
        this.acceso = acceso;
        this.factura = factura;
        this.menuAdministrador = menuAdministrador;
        llamarVistaConsulta("login");
    }

    public ControlLogin() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */
        if (e.getActionCommand().equals("Entrar")) {
            String respuesta = direccion();
            llamarVistaConsulta(respuesta);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
               
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

//    public void limpiar() {
//        login.tfUser.setText("");
//        login.pfPass.setText("");
//    }

    public void llamarVistaConsulta(String vista) {
        /*Esta función realiza la acción al presionar un determinado botón
        con su respectivo ActionCommand proveniente de la función ActionPerformed*/
        try{
        if (vista.equals("login")) {
            login.setControlador(this);
            login.iniciar();
        } else if (vista.equals("admin")) {
            String p = login.tfUser.getText();
                ArrayList<Usuario> listaUsuario = new ArrayList();
                UsuarioDao daoUser = new UsuarioDao();
                listaUsuario = daoUser.selectAllTo("usuario", p);
                String l = String.valueOf(listaUsuario.get(0).getIdUsuario());
                login.dispose();
                factura.setControlador(this);
            ControlFactura controlF = new ControlFactura(factura, mensaje, tablaProducto,l);
        } else if (vista.equals("Admin")) {
            login.dispose();
            menuAdministrador.setControlador(this);
            ControlMA controlMA = new ControlMA(menuAdministrador, login, empleadoGM, gastosGM, registrosDeProductos, productoModi, registrosDeVentas, consultarVentas, clienteMA);
        }
        }catch(Exception ex){
        
        }
    }

    public String direccion() {
        if (login.tfUser.getText().isEmpty() && login.pfPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Ambos campos vacíos!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((login.pfPass.getText().isEmpty()) || login.tfUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Ningún campo debe quedar en blanco!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Usuario> usuario1 = daoUsuario.selectAllTo("usuario", login.tfUser.getText());
            String clave = Encriptacion.getStringMessageDigest(login.pfPass.getText(), Encriptacion.SHA256);
                try{
            usuario1.get(0).AddEpleado1(String.valueOf(usuario1.get(0).getIdUsuario()));

            if (login.tfUser.getText().equals(usuario1.get(0).getUsuario())
                    && clave.equals(usuario1.get(0).getContraseña())
                    && usuario1.get(0).getEmpleados().getCargoEmpleado().equals("Administrador")
                    && usuario1.get(0).getEmpleados().getEstado() == 1) {
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas ingresar a Administracion?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opccion == 0) {
                    login.dispose();
                    g = "Admin";
                }

            } else if (login.tfUser.getText().equals(usuario1.get(0).getUsuario())
                    && clave.equals(usuario1.get(0).getContraseña())
                    && usuario1.get(0).getEmpleados().getCargoEmpleado().equals("Cajero")
                    && usuario1.get(0).getEmpleados().getEstado() == 1) {

                int opccion = JOptionPane.showConfirmDialog(null, "Deseas ingresar a Caja?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opccion == 0) {
                    login.dispose();
                    g = "admin";
                }


            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                
            }

        }catch (Exception ex){
            ArrayList<Empleados> emple = daoEmpleado.selectAllUsu();
             if (login.pfPass.getText().equals("12345") && (login.tfUser.getText().equals("Admin")) && emple.isEmpty()) {
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas ingresar a Administracion?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {
                    login.dispose();
                    g = "Admin";
                }
               
               }else{
                 JOptionPane.showMessageDialog(null, "Datos Incorrectos");
             }
        }
        

    }
    
        return g;
}
}
