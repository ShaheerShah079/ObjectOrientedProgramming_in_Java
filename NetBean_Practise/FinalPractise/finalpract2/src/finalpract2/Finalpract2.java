package finalpract2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class Finalpract2
{

    public static void main(String[] args)
    {
      Frame f = new Frame();
      



    }
    
}

class Frame extends JFrame implements ActionListener
{
    JLabel lbl1;
    JLabel lbl2;
    JButton btn;
    JComboBox cbx;
    JPanel pnl;
    
    public Frame()
    {
        lbl1=new JLabel("This is my label");
        lbl2=new JLabel("My whindow 200*200");
        btn= new JButton();
        btn.setText("My Button");
        pnl = new JPanel();
        cbx = new JComboBox();
        cbx.addItem("Select one");
        
        btn.addActionListener(this);
        pnl.setLayout(new FlowLayout());
        this.setSize(new Dimension(200,200));
        
        pnl.add(lbl1);
        pnl.add(btn);
        pnl.add(lbl2);
        pnl.add(cbx);
        
        this.add(pnl);
        
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      lbl1.setText("Button pressed");
    }
    
    
//
//    @Override
//    public void actionPerformed(ActionEvent ae)
//    {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}