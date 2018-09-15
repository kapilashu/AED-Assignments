/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lENOVO PC
 */
public class Person {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String DateOfBirth;
    private String Age;
    private String Height;
    private String Weight;
    private String SocialSecurityNumber;
    
    private Address address;
    
    private SavingAccount savingaccount;
    
    private CheckingAccount checkingaccount;
   
    private DriverInformation driverinformation;
    
    private MedicalRecord medicalrecord;
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SavingAccount getSavingaccount() {
        return savingaccount;
    }

    public void setSavingaccount(SavingAccount savingaccount) {
        this.savingaccount = savingaccount;
    }

    public CheckingAccount getCheckingaccount() {
        return checkingaccount;
    }

    public void setCheckingaccount(CheckingAccount checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public DriverInformation getDriverinformation() {
        return driverinformation;
    }

    public void setDriverinformation(DriverInformation driverinformation) {
        this.driverinformation = driverinformation;
    }

    public MedicalRecord getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(MedicalRecord medicalrecord) {
        this.medicalrecord = medicalrecord;
    }
    
    
    
}
