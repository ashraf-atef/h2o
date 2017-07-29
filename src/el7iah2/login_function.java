
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import java.awt.Color;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ashraf_atef
 */
public class login_function {

    hr h;
    String username = "";
    String password = "";

    public login_function(hr h) {
        this.h = h;

    }

    String [] login() {
        String server_info[] = new String[5];
        server_info[4] = "true";

        try {

            conn();

            String current_date = "";
            String serial = "";
            String persistant = "";
            String dead_line = "";

            ResultSet rs_curr = stmt.executeQuery("select current_date");
            if (rs_curr.next()) {
                current_date = rs_curr.getString(1);
            }

            java.sql.PreparedStatement st = conn.prepareStatement("select ser , presistant , dead_line , version_number  , database_username , database_password , database_name , server_ip from users where username=? and password =?");
            st.setString(1, username);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                System.out.println("conecting");
                serial = rs.getString(1);
                persistant = rs.getString(2);
                dead_line = rs.getString(3);
                server_info[0] = rs.getString(5);
                server_info[1] = rs.getString(6);
                server_info[2]=rs.getString(8);
                server_info[3] = rs.getString(7);
                String d_serial = h.m.ob.serial() + h.m.ob.serial_2();

                if (h.m.ob.time_compare(current_date, dead_line)) {

                    if (persistant.equals("0")) {
                        System.out.println("update USERS set persistant=1 , ser='" + d_serial + "' where username=? and password =?");
                        java.sql.PreparedStatement st_2 = conn.prepareStatement("update users set presistant=1 , ser='" + d_serial + "' where username=? and password =?");
                        st_2.setString(1, username);
                        st_2.setString(2, password);
                        st_2.execute();
                        st_2.close();
                    }//end if persistant =0
                    else {
                        if (!serial.equals(d_serial)) {
                            JOptionPane.showMessageDialog(null, "this account is already login on another device ");
                             server_info[4] = "false";

                        }

                    }
                    if (rs.getInt(4) < 4) {
                        JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه لأستخدام ذلك الأصدار");
                        server_info[4] = "false";
                    }

                }//end if date before deadline
                else {
                    JOptionPane.showMessageDialog(null, "sorry you should pay the price of the programe to login");
                   server_info[4] = "false";
                }

            } // end if password is correct
            else {
               server_info[4] = "false";
                JOptionPane.showMessageDialog(null, "please check username or password");
            }
  conn.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
            server_info[4] = "false";
            JOptionPane.showMessageDialog(null, "check connecting with Internet");

        } catch (SQLException ex) {
            server_info[4] = "false";
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "check connecting with Internet");
        }

      
        return server_info;
    }

    void log_off() {

        if (h.user_name.length() != 0) {

            java.sql.PreparedStatement st = null;

            while (true) {

                try {
                    try {
                        conn();

                        st = conn.prepareStatement("update users set presistant=0 , ser='' where username=? and password=? ");
                        st.setString(1, username);
                        st.setString(2, password);
                        st.execute();
                        st.close();
                          conn.close();
                        break;

                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "check connecting with Internet");
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "check connecting with Internet");
                }

            }

        }
    }

    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static Connection conn = null;
    static Statement stmt = null;

    void conn() throws ClassNotFoundException, SQLException {
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true&sslmode=require";
         final String DB_URL = "jdbc:postgresql://"+"ec2-23-23-228-115.compute-1.amazonaws.com"+":"+"5432"+"/dfhmm9tjtoh06o";
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(DB_URL + unicode, "mvqbslwdbakwcw", "bd593b8ba7e11af76f1d1fa50199a5aeaf0a8990bfa20b667bec26e7f6d59c73");
        stmt = conn.createStatement();
        System.out.println("Connecting to database...");
    }

    boolean change_password(String password) {

        boolean flag = true;
        try {
            try {

                conn();

                java.sql.PreparedStatement st2 = conn.prepareStatement("update users set password=? where username=? and password=?");
                st2.setString(1, password);
                st2.setString(2, this.username);
                st2.setString(3, this.password);
                st2.execute();
                st2.close();
                conn.close();
            } catch (ClassNotFoundException ex) {
                flag = false;
                JOptionPane.showMessageDialog(null, "check connecting with Internet");
            }
        } catch (SQLException ex) {
            flag = false;
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "failed please try again");

        }
        return flag;
    }

}






