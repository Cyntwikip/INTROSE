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
public class WaterBean extends BillBean{
    
    public float currentcubicpermeter;
    public float prevcubicpermeter;
    public float pricepercubicmeter;

    @Override
    public Date getBillDate() {
        return super.getBillDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBillID() {
        return super.getBillID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRoomID() {
        return super.getRoomID(); //To change body of generated methods, choose Tools | Templates.
    }
    

    public float getCurrentcubicpermeter() {
        return currentcubicpermeter;
    }

    public float getPrevcubicpermeter() {
        return prevcubicpermeter;
    }

    public float getPricepercubicmeter() {
        return pricepercubicmeter;
    }

    @Override
    public void setBillDate(Date billDate) {
        super.setBillDate(billDate); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBillID(int billID) {
        super.setBillID(billID); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCurrentcubicpermeter(float currentcubicpermeter) {
        this.currentcubicpermeter = currentcubicpermeter;
    }

    public void setPrevcubicpermeter(float prevcubicpermeter) {
        this.prevcubicpermeter = prevcubicpermeter;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPricepercubicmeter(float pricepercubicmeter) {
        this.pricepercubicmeter = pricepercubicmeter;
    }

    @Override
    public void setRoomID(int roomID) {
        super.setRoomID(roomID); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
