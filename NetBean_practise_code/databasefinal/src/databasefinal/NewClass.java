/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasefinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Personal's PC
 */
public class NewClass
{
   static ResultSet rs;
    public static void main(String[] args)
    {
//       int x=43;
//       String y="Farhan bhai";
//       double z=1234.2;
//       
       String cs="jdbc:derby://localhost:1527/MYNew";
       String name ="ShaheerAli";
       String pass="12345";
      try
       { 
           
       Connection con = DriverManager.getConnection(cs,name,pass);
       Statement st=con.createStatement();
     String sql="Select *from SHAHEERALI.UNTITLED";
       
           System.out.println(sql);
       rs=st.executeQuery(sql);
       con.setAutoCommit(false);
           
       rs.next();
       
           System.out.println(rs.getInt("Id"));
       
       
       
       
       
       
       }
       catch(Exception e)
       {
           System.out.println("ecee");
       }
    }

 
}
