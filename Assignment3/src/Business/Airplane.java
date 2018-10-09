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
    private String departure_location;
    private int flight_number;
    private String arrival_location;
    private String preferred_time;
    private String date;

    public String getDeparture_location() {
        return departure_location;
    }

    public void setDeparture_location(String departure_location) {
        this.departure_location = departure_location;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getArrival_location() {
        return arrival_location;
    }

    public void setArrival_location(String arrival_location) {
        this.arrival_location = arrival_location;
    }

    public String getPreferred_time() {
        return preferred_time;
    }

    public void setPreferred_time(String preferred_time) {
        this.preferred_time = preferred_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

     @Override
    public String toString()
    {
        return departure_location;
    }
    
    
}
