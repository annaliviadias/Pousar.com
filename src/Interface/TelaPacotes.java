
package Interface;

public class TelaPacotes extends javax.swing.JFrame {

    public TelaPacotes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNorte = new javax.swing.JButton();
        btnSul = new javax.swing.JButton();
        btnSud = new javax.swing.JButton();
        btnNord = new javax.swing.JButton();
        btnCO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnVoltar6 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNorte.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnNorte.setText("Região Norte");
        btnNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorteActionPerformed(evt);
            }
        });
        jPanel1.add(btnNorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 72));

        btnSul.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSul.setText("Região Sul");
        btnSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulActionPerformed(evt);
            }
        });
        jPanel1.add(btnSul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, 72));

        btnSud.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSud.setText("Região Sudeste");
        btnSud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSudActionPerformed(evt);
            }
        });
        jPanel1.add(btnSud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 170, 72));

        btnNord.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnNord.setText("Região Nordeste");
        btnNord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNordActionPerformed(evt);
            }
        });
        jPanel1.add(btnNord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 72));

        btnCO.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnCO.setText("Região Centro-Oeste");
        btnCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOActionPerformed(evt);
            }
        });
        jPanel1.add(btnCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, 72));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem12.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 322, 426));

        jPanel2.setPreferredSize(new java.awt.Dimension(370, 76));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("PACOTES");

        btnVoltar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnVoltar6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar6))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar6ActionPerformed
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();       
    }//GEN-LAST:event_btnVoltar6ActionPerformed

    private void btnNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNorteActionPerformed
            TelaNorte tela = new TelaNorte();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnNorteActionPerformed

    private void btnSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulActionPerformed
            TelaSul tela = new TelaSul();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSulActionPerformed

    private void btnSudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSudActionPerformed
            TelaSudeste tela = new TelaSudeste();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSudActionPerformed

    private void btnNordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNordActionPerformed
            TelaNordeste tela = new TelaNordeste();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnNordActionPerformed

    private void btnCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOActionPerformed
            TelaCentroOeste tela = new TelaCentroOeste();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCOActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPacotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCO;
    private javax.swing.JButton btnNord;
    private javax.swing.JButton btnNorte;
    private javax.swing.JButton btnSud;
    private javax.swing.JButton btnSul;
    private javax.swing.JButton btnVoltar6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
