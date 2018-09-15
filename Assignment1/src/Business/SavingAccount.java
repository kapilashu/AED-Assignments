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
public class SavingAccount {
    
    private String BankName;
    private String BankRoutingNumber;
    private String BankAccountNumber;
    private String AccountType;
    private String AccountBalance;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankRoutingNumber() {
        return BankRoutingNumber;
    }

    public void setBankRoutingNumber(String BankRoutingNumber) {
        this.BankRoutingNumber = BankRoutingNumber;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(String AccountBalance) {
        this.AccountBalance = AccountBalance;
    }
    
    
}
