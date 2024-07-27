/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractise2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class GUIPractise2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        MyFrame f = new MyFrame();
//        f.setVisible(true);
//        
//        MyFrame1 f1 = new MyFrame1();
//        f1.setVisible(true);
                 
//        MyFrame2 f2 = new MyFrame2();
//        f2.setVisible(true);
//        
        
          MyFrame3 f3 = new MyFrame3();
        f3.setVisible(true);
    }
    
}
class MyFrame extends JFrame
{
    JLabel l1;
    JLabel l2;
    JTextField txt;
    JComboBox cbx;
    JPanel pnl;
    JButton btn;
    public MyFrame()
    {
        l1 = new JLabel("This is label 1");
        l2= new JLabel();
        txt = new JTextField();
        cbx = new JComboBox();
        pnl = new JPanel();
        btn = new JButton();
        
        btn.setText("Save");
        
        cbx.addItem("Select one");
        cbx.addItem("Lahore");
        cbx.addItem("Multan");
        cbx.addItem("Abbotabad");
        cbx.addItem("Karachi");
         
        l2.setText("This is label 2");
        l2.setForeground(Color.RED);
        txt.setPreferredSize(new Dimension(150,15));
        
        pnl.setLayout(new FlowLayout());
        this.setSize(new Dimension(200,200));
        this.setResizable(false);
        pnl.add(l1);
        pnl.add(txt);
        pnl.add(l2);
        pnl.add(cbx);
        pnl.add(btn);
        
     
        this.setTitle("My window");
        this.add(pnl);
        
    }
               
} 


class MyFrame1 extends JFrame
{
    JLabel l1;
    JLabel l2;
    JTextField txt;
    JComboBox cbx;
    JPanel pnl;
    JButton btn;
    public MyFrame1()
    {
        l1 = new JLabel("This is label 1");
        l2= new JLabel();
        txt = new JTextField();
        cbx = new JComboBox();
        pnl = new JPanel();
        btn = new JButton();
        
        btn.setText("Save");
        
        cbx.addItem("Select one");
        cbx.addItem("Lahore");
        cbx.addItem("Multan");
        cbx.addItem("Abbotabad");
        cbx.addItem("Karachi");
         
        l2.setText("This is label 2");
        l2.setForeground(Color.RED);
        txt.setPreferredSize(new Dimension(150,15));
        
        pnl.setLayout(new BorderLayout());
        this.setSize(new Dimension(200,200));
        this.setResizable(false);
        pnl.add(l1,BorderLayout.NORTH);
        pnl.add(txt,BorderLayout.SOUTH);
        pnl.add(l2,BorderLayout.WEST);
        pnl.add(cbx,BorderLayout.EAST);
        pnl.add(btn,BorderLayout.CENTER);
        
     
        this.setTitle("My window");
        this.add(pnl);
    }
}




class MyFrame2 extends JFrame
{
    JLabel l1;
    JLabel l2;
    JTextField txt;
    JComboBox cbx;
    JPanel pnl;
    JButton btn;
    public MyFrame2()
    {
        l1 = new JLabel("This is label 1");
        l2= new JLabel();
        txt = new JTextField();
        cbx = new JComboBox();
        pnl = new JPanel();
        btn = new JButton();
        
        btn.setText("Save");
        
        cbx.addItem("Select one");
        cbx.addItem("Lahore");
        cbx.addItem("Multan");
        cbx.addItem("Abbotabad");
        cbx.addItem("Karachi");
         
        l2.setText("This is label 2");
        l2.setForeground(Color.RED);
        txt.setPreferredSize(new Dimension(150,15));
       SpringLayout lyt =new SpringLayout(); 
        pnl.setLayout(lyt);
        this.setSize(new Dimension(200,200));
        this.setResizable(false);
             pnl.add(l1);
        pnl.add(txt);
        pnl.add(l2);
        pnl.add(cbx);
        pnl.add(btn);
       lyt.putConstraint(SpringLayout.NORTH, l1, 6,SpringLayout.NORTH , pnl);
       lyt.putConstraint(SpringLayout.WEST, l1, 6,SpringLayout.WEST , pnl);
       
       lyt.putConstraint(SpringLayout.NORTH, txt, 6,SpringLayout.SOUTH , l1);
       lyt.putConstraint(SpringLayout.WEST, txt, 6,SpringLayout.WEST , pnl);
       
       lyt.putConstraint(SpringLayout.NORTH, l2, 6,SpringLayout.SOUTH , txt);
       lyt.putConstraint(SpringLayout.WEST, l2, 6,SpringLayout.WEST , pnl);
       
       lyt.putConstraint(SpringLayout.NORTH, cbx, 17,SpringLayout.NORTH , l2);
       lyt.putConstraint(SpringLayout.WEST, cbx, 15,SpringLayout.WEST , pnl);
       
       lyt.putConstraint(SpringLayout.NORTH, btn, 80,SpringLayout.NORTH , pnl);
       lyt.putConstraint(SpringLayout.WEST, btn, 6,SpringLayout.EAST , cbx);
       
        this.setTitle("My window");
        this.add(pnl);
    }
}



class MyFrame3 extends JFrame
{
    JLabel l1;
    JLabel l2;
    JTextField txt;
    JComboBox cbx;
    JPanel pnl;
    JButton btn;
    public MyFrame3()
    {
        l1 = new JLabel("This is label 1");
        l2= new JLabel();
        txt = new JTextField();
        cbx = new JComboBox();
        pnl = new JPanel();
        btn = new JButton();
        
        btn.setText("Save");
        
        cbx.addItem("Select one");
        cbx.addItem("Lahore");
        cbx.addItem("Multan");
        cbx.addItem("Abbotabad");
        cbx.addItem("Karachi");
         
        l2.setText("This is label 2");
        l2.setForeground(Color.RED);
        txt.setPreferredSize(new Dimension(150,15));
        
        pnl.setLayout(new GridLayout(2,3));

        pnl.add(l1);
        pnl.add(txt);
        pnl.add(l2);
        pnl.add(cbx);
        pnl.add(btn);
        
        this.setSize(new Dimension(400,200));
        this.setResizable(false);     
        this.setTitle("My window");
        this.add(pnl);
        
    }
               
} 

