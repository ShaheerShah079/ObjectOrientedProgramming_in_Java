/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprac1;

import javax.swing.JOptionPane;
class GUIprac1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     int a=20,b=60;
     
        String [] s={"lahore","multan","gujranwala","abbotabada"};
//        JOptionPane.showInputDialog(null, "Enter a value","title",JOptionPane.WARNING_MESSAGE, null,null, "nulmber only");
        String s1=(String)JOptionPane.showInputDialog(null, "enter a value", "Title", JOptionPane.WARNING_MESSAGE, null, s ,s[0]);
    
        System.out.println(s1);
    
    }
    
}
