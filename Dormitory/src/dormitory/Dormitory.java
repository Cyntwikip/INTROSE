/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormitory;

import Beans.BillBean;
import Beans.ContractBean;
import Beans.ElectricBean;
import Beans.GuardianBean;
import Beans.LogBean;
import Beans.RoomBean;
import Beans.TenantBean;
import Beans.WaterBean;

/**
 *
 * @author User
 */
public class Dormitory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        BillBean b = new BillBean();
        System.out.println("bill");
        
        ContractBean cb = new ContractBean();
        System.out.println("contractbean");
        
        ElectricBean e = new ElectricBean();
        System.out.println("electric");
        
        GuardianBean gb = new GuardianBean();
        System.out.println("guardianbean");
        
        LogBean lb = new LogBean();
        System.out.println("logbean");
        
        RoomBean rb = new RoomBean();
        System.out.println("roombean");
        
        TenantBean tb = new TenantBean();
        System.out.println("tenantbean");
        
        WaterBean w = new WaterBean();
        System.out.println("water");
        
        
        
        
        
    }
    
}
