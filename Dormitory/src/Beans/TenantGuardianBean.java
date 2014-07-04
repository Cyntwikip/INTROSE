/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

/**
 *
 * @author User
 */
public class TenantGuardianBean {
    
    private int tenantID;
    private int guardianID;

    public int getGuardianID() {
        return guardianID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setGuardianID(int guardianID) {
        this.guardianID = guardianID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }
    
}
