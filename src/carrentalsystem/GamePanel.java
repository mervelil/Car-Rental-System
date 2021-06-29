/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
;
import java.util.Random;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author merve çelik
 */


public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WİDTH = 600;    //set a width and height  as a 600 and these can not change
    static final int SCREEN_HEİGHT = 600;
    static final int UNIT_SİZE = 25;      //set a size as a 25 it can be 20 or 30  it depends what you wanna but cannot to big  
    static final int GAME_UNITS = (SCREEN_WİDTH * SCREEN_HEİGHT) / UNIT_SİZE;  //for the cordinate  i set like that   in the  divide 25 
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];   //for x axis  
    final int y[] = new int[GAME_UNITS];   //for y axis    games units store in array for each little rectangular
    int bodyparts = 6;   //body parts as a 6 it can be 7 8 etc then parts get bigger
    int applesEaten;         //itialize vars
    int appleX;
    int appleY;
    char direction = 'R';  //initialize as  a R
    boolean running = false; //initialize as false 
    Timer timer;    //initialize timer and random
    Random random;

    public GamePanel() {
        random = new Random(); //create Random object 
        this.setPreferredSize(new Dimension(SCREEN_WİDTH, SCREEN_HEİGHT));   //set gamepanel size as a fixed height and width
        this.setBackground(Color.black);   //set game panel background as a black
        this.setFocusable(true);   // focus is used to set automatically keypad function on text box so just after activity starts it will automatically select 
        this.addKeyListener(new MyKeyAdapter());  //for keyboard playing i added this objects

        startGame(); //display  this method
    }

    public void startGame() {
        newApple();   //display this method
        running = true; //then it equals true
        timer = new Timer(DELAY, this);  //delaythe timer 75 miliseconds
        timer.start(); //start the timer
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);   //paint super class component and then draw 
        draw(g);  //invvoke this method to paint
    }

    public void draw(Graphics g) {
        if (running) {  //if running is true
            for (int i = 0; i < SCREEN_HEİGHT / UNIT_SİZE; i++) {       //
                g.drawLine(i * UNIT_SİZE, 0, i * UNIT_SİZE, SCREEN_HEİGHT);
                g.drawLine(0, i * UNIT_SİZE, SCREEN_WİDTH, i * UNIT_SİZE);     //for the draw little rectangular, use drawline method

            }
            g.setColor(Color.red);          //for create apple g set as a red and then fill the oval shape in this color
            g.fillOval(appleX, appleY, UNIT_SİZE, UNIT_SİZE); // for the right  filling ,used apple cordinates 
            for (int i = 0; i < bodyparts; i++) {      //if i is not greater than bodypart 
                if (i == 0) {   // and if it equals 0 
                    g.setColor(Color.green);  //set color as a green
                    g.fillRect(x[i], y[i], UNIT_SİZE, UNIT_SİZE);  //fill the rect x and y cordinate with  i values
                } else {  //else
                    // g.setColor(new Color(45, 180,0));
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    //set color randomly
                    g.fillRect(x[i], y[i], UNIT_SİZE, UNIT_SİZE); //and then fill the rec  x and y cordinate with  i values
                }
            }
            g.setColor(Color.red);   //then set color as a red
            g.setFont(new Font("Ink Free", Font.BOLD, 40));   //set font as a bold,ink free and 40 
            FontMetrics metrics = getFontMetrics(g.getFont()); //measurement of character i used this class and then get font 
            g.drawString("Score: " + applesEaten, (SCREEN_WİDTH - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());

        } else {
            gameOver(g); //display gameover method
        }
    }

    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WİDTH / UNIT_SİZE)) * UNIT_SİZE;   //randomly locate an apple through x and y axis
        appleY = random.nextInt((int) (SCREEN_HEİGHT / UNIT_SİZE)) * UNIT_SİZE;
    }

    public void move() {
        for (int i = bodyparts; i > 0; i--) {
            x[i] = x[i - 1];    //when  bodyparts is moving  for the freely moving ,bodyparts decrasing step by step
            y[i] = y[i - 1];    //and new x and value equals i-1
        }
        switch (direction) {
            case 'U':   //as a default
                y[0] = y[0] - UNIT_SİZE;  //Direction is up y equals like that(up border)
                break;
            case 'D':
                y[0] = y[0] + UNIT_SİZE;   //Direction is down y equals like that(down border)
                break;
            case 'L':
                x[0] = x[0] - UNIT_SİZE;  //Direction is left y equals like that(left border)
                break;
            case 'R':
                x[0] = x[0] + UNIT_SİZE; //Direction is right y equals like that (rigt border)
                break;

        }

    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {  //if locate x and apple x equals and also   y and apple y equals
            bodyparts++;                      //increase bodypart
            applesEaten++;    //increase and eaten apples
            newApple();    //and locate apple randomly another location
        }
    }

    public void checkCollisions() {
        //check if head collides with body
        for (int i = bodyparts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        //check if head touches left border
        if (x[0] < 0) {
            running = false;

        }
        //check head touches right border
        if (x[0] > SCREEN_WİDTH) {
            running = false;
            //CHECK TOP 

        }
        //CHECK TOP 
        if (y[0] < 0) {
            running = false;
        }
        if (y[0] > SCREEN_HEİGHT) {
            running = false;
        }
        if (!running) {//running false timer is stopped
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {  //when game  is over ,set shows String for information 
        g.setColor(Color.red);  //set color as a red if is 
        g.setFont(new Font("Ink Free", Font.BOLD, 40));  //set object font as a ink free and bold
        FontMetrics metrics = getFontMetrics(g.getFont()); //and then get font metrics how i displayed 
        g.drawString("Score: " + applesEaten, (SCREEN_WİDTH - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        //score String set as a how many eaten apple etc
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WİDTH - metrics2.stringWidth("Game over")) / 2, SCREEN_HEİGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();       //display these methods 
            checkCollisions();
        }
        repaint();  //and re-show the panel every changing
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {      //get key event
                case KeyEvent.VK_A:       //when A pressed 
                    if (direction != 'R') {   //if  direction is not R
                        direction = 'L';   //direction  equals L 
                    }
                    break;
                case KeyEvent.VK_D:    //when D pressed 
                    if (direction != 'L') {   // if  direction is not L
                        direction = 'R'; //direction  equals R
                    }
                    break;
                case KeyEvent.VK_W:    //when W pressed 
                    if (direction != 'D') {     // if  direction is not D 
                        direction = 'U';   //direction  equals U
                    }
                    break;
                case KeyEvent.VK_S: //when S pressed 
                    if (direction != 'U') {   // if  direction is not U
                        direction = 'D';    //direction  equals D
                    }
                    break;
                //if i didnt use break it continues before
            }
        }
    }

}
