package Interface;

import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Objetos.Clientes;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;

public class TelaCadastro extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    Clientes novoCliente = new Clientes();
    
    public TelaCadastro() {
        initComponents();
    } 

    private void CadastraCliente(Clientes novoCliente) {
        this.conectar.conectaBanco();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String datec = sdf.format(data_Cadastro.getDate());
        String daten = sdf.format(data_Nasc.getDate());
        
        novoCliente.setDatac(datec);
        novoCliente.setSexo((String) txtSexo.getSelectedItem());
        novoCliente.setNome(txtNome.getText());
        novoCliente.setTelefone(txtCelular.getText());
        novoCliente.setCpf(txtCPF.getText());
        novoCliente.setDatan(daten);
        novoCliente.setCep(txtCEP.getText());
        novoCliente.setEmail(txtEmail.getText());
        novoCliente.setEndereco(txtEnd.getText());
        novoCliente.setNo(txtNumCasa.getText());
        novoCliente.setCompl(txtCompl.getText());
        novoCliente.setBairro(txtBairro.getText());
        novoCliente.setCidade(txtCidade.getText());
        novoCliente.setEstado((String) txtEstado.getSelectedItem());
        novoCliente.setUsuario(txtUsuario.getText());
        novoCliente.setSenha(txtSenha.getText());
        
        
        try {                        
            this.conectar.insertSQL("INSERT INTO cadastro_clientes ("
                    + "cliente_datacad,"
                    + "cliente_sexo,"
                    + "cliente_nome,"
                    + "cliente_telefone,"
                    + "cliente_cpf,"
                    + "cliente_datanasci,"
                    + "cliente_cep,"
                    + "cliente_email,"
                    + "cliente_endereço,"
                    + "cliente_número,"
                    + "cliente_complemento,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado,"
                    + "cliente_usuario,"
                    + "cliente_senha"
                + ") VALUES ("
                    + "'" + novoCliente.getDatac() + "',"
                    + "'" + novoCliente.getSexo() + "',"
                    + "'" + novoCliente.getNome() + "',"
                    + "'" + novoCliente.getTelefone() + "',"
                    + "'" + novoCliente.getCpf() + "',"
                    + "'" + novoCliente.getDatan() + "',"
                    + "'" + novoCliente.getCep() + "',"
                    + "'" + novoCliente.getEmail() + "',"
                    + "'" + novoCliente.getEndereco() + "',"
                    + "'" + novoCliente.getNo() + "',"
                    + "'" + novoCliente.getCompl() + "',"
                    + "'" + novoCliente.getBairro() + "',"
                    + "'" + novoCliente.getCidade() + "',"
                    + "'" + novoCliente.getEstado() + "',"
                    + "'" + novoCliente.getUsuario() + "',"
                    + "'" + novoCliente.getSenha() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Obrigado por realizar seu cadastro!");
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        btnVoltar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtNumCasa = new javax.swing.JTextField();
        txtCompl = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JComboBox<>();
        btnSalvar_Cliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        data_Cadastro = new com.toedter.calendar.JDateChooser();
        data_Nasc = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE CLIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(375, 667));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel3.setText("Data de Cadastro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel6.setText("Data de Nascimento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel8.setText("CPF");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, 40));
        jPanel1.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 340, 40));

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Feminino", "Masculino" }));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 40));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 40));

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 40));

        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 52, 50));

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel11.setText("Endereço");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 340, 40));

        jLabel12.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel12.setText("No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel1.setText("Compl.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel13.setText("Bairro");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel14.setText("Cidade");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel15.setText("Estado");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel16.setText("CEP");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 170, 40));

        txtNumCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCasaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 60, 40));
        jPanel1.add(txtCompl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 80, 40));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 160, 40));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 250, 40));

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 80, 40));

        btnSalvar_Cliente.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        btnSalvar_Cliente.setText("SALVAR");
        btnSalvar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 100, 60));

        jLabel17.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 204));
        jLabel17.setText("CADASTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 70));

        data_Cadastro.setDateFormatString("y-M-d");
        jPanel1.add(data_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 40));

        data_Nasc.setDateFormatString("y-M-d");
        jPanel1.add(data_Nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 40));

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel9.setText("Usuário");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 160, 40));

        jLabel18.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel18.setText("Senha");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, -1, -1));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_ClienteActionPerformed
        CadastraCliente(novoCliente);
    }//GEN-LAST:event_btnSalvar_ClienteActionPerformed

    private void txtNumCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCasaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_txtNumCasaKeyTyped

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar_Cliente;
    private javax.swing.JButton btnVoltar1;
    private com.toedter.calendar.JDateChooser data_Cadastro;
    private com.toedter.calendar.JDateChooser data_Nasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCompl;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumCasa;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
