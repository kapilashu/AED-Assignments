/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AirlinerRole;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Airliner;

/**
 *
 * @author lENOVO PC
 */
public class LoginAirliner extends javax.swing.JPanel {

    /**
     * Creates new form LoginAirliner
     */
    private JPanel userprocesscontainer;
    private AirlinerDirectory airlinerdirectory;
    public LoginAirliner(JPanel userprocesscontainer,AirlinerDirectory airlinerdirectory) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.airlinerdirectory=airlinerdirectory;
        
        airlinerComboBox.removeAllItems();
       for(Airliner airliner : airlinerdirectory.getAirlinerDirectory()) {
           airlinerComboBox.addItem(airliner);
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

        airlinerloginLbl = new javax.swing.JLabel();
        airlinernameLbl = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        findButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 51));

        airlinerloginLbl.setText("Airliner Login");

        airlinernameLbl.setText("Airliner Name");

        airlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        findButton1.setText("Go>>");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerloginLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(airlinernameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(findButton1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(airlinerloginLbl)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinernameLbl)
                    .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner)airlinerComboBox.getSelectedItem();
       AirlinerWorkAreaJPanel swajp = new AirlinerWorkAreaJPanel(userprocesscontainer, airliner);
        userprocesscontainer.add("SupplierWorkAreaJPanel",swajp);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_findButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JLabel airlinerloginLbl;
    private javax.swing.JLabel airlinernameLbl;
    private javax.swing.JButton findButton1;
    // End of variables declaration//GEN-END:variables
}
