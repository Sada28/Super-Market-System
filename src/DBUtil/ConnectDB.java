/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Swapnil
 */
public class ConnectDB {
    private Connection con=null;
    private Statement st=null;
    
    /**
     * @return the con
     */
    public Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/super_market","root","");
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
        return this.con;
    }

    /**
     * @return the st
     */
    public Statement getSt() {
        try{
            return st=getCon().createStatement();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return this.st;
    }
}
