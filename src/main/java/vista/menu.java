
package vista;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        setTitle("Menú de Opciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaFactura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnFiltroProductos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 168, 244));
        jLabel1.setText("MENÚ DE OPCIONES");

        jPanel2.setBackground(new java.awt.Color(71, 168, 244));
        jPanel2.setPreferredSize(new java.awt.Dimension(431, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaFactura.setBackground(new java.awt.Color(71, 168, 244));
        btnNuevaFactura.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnNuevaFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaFactura.setText("Nueva Factura");
        btnNuevaFactura.setBorder(null);
        btnNuevaFactura.setBorderPainted(false);
        btnNuevaFactura.setContentAreaFilled(false);
        btnNuevaFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaFacturaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_add_receipt_80px.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        jPanel3.setBackground(new java.awt.Color(71, 168, 244));
        jPanel3.setPreferredSize(new java.awt.Dimension(431, 90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFiltroProductos.setBackground(new java.awt.Color(71, 168, 244));
        btnFiltroProductos.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnFiltroProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltroProductos.setText("Filtro de Productos");
        btnFiltroProductos.setBorder(null);
        btnFiltroProductos.setBorderPainted(false);
        btnFiltroProductos.setContentAreaFilled(false);
        btnFiltroProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroProductosActionPerformed(evt);
            }
        });
        jPanel3.add(btnFiltroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 90));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_box_80px.png")); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        jPanel4.setBackground(new java.awt.Color(71, 168, 244));
        jPanel4.setPreferredSize(new java.awt.Dimension(431, 90));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacturas.setBackground(new java.awt.Color(71, 168, 244));
        btnFacturas.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Facturas");
        btnFacturas.setBorder(null);
        btnFacturas.setBorderPainted(false);
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        jPanel4.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 90));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_bill_80px.png")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        jPanel5.setBackground(new java.awt.Color(71, 168, 244));
        jPanel5.setPreferredSize(new java.awt.Dimension(431, 90));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporte.setBackground(new java.awt.Color(71, 168, 244));
        btnReporte.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Reporte por Año");
        btnReporte.setBorder(null);
        btnReporte.setBorderPainted(false);
        btnReporte.setContentAreaFilled(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel5.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 300, 90));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_bar_chart_80px_1.png")); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaFacturaActionPerformed
        nuevafactura nf=new nuevafactura();
        nf.setVisible(true);
    }//GEN-LAST:event_btnNuevaFacturaActionPerformed

    private void btnFiltroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroProductosActionPerformed
        filtradoproducto fp=new filtradoproducto();
        fp.setVisible(true);       
    }//GEN-LAST:event_btnFiltroProductosActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        facturas f=new facturas();
        f.setVisible(true);      
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        reportes r=new reportes();
        r.setVisible(true);      
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnFiltroProductos;
    private javax.swing.JButton btnNuevaFactura;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
