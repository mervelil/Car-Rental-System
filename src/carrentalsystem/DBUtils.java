/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author merve çelik
 */
public class DBUtils {

    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            //An object that can be used to get information about the types and properties of the columns in a ResultSet object
            //and resultSet get meta data
            int numberOfColumns = metaData.getColumnCount();
            // returns the number of columns in this resultSet object and  held int
            Vector columnNames = new Vector();
            //constructs an empty vector so that its internal data array

            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
                //  adds the specified component to the end of this vector
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) { //end of data read all data
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                    //   data array add elements that element (object )comes from resultSet 
                }

                rows.addElement(newRow);
                //add rows this new rows 
            }

            return new DefaultTableModel(rows, columnNames);   //creates new default table which included 2 parametres rows and columns 
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }   
}
