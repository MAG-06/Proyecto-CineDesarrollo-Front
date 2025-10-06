package vistas;

import modelos.Movie;

public class VenCombos extends javax.swing.JFrame {       


    public VenCombos(String usser) {
        initComponents();
        setLocationRelativeTo(this);
        txtUserEnSession.setText(usser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CbSelectCIty = new javax.swing.JComboBox<>();
        lblLogo = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        txtUserEnSession = new javax.swing.JLabel();
        btnCombos = new javax.swing.JButton();
        btnPromociones = new javax.swing.JButton();
        btnMembresia = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCartelera = new javax.swing.JButton();
        btnBot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btnCombo1 = new javax.swing.JButton();
        btnCombo4 = new javax.swing.JButton();
        btnCombo2 = new javax.swing.JButton();
        btnCombo5 = new javax.swing.JButton();
        btnCombo3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        CbSelectCIty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CbSelectCIty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armenia", "Barranquilla", "Bogotá", "Bucaramanga", "Buenaventura", "Buga", "Cali", "Cartagena", "Cartago", "Caucasia", "Cúcuta", "Dosquebradas", "Girardot", "Guajira", "Ibagué", "Itagüí", "Medellín", "Montería", "Mosquera", "Neiva", "Pasto", "Pereira", "Popayán", "Santo Tomás", "Sincelejo", "Tuluá", "Tunja", "Valledupar", "Villavicencio", "Yumbo" }));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoLujosamPrueba.png"))); // NOI18N

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoprueba.png"))); // NOI18N
        btnCarrito.setBorderPainted(false);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userprueba.png"))); // NOI18N
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        txtUserEnSession.setBackground(new java.awt.Color(255, 255, 255));
        txtUserEnSession.setForeground(new java.awt.Color(255, 255, 255));

        btnCombos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCombos.setForeground(new java.awt.Color(255, 255, 255));
        btnCombos.setText("COMBOS");
        btnCombos.setBorderPainted(false);
        btnCombos.setContentAreaFilled(false);
        btnCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombosActionPerformed(evt);
            }
        });

        btnPromociones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromociones.setForeground(new java.awt.Color(255, 255, 255));
        btnPromociones.setText("PROMOCIONES");
        btnPromociones.setBorderPainted(false);
        btnPromociones.setContentAreaFilled(false);
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });

        btnMembresia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMembresia.setForeground(new java.awt.Color(255, 255, 255));
        btnMembresia.setText("MEMBRESIA");
        btnMembresia.setBorderPainted(false);
        btnMembresia.setContentAreaFilled(false);
        btnMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiaActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multicine Plaza Flora", "Multicine San Andresito" }));

        btnCartelera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setText("CARTELERA");
        btnCartelera.setBorderPainted(false);
        btnCartelera.setContentAreaFilled(false);
        btnCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteleraActionPerformed(evt);
            }
        });

        btnBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IAprueba.png"))); // NOI18N
        btnBot.setBorderPainted(false);
        btnBot.setContentAreaFilled(false);
        btnBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCartelera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMembresia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCombos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPromociones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserEnSession, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBot)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUserEnSession, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CbSelectCIty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnMembresia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCombos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBot)
                    .addComponent(btnPerfil)
                    .addComponent(btnCarrito))
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        btnCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/combo1he.png"))); // NOI18N
        btnCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo1ActionPerformed(evt);
            }
        });

        btnCombo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/combo4he.png"))); // NOI18N
        btnCombo4.setBorderPainted(false);

        btnCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/combo2he.png"))); // NOI18N
        btnCombo2.setBorderPainted(false);

        btnCombo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/combo5he.png"))); // NOI18N
        btnCombo5.setBorderPainted(false);

        btnCombo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/combo3he.png"))); // NOI18N
        btnCombo3.setBorderPainted(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Combos/comboJuniorhe.png"))); // NOI18N
        jButton6.setText("\n");
        jButton6.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMBOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCombo5)
                            .addComponent(btnCombo2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCombo4)
                            .addComponent(btnCombo1))
                        .addGap(368, 368, 368)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCombo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCombo2)
                            .addComponent(btnCombo3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(btnCombo5)
                            .addComponent(btnCombo4)))
                    .addComponent(btnCombo1))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        String usser = txtUserEnSession.getText();
        VenPrincipal venPrincipal = new VenPrincipal(usser);
        venPrincipal.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void btnMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiaActionPerformed
        String usser = txtUserEnSession.getText();
        VenMembresia venMembresia = new VenMembresia(usser);
        venMembresia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMembresiaActionPerformed

    private void btnCombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombosActionPerformed
        String usser = txtUserEnSession.getText();
        VenCombos venCombos = new VenCombos(usser);
        venCombos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCombosActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        String usser = txtUserEnSession.getText();
        VenPromo venPromo = new VenPromo(usser);
        venPromo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo1ActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        String usser = txtUserEnSession.getText();
        VenPerfil venPerfil = new VenPerfil(usser);
        venPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotActionPerformed
        VenChatBot venIA = new VenChatBot();
        venIA.setVisible(true);     
    }//GEN-LAST:event_btnBotActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        VenCarrito venCarrito = new VenCarrito();
        venCarrito.setVisible(true);
    }//GEN-LAST:event_btnCarritoActionPerformed

    
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
            java.util.logging.Logger.getLogger(VenCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenCombos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbSelectCIty;
    private javax.swing.JButton btnBot;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnCombo1;
    private javax.swing.JButton btnCombo2;
    private javax.swing.JButton btnCombo3;
    private javax.swing.JButton btnCombo4;
    private javax.swing.JButton btnCombo5;
    private javax.swing.JButton btnCombos;
    private javax.swing.JButton btnMembresia;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel txtUserEnSession;
    // End of variables declaration//GEN-END:variables
}
