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
public class PlaceOrder {
    private int orderID;
    private int custID; 
    public ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> listQty=new ArrayList<Integer>();
        
    PreparedStatement pr;
    ResultSet rs;
    public PlaceOrder(){
        try {
            rs = new ConnectDB().getSt().executeQuery("select prod_id,prod_qty from cart");
            while(rs.next()){
                list.add(rs.getInt(1));
                listQty.add(rs.getInt(2));
            }
            rs.close();
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void setCustID() {
        try{
         pr =new ConnectDB().getCon().prepareStatement("SELECT cust_id FROM login_status where log_status=1");
            rs=pr.executeQuery();
            while(rs.next())
                this.custID=rs.getInt(1);
            rs.close();
            pr.close();
        }
        catch(SQLException e){}
    }
    
    public void setOrderID(){
        try{
           PlaceOrder p=new PlaceOrder();
            p.setCustID();
            String sql="SELECT `ORDER_ID` FROM `order_product` WHERE cust_id=" +p.getCustID();
            pr =new ConnectDB().getCon().prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next())
                this.orderID=rs.getInt(1);
            rs.close();
            pr.close();
        } catch (SQLException ex) {}}
    
    public int getCustID() throws SQLException{
        return this.custID;
    }
    
    public int getOrderID(){
        return this.orderID;
    }
}
