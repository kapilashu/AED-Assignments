/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import javax.swing.table.DefaultTableModel;
import Business.VitalSign;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lENOVO PC
 */
public class AbnPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnPanel
     */
   // public AbnPanel() {
        //initComponents();
    double maxbp;
    double minbp;
    private VitalSignHistory vsh;

    AbnPanel(VitalSignHistory vsh, String maxbp, String minbp) {
        initComponents();
        this.vsh=vsh;
        this.maxbp=Double.parseDouble(maxbp);
        this.minbp=Double.parseDouble(minbp);
        populateTable();
    }

      public void populateTable()
      {
          DefaultTableModel dtm= (DefaultTableModel)tblVitalSign.getModel();
          dtm.setRowCount(0);
          
          for (VitalSign vs:vsh.getAbn1List(maxbp,minbp))
          {
              Object row[]= new Object[2];
              row[0]=vs;
              row[1]=vs.getBloodPrssure();
              dtm.addRow(row);
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

        lblPulse = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSign = new javax.swing.JTable();
        txtTemperature = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        detailBtn = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        txtPulse = new javax.swing.JTextField();

        lblPulse.setText("Pulse");

        lblBloodPressure.setText("Blood Pressure");

        txtBloodPressure.setEnabled(false);

        tblVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSign);

        txtTemperature.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Abnormal Vital Sign");

        lblTemperature.setText("Temperature");

        txtDate.setEnabled(false);

        detailBtn.setText("Details");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });

        lblDate.setText("Date");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        txtPulse.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(detailBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBloodPressure)
                                    .addComponent(lblPulse)
                                    .addComponent(lblDate))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailBtn)
                    .addComponent(deleteBtn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
        // TODO add your handling code here:

//        int selectedrow = tblVitalSign.getSelectedRow();
//
//        if(selectedrow>=0)
//        {
//
//            VitalSign vs=(VitalSign)tblVitalSign.getValueAt(selectedrow,0);
//            txtBloodPressure.setText(String.valueOf(vs.getBloodPrssure()));
//            txtTemperature.setText(String.valueOf(vs.getTemperature()));
//            txtPulse.setText(String.valueOf(vs.getPulse()));
//            txtDate.setText(vs.getDate());
//
//        }
//        else
//        JOptionPane.showMessageDialog(null,"Pleas select any row");
    }//GEN-LAST:event_detailBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        int selectedrow = tblVitalSign.getSelectedRow();

        if(selectedrow>=0)
        {

            VitalSign vs=(VitalSign)tblVitalSign.getValueAt(selectedrow,0);
            vsh.deleteVitals(vs);
            JOptionPane.showMessageDialog(null,"Vital Signs has been deleted successfully");
            populateTable();

        }

        else
        JOptionPane.showMessageDialog(null,"Pleas select any row");
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JTable tblVitalSign;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}