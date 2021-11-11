package Interface;

import Model.pessoa;
import Persistencia.Conexao;
import Persistencia.ExcluirDAO;
import Persistencia.IncluirEditarDAO;
import Persistencia.PesquisaDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JFCadastro extends javax.swing.JInternalFrame {

    int acao;
    int status;
    pessoa objpes = new pessoa();
    IncluirEditarDAO IEDAO;
    ExcluirDAO EXDAO;
    PesquisaDAO PESDAO;

    public JFCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JTCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        BTPesq = new javax.swing.JButton();
        JTData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTTel = new javax.swing.JTextField();
        JRAtivo = new javax.swing.JRadioButton();
        JRInativo = new javax.swing.JRadioButton();
        JBSalvar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBNovo = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Cadastro de Clientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        JTCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCodActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cod.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome Completo:");

        JTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNomeActionPerformed(evt);
            }
        });

        BTPesq.setText("...");
        BTPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTPesqActionPerformed(evt);
            }
        });

        JTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Data de Cadastro:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("R.G.");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("C.P.F.");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        JTTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelActionPerformed(evt);
            }
        });

        JRAtivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(JRAtivo);
        JRAtivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JRAtivo.setText("Ativo");

        JRInativo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(JRInativo);
        JRInativo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JRInativo.setText("Inativo");

        JBSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBSalvar.setText("Salvar");
        JBSalvar.setEnabled(false);
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBExcluir.setText("Excluir");
        JBExcluir.setEnabled(false);
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        JBNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        JBEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBEditar.setText("Editar");
        JBEditar.setEnabled(false);
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JRInativo)
                                            .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTTel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(358, 358, 358)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTCod, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BTPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(JTData, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JBNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRAtivo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBSair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTCod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTTel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRAtivo)
                    .addComponent(JRInativo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBExcluir)
                    .addComponent(JBSalvar)
                    .addComponent(JBNovo)
                    .addComponent(JBEditar)
                    .addComponent(JBCancelar)
                    .addComponent(JBSair))
                .addGap(131, 131, 131))
        );

        setBounds(300, 20, 628, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void JTCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCodActionPerformed

    private void JTTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        JFPrincipalPousar.cadastro = true;
        JRAtivo.setSelected(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        JFPrincipalPousar.cadastro = false;
        dispose();

    }//GEN-LAST:event_JBSairActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        acao = 1;
        novo();


    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        cancelar();

    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        acao = 2;
        editar();

    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed

        if (JRAtivo.isSelected()) {
            status = 1;
        }
        if (JRInativo.isSelected()) {
            status = 0;
        }
        int cod;

        objpes = new pessoa();
        preencher_objetos();

        try {
            IEDAO = new IncluirEditarDAO();

            if (acao == 1) {
                cod = IEDAO.Incluir(objpes);
                JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                salvar();
            }

            if (acao == 2) {
                objpes.setPes_id(Integer.parseInt(JTCod.getText()));

                if (IEDAO.Editar(objpes)) {
                    JOptionPane.showMessageDialog(this, "Alterado com Sucesso!");
                    salvar();
                }

            }

            Conexao con = new Conexao();
            con.getConexaoFechar();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, "Operação Não Realizada" + error.getMessage());
        }

    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed

        if (JTCod.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código: ");
        } else {

            int codigo = Integer.parseInt(JTCod.getText());

            EXDAO = new ExcluirDAO();

            try {
                if (JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {

                    if (EXDAO.Excluir(codigo)) {
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso!");
                        cancelar();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao excluir o registro!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação Cancelada!");
                    cancelar();
                }
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(this, "Erro: Exclusão Não Realizada!" + error.getLocalizedMessage());
            }
        }

    }//GEN-LAST:event_JBExcluirActionPerformed

    private void BTPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTPesqActionPerformed

        objpes = new pessoa();

        if (JTCod.getText().equals("")) {
            
            

        }/*Chamada a tela de consulta*/ 
        else {
            objpes.setPes_id(Integer.parseInt(JTCod.getText()));

            PESDAO = new PesquisaDAO();

            try {
                if (PESDAO.PesquisaTela(objpes)) {

                    if ((objpes != null)) {
                    pesquisa();
                    }
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, "Erro Ao Pesquisar " + erro.getMessage());
            }

        }
        /*Fim do botão pesquisa*/
    }//GEN-LAST:event_BTPesqActionPerformed

    private void JTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNomeActionPerformed

    private void JTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTPesq;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBSair;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JRadioButton JRAtivo;
    private javax.swing.JRadioButton JRInativo;
    private javax.swing.JTextField JTCPF;
    private javax.swing.JTextField JTCod;
    private javax.swing.JFormattedTextField JTData;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTRG;
    private javax.swing.JTextField JTTel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void preencher_objetos() {
        objpes.setPes_nome(JTNome.getText().trim());
        objpes.setPes_rg(JTRG.getText().trim());
        objpes.setPes_cpf(JTCPF.getText());
        objpes.setPes_tel(JTTel.getText());
        objpes.setPes_status(status);
    }

    public void novo() {
        JTNome.setEditable(true);
        JTCPF.setEditable(true);
        JTRG.setEditable(true);
        JTTel.setEditable(true);
        JTCod.setEditable(false);
        JBEditar.setEnabled(true);
        JBSalvar.setEnabled(true);
        JBCancelar.setEnabled(true);
        JRAtivo.setSelected(true);
        JTCod.setText("");
        JTNome.setText("");
        JTCPF.setText("");
        JTRG.setText("");
        JTTel.setText("");

    }

    public void cancelar() {
        JTCod.setText("");
        JTNome.setText("");
        JTCPF.setText("");
        JTRG.setText("");
        JTTel.setText("");
        JTNome.setEditable(false);
        JTCPF.setEditable(false);
        JTRG.setEditable(false);
        JTTel.setEditable(false);
        JTCod.setEditable(true);
        JBEditar.setEnabled(false);
        JBSalvar.setEnabled(false);
        JBCancelar.setEnabled(false);
        JRAtivo.setSelected(false);
        JBExcluir.setEnabled(false);

    }

    public void editar() {
        JTNome.setEditable(true);
        JTCPF.setEditable(true);
        JTRG.setEditable(true);
        JTTel.setEditable(true);
        JTCod.setEditable(false);
        JBEditar.setEnabled(true);
        JBSalvar.setEnabled(true);
        JBCancelar.setEnabled(true);
        JRAtivo.setSelected(true);
        JBExcluir.setEnabled(true);
    }

    public void salvar() {
        JTNome.setEditable(false);
        JTCPF.setEditable(false);
        JTRG.setEditable(false);
        JTTel.setEditable(false);
        JTCod.setEditable(true);
        JBEditar.setEnabled(false);
        JBSalvar.setEnabled(false);
        JRAtivo.setSelected(false);

    }

    public void pesquisa() {

        JTNome.setText(objpes.getPes_nome().trim());
        JTCPF.setText(objpes.getPes_cpf().trim());
        JTRG.setText(objpes.getPes_rg().trim());
        JTTel.setText(objpes.getPes_tel().trim());
        status = objpes.getPes_status();
    
        if (status == 1) {
            JRAtivo.setSelected(true);
        }
        if (status == 0) {
            JRInativo.setSelected(true);
        }
        JBEditar.setEnabled(true);
    } /*fim de pesquisa*/
    
}
