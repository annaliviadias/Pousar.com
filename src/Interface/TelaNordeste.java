package Interface;

import Conexoes.MySQL;
import Objetos.Destino;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import javax.swing.JOptionPane;

public class TelaNordeste extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Destino novoDestino = new Destino();
    DecimalFormat dFormatter = new DecimalFormat("####.##");

    public TelaNordeste() {
        initComponents();
    }

    private void RegistraDestino (Destino novoDestino){
        this.conectar.conectaBanco();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        
        if (SalvadorIda.getDate() != null && SalvadorVolta.getDate() != null){
            double val = 899.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(SalvadorIda.getDate());
            String datavolta = sdf.format(SalvadorVolta.getDate());
                       
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Salvador - BA");
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
        
        if (JericoacoaraIda.getDate() != null && JericoacoaraVolta.getDate() != null){
            double val = 1899.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(JericoacoaraIda.getDate());
            String datavolta = sdf.format(JericoacoaraVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Jericoacoara - CE");
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
        
        if (NatalIda.getDate() != null && NatalVolta.getDate() != null){
            double val = 2639.90;
            String valfinal = dFormatter.format(val);
            String dataida = sdf.format(NatalIda.getDate());
            String datavolta = sdf.format(NatalVolta.getDate());
            
            novoDestino.setIda(dataida);
            novoDestino.setVolta(datavolta);
            novoDestino.setLocal("Natal - RN");
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

        jButton8 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton8.setText("ADD CARRINHO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("REGIÃO NORDESTE");

        QntPassageiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 passageiro", "2 passageiros", "3 passageiros" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QntPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SALVADOR.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JERI.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NATAL.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel5.setText("SALVADOR - BA");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel6.setText("JERICOACOARA - CE");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOCAL.png"))); // NOI18N
        jLabel7.setText("NATAL - RN");

        jButton2.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("VER PREÇO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 0));
        jButton3.setText("VER PREÇO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("VER PREÇO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("IDA");

        jLabel9.setText("VOLTA");

        jLabel10.setText("IDA");

        jLabel11.setText("VOLTA");

        jLabel12.setText("IDA");

        jLabel13.setText("VOLTA");

        jButton5.setText("ADD CARRINHO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("ADD CARRINHO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("ADD CARRINHO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton7)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel13))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            TelaPacotes tela = new TelaPacotes();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double preço = 899.90;       
        
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
        double preço = 2639.90;       
        
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegistraDestino (novoDestino);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNordeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNordeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNordeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNordeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNordeste().setVisible(true);
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
    private javax.swing.JButton jButton8;
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
