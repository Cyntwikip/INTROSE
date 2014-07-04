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
public class Bill {
    
    public int billID;
    public int roomID;
    public Date billDate;
    public double price;

    public Date getBillDate() {
        return billDate;
    }

    public int getBillID() {
        return billID;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    
}
