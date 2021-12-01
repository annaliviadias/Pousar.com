package Interface;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public static boolean cadastro;                    
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        JDPPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnPacotes = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar5.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Pousar.com");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JDPPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        JDPPrincipal.setMaximumSize(new java.awt.Dimension(375, 667));
        JDPPrincipal.setPreferredSize(new java.awt.Dimension(375, 667));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pousar_menor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 304, 72));

        btnConsulta.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consulta.png"))); // NOI18N
        btnConsulta.setText("CONSULTA");
        btnConsulta.setBorder(new javax.swing.border.MatteBorder(null));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, 120));

        btnPacotes.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnPacotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pacotes.png"))); // NOI18N
        btnPacotes.setText("PACOTES");
        btnPacotes.setBorder(new javax.swing.border.MatteBorder(null));
        btnPacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacotesActionPerformed(evt);
            }
        });
        jPanel1.add(btnPacotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 120));

        btnPedidos.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pedidos.png"))); // NOI18N
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setBorder(new javax.swing.border.MatteBorder(null));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 350, 160, 120));

        btnAjuda.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajuda.png"))); // NOI18N
        btnAjuda.setText("SOBRE");
        btnAjuda.setBorder(new javax.swing.border.MatteBorder(null));
        btnAjuda.setBorderPainted(false);
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 160, 120));

        btnFeedback.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        btnFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/feedback.png"))); // NOI18N
        btnFeedback.setText("FEEDBACK");
        btnFeedback.setBorder(new javax.swing.border.MatteBorder(null));
        btnFeedback.setBorderPainted(false);
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 120));

        btnSair.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.MatteBorder(null));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 696, 63, 35));

        JDPPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDPPrincipalLayout = new javax.swing.GroupLayout(JDPPrincipal);
        JDPPrincipal.setLayout(JDPPrincipalLayout);
        JDPPrincipalLayout.setHorizontalGroup(
            JDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        JDPPrincipalLayout.setVerticalGroup(
            JDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
            TelaConsulta tela = new TelaConsulta();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnPacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacotesActionPerformed
        
            TelaPacotes tela = new TelaPacotes();
            tela.setVisible(true);
            dispose();
                    
          
    }//GEN-LAST:event_btnPacotesActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        
            TelaFeedback tela = new TelaFeedback();
            tela.setVisible(true);
            dispose();
            
            
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
            TelaSobre tela = new TelaSobre();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
            TelaPedidos tela = new TelaPedidos();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDPPrincipal;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnPacotes;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
