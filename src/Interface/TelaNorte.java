package Interface;

import Conexoes.MySQL;
import Objetos.Destino;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.JOptionPane;
import Objetos.Clientes;

public class TelaNorte extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Destino novoDestino = new Destino();
    Clientes novoCliente = new Clientes();
    DecimalFormat dFormatter = new DecimalFormat("####.##");

    public TelaNorte() {
        initComponents();
    }
    
    private void RegistraDestino (Destino novoDestino){
        this.conectar.conectaBanco();
        
        String consultaCpf = this.novoCliente.getCep();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
        if (OiapoqueIda.getDate() != null && OiapoqueVolta.getDate() != null){
            double val = 1490.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(OiapoqueIda.getDate());
            String datavolta = sdf.format(OiapoqueVolta.getDate());
                       
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Oiapoque - AP");
            novoDestino.setPassageiros((String) QntPassageiros.getSelectedItem());
            novoDestino.setValor("R$"+valfinal);
            
            try {                       
                this.conectar.insertSQL("INSERT INTO carrinho ("
                        + "destino_cpf,"
                        + "destino_nome,"
                        + "destino_preco,"
                        + "destino_passageiros,"
                        + "destino_ida,"
                        + "destino_volta"
                    + ") VALUES ("
                        + "'" + consultaCpf + "',"
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
        
        if (LencoisIda.getDate() != null && LencoisVolta.getDate() != null){
            double val = 1990.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(LencoisIda.getDate());
            String datavolta = sdf.format(LencoisVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Lençóis Maranhenses - MA");
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
        
        if (ParintinsIda.getDate() != null && ParintinsVolta.getDate() != null){
            double val = 1349.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(ParintinsIda.getDate());
            String datavolta = sdf.format(ParintinsVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Parintins - AM");
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        QntPassageiros = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/OIAPOQUE.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 180));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("REGIÃO NORTE");

        QntPassageiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 passageiro", "2 passageiros", "3 passageiros" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LENCOIS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PARINTINS.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 570, 270, 180));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel7.setText("OIAPOQUE - AP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel9.setText("PARINTINS - AM");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 250, 50));

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("VER PREÇO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 30));

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 0));
        jButton3.setText("VER PREÇO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, -1));

        jButton4.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("VER PREÇO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 120, -1));

        jLabel6.setText("LENÇOIS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 70, 40));

        jLabel10.setText(" MARANHENSES - MA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 30));

        jLabel11.setText("IDA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 80, 30));

        jLabel12.setText("VOLTA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel13.setText("IDA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 30, -1));

        jLabel14.setText("VOLTA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel15.setText("IDA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, -1));

        jLabel16.setText("VOLTA");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, -1, -1));

        jButton5.setText("ADD CARRINHO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 120, -1));

        jButton6.setText("ADD CARRINHO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 120, -1));

        jButton7.setText("ADD CARRINHO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double preço = 1490.90;       
        
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double preço = 1349.90;       
        
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNorte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
