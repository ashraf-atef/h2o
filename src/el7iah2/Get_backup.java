/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
EAB737
*/

package el7iah2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ashraf_atef
 */
public abstract class Get_backup extends Thread{

    hr h ;
    String time_now="";
    String gmail_account=null;
    String password=null ;
    String database_name ;
    public Get_backup(hr h, String database_name ) {
       this .h=h ;
       this.database_name=database_name;
       time_now=h.m.ob.time_now();
       
    }
    static Statement stmt = null;
 public void take_backup()
 {
        try {
           
            stmt=h.m.ob.conn.createStatement();
            ResultSet rs=stmt.executeQuery("select date_backup , gmail_account , password_gmail_account , enable , enable_insert , enable_num_el23tal_in_detect_class , "
                    +" archive_siana_value , archive_el3otl_value , archive_el2st_value , archive_trkeb_value , archive_siana_gdeda_value , sort_statement"
                    + "  from information_hr");
            if (rs.next())
            {
                
            if (rs.getString(5).equals("0"))h.m.add_client.disable_insert();
            archive.archive_siana=rs.getInt(7);
            archive.archive_el3otl=rs.getInt(8);
            archive.archive_el2st=rs.getInt(9);
            archive.archive_trkeb=rs.getInt(10);
            archive.archive_siana_gdeda=rs.getInt(11);
            archive.SORT_STATEMENT = rs.getString(12);
               
                    if (time_now.equals(rs.getString(1))||h.m.ob.time_compare(rs.getString(1),time_now ))
                    {
                         JOptionPane.showMessageDialog(null, "قد تعاني من بطئ بالبرنامج حتي يتم اخد نسخه من قواعد البيانات و حفظها علي جهازك ورفعها علي حساب جوجل الخاص بك ");
                        h.login(rs.getString(4),rs.getString(6));
                        try {
                           gmail_account=rs.getString(2);
                           password=rs.getString(3);
                           
                         if (take_backup(database_name,  h.m.ob.time_now()+"-"+String.valueOf((int)(Math.random()*1000)))==true)   
                         {  stmt=h.m.ob.conn.createStatement(); stmt.executeUpdate("update information_hr set date_backup='"+h.m.ob.time(time_now,1)+"'");}
                        } catch (ParseException ex) {
                            Logger.getLogger(Get_backup.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Get_backup.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    String replace(String text)
   {
       String result="";
       
       
                for (int i=0 ; i<text.length() ; i++)
                  {
                      if (text.charAt(i)=='\\')
                      {
                         result+="\\\\"; 
                      }
                      else if (text.charAt(i)=='\'')
                      {
                         result+="''"; 
                      }
                      else result+=text.charAt(i);
                  }
           
      return result;
   }
    boolean check_pri_fore_tables(String table_name)
    {
        try {
            stmt=h.m.ob.conn.createStatement();
            ResultSet rs=stmt.executeQuery("describe  "+table_name);
            while(rs.next())
            {
                if (rs.getString(4).equals("MUL"))
                {
                    return false ;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get_backup.class.getName()).log(Level.SEVERE, null, ex);
        }
         return true ;
    }
     public  boolean take_backup(String database_name , String backup_name) 
    {
       try {
        String start_headers="";
        start_headers = "/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n" +
"/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\n" +
"/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\n" +
"/*!40101 SET NAMES utf8 */;\n" +
"/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;\n" +
"/*!40103 SET TIME_ZONE='+00:00' */;\n" +
"/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;\n" +
"/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;\n" +
"/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;\n" +
"/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;"+
                "--   ------------------------------------------------------------------------------------------------------------------ \n";
        
         String primary_tables=start_headers;
         
         String foreign_tables="";
         boolean flag_pre_fore=true ;
         String cash="";
         String records_table="";
         stmt=h.m.ob.conn.createStatement();
        ResultSet rs=stmt.executeQuery("show tables from "+database_name);
        while (rs.next())
        {
            
            String table_name=rs.getString(1); System.out.println(table_name);
           flag_pre_fore=check_pri_fore_tables(table_name);
           cash="";
            stmt=h.m.ob.conn.createStatement();
            ResultSet rs_create_table=stmt.executeQuery("show create table "+table_name);
            if (rs_create_table.next())
            {
              
               cash+=rs_create_table.getString(2);
               cash+=";\n";
              
            }
               stmt=h.m.ob.conn.createStatement();
                ResultSet rs_select=stmt.executeQuery("select * from "+table_name);
                ResultSetMetaData rsmd = rs_select.getMetaData();
               
               records_table="";
                while (rs_select.next())
                {
                    
                    records_table+="(";
                    for (int i=1 ; i<rsmd.getColumnCount() ; i++)
                    {
                        if (rs_select.getString(i)==null)
                        {
                            records_table+=null+"," ;
                        }
                        else
                        {
                              records_table+="'"+replace(rs_select.getString(i))+"',";
                        }
                    
                     
                    }
                     if (rs_select.getString(rsmd.getColumnCount())==null)
                        {
                            records_table+=null ;
                        }
                        else
                        {
                              records_table+="'"+replace(rs_select.getString(rsmd.getColumnCount()))+"'";
                        }
                   
                   
                    records_table+=")"; 
                    if (!rs_select.isLast())records_table+=",";
                    else records_table+=";";
                    records_table+="\n";
                   
                }
                if (records_table.length()!=0)
                {
                    cash+="LOCK TABLES "+table_name+" WRITE;\n";
                    cash+="insert into "+table_name+" values \n";
                    cash+=records_table;
                    cash+="UNLOCK TABLES;\n";
                }
                if (flag_pre_fore==true)
                {
                    primary_tables+=cash+"--   ------------------------------------------------------------------------------------------------------------------ \n";
                }
                else
                {
                    foreign_tables+=cash+"--   ------------------------------------------------------------------------------------------------------------------ \n" ;
                }
        }
        File directory = new File(h.path + "/H2O-backups");
        if (!directory.exists()) {
            directory.mkdir();
        }

        Writer w;
        try {
            try {
                w = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(h.path + "/H2O-backups" + "/" + backup_name + ".sql"), "UTF8"));
                try {
                    w.append(primary_tables+foreign_tables);
                    w.flush();
                    w.close();
                    JOptionPane.showMessageDialog(null, "تم الحفظ");

                } catch (IOException ex) {
                    Logger.getLogger(sort_tables_columns.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(sort_tables_columns.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {

        }
            primary_tables=null;
            foreign_tables=null ;
            records_table=null ;
            cash=null ;
            JOptionPane.showMessageDialog(null, "taking backup finished successfully");
         if (gmail_account!=null&&password!=null)  
         {
              if (gmail_account.length()!=0&&password.length()!=0)  
             h.m.ob.generateAndSendEmail(gmail_account, password, gmail_account,
                    "Backup", "", new String[]{h.path + "/H2O-backups" + "/" + backup_name + ".sql"});
              else
                  JOptionPane.showMessageDialog(null,"you doesnot have gmail account to upload backup , \n"
                                                  + "please go to database and choose table informatiom_hr \n"
                                                  + "then insert gmail account in field gmail_account");
              
         }
         else {  JOptionPane.showMessageDialog(null,"you doesnot have gmail account to upload backup , \n"
                                                  + "please go to database and choose table informatiom_hr \n"
                                                  + "then insert gmail account in field gmail_account");}
         
        return true ;
       }catch (Exception e ){
       JOptionPane.showMessageDialog(null, "Taking backup didn't finish successfully");
        JOptionPane.showMessageDialog(null, e.getMessage()+"\n"+e.toString());
       e.printStackTrace();}
        return false;
    }
    @Override
  public void run ()
  {
     take_backup();
  }
    
}
