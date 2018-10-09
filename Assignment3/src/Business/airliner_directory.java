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
public class airliner_directory {
    
    private ArrayList<airliner> airliner1;

    public ArrayList<airliner> getAirliner() {
        return airliner1;
    }

    public void setAirliner(ArrayList<airliner> airliner) {
        this.airliner1 = airliner;
    }
    
    public airliner_directory()
    {
        airliner1= new ArrayList<airliner>();
    }
    
    public airliner addairliner()
    {
        airliner air_liner = new airliner();
        airliner1.add(air_liner);
        return air_liner;
        
    }
    
    public void deleteairliner(airliner air_liner)
    {
        airliner1.remove(air_liner);
    }
    
    public airliner searchairliner(String airliner_name)
    {
        for(airliner air_liner:airliner1)
        {
            if(airliner_name.equals(air_liner.getAirlinerName()))
            {
                return air_liner;
            }
        }
        return null;
    }
 }
