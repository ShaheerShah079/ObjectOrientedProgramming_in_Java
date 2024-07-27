
package guipractise;

import javax.swing.JOptionPane;
public class GuiPractise
{

    public static void main(String[] args)
    {
     int choice;
     do
     {
         String s;
         s=JOptionPane.showInputDialog(null, "Enter a number", "Even odd check",JOptionPane.QUESTION_MESSAGE);
                 
         int a=Integer.parseInt(s);
         if(a%2==0)
         {
             JOptionPane.showMessageDialog(null,"Enter number is even", "Message", JOptionPane.INFORMATION_MESSAGE);
         }
         else
         {
              JOptionPane.showMessageDialog(null,"Enter number is odd", "Message", JOptionPane.INFORMATION_MESSAGE);
         }
         
         choice = JOptionPane.showConfirmDialog(null, "Do You want to continue", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
     }while(choice==0);
    }
    
}
