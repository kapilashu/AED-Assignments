/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Airliner;
import Business.Airplane;
import Business.Customer;
import UserInterface.AirlinerRole.SearchForAirplaneJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 *  @author lENOVO PC
 */
public class SeatSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeatSelectionJPanel
     */
    private Customer customer;
    private JPanel userprocesscontainer;
    private Airplane airplane;
    public SeatSelectionJPanel(JPanel userprocesscontainer,Airplane airplane,Customer customer) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.airplane=airplane;
        this.customer=customer;
        
        seetnumber_Textfield.setText(String.valueOf(airplane.getSeetNumber()));
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatselectionLbl = new javax.swing.JLabel();
        seetnumberLbl = new javax.swing.JLabel();
        seattypeLbl = new javax.swing.JLabel();
        seetnumber_Textfield = new javax.swing.JTextField();
        seattypeCombobox = new javax.swing.JComboBox();
        chooseandconfirmBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));

        seatselectionLbl.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        seatselectionLbl.setText("Seat Selection");

        seetnumberLbl.setText("Seat Number");

        seattypeLbl.setText("Seat Type");

        seetnumber_Textfield.setEditable(false);

        seattypeCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Window", "Middle", "Aisle", " " }));

        chooseandconfirmBtn.setText("Choose and Confirm");
        chooseandconfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseandconfirmBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seetnumberLbl)
                            .addComponent(seattypeLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seattypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seetnumber_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(seatselectionLbl)
                    .addComponent(chooseandconfirmBtn))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(seatselectionLbl)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seetnumberLbl)
                    .addComponent(seetnumber_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seattypeLbl)
                    .addComponent(seattypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chooseandconfirmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userprocesscontainer.remove(this);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void chooseandconfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseandconfirmBtnActionPerformed
        // TODO add your handling code here:
        customer.setSeetNumber(Integer.parseInt(seetnumber_Textfield.getText()));
        customer.setSeatType(String.valueOf(seattypeCombobox.getSelectedItem()));
        airplane.seetInc();
        BookingConfirmation booking_confirmation = new BookingConfirmation(userprocesscontainer,airplane,customer);
        userprocesscontainer.add("BookingConfirmation", booking_confirmation);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
        
        
        
    }//GEN-LAST:event_chooseandconfirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton chooseandconfirmBtn;
    private javax.swing.JLabel seatselectionLbl;
    private javax.swing.JComboBox seattypeCombobox;
    private javax.swing.JLabel seattypeLbl;
    private javax.swing.JLabel seetnumberLbl;
    private javax.swing.JTextField seetnumber_Textfield;
    // End of variables declaration//GEN-END:variables
}
