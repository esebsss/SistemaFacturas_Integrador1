
package vista;
import controlador.Negocio;
import javax.swing.JOptionPane;
import modelo.Usuarios;

public class login extends javax.swing.JFrame {
    
    login frmLog;
    
    public login() {
        initComponents();
        setTitle("Login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtUsuarioI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtContraseñaI = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtUsuarioC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtEmailC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtContraseñaC = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 168, 244));
        jPanel2.setForeground(new java.awt.Color(231, 232, 237));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 220));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar Sesión");

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_user_100px.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(231, 232, 237));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 11, 260));

        jPanel3.setBackground(new java.awt.Color(199, 205, 213));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuarioI.setBackground(new java.awt.Color(199, 205, 213));
        txtUsuarioI.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        txtUsuarioI.setForeground(new java.awt.Color(111, 118, 128));
        txtUsuarioI.setBorder(null);
        txtUsuarioI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioIFocusGained(evt);
            }
        });
        jPanel3.add(txtUsuarioI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_user_25px_1.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, 40));

        jPanel4.setBackground(new java.awt.Color(199, 205, 213));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_password_25px_1.png")); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        txtContraseñaI.setBackground(new java.awt.Color(199, 205, 213));
        txtContraseñaI.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        txtContraseñaI.setForeground(new java.awt.Color(111, 118, 128));
        txtContraseñaI.setBorder(null);
        jPanel4.add(txtContraseñaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 250, 40));
        jPanel4.getAccessibleContext().setAccessibleName("");

        btnRegistrar.setBackground(new java.awt.Color(71, 168, 244));
        btnRegistrar.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 250, 40));

        jPanel5.setBackground(new java.awt.Color(199, 205, 213));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuarioC.setBackground(new java.awt.Color(199, 205, 213));
        txtUsuarioC.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        txtUsuarioC.setForeground(new java.awt.Color(111, 118, 128));
        txtUsuarioC.setBorder(null);
        txtUsuarioC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioCFocusGained(evt);
            }
        });
        jPanel5.add(txtUsuarioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_user_25px_1.png")); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 40));

        jPanel6.setBackground(new java.awt.Color(199, 205, 213));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmailC.setBackground(new java.awt.Color(199, 205, 213));
        txtEmailC.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        txtEmailC.setForeground(new java.awt.Color(111, 118, 128));
        txtEmailC.setBorder(null);
        txtEmailC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailCFocusGained(evt);
            }
        });
        jPanel6.add(txtEmailC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_email_sign_25px.png")); // NOI18N
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jPanel7.setBackground(new java.awt.Color(199, 205, 213));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Users\\condo\\Escritorio\\UTP\\VI Ciclo\\Integrador I\\Semana 14\\PryFacturasAb\\src\\main\\imagenes\\icons8_password_25px_1.png")); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        txtContraseñaC.setBackground(new java.awt.Color(199, 205, 213));
        txtContraseñaC.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        txtContraseñaC.setForeground(new java.awt.Color(111, 118, 128));
        txtContraseñaC.setBorder(null);
        jPanel7.add(txtContraseñaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 210, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jPanel9.setBackground(new java.awt.Color(199, 205, 213));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(71, 168, 244));
        btnIngresar.setFont(new java.awt.Font("Dubai Light", 1, 16)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Iniciar Sesión");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 250, 40));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 168, 244));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear una cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 168, 244));
        jLabel5.setText("Correo electrónico:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 168, 244));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 168, 244));
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 168, 244));
        jLabel14.setText("Contraseña:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 168, 244));
        jLabel15.setText("Usuario:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Negocio n=new Negocio();
        Usuarios mod=new Usuarios();
        String pass=new String(txtContraseñaC.getPassword());
        mod.setUsuario(txtUsuarioC.getText());
        mod.setEmail(txtEmailC.getText());
        mod.setContraseña(pass);
        
        if(n.registrar(mod)){
            JOptionPane.showMessageDialog(null,"Registro guardado con éxito");
        }else{
            JOptionPane.showMessageDialog(null,"Error al guardar");
        }
        
        txtUsuarioC.setText("");
        txtEmailC.setText("");
        txtContraseñaC.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtUsuarioCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioCFocusGained
        
    }//GEN-LAST:event_txtUsuarioCFocusGained

    private void txtUsuarioIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioIFocusGained
        
    }//GEN-LAST:event_txtUsuarioIFocusGained

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Negocio n=new Negocio();
        Usuarios mod=new Usuarios();
        
        String pass=new String(txtContraseñaI.getPassword());
        
        if(!txtUsuarioI.getText().equals("") && !pass.equals("")){
            mod.setUsuario(txtUsuarioI.getText());
            mod.setContraseña(pass);
            
            if(n.login(mod)){
                
                this.dispose();
                menu frmMenu=new menu();
                frmMenu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtEmailCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailCFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCFocusGained

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseñaC;
    private javax.swing.JPasswordField txtContraseñaI;
    private javax.swing.JTextField txtEmailC;
    private javax.swing.JTextField txtUsuarioC;
    private javax.swing.JTextField txtUsuarioI;
    // End of variables declaration//GEN-END:variables
}
