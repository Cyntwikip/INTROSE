/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import java.security.Timestamp;

/**
 *
 * @author User
 */
public class LogBean {
    private int tenantID;
    private Timestamp in;
    private Timestamp out;

    public Timestamp getIn() {
        return in;
    }

    public Timestamp getOut() {
        return out;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setIn(Timestamp in) {
        this.in = in;
    }

    public void setOut(Timestamp out) {
        this.out = out;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }
}
