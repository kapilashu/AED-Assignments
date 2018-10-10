/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.AirlinerDirectory;
import UserInterface.AirlinerRole.LoginAirliner;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import UserInterface.TravelAgencyRole.TravelAgencyWorkAreaJPanel;
import Business.CustomerDirectory;


import java.awt.CardLayout;

/**
 *
 * @author lENOVO PC
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AirlinerDirectory airlinerdirectory;
    private CustomerDirectory cust1;
    
    public MainJFrame() {
        initComponents();
        airlinerdirectory = new AirlinerDirectory();
        cust1 = new CustomerDirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        travelagencyBtn = new javax.swing.JButton();
        airplanemanagerBtn = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        userprocesscontainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlpanel.setBackground(new java.awt.Color(102, 102, 102));

        travelagencyBtn.setText("Travel Agency");
        travelagencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelagencyBtnActionPerformed(evt);
            }
        });

        airplanemanagerBtn.setText("Airplane Manager");
        airplanemanagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplanemanagerBtnActionPerformed(evt);
            }
        });

        customerBtn.setText("Customer");
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airplanemanagerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelagencyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(travelagencyBtn)
                .addGap(30, 30, 30)
                .addComponent(airplanemanagerBtn)
                .addGap(33, 33, 33)
                .addComponent(customerBtn)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlpanel);

        userprocesscontainer.setBackground(new java.awt.Color(204, 0, 0));
        userprocesscontainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userprocesscontainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void travelagencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelagencyBtnActionPerformed
        // TODO add your handling code here:
        TravelAgencyWorkAreaJPanel travel_agency = new TravelAgencyWorkAreaJPanel(userprocesscontainer, airlinerdirectory);
        userprocesscontainer.add("TravelAgencyWorkAreaJPanel",travel_agency);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_travelagencyBtnActionPerformed

    private void airplanemanagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplanemanagerBtnActionPerformed
        // TODO add your handling code here:
        LoginAirliner la = new LoginAirliner(userprocesscontainer,airlinerdirectory);
        userprocesscontainer.add("LoginAirliner",la);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_airplanemanagerBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        // TODO add your handling code here:
       CustomerWorkAreaJPanel customer_workarea = new CustomerWorkAreaJPanel(userprocesscontainer, airlinerdirectory,cust1);
        userprocesscontainer.add("CustomerWorkAreaJPanel",customer_workarea);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
        
    }//GEN-LAST:event_customerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airplanemanagerBtn;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JButton customerBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton travelagencyBtn;
    private javax.swing.JPanel userprocesscontainer;
    // End of variables declaration//GEN-END:variables
}
