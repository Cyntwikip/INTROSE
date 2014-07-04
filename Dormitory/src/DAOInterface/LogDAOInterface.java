/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOInterface;

import Beans.LogBean;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface LogDAOInterface {
    
    public void addLog(LogBean log);
    
    public ArrayList<LogBean> getAllLogs();
    public ArrayList<LogBean> getAllLogsByRoomId(int roomID);
    public ArrayList<LogBean> getAllLogsByTenantID(int tenantID);
    
    public ArrayList<LogBean> getAllLogsByName(String fname, String lname);
    
    
}
