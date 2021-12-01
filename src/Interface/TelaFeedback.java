package Interface;

import Conexoes.MySQL;
import javax.swing.JOptionPane;

public class TelaFeedback extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();   

    public TelaFeedback() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FeedbackGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RadioRuim = new javax.swing.JRadioButton();
        RadioNeutra = new javax.swing.JRadioButton();
        RadioBoa = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoMelhoria = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btnVoltar4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nós gostariamos de saber sua opinião");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 162, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("para podermos melhorar nosso app.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Como está sendo sua experiência?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 266, -1, -1));

        RadioRuim.setBackground(new java.awt.Color(255, 255, 255));
        FeedbackGroup.add(RadioRuim);
        RadioRuim.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        RadioRuim.setForeground(new java.awt.Color(102, 102, 102));
        RadioRuim.setText("Ruim");
        RadioRuim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioRuimActionPerformed(evt);
            }
        });
        jPanel1.add(RadioRuim, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 383, -1, -1));

        RadioNeutra.setBackground(new java.awt.Color(255, 255, 255));
        FeedbackGroup.add(RadioNeutra);
        RadioNeutra.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        RadioNeutra.setForeground(new java.awt.Color(102, 102, 102));
        RadioNeutra.setText("Neutra");
        jPanel1.add(RadioNeutra, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 383, -1, -1));

        RadioBoa.setBackground(new java.awt.Color(255, 255, 255));
        FeedbackGroup.add(RadioBoa);
        RadioBoa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        RadioBoa.setForeground(new java.awt.Color(102, 102, 102));
        RadioBoa.setText("Boa");
        jPanel1.add(RadioBoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 383, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Em que nós poderiamos melhorar?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 430, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bad.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 316, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/neutral.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 316, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/good.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 316, -1, -1));

        TextoMelhoria.setColumns(20);
        TextoMelhoria.setRows(5);
        jScrollPane1.setViewportView(TextoMelhoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 469, 334, 150));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 655, 85, 45));

        btnVoltar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 36, 51, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("SEU FEEDBACK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.conectar.conectaBanco(); 
        
        String opiniao;
        String melhoria;       
        
        if (RadioRuim.isSelected() == true){
            opiniao = "Ruim";            
            melhoria = TextoMelhoria.getText();
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO feedback ("
                + "feedback_reacao,"
                + "feedback_opiniao"
                + ") VALUES ("
                + "'" + opiniao + "',"
                + "'" + melhoria + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar feedback " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar feedback");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback!");
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }
        }
        else if(RadioNeutra.isSelected() == true){
            opiniao = "Neutra";
            melhoria = TextoMelhoria.getText();
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO feedback ("
                + "feedback_reacao,"
                + "feedback_opiniao"
                + ") VALUES ("
                + "'" + opiniao + "',"
                + "'" + melhoria + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar feedback " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar feedback");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback!");
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }
        }
        else if(RadioBoa.isSelected() == true){
            opiniao = "Boa";
            melhoria = TextoMelhoria.getText();
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO feedback ("
                + "feedback_reacao,"
                + "feedback_opiniao"
                + ") VALUES ("
                + "'" + opiniao + "',"
                + "'" + melhoria + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar feedback " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar feedback");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback!");
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }
        }             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RadioRuimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioRuimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioRuimActionPerformed

    private void btnVoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar4ActionPerformed
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose(); 
    }//GEN-LAST:event_btnVoltar4ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup FeedbackGroup;
    private javax.swing.JRadioButton RadioBoa;
    private javax.swing.JRadioButton RadioNeutra;
    private javax.swing.JRadioButton RadioRuim;
    private javax.swing.JTextArea TextoMelhoria;
    private javax.swing.JButton btnVoltar4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
