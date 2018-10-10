/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Airplane;
import Business.AirplaneCatalog;

/**
 *
 * @author lENOVO PC
 */
public class Airliner {
    private String airlinerName;
    private AirplaneCatalog airplaneCatalog;
    
    
    public Airliner() {
        airplaneCatalog = new AirplaneCatalog();
    }

    public AirplaneCatalog getAirplaneCatalog() {
        return airplaneCatalog;
    }

    public void setAirplaneCatalog(AirplaneCatalog airplaneCatalog) {
        this.airplaneCatalog = airplaneCatalog;
    }
    
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    @Override
    public String toString() {
        return airlinerName;
    }
   
}
