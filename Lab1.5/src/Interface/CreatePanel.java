/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Person;
import Business.Address;

/**
 *
 * @author lENOVO PC
 */

public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form MainJPanel
     */
    private Person person;
    public CreatePanel(Person person) {
        initComponents();
        this.person=person;
        //person=new Person();
        person.setFirstName("Ashu");
        firstnameTextField.setText(person.getFirstName());
        
        person.setLastName("Kapil");
        lastnameTextField.setText(person.getLastName());
        
        person.setDateOfBirth("25/12/1989");
        dobTextField.setText(person.getDateOfBirth());
        
        person.setStreetAddress("235 Park Drive");
        streetaddressTextField.setText(person.getStreetAddress());
        
        Address workAdress = new Address();
        workAdress.setStreetLine1("360 Huntington");
        workAdress.setStreetLine2("");
        workAdress.setCity("Boston");
        workAdress.setState("MA");
        workAdress.setZipCode("02115");
        workAdress.setCountry("USA");
        
        person.setWorkAddress(workAdress);
        wsl1TextField.setText(person.getWorkAddress().getStreetLine1());
        wsl2TextField.setText(person.getWorkAddress().getStreetLine2());
        wcityTextField.setText(person.getWorkAddress().getCity());
        wstateTextField.setText(person.getWorkAddress().getState());
        wzipcodeTextField.setText(person.getWorkAddress().getZipCode());
        wcountryTextField.setText(person.getWorkAddress().getCountry());
        
        Address localAddress = new Address();
        localAddress.setStreetLine1("235 Park Drive");
        localAddress.setStreetLine2("");
        localAddress.setCity("Boston");
        localAddress.setState("MA");
        localAddress.setZipCode("02115");
        localAddress.setCountry("USA");
        
        person.setLocalAddress(localAddress);
        lsl1TextField.setText(person.getLocalAddress().getStreetLine1());
        lsl2TextField.setText(person.getLocalAddress().getStreetLine2());
        lcityTextField.setText(person.getLocalAddress().getCity());
        lstateTextField.setText(person.getLocalAddress().getState());
        lzipcodeTextField.setText(person.getLocalAddress().getZipCode());
        lcountryTextField.setText(person.getLocalAddress().getCountry());
        
        Address sweetHomeAddress = new Address();
        sweetHomeAddress.setStreetLine1("G-138a");
        sweetHomeAddress.setStreetLine2("");
        sweetHomeAddress.setCity("Gurgaon");
        sweetHomeAddress.setState("HR");
        sweetHomeAddress.setZipCode("122017");
        sweetHomeAddress.setCountry("India");
        
        person.setSweetHomeAddress(sweetHomeAddress);
        ssl1TextField.setText(person.getSweetHomeAddress().getStreetLine1());
        ssl2TextField.setText(person.getSweetHomeAddress().getStreetLine2());
        scityTextField.setText(person.getSweetHomeAddress().getCity());
        sstateTextField.setText(person.getSweetHomeAddress().getState());
        szipcodeTextField.setText(person.getSweetHomeAddress().getZipCode());
        scountryTextField.setText(person.getSweetHomeAddress().getCountry());
        
        
        
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDateOfBirth());
        System.out.println(person.getStreetAddress());
        System.out.println(person.getWorkAddress().getStreetLine1());
        System.out.println(person.getWorkAddress().getStreetLine2());
        System.out.println(person.getWorkAddress().getCity());
        System.out.println(person.getWorkAddress().getState());
        System.out.println(person.getWorkAddress().getCountry());
        System.out.println(person.getWorkAddress().getZipCode());
        
        System.out.println(person.getLocalAddress().getStreetLine1());
        System.out.println(person.getLocalAddress().getStreetLine2());
        System.out.println(person.getLocalAddress().getCity());
        System.out.println(person.getLocalAddress().getState());
        System.out.println(person.getLocalAddress().getCountry());
        System.out.println(person.getLocalAddress().getZipCode());
        
        System.out.println(person.getSweetHomeAddress().getStreetLine1());
        System.out.println(person.getSweetHomeAddress().getStreetLine2());
        System.out.println(person.getSweetHomeAddress().getCity());
        System.out.println(person.getSweetHomeAddress().getState());
        System.out.println(person.getSweetHomeAddress().getCountry());
        System.out.println(person.getSweetHomeAddress().getZipCode());
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        streetaddressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        wsl1TextField = new javax.swing.JTextField();
        wsl2TextField = new javax.swing.JTextField();
        wcityTextField = new javax.swing.JTextField();
        wstateTextField = new javax.swing.JTextField();
        wzipcodeTextField = new javax.swing.JTextField();
        wcountryTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lsl1TextField = new javax.swing.JTextField();
        lsl2TextField = new javax.swing.JTextField();
        lcityTextField = new javax.swing.JTextField();
        lstateTextField = new javax.swing.JTextField();
        lzipcodeTextField = new javax.swing.JTextField();
        lcountryTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ssl1TextField = new javax.swing.JTextField();
        ssl2TextField = new javax.swing.JTextField();
        scityTextField = new javax.swing.JTextField();
        sstateTextField = new javax.swing.JTextField();
        szipcodeTextField = new javax.swing.JTextField();
        scountryTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Street Address");

        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("D O B (YYYY/MM/DD)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Work Address");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Local Addess");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Sweet Home Address");

        jLabel8.setText("Street Line 1");

        jLabel9.setText("Street Line 2");

        jLabel10.setText("City");

        jLabel11.setText("State");

        jLabel12.setText("Zip Code");

        jLabel13.setText("Country");

        wcityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wcityTextFieldActionPerformed(evt);
            }
        });

        wcountryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wcountryTextFieldActionPerformed(evt);
            }
        });

        jLabel14.setText("Street Line 1");

        jLabel15.setText("Street Line 2");

        jLabel16.setText("City");

        jLabel17.setText("State");

        jLabel18.setText("Zip Code");

        jLabel19.setText("Country");

        lsl2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsl2TextFieldActionPerformed(evt);
            }
        });

        lcityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcityTextFieldActionPerformed(evt);
            }
        });

        lstateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstateTextFieldActionPerformed(evt);
            }
        });

        jLabel20.setText("Street Line 1");

        jLabel21.setText("Street Line 2");

        jLabel22.setText("City");

        jLabel23.setText("State");

        jLabel24.setText("Zip Code");

        jLabel25.setText("Country");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("    View Your Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wsl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wsl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wcityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wzipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wcountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lcountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lzipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lcityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lsl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lsl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel7)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnameTextField)
                                    .addComponent(lastnameTextField))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(szipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(streetaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(wsl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lsl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(ssl1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(wsl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(lsl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(ssl2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(wcityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(lcityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(wstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(lstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(sstateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(wzipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(lzipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(szipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(wcountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(lcountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(scountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(scityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void wcityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wcityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wcityTextFieldActionPerformed

    private void wcountryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wcountryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wcountryTextFieldActionPerformed

    private void lsl2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsl2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lsl2TextFieldActionPerformed

    private void lcityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lcityTextFieldActionPerformed

    private void lstateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstateTextFieldActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField lcityTextField;
    private javax.swing.JTextField lcountryTextField;
    private javax.swing.JTextField lsl1TextField;
    private javax.swing.JTextField lsl2TextField;
    private javax.swing.JTextField lstateTextField;
    private javax.swing.JTextField lzipcodeTextField;
    private javax.swing.JTextField scityTextField;
    private javax.swing.JTextField scountryTextField;
    private javax.swing.JTextField ssl1TextField;
    private javax.swing.JTextField ssl2TextField;
    private javax.swing.JTextField sstateTextField;
    private javax.swing.JTextField streetaddressTextField;
    private javax.swing.JTextField szipcodeTextField;
    private javax.swing.JTextField wcityTextField;
    private javax.swing.JTextField wcountryTextField;
    private javax.swing.JTextField wsl1TextField;
    private javax.swing.JTextField wsl2TextField;
    private javax.swing.JTextField wstateTextField;
    private javax.swing.JTextField wzipcodeTextField;
    // End of variables declaration//GEN-END:variables
}
