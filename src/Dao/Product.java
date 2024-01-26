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

/**
 *
 * @author VD
 */
public class Product {
    private String prodName,prodDesc,cateName;
    private float prodPrice;
    private int stockQty,prodId;

    /**
     * @return the prodName
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * @param prodName the prodName to set
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * @return the prodDesc
     */
    public String getProdDesc() {
        return prodDesc;
    }

    /**
     * @param prodDesc the prodDesc to set
     */
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    /**
     * @return the prodPrice
     */
    public float getProdPrice() {
        return prodPrice;
    }

    /**
     * @param prodPrice the prodPrice to set
     */
    public void setProdPrice(float prodPrice) {
        this.prodPrice = prodPrice;
    }

    /**
     * @return the cateName
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * @param cateName the cateName to set
     */
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    /**
     * @return the stockQty
     */
    public int getStockQty() {
        return stockQty;
    }

    /**
     * @param stockQty the stockQty to set
     */
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    /**
     * @return the prodId
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * @param prodId the prodId to set
     */
    
    public void setProdId(String name) {
        try{
            PreparedStatement pstp=new ConnectDB().getCon().prepareStatement("select prod_id from product where prod_name=?");
            pstp.setString(1, name);
            ResultSet rssp=pstp.executeQuery();
            while(rssp.next()){
                this.prodId=rssp.getInt(1);
            }
            rssp.close();
        }catch(SQLException e){}
    }

}
