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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerDirectory;

    
    
    public AirlinerDirectory(){
        airlinerDirectory = new ArrayList<Airliner>();
    }
    
    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }
    
    public Airliner addAirliner(){
        Airliner al = new Airliner();
        airlinerDirectory.add(al);
        return al;
    }
    
    public void deleteAirliner(Airliner al){
        airlinerDirectory.remove(al);
    }
    
    public Airliner searchAirliner(String keyword){
        for(Airliner al : airlinerDirectory){
            if(keyword.equals(al.getAirlinerName()))
            {
                return al;
            }
        }
        return null;
    }
}

