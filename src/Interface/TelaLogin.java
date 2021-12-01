package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.Clientes;
import java.sql.Connection;

public class TelaLogin extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Clientes novoCliente = new Clientes();

    private Connection conn;
        public TelaLogin() {
        initComponents(); 
        jPanel1.setFocusable(true);
    }
        
    private void verificarCliente(Clientes novoCliente){
        this.conectar.conectaBanco();
        
        String usuario = campousuario.getText();
        String senha = camposenha.getText();     
        
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "cliente_usuario,"                    
                    + "cliente_senha"
                 + " FROM"
                     + " pousar.cadastro_clientes"
                 + " WHERE"
                     + " cliente_usuario = '" + usuario + "' and"
                     + " cliente_senha = '" + senha + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoCliente.setUsuario(this.conectar.getResultSet().getString(1));
                novoCliente.setSenha(this.conectar.getResultSet().getString(2));
           }            
                                
        } catch (Exception e) {            
            System.out.println("Usuário não cadastrado" +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
           
        }finally{
            
            if(novoCliente.getUsuario() != "" && novoCliente.getSenha() != ""){                           
                TelaSplash tela = new TelaSplash();
                tela.setVisible(true);
                dispose();
                this.conectar.fechaBanco();
           }
           else{
               JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
           }           
        }               
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        camposenha = new javax.swing.JPasswordField();
        campousuario = new javax.swing.JTextField();
        bntLogin = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnNovo.setBackground(new java.awt.Color(102, 153, 255));
        btnNovo.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(375, 667));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pousar_menor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 101, 307, -1));

        jPanel6.setBackground(new java.awt.Color(237, 237, 237));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadeado1.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("____________________________________");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("____________________________________");

        camposenha.setBackground(new java.awt.Color(237, 237, 237));
        camposenha.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        camposenha.setForeground(new java.awt.Color(204, 204, 204));
        camposenha.setText("**********");
        camposenha.setBorder(null);
        camposenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                camposenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                camposenhaFocusLost(evt);
            }
        });

        campousuario.setBackground(new java.awt.Color(237, 237, 237));
        campousuario.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        campousuario.setForeground(new java.awt.Color(204, 204, 204));
        campousuario.setText("Usuário");
        campousuario.setToolTipText("");
        campousuario.setBorder(null);
        campousuario.setCaretColor(new java.awt.Color(102, 153, 255));
        campousuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campousuario.setName(""); // NOI18N
        campousuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campousuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campousuarioFocusLost(evt);
            }
        });
        campousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campousuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camposenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(camposenha))
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 298, 307, -1));

        bntLogin.setBackground(new java.awt.Color(102, 153, 255));
        bntLogin.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        bntLogin.setForeground(new java.awt.Color(255, 255, 255));
        bntLogin.setText("ENTRAR");
        bntLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bntLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLoginActionPerformed(evt);
            }
        });
        jPanel1.add(bntLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 165, 52));

        btnNovo1.setBackground(new java.awt.Color(102, 153, 255));
        btnNovo1.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        btnNovo1.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo1.setText("NOVO");
        btnNovo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campousuarioActionPerformed

    }//GEN-LAST:event_campousuarioActionPerformed

    private void bntLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLoginActionPerformed
        verificarCliente(novoCliente);
    }//GEN-LAST:event_bntLoginActionPerformed

    private void campousuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campousuarioFocusGained
        if (campousuario.getText().equals("Usuário")){
            campousuario.setText("");
            campousuario.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_campousuarioFocusGained

    private void campousuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campousuarioFocusLost
        if (campousuario.getText().equals("")){
            campousuario.setText("Usuário");
            campousuario.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_campousuarioFocusLost

    private void camposenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camposenhaFocusGained
        if (camposenha.getText().equals("**********")){
            camposenha.setText("");
            camposenha.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_camposenhaFocusGained

    private void camposenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camposenhaFocusLost
        if (camposenha.getText().equals("")){
            camposenha.setText("**********");
            camposenha.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_camposenhaFocusLost

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovo1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLogin;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField campousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
