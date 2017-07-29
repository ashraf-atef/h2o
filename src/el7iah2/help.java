




///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
package el7iah2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
//
//import com.mysql.jdbc.PreparedStatement;
//import java.io.*;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
//
//import java.net.InetAddress;
//   import java.util.Date;
//  
///**
// *
// * @author ashraf_atef
// */
//public class help {
//    static  String enc(String text)
//    {
//        String re="";
//        for (int i=0 ; i<text.length() ; i++)
//        {
//            re+=(char) ((int)(text.charAt(i))* Math.pow(5, i+5))  ;
//        
//        }
//        return re ;
//    }
//    static  String dec(String text)
//    {
//         String re="";
//        for (int i=0 ; i<text.length() ; i++)
//        {
//            re+=(char) ((int)(text.charAt(i))/ Math.pow(5, i+5))  ;
//        
//        }
//        return re ;
//    }
//    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
// String path= System.getProperty("user.home") + "/dist";
//        System.out.println(path);
////      java.io.File f=new java.io.File(path+"/customer_service_user_cookies.txt");
////      if (f.exists())
////      {
////          Scanner s=new Scanner(f);
////          if (s.hasNext())
////          {
////              String username=s.nextLine();
////              System.out.println(username);
////          }
////      }
////      else
////      {
////   PrintWriter w=new PrintWriter(f);
////   w.setapp  
////   w.append("Ashraf atef");
////     
////       w.append("cccc");
////       w.close();
//         
//  //    }
//           
//   try {
//           connection ob=new connection();
//          ob.conn("a4705017_root", "root123", "mysql10.000webhost.com");
//          
////   if (args.length != 1) {
////   System.out.println("Usage: GetTime HOST");
////   return;
////   }
////  try  {
////   Socket s = new Socket(args[0],13);
////   InputStream is = s.getInputStream();
////   while (true) {
////    byte b[] = new byte[100];
////    int i=is.read(b);
////    if (i==-1) return;
////    System.out.print(new String(b,0,i));
////    }
////   }
////  catch (Exception e)  {
////   e.printStackTrace();
////   }
////            java.sql.PreparedStatement st=ob.conn.prepareStatement("describe users");
////          //  st.setInt(1, 1);
////            ResultSet rs=st.executeQuery();
////            while(rs.next())
////            {
////                System.out.print(rs.getString(1)+",");
////            }
////          ob.stmt=ob.conn.createStatement();
////            ResultSet rs=ob.stmt.executeQuery("show tables");
////            int index=0 ;
////            while (rs.next())
////            {
//////                 ob.stmt=ob.conn.createStatement(); 
//////                 System.out.println("Alter table users add column table_"+rs.getString(1)+" int(1)");
//////                   ob.stmt.executeUpdate("Alter table users add column table_"+rs.getString(1)+" int(1)");
////                System.out.println("String "+rs.getString(1)+"="+ ++index);
////            }
////          |
////            System.out.println( "start TRANSACTION ;"+
////                    " savepoint  hhh ; "
////                    +
////                   " insert into try values (11);"
////                  + " rollback to hhh ;"
////                   + " insert into try values (11);"
////                   + " commit;");
//           //   ob.stmt.executeUpdate(    " insert into try values (1);");
//         
////              ob.stmt.executeUpdate("start TRANSACTION ;");
////                
////               ob.stmt.executeUpdate(      " savepoint  hhh ; ");
////                    //   ob.stmt.executeUpdate(    " insert into try values (1);");
////                 ob.stmt.executeUpdate(    " insert into try values (1);");
////                //   ob.stmt.executeUpdate( " rollback to hhh ;" );
////                // JOptionPane.showMessageDialog(null, "");
////                      // ob.stmt.executeUpdate("start TRANSACTION ;");
////                  
////               ob.stmt.executeUpdate(      " savepoint  hhh2 ; ");
////                    ob.stmt.executeUpdate( " insert into try values (2);");
////                   ob.stmt.executeUpdate( " rollback to hhh2 ;" );
////                    ob.stmt.executeUpdate( "commit");
////                      ob.stmt.executeUpdate( " insert into try values (88);");
////                    ob.stmt=ob.conn.createStatement();
////                   ob.stmt.executeUpdate( "commit");
////                    ob.stmt.executeUpdate( "commit");
////                    ResultSet re=ob.stmt.executeQuery("select count(*) from try");
////                    re.next();
////                    System.out.println(re.getInt(1));
//////                    
//////                    
//////                    
////                    ob.stmt.executeUpdate( " commit;" );
////                     ob.stmt.executeUpdate( " rollback to hhh ;" );
////                     ob.stmt.executeUpdate(
////                  "start TRANSACTION ;");
////               ob.stmt.executeUpdate(      " savepoint  hhh ; ");
////                    
////                ob.stmt.executeUpdate(    " insert into try values (6);");
////                   ob.stmt.executeUpdate( " rollback to hhh ;" );
////                    ob.stmt.executeUpdate( " insert into try values (6);");
////                    ob.stmt.executeUpdate( " commit;" );
//                 
//             } catch (SQLException ex) {
//            Logger.getLogger(help.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}

public class help {

    public int serach_in_model(DefaultTableModel model , int col , String value) {
        for (int i=0 ; i<model.getRowCount() ; i++)
        {
           if (String.valueOf(model.getValueAt(i, col)).equals(value))
           {
               return i ;
           }
        }
        return -1 ;
    }
   

}
    

