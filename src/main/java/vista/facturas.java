
package vista;
import controlador.Negocio;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Factura;

public class facturas extends javax.swing.JFrame {
    
    Negocio obj=new Negocio();

    public facturas() {
        initComponents();
        muestraListaClienteCas();
        setTitle("Facturas");
    }

    void muestraListaClienteCas(){
        DefaultTableModel dt=(DefaultTableModel)tablaCascada.getModel();
            dt.setRowCount(0);
            for(Cliente x:obj.ListaCliente()){
            Object v[]={x.getCli_cod(),x.getCli_nom(),x.getCli_telefono(),x.getCli_cor(),x.getCli_dire()};
            dt.addRow(v);
            }
    }
    
    void muestraListaFacturaCas(String cod){
         DefaultTableModel dt=(DefaultTableModel)tablaCascada1.getModel();
            dt.setRowCount(0);
            for(Cliente x:obj.ListaFactura(cod)){
            Object v[]={x.getFac_num(),x.getFecha().substring(0,11),x.getCli_cod(),x.getIgv()};
            dt.addRow(v);
        }
    }
    
     void muestraListaFacDetaCas(String cod){
         double sm=0;
         DefaultTableModel dt=(DefaultTableModel)tablaCascada2.getModel();
            dt.setRowCount(0);
            for(Factura x:obj.ListDetaFac(cod)){
            Object v[]={x.getArt_cod(),x.getArt_nom(),x.getArt_pre(),x.getArt_can(),x.monto()};
            sm=sm+x.monto();
            dt.addRow(v);
        }
             txtTotalCascada.setText(""+sm);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCascada = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCascada1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCascada2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtTotalCascada = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 168, 244));
        jLabel1.setText("FACTURAS");

        jLabel12.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 168, 244));
        jLabel12.setText("CLIENTES");

        tablaCascada.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        tablaCascada.setForeground(new java.awt.Color(71, 168, 244));
        tablaCascada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO CLIENTE", "NOMBRE", "TELEFONO", "CORREO", "DIRECCION"
            }
        ));
        tablaCascada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCascadaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCascada);

        jLabel13.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 168, 244));
        jLabel13.setText("FACTURAS");

        tablaCascada1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        tablaCascada1.setForeground(new java.awt.Color(71, 168, 244));
        tablaCascada1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FAC_NUMERO", "FAC_FECHA", "CLI_COD", "FAC_IGV"
            }
        ));
        tablaCascada1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCascada1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaCascada1);

        jLabel14.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 168, 244));
        jLabel14.setText("DETALLES DE LAS FACTURAS");

        tablaCascada2.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        tablaCascada2.setForeground(new java.awt.Color(71, 168, 244));
        tablaCascada2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FAC_NUMERO", "ART_CODIGO", "ART_NOMBRE", "ART_PRECIO", "MONTO"
            }
        ));
        jScrollPane6.setViewportView(tablaCascada2);

        jLabel15.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 168, 244));
        jLabel15.setText("TOTAL FACTURA");

        txtTotalCascada.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalCascada.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtTotalCascada.setForeground(new java.awt.Color(71, 168, 244));
        txtTotalCascada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalCascada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));
        txtTotalCascada.setEnabled(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalCascada, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCascada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCascadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCascadaMouseClicked
        int fila=tablaCascada.getSelectedRow();//fila seleccionada
        String codigo=(tablaCascada.getValueAt(fila, 0).toString());
        muestraListaFacturaCas(codigo);
        tablaCascada1.setVisible(true);
    }//GEN-LAST:event_tablaCascadaMouseClicked

    private void tablaCascada1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCascada1MouseClicked
        int fila=tablaCascada1.getSelectedRow();//fila seleccionada
        String codigo=(tablaCascada1.getValueAt(fila, 0).toString());
        muestraListaFacDetaCas(codigo);
        tablaCascada2.setVisible(true);
    }//GEN-LAST:event_tablaCascada1MouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu m=new menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tablaCascada;
    private javax.swing.JTable tablaCascada1;
    private javax.swing.JTable tablaCascada2;
    private javax.swing.JTextField txtTotalCascada;
    // End of variables declaration//GEN-END:variables
}
