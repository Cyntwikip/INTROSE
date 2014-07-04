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
public class Water extends Bill{
    
    public float currentcubicmeter;
    public float prevcubicmeter;
    public float pricepercubicmeter;

    public Water(float currentcubicmeter, float prevcubicmeter, float pricepercubicmeter) {
        this.currentcubicmeter = currentcubicmeter;
        this.prevcubicmeter = prevcubicmeter;
        this.pricepercubicmeter = pricepercubicmeter;
    }
    
    @Override
    public Date getBillDate() {
        return super.getBillDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBillID() {
        return super.getBillID(); //To change body of generated methods, choose Tools | Templates.
    }

    public float getCurrentcubicmeter() {
        return currentcubicmeter;
    }

    public float getPrevcubicmeter() {
        return prevcubicmeter;
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    public float getPricepercubicmeter() {
        return pricepercubicmeter;
    }

    @Override
    public int getRoomID() {
        return super.getRoomID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBillDate(Date billDate) {
        super.setBillDate(billDate); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBillID(int billID) {
        super.setBillID(billID); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCurrentcubicmeter(float currentcubicmeter) {
        this.currentcubicmeter = currentcubicmeter;
    }

    public void setPrevcubicmeter(float prevcubicmeter) {
        this.prevcubicmeter = prevcubicmeter;
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
