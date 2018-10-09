/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;


/**
 *
 * @author lENOVO PC
 */
public class CustomerDirectory {
    
    
    private ArrayList<Person>custdir;

    public ArrayList<Person> getPlist() {
        return custdir;
    }

    public void setPlist(ArrayList<Person> plist) {
        this.custdir = plist;
    }
        
     
    public CustomerDirectory(){
   
        custdir = new ArrayList<Person>();
    }
    
    public void addPerson(Person p)
    {
        this.custdir.add(p);
        
    }
    
}
