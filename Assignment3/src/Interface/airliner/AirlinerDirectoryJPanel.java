/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.airliner;

import Business.airliner_directory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author lENOVO PC
 */
public class AirlinerDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerDirectoryJPanel
     */
    private airliner_directory airliner1;
    private JPanel RightjPanel;
    public AirlinerDirectoryJPanel(JPanel RightjPanel,airliner_directory airliner1) {
        initComponents();
        this.airliner1=airliner1;
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
        btndirectory = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("WORK AREA OF AIRLINER");

        btndirectory.setForeground(new java.awt.Color(204, 0, 0));
        btndirectory.setText("Airliner Directory");
        btndirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btndirectory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(btndirectory)
                .addContainerGap(328, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndirectoryActionPerformed
        AirlinerManagerJPanel am = new AirlinerManagerJPanel(RightjPanel,airliner1);
        RightjPanel.add("AirlinerManager", am);
        CardLayout layout = (CardLayout)RightjPanel.getLayout();
        layout.next(RightjPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btndirectoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndirectory;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}