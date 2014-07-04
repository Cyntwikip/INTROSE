/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOInterface;

import Beans.WaterBean;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface WaterDAOInterface {
    
    public void AddWaterBillToRoom (WaterBean water, int roomID);
    
    public ArrayList<WaterBean> getAllWaterBills();
    public ArrayList<WaterBean> getAllWaterBillsByRoomId(int roomID);
    
    
}
