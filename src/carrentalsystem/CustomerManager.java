/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merve çelik
 */
public class CustomerManager extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManager
     */
    public CustomerManager() {
        initComponents();
        displayCustomers(); //we directly shows  table information when customer manager jframe shows
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtphone = new javax.swing.JFormattedTextField();
        txtadd = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setDividerSize(15);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(770, 597));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Customer Id");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        try {
            txtphone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##-##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Customer Name");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Customer Address");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Customer Number");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customertable);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("MANAGE CUSTOMER LIST");
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("CUSTOMER LIST");

        btnnsave.setBackground(new java.awt.Color(255, 0, 51));
        btnnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_Vehicles_and_Transport_car_travel_plus_add_6646605.png")); // NOI18N
        btnnsave.setText("SAVE");
        btnnsave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnsaveActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(102, 102, 255));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_Streamline-22_185042.png")); // NOI18N
        btnedit.setText("EDIT");
        btnedit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 51, 51));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_ic_delete_forever_48px_3669360.png")); // NOI18N
        btndelete.setText("DELETE");
        btndelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(255, 0, 51));
        btnreset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnreset.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_ic_round_return_5760423.png")); // NOI18N
        btnreset.setText("RESET");
        btnreset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 297));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_Exit_728935.png")); // NOI18N
        jToggleButton1.setText("Log Out");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 40, 170, 56));

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_property-agent-003_1851812.png")); // NOI18N
        jLabel2.setText("Rent Car");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 145, 62));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_cool_64_67530.png")); // NOI18N
        jLabel5.setText("Cars");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 131, 62));

        jLabel6.setBackground(new java.awt.Color(153, 0, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve çelik\\Downloads\\iconfinder_return-delivery-failed-distribution-service_7811676.png")); // NOI18N
        jLabel6.setText("Return Car");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 170, 62));

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel1.add(jSplitPane1);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        if (txtid.getText().isEmpty() || txtname.getText().isEmpty() || txtadd.getText().isEmpty()
                || txtphone.getText().isEmpty()) { //if texts are empty show message to be selected 
            JOptionPane.showMessageDialog(this, "Select the customer to  be updated", "Information", JOptionPane.INFORMATION_MESSAGE);
            //shows this message
        } else {
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/CarRentalDb", "sa", "as");
                //the getConnection method of Java DriverManager class attempts to establish a connection to the database by using the given database URL.
                //the appropriate driver from the set of registered JDBC drivers is selected 
                String customerid = txtid.getText();
                //use to query more easier held in the var
                String query = "UPDATE CUSTOMERTABLE SET CUSTOMERNAME='" + txtname.getText() + "',CUSTOMERADD='" + txtadd.getText() + "',CUSTOMERPHONE='" + txtphone.getText() + "'WHERE CUSTOMERID=" + customerid;
                //and then sql statement in here select from  customertable db table(all of them)
                //and then where customer name matches name1 text Executing the PreparedStatement looks like executing a regular Statement.
                Statement add = con.createStatement();
                //You execute Statement objects, and they generate ResultSet objects, which is a table of data representing a database result set.
                //You need a Connection object to create a Statement object.
                add.executeUpdate(query);
                //Statement executeUpdate(String query) is used to execute Update statements or  statements that returns nothing
                JOptionPane.showMessageDialog(rootPane, "Customer Updated Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                //if executed rightly show this message if it is false  i mean if cant add the database cant show this message
                displayCustomers();  //after add customer ,the database shows this method 

                reset();//after shows customer info reset to the textboxes
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_btneditActionPerformed
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    private void displayCustomers() {
        try {

            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CarRentalDb", "sa", "as");
            //the getConnection method of Java DriverManager class attempts to establish a connection to the database by using the given database URL.
            //the appropriate driver from the set of registered JDBC drivers is selected 
            st = con.createStatement();   //You execute Statement objects, and they generate ResultSet objects, which is a table of data representing a database result set.
            //You need a Connection object to create a Statement object.
            rs = st.executeQuery("select * from CUSTOMERTABLE");
//Statement executeUpdate(String query) is used to execute Update statements or  statements that returns nothing
            customertable.setModel(DBUtils.resultSetToTableModel(rs)); //dbutils in other  class ı explain there
            //A table of data representing a database resultset, which is generated by executing a statement that queries the database.
        } catch (SQLException e) {
            e.printStackTrace(); //occurs any exception shows 
        }
    }
    private void btnnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnsaveActionPerformed
        if (txtid.getText().isEmpty() || txtname.getText().isEmpty() || txtadd.getText().isEmpty()
                || txtphone.getText().isEmpty()) {//if textfields are empty show message to be selected 
            JOptionPane.showMessageDialog(rootPane, "Information is Missing", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {//if textfields are not empty 
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/CarRentalDb", "sa", "as");
                //the getConnection method of Java DriverManager class attempts to establish a connection to the database by using the given db URL.
                //the appropriate driver from the set of registered JDBC drivers is selected 
                PreparedStatement add = con.prepareStatement("insert into CUSTOMERTABLE values(?,?,?,?)");
                //use a PreparedStatement firstly  i must first create it. ? is parameter how many ? it has that much value to add the database
// This is done using the many setString methods.if var type is int it must be setInt etc 
//for precompiling SQL statements for no parameter but preparestatement contains input parameters.That is why ı choosed prepareStatement

                //The second number  is the value to insert into the SQL statement  then 
                // which value add sql after you must write after "," 
                add.setString(1, txtid.getText());  //it is primary 

                add.setString(2, txtname.getText());

                add.setString(3, txtadd.getText());

                add.setString(4, txtphone.getText());

                int row = add.executeUpdate();
                // Returns an integer representing the number of rows affected by the SQL statement. 
                JOptionPane.showMessageDialog(rootPane, "Customer Add Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                //after shows that message in  the screen 
                displayCustomers();
                //after db updated for the show  new version of data
            } catch (Exception e) {
                e.getStackTrace(); //any exception is occured show  exception in outline 
            }
        }
    }//GEN-LAST:event_btnnsaveActionPerformed
    public void reset() {
        txtid.setText(""); //to not show any char or string uses "" <- that set  jtextfield like that
        txtname.setText("");  //to not show any char or string uses "" <- that set  jtextfield like that
        txtadd.setText("");   //to not show any char or string uses "" <- that set  jtextfield like that
        txtphone.setText(""); //to not show any char or string uses "" <- that set  jtextfield like that

    }
    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        reset(); //thanks to this method we can set  no char or string  in text
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (txtid.getText().isEmpty()) {  //if txt id does not fill then it shows an information message because i needs to hold specific 
            //information to delete where is stored ,that is why ı need to learn txtid
            JOptionPane.showMessageDialog(this, "Select the customer to  be deleted", "Information", JOptionPane.INFORMATION_MESSAGE);
            //shows  this message
        } else {
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/CarRentalDb", "sa", "as");
                //the getConnection(String url) method of DriverManager class attempts to establish a connection to the database by using the given database URL.
                String query = "Delete from sa.CUSTOMERTABLE where CUSTOMERID=" + txtid.getText();
                //delete customer which it matches given id
                Statement add = con.createStatement();
                //You execute Statement objects, and they generate ResultSet objects, which is a table of data representing a database result set.
                //You need a Connection object to create a Statement object.
                add.executeUpdate(query);
                //  representing the number of rows affected by the SQL statement. 

                JOptionPane.showMessageDialog(this, "Customer Deleted Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                //shows this message 
                displayCustomers(); //show to any changes i display  method here again
                reset(); //and new record or to fresh start i reset all jtextfields
            } catch (Exception e) {
                e.getStackTrace(); //any exception is occured show  exception in outline 
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void customertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertableMouseClicked
        DefaultTableModel model = (DefaultTableModel) customertable.getModel(); //shows the jtable, casts the defaultmodelto  table
        int myindex = customertable.getSelectedRow(); //Returns the index of the first selected row, -1 if no row is selected

        txtid.setText(model.getValueAt(myindex, 0).toString()); //returns the cell value at row and column row is held myindex 
//,column is held which column  it is but value at holds int ,txt id holds string that is why i used toString method for display as a String
        txtname.setText(model.getValueAt(myindex, 1).toString());
        //,column is held which column  it is but value at holds int ,txt txtname holds string that is why i used toString method for display as a String
        txtadd.setText(model.getValueAt(myindex, 2).toString());
        //,column is held which column  it is but value at holds int ,txt address  holds string that is why i used toString method for display as a String   
        txtphone.setText(model.getValueAt(myindex, 3).toString());
        //,column is held which column  it is but value at holds int ,txt phone holds string that is why i used toString method for display as a String
    }//GEN-LAST:event_customertableMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new CarManager().setVisible(true);  //if  user cliks  cars label it shows that frame thanks to set visible 
        this.dispose(); //and customer manager frame disappear
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Rent().setVisible(true); //if return car label clicked set visible true ,shows the return jframe
        this.dispose(); //and customer manager frame disappear
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Returns().setVisible(true); //if return car label clicked set visible true shows the return jframe
        this.dispose();//and customer manager frame disappear
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new Log().setVisible(true);  //if choses that button open the log frame thanks to set visible 
        this.dispose();//and customer manager frame disappear
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnnsave;
    private javax.swing.JButton btnreset;
    private javax.swing.JTable customertable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JFormattedTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
