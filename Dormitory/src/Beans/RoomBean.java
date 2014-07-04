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
public class RoomBean {
    private int roomID;
    private String status;
    private float currentKW;
    private float currentcubicpermeter;
    private boolean paidrent;
    private boolean paidelectric;
    private boolean paidwater;

    public float getCurrentKW() {
        return currentKW;
    }

    public float getCurrentcubicpermeter() {
        return currentcubicpermeter;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getStatus() {
        return status;
    }

    public boolean isPaidelectric() {
        return paidelectric;
    }

    public boolean isPaidrent() {
        return paidrent;
    }

    public boolean isPaidwater() {
        return paidwater;
    }

    public void setPaidelectric(boolean paidelectric) {
        this.paidelectric = paidelectric;
    }

    public void setPaidrent(boolean paidrent) {
        this.paidrent = paidrent;
    }

    public void setPaidwater(boolean paidwater) {
        this.paidwater = paidwater;
    }
    
    public void setCurrentKW(float currentKW) {
        this.currentKW = currentKW;
    }

    public void setCurrentcubicpermeter(float currentcubicpermeter) {
        this.currentcubicpermeter = currentcubicpermeter;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
