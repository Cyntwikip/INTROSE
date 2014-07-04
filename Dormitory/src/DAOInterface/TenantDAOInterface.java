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
    
    public TenantBean getTenantById(int tenantID);
    public ArrayList<TenantBean> getTenantByFirstname(String fname);
    public ArrayList<TenantBean> getTenantByLastname(String lname);
    public ArrayList<TenantBean> getTenantByRoomid(int roomid);
    public ArrayList<TenantBean> getTenantBySchool(String school);
    public ArrayList<TenantBean> getTenantByDegree(String degree);
    public ArrayList<TenantBean> getTenantByAddress(String address);
    public ArrayList<TenantBean> getTenantByExpectedYearofGrad (int year);
    public TenantBean getTenantByContact (int contact);
    
    public void editTenant (TenantBean tenant);
    
    public void deleteTenantbyId(int tenantID);
    public void deleteTenantbyName(String fname, String lname);
}
