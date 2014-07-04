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
public class TenantBean {
    private int tenantID;
    private String fname;
    private String lname;
    private int roomID;
    private int contact;
    private String address;
    private String degree;
    private String school;
    private int expectedyearofgrad;

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedyearofgrad() {
        return expectedyearofgrad;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getSchool() {
        return school;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setExpectedyearofgrad(int expectedyearofgrad) {
        this.expectedyearofgrad = expectedyearofgrad;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }
    
}
