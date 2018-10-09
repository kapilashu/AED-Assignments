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
public class airliner {
    private String airlinerName;
    private Airplane_directory cd;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Airplane_directory getCd() {
        return cd;
    }

    public void setCd(Airplane_directory cd) {
        this.cd = cd;
    }
    
    public airliner()
    {
        cd = new Airplane_directory();
    }
    
    @Override
    public String toString()
    {
        return airlinerName;
    }
}
