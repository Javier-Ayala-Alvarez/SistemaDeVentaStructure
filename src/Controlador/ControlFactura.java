package Controlador;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.GastoEmpresa;
import Modelo.InicioCaja;
import Modelo.dao.ProductoDao;
import Modelo.dao.VentaDao;
import VistaLogin.Login;
import VistaMA.MenuAdministrador;
import VistaMV.Factura;
import VistaMV.Facturacion;
import VistaMV.Mensaje;
import Modelo.Producto;
import Modelo.Registros;
import Modelo.Usuario;
import Modelo.Venta;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.InicioCajaDao;
import Modelo.dao.RegistrosDao;
import Modelo.dao.UsuarioDao;
import VistaLogin.Alerta;
import VistaMA.ClienteMA;
import VistaMV.BuscarCliente;
import VistaMV.CierreCaja;
import VistaMV.InicioCajaVista;
import VistaMV.TablaProducto;
import VistaMV.Tiket;
import desplazable.Desface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlFactura extends MouseAdapter implements ActionListener, KeyListener, ItemListener, FocusListener {
Desface desplace;
    /*Objetos para el Constructor de esta clase*/
    Factura factura;
    Facturacion facturacion;
    Mensaje mensaje;
    TablaProducto tbproducto;
    /*Objetos para el Constructor de ControlLogin*/
    Login login;

    //NUEVO
    private ArrayList<Producto> listaProduc;
    private ArrayList<InicioCaja> listaInicioCaja;
    private ArrayList<Registros> listaRegistro;
    private ArrayList<Empleados> listaEmple;
    DefaultTableModel modelo;
    DefaultTableModel modeloTabla;
    ProductoDao daoProducto = new ProductoDao();
    Producto productoSeleccionado = null;
    Producto producto;
    Registros registroMd;
    RegistrosDao daoRegistros;
    Cliente clienteMd;
    Cliente clienteSeleccionado = null;
    Empleados empleadoMd;
    EmpleadoDao daoEmpleado;//added Lunes
    Tiket tiket;
    Usuario usuario;//added
    UsuarioDao daoUsuario;//added
    InicioCajaVista inicioCajaVista;
    InicioCaja inicioCaja;//added
    InicioCajaDao daoInicioCaja;//added
    CierreCaja cierreCaja;//added
    Venta venta;
    
    ClienteMA clienteMA;
    
    Cliente cliente;
    
    private ArrayList<Venta> listaVenta;
    VentaDao daoVenta;
    private ArrayList<Cliente> listaCliente;
    ClienteDao daoCliente = new ClienteDao();
    Empresa empresa;
    public int cliente1;

    BuscarCliente buscarCliente;
    private double sumatoriaPrecios = 0;
    private int nuevoRegistro = 0;
    private ArrayList<Usuario> listaUsuario;

    private double dineroCaja;
    private String acceso;
    public String padreActiva = "";
    public int estado;
    

    public ControlFactura(Factura factura, Facturacion facturacion, Mensaje mensaje, TablaProducto producto, String acceso) {
        this.factura = factura;
        this.facturacion = facturacion;
        this.mensaje = mensaje;
        this.tbproducto = producto;
        this.acceso = acceso;
        desplace = new Desface();
        factura.tfCantidad.setEditable(false);
        llamarVFactura("FACTURA");
        llamarVFactura("inicioCaja");
        limpiarDatos();
        
        this.factura.tfNFactura.setText(crearCodigo("FACT", "factura1"));
        //HolaMundoooooo by Gerson

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */
        switch (e.getActionCommand()) {
            case "AccesoIC":
                llamarVFactura("AccesoIC");
                break;
            case "agregarProducto":
                llamarVFactura("agregarProducto");
                break;
            case "eliminarFila":
                llamarVFactura("eliminarFila");
                break;
            case "vender":
                estado = 1;
                llamarVFactura("vender");
                
                break;
            case "consumo":
                estado = 2;
                llamarVFactura("vender");
                
                break;
            case "prestamo":
                estado = 3;
                llamarVFactura("vender");
                
                break;
            case "cerrarFacturacion":
                llamarVFactura("cerrarFacturacion");
                break;
            case "newCC":
                llamarVFactura("newCC");
                break;
            case "AccesoCC":
                llamarVFactura("AccesoCC");
                break;

            case "SeleccionarCliente":
                padreActiva = "SeleccionarCliente";
                accionBotones("SeleccionarCliente");
                break;
            case "SeleccionarProducto":
                padreActiva = "SeleccionarProducto";
                accionBotones("SeleccionarProducto");
                break;
            case "NuevoCliente":
                padreActiva = "NuevoCliente";
                llamarVFactura("NuevoCliente");
                break;
            case "Modificar":
                padreActiva = "NuevoCliente";
                llamarVFactura("ModificarCliente");
                break;
            case "Guardar":
                padreActiva = "NuevoCliente";
                llamarVFactura("GuardarCliente");
                break;

            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (padreActiva.equals("SeleccionarCliente")) {
            ArrayList<Cliente> lista = daoCliente.buscar(buscarCliente.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos("SeleccionarCliente");
            } else {
                mostrarBusqueda(lista);

            }

        } else if (padreActiva.equals("SeleccionarProducto")) {
            ArrayList<Producto> lista = daoProducto.buscar(buscarCliente.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos("SeleccionarProducto");
            } else {
                mostrarBusqueda(lista);

            }

        }else if (padreActiva.equals("NuevoCliente")) {
            ArrayList<Cliente> lista = daoCliente.buscar(ClienteMA.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos("NuevoCliente");
            } else {
                mostrarBusqueda(lista);

            }

        } 

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (!factura.tfProducto.getText().equals("No Agregado")) {
            int cantidad = Integer.parseInt(factura.tfCantidad.getText());
            if (cantidad <= productoSeleccionado.getCantidad()) {
                Double precio = Double.parseDouble(factura.tfPrecioUni.getText());
                factura.tfPrecioTotal1.setText(String.format("%.2f",cantidad * precio));
            } else {
                factura.tfPrecioTotal1.setText("");
                factura.tfCantidad.setText("");
                Alerta aler = new Alerta(factura, true, "Sobrepasa la cantidad existente: " + productoSeleccionado.getCantidad(), "/img/error.png");
                aler.show();
            }
        }else if(!factura.tfTotalPagar.getText().isEmpty() ){
            double vuelto = Double.parseDouble(factura.tfEfectivo.getText()) - Double.parseDouble(factura.tfTotalPagar.getText());
           
            factura.tfCambio.setText(String.format("%.2f",vuelto));
        }
    }

    public void llamarVFactura(String vista) {
        if (vista.equals("FACTURA")) {
            
            factura.setControladorF(this);
            
            factura.iniciar();
             
            factura.visibilidad(false);//colocar false cuando se habiliten las Cajas

        } else if(vista.equals("NuevoCliente")){
           
         this.clienteMA = new ClienteMA(factura, true);
         this.clienteMA.setControlador(this);
         clienteMA.btnGuardar.setVisible(true);
            mostrarDatos("NuevoCliente");
         this.clienteMA.iniciar();
        }else if (vista.equals("inicioCaja")) {
            this.inicioCajaVista = new InicioCajaVista(factura, true);
            this.inicioCajaVista.setControlador(this);
            this.inicioCajaVista.codigoCaja.setEditable(false);
            this.inicioCajaVista.codigoCaja.setText(this.crearCodigo("INCJ", "inicioCaja"));
            this.listaUsuario = new ArrayList();
            this.daoUsuario = new UsuarioDao();
            this.listaUsuario = this.daoUsuario.selectAllTo("idUsuario", this.acceso);
            this.inicioCajaVista.tfUsuId.setText(String.valueOf(this.listaUsuario.get(0).getIdUsuario()));
            this.inicioCajaVista.tfUsuId.setEditable(false);
            this.inicioCajaVista.iniciar();
        } else if (vista.equals("AccesoIC")) {
            this.crearRegistroCajaVista();

        } else if (vista.equals("agregarProducto")) {
            this.completarInfoTabla(this.modeloTabla);

        } else if (vista.equals("eliminarFila")) {

            int y = this.factura.miTb1.getSelectedRow();
            int z = this.factura.miTb1.getSelectedColumn();
            String objetoExistente = this.factura.miTb1.getValueAt(y, z).toString();
            if (y != -1 && objetoExistente.length() > 0 && z != -1) {///primera linea que modifique
                this.regenerarProductos(y);
                this.eliminarRegistros(y);
                modeloTabla = new DefaultTableModel();
                String titule[] = {"Codigo", "Producto", "Cantidad", "Precio/U", "Total"};
                this.modeloTabla.setColumnIdentifiers(titule);
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado que eliminar ");
            }

        } else if (vista.equals("vender")) {
            this.daoVenta = new VentaDao();
            this.listaVenta = new ArrayList();
            this.listaVenta = this.daoVenta.selectAll();
            int size = this.listaVenta.size();
            this.venta = new Venta();
            this.venta.setIdFactura(this.listaVenta.get(size - 1).getIdFactura());
            this.venta.setnFactura(this.listaVenta.get(size - 1).getnFactura());
            this.venta.setFechaVenta(this.listaVenta.get(size - 1).getFechaVenta());
            this.venta.setSaldoTotal(Double.parseDouble(factura.tfTotalPagar.getText()));
            this.venta.setEstado(estado);
            this.venta.setInicioCaja(this.listaVenta.get(size - 1).getInicioCaja());
            cerrar();
            if(clienteSeleccionado != null){
                clienteMd.setIdCliente(clienteSeleccionado.getIdCliente());
            }else{
                this.clienteMd = new Cliente();
                     ArrayList<Cliente> cliente = daoCliente.selectAllTo("nombre", "No Registrado");
                     for(Cliente x: cliente){
                         if(x.getNombre().equals("No Registrado")){
                             
                             clienteMd.setIdCliente(x.getIdCliente());
                         }
                         
                     }
            }
            
            this.venta.setCliente(clienteMd);
            this.venta.setEmpleado(this.listaVenta.get(size - 1).getEmpleado());
            this.venta.setEmpresa(this.listaVenta.get(size - 1).getEmpresa());
            if (this.daoVenta.updateVenta(this.venta)) {
                modeloTabla = new DefaultTableModel();
                String titule[] = {"Codigo", "Producto", "Cantidad", "Precio/U", "Total"};
                this.modeloTabla.setColumnIdentifiers(titule);
                this.limpiarDatos();
                this.factura.tfNFactura.setText(crearCodigo("FACT", "factura1"));
                
                cerrar();
               
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }

        } else if (vista.equals("newCC")) {

            this.cierreCaja = new CierreCaja(factura, true);
            this.cierreCaja.setControlador(this);
            this.cierreCaja.tfxDineroCierre.setEditable(false);
            double sumaTotalCC, dineVentaAux;
            dineVentaAux = this.cantiCierre();
            sumaTotalCC = dineVentaAux + dineroCaja;
            this.cierreCaja.tfxDineroCierre.setText(String.valueOf(sumaTotalCC));
             factura.jPanel3.setVisible(false);
             factura.escritorioFactura.setVisible(false);
            this.cierreCaja.iniciar();
            

        } else if (vista.equals("AccesoCC")) {

            Date auxDateC = (Date) cierreCaja.fechaCierre.getDatoFecha();
            this.factura.escritorioFactura.setVisible(false);
            if (this.cierreCaja.tfxDineroCierre.getText().isEmpty() || auxDateC == null) {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            } else {
                this.inicioCaja = new InicioCaja();
                this.inicioCaja.setFechaCierre(auxDateC);
                this.inicioCaja.setDineroCierre(Double.valueOf(this.cierreCaja.tfxDineroCierre.getText()));
                this.listaInicioCaja = this.daoInicioCaja.selectAll();
                int size = this.listaInicioCaja.size();
                int fila = this.listaInicioCaja.get(size - 1).getIdAdminCaja();
                this.inicioCaja.setIdAdminCaja(fila);
                if (this.daoInicioCaja.update(inicioCaja)) {
                    this.cierreCaja.dispose();
                    factura.dispose();
                    Login logg = new Login();
                    Factura vistaFf = new Factura();
                    MenuAdministrador vistaMAa = new MenuAdministrador();

                    ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());
                    
                     
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL REGISTRO");
                }
            }

        }else if (vista.equals("ModificarCliente") && padreActiva.equals("NuevoCliente")) {
            if(!this.clienteMA.tfNombre.getText().isEmpty()
                    && !this.clienteMA.tfApellido.getText().isEmpty()
                    && !this.clienteMA.tfTelefono.getText().isEmpty()
                    && !this.clienteMA.tfDireccion.getText().isEmpty()){
            if (clienteSeleccionado == null) {
                Alerta aler = new Alerta(factura, true, "Seleccione un Registro", "/img/error.png");
                aler.show();
            } else {
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {
                    clienteSeleccionado.getCodigo();
                    clienteSeleccionado.setNombre(ClienteMA.tfNombre.getText());
                    clienteSeleccionado.setApellido(ClienteMA.tfApellido.getText());
                    clienteSeleccionado.setTelefono(ClienteMA.tfTelefono.getText());
                    clienteSeleccionado.setDireccion(ClienteMA.tfDireccion.getText());
                    daoCliente.update(clienteSeleccionado);
                    vaciarVista();
                    Alerta aler = new Alerta(factura, true, "Modificado con exito","/img/Succes.png");
                    aler.show();
                    clienteSeleccionado = null;
                }
            }
            }else{
                    Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                    aler.show();
            }
        }else if (vista.equals("GuardarCliente") && padreActiva.equals("NuevoCliente")) {
            if(!this.clienteMA.tfNombre.getText().isEmpty()
                    && !this.clienteMA.tfApellido.getText().isEmpty()
                    && !this.clienteMA.tfTelefono.getText().isEmpty()
                    && !this.clienteMA.tfDireccion.getText().isEmpty()){
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Guardar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {
                   if (clienteSeleccionado == null) {
                       String codigo = crearCodigo("CLIE","cliente");
                    Cliente cliente = new Cliente(codigo,clienteMA.tfNombre.getText(), clienteMA.tfApellido.getText(),clienteMA.tfTelefono.getText(),clienteMA.tfDireccion.getText());
                   
                        if (daoCliente.insert(cliente)) {
                            vaciarVista();
                            Alerta aler = new Alerta(factura, true, "Guardado con exito", "/img/Succes.png");

                            aler.show();

                        }
                    } else {

                        Alerta aler = new Alerta(factura, true, "Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                }else{
                    Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                    aler.show();
            }
    }
        
        mostrarDatos("NuevoCliente");
    }

    public void completarInfoTabla(DefaultTableModel modelTabla) {//Envía los datos de los TF y CBX a la tabla

        this.modeloTabla = modelTabla;
        if (!this.factura.tfCantidad.getText().isEmpty()
                && !this.factura.tfPrecioUni.getText().isEmpty()
                && !this.factura.tfPrecioTotal1.getText().isEmpty()
                && !this.factura.tfNombre.getText().isEmpty()
                && !this.factura.tfDireccion.getText().isEmpty()) {
            this.listaProduc = new ArrayList();
            String p = factura.tfProducto.getText();
            this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", p);
            //Datos enviados a la tabla
            Object fd[] = {this.listaProduc.get(0).getCodigoProducto(),
                this.listaProduc.get(0).getNombreProducto(),
                this.factura.tfCantidad.getText(),
                String.valueOf(this.listaProduc.get(0).getPrecioVenta()),
                this.factura.tfPrecioTotal1.getText()
            };
            this.sumatoriaPrecios += Double.parseDouble(this.factura.tfPrecioTotal1.getText());
            this.factura.tfTotalPagar.setText(String.format("%.2f",this.sumatoriaPrecios));
            this.modeloTabla.addRow(fd);
            this.factura.miTb1.setModel(modeloTabla);
            cerrar();
            this.crearRegistros();//crea los registros de los productos insertados en la tabla con su venta
            this.eliminarProductosBD();//elimina los productos (cantidad) de la BD
            this.limpiarCb();
            

        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos");
        }
    }
    public void vaciarVista(){
        clienteMA.tfNombre.setText("");
        clienteMA.tfApellido.setText("");
        clienteMA.tfTelefono.setText("");
        clienteMA.tfDireccion.setText("");
    }

    public void limpiarCb1() {
        this.factura.tfPrecioUni.setText("");
        this.factura.tfPrecioTotal1.setText("");
        this.factura.tfCantidad.setText("");
        this.factura.tfProducto.setText("No Agregado");
        this.factura.tfNombre.setText("No Registrado");
        this.factura.tfDireccion.setText("No Registrado");

    }
    public void limpiarCb() {
        this.factura.tfPrecioUni.setText("");
        this.factura.tfPrecioTotal1.setText("");
        this.factura.tfCantidad.setText("");
        this.factura.tfProducto.setText("No Agregado");
//        this.factura.tfNombre.setText("No Registrado");
//        this.factura.tfDireccion.setText("No Registrado");

    }

    public void limpiarDatos() {
        this.factura.tfNFactura.setText("");
        this.factura.tfNombre.setText("No Registrado");
        this.factura.tfDireccion.setText("No Registrado");
        this.factura.tfCantidad.setText("");
        this.factura.tfPrecioUni.setText("");
        this.factura.tfPrecioTotal1.setText("");
        this.factura.tfTotalPagar.setText("");
        this.sumatoriaPrecios = 0;
        this.nuevoRegistro = 0;
        modeloTabla = new DefaultTableModel();
        String titule[] = {"Codigo", "Producto", "Cantidad", "Precio/U", "Total"};
        this.modeloTabla.setColumnIdentifiers(titule);
        factura.miTb1.setModel(modeloTabla);
    }

    public void eliminarProductosBD() {//Disminuye la cantidad de productos solicitados en la Facturacion
        /*Restando cantidad de Productos ingresada*/
        this.producto = new Producto();
        this.daoProducto = new ProductoDao();
        this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
        this.producto.setCodigoProducto(this.listaProduc.get(0).getCodigoProducto());
        this.producto.setNombreProducto(this.listaProduc.get(0).getNombreProducto());
        this.producto.setPrecioCompra(this.listaProduc.get(0).getPrecioCompra());
        this.producto.setCantidad(this.listaProduc.get(0).getCantidad() - Integer.parseInt(this.factura.tfCantidad.getText()));
        this.producto.setFechaVencimiento(this.listaProduc.get(0).getFechaVencimiento());
        this.producto.setMax(this.listaProduc.get(0).getMax());
        this.producto.setMin(this.listaProduc.get(0).getMin());
        this.producto.setEstado(this.listaProduc.get(0).getEstado());
        this.producto.setGananciaUni(this.listaProduc.get(0).getGananciaUni());
        this.producto.setIva(this.listaProduc.get(0).getIva());
        this.producto.setPrecioVenta(this.listaProduc.get(0).getPrecioVenta());
        this.producto.setEmpresa(this.listaProduc.get(0).getEmpresa());
        if (this.daoProducto.updateCantidad(this.producto)) {
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ha logrado disminuir");
        }
        /*Fin de Restando Cantidad*/
    }

    public void crearRegistros() {
        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        try{
            this.listaVenta = this.daoVenta.selectAll();
        }catch(Exception e){
        }
        
        int size = this.listaVenta.size();
        /*Agregando Datos de Producto al Registro, pero antes se debe crear la venta para otorgar el id correspondiente*/
            this.listaProduc = new ArrayList();
            this.daoProducto = new ProductoDao();
            this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.factura.tfProducto.getText());
            this.registroMd = new Registros();
            this.daoRegistros = new RegistrosDao();
            this.registroMd.setCantidadProducto(Integer.parseInt(this.factura.tfCantidad.getText()));
            this.registroMd.setPrecioTotalProducto(Double.parseDouble(this.factura.tfTotalPagar.getText()));
            this.venta = new Venta();

            /*------------------------Creando venta para obtener su id y otorgar de una vez al registro---------------------*/
            this.venta.setnFactura(this.factura.tfNFactura.getText());//insertando nFactura y ajustarlo al tamaño (longitud)
            this.venta.setFechaVenta(this.factura.rSDateFecha.getDatoFecha());//insertando fecha
            this.venta.setSaldoTotal(Double.parseDouble(this.factura.tfTotalPagar.getText()));//insertando precioVenta
            this.venta.setEstado(0);//insertando estado

            this.inicioCaja = new InicioCaja();
            this.listaInicioCaja = new ArrayList();
            this.daoInicioCaja = new InicioCajaDao();
            this.listaInicioCaja = this.daoInicioCaja.selectAll();
            int tamanioInic = this.listaInicioCaja.size();
            this.inicioCaja.setIdAdminCaja(this.listaInicioCaja.get(tamanioInic - 1).getIdAdminCaja());
            this.venta.setInicioCaja(this.inicioCaja);//agregando id del ultimo cajero
            this.clienteMd = new Cliente();
            this.daoCliente = new ClienteDao();

            try {
                clienteMd.setIdCliente(clienteSeleccionado.getIdCliente());

            } catch (Exception e) {

                 ArrayList<Cliente> cliente = daoCliente.selectAllTo("nombre", "No Registrado");
                if(cliente.isEmpty()){
                this.clienteMd = new Cliente();
                this.listaCliente = new ArrayList();
                this.daoCliente = new ClienteDao();
                this.clienteMd.setCodigo(this.crearCodigo("CLIE", "cliente"));
                this.clienteMd.setNombre(this.factura.tfNombre.getText());
                this.clienteMd.setApellido("No registrado");
                this.clienteMd.setTelefono("00000000");
                this.clienteMd.setDireccion(this.factura.tfDireccion.getText());
                int idCli;
                if (this.daoCliente.insert(clienteMd)) {//insertando cliente para obtener su id
                     
                    this.listaCliente = new ArrayList();
                    this.daoCliente = new ClienteDao();
                    this.listaCliente = this.daoCliente.selectAll();
                    int tamanioCli = this.listaCliente.size();
                    idCli = this.listaCliente.get(tamanioCli - 1).getIdCliente();
                    this.clienteMd.setIdCliente(idCli);
                }
                }else{
                     for(Cliente x: cliente){
                         if(x.getNombre().equals("No Registrado")){
                             
                             clienteMd.setIdCliente(x.getIdCliente());
                         }
                         
                     }
                     
                }
                
            }
            String verifFacturaexistente;
             try{
             verifFacturaexistente = String.valueOf(this.listaVenta.get(size - 1).getnFactura());
        }catch(Exception e){
            verifFacturaexistente = "Error";
        }
       
        
        if (verifFacturaexistente.equals(this.factura.tfNFactura.getText())) {
                this.venta.setCliente(clienteMd);//agregando el idCliente clienteSeleccionado.getIdCliente()

            this.empleadoMd = new Empleados();
            this.empleadoMd.setIdEmpleado(this.listaInicioCaja.get(tamanioInic - 1).getUsuario().getIdUsuario());
            this.venta.setEmpleado(empleadoMd);//agregando el idEmpleado

            this.empresa = new Empresa();
            this.empresa.setIdEmpresa(1);
            this.venta.setEmpresa(empresa);//agregando el idEmpresa

            this.daoVenta = new VentaDao();
            if (this.daoVenta.updateVenta(this.venta)) {
                
                cerrar();
                //obteniendo el idVenta ultimo para asignar a la tabla registro
                this.daoVenta = new VentaDao();
                this.listaVenta = new ArrayList();
                this.listaVenta = this.daoVenta.selectAll();
                int tamanioVenta = this.listaVenta.size();

                this.listaRegistro = new ArrayList();
                this.daoRegistros = new RegistrosDao();
                this.nuevoRegistro = this.daoRegistros.selectAll().size();
                this.listaRegistro = this.daoRegistros.selectAll();
                int idVenUltimo = this.listaVenta.get(tamanioVenta - 1).getIdFactura();
                this.venta.setIdFactura(idVenUltimo);//Asignando el id de la Venta a la que pertenece
                this.producto = new Producto();
                this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
                this.registroMd.setVenta(venta);
                this.registroMd.setProducto(producto);

                if (this.daoRegistros.insert(this.registroMd) == true) {
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Registro No insertado");
                }
                /*Fin de Agregar Datos al Registro*/
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar a la venta\n Por favor verificar la conexion con la BD");
            }
            /*------------------------------------------Fin de Actualizando------------------------------------------------------*/

        } else {

            
                this.venta.setCliente(clienteMd);//agregando el idCliente clienteSeleccionado.getIdCliente()

                this.empleadoMd = new Empleados();
                this.empleadoMd.setIdEmpleado(this.listaInicioCaja.get(tamanioInic - 1).getUsuario().getIdUsuario());
                this.venta.setEmpleado(empleadoMd);//agregando el idEmpleado

                this.empresa = new Empresa();
                this.empresa.setIdEmpresa(1);
                this.venta.setEmpresa(empresa);//agregando el idEmpresa

                this.daoVenta = new VentaDao();
                if (this.daoVenta.insertarVenta(this.venta)) {
                    cerrar();
                    //obteniendo el idVenta ultimo para asignar al registro
                    this.daoVenta = new VentaDao();
                    this.listaVenta = new ArrayList();
                    this.listaVenta = this.daoVenta.selectAll();
                    int tamanioVenta = this.listaVenta.size();

                    this.listaRegistro = new ArrayList();
                    this.daoRegistros = new RegistrosDao();
                    this.nuevoRegistro = this.daoRegistros.selectAll().size();
                    this.listaRegistro = this.daoRegistros.selectAll();
                    int idVenUltimo = this.listaVenta.get(tamanioVenta - 1).getIdFactura();
                    /*------------------------------------ Fin De Creando venta---------------------------------*/
                    this.venta.setIdFactura(idVenUltimo);//Asignando el id de la Venta a la que pertenece
                    this.producto = new Producto();
                    this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
                    this.registroMd.setVenta(venta);
                    this.registroMd.setProducto(producto);

                    if (this.daoRegistros.insert(this.registroMd) == true) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro No insertado");
                    }
                    /*Fin de Agregar Datos al Registro*/
                } else {
                    JOptionPane.showMessageDialog(null, "Venta no insertada");
                }

            }

        
    }
    

    public void regenerarProductos(int y) {
        /*Sumando cantidad de Productos eliminada*/
        String cantidad = this.factura.miTb1.getValueAt(y, 2).toString();
        String nomProd = this.factura.miTb1.getValueAt(y, 1).toString();
        this.listaProduc = new ArrayList();
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", nomProd);
        JOptionPane.showMessageDialog(null, cantidad + nomProd);
        this.producto = new Producto();
        this.daoProducto = new ProductoDao();
        this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
        this.producto.setCodigoProducto(this.listaProduc.get(0).getCodigoProducto());
        this.producto.setNombreProducto(this.listaProduc.get(0).getNombreProducto());
        this.producto.setPrecioCompra(this.listaProduc.get(0).getPrecioCompra());
        this.producto.setCantidad(this.listaProduc.get(0).getCantidad() + Integer.parseInt(cantidad));
        this.producto.setFechaVencimiento(this.listaProduc.get(0).getFechaVencimiento());
        this.producto.setMax(this.listaProduc.get(0).getMax());
        this.producto.setMin(this.listaProduc.get(0).getMin());
        this.producto.setEstado(this.listaProduc.get(0).getEstado());
        this.producto.setGananciaUni(this.listaProduc.get(0).getGananciaUni());
        this.producto.setIva(this.listaProduc.get(0).getIva());
        this.producto.setPrecioVenta(this.listaProduc.get(0).getPrecioVenta());
        this.producto.setEmpresa(this.listaProduc.get(0).getEmpresa());
        if (this.daoProducto.updateCantidad(this.producto)) {
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad no devuelta");
        }
        /*Fin de Sumando Cantidad*/
    }

    public void eliminarRegistros(int y) {
        String nombre = this.factura.miTb1.getValueAt(y, 1).toString();
        String cant = this.factura.miTb1.getValueAt(y, 2).toString();
        String precioTot = this.factura.miTb1.getValueAt(y, 4).toString();
        double precioTotal = Double.parseDouble(precioTot);
        this.daoRegistros = new RegistrosDao();
        this.listaProduc = new ArrayList();
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", nombre);

        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        this.listaVenta = this.daoVenta.selectAll();
        int tamanioVenta = this.listaVenta.size();
        int idVen = this.listaVenta.get(tamanioVenta - 1).getIdFactura();

        if (this.daoRegistros.delete(Integer.parseInt(cant), Double.parseDouble(String.format("%.2f", precioTotal)), idVen)) {
            this.sumatoriaPrecios -= Double.parseDouble(String.format("%.2f", precioTotal));//probando la resta de la sumatoria
            this.factura.tfTotalPagar.setText(String.valueOf(this.sumatoriaPrecios));

            for (int i = 0; i < 5; i++) {
                this.factura.miTb1.setValueAt("", y, i);
                
              
            }

        } else {
            JOptionPane.showMessageDialog(null, "Problemas al borrar Registro");
        }
    }

    public String crearCodigo(String a, String activa) {
        String correlativo = a;
        int corre = 0;

        if (activa.equals("factura1")) {
            this.daoVenta = new VentaDao();
            ArrayList<Venta> venta = daoVenta.selectAll();
            for (Venta x : venta) {
                corre = x.getIdFactura();
            }
            corre = corre + 1;
        } else if (activa.equals("cliente")) {
            this.daoCliente = new ClienteDao();
             ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Cliente x : cliente) {
                corre = x.getIdCliente();
            }
            corre = corre + 1;
        } else if (activa.equals("inicioCaja")) {
            this.daoInicioCaja = new InicioCajaDao();
            this.listaInicioCaja = new ArrayList();
            this.listaInicioCaja = this.daoInicioCaja.selectAll();
            corre = this.listaInicioCaja.size() + 1;
        }

        for (int i = 0; i < 6; i++) {
            if ((correlativo.length() + String.valueOf(corre).length()) < 10) {
                correlativo = correlativo + "0";
            }
        }
        correlativo = correlativo + String.valueOf(corre);

        return correlativo;
    }
 
    public double cantiCierre() {
        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        this.listaVenta = this.daoVenta.selectAll();

        double tVentaK = 0;
        this.listaInicioCaja = this.daoInicioCaja.selectAll();
        int size = this.listaInicioCaja.size();//Arreglo que contiene el id de cajainicio
        String fecha = String.valueOf(this.listaInicioCaja.get(size - 1).getFechaInicio());

        for (int i = 0; i <= (listaVenta.size() - 1); i++) {
            String fechaBD = String.valueOf(listaVenta.get(i).getFechaVenta());
            int estado = 0;
            estado = listaVenta.get(i).getEstado();
            if (fecha.equals(fechaBD) && estado == 1) {

                tVentaK += listaVenta.get(i).getSaldoTotal();
//                String imi[] = {String.valueOf(k.getSaldoTotal())}; 
            }
        }
        listaVenta = null;
        return tVentaK;
    }

    private void crearRegistroCajaVista() {
        Date auxDate = (Date) inicioCajaVista.cldFechaInicio.getDatoFecha();
        if (this.inicioCajaVista.tfDineroInicio.getText().isEmpty() || auxDate == null) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            this.usuario = new Usuario();
            this.daoInicioCaja = new InicioCajaDao();
            this.daoUsuario = new UsuarioDao();
            this.usuario.setIdUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()));
            this.inicioCaja = new InicioCaja();
            this.inicioCaja.setCodigoCaja(this.inicioCajaVista.codigoCaja.getText());
            this.inicioCaja.setUsuario(this.usuario);
            this.inicioCaja.setDineroInicio(Double.valueOf(this.inicioCajaVista.tfDineroInicio.getText()));
            dineroCaja = Double.valueOf(this.inicioCajaVista.tfDineroInicio.getText());///resetear el valor al vendeeer
            this.inicioCaja.setFechaInicio(auxDate);
            this.inicioCaja.setFechaCierre(auxDate);
            this.inicioCaja.setDineroCierre(0);
            if (this.daoUsuario.validarUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()))) {
                this.factura.visibilidad(true);
                this.listaUsuario = new ArrayList();
                this.listaUsuario = this.daoUsuario.selectId(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()));
                this.factura.lbNombreUsuario.setText(this.listaUsuario.get(0).getUsuario());
                this.inicioCajaVista.dispose();
                

                if (this.daoInicioCaja.insert(inicioCaja)) {
                    Alerta aler = new Alerta(factura, true, "Que tenga un buen dia", "/img/user.png");
                    aler.show();

                    this.factura.escritorioFactura.setVisible(true);
                    factura.jPanel3.setVisible(true);
                   desplace.desplazarIzquierda(factura.jPanel3, factura.jPanel3.getX(), -110, 10, 10);
                    //

                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL REGISTRO");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no valido");
            }
        }
    }

    public void accionBotones(String vista) {
        if (vista.equals("SeleccionarCliente")) {
            this.buscarCliente = new BuscarCliente(factura, true);
            this.buscarCliente.setControlador(this);
            
            mostrarDatos("SeleccionarCliente");
            this.buscarCliente.iniciar();
        } else if (vista.equals("SeleccionarProducto")) {
            this.buscarCliente = new BuscarCliente(factura, true);
            this.buscarCliente.setControlador(this);
            mostrarDatos("SeleccionarProducto");
            this.buscarCliente.iniciar();
        }

    }

    public void mostrarBusqueda(ArrayList lista) {

        DefaultTableModel modelo = new DefaultTableModel();
        if (padreActiva.equals("SeleccionarCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            this.buscarCliente.jtDatos.setModel(modelo);
            ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Object a : lista) {
                Cliente x = (Cliente) a;
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);
            }

            this.buscarCliente.jtDatos.setModel(modelo);

        } else if (padreActiva.equals("SeleccionarProducto")) {
            String titulos[] = {"Codigo", "Nombre", "Precio Venta", "Existencia"};
            modelo.setColumnIdentifiers(titulos);
            this.buscarCliente.jtDatos.setModel(modelo);
            ArrayList<Producto> producto = daoProducto.selectAll();
            for (Object a : lista) {
                Producto x = (Producto) a;
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getPrecioVenta(), x.getCantidad()};
                modelo.addRow(datos);
            }

            this.buscarCliente.jtDatos.setModel(modelo);

        }else if (padreActiva.equals("NuevoCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            this.clienteMA.jtDatos.setModel(modelo);
            ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Object a : lista) {
                Cliente x = (Cliente) a;
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);
            }

            this.clienteMA.jtDatos.setModel(modelo);

        }

    }

    public void mostrarDatos(String vista) {
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1 = new DefaultTableModel();
        if (vista.equals("SeleccionarCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo1.setColumnIdentifiers(titulos);
            ArrayList<Cliente> cliente2 = daoCliente.selectAll();
            for (Cliente x : cliente2) {
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo1.addRow(datos);

            }
            this.buscarCliente.jtDatos.setModel(modelo1);
        } else if (vista.equals("SeleccionarProducto")) {
            String titulos[] = {"Codigo", "Nombre", "Precio Venta", "Existencia"};
            modelo1.setColumnIdentifiers(titulos);
            ArrayList<Producto> producto = daoProducto.selectAll();
            for (Producto x : producto) {
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getPrecioVenta(), x.getCantidad()};
                modelo1.addRow(datos);

            }
            this.buscarCliente.jtDatos.setModel(modelo1);
        }else if (vista.equals("NuevoCliente")) {

            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo1.setColumnIdentifiers(titulos);
            ArrayList<Cliente> cliente2 = daoCliente.selectAll();
            for (Cliente x : cliente2) {
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo1.addRow(datos);

            }
            this.clienteMA.jtDatos.setModel(modelo1);

        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusGained(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseClicked(MouseEvent me) {
        if (padreActiva.equals("SeleccionarCliente")) {
            int fila = buscarCliente.jtDatos.getSelectedRow();
            String id = buscarCliente.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Cliente> lista = daoCliente.selectAllTo("codigoCliente", id);
            clienteSeleccionado = lista.get(0);
            cliente1 = clienteSeleccionado.getIdCliente();
            factura.tfNombre.setText(clienteSeleccionado.getNombre());
            factura.tfDireccion.setText(clienteSeleccionado.getDireccion());
            buscarCliente.setVisible(false);
        } else if (padreActiva.equals("SeleccionarProducto")) {
            int fila = buscarCliente.jtDatos.getSelectedRow();
            String id = buscarCliente.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Producto> lista = daoProducto.selectAllTo("codigoProducto", id);
            productoSeleccionado = lista.get(0);

            factura.tfProducto.setText(productoSeleccionado.getNombreProducto());
            factura.tfPrecioUni.setText(String.valueOf(productoSeleccionado.getPrecioVenta()));
            buscarCliente.setVisible(false);
            factura.tfCantidad.setEditable(true);
            factura.tfPrecioTotal1.setText("");
            factura.tfCantidad.setText("");
        }else if (padreActiva.equals("NuevoCliente")) {
            int fila = ClienteMA.jtDatos.getSelectedRow();
            String id = ClienteMA.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Cliente> lista = daoCliente.selectAllTo("codigoCliente", id);
            clienteSeleccionado = lista.get(0);
            ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Cliente x : cliente) {
                if (x.getCodigo().equals(id)) {
                    ClienteMA.tfNombre.setText(x.getNombre());
                    ClienteMA.tfApellido.setText(x.getApellido());
                    ClienteMA.tfTelefono.setText(x.getTelefono());
                    ClienteMA.tfDireccion.setText(x.getDireccion());
                }
            }
        }
    }
    public void cerrar(){
        
        
        try{
            ArrayList<Venta> venta = daoVenta.selectAllTo("nFactura", factura.tfNFactura.getText());
            if(!venta.isEmpty()){
                factura.btnCerrarCaja.setEnabled(false);
            }else{
                factura.btnCerrarCaja.setEnabled(true);
            }
        }catch(Exception e) {
           
        }
    }
}
