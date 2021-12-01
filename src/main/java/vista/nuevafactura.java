
package vista;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import controlador.Negocio;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import util.Conexion;

public class nuevafactura extends javax.swing.JFrame {
    Negocio obj=new Negocio();
    Factura f=new Factura();
    Detalle de;
    Detalle_lista lis=new Detalle_lista();
    private static Conexion con;
    
    void jasper(String facNum){
        JasperReport report;
        JasperPrint jprint = null;
        
        try {
            report= (JasperReport) JRLoader.loadObject(getClass().getResource("/informes/Blank.jasper"));
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("fac_num", facNum);
            jprint=JasperFillManager.fillReport(report, map, con.getCon());
        } catch (JRException ex){
            Logger.getLogger(nuevafactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(jprint!=null){
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
        }
    }

    
    /*void jasper(String facNum){
        JasperPrint prin = null;
        try{
        JasperReport archivo=JasperCompileManager.compileReport("");
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("fac_num",facNum);
        prin=JasperFillManager.fillReport(archivo, map, con.getCon());
        }catch(JRException ex){
            Logger.getLogger(nuevafactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(prin!=null){
            JasperViewer view = new JasperViewer(prin, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
        }    
    }*/
      

    public nuevafactura() {
        initComponents();
        setTitle("Nueva Factura");
        llena();
        hora();  
    }
    void hora(){
        String hora=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        txtHora.setText(hora);
    }
    void llena(){
      txtFac.setText(obj.numfac());
      for (Vendedor x:obj.lisVen()) {
          int in=x.getNomv().indexOf(",");
          cbVendedor.addItem(String.valueOf(x.getCodv())+" - "+x.getNomv().substring(in+1));
      }
      for (Cliente x:obj.lisCli()) cbCliente.addItem(x.getCli_nom());
      for (Articulo x:obj.lisArt()) cbArticulo.addItem(x.getArt_nom());
    }
    void limpiaart(){
        cbArticulo.setSelectedIndex(0);
        txtPrecio.setText("");
        txtStock.setText("");
        txtCantidad.setText("");
    }
    void totfac(){
        double s = 0;
        int t = tb1.getRowCount();
        for (int i=0;i<t; i++)s += Double.parseDouble(tb1.getValueAt(i, 4).toString());
        String im = Double.toString(s);
        txtSub.setText(im);   
    }
    void tot(){
        double sub=Double.parseDouble(txtSub.getText());
        double igv=sub*0.18;
        txtIgv.setText(String.valueOf(Math.round(igv*100)/100));
        txtTotal.setText(String.valueOf(sub+igv));
    }
    void limpiat(){
        DefaultTableModel tb = (DefaultTableModel) tb1.getModel();
        int a = tb1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
    void muestra(){
        DefaultTableModel dt=(DefaultTableModel)tb1.getModel();
        dt.setRowCount(0);
        for(Detalle x:lis.listado()){
            Object v[]={x.getCoda(), x.getNoma(), x.getPrea(), x.getCanta(), x.total()};
            dt.addRow(v);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        txtFac = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAnular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbArticulo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnAgrega = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbVendedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        btnGraba = new javax.swing.JButton();
        txtIgv = new javax.swing.JTextField();
        txt = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtFac.setEditable(false);
        txtFac.setBackground(new java.awt.Color(255, 255, 255));
        txtFac.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtFac.setForeground(new java.awt.Color(71, 168, 244));
        txtFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        tb1.setBackground(new java.awt.Color(255, 255, 255));
        tb1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        tb1.setForeground(new java.awt.Color(71, 168, 244));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "PRECIO UNIT", "CANTIDAD", "TOTAL"
            }
        ));
        tb1.setOpaque(false);
        jScrollPane1.setViewportView(tb1);

        btnNuevo.setBackground(new java.awt.Color(71, 168, 244));
        btnNuevo.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 168, 244));
        jLabel1.setText("NUEVA FACTURA DE VENTAS");

        btnAnular.setBackground(new java.awt.Color(71, 168, 244));
        btnAnular.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(255, 255, 255));
        btnAnular.setText("ANULAR");
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 168, 244));
        jLabel10.setText("SUBTOTAL");

        btnImprimir.setBackground(new java.awt.Color(71, 168, 244));
        btnImprimir.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 168, 244));
        jLabel3.setText("FECHA DE FACTURA");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARTÍCULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 1, 12), new java.awt.Color(71, 168, 244))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(728, 64));

        cbArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione artículo" }));
        cbArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArticuloActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 168, 244));
        jLabel7.setText("PRECIO");

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 168, 244));
        jLabel8.setText("STOCK");

        jLabel9.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 168, 244));
        jLabel9.setText("CANTIDAD");

        btnEliminar.setBackground(new java.awt.Color(71, 168, 244));
        btnEliminar.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(71, 168, 244));
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));
        txtPrecio.setPreferredSize(new java.awt.Dimension(110, 24));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPrecioPropertyChange(evt);
            }
        });

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtStock.setForeground(new java.awt.Color(71, 168, 244));
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));
        txtStock.setPreferredSize(new java.awt.Dimension(100, 24));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(71, 168, 244));
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));
        txtCantidad.setPreferredSize(new java.awt.Dimension(110, 24));

        btnAgrega.setBackground(new java.awt.Color(71, 168, 244));
        btnAgrega.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnAgrega.setForeground(new java.awt.Color(255, 255, 255));
        btnAgrega.setText("AGREGAR");
        btnAgrega.setBorder(null);
        btnAgrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 168, 244));
        jLabel11.setText("IGV");

        btnMenu.setBackground(new java.awt.Color(71, 168, 244));
        btnMenu.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("MENÚ");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENDEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 1, 12), new java.awt.Color(71, 168, 244))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(648, 60));

        cbVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione vendedor" }));
        cbVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVendedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 168, 244));
        jLabel4.setText("NOMBRE");

        txtNom.setEditable(false);
        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtNom.setForeground(new java.awt.Color(71, 168, 244));
        txtNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtNom)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 168, 244));
        jLabel12.setText("TOTAL");

        txtSub.setEditable(false);
        txtSub.setBackground(new java.awt.Color(255, 255, 255));
        txtSub.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtSub.setForeground(new java.awt.Color(71, 168, 244));
        txtSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        btnGraba.setBackground(new java.awt.Color(71, 168, 244));
        btnGraba.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnGraba.setForeground(new java.awt.Color(255, 255, 255));
        btnGraba.setText("GRABAR");
        btnGraba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaActionPerformed(evt);
            }
        });

        txtIgv.setEditable(false);
        txtIgv.setBackground(new java.awt.Color(255, 255, 255));
        txtIgv.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtIgv.setForeground(new java.awt.Color(71, 168, 244));
        txtIgv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        txt.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(71, 168, 244));
        txt.setText("FACTURA");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(71, 168, 244));
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Light", 1, 12), new java.awt.Color(71, 168, 244))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(272, 84));

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente" }));
        cbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 168, 244));
        jLabel5.setText("DIRECCIÓN");

        txtDir.setEditable(false);
        txtDir.setBackground(new java.awt.Color(255, 255, 255));
        txtDir.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtDir.setForeground(new java.awt.Color(71, 168, 244));
        txtDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 168, 244));
        jLabel6.setText("CORREO");

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Dubai Light", 1, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(71, 168, 244));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo)
                    .addComponent(txtDir))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtHora.setEditable(false);
        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(71, 168, 244));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGraba, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 117, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotal)))))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt)
                    .addComponent(txtFac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraba, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtFac.setText(obj.numfac());
        txtNom.setText("");
        txtDir.setText("");
        txtCorreo.setText("");
        txtSub.setText("");
        txtTotal.setText("");
        txtIgv.setText("");
        limpiat();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        String f=JOptionPane.showInputDialog("Ingrese el código de la factura a borrar");
        obj.borrafc(f);
        obj.borrafd(f);
        JOptionPane.showMessageDialog(null, "La factura "+f+" ha sido eliminada");
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String fac_num=txtFac.getText();
        jasper(fac_num);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cbArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArticuloActionPerformed
        try{
            int in=cbArticulo.getSelectedIndex()-1;
            String coda=obj.lisArt().get(in).getArt_cod();
            Articulo a=obj.Busart(coda);
            txtPrecio.setText(String.valueOf(a.getArt_pre()));
            txtStock.setText(String.valueOf(a.getArt_stock()));
            }catch(Exception ex){
        }
    }//GEN-LAST:event_cbArticuloActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        lis.borra(tb1.getSelectedRow());
        muestra();
        totfac();
        tot();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPrecioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPrecioPropertyChange

    }//GEN-LAST:event_txtPrecioPropertyChange

    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        int in=cbArticulo.getSelectedIndex()-1;
        String coda=obj.lisArt().get(in).getArt_cod();
        double pre=Double.parseDouble(txtPrecio.getText());
        int can=Integer.parseInt(txtCantidad.getText());
        String noma=cbArticulo.getSelectedItem().toString();
        Detalle d=new Detalle(coda, noma, can, pre);
        lis.adiciona(d);
        muestra();
        limpiaart();
        totfac();
        tot();
    }//GEN-LAST:event_btnAgregaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu m=new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void cbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVendedorActionPerformed
        try{
            int ve=cbVendedor.getSelectedIndex();
            Vendedor v=obj.Busven(ve);
            txtNom.setText(v.getNomv());
            }catch(Exception ex){
        }
    }//GEN-LAST:event_cbVendedorActionPerformed

    private void btnGrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaActionPerformed
        int ind=cbCliente.getSelectedIndex()-1;
        String codc=obj.lisCli().get(ind).getCli_cod();
        int codv=cbVendedor.getSelectedIndex();
        String igv = "";
        obj.adicion(codc, igv, codv, lis.listado());
    }//GEN-LAST:event_btnGrabaActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        try{
            int ind=cbCliente.getSelectedIndex()-1;
            String codc=obj.lisCli().get(ind).getCli_cod();
            Cliente c=obj.Busca(codc);
            txtDir.setText(c.getCli_dire());
            txtCorreo.setText(c.getCli_cor());
        }catch(Exception ex){  
        }
    }//GEN-LAST:event_cbClienteActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed

    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

    }//GEN-LAST:event_btnImprimirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nuevafactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevafactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevafactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevafactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevafactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGraba;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbArticulo;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtFac;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
