package procura;

import controle.ClienteDB;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class LocalizaCliente extends javax.swing.JInternalFrame {

    private JTextField campo;
    private JTextField campo2;

    public LocalizaCliente(JTextField campo, JTextField campo2,JScrollPane jScrollPane1, JTable tbGrid) {
        initComponents();

        this.campo = campo;
        this.campo2 = campo2;
        this.jScrollPane1 = jScrollPane1;
        this.tbGrid = tbGrid;
    }
   
    public LocalizaCliente(JTextField campo,JTextField campo2) {
        initComponents();
        this.campo = campo;
        this.campo2 = campo2;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo Cliente");
        modelo.addColumn("Nome");
        
        ClienteDB clientedb = new ClienteDB();
        ArrayList<Cliente> clientes = clientedb.getTodos();
        for (Cliente auxCliente : clientes) {
            modelo.addRow(new Object[]{auxCliente.getCli_codigo(),auxCliente.getNome()});
        }
        tbGrid.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrid = new javax.swing.JTable();

        setClosable(true);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
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
        tbGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrid);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGridMouseClicked
        // TODO add your handling code here:
        int linha = tbGrid.getSelectedRow();
        if (linha >= 0) {
            String auxCliCodigo = tbGrid.getValueAt(linha, 0).toString();
            String auxNome = tbGrid.getValueAt(linha, 1).toString();
            campo.setText(auxCliCodigo);
            campo2.setText(auxNome);
        }
    }//GEN-LAST:event_tbGridMouseClicked

private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_jScrollPane1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrid;
    // End of variables declaration//GEN-END:variables
}
