/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaMV;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Francisco Javier
 */
public class Fondo implements Border  {
private BufferedImage cargarImagen;
    
    public Fondo(String r)  {
     try {
         URL ruta= new URL(getClass().getResource(r).toString());
       cargarImagen=ImageIO.read(ruta);
     } catch (Exception ex) {         
     }        
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    g.drawImage(getCargarImagen(),0,0,width, height,null);    
    }
    @Override
    public Insets getBorderInsets(Component c) {
      return new Insets(0,0,0,0);  
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    /**
     * @return the cargarImagen
     */
    public BufferedImage getCargarImagen() {
        return cargarImagen;
    }

    /**
     * @param cargarImagen the cargarImagen to set
     */
    public void setCargarImagen(BufferedImage cargarImagen) {
        this.cargarImagen = cargarImagen;
    }

}