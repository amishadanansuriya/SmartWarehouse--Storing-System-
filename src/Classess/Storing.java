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
public class Storing {
    private String jobNo;
    private String clientNo;
    private double subTotal;
    private String startingDate;
    private String endingDate;
    private int status;
    private int itemNo;
    private String itemName;
    private double sqftArea;
    private int noOfItem;
    private double perSqftRate;
    private int days;
    private double itemTotal;
    private String closedate;
    private String closeComment;

    public Storing() {
    }

    public Storing(String jobNo) {
        this.jobNo = jobNo;
    }

    public Storing(String jobNo, String startingDate, String endingDate) {
        this.jobNo = jobNo;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    
    
    
    public Storing(String jobNo, String clientNo, double subTotal, String startingDate, String endingDate, int status) {
        this.jobNo = jobNo;
        this.clientNo = clientNo;
        this.subTotal = subTotal;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.status = status;
    }

    public Storing(String jobNo, String itemName, double sqftArea, int noOfItem, double perSqftRate, int days, double itemTotal) {
        this.jobNo = jobNo;
        this.itemName = itemName;
        this.sqftArea = sqftArea;
        this.noOfItem = noOfItem;
        this.perSqftRate = perSqftRate;
        this.days = days;
        this.itemTotal = itemTotal;
    }

    public Storing(String jobNo, String startingDate, String endingDate, int status ) {
        this.jobNo = jobNo;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.status = status;
    }

    

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getSqftArea() {
        return sqftArea;
    }

    public void setSqftArea(double sqftArea) {
        this.sqftArea = sqftArea;
    }

    public int getNoOfItem() {
        return noOfItem;
    }

    public void setNoOfItem(int noOfItem) {
        this.noOfItem = noOfItem;
    }

    public double getPerSqftRate() {
        return perSqftRate;
    }

    public void setPerSqftRate(double perSqftRate) {
        this.perSqftRate = perSqftRate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public String getClosedate() {
        return closedate;
    }

    public void setClosedate(String closedate) {
        this.closedate = closedate;
    }

    public String getCloseComment() {
        return closeComment;
    }

    public void setCloseComment(String closeComment) {
        this.closeComment = closeComment;
    }

    

       
    
}

