/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOInterface;

import Beans.TenantBean;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface TenantDAOInterface {
    public void addTenant(TenantBean tenant);
    
    public void getTenantById(int tenantid);
    public ArrayList<TenantBean> getAllTenants();
    public ArrayList<TenantBean> getTenantByName(String fname, String lname); //inassume ko lang what if may magkapareho lang ng name :)
   // public ArrayList<TenantBean> getTenantByDegree(String degree);
    public ArrayList<TenantBean> getTenantByExpectedYearofGrad (int year);
   // public ArrayList<TenantBean> getTenantBySchool(String school);
   // public ArrayList<TenantBean> getTenantByContact(int contact);
    public ArrayList<TenantBean> getTenantByRoomID(int roomID);
    
    public void editTenant(TenantBean tenant, String fname, String lname);
    public void deleteTenant(int tenantID);
    
}
