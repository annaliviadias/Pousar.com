package Interface;

import Conexoes.MySQL;
import Objetos.Destino;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.JOptionPane;

public class TelaCentroOeste extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Destino novoDestino = new Destino();
    DecimalFormat dFormatter = new DecimalFormat("####.##");

    public TelaCentroOeste() {
        initComponents();
    }
    
    private void RegistraDestino (Destino novoDestino){
        this.conectar.conectaBanco();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
        if (ChapadaIda.getDate() != null && ChapadaVolta.getDate() != null){
            double val = 1899.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(ChapadaIda.getDate());
            String datavolta = sdf.format(ChapadaVolta.getDate());
                       
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Chapada dos Guimarães - MT");
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
        
        if (BrasiliaIda.getDate() != null && BrasiliaVolta.getDate() != null){
            double val = 2658.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(BrasiliaIda.getDate());
            String datavolta = sdf.format(BrasiliaVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Brasília - DF");
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
        
        if (PantanalIda.getDate() != null && PantanalVolta.getDate() != null){
            double val = 3477.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(PantanalIda.getDate());
            String datavolta = sdf.format(PantanalVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Pantanal - MT/MS");
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        QntPassageiros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChapadaIda = new com.toedter.calendar.JDateChooser();
        ChapadaVolta = new com.toedter.calendar.JDateChooser();
        BrasiliaIda = new com.toedter.calendar.JDateChooser();
        BrasiliaVolta = new com.toedter.calendar.JDateChooser();
        PantanalIda = new com.toedter.calendar.JDateChooser();
        PantanalVolta = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("REGIÃO CENTRO-OESTE");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CHAPADA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, 248, 183));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BRASILIA.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 260, 183));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PANTANAL.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 248, 183));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel6.setText("BRASILIA - DF");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 236, 47));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel7.setText("PANTANAL - MT/MS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 233, 53));

        ChapadaIda.setDateFormatString("y-M-d");
        jPanel1.add(ChapadaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 212, 115, 30));

        ChapadaVolta.setDateFormatString("y-M-d");
        jPanel1.add(ChapadaVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 272, 115, 30));

        BrasiliaIda.setDateFormatString("y-M-d");
        jPanel1.add(BrasiliaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 115, 30));

        BrasiliaVolta.setDateFormatString("y-M-d");
        jPanel1.add(BrasiliaVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 115, 30));

        PantanalIda.setDateFormatString("y-M-d");
        jPanel1.add(PantanalIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 115, 30));

        PantanalVolta.setDateFormatString("y-M-d");
        jPanel1.add(PantanalVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, 115, 30));

        jLabel8.setText("IDA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel9.setText("VOLTA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel10.setText("IDA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel11.setText("VOLTA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        jLabel12.setText("IDA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, -1, -1));

        jLabel13.setText("VOLTA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, -1));

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("VER PREÇO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 0));
        jButton3.setText("VER PREÇO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jButton4.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("VER PREÇO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        jLabel14.setText("CHAPADA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel15.setText("DOS GUIMARÃES - MT");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, -1));

        jButton6.setText("ADD CARRINHO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jButton8.setText("ADD CARRINHO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jButton9.setText("ADD CARRINHO");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        double preço = 1899.90;       
        
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
        double preço = 2658.90;       
        
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
        double preço = 3477.90;       
        
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCentroOeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCentroOeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCentroOeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCentroOeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCentroOeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BrasiliaIda;
    private com.toedter.calendar.JDateChooser BrasiliaVolta;
    private com.toedter.calendar.JDateChooser ChapadaIda;
    private com.toedter.calendar.JDateChooser ChapadaVolta;
    private com.toedter.calendar.JDateChooser PantanalIda;
    private com.toedter.calendar.JDateChooser PantanalVolta;
    private javax.swing.JComboBox<String> QntPassageiros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    // End of variables declaration//GEN-END:variables
}
