/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOInterface;

import Beans.ElectricBean;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface ElectricDAOInterface {
    
    public void AddElectricBillToRoom (ElectricBean electric, int roomID);
    
    public ArrayList<ElectricBean> getAllElectricBills();
    public ArrayList<ElectricBean> getAllElectriclBillsByRoomId(int roomID);
    
}
