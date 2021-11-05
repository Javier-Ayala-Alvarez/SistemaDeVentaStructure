/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaLogin;

import Controlador.ControlLogin;
import VistaMA.MenuAdministrador;
import VistaMV.Factura;


/**
 *
 * @author kathy
 */
public class Iniciar {

    public static void main(String args[]) {
        Login vista = new Login();
        Factura vistaF = new Factura();
        MenuAdministrador vistaMA = new MenuAdministrador();
        
        
        //ControlLogin control = new ControlLogin(vista, facturacion, vistaF, vistaMA, );
        ControlLogin control = new ControlLogin(vista, vistaF, vistaMA, vista.tfUser.getText());
    }

}
