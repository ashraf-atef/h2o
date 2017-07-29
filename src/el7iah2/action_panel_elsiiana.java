/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author ashraf_atef
 */
public class action_panel_elsiiana {

    main m;

    public action_panel_elsiiana(main m) {
        this.m = m;
        m.jScrollPane37.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        m.jComboBox_client_hints.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //m.jComboBox_class_elsiana.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        m.jComboBox1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    }

    void search_plan() {

        // TODO add your handling code here:
        m.model_siana.setRowCount(0);
        m.model_siana_help.setRowCount(0);
        String month_year_day_start = ((JTextField) m.jTextField_submit_start.getDateEditor().getUiComponent()).getText();
        String month_year_day_end = ((JTextField) m.jTextField_submit_end.getDateEditor().getUiComponent()).getText();
        boolean flag_1 = false;
        boolean flag_2 = false;

        flag_1 = m.ob.check_time(month_year_day_start);
        flag_2 = m.ob.check_time(month_year_day_end);
 String s_e_m[] = m.ob.get_start_end_of_month();
        if (flag_1 == false && flag_2 == false && m.ob.time_compare(month_year_day_start, month_year_day_end)) {
            JOptionPane.showMessageDialog(null, "خطأ بأدخال الشهر :(");
        } else {
            if (m.flag_3otl_siana == 0) {

                // String month = jTextField_submit_start.getText();
                try {

//                        System.out.println(month_year_day_start + " " + month_year_day_end);
                    //          System.out.println("select* from clients_product where date1 "
//                                + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date2 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date3 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date5 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date6 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date7 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'");
                    m.ob.stmt = m.ob.conn.createStatement();
                    String class_0 = "";
                    ResultSet rs_black_class = m.ob.stmt.executeQuery("select class from classes where percent=" + 0);
                    if (rs_black_class.next()) {
                        class_0 = rs_black_class.getString(1);
                    }

                    ResultSet rs = m.ob.stmt.executeQuery("select * from clients_product cs left outer join clients c on cs.id_client=c.id_client left"
                            + " outer join product p on p.id_product=cs.id_product left outer join countries co on co.region=cs.region left outer "
                            + "join wrongs w on w.serial=cs.serial "
                            + "left outer join elsiana si on si.serial=cs.serial and si.id in "
                            + "( select max(id) from elsiana sii  where sii.serial= cs.serial) "
                            + " left outer join el3otl el on el.serial=cs.serial and el.id in "
                            + "( select max(id) from el3otl ell  where ell.serial= cs.serial) "
                            
                             +" left outer join archive ar on ar.serial=cs.serial and ar.id_archive="+archive_value+" and ar.id in "
                            + "( select max(id) from archive arr  where arr.serial= cs.serial and arr.id_archive="+archive_value+"  and arr.date "+ "between '" + month_year_day_start + "' and '" + month_year_day_end + "') " 
                           
                            +" left outer join archive ar2 on ar2.serial=cs.serial and ar2.id_archive="+archive_value+" and ar2.id in "
                            + "( select max(id) from archive arr2  where arr2.serial= cs.serial and arr2.id_archive="+archive_value+"   and arr2.date <'" + month_year_day_start + "' )"
                                 
                            + " where ( date1 "
                            + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date2 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date3 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date5 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date6 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date7 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "' ) and class <>'" + class_0 + "' order by cs.serial asc");
                    System.out.println("select * from clients_product cs left outer join clients c on cs.id_client=c.id_client left"
                            + " outer join product p on p.id_product=cs.id_product left outer join countries co on co.region=cs.region left outer "
                            + "join wrongs w on w.serial=cs.serial "
                            + "left outer join elsiana si on si.serial=cs.serial and si.id in "
                            + "( select max(id) from elsiana sii  where sii.serial= cs.serial) "
                            + " left outer join el3otl el on el.serial=cs.serial and el.id in "
                            + "( select max(id) from el3otl ell  where ell.serial= cs.serial) "
                            
                             +" left outer join archive ar on ar.serial=cs.serial and ar.id_archive="+archive_value+" and ar.id in "
                            + "( select max(id) from archive arr  where arr.serial= cs.serial and arr.id_archive="+archive_value+"  and arr.date "+ "between '" + s_e_m[0] + "' and '" + s_e_m[1] + "') " 
                           
                            +" left outer join archive ar2 on ar2.serial=cs.serial and ar2.id_archive="+archive_value+" and ar2.id in "
                            + "( select max(id) from archive arr2  where arr2.serial= cs.serial and arr2.id_archive="+archive_value+"   and arr2.date <'" + s_e_m[0] + "' )"
                                 
                            + " where ( date1 "
                            + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date2 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date3 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date5 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date6 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
                            + " or date7 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "' ) and class <>'" + class_0 + "'");
//                        System.out.println("select* from clients_product where date1 "
//                                + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date2_3 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date5 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'"
//                                + " or date6_7 " + "between '" + month_year_day_start + "' and '" + month_year_day_end + "'");
                    m.add_siana_el2st_2(rs, month_year_day_end, "type_elsiana");

                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (m.flag_3otl_siana == 2) {

                System.out.println(month_year_day_start + " " + month_year_day_end);
                try {

                    ResultSet rs = m.ob.stmt.executeQuery(
                            "select * from clients_product cs left outer join clients c on cs.id_client=c.id_client left outer join product p on p.id_product=cs.id_product left outer join countries co on co.region=cs.region left outer join wrongs w on w.serial=cs.serial "
                            + " left outer join el2st si on si.serial=cs.serial and si.id in "
                            + "( select max(id) from el2st sii  where sii.serial= cs.serial) "
                                    
                            +" left outer join archive ar on ar.serial=cs.serial and ar.id_archive="+archive_value+" and ar.id in "
                            + "( select max(id) from archive arr  where arr.serial= cs.serial and arr.id_archive="+archive_value+"  and arr.date "+ "between '" + s_e_m[0] + "' and '" + s_e_m[1] + "') " 
                           
                            +" left outer join archive ar2 on ar2.serial=cs.serial and ar2.id_archive="+archive_value+" and ar2.id in "
                            + "( select max(id) from archive arr2  where arr2.serial= cs.serial and arr2.id_archive="+archive_value+"   and arr2.date <'" + s_e_m[0] + "' )"
                                    
                            + " where date_el2st between '" + month_year_day_start + "' and '" + month_year_day_end + "'");

                    m.add_siana_el2st(rs, month_year_day_end, "price");

                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        m.jLabel_count_siana.setText(String.valueOf(m.model_siana.getRowCount()));
    }

    public boolean check_redandancy(DefaultTableModel to_model, String serial, int serial_col) {

        for (int g = 0; g < to_model.getRowCount(); g++) {

            if (serial.equals(String.valueOf(to_model.getValueAt(g, serial_col)))) {

                return false;
            }

        }
        return true;
    }

//    void mark_client_in_archive(String hint, String serial, String table_clients_product) throws SQLException {
//
//        m.ob.stmt = m.ob.conn.createStatement();
//        m.ob.stmt.executeUpdate("update " + table_clients_product + " set hints='" + hint + "' where serial=" + serial);
//
//    }
    /* we pathed the flag to this function because color in siana change to green if the client has added to archive from elsiana or 
     el3otl, so when we in siana flag 3otl=0 and we need flag 3otl = 0 to to get pather siana and = 1 to get patern 3otl
     */

//    String get_pattern_siana(int flag) {
//        String pattern = "";
//        if (flag == 0) {
//            pattern = "S";
//        } else if (flag == 1) {
//            pattern = "W";
//        } else if (flag == 2) {
//            pattern = "T";
//        }
//        return pattern;
//    }

    public void  add_row_to_archive(DefaultTableModel from_model, DefaultTableModel to_model,DefaultTableModel background_model ,String table_hints_name, int serial_col,int archive_col ,int row , boolean flag
//          ,  int hints_column, String pattern, String table_clients_product, DefaultTableModel background_model
    ) {
       
        String re=null ;
          try {
        Object[] ob = new Object[to_model.getColumnCount()];
        String serial = String.valueOf(from_model.getValueAt(row, serial_col));
        String hint = "";
              System.out.println("Archive"+serial);
        if (check_redandancy(to_model, serial, serial_col) == true) {

            int c = 0;
            for (; c < from_model.getColumnCount(); c++) {
                ob[c] = (String) from_model.getValueAt(row, c);
            }
          

                m.ob.stmt = m.ob.conn.createStatement();
                ResultSet rs_2 = m.ob.stmt.executeQuery("select hints , date from " + table_hints_name + " where serial=" + serial
                        + " and id in " + "( select max(id) from  " + table_hints_name + " where serial=" + serial
                        + ")");
                if (rs_2.next()) {
                    ob[c++] = String.valueOf(rs_2.getString(1));
                    ob[c++] = String.valueOf(rs_2.getString(2));
                }

//                if (hints_column != -1) {
//                    hint = String.valueOf(from_model.getValueAt(row, hints_column)).replaceAll("#~" + pattern + ".*~", "")
//                            + "#"
//                            + "~" + pattern + "/" + m.ob.time_now() + "~";
////                    System.out.println(hint);
//                    mark_client_in_archive(hint, serial, table_clients_product);
//                    from_model.setValueAt(hint, row, hints_column);
//                    int rt = m.ob.get_client_from_back_table(serial, background_model, serial_col);
//                    if (rt != -1) {
//                        background_model.setValueAt(hint, rt, hints_column);
//                    }
//                }
                
                to_model.addRow(ob);
                

        }
         if(flag) {
             re=add_archive(serial)  ;
             
             from_model.setValueAt(re, row, archive_col);
              
              int rt = m.ob.get_client_from_back_table(serial, background_model, serial_col);
                if (rt != -1) {
                    background_model.setValueAt(re, rt, archive_col);
                }
              
         }
           JOptionPane.showMessageDialog(null, "تم الحفظ");
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "خطأ" + "\n" + ex.getMessage());
            }
     
    }

    public void add_all_to_archive(DefaultTableModel from_model, DefaultTableModel to_model,DefaultTableModel background_model, String table_hints_name, int serial_col,int archive_col , boolean flag
//            , int hints_column, String pattern, String table_clients_product, DefaultTableModel background_model
    ) {
        String serials = "";
        String hint = "";
        try {
            Object[] ob = new Object[to_model.getColumnCount()];
            for (int i = 0; i < from_model.getRowCount() - 1; i++) {
                if (check_redandancy(to_model, String.valueOf(from_model.getValueAt(i, serial_col)), serial_col) == true) {
                    serials += String.valueOf(from_model.getValueAt(i, serial_col)) + ",";
                    for (int c = 0; c < from_model.getColumnCount(); c++) {
                        ob[c] = (String) from_model.getValueAt(i, c);
                    }
                    to_model.addRow(ob);
//                    if (hints_column != -1) {
//                        hint = String.valueOf(from_model.getValueAt(i, hints_column)).replaceAll("#~" + pattern + ".*~", "")
//                                + "#"
//                                + "~" + pattern + "/" + m.ob.time_now() + "~";
//                        mark_client_in_archive(hint, String.valueOf(from_model.getValueAt(i, serial_col)), table_clients_product);
//                        from_model.setValueAt(hint, i, hints_column);
//                        int rt = m.ob.get_client_from_back_table(String.valueOf(from_model.getValueAt(i, serial_col)), background_model, serial_col);
//                        if (rt != -1) {
//                            background_model.setValueAt(hint, rt, hints_column);
//                        }
//                    }
                }
             if(flag) {
                 String re=add_archive(String.valueOf(from_model.getValueAt(i, serial_col)));   
             from_model.setValueAt(re, i, archive_col);
                int rt = m.ob.get_client_from_back_table(String.valueOf(from_model.getValueAt(i, serial_col)), background_model, serial_col);
                if (rt != -1) {
                    background_model.setValueAt(re, rt, archive_col);
                }
             }
            }
            if (check_redandancy(to_model, String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col)), serial_col) == true) {
                serials += String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col));
                for (int c = 0; c < from_model.getColumnCount(); c++) {
                    ob[c] = (String) from_model.getValueAt(from_model.getRowCount() - 1, c);
                }
//                if (hints_column != -1) {
//                    hint = String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, hints_column)).replaceAll("#~" + pattern + ".*~", "")
//                            + "#"
//                            + "~" + pattern + "/" + m.ob.time_now() + "~";
//                    mark_client_in_archive(hint, String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col)), table_clients_product);
//                    from_model.setValueAt(hint, from_model.getRowCount() - 1, hints_column);
//                    int rt = m.ob.get_client_from_back_table(String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col)), background_model, serial_col);
//                    if (rt != -1) {
//                        background_model.setValueAt(hint, rt, hints_column);
//                    }
//                }
                to_model.addRow(ob);
            }
          if(flag)    {
             String re= add_archive(String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col)));
             
            from_model.setValueAt(re, from_model.getRowCount() - 1, archive_col);
                int rt = m.ob.get_client_from_back_table(String.valueOf(from_model.getValueAt(from_model.getRowCount() - 1, serial_col)), background_model, serial_col);
                if (rt != -1) {
                    background_model.setValueAt(re, rt, archive_col);
                }
          }

            m.ob.stmt = m.ob.conn.createStatement();

            ResultSet rs_2 = m.ob.stmt.executeQuery("select serial , hints , date from " + table_hints_name + " th where serial in (" + serials
                    + ") and id in " + "( select max(id) from  " + table_hints_name + " where serial= th.serial "
                    + ")");
            while (rs_2.next()) {

                int row = new help().serach_in_model(to_model, serial_col, rs_2.getString(1));
                if (row != -1) {
                    to_model.setValueAt(rs_2.getString(2), row, to_model.getColumnCount() - 2);
                    to_model.setValueAt(rs_2.getString(3), row, to_model.getColumnCount() - 1);

                }

            }
            JOptionPane.showMessageDialog(null, "تم الحفظ");
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "خطأ" + "\n" + ex.getMessage());
        }

    }

    DefaultTableModel model = null;

    void search() {

        int size = 0;
        if (m.jCheckBox_current_table.isSelected()) {
            model = m.model_siana;

            size = m.model_siana.getRowCount();
        } else {
            model = m.model_siana_help;
            m.model_siana.setRowCount(0);
            size = m.model_siana_help.getRowCount();
        }
        String key_en = ((JTextField) m.jTextField_en.getDateEditor().getUiComponent()).getText();
        String key_st = ((JTextField) m.jTextField_st.getDateEditor().getUiComponent()).getText();
        String key_n_p = m.jTextField_n_p.getText();
        String key_two_n_p = m.jTextField_two_n_p.getText();

        if (m.h.class_filter_list.size() == m.h.class_list.size()) {
            if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String region_s = String.valueOf(model.getValueAt(i, 2));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && region_s.contains(key_n_p)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String region_s = String.valueOf(model.getValueAt(i, 2));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } ////////////////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String region_s = String.valueOf(model.getValueAt(i, 2));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String region_s = String.valueOf(model.getValueAt(i, 42));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 2) {
                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } ////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 1) {

                for (int i = 0; i < size; i++) {

                    String region = String.valueOf(model.getValueAt(i, 2));

                    if (region.contains(key_n_p)) {

                        add_se(i);

                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 4) {

                for (int i = 0; i < size; i++) {

                    String country = String.valueOf(model.getValueAt(i, 42));

                    if (country.contains(key_n_p)) {

                        add_se(i);

                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 5) {

                for (int i = 0; i < size; i++) {

                    String country = String.valueOf(model.getValueAt(i, 42));
                    String region = String.valueOf(model.getValueAt(i, 2));

                    if (region.contains(key_n_p) && country.contains(key_two_n_p)) {

                        add_se(i);

                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String region_s = String.valueOf(model.getValueAt(i, 42));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && region_s.contains(key_n_p)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String region_s = String.valueOf(model.getValueAt(i, 42));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));

                    try {

                        if (m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 0) {

                for (int i = 0; i < size; i++) {

                    String name_client = String.valueOf(model.getValueAt(i, 1));

                    if (name_client.contains(key_n_p)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 7) {

                for (int i = 0; i < size; i++) {

                    String hints = String.valueOf(model.getValueAt(i, 4));

                    if (hints.contains(key_two_n_p)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 8) {

                for (int i = 0; i < size; i++) {

                    String hints = String.valueOf(model.getValueAt(i, 4));

                    if (!hints.contains(key_two_n_p)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 9) {

                String serial = "";
                for (int i = 0; i < size - 1; i++) {
                    serial += String.valueOf(model.getValueAt(i, 43)) + ",";
                }
                serial += String.valueOf(model.getValueAt(size - 1, 43));

                try {
                    m.ob.stmt = m.ob.conn.createStatement();
                    ResultSet rs = null;
                    if (key_two_n_p.equals("خالي")) {
                        rs = m.ob.stmt.executeQuery("select  distinct(serial)  from clients_product h where serial in (" + serial
                                + ") and (select count(*) from hints where h.serial=serial and date between '" + key_st + "' and '" + key_en + "') = 0"
                        );

                    } else {
                        rs = m.ob.stmt.executeQuery("select  distinct(serial)  from hints where serial in (" + serial
                                + ") and hints like '%" + key_two_n_p + "%'"
                                + " and date between '" + key_st + "' and '" + key_en + "'");
                    }

                    while (rs.next()) {
                        add_se(new help().serach_in_model(model, 43, rs.getString(1)));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (m.jComboBox1.getSelectedIndex() == 10 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String type_siana = String.valueOf(model.getValueAt(i, 15));
                    // String clas = String.valueOf(model.getValueAt(i, 36));

                    if (type_siana.contains(key_two_n_p) && help_search_type_siana(key_two_n_p, date1, date2, date3, date5, date6, date7, key_st, key_en)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 10 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String type_siana = String.valueOf(model.getValueAt(i, 16));
                    // String clas = String.valueOf(model.getValueAt(i, 36));

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && type_siana.contains(key_two_n_p)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } //--------------------------------------------------------------------
            else if (m.jComboBox1.getSelectedIndex() == 11) {

                for (int i = 0; i < size; i++) {

                    String street = String.valueOf(model.getValueAt(i, 41));

                    if (street.contains(key_n_p)) {

                        add_se(i);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String street = String.valueOf(model.getValueAt(i, 41));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && street.contains(key_n_p)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String street = String.valueOf(model.getValueAt(i, 41));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && street.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } ////////////////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String street = String.valueOf(model.getValueAt(i, 41));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && street.contains(key_n_p)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 13 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    boolean ff = true;

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String type_siana = String.valueOf(model.getValueAt(i, 15));
                    String region = String.valueOf(model.getValueAt(i, 2));
                    // String clas = String.valueOf(model.getValueAt(i, 36));

                    if (type_siana.contains(key_two_n_p) && help_search_type_siana(key_two_n_p, date1, date2, date3, date5, date6, date7, key_st, key_en)
                            && region.contains(key_n_p)) {
                        add_se(i);

                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 13 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String type_siana = String.valueOf(model.getValueAt(i, 16));
                    String region = String.valueOf(model.getValueAt(i, 2));
                    // String clas = String.valueOf(model.getValueAt(i, 36));

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && type_siana.contains(key_two_n_p) && region.contains(key_n_p)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 14) {

                for (int i = 0; i < size; i++) {

                    String column_content = String.valueOf(model.getValueAt(i, m.jTable_siana.convertColumnIndexToModel(m.jTable_siana.getSelectedColumn())));

                    if (column_content.contains(key_n_p)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 16) {

                for (int i = 0; i < size; i++) {

                    try {
                        if (String.valueOf(model.getValueAt(i, 44)).contains(key_two_n_p) && m.ob.time_between(key_st, String.valueOf(model.getValueAt(i, 45)), key_en)) {

                            add_se(i);
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        } else {

            if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String region_s = String.valueOf(model.getValueAt(i, 2));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String region_s = String.valueOf(model.getValueAt(i, 2));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 4) {

                for (int i = 0; i < size; i++) {

                    String country = String.valueOf(model.getValueAt(i, 42));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (country.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);

                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 5) {

                for (int i = 0; i < size; i++) {

                    String country = String.valueOf(model.getValueAt(i, 42));
                    String region = String.valueOf(model.getValueAt(i, 2));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (region.contains(key_n_p) && country.contains(key_two_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);

                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String region_s = String.valueOf(model.getValueAt(i, 42));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String region_s = String.valueOf(model.getValueAt(i, 42));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 1) {

                for (int i = 0; i < size; i++) {
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    String region = String.valueOf(model.getValueAt(i, 2));

                    if (region.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));

                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en)
                                || m.ob.time_between(key_st, date7, key_en)) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 0) {

                for (int i = 0; i < size; i++) {
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    String name_client = String.valueOf(model.getValueAt(i, 1));

                    if (name_client.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 7) {

                for (int i = 0; i < size; i++) {

                    String hints = String.valueOf(model.getValueAt(i, 4));
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    if (hints.contains(key_two_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 8) {

                for (int i = 0; i < size; i++) {

                    String hints = String.valueOf(model.getValueAt(i, 4));
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    if (!hints.contains(key_two_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } ////////////////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 3 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String region_s = String.valueOf(model.getValueAt(i, 2));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 6 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String region_s = String.valueOf(model.getValueAt(i, 42));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && region_s.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 2 && m.flag_3otl_siana == 2) {
                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } ////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 9) {

                String serial = "";
                for (int i = 0; i < size - 1; i++) {

                    String clas = String.valueOf(model.getValueAt(i, 36));
                    if (m.h.check_class_filter(clas)) {
                        serial += String.valueOf(model.getValueAt(i, 43)) + ",";
                    }
                }
                if (m.h.check_class_filter(String.valueOf(model.getValueAt(size - 1, 36)))) {
                    serial += String.valueOf(model.getValueAt(size - 1, 43));
                }
                try {
                    ResultSet rs = null;
                    if (key_two_n_p.equals("خالي")) {
                        rs = m.ob.stmt.executeQuery("select  distinct(serial)  from clients_product h where serial in (" + serial
                                + ") and (select count(*) from hints where h.serial=serial and date between '" + key_st + "' and '" + key_en + "') = 0"
                        );

                    } else {
                        rs = m.ob.stmt.executeQuery("select  distinct(serial)  from hints where serial in (" + serial
                                + ") and hints like '%" + key_two_n_p + "%'"
                                + " and date between '" + key_st + "' and '" + key_en + "'");
                    }
                    while (rs.next()) {
                        add_se(new help().serach_in_model(model, 43, rs.getString(1)));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (m.jComboBox1.getSelectedIndex() == 10 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String type_siana = String.valueOf(model.getValueAt(i, 15));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (type_siana.contains(key_two_n_p) && help_search_type_siana(key_two_n_p, date1, date2, date3, date5, date6, date7, key_st, key_en)
                            && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 10 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String type_siana = String.valueOf(model.getValueAt(i, 16));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && type_siana.contains(key_two_n_p) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } //--------------------------------------------------------------------
            else if (m.jComboBox1.getSelectedIndex() == 11) {

                for (int i = 0; i < size; i++) {

                    String street = String.valueOf(model.getValueAt(i, 41));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (street.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 0) {

                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String street = String.valueOf(model.getValueAt(i, 41));
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    try {

                        if ((m.ob.time_between(key_st, date1, key_en) || m.ob.time_between(key_st, date2, key_en) || m.ob.time_between(key_st, date3, key_en)
                                || m.ob.time_between(key_st, date5, key_en) || m.ob.time_between(key_st, date6, key_en) || m.ob.time_between(key_st, date7, key_en))
                                && street.contains(key_n_p) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 1) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));
                    String street = String.valueOf(model.getValueAt(i, 41));
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && street.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } ////////////////////////////////////////////////////////////////////////////////////////////
            else if (m.jComboBox1.getSelectedIndex() == 12 && m.flag_3otl_siana == 2) {

                for (int i = 0; i < size; i++) {

                    String date_wrong = String.valueOf(model.getValueAt(i, 21));
                    String street = String.valueOf(model.getValueAt(i, 41));
                    String clas = String.valueOf(model.getValueAt(i, 36));
                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && street.contains(key_n_p) && m.h.check_class_filter(clas)) {
                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            } else if (m.jComboBox1.getSelectedIndex() == 13 && m.flag_3otl_siana == 0) {
                for (int i = 0; i < size; i++) {

                    String date1 = String.valueOf(model.getValueAt(i, 9));
                    String date2 = String.valueOf(model.getValueAt(i, 10));
                    String date3 = String.valueOf(model.getValueAt(i, 11));
                    String date5 = String.valueOf(model.getValueAt(i, 12));
                    String date6 = String.valueOf(model.getValueAt(i, 13));
                    String date7 = String.valueOf(model.getValueAt(i, 14));
                    String type_siana = String.valueOf(model.getValueAt(i, 15));
                    String region = String.valueOf(model.getValueAt(i, 2));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (type_siana.contains(key_two_n_p) && help_search_type_siana(key_two_n_p, date1, date2, date3, date5, date6, date7, key_st, key_en)
                            && region.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 13 && m.flag_3otl_siana == 1) {
                for (int i = 0; i < size; i++) {

                    String type_siana = String.valueOf(model.getValueAt(i, 16));
                    String region = String.valueOf(model.getValueAt(i, 2));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    String date_wrong = String.valueOf(model.getValueAt(i, 17));

                    try {

                        if (m.ob.time_between(key_st, date_wrong, key_en) == true && type_siana.contains(key_two_n_p) && region.contains(key_n_p)
                                && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 14) {

                for (int i = 0; i < size; i++) {

                    String column_content = String.valueOf(model.getValueAt(i, m.jTable_siana.convertColumnIndexToModel(m.jTable_siana.getSelectedColumn())));
                    String clas = String.valueOf(model.getValueAt(i, 36));

                    if (column_content.contains(key_n_p) && m.h.check_class_filter(clas)) {

                        add_se(i);
                    }

                }

            } else if (m.jComboBox1.getSelectedIndex() == 16) {

                for (int i = 0; i < size; i++) {

                    try {
                        String clas = String.valueOf(model.getValueAt(i, 36));

                        if (String.valueOf(model.getValueAt(i, 44)).contains(key_two_n_p) && m.ob.time_between(key_st, String.valueOf(model.getValueAt(i, 45)), key_en) && m.h.check_class_filter(clas)) {

                            add_se(i);
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        }
        if (m.jCheckBox_current_table.isSelected()) {

            for (int i = 0; i < size; i++) {

                m.model_siana.removeRow(0);
            }
        }
        model = null;
        m.jLabel_count_siana.setText(String.valueOf(m.model_siana.getRowCount()));
    }

    void add_se(int r) {

        Object[] row = new Object[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            row[i] = (String) model.getValueAt(r, i);
        }
        m.model_siana.addRow(row);
    }

    void write(String t, int g, int i, jxl.write.Label l, WritableSheet sheet) throws WriteException {
        if (t != null) {
            l = new jxl.write.Label(g, i + 1, t);
        } else {
            l = new jxl.write.Label(g, i + 1, "");
        }
        sheet.addCell(l);
    }

    void short_sheet(JTable table) {
        int chooser = JOptionPane.showConfirmDialog(null, "هل تريد تصدير جدول مختصر ؟");
        if (chooser == 0) {
            int index = 1;
            System.out.println("siana");
            try {
//            ob.write_excel(jTable_siana);

                JFileChooser ch = new JFileChooser();
                String path = "";

                if (ch.showOpenDialog(null) == ch.OPEN_DIALOG) {
                    path = String.valueOf(ch.getSelectedFile());
                }
                TableModel model = table.getModel();
                File f = new File(path + ".xls");
                WritableWorkbook myexcel = Workbook.createWorkbook(f);
                WritableSheet sheet = myexcel.createSheet("myshete", 0);
                jxl.write.Label l = null;
                String t = "";
                // for(int i = 0; i < model.getColumnCount(); i++)
                {
                    l = new jxl.write.Label(0, 0, "م");
                    sheet.addCell(l);
                    l = new jxl.write.Label(1, 0, "الاسم");
                    sheet.addCell(l);
                    l = new jxl.write.Label(2, 0, "كود العميل");
                    sheet.addCell(l);
                    l = new jxl.write.Label(3, 0, "العنوان");
                    sheet.addCell(l);
                    l = new jxl.write.Label(4, 0, "المركز");
                    sheet.addCell(l);
                    l = new jxl.write.Label(5, 0, "المحافظه");
                    sheet.addCell(l);
                    l = new jxl.write.Label(6, 0, "التليفون");
                    sheet.addCell(l);
                    l = new jxl.write.Label(7, 0, "نوع الجهاز");
                    sheet.addCell(l);
                    l = new jxl.write.Label(8, 0, "تاريخ التركيب");
                    sheet.addCell(l);
                    l = new jxl.write.Label(9, 0, "نوع الصيانه السابقه");
                    sheet.addCell(l);
                    l = new jxl.write.Label(10, 0, "تاريخ الصيانه السابقه");

                    sheet.addCell(l);

                    l = new jxl.write.Label(11, 0, "اخر ملاحظة للعميل");
                    sheet.addCell(l);
                    l = new jxl.write.Label(12, 0, "نوع الصيانه القادمه");
                    sheet.addCell(l);
                    l = new jxl.write.Label(13, 0, "التاريخ");
                    sheet.addCell(l);
                    l = new jxl.write.Label(14, 0, "ما تم");
                    sheet.addCell(l);
                    l = new jxl.write.Label(15, 0, "الفني");
                    sheet.addCell(l);
                    l = new jxl.write.Label(16, 0, "ملاحظات جديده");
                    sheet.addCell(l);
                    l = new jxl.write.Label(17, 0, "الملاحظات");
                    sheet.addCell(l);
                    l = new jxl.write.Label(18, 0, "تاريخ 1");
                    sheet.addCell(l);
                    l = new jxl.write.Label(19, 0, "تاريخ 2");
                    sheet.addCell(l);
                    l = new jxl.write.Label(20, 0, "تاريخ 3");
                    sheet.addCell(l);
                    l = new jxl.write.Label(21, 0, "تاريخ 5");
                    sheet.addCell(l);
                    l = new jxl.write.Label(22, 0, "تاريخ 6");
                    sheet.addCell(l);
                    l = new jxl.write.Label(23, 0, "تاريخ 7");
                    sheet.addCell(l);
                    l = new jxl.write.Label(24, 0, "العطل");
                    sheet.addCell(l);
//           t="م";
//             write(t, 0, 0, l, sheet);
//              t="الأسم";
//             write(t, 1, 0, l, sheet);
//              t="م";
//             write(t, 0, 0, l, sheet);
                }

                for (int i = 0; i < model.getRowCount(); i++) {

                    t = String.valueOf(index++);
                    write(t, 0, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 1));
                    write(t, 1, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 0));
                    write(t, 2, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 40)) + "-" + String.valueOf(model.getValueAt(i, 41));
                    write(t, 3, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 2));
                    write(t, 4, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 42));
                    write(t, 5, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 3));
                    write(t, 6, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 6));
                    write(t, 7, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 8));
                    write(t, 8, i, l, sheet);
                    if (!model.getValueAt(i, 0).equals("*******")) {
                        try {
                            m.ob.stmt = m.ob.conn.createStatement();
//                    System.out.println("select type_elsiana , date from elsiana where id_client="+String.valueOf(model.getValueAt(i,0))
//                            +" and id_product="+String.valueOf(model.getValueAt(i,5))+" and date_buy='"+String.valueOf(model.getValueAt(i,8))
//                        +"' and date='"+"(select max(date) from elsiana  where id_client="+String.valueOf(model.getValueAt(i,0))
//                            +" and id_product="+String.valueOf(model.getValueAt(i,5))+" and date_buy='"+String.valueOf(model.getValueAt(i,8))+"')");

                            ResultSet rs = m.ob.stmt.executeQuery("select type_elsiana , date from elsiana where serial=" + String.valueOf(model.getValueAt(i, 43))
                                    + " and date in " + "( select max(date) from elsiana  where serial=" + String.valueOf(model.getValueAt(i, 43))
                                    + ")");

                            if (rs.next()) {
                                t = String.valueOf(rs.getString(1));
                                write(t, 9, i, l, sheet);
                                t = String.valueOf(rs.getString(2));
                                write(t, 10, i, l, sheet);
                            }

                            ResultSet rs_2 = m.ob.stmt.executeQuery("select hints  from hints where serial=" + String.valueOf(model.getValueAt(i, 43))
                                    + " and date in " + "( select max(date) from hints  where serial=" + String.valueOf(model.getValueAt(i, 43))
                                    + ")");
                            if (rs_2.next()) {
                                t = String.valueOf(rs_2.getString(1));
                                write(t, 11, i, l, sheet);
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        write("*******", 7, i, l, sheet);
                        write("*******", 8, i, l, sheet);
                    }
                    t = String.valueOf(model.getValueAt(i, 15));
                    write(t, 12, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 4));
                    write(t, 17, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 9));
                    write(t, 18, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 10));
                    write(t, 19, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 11));
                    write(t, 20, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 12));
                    write(t, 21, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 13));
                    write(t, 22, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 14));
                    write(t, 23, i, l, sheet);
                    t = String.valueOf(model.getValueAt(i, 16));
                    write(t, 24, i, l, sheet);

                }
                myexcel.write();
                myexcel.close();

            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (WriteException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (chooser == 1) {
            try {
                m.ob.write_excel(m.jTable_siana);
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (WriteException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

//    void search_classses() {
//        m.model_siana.setRowCount(0);
//        
//        
//        if (m.jComboBox_class_elsiana.getSelectedIndex() == 0) {
//
//            for (int i = 0; i < m.model_siana_help.getRowCount(); i++) {
//
//               
//
//              
//                    add_se(i);
//                
//
//            }
//
//        }
//        else  {
//
//            for (int i = 0; i < m.model_siana_help.getRowCount(); i++) {
//
//                String clas = String.valueOf(m.model_siana_help.getValueAt(i, 36));
//
//                if (clas.equalsIgnoreCase(String.valueOf(m.jComboBox_class_elsiana.getSelectedItem()))) {
//                    add_se(i);
//
//                }
//
//            }
//
//        } 
//        m.jLabel_count_siana.setText(String.valueOf(m.model_siana.getRowCount()));
//
//    }
    boolean help_search_type_siana(String type_siana, String date1, String date2, String date3, String date5, String date6, String date7, String key_st, String key_en) {
        try {
            if (type_siana.contains("1")) {

                if (m.ob.time_between(key_st, date1, key_en) == false) {
                    return false;
                }

            }
            if (type_siana.contains("2")) {
                if (m.ob.time_between(key_st, date2, key_en) == false) {
                    return false;
                }
            }
            if (type_siana.contains("3")) {
                if (m.ob.time_between(key_st, date3, key_en) == false) {
                    return false;
                }
            }
            if (type_siana.contains("5")) {
                if (m.ob.time_between(key_st, date5, key_en) == false) {
                    return false;
                }
            }
            if (type_siana.contains("6")) {
                if (m.ob.time_between(key_st, date6, key_en) == false) {
                    return false;
                }
            }
            if (type_siana.contains("7")) {
                if (m.ob.time_between(key_st, date7, key_en) == false) {
                    return false;
                }
            }

        } catch (ParseException ex) {
            Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    void comp() {
        //   System.out.println(jComboBox1.getSelectedIndex());
        if (m.jComboBox1.getSelectedIndex() == 1) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setText("المركز");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);

        } else if (m.jComboBox1.getSelectedIndex() == 0) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setText("الأسم");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);

        } else if (m.jComboBox1.getSelectedIndex() == 2) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setText("المحافظة");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 3) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setText("المركز");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 4) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setText("المحافظة");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 6) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setText("المحافظة");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 5) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setText("المركز");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("المحافظه");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 7) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setVisible(false);

            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("الملاحظات");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 8) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setVisible(false);

            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("الملاحظات");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 9) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setVisible(false);

            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("الملاحظات");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);

        } else if (m.jComboBox1.getSelectedIndex() == 10) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setVisible(false);

            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("نوع الصيانه");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 11) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setText("الشارع");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 12) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setText("الشارع");
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 13) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);

            m.jLabel_n.setVisible(true);
            m.jLabel_n.setText("المركز");
            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("نوع الصيانه");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);
        } else if (m.jComboBox1.getSelectedIndex() == 14) {
            if (m.jTable_siana.getSelectedColumn() != -1) {
                m.jLabel_n.setText(m.jTable_siana.getColumnName(m.jTable_siana.getSelectedColumn()));
            } else {
                m.jComboBox1.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "قم يتحديد عمود اولا ");
            }
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(true);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);
            m.jLabel_n.setVisible(true);
            m.jLabel_country.setVisible(false);
            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(false);

        } else if (m.jComboBox1.getSelectedIndex() == 15) {
            m.jTextField_st.setVisible(false);
            m.jTextField_en.setVisible(false);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(false);
            m.jLabel_en.setVisible(false);

            m.jLabel_n.setVisible(false);

            m.jLabel_country.setVisible(false);

            m.jTextField_two_n_p.setVisible(false);
            m.jComboBox_elnfe_siana.setVisible(true);

            select_elfneen(m.jComboBox_elnfe_siana);
        } else if (m.jComboBox1.getSelectedIndex() == 16) {
            m.jTextField_st.setVisible(true);
            m.jTextField_en.setVisible(true);
            m.jTextField_n_p.setVisible(false);
            m.jLabel_st.setVisible(true);
            m.jLabel_en.setVisible(true);
            m.jLabel_n.setVisible(false);
            m.jLabel_country.setVisible(true);
            m.jLabel_country.setText("نوع العملية");
            m.jTextField_two_n_p.setVisible(true);
            m.jComboBox_elnfe_siana.setVisible(false);

        }

    }

    void add_hint() {
        int i = m.jTable_siana.getSelectedRow();
        if (i != -1) {
            String serial = String.valueOf(m.model_siana.getValueAt(i, 43));

            String text = m.jTextArea2.getText();
            String date = m.ob.time_now();

            try {
                m.ob.stmt = m.ob.conn.createStatement();
                ResultSet rs = m.ob.stmt.executeQuery("SHOW TABLE STATUS WHERE `Name` = 'hints'");
                rs.next();
                String nextid = rs.getString("Auto_increment");

                m.ob.stmt.executeUpdate("insert into hints values (" + nextid + "," + serial + ",'" + m.jLabel_current_user.getText() + ": " + text + "','"
                        + date + "')");
                m.model_hints.addRow(new Object[]{nextid, m.jLabel_current_user.getText() + ": " + text, date});
                m.jTextArea2.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

    }

    int search_model_with_serial(String serial) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (serial.equals(model.getValueAt(i, 43))) {
                return i;
            }
        }
        return -1;
    }

    void delete_hint() {
        int x = m.jTable_hints.getSelectedRow();
        if (x != -1) {
            try {
                m.ob.stmt.executeUpdate("delete from hints where id=" + String.valueOf(m.model_hints.getValueAt(x, 0)));
                m.model_hints.removeRow(x);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void add_elba2e_siana_fatorh() {
        int x = m.jTable_siana.getSelectedRow();
        if (x != -1) {

            String serial = String.valueOf(m.model_siana.getValueAt(x, 43));
            String elb2e_siana = String.valueOf(m.model_siana.getValueAt(x, 35));
            String date_real = ((JTextField) m.jTextField_real_date_siana1.getDateEditor().getUiComponent()).getText();
            boolean flag_date = m.ob.check_time(date_real);
            if (flag_date == false) {
                m.jTextField_real_date_siana1.setBackground(Color.pink);
            }
            String money = m.jTextField_money_for_elb2e_elsianat.getText();
            boolean flag_maoney = m.ob.check_int(money);
            if (flag_maoney == false) {
                m.jTextField_money_for_elb2e_elsianat.setBackground(Color.pink);
            }
            if (flag_maoney == true && flag_date == true) {
                if (Double.parseDouble(money) + Double.parseDouble(elb2e_siana) >= 0) {
                    System.out.println("update clients_product set total_elb2e_sian=" + String.valueOf(Double.parseDouble(money) + Double.parseDouble(elb2e_siana))
                            + " where serial=" + serial);
                    try {
                        m.ob.stmt.executeUpdate("update clients_product set total_elb2e_sian=" + String.valueOf(Double.parseDouble(money) + Double.parseDouble(elb2e_siana))
                                + " where serial=" + serial);
                        m.ob.stmt.executeUpdate("insert into history_siana_elb2e values (default ," + serial + ","
                                + money + ",'" + date_real + "')");
                        m.jTextField_money_for_elb2e_elsianat.setText("");
                        m.jTextField_money_for_elb2e_elsianat.setBackground(Color.white);
                        ((JTextField) m.jTextField_real_date_siana1.getDateEditor().getUiComponent()).setText("");
                        m.jTextField_real_date_siana1.setBackground(Color.white);
                        JOptionPane.showMessageDialog(null, "عمليه ناجحه");
                        m.model_siana.removeRow(x);
                        for (int t = 0; t < m.model_siana_help.getRowCount(); t++) {
                            if (serial.equals((String) m.model_siana_help.getValueAt(t, 43))) {
                                m.model_siana_help.removeRow(t);
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "عفوا تم تسجيل دفع في ذلك اليوم من قبل لذلك العميل");
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "عفوا البلغ المدفوع أكبر من الباقي");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "من فضلك قم باختيار عميل من جدول خدمه العملاء اولا");
        }
    }

    void add_fatorh_elsiana() {
        here:
        {
            int ch = JOptionPane.showConfirmDialog(null, "من فضلك تأكد من الكميه و ما تم من صيانه أو اعطال ؟");
            if (ch != 0) {
                break here;
            }
            try {
                int x = m.jTable_siana.getSelectedRow();
                if (x != -1) {
//                    System.out.println(m.flag_siana_or_part + " " + "---------------------in siana-------------------------------------");
                    // int x = 0;

                    String date_real = ((JTextField) m.jTextField_real_date_siana.getDateEditor().getUiComponent()).getText();
                    String id_elfne = m.jTextField_id_elfne_sianat.getText();
                    String name_elfne = m.jTextField_name_elfne_sianat.getText();
                    String places_elfne = m.jTextField_places_elfne_sianat.getText();
                    String phone_elfne = m.jTextField_phone_elfne_sianat.getText();
                    String price = m.jTextField_price_elsiana.getText();

                    boolean flag_continue = true;
                    if (m.flag_insert_elfne_sianat == true) {
                        if (m.ob.check_int(id_elfne) == false) {
                            m.jTextField_id_elfne_sianat.setBackground(Color.PINK);
                            flag_continue = false;
                        } else {
                            if (m.flag_3otl_siana == 0 || m.flag_3otl_siana == 1) {

                                if (m.ob.check_insert_elfne(id_elfne) == false) {
                                    m.jTextField_id_elfne_sianat.setBackground(Color.pink);
                                    flag_continue = false;
                                }

                            } else {

                                if (m.ob.check_insert_elo7sl_new(id_elfne) == false) {
                                    m.jTextField_id_elfne_sianat.setBackground(Color.pink);
                                    flag_continue = false;
                                }
                            }

                        }

                        if (m.ob.check_int(phone_elfne) == false) {
                            m.jTextField_phone_elfne_sianat.setBackground(Color.PINK);
                            flag_continue = false;
                        }

                    }

                    if (m.ob.check_time(date_real) == false) {
                        ((JTextField) m.jTextField_real_date_siana.getDateEditor().getUiComponent()).setBackground(Color.pink);
                        flag_continue = false;
                    }
                    // if (ob.check_int(price)==false||Double.parseDouble(price)<1)
                    if (m.ob.check_int(price) == false || Double.parseDouble(price) < 0) {
                        m.jTextField_price_elsiana.setBackground(Color.pink);
                        flag_continue = false;
                    }

                    if (flag_continue == true) {
                        if (m.flag_insert_elfne_sianat == true && (m.flag_3otl_siana == 0 || m.flag_3otl_siana == 1)) {
                            m.ob.insert_into_elfne(id_elfne, name_elfne, phone_elfne, places_elfne);
                            JOptionPane.showMessageDialog(null, "تم تسجيل الفني بنجاح");
                        } else if (m.flag_insert_elfne_sianat == true && m.flag_3otl_siana == 2) {
                            m.ob.insert_into_elmo7sl(id_elfne, name_elfne, phone_elfne, places_elfne);
                            JOptionPane.showMessageDialog(null, "تم تسجيل المحصل بنجاح");
                        }

                        String date1 = "";
                        String date2 = "";
                        String date3 = "";
                        String date5 = "";
                        String date6 = "";
                        String date7 = "";

                        String quantity = String.valueOf(m.model_siana.getValueAt(x, 7));
                        date1 = String.valueOf(m.model_siana.getValueAt(x, 9));
                        date2 = String.valueOf(m.model_siana.getValueAt(x, 10));
                        date3 = String.valueOf(m.model_siana.getValueAt(x, 11));
                        date5 = String.valueOf(m.model_siana.getValueAt(x, 12));
                        date6 = String.valueOf(m.model_siana.getValueAt(x, 13));
                        date7 = String.valueOf(m.model_siana.getValueAt(x, 14));
                        String siana_1 = String.valueOf(m.model_siana.getValueAt(x, 23));
                        String siana_2 = String.valueOf(m.model_siana.getValueAt(x, 24));
                        String siana_3 = String.valueOf(m.model_siana.getValueAt(x, 25));
                        String siana_5 = String.valueOf(m.model_siana.getValueAt(x, 26));
                        String siana_6 = String.valueOf(m.model_siana.getValueAt(x, 27));
                        String siana_7 = String.valueOf(m.model_siana.getValueAt(x, 28));
                        String rsed_1 = String.valueOf(m.model_siana.getValueAt(x, 29));
                        String rsed_2 = String.valueOf(m.model_siana.getValueAt(x, 30));
                        String rsed_3 = String.valueOf(m.model_siana.getValueAt(x, 31));
                        String rsed_5 = String.valueOf(m.model_siana.getValueAt(x, 32));
                        String rsed_6 = String.valueOf(m.model_siana.getValueAt(x, 33));
                        String rsed_7 = String.valueOf(m.model_siana.getValueAt(x, 34));
                        String serial = String.valueOf(m.model_siana.getValueAt(x, 43));
                        String type_elsiana = String.valueOf(m.model_siana.getValueAt(x, 15));

                        String nsbt_el2mla7_before = m.jTextField_nsbt_el2mlah_before_elsiana.getText();
                        String nsbt_el2mla7_after = m.jTextField_nsbt_el2mlah_after_elsiana.getText();
                        if (m.flag_3otl_siana == 0) {

                            ResultSet rs_c = m.ob.stmt.executeQuery("select * from elsiana where serial=" + serial + " and date='" + date_real + "'");
                            if (rs_c.next()) {
                                if (JOptionPane.showConfirmDialog(null, "عفوا تم تتسجيل صيانه بهذا التاريخ لذلك العميل من قبل اذا كنت ترغب بألغاء العمليه قم بالضغط نعم ؟") == 0) {
                                    break here;
                                }
                            }
                            int id_type_elsiana = type_elsiana_list.get(m.jComboBox_type_elsiana.getSelectedIndex()).getId_type_elsiana();
                            String re[] = m.ob.update_dates_siana(date1, date2, date3, date5, date6, date7, type_elsiana, serial, siana_1, siana_2, siana_3,
                                    siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, quantity, date_real);

                            m.ob.insert_elsiana(serial, type_elsiana, date_real, id_elfne,
                                    price, id_type_elsiana,
                                    nsbt_el2mla7_before, nsbt_el2mla7_after, re);

                            if (m.model_siana.getValueAt(x, 17) != null
                                    && String.valueOf(m.model_siana.getValueAt(x, 17)).length() != 0) {

                                if (JOptionPane.showConfirmDialog(null, "اذا قامت الصيانة باصلاح العطل : " + "\n" + m.model_siana.getValueAt(x, 16) + "\n"
                                        + " المسجل للعميل و ترغب بمسح العطل قم بالضغط نعم ؟") == 0) {
                                    m.ob.stmt = m.ob.conn.createStatement();
                                    m.ob.stmt.executeUpdate("delete from wrongs where serial=" + serial);
//                                    mark_client_in_archive(String.valueOf(
//                                            m.model_siana.getValueAt(x, 4)).replaceAll("#~[" + get_pattern_siana(0) + "," + get_pattern_siana(1) + "].*~", ""), serial, "clients_product");
                                } 
//                                else {
//                                    mark_client_in_archive(String.valueOf(
//                                            m.model_siana.getValueAt(x, 4)).replaceAll("#~" + get_pattern_siana(m.flag_3otl_siana) + ".*~", ""), serial, "clients_product");
//                                }

                            } 
//                            else {
//                                mark_client_in_archive(String.valueOf(
//                                        m.model_siana.getValueAt(x, 4)).replaceAll("#~" + get_pattern_siana(m.flag_3otl_siana) + ".*~", ""), serial, "clients_product");
//                            }

                            //  model_siana.removeRow(x);
//                            m.model_siana.removeRow(x);
                        } else if ((m.flag_3otl_siana == 1)) {

                            ResultSet rs_c = m.ob.stmt.executeQuery("select * from el3otl where serial=" + serial + " and date='" + date_real + "'");
                            if (rs_c.next()) {
                                if (JOptionPane.showConfirmDialog(null, "عفوا تم تتسجيل عطل بهذا التاريخ لذلك العميل من قبل اذا كنت ترغب بألغاء العمليه قم بالضغط نعم ؟") == 0) {
                                    break here;
                                }
                            }

                            String type_3otl = String.valueOf(m.model_siana.getValueAt(x, 16));
                            String date_el3otl = String.valueOf(m.model_siana.getValueAt(x, 17));
                            String date_end = String.valueOf(m.model_siana.getValueAt(x, 19));
                            if (!date_el3otl.equals(date_real)) {
                                if (m.ob.time_compare(date_el3otl, date_real) == false) {
                                    JOptionPane.showMessageDialog(null, "عفوا يجب ان يكون تارخ اتمام العطل بعد تارخ التسجل");
                                    break here;
                                }
                            }

                            String re[] = new String[2];
                            if (type_elsiana.length() > 0) {
                                type_3otl += "#" + type_elsiana;
                                re = m.ob.update_dates_siana(date1, date2, date3, date5, date6, date7, type_elsiana, serial, siana_1, siana_2, siana_3,
                                        siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, quantity, date_real);
                            }
//                   
                            String mark = "";

                            if (m.ob.time_compare(date_real, date_end) || date_real.equals(date_end)) {
                                mark = "2";
                            } else {
                                mark = "1";
                            }

                            m.ob.insert_el3otl(serial, type_3otl, date_real, mark, id_elfne, date_el3otl, date_end, price, nsbt_el2mla7_before, nsbt_el2mla7_after, re);
//                                m.model_siana.removeRow(x);
                            m.ob.stmt.executeUpdate("delete from wrongs" + " where serial = " + serial);
//                            mark_client_in_archive(String.valueOf(
//                                    m.model_siana.getValueAt(x, 4)).replaceAll("#~[" + get_pattern_siana(0) + "," + get_pattern_siana(1) + "].*~", ""), serial, "clients_product");
                            m.jLabel_wrong_notify.setText(String.valueOf(m.model_siana_help.getRowCount() - 1));

                        } else if ((m.flag_3otl_siana == 2)) {
                            if (el2st(x, serial, date_real, id_elfne, price) == false) {
                                break here;
                            }
//                            mark_client_in_archive(String.valueOf(
//                                    m.model_siana.getValueAt(x, 4)).replaceAll("#~" + get_pattern_siana(m.flag_3otl_siana) + ".*~", ""), serial, "clients_product");
                        }

                        delete_from_elsian_table(serial, x);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "من فضلك تأكد من أختيار عميل من جدول خدمه العملاء ");
                }
            } catch (Exception e) {
                java.awt.Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "لم يتم التسجيل بنجاح", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

    void delete_from_elsian_table(String serial, int x) {
        m.model_siana.removeRow(x);
        for (int t = 0; t < m.model_siana_help.getRowCount(); t++) {
            if (serial.equals((String) m.model_siana_help.getValueAt(t, 43))) {
                m.model_siana_help.removeRow(t);
            }
        }
        m.jLabel_count_siana.setText(String.valueOf(m.model_siana_help.getRowCount()));
        m.jTextField_id_elfne_sianat.setBackground(Color.WHITE);
        m.jTextField_phone_elfne_sianat.setBackground(Color.WHITE);
        ((JTextField) m.jTextField_real_date_siana.getDateEditor().getUiComponent()).setBackground(Color.white);
        m.jTextField_price_elsiana.setBackground(Color.white);
    }

    boolean el2st(int x, String serial, String time, String id_elmo7sl, String el2st) throws SQLException {
        boolean flag = true;
        here:
        {
            String date_el2st = String.valueOf(m.model_siana.getValueAt(x, 21));
            String elb2e_this_product = String.valueOf(m.model_siana.getValueAt(x, 22));
      //  JOptionPane.showMessageDialog(null, elb2e_this_product);

            //  String el2st = JOptionPane.showInputDialog(null, "من فضلك قم بادخال المبلغ ");
//        boolean flag_el2st = ob.check_int(el2st);
//        if (flag_el2st == false) {
//           JOptionPane.showMessageDialog(null,"من فضلك تأكد من أدخال مبلغ موجب ");
//           flag=false ;
//           break here ;
//        }
            if (Double.parseDouble(el2st) > Double.parseDouble(elb2e_this_product)) {
                JOptionPane.showMessageDialog(null, "عفوا المبلغ المتبقي أكبر من من المبلغ المدفوع");
                flag = false;
                break here;
            }

            ResultSet rs_c = m.ob.stmt.executeQuery("select * from el2st where serial=" + serial + " and date='" + time + "'");
            if (rs_c.next()) {
                if (JOptionPane.showConfirmDialog(null, "عفوا تم تتسجيل قسط بهذا التاريخ لذلك العميل من قبل اذا كنت ترغب بألغاء العمليه قم بالضغط نعم ؟") == 0) {
                    flag = false;
                    break here;
                }
            }

            String nezam_eldf3 = String.valueOf(m.model_siana.getValueAt(x, 18));
            String el2st_product = String.valueOf(m.model_siana.getValueAt(x, 20));

            m.ob.insert_el2st(serial, el2st, el2st_product, time, id_elmo7sl);
            String new_elb2e_this_product = String.valueOf(Double.parseDouble(elb2e_this_product) - Double.parseDouble(el2st));
            if (Double.parseDouble(new_elb2e_this_product) == 0) {
                m.ob.update_date_el2st(serial, "0000-01-01", new_elb2e_this_product);

            } else {

                m.ob.update_date_el2st(serial, m.ob.time_month(date_el2st, Integer.parseInt(nezam_eldf3)), new_elb2e_this_product);

            }
//            m.model_siana.removeRow(x);

        }
        return flag;
    }

    void t2gel() {
        int x = m.jTable_siana.getSelectedRow();
        if (x != -1) {

            String date1 = "";
            String date2 = "";
            String date3 = "";
            String date5 = "";
            String date6 = "";
            String date7 = "";

            String serial = String.valueOf(m.model_siana.getValueAt(x, 43));
            date1 = String.valueOf(m.model_siana.getValueAt(x, 9));
            date2 = String.valueOf(m.model_siana.getValueAt(x, 10));
            date3 = String.valueOf(m.model_siana.getValueAt(x, 11));
            date5 = String.valueOf(m.model_siana.getValueAt(x, 12));
            date6 = String.valueOf(m.model_siana.getValueAt(x, 13));
            date7 = String.valueOf(m.model_siana.getValueAt(x, 14));
            String type_elsiana = String.valueOf(m.model_siana.getValueAt(x, 15));
            String date_real = ((JTextField) m.jTextField_real_date_siana2.getDateEditor().getUiComponent()).getText();
            m.ob.t2gel_dates_siana(type_elsiana, serial, date1, date2, date3, date5, date6, date7, date_real);
            JOptionPane.showMessageDialog(null, "تم التأجيل");
            // model_siana.removeRow(x);
//                for (int t = 0; t < model_siana_help.getRowCount(); t++) {
//                    if (id_client.equals((String) model_siana_help.getValueAt(t, 0))
//                            && id_product.equals((String) model_siana_help.getValueAt(t, 5))
//                            && date_buy.equals((String) model_siana_help.getValueAt(t, 8))) {
//                   //     model_siana_help.removeRow(t);                   }
            //    }
        }
    }

//    void insert_elfneen() {
//        try {
//            m.ob.stmt = m.ob.conn.createStatement();
//            ResultSet rs = m.ob.stmt.executeQuery("select * from elfne");
//            while (rs.next()) {
//                m.elfne_list.add(new elfne(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
//                m.jComboBox_elfne_trkeb.addItem(rs.getString(2));
//                m.jComboBox_elnfe_siana.addItem(rs.getString(2));
//                m.h.jComboBox_elfne_clients_trport.addItem(rs.getString(2));
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//    }
//
//    int find_elfne(String name_elfne) {
//        for (int i = 0; i < m.elfne_list.size(); i++) {
//            if (m.elfne_list.get(i).name_elfne.contains(name_elfne)) {
//                return i;
//            }
//        }
//        return -1;
//    }
    List<elfne> elfneen_list = new ArrayList<>();
//    List<Integer> positions = new ArrayList<>();

    void select_elfneen(JComboBox comp) {

        comp.removeAllItems();
        elfneen_list.clear();
//        positions.clear();
        try {
            m.ob.stmt = m.ob.conn.createStatement();
            ResultSet rs = m.ob.stmt.executeQuery("select name_elfne , places from elfne");
            while (rs.next()) {

//                positions.add(elfneen_list.size());
                elfneen_list.add(new elfne(rs.getString(1), rs.getString(2)));
                comp.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);

        }
        comp.setPopupVisible(true);
    }

//    void filter_elfneen(final JComboBox comp, final String query) {
//                 comp.removeAllItems();
////                    positions.clear();
//                   
//                    for (int i = 0; i < elfneen_list.size(); i++) {
//                        if (elfneen_list.get(i).getName().contains(query)) {
//
////                            positions.add(i);
//                            comp.addItem(elfneen_list.get(i).getName());
//
//                        }
//                    }
//                    
//                    comp.setPopupVisible(true);
// }
    void filter_elfne(DefaultTableModel model_archive, DefaultTableModel model, int col, String place) {
        model.setRowCount(0);
        String[] places = place.split("#");
        for (int i = 0; i < places.length; i++) {
            for (int v = 0; v < model_archive.getRowCount(); v++) {
                if (String.valueOf(model_archive.getValueAt(v, col)).equals(places[i])) {
                    Object[] ob = new Object[model_archive.getColumnCount()];
                    for (int c = 0; c < model_archive.getColumnCount(); c++) {
                        ob[c] = model_archive.getValueAt(v, c);
                    }
                    model.addRow(ob);
                }
            }
        }
    }

    void delete_wrong() {
        if (m.flag_3otl_siana == 1) {
            if (m.jTable_siana.getSelectedRow() != -1) {
                if (JOptionPane.showConfirmDialog(null, "هل تريد مسج العطل ؟") == 0) {
                    try {
                        m.ob.stmt.executeUpdate("delete from wrongs where serial =" + m.model_siana.getValueAt(m.jTable_siana.getSelectedRow(), 43));

                        for (int t = 0; t < m.model_siana_help.getRowCount(); t++) {
                            if (m.model_siana.getValueAt(m.jTable_siana.getSelectedRow(), 43).equals(m.model_siana_help.getValueAt(t, 43))) {
                                m.model_siana_help.removeRow(t);
                            }
                        }
                        m.model_siana.removeRow(m.jTable_siana.getSelectedRow());

                    } catch (SQLException ex) {
                        Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "عفوا قم بتحديد عميل أولا");
            }
        } else {
            JOptionPane.showMessageDialog(null, "عفوا يجب مسح العطل من شاشة الأعطال");
        }
    }

    List<type_elsiana> type_elsiana_list = new ArrayList<>();

    public void get_type_elsiana() {
        try {
            type_elsiana_list.clear();
            m.jComboBox_type_elsiana.removeAllItems();
            m.ob.stmt = m.ob.conn.createStatement();
            ResultSet rs = m.ob.stmt.executeQuery("select * from type_elsiana");
            while (rs.next()) {
                type_elsiana_list.add(new type_elsiana(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)));
                m.jComboBox_type_elsiana.addItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int check_in_el5ta(String date[], String start, String end) {
        int operation = 0;
        int num = 0;
        try {
            if (date[0] != null) {
                num++;
                if (m.ob.time_between(start, date[0], end)) {
                    operation++;
                }
            }
//                 ---------------------------------------------------------
            if (date[1] != null) {
                num++;
                if (m.ob.time_between(start, date[1], end)) {
                    operation++;
                } else {
                    if (operation > 1) {
                        return 1;
                    }
                }
            }
//                ---------------------------------------------------------
            if (date[2] != null) {
                num++;
                if (m.ob.time_between(start, date[2], end)) {
                    operation++;
                } else {
                    if (operation > 1) {
                        return 1;
                    }
                }
            }
//                 ---------------------------------------------------------
            if (date[3] != null) {
                num++;
                if (m.ob.time_between(start, date[3], end)) {
                    operation++;
                } else {
                    if (operation > 1) {
                        return 1;
                    };
                }
            }
//                 ---------------------------------------------------------
            if (date[4] != null) {
                num++;
                if (m.ob.time_between(start, date[4], end)) {
                    operation++;
                } else {
                    if (operation > 1) {
                        return 1;
                    }
                }
            }
//                 ---------------------------------------------------------
            if (date[5] != null) {
                num++;
                if (m.ob.time_between(start, date[5], end)) {
                    operation++;
                } else {
                    if (operation > 1) {
                        return 1;
                    }
                }
            }
            if (operation == num) {
                return 2;
            } else if (operation > 0) {
                return 1;
            }

//    --------------------------------------------------- old code -----------------------------------------------------------------
//            if (date[5] != null) {
//                if (m.ob.time_between(start, date[5], end)) {
//                    operation = 1;
//                } else {
//                    if (operation == 1) {
//                        return operation;
//                    }
//                }
//            }
//    if (operation==1)         return 2;
        } catch (ParseException ex) {
            Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int check_before_el5ta(String date[], String start) {
        int operation = 0;
        int num = 0;
        if (date[0] != null) {
            num++;
            if (m.ob.time_compare(date[0], start)) {
                operation++;
            }
        }
//                 ---------------------------------------------------------
        if (date[1] != null) {
            num++;
            if (m.ob.time_compare(date[1], start)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
//                 ---------------------------------------------------------
        if (date[2] != null) {
            num++;
            if (m.ob.time_compare(date[2], start)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
//                 ---------------------------------------------------------
        if (date[3] != null) {
            num++;
            if (m.ob.time_compare(date[3], start)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                };
            }
        }
//                 ---------------------------------------------------------
        if (date[4] != null) {
            num++;
            if (m.ob.time_compare(date[4], start)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
//                 ---------------------------------------------------------
        if (date[5] != null) {
            num++;
            if (m.ob.time_compare(date[5], start)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
        if (operation == num) {
            return 2;
        } else if (operation > 0) {
            return 1;
        }
        return 0;
    }

    public int check_after_el5ta(String date[], String end) {
        int operation = 0;
        int num = 0;
        if (date[0] != null) {
            num++;
            if (!m.ob.time_compare(date[0], end)) {
                operation++;
            }
        }
        //                 ---------------------------------------------------------
        if (date[1] != null) {
            num++;
            if (!m.ob.time_compare(date[1], end)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
        //                 ---------------------------------------------------------
        if (date[2] != null) {
            num++;
            if (!m.ob.time_compare(date[2], end)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
        //                 ---------------------------------------------------------
        if (date[3] != null) {
            num++;
            if (!m.ob.time_compare(date[3], end)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                };
            }
        }
        //                 ---------------------------------------------------------
        if (date[4] != null) {
            num++;
            if (!m.ob.time_compare(date[4], end)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
        //                 ---------------------------------------------------------
        if (date[5] != null) {
            num++;
            if (!m.ob.time_compare(date[5], end)) {
                operation++;
            } else {
                if (operation > 1) {
                    return 1;
                }
            }
        }
        if (operation == num) {
            return 2;
        } else if (operation > 0) {
            return 1;
        }

        return 0;
    }
    /////////////////////////////////////////////// archive ///////////////////////////////////////////////////
    int archive_value=0;
    String archive_table="";
//    void set_archive_value_siana()
//    {
//        if (m.flag_3otl_siana==0)
//        {
//            archive_value=archive.archive_siana ;
//        }
//        else if (m.flag_3otl_siana==1)
//        {
//            archive_value=archive.archive_el3otl ;
//        }
//        else if (m.flag_3otl_siana==2)
//        {
//            archive_value=archive.archive_el2st ;
//        }
//        
//    }
//     void set_archive_value_trkeb()
//    {
//        if (m.flag_trkeb_siana==false)
//        {
//            archive_value=archive.archive_trkeb ;
//        }
//        else  if (m.flag_trkeb_siana==true)
//        {
//            archive_value=archive.archive_siana_gdeda ;
//        }
//        
//    }
    public String add_archive(String serial) {
        try {
            String s_e_m[] = m.ob.get_start_end_of_month();
            String time_now = m.ob.time_now();
            m.ob.stmt = m.ob.conn.createStatement();
            ResultSet rs = m.ob.stmt.executeQuery("select * from "+archive_table+" where serial=" + serial + " and id_archive=" + archive_value + " and date between '" + s_e_m[0] + "' and '" + s_e_m[1] + "'");
            if (rs.next()) {
                if (JOptionPane.showConfirmDialog(null, "الجهاز المسجل برقم مسلسل " + serial + " مضاف للخطة ذلك الشهر من قبل هل تريد تعديل التاريخ ؟") == 0) {
                    m.ob.stmt.executeUpdate("update "+archive_table+" set date='" + time_now + "' where serial=" + serial + "");
                    return time_now;
                }
            } else {
                m.ob.stmt.executeUpdate("insert into "+archive_table+" values (default ," + serial + "," + archive_value + ",'" + time_now + "')");
                return time_now;
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }
    public boolean delete_from_archive(String serial)
    {
         String s_e_m[] = m.ob.get_start_end_of_month();
        try {
            m.ob.stmt.executeUpdate("delete from "+archive_table+" where serial=" + serial + " and id_archive="+archive_value+" and date between '" + s_e_m[0] + "' and '" + s_e_m[1] + "'") ;
        return true ;
        } catch (SQLException ex) {
            Logger.getLogger(action_panel_elsiiana.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false ;
    }
}

class elfne {

    public elfne(String name, String place) {
        this.name = name;
        this.place = place;
    }
    private String name;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}

class type_elsiana {

    private int id_type_elsiana;
    private String type;
    private int all_siana_before_el5ta;
    private int all_siana_in_el5ta;
    private int all_siana_after_el5ta;
    private int some_siana_before_el5ta;
    private int some_siana_in_el5ta;
    private int some_siana_after_el5ta;

    public type_elsiana(int id_type_elsiana, String type, int all_siana_before_el5ta, int all_siana_in_el5ta, int all_siana_after_el5ta, int some_siana_before_el5ta, int some_siana_in_el5ta, int some_siana_after_el5ta) {
        this.id_type_elsiana = id_type_elsiana;
        this.type = type;
        this.all_siana_before_el5ta = all_siana_before_el5ta;
        this.all_siana_in_el5ta = all_siana_in_el5ta;
        this.all_siana_after_el5ta = all_siana_after_el5ta;
        this.some_siana_before_el5ta = some_siana_before_el5ta;
        this.some_siana_in_el5ta = some_siana_in_el5ta;
        this.some_siana_after_el5ta = some_siana_after_el5ta;
    }

    public int getId_type_elsiana() {
        return id_type_elsiana;
    }

    public String getType() {
        return type;
    }

    public int getAll_siana_in_el5ta() {
        return all_siana_in_el5ta;
    }

    public int getAll_siana_before_el5ta() {
        return all_siana_before_el5ta;
    }

    public int getAll_siana_after_el5ta() {
        return all_siana_after_el5ta;
    }

    public int getSome_siana_in_el5ta() {
        return some_siana_in_el5ta;
    }

    public int getSome_siana_before_el5ta() {
        return some_siana_before_el5ta;
    }

    public int getSome_siana_after_el5ta() {
        return some_siana_after_el5ta;
    }

}
