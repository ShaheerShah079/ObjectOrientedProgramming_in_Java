package guisignup;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class GUISIGNUP
{

    public static void main(String[] args)
    {   
      SignUp s = new SignUp();
        s.setVisible(true);
    }
    
}

class SignUp extends JFrame
{
    String [] ages ={"1","2","3","4","5","6","7","8","9","10"};
    JLabel name;
    JLabel pass;
    JLabel city;
    JLabel age;
    JLabel gender;
    JLabel interest;
    JLabel remark;
    JTextField nameTxt;
    JPasswordField passTxt;
    JComboBox cityCbx;
    JSpinner ageSpin;
    JRadioButton genderRadio;
    JCheckBox interestBox;
    JTextArea remarkArea;
    JButton  savebtn;
    JButton  cancelbtn;
    JPanel pnl;
    public SignUp()
    {
     name= new JLabel("User name :");
     pass= new JLabel("Password :");
     city= new JLabel("City :");
     age= new JLabel("Age :");
     gender= new JLabel("Gender :");
     interest= new JLabel("From where you come to know about this ");
     remark= new JLabel("Remark :");
     nameTxt= new JTextField();
     passTxt= new JPasswordField();
     cityCbx= new JComboBox();
     ageSpin= new JSpinner(new SpinnerListModel(ages));
     genderRadio= new JRadioButton("Male");
     interestBox= new JCheckBox("internet");
     remarkArea= new JTextArea();
     savebtn= new JButton();
     cancelbtn= new JButton();
     
     pnl=new JPanel();
     
     savebtn.setText("Save");
     cancelbtn.setText("Cancel");
      
     remarkArea.setPreferredSize(new Dimension(200,200));
      
      cityCbx.addItem("Select one");
      cityCbx.addItem("Lahore");
      cityCbx.addItem("Karachi");
      cityCbx.addItem("Islamabad"); 
      cityCbx.addItem("Peshawar");
      cityCbx.addItem("Multan");
      nameTxt.setPreferredSize(new Dimension(150,15));
      passTxt.setPreferredSize(new Dimension(150,15));
      
      SpringLayout lyt = new SpringLayout();
      pnl.setLayout(lyt);
      pnl.add(name);
      pnl.add(nameTxt);
      pnl.add(pass);
      pnl.add(passTxt);
      pnl.add(city);
      pnl.add(cityCbx);
      pnl.add(age);
      pnl.add(ageSpin);
      pnl.add(gender);
      pnl.add(genderRadio);
      pnl.add(interest);
      pnl.add(interestBox);
      pnl.add(remark);
      pnl.add(remarkArea);
      pnl.add(savebtn);
      pnl.add(cancelbtn);
      
      lyt.putConstraint(SpringLayout.WEST, name, 6, SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, name, 6, SpringLayout.NORTH, pnl);
      
      lyt.putConstraint(SpringLayout.WEST, nameTxt, 6, SpringLayout.EAST, name);
      lyt.putConstraint(SpringLayout.NORTH, nameTxt, 6, SpringLayout.NORTH, pnl);
      
      lyt.putConstraint(SpringLayout.WEST, pass, 6, SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, pass, 6, SpringLayout.SOUTH, name);
      
      lyt.putConstraint(SpringLayout.WEST, passTxt, 6, SpringLayout.EAST, pass);
      lyt.putConstraint(SpringLayout.NORTH, passTxt, 6, SpringLayout.SOUTH, nameTxt);
      
      lyt.putConstraint(SpringLayout.WEST, city, 6,  SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, city, 6, SpringLayout.SOUTH, pass);
      
      lyt.putConstraint(SpringLayout.WEST, cityCbx, 6, SpringLayout.EAST, city);
      lyt.putConstraint(SpringLayout.NORTH, cityCbx, 6, SpringLayout.SOUTH, passTxt);
     
      lyt.putConstraint(SpringLayout.WEST, age, 6,  SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, age, 15, SpringLayout.SOUTH, city);
     
      lyt.putConstraint(SpringLayout.WEST, ageSpin, 6, SpringLayout.EAST, age);
      lyt.putConstraint(SpringLayout.NORTH,ageSpin, 6, SpringLayout.SOUTH, cityCbx);
     
      lyt.putConstraint(SpringLayout.WEST, gender, 6,  SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, gender, 10, SpringLayout.SOUTH, age);
     
      lyt.putConstraint(SpringLayout.WEST, genderRadio, 6, SpringLayout.EAST, gender);
      lyt.putConstraint(SpringLayout.NORTH, genderRadio, 6, SpringLayout.SOUTH, ageSpin);
     
      lyt.putConstraint(SpringLayout.WEST, interest, 6, SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, interest, 6, SpringLayout.SOUTH, gender);
     
      lyt.putConstraint(SpringLayout.WEST, interestBox, 6, SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, interestBox, 6, SpringLayout.SOUTH, interest);
     
      lyt.putConstraint(SpringLayout.WEST, remark, 6,  SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, remark, 6, SpringLayout.SOUTH, interestBox);
     
      lyt.putConstraint(SpringLayout.WEST, remarkArea, 6, SpringLayout.EAST, remark);
      lyt.putConstraint(SpringLayout.NORTH, remarkArea, 40, SpringLayout.SOUTH, interest);
     
      lyt.putConstraint(SpringLayout.WEST, savebtn, 30,  SpringLayout.WEST, pnl);
      lyt.putConstraint(SpringLayout.NORTH, savebtn, 6, SpringLayout.SOUTH, remarkArea);
     
      lyt.putConstraint(SpringLayout.WEST, cancelbtn, 6, SpringLayout.EAST, savebtn);
      lyt.putConstraint(SpringLayout.NORTH, cancelbtn, 6, SpringLayout.SOUTH, remarkArea);
       
      this.setSize(new Dimension(300,500));
      this.setTitle("Sign-Up");
      this.add(pnl);
   
    }
}