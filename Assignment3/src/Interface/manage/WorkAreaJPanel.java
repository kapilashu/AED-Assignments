/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manage;

import Business.airliner;
import Business.airliner_directory;
import Business.Airplane;
import Interface.airliner.AirlinerManagerJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author lENOVO PC
 */
public class WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
    private airliner air_liner;
    private JPanel RightjPanel;
    public WorkAreaJPanel(JPanel RightjPanel,airliner air_liner) {
        initComponents();
        this.air_liner=air_liner;
        this.RightjPanel=RightjPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Work Area of Airliner");

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Airliner Catalog >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(managePButton))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(managePButton)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        ManageJPanel l = new ManageJPanel(RightjPanel, air_liner);
        RightjPanel.add("LoginJPanel", l);
        CardLayout layout = (CardLayout)RightjPanel.getLayout();
        layout.next(RightjPanel);
        // TODO add your handling code here:
       
    }//GEN-LAST:event_managePButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
}