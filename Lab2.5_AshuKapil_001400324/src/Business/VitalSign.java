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
public class VitalSign {
    
    private double temperature;
            private double bloodPrssure;
            private int pulse;
            private String date;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPrssure() {
        return bloodPrssure;
    }

    public void setBloodPrssure(double bloodPrssure) {
        this.bloodPrssure = bloodPrssure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
            
    public String toString()
    {
        return this.date;
        
        
    }        
}