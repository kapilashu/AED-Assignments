/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.AirplaneCatalog;

/**
 *
 * @author lENOVO PC
 */
public class Customer {
   // private static int count1 = 0;
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String sex;
    private  int seetNumber=0;
    private  String seatType;

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getSeetNumber() {
        return seetNumber;
    }

    public void setSeetNumber(int seetNumber) {
        this.seetNumber = seetNumber;
    }

    
    
    

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
//    private int Id;
//    
//     public Customer(){
//        count1++;
//        Id = count1;
//    }
    
}
