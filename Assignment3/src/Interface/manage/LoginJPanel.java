/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manage;

import Business.airliner;
import Business.airliner_directory;
import Business.Airplane;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author lENOVO PC
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    private  airliner_directory airliner1;
    private JPanel RightJPanel;
   
    public LoginJPanel(JPanel RightjPanel, airliner_directory airliner1) {
        initComponents();
        this.airliner1=airliner1;
        this.RightJPanel=RightjPanel;
        //this.airliner1=airliner1;
        
        supplierComboBox1.removeAllItems();
       for(airliner liner : airliner1.getAirliner()) {
           supplierComboBox1.addItem(liner);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        supplierComboBox1 = new javax.swing.JComboBox();
        findbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Airliner Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Airliner Name");

        supplierComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBox1ActionPerformed(evt);
            }
        });

        findbtn.setText("GO >>");
        findbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(supplierComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(findbtn)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findbtn))
                .addContainerGap(420, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void supplierComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierComboBox1ActionPerformed

    private void findbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbtnActionPerformed
        airliner air_liner = (airliner)supplierComboBox1.getSelectedItem();
       WorkAreaJPanel w = new WorkAreaJPanel(RightJPanel, air_liner);
        RightJPanel.add("WorkAreaJPanel",w);
        CardLayout layout = (CardLayout)RightJPanel.getLayout();
        layout.next(RightJPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_findbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton findbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox1;
    // End of variables declaration//GEN-END:variables
}
