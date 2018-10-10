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
public class AirplaneCatalog {
    private ArrayList<Airplane> airplaneCatalog;
    
    public AirplaneCatalog()
    {
        airplaneCatalog = new ArrayList<Airplane>();
        
    }
    
    public ArrayList<Airplane> getAirplaneCatalog() {
        return airplaneCatalog;
    }
    public Airplane addAirplane(){
        Airplane ap = new Airplane();
        airplaneCatalog.add(ap);
        return ap;
    }
    
    public void deleteAirplane(Airplane ap){
        airplaneCatalog.remove(ap);
    }
    public Airplane searchAirplane(int id){
        for(Airplane ap:airplaneCatalog ){
            if(ap.getAirlinerCode()== id)
            {
                return ap;
            }
        }
        return null;
    }
    
}

