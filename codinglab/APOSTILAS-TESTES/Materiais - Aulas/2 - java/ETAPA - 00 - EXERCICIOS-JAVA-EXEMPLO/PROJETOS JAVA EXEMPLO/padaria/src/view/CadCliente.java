
package view;

import procura.LocalizaEstado;
import controle.ClienteDB;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import procura.LocalizaTelefone;

/**
 *
 * @author Gelvazio
 */
public class CadCliente extends javax.swing.JInternalFrame {

 
    public CadCliente() {
        initComponents();
        //atualizarTela();
    }

   
    @SuppressWarnings("unchecked")
   private void atualizarTela(boolean verificaConsulta){
        JComboBox combo = new JComboBox();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nome");  
        modelo.addColumn("Email");
        modelo.addColumn("DataNascimento"); 
        modelo.addColumn("Sexo");
        modelo.addColumn("Pai");
        modelo.addColumn("Mae");
        modelo.addColumn("Cidade"); 
        modelo.addColumn("Bairro");
        modelo.addColumn("Endereco"); 
        modelo.addColumn("Numero");
        modelo.addColumn("Numero");
        
        ClienteDB clientedb = new ClienteDB();
        ArrayList<Cliente> clientes = new ArrayList();
        if (verificaConsulta == true){
            clientes = clientedb.getConsulta(edtBusca.getText());
        }else{
        clientes = clientedb.getTodos();
        }
        for (Cliente auxCliente : clientes){
            modelo.addRow(new Object[] {auxCliente.getCli_codigo(),auxCliente.getNome(),auxCliente.getEmail(),auxCliente.getDatanascimento(),auxCliente.getSexo(),auxCliente.getEmail(),auxCliente.getPai(),auxCliente.getMae(),auxCliente.getCid_codigo(),auxCliente.getBairro(),auxCliente.getEndereco(),auxCliente.getEnd_numero()});            
            combo.addItem(auxCliente);
        }        
        tbGrid.setModel(modelo);
        int registros = tbGrid.getRowCount();
        if (registros > 0){
            tbGrid.setRowSelectionInterval(0,0);
            Object auxCli_Codigo = tbGrid.getValueAt(0, 0);
            Object auxNome = tbGrid.getValueAt(0, 1);
            Object auxSexo = tbGrid.getValueAt(0, 2);
            Object auxEndereco = tbGrid.getValueAt(0, 3);
            Object auxEnd_numero = tbGrid.getValueAt(0, 4);
            Object auxBairro = tbGrid.getValueAt(0, 5);
            Object auxCid_Codigo = tbGrid.getValueAt(0, 6);
            Object auxEmail = tbGrid.getValueAt(0, 7);
            Object auxTelefone = tbGrid.getValueAt(0, 8);
            Object auxDataNascimento = tbGrid.getValueAt(0, 9);
            Object auxPai = tbGrid.getValueAt(0, 10);
            Object auxMae = tbGrid.getValueAt(0, 11);

            edtCodigo.setText(auxCli_Codigo.toString());
            edtNome.setText(auxNome.toString());
            edtSexo.setText(auxSexo.toString());
            edtEndereco.setText(auxEndereco.toString());
            edtNumero.setText(auxEnd_numero.toString());
            edtBairro.setText(auxBairro.toString());
            edtCidade.setText(auxCid_Codigo.toString());
            edtEmail.setText(auxEmail.toString());
            edtTelefone.setText(auxTelefone.toString());
            edtNascimento.setText(auxDataNascimento.toString());
            edtPai.setText(auxPai.toString());
            edtMae.setText(auxMae.toString());   
        }     
        
    }

                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrid = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edtPai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edtMae = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edtNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        edtNascimento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edtSexo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edtTelefone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        edtCidade = new javax.swing.JTextField();
        edtNomeCidade = new javax.swing.JTextField();
        btnLocalizarEstado = new javax.swing.JButton();
        btnLocalizaTelefone = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        edtBusca = new javax.swing.JTextField();

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");

        btnProximo.setText("Próximo");

        btnUltimo.setText("Último");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tbGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbGrid);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registros", jPanel3);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel4.setText("E-mail");

        jLabel6.setText(" Pai");

        jLabel7.setText(" Mae");

        jLabel8.setText("Bairro");

        edtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBairroActionPerformed(evt);
            }
        });

        jLabel9.setText("Data Nascimento");

        jLabel10.setText("Numero");

        jLabel11.setText("Endereco");

        jLabel12.setText("Sexo");

        jLabel13.setText("Telefone");

        jLabel14.setText("Cidade");

        edtNomeCidade.setEditable(false);

        btnLocalizarEstado.setText("Localizar");
        btnLocalizarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarEstadoActionPerformed(evt);
            }
        });

        btnLocalizaTelefone.setText("Localizar");
        btnLocalizaTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizaTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                .addComponent(edtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtMae)
                                .addComponent(edtPai, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(edtNomeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnLocalizarEstado)
                                            .addComponent(btnLocalizaTelefone)))))
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(372, 372, 372))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizaTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(edtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalhes", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo)
                        .addGap(278, 278, 278)
                        .addComponent(btnAtualizar)))
                .addGap(481, 481, 481))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        edtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtBuscaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(jLabel3)
                    .addComponent(edtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void edtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBairroActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_edtBairroActionPerformed

private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
// TODO add your handling code here:
     int resposta =  JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Cliente?");
        if (resposta == JOptionPane.YES_OPTION){
            ClienteDB clientedb = new ClienteDB();
            int auxCli_Codigo = Integer.parseInt(edtCodigo.getText());
            if (clientedb.excluirCliente(auxCli_Codigo)){
               JOptionPane.showMessageDialog(null,"Exclusão efetuada com sucesso!"); 
            }
            //JOptionPane.showMessageDialog(null,"Clicou em sim");
        }
       // atualizarTela(false);
}//GEN-LAST:event_btnExcluirActionPerformed

private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
// TODO add your handling code here:
    jTabbedPane1.setSelectedIndex(1);
        edtCodigo.setText("");
        edtNome.setText("");  
        edtEmail.setText("");
        edtTelefone.setText("");
        edtNascimento.setText("");
        edtSexo.setText("");
        edtPai.setText("");
        edtMae.setText("");
        edtCidade.setText("");
        edtBairro.setText("");
        edtEndereco.setText("");
        edtNumero.setText("");
        edtCodigo.grabFocus();
     
}//GEN-LAST:event_btnNovoActionPerformed

private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
// TODO add your handling code here:
    //
    
    atualizarTela(true);
}//GEN-LAST:event_btnAtualizarActionPerformed

private void edtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscaKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == 10)
        atualizarTela(true);
}//GEN-LAST:event_edtBuscaKeyPressed

private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
// TODO add your handling code here:
      int registros = tbGrid.getRowCount();
        if (registros > 0){
            tbGrid.setRowSelectionInterval(0, 0);
            Object auxCli_Codigo = tbGrid.getValueAt(0, 0);
            Object auxNome = tbGrid.getValueAt(0, 1);
            Object auxSexo = tbGrid.getValueAt(0, 2);
            Object auxEndereco = tbGrid.getValueAt(0, 3);
            Object auxEnd_numero = tbGrid.getValueAt(0, 4);
            Object auxBairro = tbGrid.getValueAt(0, 5);
            Object auxCid_Codigo = tbGrid.getValueAt(0, 6);
            Object auxEmail = tbGrid.getValueAt(0, 7);
            Object auxTelefone = tbGrid.getValueAt(0, 8);
            Object auxDataNascimento = tbGrid.getValueAt(0, 9);
            Object auxPai = tbGrid.getValueAt(0, 10);
            Object auxMae = tbGrid.getValueAt(0, 11);
           

            edtCodigo.setText(auxCli_Codigo.toString());
            edtNome.setText(auxNome.toString());
            edtSexo.setText(auxSexo.toString());
            edtEndereco.setText(auxEndereco.toString());
            edtNumero.setText(auxEnd_numero.toString());
            edtBairro.setText(auxBairro.toString());
            edtCidade.setText(auxCid_Codigo.toString());
            edtEmail.setText(auxEmail.toString());
            edtTelefone.setText(auxTelefone.toString());
            edtNascimento.setText(auxDataNascimento.toString());
            edtPai.setText(auxPai.toString());
            edtMae.setText(auxMae.toString()); 
        }
   
}//GEN-LAST:event_btnPrimeiroActionPerformed

private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        ClienteDB clientedb = new ClienteDB();
        int auxCli_Codigo = Integer.parseInt(edtCodigo.getText());
        String auxNome = edtNome.getText();
        String auxPai = edtPai.getText();
        String auxEmail = edtEmail.getText();
        String auxMae = edtMae.getText();
        String auxBairro = edtBairro.getText();
        int auxDataNascimento = Integer.parseInt(edtNascimento.getText());
        int auxEnd_numero = Integer.parseInt(edtNumero.getText());
        String auxEndereco = edtEndereco.getText();
        String auxSexo = edtSexo.getText();
        int auxTelefone = Integer.parseInt(edtTelefone.getText());
        int auxCid_Codigo = Integer.parseInt(edtCidade.getText());
        
        
        if (clientedb.getCliente(auxCli_Codigo)){
           //Alteração                       
           Cliente cliente = new Cliente(auxCli_Codigo, auxNome, auxSexo, auxEndereco, auxEnd_numero, auxBairro, auxCid_Codigo, auxEmail, auxTelefone, auxDataNascimento, auxPai, auxMae);
           if (clientedb.alterarCliente(cliente)){
              JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso!"); 
           }else{
              JOptionPane.showMessageDialog(null,"Não foi possível efetuar a alteração!"); 
           }           
           atualizarTela(false);
        }else{
           Cliente cliente = new Cliente(auxCli_Codigo, auxNome, auxSexo, auxEndereco, auxEnd_numero, auxBairro, auxCid_Codigo, auxEmail, auxTelefone, auxDataNascimento, auxPai, auxMae);
          
           if (clientedb.inserirCliente(cliente)){
              JOptionPane.showMessageDialog(null,"Inclusão realizada com sucesso!"); 
           }else{
              JOptionPane.showMessageDialog(null,"Não foi possível efetuar a inclusão!"); 
           } 
        atualizarTela(false);
        }
}//GEN-LAST:event_btnGravarActionPerformed

private void btnLocalizarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarEstadoActionPerformed
        // TODO add your handling code here:
        LocalizaEstado form = new LocalizaEstado(edtCidade,edtNomeCidade);
        this.getDesktopPane().add(form);
        form.setVisible(true);
}//GEN-LAST:event_btnLocalizarEstadoActionPerformed

private void btnLocalizaTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizaTelefoneActionPerformed
// TODO add your handling code here:
        LocalizaTelefone form = new LocalizaTelefone(edtNome,edtTelefone);
        this.getDesktopPane().add(form);
        form.setVisible(true);
}//GEN-LAST:event_btnLocalizaTelefoneActionPerformed

   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLocalizaTelefone;
    private javax.swing.JButton btnLocalizarEstado;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JTextField edtBusca;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtMae;
    private javax.swing.JTextField edtNascimento;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNomeCidade;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtPai;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbGrid;
    // End of variables declaration//GEN-END:variables
}
