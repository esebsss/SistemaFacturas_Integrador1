
package vista;
import static com.sun.scenario.effect.impl.prism.PrEffectHelper.render;
import modelo.Ventas;
import controlador.Negocio;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;


public class reportes extends javax.swing.JFrame {
    
    Negocio obj=new Negocio();

    public reportes() {
        initComponents();
        setTitle("Reportes");
    }
    void gra_soles(int an){
        DefaultCategoryDataset ds=new DefaultCategoryDataset();
        for(Ventas x:obj.lisven(an)){
            ds.setValue(x.getTotal(),"VENTA",x.mes());
        }
        JFreeChart gf=ChartFactory.createBarChart("AÑO "+an,"MES","CANTIDAD EN SOLES VENDIDO",ds);
        ChartPanel cp=new ChartPanel(gf);
        CategoryPlot plot = gf.getCategoryPlot();
        BarRenderer render = (BarRenderer)plot.getRenderer();
        render.setSeriesPaint(0, Color.decode("#11A8F4"));
        panel1.removeAll();
        panel1.setLayout(new java.awt.BorderLayout());
        panel1.add(cp,BorderLayout.CENTER);
        panel1.validate();
    }
    void gra_cant(int an){
        DefaultCategoryDataset ds=new DefaultCategoryDataset();
        for(Ventas x:obj.lisven(an)){
            ds.setValue(x.getCantidad(),"VENTA",x.mes());
        }
        JFreeChart gf=ChartFactory.createBarChart("AÑO "+an, "MES", "PRODUCTOS VENDIDOS", ds);
        ChartPanel cp=new ChartPanel(gf);
        CategoryPlot plot = gf.getCategoryPlot();
        BarRenderer render = (BarRenderer)plot.getRenderer();
        render.setSeriesPaint(0, Color.decode("#11A8F4"));
        panel1.removeAll();
        panel1.setLayout(new java.awt.BorderLayout());
        panel1.add(cp,BorderLayout.CENTER);
        panel1.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbAn = new javax.swing.JComboBox<>();
        btnProductos = new javax.swing.JButton();
        btnDinero = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 168, 244));
        jLabel1.setText("REPORTES");

        cbAn.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        cbAn.setForeground(new java.awt.Color(71, 168, 244));
        cbAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione año", "2016", "2017", "2018", "2019", "2020", "2021" }));

        btnProductos.setBackground(new java.awt.Color(71, 168, 244));
        btnProductos.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("PRODUCTOS");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnDinero.setBackground(new java.awt.Color(71, 168, 244));
        btnDinero.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnDinero.setForeground(new java.awt.Color(255, 255, 255));
        btnDinero.setText("DINERO");
        btnDinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDineroActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 168, 244)));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        btnMenu.setBackground(new java.awt.Color(71, 168, 244));
        btnMenu.setFont(new java.awt.Font("Dubai Light", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("MENÚ");
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
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(cbAn, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        try{
            int an=Integer.parseInt(cbAn.getSelectedItem().toString());
            gra_cant(an);
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Debe seleccionar una año");
	}
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDineroActionPerformed
        int an=Integer.parseInt(cbAn.getSelectedItem().toString());
        gra_soles(an);
    }//GEN-LAST:event_btnDineroActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDinero;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProductos;
    private javax.swing.JComboBox<String> cbAn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
