/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import java.util.Date;

/**
 *
 * @author User
 */
public class ContractBean {
    
     private int tenantID;
     private String status;
     private Date yearofentry;
     private Date yearofexit;

    public String getStatus() {
        return status;
    }

    public int getTenantID() {
        return tenantID;
    }

    public Date getYearofentry() {
        return yearofentry;
    }

    public Date getYearofexit() {
        return yearofexit;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public void setYearofentry(Date yearofentry) {
        this.yearofentry = yearofentry;
    }

    public void setYearofexit(Date yearofexit) {
        this.yearofexit = yearofexit;
    }
}
