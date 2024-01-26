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
public class Customer {
    private String custFirstName,custLastName,custEmail,custDob,custAddress,custGender,custPassword,custConfirmPassword;
    private long custAadharNo,custMobileNo;

    /**
     * @return the custFirstName
     */
    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * @param custFirstName the custFirstName to set
     */
    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    /**
     * @return the custLastName
     */
    public String getCustLastName() {
        return custLastName;
    }

    /**
     * @param custLastName the custLastName to set
     */
    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    /**
     * @return the custEmail
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * @param custEmail the custEmail to set
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    /**
     * @return the custDob
     */
    public String getCustDob() {
        return custDob;
    }

    /**
     * @param custDob the custDob to set
     */
    public void setCustDob(String custDob) {
        this.custDob = custDob;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the custGender
     */
    public String getCustGender() {
        return custGender;
    }

    /**
     * @param custGender the custGender to set
     */
    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    /**
     * @return the custPassword
     */
    public String getCustPassword() {
        return custPassword;
    }

    /**
     * @param custPassword the custPassword to set
     */
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    /**
     * @return the custAadharNo
     */
    public long getCustAadharNo() {
        return custAadharNo;
    }

    /**
     * @param custAadharNo the custAadharNo to set
     */
    public void setCustAadharNo(long custAadharNo) {
        this.custAadharNo = custAadharNo;
    }

    /**
     * @return the custMobileNo
     */
    public long getCustMobileNo() {
        return custMobileNo;
    }

    /**
     * @param custMobileNo the custMobileNo to set
     */
    public void setCustMobileNo(long custMobileNo) {
        this.custMobileNo = custMobileNo;
    }

    /**
     * @return the custConfirmPassword
     */
    public String getCustConfirmPassword() {
        return custConfirmPassword;
    }

    /**
     * @param custConfirmPassword the custConfirmPassword to set
     */
    public void setCustConfirmPassword(String custConfirmPassword) {
        this.custConfirmPassword = custConfirmPassword;
    }
    
}
