package procura;

import controle.CidadeDB;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cidade;

public class LocalizaCidade extends javax.swing.JInternalFrame {

    private JTextField campo;
    private JTextField campo2;

    public LocalizaCidade(JTextField campo, JTextField campo2) {
        initComponents();

        this.campo = campo;
        this.campo2 = campo2;

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Sigla");
        modelo.addColumn("Nome");
        CidadeDB estadodb = new CidadeDB();
        ArrayList<Cidade> estados = estadodb.getTodos();
        for (Cidade auxEstado : estados) {
            modelo.addRow(new Object[]{auxEstado.getEst_sigla(), auxEstado.getNome()});
        }
        tbGrid.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrid = new javax.swing.JTable();

        setClosable(true);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGridMouseClicked
        // TODO add your handling code here:
        int linha = tbGrid.getSelectedRow();
        if (linha >= 0) {
            String auxSigla = tbGrid.getValueAt(linha, 0).toString();
            String auxNome = tbGrid.getValueAt(linha, 1).toString();
            campo.setText(auxSigla);
            campo2.setText(auxNome);
        }
    }//GEN-LAST:event_tbGridMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrid;
    // End of variables declaration//GEN-END:variables
}
