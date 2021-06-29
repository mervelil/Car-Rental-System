/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merve çelik
 */
public class javaconnect {
    Connection con =null;  //initialize connection

    public static Connection getConnection(){
 Connection con = null;
    try {      
            con =DriverManager.getConnection("jdbc:derby://localhost:1527/CarRentalDb","sa","as");
            //the getConnection method of DriverManager class attempts to establish a connection to the db by using the given db URL
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex); //any exception occured ,shows this
        }
        return con;
    } 

}
