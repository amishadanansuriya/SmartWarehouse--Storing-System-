/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Classess.Bill;
import Classess.Client;
import Classess.Storing;
import Classess.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DBManager {
    
    public static String userName;
    public static String role;
    
    public boolean regUser(User user) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("Insert into user (EmpNo, UserName, Pass, Role, FullName, ExtNo, Email) values (?,?,?,?,?,?,?)");
            statement.setString(1, user.getEmpNo());
            statement.setString(2, user.getUserName());
            statement.setString(3, user.getPass());
            statement.setString(4, user.getRole());
            statement.setString(5, user.getFullName());
            statement.setString(6, user.getExtNo());
            statement.setString(7, user.getEmial());
            statement.execute();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    


    public boolean validateUser(User user) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection(); 
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from user where UserName = '"+user.getUserName()+"' and Pass = '"+user.getPass()+"'");
            if(rs.next()){
                
                userName = rs.getString("UserName");
                role = rs.getString("Role");
                
                con.close();
                return true;
            } else{
                con.close();
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public User searchUser(User user) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        User emp = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from user where EmpNo = '"+user.getEmpNo()+"'");
            if(rs.next()){
                
                emp = new User(rs.getString("UserName"), rs.getString("Pass"), rs.getString("Role"), rs.getString("EmpNo"), rs.getString("FullName"), rs.getString("ExtNo"), rs.getString("Email"));
                return emp;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    public boolean updateUser(User user) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("update user set UserName = ?, Pass = ?, Role = ?, FullName = ?, ExtNo = ?, Email = ? where EmpNo = ?");
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPass());
            statement.setString(3, user.getRole());
            statement.setString(4, user.getFullName());
            statement.setString(5, user.getExtNo());
            statement.setString(6, user.getEmial());
            statement.setString(7, user.getEmpNo());
            statement.execute();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public boolean deleteUser(User user) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("delete from user where EmpNo = ?");
            statement.setString(1, user.getEmpNo());
            
            statement.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean regClient(Client client) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("Insert into client (ClientNo, Name, Address, TeleNo, Mobile, Email, Remarks) values (?,?,?,?,?,?,?)");
            statement.setString(1, client.getClientNo());
            statement.setString(2, client.getName());
            statement.setString(3, client.getAddress());
            statement.setString(4, client.getTeleNo());
            statement.setString(5, client.getMobile());
            statement.setString(6, client.getEmail());
            statement.setString(7, client.getRemark());
            statement.execute();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;    
    }

    public Client searchClient(Client client) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        Client clientN = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from client where ClientNo = '"+client.getClientNo()+"'");
            if(rs.next()){
                
                clientN = new Client(rs.getString("ClientNo"), rs.getString("Name"), rs.getString("Address"), rs.getString("TeleNo"), rs.getString("Mobile"), rs.getString("Email"), rs.getString("Remarks"));
                return clientN;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientN;
        
    }

    public boolean updateClient(Client client) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("update client set Name = ?, Address = ?, TeleNo = ?, Mobile = ?, Email = ?, Remarks = ? where ClientNo = ? ");
            statement.setString(1, client.getName());
            statement.setString(2, client.getAddress());
            statement.setString(3, client.getTeleNo());
            statement.setString(4, client.getMobile());
            statement.setString(5, client.getEmail());
            statement.setString(6, client.getRemark());
            statement.setString(7, client.getClientNo());
            statement.execute();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }

    public boolean deleteClient(Client client) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("delete from client where ClientNo = ?");
            statement.setString(1, client.getClientNo());
            
            statement.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean AddStoring(Storing storing) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("insert into storing_job(JobNo, ClientNo, SubTotal, SDate, EDate, Status) values(?,?,?,?,?,?)");
            statement.setString(1, storing.getJobNo());
            statement.setString(2, storing.getClientNo());
            statement.setDouble(3, storing.getSubTotal());
            statement.setString(4, storing.getStartingDate());
            statement.setString(5, storing.getEndingDate());
            statement.setInt(6, storing.getStatus());
            
            statement.execute();
            con.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    public void AddStoringItem(Storing storingItem) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("insert into storing_item(JobNo, ItemName, SqftArea, NoOfItem, PerSqftRate, Days, ItemTotal) values(?,?,?,?,?,?,?)");
            statement.setString(1, storingItem.getJobNo());
            statement.setString(2, storingItem.getItemName());
            statement.setDouble(3, storingItem.getSqftArea());
            statement.setInt(4, storingItem.getNoOfItem());
            statement.setDouble(5, storingItem.getPerSqftRate());
            statement.setInt(6, storingItem.getDays());
            statement.setDouble(7, storingItem.getItemTotal());
            
            statement.execute();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public Bill generateInvoice(Bill bill) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        Bill invB = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select storing_job.*, client.* from storing_job inner join client on storing_job.ClientNo = client.ClientNo where JobNo = '"+bill.getJobNo()+"'");
            if(rs.next()){
                
                bill.setJobNo(rs.getString("storing_job.JobNo"));
                bill.setStartingDate(rs.getString("storing_job.SDate"));
                bill.setEndingDate(rs.getString("storing_job.EDate"));
                bill.setClientNo(rs.getString("storing_job.ClientNo"));
                bill.setName(rs.getString("client.Name"));
                bill.setAddress(rs.getString("client.Address"));
                bill.setEmail(rs.getString("client.Email"));
                bill.setTeleNo(rs.getString("client.TeleNo"));
                bill.setSubTotal(rs.getDouble("storing_job.SubTotal"));
                invB = bill;
                return invB;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invB;
        
        
    }

    public ArrayList<Bill> generateJobItems(Bill bill) {
        
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        ArrayList<Bill> ItemList = new ArrayList<Bill>();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from storing_item where JobNo = '"+bill.getJobNo()+"'");
            while (rs.next()){
                Bill inv = new Bill();
                inv.setItemName(rs.getString("ItemName"));
                inv.setSqftArea(rs.getDouble("SqftArea"));
                inv.setNoOfItem(rs.getInt("NoOfItem"));
                inv.setPerSqftRate(rs.getDouble("PerSqftRate"));
                inv.setDays(rs.getInt("Days"));
                inv.setItemTotal(rs.getDouble("ItemTotal"));
                
                ItemList.add(inv);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ItemList;

    }

    public Storing jobSearch(Storing storing) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        Storing storingJ = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from storing_job where JobNo = '"+storing.getJobNo()+"' and Status = '1'");
            if(rs.next()){
                
                storingJ = new Storing (rs.getString("JobNo"), rs.getString("SDate"), rs.getString("EDate"));
                return storingJ;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return storingJ;
    }


    public boolean closeJob(Bill bill) {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();
        
        try {
            PreparedStatement statement = con.prepareStatement("UPDATE storing_job SET CloseDate = ?, CloseComment = ?, Status = ? WHERE JobNo = ? ");
            statement.setString(1, bill.getClosedate());
            statement.setString(2, bill.getCloseComment());
            statement.setInt(3, bill.getStatus());
            statement.setString(4, bill.getJobNo());
            
            statement.execute();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Storing> getAllJobs() {


        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();

        ArrayList<Storing> JobList = new ArrayList<Storing>();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select storing_job.*, client.* from storing_job inner join client on storing_job.ClientNo = client.ClientNo");
            while (rs.next()) {

                Storing AJ = new Storing();

                AJ.setJobNo(rs.getString("storing_job.JobNo"));
                AJ.setClientNo(rs.getString("client.ClientNo"));
                AJ.setStartingDate(rs.getString("storing_job.SDate"));
                AJ.setEndingDate(rs.getString("storing_job.EDate"));
                AJ.setSubTotal(rs.getDouble("storing_job.SubTotal"));
                AJ.setStatus(rs.getInt("storing_job.Status"));
                AJ.setClosedate(rs.getString("storing_job.CloseDate"));
                AJ.setCloseComment(rs.getString("storing_job.CloseComment"));

                JobList.add(AJ);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return JobList;
    }

    public ArrayList<Storing> getAllJobItems() {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();

        ArrayList<Storing> jobItemList = new ArrayList<Storing>();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select storing_item.*, storing_job.* from storing_item inner join storing_job on storing_item.JobNo = storing_job.JobNo");
            while (rs.next()) {

                Storing AJ = new Storing();

                AJ.setItemNo(rs.getInt("storing_item.ItemNo"));
                AJ.setJobNo(rs.getString("storing_job.JobNo"));
                AJ.setItemName(rs.getString("storing_item.ItemName"));
                AJ.setSqftArea(rs.getDouble("storing_item.SqftArea"));
                AJ.setNoOfItem(rs.getInt("storing_item.NoOfItem"));
                AJ.setPerSqftRate(rs.getDouble("storing_item.PerSqftRate"));
                AJ.setDays(rs.getInt("storing_item.Days"));
                AJ.setItemTotal(rs.getDouble("storing_item.ItemTotal"));


                jobItemList.add(AJ);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jobItemList;
    }

    public ArrayList<Client> getAllClients() {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();

        ArrayList<Client> clientList = new ArrayList<Client>();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from client");
            while (rs.next()) {

                Client AC = new Client();

                AC.setClientNo(rs.getString("client.ClientNo"));
                AC.setName(rs.getString("client.Name"));
                AC.setAddress(rs.getString("client.Address"));
                AC.setTeleNo(rs.getString("client.TeleNo"));
                AC.setMobile(rs.getString("client.Mobile"));
                AC.setEmail(rs.getString("client.Email"));
                AC.setRemark(rs.getString("client.Remarks"));



                clientList.add(AC);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientList;
    }

    public ArrayList<User> getAllUsers() {
        DBConnector dbCon = new DBConnector();
        Connection con = dbCon.getConnection();

        ArrayList<User> userList = new ArrayList<User>();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {

                User AU = new User();

                AU.setEmpNo(rs.getString("user.EmpNo"));
                AU.setUserName(rs.getString("user.UserName"));
                AU.setRole(rs.getString("user.Role"));
                AU.setFullName(rs.getString("user.FullName"));
                AU.setExtNo(rs.getString("user.ExtNo"));
                AU.setEmial(rs.getString("user.Email"));



                userList.add(AU);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    



    
}
