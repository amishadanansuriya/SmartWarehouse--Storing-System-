/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classess;

/**
 *
 * @author DELL
 */
public class Client {
    private String clientNo;
    private String name;
    private String address;
    private String teleNo;
    private String mobile;
    private String email;
    private String remark;
    
    public Client(String clientNo, String name, String address, String teleNo, String mobile, String email, String remark) {
        this.clientNo = clientNo;
        this.name = name;
        this.address = address;
        this.teleNo = teleNo;
        this.mobile = mobile;
        this.email = email;
        this.remark = remark;
        
}

    public Client(String clientNo) {
        this.clientNo = clientNo;
    }

    public Client() {
        
    }

    
    
    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeleNo() {
        return teleNo;
    }

    public void setTeleNo(String teleNo) {
        this.teleNo = teleNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    
}