/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author merve çelik
 */
public class GameFrame extends JFrame {

    public GameFrame() {
        GamePanel panel = new GamePanel();  //create a new object 
        this.add(new GamePanel());  //add  this object
        this.setTitle("SNAKE");   //set title as a snake
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //set close operation as a exit on close for jframe
        this.setResizable(false);  // user can not a size 
        this.pack();
        this.setVisible(true); //shows the frame
        this.setLocationRelativeTo(null); //set frame location in the center of screen
    }

}
