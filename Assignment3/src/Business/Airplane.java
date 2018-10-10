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
public class Airplane {
   private static int count = 0;
    private String AirplaneName;
    private int price;
    private String source;
   private String destination;
    private String date;
    private String preferred;
    private String seatType;
     private int AirlinerCode;
     
     private int seetNumber=1;

    public int getSeetNumber() {
        return seetNumber;
    }

    public void setSeetNumber(int seetNumber) {
        this.seetNumber = seetNumber;
    }

    public int getAirlinerCode() {
        return AirlinerCode;
    }

    public void setAirlinerCode(int AirlinerCode) {
        this.AirlinerCode = AirlinerCode;
    }

    
     
    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }
   

    
    
    public Airplane(){
        count++;
        AirlinerCode=count;
    }
    

    public String getAirplaneName() {
        return AirplaneName;
    }

    public void setAirplaneName(String AirplaneName) {
        this.AirplaneName = AirplaneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void seetInc(){
        seetNumber++;
    }

    
    @Override
    public String toString() {
        return AirplaneName;
    }
    
}
