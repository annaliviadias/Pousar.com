package Interface;

import Conexoes.MySQL;
import Objetos.Destino;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.JOptionPane;

public class TelaSul extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Destino novoDestino = new Destino();
    DecimalFormat dFormatter = new DecimalFormat("####.##");

    public TelaSul() {
        initComponents();
    }
    
    private void RegistraDestino (Destino novoDestino){
        this.conectar.conectaBanco();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
        if (ChuiIda.getDate() != null && ChuiVolta.getDate() != null){
            double val = 2349.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(ChuiIda.getDate());
            String datavolta = sdf.format(ChuiVolta.getDate());
                       
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Chuí - RS");
            novoDestino.setPassageiros((String) QntPassageiros.getSelectedItem());
            novoDestino.setValor("R$"+valfinal);
            
            try {                       
                this.conectar.insertSQL("INSERT INTO carrinho ("
                        + "destino_nome,"
                        + "destino_preco,"
                        + "destino_passageiros,"
                        + "destino_ida,"
                        + "destino_volta"
                    + ") VALUES ("
                        + "'" + novoDestino.getLocal() + "',"
                        + "'" + novoDestino.getValor() + "',"
                        + "'" + novoDestino.getPassageiros() + "',"
                        + "'" + novoDestino.getIda() + "',"     
                        + "'" + novoDestino.getVolta() + "'"
                    + ");");

            } catch (Exception e) {

                System.out.println("Erro ao realizar compra" +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao realizar compra");

            } finally{            
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Finalize sua compra em pedidos");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }
        }
        
        if (JardimIda.getDate() != null && JardimVolta.getDate() != null){
            double val = 2990.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(JardimIda.getDate());
            String datavolta = sdf.format(JardimVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Jardim Botânico - PR");
            novoDestino.setPassageiros((String) QntPassageiros.getSelectedItem());
            novoDestino.setValor("R$"+valfinal);
            
            try {                       
                this.conectar.insertSQL("INSERT INTO carrinho ("
                        + "destino_nome,"
                        + "destino_preco,"
                        + "destino_passageiros,"
                        + "destino_ida,"
                        + "destino_volta"
                    + ") VALUES ("
                        + "'" + novoDestino.getLocal() + "',"
                        + "'" + novoDestino.getValor() + "',"
                        + "'" + novoDestino.getPassageiros() + "',"
                        + "'" + novoDestino.getIda() + "',"     
                        + "'" + novoDestino.getVolta() + "'"
                    + ");");

            } catch (Exception e) {

                System.out.println("Erro ao realizar compra" +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao realizar compra");

            } finally{            
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Finalize sua compra em pedidos");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }
        }
        
        if (GramadoIda.getDate() != null && GramadoVolta.getDate() != null){
            double val = 3249.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(GramadoIda.getDate());
            String datavolta = sdf.format(GramadoVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Gramado - RS");
            novoDestino.setPassageiros((String) QntPassageiros.getSelectedItem());
            novoDestino.setValor("R$"+valfinal);
            
            try {                       
                this.conectar.insertSQL("INSERT INTO carrinho ("
                        + "destino_nome,"
                        + "destino_preco,"
                        + "destino_passageiros,"
                        + "destino_ida,"
                        + "destino_volta"
                    + ") VALUES ("
                        + "'" + novoDestino.getLocal() + "',"
                        + "'" + novoDestino.getValor() + "',"
                        + "'" + novoDestino.getPassageiros() + "',"
                        + "'" + novoDestino.getIda() + "',"     
                        + "'" + novoDestino.getVolta() + "'"
                    + ");");

            } catch (Exception e) {

                System.out.println("Erro ao realizar compra" +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao realizar compra");

            } finally{            
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Finalize sua compra em pedidos");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        QntPassageiros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ChuiIda = new com.toedter.calendar.JDateChooser();
        ChuiVolta = new com.toedter.calendar.JDateChooser();
        JardimIda = new com.toedter.calendar.JDateChooser();
        JardimVolta = new com.toedter.calendar.JDateChooser();
        GramadoIda = new com.toedter.calendar.JDateChooser();
        GramadoVolta = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(380, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("REGIÃO SUL");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        QntPassageiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 passageiro", "2 passageiros", "3 passageiros" }));
        QntPassageiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QntPassageirosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CHUI.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 260, 183));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JDBOTANICO.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, -1, 187));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GRAMADO.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 287, 189));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel5.setText("CHUI - RS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, 137, 49));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel6.setText("JARDIM BOTÂNICO - PR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 316, 194, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel7.setText("GRAMADO - RS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 567, 149, -1));

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("VER PREÇO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 120, -1));

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 0));
        jButton3.setText("VER PREÇO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, -1));

        jButton4.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("VER PREÇO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 120, -1));

        jLabel8.setText("IDA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel9.setText("VOLTA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel10.setText("IDA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        jLabel11.setText("VOLTA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jLabel12.setText("IDA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, -1));

        jLabel13.setText("VOLTA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 730, -1, -1));

        ChuiIda.setDateFormatString("y-M-d");
        jPanel1.add(ChuiIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, 28));

        ChuiVolta.setDateFormatString("y-M-d");
        jPanel1.add(ChuiVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, 27));

        JardimIda.setDateFormatString("y-M-d");
        jPanel1.add(JardimIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 30));

        JardimVolta.setDateFormatString("y-M-d");
        jPanel1.add(JardimVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 110, 30));

        GramadoIda.setDateFormatString("y-M-d");
        jPanel1.add(GramadoIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 690, 110, 30));

        GramadoVolta.setDateFormatString("y-M-d");
        jPanel1.add(GramadoVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 750, 110, 30));

        jButton5.setText("ADD CARRINHO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 120, -1));

        jButton6.setText("ADD CARRINHO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 120, -1));

        jButton7.setText("ADD CARRINHO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            TelaPacotes tela = new TelaPacotes();
            tela.setVisible(true);
            dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void QntPassageirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QntPassageirosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QntPassageirosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double preço = 2349.90;       
        
        if (QntPassageiros.getSelectedItem() == "1 passageiro"){
            String formatado = dFormatter.format(preço);
            JOptionPane.showMessageDialog(null,"O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "2 passageiros"){
            String formatado = dFormatter.format(preço * 1.95);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "3 passageiros"){
            String formatado = dFormatter.format(preço * 2.9);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double preço = 2990.90;       
        
        if (QntPassageiros.getSelectedItem() == "1 passageiro"){
            String formatado = dFormatter.format(preço);
            JOptionPane.showMessageDialog(null,"O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "2 passageiros"){
            String formatado = dFormatter.format(preço * 1.95);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "3 passageiros"){
            String formatado = dFormatter.format(preço * 2.9);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double preço = 3249.90;       
        
        if (QntPassageiros.getSelectedItem() == "1 passageiro"){
            String formatado = dFormatter.format(preço);
            JOptionPane.showMessageDialog(null,"O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "2 passageiros"){
            String formatado = dFormatter.format(preço * 1.95);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
        
        if (QntPassageiros.getSelectedItem() == "3 passageiros"){
            String formatado = dFormatter.format(preço * 2.9);
            JOptionPane.showMessageDialog(null, "O valor fica em R$" + formatado);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton7ActionPerformed
   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TelaSul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ChuiIda;
    private com.toedter.calendar.JDateChooser ChuiVolta;
    private com.toedter.calendar.JDateChooser GramadoIda;
    private com.toedter.calendar.JDateChooser GramadoVolta;
    private com.toedter.calendar.JDateChooser JardimIda;
    private com.toedter.calendar.JDateChooser JardimVolta;
    private javax.swing.JComboBox<String> QntPassageiros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    // End of variables declaration//GEN-END:variables
}
