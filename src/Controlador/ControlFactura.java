package Controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static Controlador.ControlMA.crearCodigo;
import Estructura.ListaDobleCircular;
import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.GastoEmpresa;
import Modelo.dao.ProductoDao;
import Modelo.dao.VentaDao;
import VistaLogin.Login;
import VistaMA.MenuAdministrador;
import VistaMV.Factura;
import VistaMV.Mensaje;
import Modelo.Producto;
import Modelo.Registros;
import Modelo.Usuario;
import Modelo.Venta;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import Modelo.dao.RegistrosDao;
import Modelo.dao.UsuarioDao;
import VistaLogin.Alerta;
import VistaMA.ClienteMA;
import VistaMV.BuscarCliente;
import VistaMV.BuscarProducto;
import VistaMV.Calculadora;

import VistaMV.Tiket;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlFactura extends MouseAdapter implements ActionListener, KeyListener, ItemListener, FocusListener {

    private Desface desplace;
    /*Objetos para el Constructor de esta clase*/
    private Factura factura;
    private Mensaje mensaje;
    private BuscarProducto tbproducto;
    /*Objetos para el Constructor de ControlLogin*/
    private Login login;

    //NUEVO
    private ArrayList<Producto> listaProduc;
    private DefaultTableModel modelo;
    private DefaultTableModel modeloTabla;
    private ProductoDao daoProducto = new ProductoDao();
    private Producto productoSeleccionado = null;
    private Registros RegistroSeleccionada = null;
    private Producto producto;
    private Registros registroMd;
    private RegistrosDao daoRegistros = new RegistrosDao();
    ;
    private Cliente clienteMd;
    private Cliente clienteSeleccionado = null;
    private Empleados empleadoMd;
    private ArrayList<Empleados> empleadoSeleccionado;
    private EmpleadoDao daoEmpleado = new EmpleadoDao();//added Lunes
    private Tiket tiket;
    private Usuario usuario;//added
    private UsuarioDao daoUsuario;//added
    private Venta venta;
    private Venta ventaSeleccionada = null;
    private Venta max = null;
    private ArrayList<Venta> VentaD;
    private ClienteMA clienteMA;
    private Calculadora calculadora;
    private Cliente cliente;
    private VentaDao daoVenta = new VentaDao();
    private ClienteDao daoCliente = new ClienteDao();
    private ArrayList<Empresa> empresa;
    private EmpresaDao daoEmpresa = new EmpresaDao();

    public int cliente1;
    private String codigoUsuario;
    private BuscarCliente buscarCliente;

    private String acceso;
    public String padreActiva = "";
    public int estado, id = 0;
    private ListaDobleCircular listita, VentaLista, registros, VentaLista1;

    public ControlFactura(Factura factura, Mensaje mensaje, BuscarProducto producto, String l) {
        this.factura = factura;
        this.mensaje = mensaje;
        this.codigoUsuario = l;
        this.tbproducto = producto;
        this.acceso = acceso;
        desplace = new Desface();
        factura.tfCantidad.setEditable(false);

        llamarVFactura("inicio");

        this.listita = new ListaDobleCircular();
        this.VentaLista = new ListaDobleCircular();
        this.registros = new ListaDobleCircular();
        this.VentaLista1 = new ListaDobleCircular();
        this.clienteSeleccionado = new Cliente();
        this.productoSeleccionado = new Producto();
        this.ventaSeleccionada = new Venta();
        this.max = new Venta();
        this.RegistroSeleccionada = new Registros();
        this.empleadoSeleccionado = new ArrayList<>();
        this.registroMd = new Registros();
        this.empresa = new ArrayList<>();
        this.venta = new Venta();
        this.VentaD = new ArrayList<>();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "NuevoCliente":
                llamarVFactura("NuevoCliente");
                break;
            case "SeleccionarCliente":
                llamarVFactura("SeleccionarCliente");
                break;
            case "cerrar":
                llamarVFactura("cerrar");
                break;
            case "SeleccionarProducto":
                llamarVFactura("SeleccionarProducto");
                break;
            case "Guardar":
                accion("guardar");
                break;
            case "Modificar":
                accion("modificar");
                break;
            case "eliminar":
                accion("eliminar");
                break;
            case "agregarProducto":
                accion("agregarProducto");
                break;
            case "facturar":
                accion("facturar");
                break;
            case "QuitarDeCarrito":
                accion("QuitarDeCarrito");
                break;
            case "calculadora":
                llamarVFactura("calculadora");
                break;
            default:

                break;
        }
    }

    public void accion(String accion) {
        if (accion.equals("agregarProducto")) {
            if (!this.factura.tfCantidad.getText().isEmpty()) {
                Registros obj1 = new Registros(id, Integer.parseInt(factura.tfCantidad.getText()),
                        productoSeleccionado.getPrecioVenta() * Double.parseDouble(factura.tfCantidad.getText()),
                        productoSeleccionado, ventaSeleccionada);
                if (VentaLista.buscar(obj1) == null) {
                    VentaLista.insertar(obj1);
                    buelto();
                } else {
                    Alerta aler = new Alerta(factura, true, "No puede ingresar un mismo producto", "/img/Succes.png");
                    aler.show();
                }
                id++;
                padreActiva = "agregarProducto";
                mostrarDatos();
            } else {
                Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                aler.show();
            }
        } else if (accion.equals("QuitarDeCarrito")) {
            padreActiva = "agregarProducto";
            VentaLista.eliminar(RegistroSeleccionada);
            mostrarDatos();
            buelto();
        } else if (accion.equals("facturar")) {
            if (!this.factura.tfProducto.getText().equals("No Agregado")
                    && !this.factura.tfNombre.getText().equals("No Registrado")
                    && !this.factura.tfPrecioTotal1.getText().isEmpty()) {
                ventaSeleccionada.setnFactura(factura.tfNFactura.getText());
                ventaSeleccionada.setEstado(1);
                ventaSeleccionada.setFechaVenta(factura.rSDateFecha.getDatoFecha());
                ventaSeleccionada.setSaldoTotal(Double.parseDouble(factura.tfTotalPagar.getText()));
                ventaSeleccionada.setCliente(clienteSeleccionado);
                empleadoSeleccionado = daoEmpleado.selectAllTo("idUsuario", codigoUsuario).toArrayAsc();
                ventaSeleccionada.setEmpleado(empleadoSeleccionado.get(0));
                empresa = daoEmpresa.selectAll();
                ventaSeleccionada.setEmpresa(empresa.get(0));
                if (daoVenta.insertarVenta(ventaSeleccionada)) {
                    max = daoVenta.getSelectMax();
                    ventaSeleccionada.setIdFactura(max.getMax());
                    for (Object j : VentaLista.toArrayAsc()) {
                        Registros x = (Registros) j;

                        RegistroSeleccionada.setVenta(ventaSeleccionada);
                        RegistroSeleccionada.setCantidadProducto(x.getCantidadProducto());
                        RegistroSeleccionada.setPrecioTotalProducto(x.getPrecioTotalProducto());
                        RegistroSeleccionada.setProducto(x.getProducto());

                        daoRegistros.insert(RegistroSeleccionada);
                        productoSeleccionado = RegistroSeleccionada.getProducto();
                        productoSeleccionado.setCantidad(x.getProducto().getCantidad() - x.getCantidadProducto());
                        daoProducto.updateProducto(productoSeleccionado);
                        VentaLista.eliminar(RegistroSeleccionada);
                    }

                    String iniciales = "NF-";
                    VentaLista1 = daoVenta.selectAll();
                    int id = 0;
                    if (!VentaLista1.isEmpty()) {
                        id = VentaLista1.toArrayDes().size() + 1;
                    }
                    this.factura.tfNFactura.setText(crearCodigo(iniciales, id));
                    int opccion = JOptionPane.showConfirmDialog(null, "Imprimir factura?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opccion == 0) {
                        reporteFactura(ventaSeleccionada.getnFactura());
                        abrirReporte("Facturas/" + ventaSeleccionada.getnFactura() + ".pdf");

                    }
                    limpiarCb1();
                    this.id = 0;
                    mostrarDatos();
                    buelto();
                    Alerta aler = new Alerta(factura, true, "Factura con exito", "/img/Succes.png");
                    aler.show();
                } else {
                    Alerta aler = new Alerta(factura, true, "Se produjo un error", "/img/Succes.png");
                    aler.show();
                }
            } else {
                Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                aler.show();
            }
        } else if (accion.equals("modificar") && padreActiva.equals("NuevoCliente")) {
            if (!this.clienteMA.tfNombre.getText().isEmpty()
                    && !this.clienteMA.tfApellido.getText().isEmpty()
                    && !this.clienteMA.tfTelefono.getText().isEmpty()
                    && !this.clienteMA.tfDireccion.getText().isEmpty()) {

                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {

                    clienteSeleccionado.setNombre(ClienteMA.tfNombre.getText());
                    clienteSeleccionado.setApellido(ClienteMA.tfApellido.getText());
                    clienteSeleccionado.setTelefono(ClienteMA.tfTelefono.getText());
                    clienteSeleccionado.setDireccion(ClienteMA.tfDireccion.getText());
                    daoCliente.update(clienteSeleccionado);
                    vaciarVista();
                    mostrarDatos();
                    Alerta aler = new Alerta(factura, true, "Modificado con exito", "/img/Succes.png");
                    aler.show();

                }

            } else {
                Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                aler.show();
            }
        } else if (accion.equals("guardar") && padreActiva.equals("NuevoCliente")) {
            if (!this.clienteMA.tfNombre.getText().isEmpty()
                    && !this.clienteMA.tfApellido.getText().isEmpty()
                    && !this.clienteMA.tfTelefono.getText().isEmpty()
                    && !this.clienteMA.tfDireccion.getText().isEmpty()) {
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Guardar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {

                    String iniciales = "CC-";
                    int id = 0;
                    if (!listita.isEmpty()) {
                        id = listita.toArrayDes().size() + 1;
                    }
                    Cliente cliente = new Cliente(crearCodigo(iniciales, id), clienteMA.tfNombre.getText(), clienteMA.tfApellido.getText(), clienteMA.tfTelefono.getText(), clienteMA.tfDireccion.getText());
                    if (daoCliente.insert(cliente)) {
                        vaciarVista();

                        mostrarDatos();
                        Alerta aler = new Alerta(factura, true, "Guardado con exito", "/img/Succes.png");
                        aler.show();
                    }

                }
            } else {
                Alerta aler = new Alerta(factura, true, "Campos incompletos o vacios", "/img/Succes.png");
                aler.show();
            }
        }

    }

    public static String crearCodigo(String inicio, int corre) {
        if ((inicio.length() + String.valueOf(corre).length()) < 7) {
            inicio = inicio + "0";
            return crearCodigo(inicio, corre);
        }
        inicio = inicio + String.valueOf(corre);
        return inicio;
    }

    public void llamarVFactura(String accion) {
        if (accion.equals("inicio")) {
            factura.setControladorF(this);
            desplace = new Desface();
            desplace.desplazarIzquierda(factura.jPanel3, factura.jPanel3.getX(), -110, 10, 10);
            String iniciales = "NF-";
            VentaLista1 = daoVenta.selectAll();
            int id = 0;
            if (!VentaLista1.isEmpty()) {
                id = VentaLista1.toArrayDes().size() + 1;
            }
            this.factura.tfNFactura.setText(crearCodigo(iniciales, id));
            factura.iniciar();
        } else if (accion.equals("calculadora")) {
            calculadora = new Calculadora(factura, true);
            calculadora.setControlador(this);
            calculadora.iniciar();
        } else if (accion.equals("NuevoCliente")) {
            clienteMA = new ClienteMA(factura, true);
            clienteMA.setControlador(this);
            padreActiva = "NuevoCliente";
            mostrarDatos();
            clienteMA.iniciar();
        } else if (accion.equals("SeleccionarCliente")) {
            buscarCliente = new BuscarCliente(factura, true);
            buscarCliente.setControlador(this);
            padreActiva = "SeleccionarCliente";
            mostrarDatos();
            buscarCliente.iniciar();
        } else if (accion.equals("cerrar")) {
            if (!this.factura.tfPrecioTotal1.getText().isEmpty()) {
                int opccion = JOptionPane.showConfirmDialog(null, "Su factura no se registrara?", "Alerta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion == 0) {
                    this.factura.dispose();
                    factura.dispose();
                    Login logg = new Login();
                    Factura vistaFf = new Factura();
                    MenuAdministrador vistaMAa = new MenuAdministrador();

                    ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());
                }
            } else {
                factura.dispose();
                Login logg = new Login();
                Factura vistaFf = new Factura();
                MenuAdministrador vistaMAa = new MenuAdministrador();

                ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());
            }
        } else if (accion.equals("SeleccionarProducto")) {
            tbproducto = new BuscarProducto(factura, true);
            tbproducto.setControlador(this);
            padreActiva = "SeleccionarProducto";
            mostrarDatos();
            tbproducto.iniciar();
        }
    }

    public void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = new DefaultTableModel();
        if (padreActiva.equals("SeleccionarProducto")) {
            String titulos[] = {"Codigó", "Nombre", "Cantidad", "Precio Venta"};
            modelo.setColumnIdentifiers(titulos);
            listita = daoProducto.selectAll();
            for (Object j : listita.toArrayAsc()) {
                Producto x = (Producto) j;
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getCantidad(), String.format("%.2f", x.getPrecioVenta())};
                modelo.addRow(datos);

            }
            this.tbproducto.jtDatos.setModel(modelo);

        } else if (padreActiva.equals("NuevoCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            listita = daoCliente.selectAll();
            for (Object j : listita.toArrayAsc()) {
                Cliente x = (Cliente) j;
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);
            }

            this.clienteMA.jtDatos.setModel(modelo);

        } else if (padreActiva.equals("SeleccionarCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            listita = daoCliente.selectAll();
            for (Object j : listita.toArrayAsc()) {
                Cliente x = (Cliente) j;
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);
            }

            this.buscarCliente.jtDatos.setModel(modelo);

        } else if (padreActiva.equals("agregarProducto")) {
            double total = 0;
            String titulos[] = {"Nº", "Codigo", "Nombre", "Cantidad", "Precio Unitario", "Total"};
            modelo.setColumnIdentifiers(titulos);

            for (Object j : VentaLista.toArrayAsc()) {
                Registros x = (Registros) j;
                Object datos[] = {x.getIdRegistros(), x.getProducto().getCodigoProducto(), x.getProducto().getNombreProducto(), x.getCantidadProducto(), String.format("%.2f", x.getProducto().getPrecioVenta()), String.format("%.2f", x.getPrecioTotalProducto())};
                modelo.addRow(datos);
                total = total + x.getPrecioTotalProducto();

            }
            this.factura.tfTotalPagar.setText(String.format("%.2f", total));
            this.factura.miTb12.setModel(modelo);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (padreActiva.equals("SeleccionarProducto")) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tbproducto.jtDatos.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(tbproducto.tfBuscar.getText()));
            tbproducto.jtDatos.setRowSorter(sorter);
        } else if (padreActiva.equals("NuevoCliente")) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) clienteMA.jtDatos.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(clienteMA.tfBuscar.getText()));
            clienteMA.jtDatos.setRowSorter(sorter);
        } else if (padreActiva.equals("SeleccionarCliente")) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) buscarCliente.jtDatos.getModel()));
            sorter.setRowFilter(RowFilter.regexFilter(buscarCliente.tfBuscar.getText()));
            buscarCliente.jtDatos.setRowSorter(sorter);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (!factura.tfProducto.getText().equals("No Agregado")) {
            int cantidad = Integer.parseInt(factura.tfCantidad.getText());
            if (cantidad <= productoSeleccionado.getCantidad()) {
                Double precio = Double.parseDouble(factura.tfPrecioUni.getText());
                factura.tfPrecioTotal1.setText(String.format("%.2f", cantidad * precio));
            } else {
                factura.tfPrecioTotal1.setText("");
                factura.tfCantidad.setText("");
                Alerta aler = new Alerta(factura, true, "Sobrepasa la cantidad existente: " + productoSeleccionado.getCantidad(), "/img/error.png");
                aler.show();
            }
        }
        if (!factura.tfTotalPagar.getText().isEmpty()) {
            try {
                double vuelto = Double.parseDouble(factura.tfEfectivo.getText()) - Double.parseDouble(factura.tfTotalPagar.getText());
                factura.tfCambio.setText(String.format("%.2f", vuelto));
            } catch (Exception ex) {

            }
        }
    }

    public void vaciarVista() {
        clienteMA.tfNombre.setText("");
        clienteMA.tfApellido.setText("");
        clienteMA.tfTelefono.setText("");
        clienteMA.tfDireccion.setText("");
    }

    public void buelto() {

        factura.tfEfectivo.setText("");
        factura.tfCambio.setText("");
    }

    public void limpiarCb1() {
        this.factura.tfPrecioUni.setText("");
        this.factura.tfPrecioTotal1.setText("");
        this.factura.tfCantidad.setText("");
        this.factura.tfProducto.setText("No Agregado");
        this.factura.tfNombre.setText("No Registrado");
        this.factura.tfDireccion.setText("No Registrado");

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
        if (padreActiva.equals("NuevoCliente")) {
            int fila = ClienteMA.jtDatos.getSelectedRow();
            String id = ClienteMA.jtDatos.getValueAt(fila, 0).toString();
            listita.antesDe(id);

            for (Object j : listita.toArrayAsc()) {
                Cliente x = (Cliente) j;
                if (x.getCodigo().equals(id)) {
                    clienteSeleccionado.setCodigo(x.getCodigo());
                    clienteSeleccionado.setIdCliente(x.getIdCliente());
                    ClienteMA.tfNombre.setText(x.getNombre());
                    ClienteMA.tfApellido.setText(x.getApellido());
                    ClienteMA.tfTelefono.setText(x.getTelefono());
                    ClienteMA.tfDireccion.setText(x.getDireccion());
                }
            }

        } else if (padreActiva.equals("SeleccionarCliente")) {
            int fila = buscarCliente.jtDatos.getSelectedRow();
            String id = buscarCliente.jtDatos.getValueAt(fila, 0).toString();
            listita.antesDe(id);
            for (Object j : listita.toArrayAsc()) {
                Cliente x = (Cliente) j;
                if (x.getCodigo().equals(id)) {
                    clienteSeleccionado.setCodigo(x.getCodigo());
                    clienteSeleccionado.setIdCliente(x.getIdCliente());
                    clienteSeleccionado.setNombre(x.getNombre());
                    clienteSeleccionado.setDireccion(x.getDireccion());
                }
            }

            cliente1 = clienteSeleccionado.getIdCliente();
            factura.tfNombre.setText(clienteSeleccionado.getNombre());
            factura.tfDireccion.setText(clienteSeleccionado.getDireccion());
            buscarCliente.setVisible(false);
        } else if (padreActiva.equals("SeleccionarProducto")) {

            int fila = tbproducto.jtDatos.getSelectedRow();
            String id = tbproducto.jtDatos.getValueAt(fila, 0).toString();
            listita.antesDe(id);
            for (Object j : listita.toArrayAsc()) {
                Producto x = (Producto) j;
                if (x.getCodigoProducto().equals(id)) {
                    productoSeleccionado.setIdProducto(x.getIdProducto());
                    productoSeleccionado.setCodigoProducto(x.getCodigoProducto());
                    productoSeleccionado.setNombreProducto(x.getNombreProducto());
                    productoSeleccionado.setCantidad(x.getCantidad());
                    productoSeleccionado.setEmpresa(x.getEmpresa());
                    productoSeleccionado.setGananciaUni(x.getGananciaUni());
                    productoSeleccionado.setPrecioVenta(x.getPrecioVenta());
                }
            }

            factura.tfProducto.setText(productoSeleccionado.getNombreProducto());
            factura.tfPrecioUni.setText(String.valueOf(productoSeleccionado.getPrecioVenta()));
            tbproducto.setVisible(false);
            factura.tfCantidad.setEditable(true);
            factura.tfPrecioTotal1.setText("");
            factura.tfCantidad.setText("");
        } else {

            int fila = factura.miTb12.getSelectedRow();
            String id1 = factura.miTb12.getValueAt(fila, 0).toString();
            System.out.println(id1);
            VentaLista.antesDe(id1);

            for (Object j : VentaLista.toArrayAsc()) {
                Registros x = (Registros) j;
                if (x.getIdRegistros() == Integer.parseInt(id1)) {
                    RegistroSeleccionada.setIdRegistros(x.getIdRegistros());
                    RegistroSeleccionada.setCantidadProducto(x.getCantidadProducto());
                    RegistroSeleccionada.setPrecioTotalProducto(x.getPrecioTotalProducto());
                    RegistroSeleccionada.setProducto(x.getProducto());
                    RegistroSeleccionada.setVenta(x.getVenta());
                }

            }
        }
    }

    public void reporteFactura(String nombre) {
        try {
            Document documento = new Document();

            String path = new File(".").getCanonicalPath();
            String FILE_NAME = path + "/Facturas/" + nombre + ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(new File(FILE_NAME)));
            documento.open();
//            Image icono = Image.getInstante("mineria.png");
//            icono.setAbsolutePosition(14,425f);
//            documento.add(icono);
            Paragraph titulo2 = new Paragraph();
            titulo2.add("N° factura: " + factura.tfNFactura.getText());
            titulo2.setAlignment(Element.ALIGN_RIGHT);
            documento.add(titulo2);

            Paragraph re = new Paragraph();
            re.add("Factura");
            re.setAlignment(Element.ALIGN_LEFT);

            documento.add(re);

            Paragraph titulo = new Paragraph();
            titulo.add("Empresa: " + empresa.get(0).getNombre());
            titulo.setAlignment(Element.ALIGN_LEFT);
            documento.add(titulo);

            Paragraph titulo3 = new Paragraph();
            titulo3.add("Cliente: " + factura.tfNombre.getText() + " " + ventaSeleccionada.getCliente().getApellido());
            titulo3.setAlignment(Element.ALIGN_LEFT);
            documento.add(titulo3);

            Paragraph titulo6 = new Paragraph();
            titulo6.add("Direccion: " + factura.tfDireccion.getText());
            titulo6.setAlignment(Element.ALIGN_LEFT);
            documento.add(titulo6);

            Paragraph titulo4 = new Paragraph();
            titulo4.add("Empleado: " + ventaSeleccionada.getEmpleado().getNombre() + " " + ventaSeleccionada.getEmpleado().getApellido());
            titulo4.setAlignment(Element.ALIGN_LEFT);
            documento.add(titulo4);

            Paragraph fecha = new Paragraph();
            fecha.add("Fecha: " + ventaSeleccionada.getFechaVenta());
            fecha.setAlignment(Element.ALIGN_RIGHT);
            documento.add(fecha);

            Paragraph espacio = new Paragraph();
            espacio.add("                       ");
            espacio.setAlignment(Element.ALIGN_CENTER);
            documento.add(espacio);

            PdfPTable pdfTable = new PdfPTable(factura.miTb12.getColumnCount());

            for (int i = 0; i < factura.miTb12.getColumnCount(); i++) {
                pdfTable.addCell(factura.miTb12.getColumnName(i));
            }

            for (int fila = 0; fila < factura.miTb12.getRowCount(); fila++) {
                for (int col = 0; col < factura.miTb12.getColumnCount(); col++) {
                    pdfTable.addCell(factura.miTb12.getModel().getValueAt(fila, col).toString());
                }
            }

            documento.add(pdfTable);

            Paragraph espacio1 = new Paragraph();
            espacio1.add("                       ");
            espacio1.setAlignment(Element.ALIGN_CENTER);
            documento.add(espacio1);

            Paragraph titulo5 = new Paragraph();
            titulo5.add("Total: " + factura.tfTotalPagar.getText());
            titulo5.setAlignment(Element.ALIGN_RIGHT);
            documento.add(titulo5);

            documento.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "PDF NO REALIZADO CORRECTAMENTE");
        }
    }

    private void abrirReporte(String reporte) {

        try {
            File objetofile = new File(reporte);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
