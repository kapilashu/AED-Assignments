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
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignHistory;
    
    public VitalSignHistory()
    {
        vitalSignHistory = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSign addVitals()
    {
            VitalSign vs = new VitalSign();
            vitalSignHistory.add(vs);
            return vs;
            
    }
    
    public void deleteVitals(VitalSign v)
    {
        vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSign> getAbn1List(double maxbp, double minbp)
    {
        ArrayList<VitalSign> abnList=new ArrayList<>();
        for (VitalSign vs:getVitalSignHistory())
        {
            if(vs.getBloodPrssure()>maxbp || vs.getBloodPrssure()<minbp) {
                abnList.add(vs);
            }
        }
        return abnList;
    }
}
