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
public class User {
    private String userName;
    private String pass;
    private String role;
    private String empNo;
    private String fullName;
    private String extNo;
    private String emial;

    public User(String userName, String pass, String role, String empNo, String fullName, String extNo, String emial) {
        this.userName = userName;
        this.pass = pass;
        this.role = role;
        this.empNo = empNo;
        this.fullName = fullName;
        this.extNo = extNo;
        this.emial = emial;
    }

    public User(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public User(String empNo) {
        this.empNo = empNo;
    }

    public User() {
        
    }
     
    
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExtNo() {
        return extNo;
    }

    public void setExtNo(String extNo) {
        this.extNo = extNo;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
    
    
}
