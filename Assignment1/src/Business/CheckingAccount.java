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
public class CheckingAccount {
    
   private String  CheckingBankName;
    private String CheckingBankRoutingNumber;
    private String CheckingBankAccountNumber;
    private String CheckingAccountType;
    private String CheckingAccountBalance; 

    public String getCheckingBankName() {
        return CheckingBankName;
    }

    public void setCheckingBankName(String CheckingBankName) {
        this.CheckingBankName = CheckingBankName;
    }

    public String getCheckingBankRoutingNumber() {
        return CheckingBankRoutingNumber;
    }

    public void setCheckingBankRoutingNumber(String CheckingBankRoutingNumber) {
        this.CheckingBankRoutingNumber = CheckingBankRoutingNumber;
    }

    public String getCheckingBankAccountNumber() {
        return CheckingBankAccountNumber;
    }

    public void setCheckingBankAccountNumber(String CheckingBankAccountNumber) {
        this.CheckingBankAccountNumber = CheckingBankAccountNumber;
    }

    public String getCheckingAccountType() {
        return CheckingAccountType;
    }

    public void setCheckingAccountType(String CheckingAccountType) {
        this.CheckingAccountType = CheckingAccountType;
    }

    public String getCheckingAccountBalance() {
        return CheckingAccountBalance;
    }

    public void setCheckingAccountBalance(String CheckingAccountBalance) {
        this.CheckingAccountBalance = CheckingAccountBalance;
    }
    
}
