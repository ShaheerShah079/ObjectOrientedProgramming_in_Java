/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbguiapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal's PC
 */
public class NewJFrame extends javax.swing.JFrame
{
      ResultSet rs;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        txtID = new javax.swing.JTextField();
        txtNAME = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        txtID1 = new javax.swing.JTextField();
        txtNAME1 = new javax.swing.JTextField();
        txtSalary1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtID2 = new javax.swing.JTextField();
        txtNAME2 = new javax.swing.JTextField();
        txtSalary2 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        txtID3 = new javax.swing.JTextField();
        txtNAME3 = new javax.swing.JTextField();
        txtSalary3 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btninsertActionPerformed(evt);
            }
        });

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        btnNext.setText("next");
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        btnSearch1.setText("search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btninsert)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNAME, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNAME1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSearch1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNAME2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNAME3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalary3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninsert)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnNext))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNAME2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNAME3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btninsertActionPerformed
    {//GEN-HEADEREND:event_btninsertActionPerformed
        // TODO add your handling code here:
//         System.out.println("\'"+txtID.getText()+"\'");     
//        System.out.println((txtID.getText()!=""));
//           System.out.println("\'"+txtNAME.getText()+"\'");
//           System.out.println("\'"+txtSalary.getText()+"\'");
        int x=Integer.parseInt(txtID.getText());
        String y=txtNAME.getText();
        double z =Double.parseDouble(txtSalary.getText()) ;
          
        String cS = "jdbc:derby://localhost:1527/MYDB";
        String userName="Shaheer";
        String password = "1234";
        try
        {
        Connection c=DriverManager.getConnection(cS,userName ,password);
        Statement s=c.createStatement();
        String sql="insert into shaheer.EMPLOY values("+x+","+"\'"+y+"\'"+","+z+")";
            System.out.println(sql);
        JOptionPane.showMessageDialog(this, s.execute(sql));
        c.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String cS = "jdbc:derby://localhost:1527/MYDB";
        String userName="Shaheer";
        String password = "1234";
        try
        {
        Connection c=DriverManager.getConnection(cS,userName ,password);
        c.setAutoCommit(false);
        Statement s=c.createStatement();
        String sql="select * from shaheer.EMPLOY";
//            System.out.println(sql);
       rs=s.executeQuery(sql);
       rs.next();
       txtID1.setText(rs.getString("ID"));
        txtNAME1.setText(rs.getString("NAME"));
         txtSalary1.setText(rs.getString("SALARY"));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        // TODO add your handling code here:
        try{
               rs.next();
       txtID1.setText(rs.getString("ID"));
        txtNAME1.setText(rs.getString("NAME"));
         txtSalary1.setText(rs.getString("SALARY")); 
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearch1ActionPerformed
    {//GEN-HEADEREND:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
//           System.out.println((!("".equals(txtID2.getText()))));    
//            System.out.println((!("".equals(txtNAME2.getText())))); 
//              System.out.println((!("".equals(txtSalary2.getText())))); 
        String cS = "jdbc:derby://localhost:1527/MYDB";
        String userName="Shaheer";
        String password = "1234";
        try
        {
        Connection c=DriverManager.getConnection(cS,userName ,password);
        c.setAutoCommit(false);
        Statement s=c.createStatement();
        if((!("".equals(txtID2.getText()))))
        {
            int x=Integer.parseInt(txtID2.getText());
            String sql="SELECT * FROM SHAHEER.EMPLOY where id="+x;
            System.out.println(sql);
       rs=s.executeQuery(sql);
       rs.next();
        }
                
       else if((!("".equals(txtNAME2.getText()))))
        {
              String y=txtNAME2.getText();
       String sql="select * from shaheer.EMPLOY where NAME='"+y+"'";
       rs=s.executeQuery(sql);
       rs.next();
        }
        
       else if((!("".equals(txtSalary2.getText()))))
        {
         double z =Double.parseDouble(txtSalary2.getText()) ;
          String sql="select * from shaheer.EMPLOY where SALARY="+z;
       rs=s.executeQuery(sql);
       rs.next();
        }
       txtID2.setText(rs.getString("ID"));
        txtNAME2.setText(rs.getString("NAME"));
         txtSalary2.setText(rs.getString("SALARY"));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        } 
        
        
        
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String cS = "jdbc:derby://localhost:1527/MYDB";
        String userName="Shaheer";
        String password = "1234";
        try
        {
        Connection c=DriverManager.getConnection(cS,userName ,password);
        c.setAutoCommit(false);
        Statement s=c.createStatement();
        if((!("".equals(txtID3.getText()))))
        {
            int x=Integer.parseInt(txtID3.getText());
            String sql="delete FROM SHAHEER.EMPLOY where id="+x;
            System.out.println(sql);
       s.execute(sql);
        }
       else if((!("".equals(txtNAME3.getText()))))
        {
              String y=txtNAME3.getText();
       String sql="delete from shaheer.EMPLOY where NAME='"+y+"'";
       s.execute(sql);
       
        }
        
       else if((!("".equals(txtSalary3.getText()))))
        {
         double z =Double.parseDouble(txtSalary3.getText()) ;
          String sql="delete from shaheer.EMPLOY where SALARY="+z;
       s.execute(sql);
        }
//        c.close();
//       txtID2.setText(rs.getString("ID"));
//        txtNAME2.setText(rs.getString("NAME"));
//         txtSalary2.setText(rs.getString("SALARY"));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        } 
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btninsert;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtID3;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextField txtNAME1;
    private javax.swing.JTextField txtNAME2;
    private javax.swing.JTextField txtNAME3;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSalary1;
    private javax.swing.JTextField txtSalary2;
    private javax.swing.JTextField txtSalary3;
    // End of variables declaration//GEN-END:variables
}
