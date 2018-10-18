/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgencyRole;
import Business.Airliner;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Airplane;
import java.awt.CardLayout;

/**
 *
 *  @author lENOVO PC
 */
public class ViewAirliner extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirliner
     */
    private Airliner airliner;
    private JPanel userprocesscontainer;
    public ViewAirliner(JPanel userprocesscontainer,Airliner airliner) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.airliner=airliner;
        
        airlinerName.setText(airliner.getAirlinerName());
        refreshTable();
    }
    
    public void refreshTable(){
        int rowCount = airplaneCatalog_table.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airplaneCatalog_table.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Airplane ap : airliner.getAirplaneCatalog().getAirplaneCatalog()) {
            Object row[] = new Object[3];
            row[0] = ap;
            row[1] = ap.getAirlinerCode();
            row[2] = ap.getPrice();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewairlinerLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airplaneCatalog_table = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        airlinerName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));

        viewairlinerLbl.setText("View Airliner");

        airplaneCatalog_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Airplane name", "Airliner Code", "price"
            }
        ));
        jScrollPane1.setViewportView(airplaneCatalog_table);

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinerName.setText("Airplane Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewairlinerLbl)
                    .addComponent(airlinerName)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(viewairlinerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airlinerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerName;
    private javax.swing.JTable airplaneCatalog_table;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel viewairlinerLbl;
    // End of variables declaration//GEN-END:variables
}