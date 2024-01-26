/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author VD
 */
public class Stock {
    private int stockQty,prodId;
    private String prod_name,cateName;

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
     * @return the prod_name
     */
    public String getProd_name() {
        return prod_name;
    }

    /**
     * @param prod_name the prod_name to set
     */
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
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
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
}
