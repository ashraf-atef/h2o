  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import com.sun.corba.se.spi.ior.Writeable;
import java.awt.Label;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.PasswordAuthentication;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jxl.Cell;
import jxl.CellFormat;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Ashraf
 */
public class connection {
public void toExcel(JTable table){
    try{
        JFileChooser ch=new JFileChooser();
        String path="";
        
        if (ch.showOpenDialog(null)==ch.OPEN_DIALOG)
        {
           path=String.valueOf(ch.getSelectedFile()) ;
        }
        TableModel model = table.getModel();
        FileWriter excel = new FileWriter(new File(path+".xlsx"));

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + "\t");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                String text=String.valueOf(model.getValueAt(i,j));
                 //system.out.println(text);
                if (text!=null){
                excel.write(text+"\t");
                }
                else
                {
                     excel.write(""+"\t");
                }
               
            }
            excel.write("\n");
        }

        excel.close();

    }catch(IOException e){ 
        //system.out.println(e); 
    }
}
public void write_excel(JTable table) throws IOException, WriteException
{
    
    JFileChooser ch=new JFileChooser();
        String path="";
        
        if (ch.showOpenDialog(null)==ch.OPEN_DIALOG)
        {
           path=String.valueOf(ch.getSelectedFile()) ;
        }
        TableModel model = table.getModel();
        File f= new File(path+".xls");
     WritableWorkbook myexcel= Workbook.createWorkbook(f);
     WritableSheet sheet=myexcel.createSheet("myshete",0);
     jxl.write.Label l=null ;
     
     
     
     
     
     
      for(int i = 0; i < model.getColumnCount(); i++){
           l=new jxl.write.Label (i,0  ,model.getColumnName(i).toString());
           
           sheet.addCell(l);  
           
           
        
        }
     for (int i=0 ; i<model.getRowCount() ; i++)
     {
          //system.out.println("excel");
         for (int g=0 ; g<model.getColumnCount() ; g++)
         {
       
//             WritableCellFormat newFormat = null;
//
//Cell readCell = sheet.getCell(g, i); //read format from another cell(if you want to copy its existing properties otherwise you can ignore).
//WritableCellFormat cellFormatObj = new WritableCellFormat(
//                    );
//CellFormat readFormat = (CellFormat) (readCell.getCellFormat() == null ? cellFormatObj
//        : readCell.getCellFormat());
//newFormat = new WritableCellFormat(readFormat);
//newFormat.setBackground(Colour.WHITE);
//newFormat.setBorder(jxl.format.Border.BOTTOM,jxl.format.BorderLineStyle.THIN);
//newFormat.setAlignment(Alignment.CENTRE);
          
             
             
              String t=String.valueOf(model.getValueAt(i, g));
              if (t!=null)
              l=new jxl.write.Label (g,i+1  ,t);
              else 
                 l=new jxl.write.Label (g,i+1  ,"");  
            
        //      l.setCellFormat(newFormat);
          sheet.addCell(l);   
          
         
         } 
         //system.out.println("i");
       
     } 
     myexcel.write();
     myexcel.close();
     
}
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static Connection conn = null;
    static Statement stmt = null;

    // String unicode= "?useUnicode=true&amp;characterEncoding=utf8 ";
    void conn(String user_name, String password,String ip,String database_name) throws ClassNotFoundException, SQLException {
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true";
       
        final String DB_URL = "jdbc:mysql://" + ip + "/"+database_name;
        final String USER = user_name;
        final String PASS = password;

      
        Class.forName("com.mysql.jdbc.Driver");

        conn = DriverManager.getConnection(DB_URL + unicode, USER, PASS);
//        stmt = conn.createStatement();
//        stmt.executeUpdate(" SET SESSION wait_timeout = 28800");
        stmt = conn.createStatement();
        //system.out.println("Connecting to database...");
    }
    //wmic bios get serialnumber
 String serial()
    {String serial ="";
        try {
            Process process = Runtime.getRuntime().exec(new String[] { "wmic", "bios", "get", "serialnumber" });
            process.getOutputStream().close();
            Scanner sc = new Scanner(process.getInputStream());
            String property = sc.next();
            serial = sc.next();
            //system.out.println(property + ":" + serial);
            
        } catch (Exception ex) {
           
        }
        return  serial ;
    }
 // wmic memorychip get serialnumber
 String serial_2()
    {String serial ="";
        try {
            Process process = Runtime.getRuntime().exec(new String[] { "wmic", "memorychip", "get", "serialnumber" });
            process.getOutputStream().close();
            Scanner sc = new Scanner(process.getInputStream());
            String property = sc.next();
            serial = sc.next();
            //system.out.println(property + ":" + serial);
            
        } catch (Exception ex) {
        
        }
        return  serial ;
    }
    String c(String region) throws SQLException {
        stmt = conn.createStatement();
String country = "";
     
        ResultSet rs2 = stmt.executeQuery(  "select country from countries where region=" + "'" + region + "'");
      if (rs2.next()) 
      {
      country=    rs2.getString("country");
      }
        
        //system.out.println("select country from countries where region=" + "'" + region + "'" + "      "+country);
       
        return country;
    }

 public    boolean check_int(String num) {
        boolean flag = true;
        try {
            double int_num = Double.parseDouble(num);
            flag = true;
            //joptionpanee.showMessageDialog(null,num);
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    ResultSet search_client(String key) throws SQLException {
        stmt = conn.createStatement();
        //system.out.println("select* from clients where name_client like '" + key + "%'");
        ResultSet rs = stmt.executeQuery("select * from clients where name_client like '%" + key + "%'");

        return rs;
    }

    ResultSet search_id_client(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from clients where id_client=" + key);

        return rs;
    }

    ResultSet search_region_client(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from client where region like '" + key + "%'");

        return rs;
    }

    ResultSet search_product(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from product where name_product like '%" + key + "%'");

        return rs;
    }

    ResultSet search_id_product(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from product where id_product=" + key);


        return rs;
    }

    ResultSet search_elfne(String key) throws SQLException {

        ResultSet rs = stmt.executeQuery("select* from elfne where name_elfne like '%" + key + "%'");
        //   //system.out.println("select* from elfne where name_elfne like '"+key+"%'");

        return rs;
    }

    ResultSet search_id_elfne(String key) throws SQLException {
        ResultSet rs = stmt.executeQuery("select* from elfne where id_elfne=" + key);


        return rs;
    }

    ResultSet search_elmndob(String key) throws SQLException {

        ResultSet rs = stmt.executeQuery("select* from elmndob where name_elmndob like '%" + key + "%'");

        return rs;
    }
    ResultSet search_elmndob_elwaset(String key) throws SQLException {

        ResultSet rs = stmt.executeQuery("select* from elmndob_elwaset where name_elmndob_elwaset like '%" + key + "%'");

        return rs;
    }

    ResultSet search_id_elmndob(String key) throws SQLException {
        ResultSet rs = stmt.executeQuery("select* from elmndon where id_elmndob=" + key);


        return rs;
    }

    String time(String date, int value) throws ParseException {

        String untildate = date;//can take any date in current format    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(untildate));
        cal.add(Calendar.DATE, value);
        String convertedDate = dateFormat.format(cal.getTime());
        //system.out.println("Date increase by one.." + convertedDate);
        return convertedDate;
    }
   

    String time_year(String date, int value) throws ParseException {

        String untildate = date;//can take any date in current format    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(untildate));
        cal.add(Calendar.YEAR, value);
        String convertedDate = dateFormat.format(cal.getTime());
        //system.out.println("Date increase by one.." + convertedDate);
        return convertedDate;
    }

    String time_month(String date, int value)  {
 String convertedDate ="";
        try {
        String untildate = date;//can take any date in current format    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(untildate));
        cal.add(Calendar.MONTH, value);
         convertedDate = dateFormat.format(cal.getTime());
        //system.out.println("Date increase by one.." + convertedDate);
}catch (Exception e){}
        return convertedDate;
    }

    public boolean check_time(String date)  {
        boolean flag = true;

        if (date.contains("0000")) {
            flag = false;

        } else {
            try {
                String untildate = date;//can take any date in current format    
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                cal.setTime(dateFormat.parse(untildate));

            } catch (Exception w) {
                flag = false;
            }

        }
       
        return flag;
    }

    boolean time_compare(String date1, String date2)  {

      
        if (!date1.startsWith("0"))
        {
            try {

                String untildate1 = date1;
                String untildate2 = date2;//can take any date in current format    
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(dateFormat.parse(untildate1));

                SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal2 = Calendar.getInstance();
                cal2.setTime(dateFormat2.parse(untildate2));
             
                if (cal1.before(cal2)) {
                  return true ;
                 
                }

            } catch (Exception e) {
            }

        }
       return false ;
    }

    boolean time_compare_hours(String time1, String time2) throws ParseException {

        boolean flag = false;

        {
            try {

                String untildate1 = time1;
                String untildate2 = time2;//can take any date in current format   
                //joptionpanee.showMessageDialog(null,untildate1+" "+untildate2 );
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(dateFormat.parse(untildate1));

                SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
                Calendar cal2 = Calendar.getInstance();
//cal1.setTime( dateFormat.parse(untildate2));
                cal2.setTime(dateFormat2.parse(untildate2));

                if (cal1.after(cal2)) {
                    flag = true;
                    //system.out.println("date true" + cal1 + " " + cal2);
                }
//String convertedDate=dateFormat.format(cal.getTime());    
////system.out.println("Date increase by one.."+convertedDate);
//return convertedDate ;
            } catch (Exception e) {
            }

        }
        return flag;
    }

    boolean time_compare_hours_before(String time1, String time2) throws ParseException {

        boolean flag = false;

        {
            try {

                String untildate1 = time1;
                String untildate2 = time2;//can take any date in current format   
                //joptionpanee.showMessageDialog(null,untildate1+" "+untildate2 );
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(dateFormat.parse(untildate1));

                SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
                Calendar cal2 = Calendar.getInstance();
//cal1.setTime( dateFormat.parse(untildate2));
                cal2.setTime(dateFormat2.parse(untildate2));

                if (cal1.before(cal2)) {
                    flag = true;
                    //system.out.println("date true" + cal1 + " " + cal2);
                }
//String convertedDate=dateFormat.format(cal.getTime());    
////system.out.println("Date increase by one.."+convertedDate);
//return convertedDate ;
            } catch (Exception e) {
            }

        }
        return flag;
    }

    String time_now() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        c.setTime(c.getTime()); // Now use today date.

        String output = sdf.format(c.getTime());
        //system.out.println(output);
        return output;
    }
     String get_month() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar c = Calendar.getInstance();
        c.setTime(c.getTime()); // Now use today date.

        String output = sdf.format(c.getTime());
        //system.out.println(output);
        return output;
    }

    String time_now_hours() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Calendar c = Calendar.getInstance();
        c.setTime(c.getTime()); // Now use today date.

        String output = sdf.format(c.getTime());
        //system.out.println(output);
        return output;
    }

    public boolean check_time_hours(String time, int value) throws ParseException {

        boolean flag = true;
        try {
            String untildate = time;//can take any date in current format    
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateFormat.parse(untildate));

            

        } catch (Exception w) {
            flag = false;
        }
        //joptionpanee.showMessageDialog(null," "+flag);
        return flag;
    }

    String abstract_time_hours(String time1, String time2) throws ParseException {//joptionpanee.showMessageDialog(null, time1+ " "+time2);
        //          main d=new main();
//      d.model_employee_el7dor.addRow(new Object[]{"123","shrfjdsf","4652457"});
//      //joptionpanee.showMessageDialog(null, d.jTable_employee_el7dor.getValueAt(0, 0));
        String convertedDate = "";
        try {
            String untildate = time1;//can take any date in current format    
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateFormat.parse(untildate));

            String untildate2 = time2;//can take any date in current format    
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(dateFormat2.parse(untildate2));

            long diff = cal2.getTimeInMillis() - cal.getTimeInMillis();
//joptionpanee.showMessageDialog(null,diff);
            float dayCount = (float) diff / (60 * 60 * 1000);
//joptionpanee.showMessageDialog(null,dayCount);
            convertedDate = String.valueOf(dayCount);
    //        System.out.println("Date increase by one.." + convertedDate);


        } catch (Exception w) {
        }

        return convertedDate;
    }

    
    public boolean check_abstract_time_hours(String time1, String time2) throws ParseException {
        //          main d=new main();
//      d.model_employee_el7dor.addRow(new Object[]{"123","shrfjdsf","4652457"});
//      //joptionpanee.showMessageDialog(null, d.jTable_employee_el7dor.getValueAt(0, 0));
        boolean flag = true;
        try {
            String untildate = time1;//can take any date in current format    
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateFormat.parse(untildate));

            String untildate2 = time2;//can take any date in current format    
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(dateFormat2.parse(untildate2));

            if (cal.before(cal2)) {
                flag = true;
            } else {
                flag = false;
            }

        } catch (Exception w) {
        }

        return flag;
    }
    public String []get_start_end_of_month()
    { String days[]=new String[2]; 
       days[0]=get_month()+"-01";
    try {
        days[1]=time(time_month(days[0], 1), -1) ;
    } catch (ParseException ex) {
        Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
    }
      return days ;
    }
   
  

    public boolean check_insert_client(String id_client) 
    {
        try {
        ResultSet rs = stmt.executeQuery("select id_client from clients where id_client=" + id_client);

            if (!rs.next()) {
                return  true ;
               
            }

        } catch (Exception e) {
        } 
        JOptionPane.showMessageDialog(null, "كود العميل موجود بالفعل");
        return false;

    }

    public boolean check_insert_region(String region
           )  {

 try {

        stmt = conn.createStatement();
        ResultSet rs2 = stmt.executeQuery("select region from countries where region= '" + region + "'");
        
       if (!rs2.next()) 
       {
          return  true ;
       }
      
        } catch (Exception e) {
        }
 JOptionPane.showMessageDialog(null, "عفوا هذا المركز موجود بالفعل من فضلك قم بختياره من الجدول");
        return false;
 
    }
    String 
            insert_region(String region,String country)
    {
        String return_stmt="";
         try {
            
                    stmt.executeUpdate("insert into countries values ('" + region
                            + "','" + country + "')");
              
            } catch (Exception e) {
                 return_stmt="E";
                JOptionPane.showMessageDialog(null, "خطأ بأدخال اسم المركز و المحافظه");
              

            }
       return  return_stmt ;
    }

  String insert_clients(String id_client,
            String name_client,
            String job,
           
           String phone
           ) {
        String return_stmt = "";

        try {

           


           
            stmt.executeUpdate("insert into clients values (" + id_client
                    + "," + "'" + name_client + "'" + "," + "'"
                    + job + "'" +  ",'" + phone + "')");



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"عفوا لم يتم أدخال العميل");
           return_stmt="E";
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return return_stmt;


    }

    public boolean check_insert_product(String id_product
    ) {
        ResultSet rs;
        try {
            rs = stmt.executeQuery("select id_product from product where id_product=" + id_product);
            if (!rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "كود المنتج موجود بالفعل");
        return false;
    }

    String insert_into_product(
            String id_product,
            String name_product,
            String type,
            String price,
            String elmokdm,
            String el2st, String all_quantity) {
        String return_stmt = "";


//        //system.out.println("insert into product values (" + id_product
//                + "," + "          '" + name_product + "'         " + ","
//                + type + "," + price + ","
//                + elmokdm + ","
//                + el2st + "," + all_quantity + ")");
        try {
            stmt.executeUpdate("insert into product values (" + id_product
                    + "," + "          '" + name_product + "'         " + ","
                    + type + "," + price + ","
                    + elmokdm + ","
                    + el2st + "," + all_quantity + ")");
        } catch (Exception e) {
            return_stmt="E";
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات المنتج");
            return_stmt += "خطأ بأدخال بيانات المنتج";
        }




        return return_stmt;
    }

    public boolean check_insert_elmndob(String id_elmndob)  {

    try {
        ResultSet rs = stmt.executeQuery("select id_elmndob from elmndob where id_elmndob=" + id_elmndob);
        if (!rs.next())
            
        {
            return true  ;
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
    }
    JOptionPane.showMessageDialog(null, "كود المندوب موجود بالفعل");
    return false;
    }
    
    public boolean check_insert_elmndob_elwaset(String id_elmndob_elwaset
    ) {

        try {
            ResultSet rs = stmt.executeQuery("select id_elmndob_elwaset from elmndob_elwaset where id_elmndob_elwaset=" + id_elmndob_elwaset);
            if (!rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "كود المندوب الوسيط موجود بالفعل");
        return false;
    }

    String insert_into_elmndob(
           
            String id_elmndob,
            String name_elmndob,
            String phone_elmndob) {
        String return_stmt = "";


        //system.out.println("insert into elmndob values (" + id_elmndob
//                + ",'" + name_elmndob + "',"
//                + phone_elmndob + ")");

        try {
            stmt.executeUpdate("insert into elmndob values ("+ id_elmndob
                    + ",      '" + name_elmndob + "'        ,"
                    + phone_elmndob + ")");
        } catch (Exception e) {
             return_stmt="E";
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات المندوب");
            return_stmt += "خطأ بأدخال بيانات المندوب";
        }



        return return_stmt;
    }
    String insert_into_elmndob_elwaset(
           
            String id_elmndob_elwaset,
            String name_elmndob_elwaset,
            String phone_elmndob_elwaset) {
        
 String return_stmt="";

       
        try {
          
            stmt.executeUpdate("insert into elmndob_elwaset values ("+ id_elmndob_elwaset
                    + ",      '" + name_elmndob_elwaset + "'        ,'"
                    + phone_elmndob_elwaset + "')");
//              //system.out.println("insert into elmndob_elwaset values ("+ id_elmndob_elwaset
//                    + ",      '" + name_elmndob_elwaset + "'        ,'"
//                    + phone_elmndob_elwaset + "')");
        } catch (Exception e) {
             return_stmt="E";
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات المندوب الوسيط");
           
        }

return  return_stmt;

      
    }

    public boolean check_insert_elfne(String id_elfne
           )  {
        ResultSet rs;
    try {
        rs = stmt.executeQuery("select id_elfne from elfne where id_elfne=" + id_elfne);
        
         if (!rs.next())
         { 
         return true ;
         }
        
    } catch (SQLException ex) {
        Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
    }
    JOptionPane.showMessageDialog(null, "كود الفني موجود بالفعل");
      return false ;
       
    }

    String insert_into_elfne(
            String id_elfne,
            String name_elfne,
            String phone_elfne,
            String places) {
        String return_stmt = "";



//      
//        //system.out.println("insert into elfne values (" + id_elfne
//                + ",'" + name_elfne + "',"
//                + phone_elfne
//                + ",'" + places + "'" + ")");

        try {
            stmt.executeUpdate("insert into elfne values (" + id_elfne
                    + ",      '" + name_elfne + "'        ,"
                    + phone_elfne
                    + ",'" + places + "'" + ")");
        } catch (Exception e) {
             return_stmt="E";
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات الفني");
            return_stmt += "خطأ بأدخال بيانات الفني";
        }



        return return_stmt;
    }

    String insert_into_clients_product(
            String id_client,
            String id_product,
            String quantity,
            String date_buy,
            String date1,
            String date2,
            String date3,
            String date5,
            String date6,
            String date7,
            String rsed1,
            String rsed2,
            String rsed3,
            String rsed5,
            String rsed6,
            String rsed7,
            String hints,
            String nezam_eldf3,
            String date_el2st,
            String elba2e,
            String id_elmndob,
            String id_elfne,
            String wrongs
            , String clas
            , String elb2e_siana
            , String siana_1
            , String siana_2
            , String siana_3
            , String siana_5
            , String siana_6
            , String siana_7
            , String date_remake_class 
            , String num_month_remake_class 
            , String elmosthdaf
            ,String id_elmndob_elwaset
             ,String home_num,
            String street, 
            
            String region
            
            , String result ,
            String old_quantity ,
            String old_elb2e ,
             String total_elb2e ,
             String rsed1_ ,
            String rsed2_ ,
            String rsed3_ ,
            String rsed_5 ,
            String rsed_6,
            String rsed_7 ,
             String date_el2st_old 
            
            ) {
        String return_stmt = "";
   
          



            if (result.length() == 0) {

                try {
                  
                    stmt.executeUpdate("insert into clients_product values (" + "default , "+id_client
                        + "," + id_product + ","
                        + quantity
                        + ",'" + date_buy + "'" + ",'" + date1 + "'" + ",'" + date2 + "'"
                        + ",'"+date3+"','"+ date5 + "'" + ",'" + date6 + "','"+date7+"'," + id_elfne + ",'" + hints + "',"
                        + id_elmndob + "," + nezam_eldf3 + ",'" + date_el2st + "'," + elba2e + "," +
                            //null + ",'0001-01-01'"+","+
                        rsed1+","+rsed2+","+rsed3+","+rsed5+","+rsed6+","+rsed7+",'"+clas+"',"+elb2e_siana+","+siana_1+","+siana_2+","+siana_3
                            +","+siana_5+","+siana_6+","+siana_7+
                            //",'"
                            //+"0001-01-01"+
                            ",'"+date_remake_class+"',"+num_month_remake_class+","+
                        elmosthdaf+","+id_elmndob_elwaset +","+home_num+",'"+street+"','"+region+"'"+
                         ")");
                } catch (Exception e) {
                     return_stmt="E";
                       System.out.println(e.getMessage());
                  JOptionPane.showMessageDialog(null,"عفوا لم يتم تسجيل العميل بجدول خدمه العملاء");
                    return_stmt += " خطأ بأخال بيانات العميل التي تخص المنتج مع العميل";
                    
                }
            } else {
//                System.out.println("result :"+result);
//                JOptionPane.showMessageDialog(null, "يوجد عميل موجود بالفعل بذلك البيانات في جدول خدمه العملاء لذالك تم تعديل عدد الأجهزه لذلك العميل "
//                +"\n"+" و تجميع المبالغ المتبقيه و الأرصده");
                double new_quantity = Double.parseDouble(old_quantity) + Double.parseDouble(quantity);
                double new_elb2e = Double.parseDouble(old_elb2e) + Double.parseDouble(elba2e);
                double total_sia=Double.parseDouble(total_elb2e) + Double.parseDouble(elb2e_siana);
                 double r1=Double.parseDouble(rsed1) + Double.parseDouble(rsed1_);
                 double r2=Double.parseDouble(rsed2) + Double.parseDouble(rsed2_);
                 double r3=Double.parseDouble(rsed3) + Double.parseDouble(rsed3_);
                 double r5=Double.parseDouble(rsed5) + Double.parseDouble(rsed_5);
                 double r6=Double.parseDouble(rsed6) + Double.parseDouble(rsed_6);
                 double r7=Double.parseDouble(rsed7) + Double.parseDouble(rsed_7);
//                //system.out.println("update clients_product set quantity ="
//                        + String.valueOf(new_quantity) + " , elb2e =" + String.valueOf(new_elb2e) + " where id_client=" + id_client + " and id_product="
//                        + id_product + " and date_buy= '"
//                        + date_buy + "'");
                 String date_el2st_new="";
                 if (Double.parseDouble(old_elb2e)!=0)date_el2st_new=date_el2st_old;
                 else if (Double.parseDouble(elba2e)!=0)date_el2st_new=date_el2st;
                 else date_el2st_new=date_el2st;
                try {
                    stmt.executeUpdate("update clients_product set quantity ="
                            + String.valueOf(new_quantity) + " , elb2e =" + new_elb2e +
                            ", total_elb2e_sian="+total_sia+",rsed1="+r1+",rsed2="+r2+",rsed3="+r3+",rsed5="+r5+
                            ",rsed6="+r6+",rsed7="+r7+" , date_el2st='"+date_el2st_new+"' "+" where id_client=" + id_client + " and id_product="
                            + id_product + " and date_buy= '"
                            + date_buy + "'");
                } catch (Exception e) {
                      System.out.println(e.getMessage());
                     return_stmt="E";
                    JOptionPane.showMessageDialog(null, "خطأ بدخال بيانات العميل مع المنتج");
                    return_stmt += " خطأ بأخال بيانات العميل التي تخص المنتج مع العميل";
                }

            }
      
        return return_stmt;
    }

    String insert_into_trkeb(
            String table_name 
            ,
            String id_client,
            String id_product,
            String quantity,
            String hints,
            String nezam_eldf3,
            String id_elmndob, String date_regist
            , String clas
            ,  String siana_1
            , String siana_2
            , String siana_3
            , String siana_5
            , String siana_6
            , String siana_7
            , String trkeb_dead_line
            , String num_month
            , String elmosthdaf
            ,String id_elmndob_elwaset
            , String home_num,
            String street, 
            
            String region
            , String result , String old_quantity
            ) {
        String return_stmt = "";

    

        
            //system.out.println("result  " + result);

//            System.out.println("select id_client ,quantity"
//                    + " from trkeb where id_client=" + id_client + " and id_product=" + id_product + " ");


            if (result.length() == 0) {


//                System.out.println("insert into trkeb values (" + id_client
//                        + "," + id_product + ","
//                        + quantity
//                        + ",'" + hints + "',"
//                        + id_elmndob + "," + nezam_eldf3 + ",'" + date_regist + "','"+clas+"'"+","+siana_1+","+siana_2+","+siana_3
//                            +","+siana_5+","+siana_6+","+siana_7
//                        + ")");

                try {
                    stmt.executeUpdate("insert into "+table_name+" values (" +"default , "+ id_client
                        + "," + id_product + ","
                        + quantity
                        + ",'" + hints + "',"
                        + id_elmndob + "," + nezam_eldf3 + ",'" + date_regist + "','"+clas+"'"+","+siana_1+","+siana_2+","+siana_3
                            +","+siana_5+","+siana_6+","+siana_7+",'"+trkeb_dead_line+"',"+num_month+","+elmosthdaf+","+id_elmndob_elwaset
                        +","+home_num+",'"+street+"','"+region+"'"+ ")");
//                    System.out.println("insert into trkeb values (" + id_client
//                        + "," + id_product + ","
//                        + quantity
//                        + ",'" + hints + "',"
//                        + id_elmndob + "," + nezam_eldf3 + ",'" + date_regist + "','"+clas+"'"+","+siana_1+","+siana_2+","+siana_3
//                            +","+siana_5+","+siana_6+","+siana_7
//                        + ")");
                } catch (Exception e) {
                     return_stmt="E";
                   JOptionPane.showMessageDialog(null,"خطأ بأدخال بيانات العميل التي تخص خدمه العملاء");
               
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                 
                }
            } else {
                double new_quantity = Double.parseDouble(old_quantity) + Double.parseDouble(quantity);
                //system.out.println("update trkeb set quantity ="
//                        + String.valueOf(new_quantity) + " where id_client=" + id_client + " and id_product="
//                        + id_product);
                try {
                    stmt.executeUpdate("update "+table_name+" set quantity ="
                            + String.valueOf(new_quantity) + " where id_client=" + id_client + " and id_product="
                            + id_product);
                } catch (Exception e) {
                     return_stmt="E";
                    JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات العميل التي  خدمه العملاء");
                 
                }
            }


       

        return return_stmt;
    }

    public boolean check_inseret_selling(String id_operation) throws SQLException {
        boolean flag = true;
        String result = "";
        ResultSet rs = null;

        rs = stmt.executeQuery("select id_operation from selling where id_operation=" + id_operation);

        rs.next();
        try {
            result = String.valueOf(rs.getString("id_operation"));
        } catch (Exception e) {
        }
        //system.out.println("select id_operation from selling where id_operation=" + id_operation);
        //system.out.println(result);
        if (result.length() != 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "كود الفتوره موجود بالفعل");
        }
        return flag;
    }

    String insert_into_selling(
            String id_operation,
            String name_operation,
            
            String quantity,
            String price_operation,
            String eltiok3,
            String date_selling) throws SQLException {
        String return_stmt = "";


        try {
            stmt.executeUpdate("insert into selling values (" + id_operation + ",'" + name_operation + "'," + quantity + "," + price_operation + ","
                    + eltiok3 + ",'" + date_selling + "')");
        } catch (Exception e) {
            return_stmt += "خطأ بأدخال بيانات الفتوره";
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات الفتوره");
        }
        //system.out.println("select id_operation from selling where id_operation=" + id_operation);
        //system.out.println("insert into selling values (" + id_operation + ",'" + name_operation + "'," + price_operation + ","
        //        + eltiok3 + ",'" + date_selling + "')");


        return return_stmt;
    }

    String insert_into_selling_elfne(
            String id_elfne,
            String id_operation) throws SQLException {
        String return_stmt = "";
        //system.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        String result = "";
        //system.out.println("select id_operation from selling_elfne where id_operation=" + id_operation + " and id_elfne =" + id_elfne);
        ResultSet rs = stmt.executeQuery("select id_operation from selling_elfne where id_operation=" + id_operation + " and id_elfne =" + id_elfne);
        rs.next();
        //system.out.println("select id_operation from selling_elfne where id_operation=" + id_operation + " and id_elfne =" + id_elfne);
        try {
            result = String.valueOf(rs.getString("id_operation"));
            //system.out.println("errorrrrrrrrrrrrrrrrrrrrrrr");
        } catch (Exception e) {
            //system.out.println("empty elfne_selling");
        }
        //system.out.println(result);
        if (result.length() == 0) {
            try {
                stmt.executeUpdate("insert into selling_elfne values (" + id_operation + "," + id_elfne + ")");
            } catch (Exception e) {
                return_stmt += "خطأ بأخال كود الفني او الفتوره";
            }
        } else {
            return_stmt += "كود الفني و الفتوره موجود بالفعل";
        }
        //system.out.println("select id_operation from selling_elfne where id_operation=" + id_operation + " and id_elfne =" + id_elfne);
        //system.out.println("insert into selling_elfne values (" + id_operation + "," + id_elfne + ")");
        return return_stmt;
    }

    String insert_into_selling_elmndob(
            String id_elmndob,
            String id_operation) throws SQLException {
        String return_stmt = "";


        String result = "";
        ResultSet rs = stmt.executeQuery("select id_operation from selling_elmndob where id_operation=" + id_operation + " and id_elmndob =" + id_elmndob);
        rs.next();
        try {
            result = String.valueOf(rs.getString("id_operation"));
        } catch (Exception e) {
            //system.out.println("empty elmndob_selling");
        }
        //system.out.println(result);
        if (result.length() == 0) {
            try {
                stmt.executeUpdate("insert into selling_elmndob values (" + id_operation + "," + id_elmndob + ")");
            } catch (Exception e) {
                return_stmt += "خطأ بأدخال كود المندوب او الفتوره";
            }
        } else {
            return_stmt += "كود المندوب و الفتروه موجود بالفعل";
        }
        //system.out.println("select id_operation from selling_elmndob where id_operation=" + id_operation + " and id_elmndob =" + id_elmndob);
        //system.out.println("insert into selling_elmndob values (" + id_operation + "," + id_elmndob + ")");

        return return_stmt;
    }

    void update_into_product(
            String id_product,
            String quantity,
            int option) throws SQLException {



        String result_quantity = "";
        ResultSet rs = stmt.executeQuery("select quantity from product where id_product=" + id_product);
        rs.next();
        result_quantity = String.valueOf(rs.getString("quantity"));
        String new_quantity = "";
        if (option == 0) {
            new_quantity = String.valueOf(Double.parseDouble(result_quantity) - Double.parseDouble(quantity));
        } else {
            new_quantity = String.valueOf(Double.parseDouble(result_quantity) + Double.parseDouble(quantity));
        }
        try {
            stmt.executeUpdate("update product set quantity = " + new_quantity + " where id_product=" + id_product);
        } catch (Exception e) {
            //system.out.println("error in update quantity");
        }

        //system.out.println("select quantity from product where id_product=" + id_product);
        //system.out.println("update product set quantity = " + new_quantity + " where id_product=" + id_product);

    }

    void update_into_cash(
            String price_operation,
            int option) throws SQLException {



        String result_cash = "";
        ResultSet rs = stmt.executeQuery("select* from cash ");
        rs.next();
        result_cash = String.valueOf(rs.getString("cash_availble"));
        String new_cash = "";
        if (option == 0) {
            new_cash = String.valueOf(Double.parseDouble(result_cash) - Double.parseDouble(price_operation));
        } else {
            new_cash = String.valueOf(Double.parseDouble(result_cash) + Double.parseDouble(price_operation));
        }
        //joptionpanee.showMessageDialog(null, new_cash);
        stmt.executeUpdate("update cash set cash_availble =" + new_cash + " where cash_availble=" + result_cash);


        //system.out.println("update cash set cash_availble =" + new_cash + " where cash_availble=" + result_cash);

    }
    String  els7b(String quantity , String rsed , String type )
    {
         if (Integer.parseInt(rsed) >=Integer.parseInt(quantity))
            {
               rsed=String.valueOf(Integer.parseInt(rsed) -Integer.parseInt(quantity));
               JOptionPane.showMessageDialog(null, "تم سحب من رصيد العميل "+quantity+"شمعه من النوع"+type);
            }
            else 
            {JOptionPane.showMessageDialog(null, "تم سحب من العميل "+rsed+" شمعه من النوع "+type+"يجب تحصل "+
                    String.valueOf(Integer.parseInt(quantity)-Integer.parseInt(rsed) )+"شمعه من النوع "+type+" نقديا" );
               rsed="0"; //(Integer.parseInt(quantity)-Integer.parseInt(rsed_1))
               
            }
         return rsed ;
    }

      void t2gel_dates_siana(String type_siana, String serial
          ,  String siana_1,  String siana_2,  String siana_3,  String siana_5,  String siana_6
            ,  String siana_7 , String period) 
      {
          
          if (type_siana.contains("1"))
          {
           
                try {
                    stmt.executeUpdate("update clients_product set date1= '" +  period + "'  where serial =" + serial
                            );
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
           
          }
           if (type_siana.contains("2"))
          {
           
                try {
                    stmt.executeUpdate("update clients_product set date2= '" +  period + "'   where serial =" + serial);
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
           
          }
            if (type_siana.contains("3"))
          {
           
                try {
                    stmt.executeUpdate("update clients_product set date3= '" +  period + "'  where serial =" + serial);
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
           
          }
             if (type_siana.contains("5"))
          {
            
                try {
                    stmt.executeUpdate("update clients_product set date5= '" + period + "'   where serial =" + serial);
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
            
          }
              if (type_siana.contains("6"))
          {
            
                try {
                    stmt.executeUpdate("update clients_product set date6= '" +  period + "'   where serial =" + serial);
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
           
          }
               if (type_siana.contains("7"))
          {
            
                try {
                    stmt.executeUpdate("update clients_product set date7= '" +  period + "'   where serial =" + serial);
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
            
          }
      }
    
    
    String  []update_dates_siana(String date1,String date2,String date3,String date5,String date6,String date7,String type_siana, String serial
          ,  String siana_1,  String siana_2,  String siana_3,  String siana_5,  String siana_6
            ,  String siana_7,
            String rsed_1 ,String rsed_2 ,String rsed_3 ,String rsed_5 ,String rsed_6 ,String rsed_7, String quantity , String time ) throws SQLException {

        int arr[]=new int[6];
        boolean ff=false;
        int rssssed=0 ;
        String previous_dates="";
        String update_statment="";
        if (type_siana.contains("1")) {
           
            
               rssssed=Integer.parseInt(rsed_1);
               if(rssssed!=0)
               {
                   ff=true;
                  //   JOptionPane.showMessageDialog(null, rssssed);
                      rsed_1=els7b(quantity, rsed_1, "1");
               arr[0]=Integer.parseInt(rsed_1)-rssssed;
               }
               else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 1 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
              
              
              update_statment+="  date1= '" + time_month(time, Integer.parseInt(siana_1)) + "' , rsed1 ="+ rsed_1;
              previous_dates+=date1 ;
       }
        if (type_siana.contains("2") ) {
             
           
                 rssssed=Integer.parseInt(rsed_2);
               
               if(rssssed!=0)
               {
                   ff=true;
                   //  JOptionPane.showMessageDialog(null, rssssed);
                     rsed_2=els7b(quantity, rsed_2, "2");
                 
                  arr[1]=Integer.parseInt(rsed_2)-rssssed;
               }
                else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 2 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
                  if (update_statment.length()!=0){update_statment+=" , "; previous_dates+=",";}
               update_statment+="  date2= '" + time_month(time, Integer.parseInt(siana_2)) + "' , rsed2 ="+rsed_2;
               previous_dates+=date2 ;
              
               
        }
        if (type_siana.contains("3") ) {
           
                 rssssed=Integer.parseInt(rsed_3);
               
               if(rssssed!=0)
               {
                   ff=true;
                   //  JOptionPane.showMessageDialog(null, rssssed);
                      rsed_3=els7b(quantity, rsed_3, "3");
                 arr[2]=Integer.parseInt(rsed_3)-rssssed;
               }
                else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 3 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
                 if (update_statment.length()!=0){update_statment+=" , ";previous_dates+=",";}
              update_statment+="  date3= '" + time_month(time, Integer.parseInt(siana_3)) + "' , rsed3 ="+ rsed_3;
           
              previous_dates+=date3 ;
            
        }
        if (type_siana.contains("5")) {
            
                 rssssed=Integer.parseInt(rsed_5);
                 
              
               if(rssssed!=0)
               {
                   ff=true;
                   //  JOptionPane.showMessageDialog(null, rssssed); 
                     rsed_5=els7b(quantity, rsed_5, "5");
                 arr[3]=Integer.parseInt(rsed_5)-rssssed;
               }
                else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 5 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
               if (update_statment.length()!=0){update_statment+=" , ";previous_dates+=",";}
               update_statment+=" date5= '" + time_month(time, Integer.parseInt(siana_5)) + "' , rsed5= "+rsed_5 ;
               previous_dates+=date5 ;
           
        }
        if (type_siana.contains("6") ) {
          
                 rssssed=Integer.parseInt(rsed_6);
               
               if(rssssed!=0)
               {
                   ff=true;
                 
                      rsed_6=els7b(quantity, rsed_6, "6");
                arr[4]=Integer.parseInt(rsed_6)-rssssed;
               }
                else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 6 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
               if (update_statment.length()!=0){update_statment+=" , ";previous_dates+=",";}
             update_statment+=" date6= '" + time_month(time, Integer.parseInt(siana_6)) + "' , rsed6 ="+rsed_6;
             previous_dates+=date6 ;
           
        }
        
 if (type_siana.contains("7") ) {
           
                 rssssed=Integer.parseInt(rsed_7);
                 
               if(rssssed!=0)
               {
                   ff=true;
                //   JOptionPane.showMessageDialog(null, rssssed);
                   rsed_7=els7b(quantity, rsed_7, "7");
                 arr[5]=Integer.parseInt(rsed_7)-rssssed;
               }
                else 
               {
                   JOptionPane.showMessageDialog(null, " رصيد العميل 0 شمعه من النوع 7 يجب يتم تحصل عدد"+quantity+"شمعات من نفس النوع نقديا");
               }
                if (update_statment.length()!=0){update_statment+=" , ";previous_dates+=",";}
                update_statment+=" date7= '" + time_month(time, Integer.parseInt(siana_7)) + "' , rsed7="+rsed_7;
           previous_dates+=date7 ;

           
        }
String re[]=new String [2];
re[0]=previous_dates ;
 if (ff==true)
 {
    
   stmt.executeUpdate("insert into history_rsed values ("+"default"+","+serial+", "+arr[0]+" , "+arr[1]+" , "+arr[2]+" , "+arr[3]+" , "+arr[4]+" , "+arr[5]+" , '"+time_now()+"')");
   stmt=conn.createStatement() ;
   ResultSet rs=stmt.executeQuery("select max(id) from history_rsed where serial="+serial +" and date='"+time_now()+"'");
   if (rs.next())
   re[1]=    rs.getString(1);
  
 }
if (update_statment.length()!=0)    stmt.executeUpdate("update clients_product set "+update_statment +" where serial =" + serial
                       );
 return re ;
    }

    
  String []update_type_elsiana(String serial ,String id_elsiana  , String old_type_siana , String previous_dates ,
       String rsed_1 ,String rsed_2 ,String rsed_3 ,String rsed_5 ,String rsed_6 ,String rsed_7 ) throws SQLException
          
  { 
   
     

  
      String previous_dates_array[] = previous_dates.trim().split(",");
      int counter = 0;
      String update_statment = "";
          if (old_type_siana.contains("1")) {

              update_statment += "  date1= '" + previous_dates_array[counter++] + "' ";
              
          }
          if (old_type_siana.contains("2")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";
              }

              update_statment += "  date2= '" + previous_dates_array[counter++] + "' ";

          }
          if (old_type_siana.contains("3")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";
              }

              update_statment += "  date3= '" + previous_dates_array[counter++] + "'  ";

          }
          if (old_type_siana.contains("5")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }

              update_statment += " date5= '" + previous_dates_array[counter++] + "' ";

          }
          if (old_type_siana.contains("6")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }

              update_statment += " date6= '" + previous_dates_array[counter++] + "' ";

          }

          if (old_type_siana.contains("7")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }

              update_statment += " date7= '" + previous_dates_array[counter++] + "' ";

          }

          if (update_statment.length() != 0) {
              stmt.executeUpdate("update clients_product set " + update_statment + " where serial =" + serial);
              System.out.println("update clients_product set " + update_statment + " where serial =" + serial);
          }
      if (id_elsiana!=null) {
          stmt.executeUpdate("delete from elsiana where id=" + id_elsiana);
          System.out.println("delete from elsiana where id=" + id_elsiana);
      }

     return previous_dates_array ;
  }
  
  
    String [][] update_type_elsiana_with_rsed(String serial ,String id_elsiana , String id_el2rdsh , String old_type_siana , String previous_dates ,
       String rsed_1 ,String rsed_2 ,String rsed_3 ,String rsed_5 ,String rsed_6 ,String rsed_7 ) throws SQLException
          
  { 
        
      String previous_dates_array[] = previous_dates.trim().split(",");
      String return_array[][]=new String [previous_dates.length()][2] ;
      int counter = 0;
      String update_statment = "";
      int el2rsdh[] = new int[6];
       
       stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("select * from history_rsed where id =" + id_el2rdsh);
          if (rs.next()) {
              el2rsdh[0] = -1*rs.getInt("q_rsed1");
              el2rsdh[1] = -1*rs.getInt("q_rsed2");
              el2rsdh[2] = -1*rs.getInt("q_rsed3");
              el2rsdh[3] = -1*rs.getInt("q_rsed5");
              el2rsdh[4] = -1*rs.getInt("q_rsed6");
              el2rsdh[5] = -1*rs.getInt("q_rsed7");

          }

          if (old_type_siana.contains("1")) {
              return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)( el2rsdh[counter] + Integer.parseInt(rsed_1))) ;
              update_statment += "  rsed1= '" + return_array[counter][1] + "' ,";
              update_statment += "  date1= '" + previous_dates_array[counter++] + "' ";

          }
          if (old_type_siana.contains("2")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";
              }
                return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)(el2rsdh[counter] + Integer.parseInt(rsed_2))) ;
              update_statment += "  rsed2= '" +  return_array[counter][1] + "' ,";
              update_statment += "  date2= '" + previous_dates_array[counter++] + "' ";

          }
          if (old_type_siana.contains("3")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";
              }
                return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)(el2rsdh[counter] + Integer.parseInt(rsed_3) )) ;
              update_statment += "  rsed3= '" +  return_array[counter][1]+ "' ,";
              update_statment += "  date3= '" + previous_dates_array[counter++] + "'  ";

          }
          if (old_type_siana.contains("5")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }
                return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)( el2rsdh[counter] + Integer.parseInt(rsed_5) )) ;
              update_statment += "  rsed5= '" + return_array[counter][1]+ "' ,";
              update_statment += " date5= '" + previous_dates_array[counter++] + "' ";

          }
          if (old_type_siana.contains("6")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }
                return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)(el2rsdh[counter] + Integer.parseInt(rsed_6))) ;
              update_statment += "  rsed6= '" +  return_array[counter][1] + "' ,";
              update_statment += " date6= '" + previous_dates_array[counter++] + "' ";

          }

          if (old_type_siana.contains("7")) {

              if (update_statment.length() != 0) {
                  update_statment += " , ";

              }
                return_array[counter][0]=previous_dates_array[counter ];
              return_array[counter][1]=String.valueOf((int)(el2rsdh[counter] + Integer.parseInt(rsed_7))) ;
              update_statment += "  rsed7= '" +  return_array[counter][1] + "' ,";
              update_statment += " date7= '" + previous_dates_array[counter++] + "' ";

          }

          if (update_statment.length() != 0) {
              stmt.executeUpdate("update clients_product set " + update_statment + " where serial =" + serial);
              System.out.println("update clients_product set " + update_statment + " where serial =" + serial);
          }
         
         
          
          if (id_elsiana!=null){
          stmt.executeUpdate("delete from elsiana where id=" + id_elsiana);
          System.out.println("delete from elsiana where id=" + id_elsiana);
          }
          
           stmt.executeUpdate("delete from history_rsed where id=" + id_el2rdsh);
          System.out.println("delete from history_rsed where id=" + id_el2rdsh);
          
        return return_array ;
  }
    
    String []update_dates_siana_client(String date1,String date2,String date3,String date5,String date6,String date7,
            String serial, String id, String old_type_siana ,String new_type_siana, String siana_1, String siana_2, String siana_3, String siana_5, String siana_6, String siana_7, String time
   , String id_elfne , String price ) throws SQLException {

        
        String date[] = new String[6];
        String previous_dates="";
        String update_statment = "";
        if (new_type_siana.contains("1")) {

            date[0]=time_month(time, Integer.parseInt(siana_1)) ;
            update_statment += "  date1= '" + date[0] + "' ";
            previous_dates+=date1 ;
            
        }
        if (new_type_siana.contains("2")) {

            if (update_statment.length() != 0) {
                update_statment += " , ";
                 previous_dates+="," ;
            }
            date[1]=time_month(time, Integer.parseInt(siana_2)) ;
            update_statment += "  date2= '" + date[1] + "' ";
             previous_dates+=date2 ;

        }
        if (new_type_siana.contains("3")) {

            if (update_statment.length() != 0) {
                update_statment += " , ";
                 previous_dates+="," ;
            }
            date[2]=time_month(time, Integer.parseInt(siana_3)) ;
            update_statment += "  date3= '" +date[2]  + "'  ";
             previous_dates+=date3 ;

        }
        if (new_type_siana.contains("5")) {

            if (update_statment.length() != 0) {
                update_statment += " , ";
                 previous_dates+="," ;
            }
            date[3]= time_month(time, Integer.parseInt(siana_5))  ;
            update_statment += " date5= '" +date[3]+ "' ";
             previous_dates+=date5 ;

        }
        if (new_type_siana.contains("6")) {

            if (update_statment.length() != 0) {
                update_statment += " , ";
                 previous_dates+="," ;
            }
            date[4]=time_month(time, Integer.parseInt(siana_6)) ;
            update_statment += " date6= '" +date[4]  + "' ";
             previous_dates+=date6 ;

        }

        if (new_type_siana.contains("7")) {

            if (update_statment.length() != 0) {
                update_statment += " , ";
                 previous_dates+="," ;
            }
            date[5]=time_month(time, Integer.parseInt(siana_7))  ;
            update_statment += " date7= '" + date[5] + "' ";
             previous_dates+=date7 ;

        }

     
            stmt.executeUpdate("update clients_product set " + update_statment + " where serial =" + serial);
            stmt.executeUpdate("update elsiana set type_elsiana='" + new_type_siana + "' , date='"+time+"' , price="+price+ " , id_elfne="+id_elfne+" , previous_dates='"+previous_dates+"'  where id=" + id);
       return date ;
       
    }


    
    
    
    

    ResultSet search_client_product_id_client(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select* from clients_product where id_client =" + key);

        return rs;
    }

    ResultSet search_client_product_id_product(String key) throws SQLException {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select* from clients_product where id_product=" + key);


        return rs;
    }

    public boolean check_buying(String id_fatorh) throws SQLException {
        String result = "";
        ResultSet rs = stmt.executeQuery("select id_buying from buying where id_buying=" + id_fatorh);
        rs.next();
        try {
            result = String.valueOf(rs.getString("id_buying"));
        } catch (Exception e) {
        }


        System.out.println("result  " + result);
        boolean flag = true;
        if (result.length() != 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "كود الفاتوره موجود سابقا");
        }

        return flag;
    }

    void insert_into_buying(String id_fatorh, String id_product, String quantity, String date, String price, String name_elmorad) throws SQLException {




        try {
            System.out.println("insert into buying values (" + id_fatorh + "," + id_product + "," + quantity + ",'"
                    + date + "'," + price + ")");
            stmt.executeUpdate("insert into buying values (" + id_fatorh + "," + id_product + "," + quantity + ",'"
                    + date + "'," + price + ",'" + name_elmorad + "')");
            JOptionPane.showMessageDialog(null, "عمليه ناجحه");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "خطأ ببيانات الفتوره");
        }


    }

    boolean update_clients(String id_client,
            String name_client,
            String job,
            String home_num,
            String street,
            String region,
            String phone,
            String country) throws SQLException {
        boolean flag = true;
        ResultSet rs = stmt.executeQuery("select region from countries where region = '" + region + "'");
        System.out.println("select region from countries where region = '" + region + "'");
        rs.next();
        String result = "";
        try {
            result = rs.getString("region");
            System.out.println(result);
        } catch (Exception e) {
        }
        if (result.length() == 0) {
            try {
                System.out.println("insert into countries values ('" + region + "','" + country + "')");
                stmt.executeUpdate("insert into countries values ('" + region + "','" + country + "')");
            } catch (Exception e) {
                flag = false;
                JOptionPane.showMessageDialog(null, "خطأ بالمركز او المدينه");
            }
        }
        try {
            System.out.println("update clients set name_client= '" + name_client + "',job= '" + job + "',home_num= " + home_num + " "
                    + " ,region='" + region + "' , phone=" + phone + " where id_client=" + id_client);
            stmt.executeUpdate("update clients set name_client= '" + name_client + "',job= '" + job + "',home_num= " + home_num + " "
                    + " ,region='" + region + "' , phone=" + phone + " where id_client=" + id_client);

        } catch (Exception e) {
            flag = false;
            JOptionPane.showMessageDialog(null, "خطأ ببيانات العميل");
        }




        return flag;


    }

    boolean update_product(String id_product,
            String name_product,
            String type,
            String price,
            String elmokdm,
            String el2st,
            String quantity) throws SQLException {
        boolean flag = true;
        try {
            System.out.println("update product set name_product='" + name_product + "',type=" + type + ",price=" + price + ",elmokdm="
                    + elmokdm + ",el2st=" + el2st + ",quantity=" + quantity + " where id_product=" + id_product);
            stmt.executeUpdate("update product set name_product='" + name_product + "',type=" + type + ",price=" + price + ",elmokdm="
                    + elmokdm + ",el2st=" + el2st + ",quantity=" + quantity + " where id_product=" + id_product);

        } catch (Exception e) {
            flag = false;
            JOptionPane.showMessageDialog(null, "خطأ ببيانات العميل");
        }




        return flag;


    }

    ResultSet search_trkeb_id_client(String key) throws SQLException {
        ResultSet rs = stmt.executeQuery("select* from trkeb where id_client=" + key);

        return rs;
    }

//   void search_trkeb(String key) throws SQLException
//   { 
////       main ob_main=new main();
////       ob_main.jTable_trkeb1.setRowHeight(0);
//       search_clients(key, 0);
//       node_clients temp=new node_clients();
//       temp=i.first;
//       while (temp!=null)
//       {
//           System.out.println(temp.id_client);
//          ResultSet rs= stmt.executeQuery("select* from trkeb where id_client ="+temp.id_client);
//          rs.next();
//          try{
//              
//             String id_product=String.valueOf(rs.getString("id_product"));
//             String quantity=String.valueOf(rs.getString("quantity"));
//             String nezam_eldf3=String.valueOf(rs.getString("nezam_eldf3"));
//             String hints=rs.getString("hints");
//             String date_regist=rs.getString("date_regist");
//          ResultSet rs_pro=   search_id_product(id_product);
//            rs_pro.next();
//             
//    String name_product=rs.getString("name_product") ;
//    
//   
//    
//            
////             ob_main.model_trkeb1.addRow(new Object[]{temp.id_client,temp.name_client,temp.region,temp2.id_product,temp2.name_product
////             ,quantity,date_regist,hints,nezam_eldf3}); 
//             ob_clients_product.insert(temp.id_client,temp.name_client,temp.region,id_product,name_product
//             ,quantity,date_regist,hints,nezam_eldf3, "", "", "", "", "");
//             System.out.println(id_product+" "+"addddddddddddddd to tableeeeeee");
//             k.first=null;
//          }catch(Exception e){
//          System.out.println(" "+" not addddddddddddddd to tableeeeeee");}
//          temp=temp.next;
//       }
//       i.first=null;
//       
//   }
    boolean update_trkeb(String id_client,
            String quantity,
            String hints,
            String id_product,
            String nezam_eldf3) throws SQLException {
        boolean flag = true;
        try {
            System.out.println("update trkeb set quantity=" + quantity + ",hints= '" + hints + "' ,nezam_eldf3=" + nezam_eldf3 + " where"
                    + " id_client=" + id_client + " and id_product=" + id_product);
            stmt.executeUpdate("update trkeb set quantity=" + quantity + ",hints= '" + hints + "' ,nezam_eldf3=" + nezam_eldf3 + " where"
                    + " id_client=" + id_client + " and id_product=" + id_product);

        } catch (Exception e) {
            flag = false;
            JOptionPane.showMessageDialog(null, "خطأ ببيانات العميل");
        }




        return flag;


    }

    public boolean check_insert_employee(String id_employee) throws SQLException {



        String result = "";

        ResultSet rs = stmt.executeQuery("select id_employee from employee where id_employee=" + id_employee);
        rs.next();
        try {
            result = String.valueOf(rs.getString("id_employee"));
        } catch (Exception e) {
        }
        System.out.println("result  " + result);

        System.out.println("select id_employee from employee where id_employee=" + id_employee);

        boolean flag = true;
        if (result.length() != 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "كود الموظف موجود سابقا");
        }
        return flag;
    }

    String insert_into_employee(
            String id_elmployee,
            String name_elmployee,
            String phone_elmployee,
            String date_start_work,
            String date_confirm_employee,
            String num_rest_per_year_3ardh,
            String num_rest_per_month_3ardh,
            String num_rest_per_year_23tiade,
            String num_rest_per_month_23tiade,
            String num_hour_elt25ir,
            String el2sase,
            String price_plus_,
            String price_per_hour,
            String elnsba,
            String hafez_el2da2,
            String aalwa_2gtma3ia,
            String a3ba2_3a2lih,
            String bdl_5bra,
            String bdl_tbi3h_3aml,
            String bdl_m5atr,
            String bdl_wgbh,
            String mokf2h,
            String solfa,
            String price_eg, String next_date_increase_elnsba) {
        String return_stmt = "";


        System.out.println("insert into employee values (" + id_elmployee + ",'" + name_elmployee + "'," + phone_elmployee
                + ",'" + date_start_work + "','" + date_confirm_employee + "'," + num_rest_per_month_3ardh + ","
                + num_rest_per_year_3ardh
                + "," + num_rest_per_month_23tiade + ","
                + num_rest_per_year_23tiade
                + ",'" + next_date_increase_elnsba + "'," + num_hour_elt25ir
                + ")");


        System.out.println("insert into price_for_employee values (" + id_elmployee
                + "," + el2sase + "," + price_plus_ + "," + price_per_hour + "," + elnsba + ","
                + hafez_el2da2 + "," + aalwa_2gtma3ia + "," + a3ba2_3a2lih + "," + bdl_5bra
                + "," + bdl_tbi3h_3aml + "," + bdl_m5atr + "," + bdl_wgbh + "," + mokf2h
                + "," + solfa + "," + price_eg
                + ")");

        try {
            stmt.executeUpdate("insert into employee values (" + id_elmployee + ",'" + name_elmployee + "'," + phone_elmployee
                    + ",'" + date_start_work + "','" + date_confirm_employee + "'," + num_rest_per_month_3ardh + ","
                    + num_rest_per_year_3ardh
                    + "," + num_rest_per_month_23tiade + ","
                    + num_rest_per_year_23tiade
                    + ",'" + next_date_increase_elnsba + "'," + num_hour_elt25ir
                    + ")");

            stmt.executeUpdate("insert into price_for_employee values (" + id_elmployee
                    + "," + el2sase + "," + price_plus_ + "," + price_per_hour + "," + elnsba + ","
                    + hafez_el2da2 + "," + aalwa_2gtma3ia + "," + a3ba2_3a2lih + "," + bdl_5bra
                    + "," + bdl_tbi3h_3aml + "," + bdl_m5atr + "," + bdl_wgbh + "," + mokf2h
                    + "," + solfa + "," + price_eg
                    + ")");




        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات الموظف");
            return_stmt += "خطأ بأدخال بيانات الموظف";
        }



        return return_stmt;
    }

    ResultSet search_employee(String key) throws SQLException {
        stmt = conn.createStatement();
        System.out.println("select* from employee where name_employee like '" + key + "%'");
        ResultSet rs = stmt.executeQuery("select* from employee where name_employee like '" + key + "%'");

        return rs;
    }

    ResultSet search_id_employee(String key) throws SQLException {
        ResultSet rs = stmt.executeQuery("select* from employee where id_employee=" + key);


        return rs;
    }

//    void search_employee (String key ,int option) throws SQLException
//   {
//      String sql="select* from employee";
//      ResultSet rs=stmt.executeQuery(sql);
//     
//      while (rs.next())
//      {
//    String id_employee =String.valueOf(rs.getString("id_employee"));
//    String name_employee=rs.getString("name_employee") ;
//    
//   String phone_employee=String.valueOf(rs.getString("phone_employee")) ;
//   
//   // String price_per_hour=String.valueOf(rs.getString("price_per_hour")) ;
//  //JOptionPane.showMessageDialog(null, phone_employee);
//    boolean flag=false ;
//    if (option==0){
//   if(name_employee.startsWith(key))flag=true ;
//    }
//    else if(option==1)
//    {
//       if(id_employee.equals(key))flag=true ;
//    }
//   
//  // System.out.println(r+" "+key);
//    if (flag==true)
//    {     
//    System.out.println(name_employee+" "+"search");
//  ob_employee.insert (
//      id_employee,
//                       name_employee,
//                        phone_employee
//                //,  price_per_hour
//    
//    );
//           
    // System.out.println("inserted into link");
//      }//else //System.out.println("not inserted into link");
// }
//   
//    rs.close();  
//   } 
    ResultSet search_attempts(String id_employee, String date_search, int option) throws SQLException {
        ResultSet rs = null;
        try {
            Statement stmtn = conn.createStatement();

            if (option == 0) {
                rs = stmtn.executeQuery("select* from attempts where id_employee=" + id_employee);
            } else {
                rs = stmtn.executeQuery("select* from attempts where id_employee=" + id_employee + " and date= '" + date_search + "'");
            }

//while (rs.next())
//{
//  //  String id_employee=String.valueOf(rs.getString("id_employee"));
//    String date=rs.getString("date");
//    String arrival_time=rs.getString("arrival_time");
//    JOptionPane.showMessageDialog(null,arrival_time);
//    String leaving_time=rs.getString("leaving_time");
//    String total_day_time=rs.getString("total_day_time");
//    ob_attempts.insert(id_employee, date, arrival_time, leaving_time, total_day_time);
//    
//}
//        
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public boolean check_insert_el7dor(String id_employee, String date) throws SQLException {
        boolean flag = true;
        ResultSet rs = search_attempts(id_employee, date, 1);

        String arrival_time = "";
        try {
            rs.next();
            arrival_time = rs.getString("arrival_time");
        } catch (Exception e) {
        }
        if (arrival_time.length() == 0) {
            flag = true;
        } else {
            flag = false;
            JOptionPane.showMessageDialog(null, "تم تسجيل الحضور من قبل " + "\n" + " " + date + arrival_time);
        }
        return flag;
    }

    void insert_el7dor(String id_employee, String date, String arrival_time) {
        try {
            System.out.println("insert into attempts values ( " + id_employee + ",'" + date + "','" + arrival_time + "'," + null + "," + null + ")");
            stmt.executeUpdate("insert into attempts values ( " + id_employee + ",'" + date + "','" + arrival_time + "'," + null + "," + 0 + "," + 0 + ")");
            System.out.println("insert into attempts values ( " + id_employee + ",'" + date + "','" + arrival_time + "'," + null + "," + 0 + "," + 0 + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات الحضور");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean check_insert_el2nsraf(String id_employee, String date) throws SQLException {
        boolean flag = true;
        ResultSet rs = search_attempts(id_employee, date, 1);
        String id_employee_s = "";
        String leaving_time = "";
        try {
            rs.next();

            id_employee_s = String.valueOf(rs.getString("id_employee"));

            leaving_time = rs.getString("leaving_time");
        } catch (Exception e) {
        }
        //joptionpanee.showMessageDialog(null, id_employee_s+" attempts "+leaving_time);
        if (id_employee_s.length() != 0) {
            if (leaving_time == null) {
                flag = true;
            } else {
                flag = false;
                JOptionPane.showMessageDialog(null, "تم تسجيل الانصراف من قبل" + "\n" + " " + date + leaving_time);
            }


        } else {
            flag = false;

            JOptionPane.showMessageDialog(null, "لم يتم تسجيل الحضور قم بتسجيل الحضور اولا");
        }
        return flag;
    }

    void insert_el2nsrfr(String id_employee, String date, String leaving_time, String plus, String mins) {
        try {
            System.out.println("update attempts set leaving_time='" + leaving_time + "', time_+=" + plus + " time_-=" + mins
                    + " where id_employee=" + id_employee + " and date='" + date + "'");
            stmt.executeUpdate("update attempts set leaving_time='" + leaving_time + "', time_plus=" + plus + " , time_mins=" + mins
                    + " where id_employee=" + id_employee + " and date='" + date + "'");
            System.out.println("update attempts set leaving_time='" + leaving_time + "', time_+=" + plus + " time_-=" + mins
                    + " where id_employee=" + id_employee + " and date='" + date + "'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "خطأ بأدخال بيانات الانصراف");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_salaries(String id_employee, String month, String year, int option) {
        ResultSet rs = null;
        try {

            if (option == 0) {
                System.out.println("select* from salaries where month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries where month=" + month + " and year='" + year + "'");

            } else {
                System.out.println("select* from salaries where id_employee=" + id_employee + " and month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries where id_employee=" + id_employee + " and month=" + month + " and year='" + year + "'");
            }


//      while (rs.next())
//      {
//          
//          String date=rs.getString("date");
//           String salary=String.valueOf(rs.getString("salary"));
//           ob_salaries.insert(id_employee, month, year, date, salary);
//      }
//      
//      


        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_salaries_elfne(String id_elfne, String month, String year, int option) {
        ResultSet rs = null;
        if (option == 0) {
            System.out.println("select* from salaries_elfne where month=" + month + " and year='" + year + "'");
            try {
                rs = stmt.executeQuery("select* from salaries_elfne where month=" + month + " and year='" + year + "'");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("select* from salaries_elfne where id_elfne=" + id_elfne + " and month=" + month + " and year='" + year + "'");
            try {
                rs = stmt.executeQuery("select* from salaries_elfne where id_elfne=" + id_elfne + " and month=" + month + " and year='" + year + "'");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


//      while (rs.next())
//      {
//          
//          String date=rs.getString("date");
//           String salary=String.valueOf(rs.getString("salary"));
//           ob_salaries_elfne.insert(id_elfne, month, year, date, salary);
//      }
//      




        return rs;
    }

    ResultSet search_salaries_elmndob(String id_elmndob, String month, String year, int option) {
        ResultSet rs = null;
        try {

            if (option == 0) {
                System.out.println("select* from salaries_elmndob where month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries_elmndob where month=" + month + " and year='" + year + "'");

            } else {
                System.out.println("select* from salaries_elmndob where id_elmndob=" + id_elmndob + " and month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries_elmndob where id_elmndob=" + id_elmndob + " and month=" + month + " and year='" + year + "'");
            }


//      while (rs.next())
//      {
//          
//          String date=rs.getString("date");
//           String salary=String.valueOf(rs.getString("salary"));
//           ob_salaries_elmndob.insert(id_elmndob, month, year, date, salary);
//      }
//      



        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_salaries_elmo7sl(String id_elmo7sl, String month, String year, int option) {
        ResultSet rs = null;
        try {

            if (option == 0) {
                System.out.println("select* from salaries_elmo7sl where month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries_elmo7sl where month=" + month + " and year='" + year + "'");

            } else {
                System.out.println("select* from salaries_elmo7sl where id_elmo7sl=" + id_elmo7sl + " and month=" + month + " and year='" + year + "'");
                rs = stmt.executeQuery("select* from salaries_elmo7sl where id_elmo7sl=" + id_elmo7sl + " and month=" + month + " and year='" + year + "'");
            }


//      while (rs.next())
//      {
//          
//          String date=rs.getString("date");
//           String salary=String.valueOf(rs.getString("salary"));
//           ob_salaries_elmndob.insert(id_elmndob, month, year, date, salary);
//      }
//      



        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_total_elba2e(String id_client) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select* from total_elba2e where id_client=" + id_client);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    String make_elba2e(String id_client, String old_total_elba2e, String quantity, String option) {
        String new_total_elba2e = "";
        if (option.equals("0")) {
            try {
                stmt.executeUpdate("insert into total_elba2e values (" + id_client + "," + quantity + ")");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (option.equals("1.0")) {
            new_total_elba2e = String.valueOf(Double.parseDouble(old_total_elba2e) - Double.parseDouble(quantity));

            try {
                stmt.executeUpdate("update total_elba2e set elba2e=" + new_total_elba2e + " where id_client=" + id_client);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (option.equals("1.1")) {
            new_total_elba2e = String.valueOf(Double.parseDouble(old_total_elba2e) + Double.parseDouble(quantity));
            try {
                stmt.executeUpdate("update total_elba2e set elba2e=" + new_total_elba2e + " where id_client=" + id_client);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new_total_elba2e;
    }

    void update_date_el2st(String serial, String date, String elb2e) throws SQLException {
        
         
            stmt.executeUpdate("update clients_product set date_el2st='" + date + "' , elb2e=" + elb2e + " where serial=" + serial );
       
    }

    void insert_el2st( String serial, String price, String eltok3, String date,String id_elmo7sl) throws SQLException {
      
          
            stmt.executeUpdate("insert into el2st values ( " +  "default ," +serial+ "," + price + "," + eltok3 + ",'"
                    + date + "',"+id_elmo7sl+")");
        
    }

    ResultSet check_insert_el2st(String id_fatorh) {
        ResultSet rs = null;
        try {

            rs = stmt.executeQuery("select* from selling_el2st where id_fatorh=" + id_fatorh);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_mdnen(String key) throws SQLException {
        System.out.println();
        String sql = "select* from mdenen where name_mdene like '" + key + "%'";
        ResultSet rs = stmt.executeQuery(sql);

//      while (rs.next())
//      {
//    String id_mdene =String.valueOf(rs.getString("id_mdene"));
//    String name_mdene=rs.getString("name_mdene") ;
//    
//   String phone_mdene=String.valueOf(rs.getString("phone_mdene")) ;
//    String total_elba2e=String.valueOf(rs.getString("total_elba2e")) ;
//   
//   // String price_per_hour=String.valueOf(rs.getString("price_per_hour")) ;
//  //JOptionPane.showMessageDialog(null, phone_employee);
//    
//   
//   if(name_mdene.startsWith(key)) {ob_mdene.insert(id_mdene, name_mdene, phone_mdene, total_elba2e);}
//    


        // System.out.println(r+" "+key);


        return rs;
    }

    ResultSet check_mdene(String id_mdene) throws SQLException {
        stmt = conn.createStatement();
        String sql = "select* from mdenen where id_mdene=" + id_mdene;
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    ResultSet check_selling_mdnenene(String id_fathorh) throws SQLException {
        stmt = conn.createStatement();
        System.out.println("select* from selling_mdenen where id_fatorh=" + id_fathorh);
        String sql = "select* from selling_mdenen where id_fatorh=" + id_fathorh;
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    String insert_mdenen(String id_mdene, String name_mdene, String phone_mdene, String total_elba2e, String old_total_elba2e, String option, String address) {
        String new_total_elba2e = "";
        if (option.equals("0")) {
            try {
                stmt.executeUpdate("insert into mdenen values (" + id_mdene + ",'" + name_mdene + "'," + phone_mdene + "," + total_elba2e + ",'" + address + "'" + ")");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (option.equals("1.0")) {
            new_total_elba2e = String.valueOf(Double.parseDouble(old_total_elba2e) - Double.parseDouble(total_elba2e));

            try {
                stmt.executeUpdate("update mdenen set total_elba2e=" + new_total_elba2e + " where id_mdene=" + id_mdene);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (option.equals("1.1")) {
            new_total_elba2e = String.valueOf(Double.parseDouble(old_total_elba2e) + Double.parseDouble(total_elba2e));
            try {
                //joptionpanee.showMessageDialog(null,"update mdenen set total_elba2e="+new_total_elba2e+" where id_mdene="+id_mdene) ;
                stmt.executeUpdate("update mdenen set total_elba2e=" + new_total_elba2e + " where id_mdene=" + id_mdene);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new_total_elba2e;
    }

    void insert_selling_mdenen(String id_fatorh, String id_mdene, String elm2dm, String elba2e, String money_for_next_time, String date_el2st7kak, String date, int option) {
        if (option == 0) {
            try {
                stmt.executeUpdate("insert into selling_mdenen values (" + id_fatorh + "," + id_mdene + "," + elm2dm + "," + elba2e + "," + money_for_next_time + ",'" + date_el2st7kak + "','" + date
                        + "')");
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                stmt.executeUpdate("update selling_mdenen set money_for_next_time=" + money_for_next_time + " , elba2e=" + elba2e + " , date_el2st7kak='" + date_el2st7kak + "' where id_fatorh=" + id_fatorh);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void insert_selling_mdenen_details(String id_fatorh, String id_product, String quantity, String price) {
        try {
            stmt.executeUpdate("insert into selling_mdenen_details values (" + id_fatorh + "," + id_product + "," + quantity + "," + price + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_selling_mdenen_details(String id_fatorh) throws SQLException {
        stmt = conn.createStatement();
        String sql = "select* from selling_mdenen_details where id_fatorh=" + id_fatorh;
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    ResultSet search_el2st_for_mdenen(String id_fatorh_selling) throws SQLException {
        stmt = conn.createStatement();
        // String sql="select* from el2st_for_mdenen where id_fatorh_el2st="+id_fatorh;
        String sql = "select* from el2st_for_mdenen where id_fatorh_selling=" + id_fatorh_selling;
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    ResultSet search_id_fatorh_el2st(String id_fatorh_el2st) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("select * from el2st_for_mdenen where id_fatorh_el2st=" + id_fatorh_el2st);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    void insert_el2st_for_mdenen(String id_fatorh_el2st, String id_fatorh_selling, String price, String eltok3, String date) {
        try {
            System.out.println("insert into el2st_for_mdenen values (" + id_fatorh_el2st + "," + id_fatorh_selling + "," + price + "," + eltok3 + ",'" + date + "')");
            stmt.executeUpdate("insert into el2st_for_mdenen values (" + id_fatorh_el2st + "," + id_fatorh_selling + "," + price + "," + eltok3 + ",'" + date +"')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_elsiana(String serial, String type_elsiana, String date, String id_elfne,String price , int id_type_elsiana , String nsbt_el2mla7_before , String nsbt_el2mla7_after
            , String re[]) throws SQLException {
       
        
            stmt.executeUpdate("insert into elsiana values (" + "default" + "," +serial   +",'" + type_elsiana + "','" 
                    + date  +"',"+id_elfne+ ","+price+","+id_type_elsiana+","+nsbt_el2mla7_before+","+nsbt_el2mla7_after+",'"+re[0]+"',"+re[1]+")");
       
    }

    void insert_el3otl(String serial, String type_el3otl, String date ,
            String mark , String id_elfne , String date_regist , String  dead_line , String price, String nsbt_el2mla7_before , String nsbt_el2mla7_after
            , String re[] ) throws SQLException {
        
            stmt.executeUpdate("insert into el3otl values (" + "default" + "," + serial + 
                   ",'" + type_el3otl + "','" + date +"',"+ mark+","+id_elfne+
                    ",'"+date_regist+"','"+dead_line+"',"+price+","+nsbt_el2mla7_before+","+nsbt_el2mla7_after+",'"+re[0]+"',"+re[1]+")");
       
    }

    public boolean check_insert_masrofat(String id_operation) throws SQLException {

        System.out.println("select id_operation from elmsrofat where id_operation=" + id_operation);

        String result = "";

        ResultSet rs = stmt.executeQuery("select id_operation from elmsrofat where id_operation=" + id_operation);
        rs.next();
        try {
            result = String.valueOf(rs.getString("id_product"));
        } catch (Exception e) {
        }
        System.out.println("result  " + result);


        boolean flag = true;
        if (result.length() != 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "كود المنتج موجود بالفعل");
        }
        return flag;
    }

    void insert_elmasrofat(String id_operation, String name_operation, String price, String quantity, String date) {
        System.out.println("insert into elmsrofat values (" + id_operation + ",'" + name_operation + "'," + price + "," + quantity + ",'" + date + "')");
        try {
            stmt.executeUpdate("insert into elmsrofat values (" + id_operation + ",'" + name_operation + "'," + price + "," + quantity + ",'" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_elmo7sl(String key) throws SQLException {

        ResultSet rs = stmt.executeQuery("select* from elmo7sl where name_elmo7sl like '%" + key + "%'");

        return rs;
    }

    ResultSet search_id_elmo7sl(String key) throws SQLException {

        ResultSet rs = stmt.executeQuery("select* from elmo7sl where id_elmo7sl=" + key);

        return rs;
    }
    public boolean check_insert_elo7sl_new(String key)
    {
        boolean flag=true ;
        try {
            ResultSet rs = stmt.executeQuery("select* from elmo7sl where id_elmo7sl=" + key);
            if (rs.next())
            {
             flag=false ;   
             JOptionPane.showMessageDialog(null, "عفوا كود المحصل موجود بالفعل");
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    String insert_into_elmo7sl(
            String id_elmo7sl,
            String name_elmo7sl,
            String phone_elmo7sl,
            String places_elmo7sl) {
        String return_stmt = "";





        System.out.println("insert into elmo7sl values (" + id_elmo7sl
                + ",      '" + name_elmo7sl + "'        ,"
                + phone_elmo7sl
                + ",'" + places_elmo7sl + "'" + ")");

        try {
            stmt.executeUpdate("insert into elmo7sl values (" + id_elmo7sl
                    + ",'" + name_elmo7sl + "',"
                    + phone_elmo7sl
                    + ",'" + places_elmo7sl + "'" + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "خطأ ببيانات المحصل");
            return_stmt += "خطأ ببيانات المحصل";
        }



        return return_stmt;
    }

    void insert_selling_el2st_elmo7sl(String id_elm7sl, String id_fatorh) {
        try {
            stmt.executeUpdate("insert into selling_el2st_elmo7sl values (" + id_elm7sl + "," + id_fatorh + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_selling_el2st_for_mdenen_elmo7sl(String id_elm7sl, String id_fatorh) {
        try {
            stmt.executeUpdate("insert into selling_el2st_for_mdenen_elmo7sl values (" + id_elm7sl + "," + id_fatorh + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    ResultSet search_information_hr() {
//        ResultSet rs = null;
//        try {
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return rs;
//    }

    void g_c()
    {
        System.gc();
    }
    void insert_el5somat(String id_emoloyee, String num_hours, String price_hour, String type_problem, String date) {
        try {
            stmt.executeUpdate("insert into el5somat values (" + id_emoloyee + "," + num_hours + "," + price_hour + ",'" + type_problem + "','" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_elmokf2at(String id_emoloyee, String price, String date) {
        try {
            stmt.executeUpdate("insert into elmkf2at values (" + id_emoloyee + "," + price + ",'" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_ezn_elt25ir(String id_emoloyee, String date, String num_hour) {
        try {
            stmt.executeUpdate("insert into ezn_elt25ir values (" + id_emoloyee + ",'" + date + "'," + num_hour + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_ezn_general(String id_emoloyee, String date) {
        try {
            stmt.executeUpdate("insert into ezn_general values (" + id_emoloyee + ",'" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_ezn_el2nsraf(String id_emoloyee, String date) {
        try {
            stmt.executeUpdate("insert into ezn_el2nsraf values (" + id_emoloyee + ",'" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_rests(String id_emoloyee, String type, String size, String date) {
        try {
            stmt.executeUpdate("insert into rests values (" + id_emoloyee + ",'" + date + "','" + type + "'," + size + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_price_for_employee(String id_employee) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from price_for_employee where id_employee=" + id_employee);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_rests(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from rests where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_ezn_general(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from ezn_general where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_ezn_el2nsraf(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from ezn_el2nsraf where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_ezn_elt25ir(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from ezn_elt25ir where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_el5somat(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from el5somat where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elmokf2at(String id_employee, String start, String end) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elmkf2at where id_employee=" + id_employee + " and date between '" + start + "' and '" + end + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    void update_rest(String id_employee, String old_size_year, String old_size_month, String size, String type) {
        try {
            if (type.equals("عارضه")) {
                System.out.println("update employee set num_rest_per_year_3ardh=" + String.valueOf(Double.parseDouble(old_size_year) - Double.parseDouble(size))
                        + " , num_rest_per_month_3ardh=" + String.valueOf(Double.parseDouble(old_size_month) - Double.parseDouble(size))
                        + " where id_employee=" + id_employee);
                stmt.executeUpdate("update employee set num_rest_per_year_3ardh=" + String.valueOf(Double.parseDouble(old_size_year) - Double.parseDouble(size))
                        + " , num_rest_per_month_3ardh=" + String.valueOf(Double.parseDouble(old_size_month) - Double.parseDouble(size))
                        + " where id_employee=" + id_employee);
            } else {
                System.out.println("update employee set num_rest_per_year_23tiade=" + String.valueOf(Double.parseDouble(old_size_year) - Double.parseDouble(size))
                        + " , num_rest_per_month_23tiade=" + String.valueOf(Double.parseDouble(old_size_month) - Double.parseDouble(size))
                        + " where id_employee=" + id_employee);
                stmt.executeUpdate("update employee set num_rest_per_year_23tiade=" + String.valueOf(Double.parseDouble(old_size_year) - Double.parseDouble(size))
                        + " , num_rest_per_month_23tiade=" + String.valueOf(Double.parseDouble(old_size_month) - Double.parseDouble(size))
                        + " where id_employee=" + id_employee);
            }


        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_employee_solfa(String id_employee) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from employee_solfa where id_employee =" + id_employee);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_employee_el2st(String id_employee, String date) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from el2st_employee where id_employee =" + id_employee + " and date_solfa ='" + date + "'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    void insert_employee_solfa(String id_emoloyee, String date, String price, String elba2e) {
        try {
            stmt.executeUpdate("insert into employee_solfa values (" + id_emoloyee + ",'" + date + "'," + price + "," + elba2e + ")");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void insert_employee_el2st(String id_emoloyee, String date_solfa, String price, String date) {
        try {
            stmt.executeUpdate("insert into el2st_employee values (" + id_emoloyee + ",'" + date_solfa + "'," + price + ",'" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ResultSet search_elfne_elm5zan_id_elfne(String id_elfne) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan where id_elfne =" + id_elfne);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elfne_elm5zan_id_product(String id_product) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan where id_product =" + id_product);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elfne_elm5zan_id_elfne_id_product(String id_elfne, String id_product) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan where id_product =" + id_product + " and id_elfne =" + id_elfne);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elfne_elm5zan_history_id_elfne(String id_elfne) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan_history where id_elfne =" + id_elfne);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elfne_elm5zan_history_id_product(String id_product) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan_history where id_product =" + id_product);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    ResultSet search_elfne_elm5zan_history_id_product_id_product(String id_elfne, String id_product) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select* from elfne_elm5zan_history where id_product =" + id_product + " and id_elfne =" + id_elfne);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    void insert_elfne_elm5zan(String id_elfne, String id_product, String quantity) {
        try {
            stmt = conn.createStatement();
            ResultSet rs = search_elfne_elm5zan_id_elfne_id_product(id_elfne, id_product);
            String quantity_s = "";
            try {
                rs.next();
                quantity_s = rs.getString("quantity");
            } catch (Exception e) {
            }
            if (quantity_s.length() == 0) {
                stmt.executeUpdate("insert into elfne_elm5zan values (" + id_elfne + "," + id_product + "," + quantity + ")");
            } else {
                stmt.executeUpdate("update elfne_elm5zan set quantity=" + String.valueOf(Double.parseDouble(quantity) + Double.parseDouble(quantity_s))
                        + "where id_elfne =" + id_elfne + " and id_product=" + id_product);
            }

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void insert_elfne_elm5zan_astrg3(String id_elfne, String id_product, String quantity) {
        try {

            stmt.executeUpdate("update elfne_elm5zan set quantity=" + quantity
                    + "where id_elfne =" + id_elfne + " and id_product=" + id_product);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void insert_elfne_elm5zan_history(String id_elfne, String id_product, String quantity, String type, String date) {
        try {
            stmt.executeUpdate("insert into elfne_elm5zan_history values (" + id_elfne + "," + id_product + "," + quantity + ",'" + type
                    + "','" + date + "')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String current_mac()
    {
               String cuttent_mac=""; 
        InetAddress ip;
    try {

        ip = InetAddress.getLocalHost();
       // System.out.println("Current IP address : " + ip.getHostAddress());

        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        byte[] mac = network.getHardwareAddress();

       // System.out.print("Current MAC address : ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
     //   System.out.println(sb.toString());
      cuttent_mac=sb.toString();
    } catch (UnknownHostException e) {

        e.printStackTrace();

    } catch (SocketException e){

        e.printStackTrace();

    }

return cuttent_mac ;
    }
     String enc(String mac)
    {
       String enc_mac="";
       
       for (int i=0 ; i<mac.length() ; i++)
       {
          enc_mac+=(char) (   (    ((int) mac.charAt(i))  *Math.pow(3, i)  )  %97               ); 
       }
       return enc_mac ;
    }
    
      boolean time_between(String date1, String date2,String date3) throws ParseException {

        boolean flag = false;
      //  if (!date1.contains("000"))
        {
            try {

                String untildate1 = date1;
                String untildate2 = date2;
                 String untildate3 = date3;//can take any date in current format    
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(dateFormat.parse(untildate1));

               
                Calendar cal2 = Calendar.getInstance();
//cal1.setTime( dateFormat.parse(untildate2));
                cal2.setTime(dateFormat.parse(untildate2));
                
                

                Calendar cal3 = Calendar.getInstance();
                cal3.setTime(dateFormat.parse(untildate3));
               
                if ((cal1.before(cal2)&&cal3.after(cal2))||cal1.equals(cal2)||cal2.equals(cal3)) {
                    flag = true;
                   // System.out.println("date true" + cal1 + " " + cal2);
                }
//String convertedDate=dateFormat.format(cal.getTime());    
//System.out.println("Date increase by one.."+convertedDate);
//return convertedDate ;
            } catch (Exception e) {
            }

        }
        return flag;
    }
    ResultSet search_id_sec(String id)
    {
        
        ResultSet rs=null;
        try {
            stmt=conn.createStatement();
            rs = stmt.executeQuery("select * from elkta3 where id_elkta3="+id);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     ResultSet search_name_sec(String name)
    {
        
        ResultSet rs=null;
        try {
            stmt=conn.createStatement();
            rs = stmt.executeQuery("select * from elkta3 where name_elkta3 like '"+name+"%'");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     ResultSet sec_dependant(String id)
    {
        
        ResultSet rs=null;
        try {
            stmt=conn.createStatement();
            rs = stmt.executeQuery("select * from elkta3_dependant where id_elkta3 = "+id);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     void insert_elkta3(String id , String name_Sec , String date , String manager)
     {
        try {
            stmt.executeUpdate("insert into elkta3 values ("+id+" ,'"+name_Sec+"','"+date+"','"+manager+"')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      void insert_elkta3_dependant(String id , String region)
     {
        try {
            stmt.executeUpdate("insert into elkta3_dependant values ("+id+",'"+region+"')");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
     public static void generateAndSendEmail(final  String sourceEmail,final String password , String toEmail, String subject,
            String body , String filename[] ) {
        try {
            
              Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
 
        System.out
                .println("\n2nd ===> create Authenticator object to pass in Session.getInstance argument..");
 
        javax.mail.Authenticator authentication = new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(sourceEmail, password);
            }
        };
        Session session = Session.getInstance(props, authentication);
            
            System.out.println("\n3rd ===> generateAndSendEmail() starts..");
 
            MimeMessage crunchifyMessage = new MimeMessage(session);
            crunchifyMessage.addHeader("Content-type", "text/HTML; charset=UTF-8");
            crunchifyMessage.addHeader("format", "flowed");
            crunchifyMessage.addHeader("Content-Transfer-Encoding", "8bit");
 
//            crunchifyMessage.setFrom(new InternetAddress("noreply@crunchify.com",
//                    "NoReply-Crunchify"));
//            crunchifyMessage.setReplyTo(InternetAddress.parse("noreply@crunchify.com", false));
            crunchifyMessage.setSubject(subject, "UTF-8");
            crunchifyMessage.setSentDate(new java.util.Date());
            crunchifyMessage.setRecipients(javax.mail.Message.RecipientType.TO,
                    InternetAddress.parse(toEmail, false));
 
            // Create the message body part
            BodyPart messageBodyPart = new javax.mail.internet.MimeBodyPart();
            messageBodyPart.setContent(body, "text/HTML; charset=UTF-8");
 
            // Create a multipart message for attachment
            Multipart multipart = new MimeMultipart();
 
            // Set text message part
            multipart.addBodyPart(messageBodyPart);
 
            messageBodyPart = new javax.mail.internet.MimeBodyPart();
//  String filename[] = {"C:/Users/ashraf_atef/Desktop/table_elmrar.PNG","C:/Users/ashraf_atef/Desktop/trkeb1.PNG"
//  ,"C:/Users/ashraf_atef/Desktop/223.txt"};
            // Valid file location
            for (int g=0 ; g<filename.length ; g++)
            {
                System.out.println(g);
                System.out.println(filename[g]);
            DataSource source = new FileDataSource(filename[g]);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename[g]);
            // Trick is to add the content-id header here
            messageBodyPart.setHeader("Content-ID", "image_id");
            multipart.addBodyPart(messageBodyPart);
 
            messageBodyPart = new javax.mail.internet.MimeBodyPart();
            }
             System.out.println("\n4th ===> third part for displaying image in the email body..");
           
            messageBodyPart.setContent("<br><h3>Find below attached image</h3>"
                    + "<img src='cid:image_id'>", "text/html");
            multipart.addBodyPart(messageBodyPart);
            crunchifyMessage.setContent(multipart);
 
            System.out.println("\n5th ===> Finally Send message..");
 
            // Finally Send message
            Transport.send(crunchifyMessage);
 
            System.out
                    .println("\n6th ===> Email Sent Successfully With Image Attachment. Check your email now..");
            System.out.println("\n7th ===> generateAndSendEmail() ends..");
 
            JOptionPane.showMessageDialog(null,"Backup uploaded successfully");
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null,"عفوا تأكد من صحه الأيميل و الرقم السري للشركه و اتصالك بشبكه نت :(");
       } 
//        catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
 int get_client_from_back_table(String content , DefaultTableModel model , int column) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (content.equals(model.getValueAt(i, column))) {
                return i;
            }

        }
        return -1;
    }

}
