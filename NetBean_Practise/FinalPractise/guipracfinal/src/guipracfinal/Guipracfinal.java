package guipracfinal;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Guipracfinal
{
    public static void main(String[] args)
    {

        ClassAbc ob =new ClassAbc();


    }
    
}
class ClassAbc extends JFrame  implements ActionListener
{
    JLabel lbl1;
    JLabel lbl2;
    JButton btn;
    JComboBox cbx;
    JPanel pnl;
    
    
    public ClassAbc()
    {
        lbl1=new JLabel("This is my label");
        lbl2=new JLabel("Frame Size is 200*200");
        btn =new JButton();
        btn.setText("My Button");
        cbx=new JComboBox();
        cbx.addItem("This is oprtion 1");
         pnl = new JPanel();
         
         pnl.setLayout(new FlowLayout());
        pnl.setSize(new Dimension(200,200));
        btn.addActionListener(this);
        
        pnl.add(lbl1);
        pnl.add(btn);
        pnl.add(lbl2);
        pnl.add(cbx);
        
        this.add(pnl);
        this.setVisible(true);
       
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        lbl1.setText("button press");
    }  
}