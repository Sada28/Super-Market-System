/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBUtil.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author VD
 */
public class Orders {
    private ArrayList<Integer> orderList=new ArrayList<Integer>();
    private int custId;
    PreparedStatement pst;
    ResultSet rs;
    
    public Orders(){
        try{
            pst =new ConnectDB().getCon().prepareStatement("SELECT cust_id FROM login_status where log_status=1");
            rs=pst.executeQuery();
            while(rs.next())
                this.custId=rs.getInt(1);
            rs.close();
            pst.close();
        }
        catch(SQLException e){}
    }
    
    
    /**
     * @return the orderList
     */
    public ArrayList<Integer> getOrderList() {
        return orderList;
    }

    /**
     * @param orderList the orderList to set
     */
    public void setOrderList() {
        //to get all order of current customer
        //select order_id from order_product where cust_id=?
        ArrayList<Integer> or=new ArrayList<Integer>();
        try{
            pst= new ConnectDB().getCon().prepareStatement("select order_id from order_product where cust_id=?");
            pst.setInt(1, this.custId);
            rs=pst.executeQuery();
            while(rs.next()){
                or.add(rs.getInt(1));
            }
        }
        catch(SQLException e){}
        
        
        try {
            for(int i=0; i<or.size(); i++){
                pst= new ConnectDB().getCon().prepareStatement("select DISTINCT(order_id) from order_trans where status=false and order_id=?");
                pst.setInt(1,or.get(i));
                rs=pst.executeQuery();

                while(rs.next()){
                    orderList.add(rs.getInt(1));
                } 
            }
            rs.close();
        } catch (SQLException ex) {}
    }

    /**
     * @return the custId
     */
    public int getCustId() {
        return this.custId;
    }

    /**
     * @param custId the custId to set
     */

    
    
    
}
