package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.Destino;

public class TelaPedidos extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Destino novoDestino = new Destino();

    public TelaPedidos() {
        initComponents();
    }
    
    private void BuscarDestino(Destino novoDestino){
        this.conectar.conectaBanco();
        
        String consultaCpf = "111.111.111-11";
                
        try {
            this.conectar.executarSQL(
                   "SELECT "                    
                    + "destino_nome,"
                    + "destino_preco,"
                    + "destino_passageiros,"
                    + "destino_ida,"
                    + "destino_volta"                          
                 + " FROM"
                     + " pousar.carrinho"
                 + " WHERE"
                     + " destino_cpf = '" + consultaCpf + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                novoDestino.setLocal(this.conectar.getResultSet().getString(1));
                novoDestino.setValor(this.conectar.getResultSet().getString(2));
                novoDestino.setPassageiros(this.conectar.getResultSet().getString(3));
                novoDestino.setIda(this.conectar.getResultSet().getString(4));
                novoDestino.setVolta(this.conectar.getResultSet().getString(5));                
           }
            
//           if(novoDestino.getLocal() == ""){
//                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
//           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }finally{
            txtDestino.setText(novoDestino.getLocal());
            txtIda.setText(novoDestino.getIda());
            txtVolta.setText(novoDestino.getVolta());
            txtPassageiros.setText(novoDestino.getPassageiros());
            txtTotal.setText(novoDestino.getValor());
            txtPartida.setText("Guarulhos - SP");
            txtValpessoa.setText(novoDestino.getValor());

            this.conectar.fechaBanco();   
        }               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar7 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValpessoa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPartida = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIda = new javax.swing.JTextField();
        txtVolta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassageiros = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        ConsultaCPF = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("DETALHE DO PEDIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 81));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DEPARA2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 80));

        jLabel1.setText("PASSAGEIROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 30));
        jPanel1.add(txtValpessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 110, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 380, 20));

        jLabel2.setText("TOTAL DA COMPRA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 130, 30));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 110, 40));

        jButton1.setFont(new java.awt.Font("Gadugi", 1, 13)); // NOI18N
        jButton1.setText("FINALIZAR PAGAMENTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 715, 190, 30));

        jLabel3.setText("VALOR POR PESSOA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 120, 30));
        jPanel1.add(txtPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 110, 40));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 280, 40));

        jLabel6.setText("DESTINO ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, 30));

        jLabel7.setText("DATA DE IDA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setText("DATA DE VOLTA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        jPanel1.add(txtIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 250, 110, 40));
        jPanel1.add(txtVolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 320, 110, 40));

        jLabel9.setText("LOCAL DE PARTIDA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanel1.add(txtPassageiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 40));

        jLabel10.setText("CPF");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 380, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/QRCODE.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 80, 100));

        try {
            ConsultaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(ConsultaCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 40));

        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupafinal.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar7ActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Obrigado pela sua compra!");
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarDestino (novoDestino);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ConsultaCPF;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JToggleButton btnVoltar7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIda;
    private javax.swing.JTextField txtPartida;
    private javax.swing.JTextField txtPassageiros;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValpessoa;
    private javax.swing.JTextField txtVolta;
    // End of variables declaration//GEN-END:variables
}
