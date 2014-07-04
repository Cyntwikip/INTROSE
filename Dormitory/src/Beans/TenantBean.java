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
    private int tenantid;
    // pano yung sa image :))
    private String fname;
    private String lname;
    private String address;
    private int contact;
    private String school;
    private String degree;
    private int roomID;
    private int expectedyearofgraduation;

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedyearofgraduation() {
        return expectedyearofgraduation;
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

    public int getTenantid() {
        return tenantid;
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

    public void setExpectedyearofgraduation(int expectedyearofgraduation) {
        this.expectedyearofgraduation = expectedyearofgraduation;
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

    public void setTenantid(int tenantid) {
        this.tenantid = tenantid;
    }
    
    
}
