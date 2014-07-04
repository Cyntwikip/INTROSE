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
public class Electric extends Bill {
    public float currentkw;
    public float prevKW;
    public float priceperKW;

    public Electric(float currentkw, float prevKW, float priceperKW) {
        this.currentkw = currentkw;
        this.prevKW = prevKW;
        this.priceperKW = priceperKW;
    }
    
    @Override
    public Date getBillDate() {
        return super.getBillDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBillID() {
        return super.getBillID(); //To change body of generated methods, choose Tools | Templates.
    }

    public float getCurrentkw() {
        return currentkw;
    }

    public float getPrevKW() {
        return prevKW;
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    public float getPriceperKW() {
        return priceperKW;
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

    public void setCurrentkw(float currentkw) {
        this.currentkw = currentkw;
    }

    public void setPrevKW(float prevKW) {
        this.prevKW = prevKW;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPriceperKW(float priceperKW) {
        this.priceperKW = priceperKW;
    }

    @Override
    public void setRoomID(int roomID) {
        super.setRoomID(roomID); //To change body of generated methods, choose Tools | Templates.
    }
    
}
