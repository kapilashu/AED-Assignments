/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Customer;

/**
 *
 * @author lENOVO PC
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerdirectory;
    
    public CustomerDirectory(){
        customerdirectory = new ArrayList<>();
    }
    
    public ArrayList<Customer> getCustomerDirectory() {
        return customerdirectory;
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerdirectory.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerdirectory.remove(customer);
    
}
}
