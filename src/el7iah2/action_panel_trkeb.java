/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import static el7iah2.connection.stmt;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashraf_atef
 */
public class action_panel_trkeb {

    main m;

    public action_panel_trkeb(main m) {
        this.m = m;
        m.jScrollPane45.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        m.jComboBox3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        m.jLabel_print_trkeb.setToolTipText("طباعه");
        m.jLabel_search_trkeb.setToolTipText("بحث");
        m.jLabel_order_table_trkeb.setToolTipText("حفظ ترتيب الجدول");
        m.jLabel_delete_trkeb.setToolTipText("حذف العميل");
        m.jLabel12.setToolTipText("الفاتوره");
        m.jLabel29.setToolTipText("اتصال");
    }

    String table_name = "";
    String table_name_arch = "";
    String table_name_hints = "";

    void enter_eltrkebat() {
        try {

            m.ob.stmt = m.ob.conn.createStatement();
            ResultSet rs = m.ob.stmt.executeQuery("select * from " + table_name + " left join clients on " + table_name + ".id_client=clients.id_client"
                    + " left join product on " + table_name + ".id_product=product.id_product  "
                    + " left join countries on " + table_name + ".region= countries.region"
                    + " left join elmndob on " + table_name + ".id_elmndob= elmndob.id_elmndob"
                    + " left join elmndob_elwaset on " + table_name + ".id_elmndob_elwaset= elmndob_elwaset.id_elmndob_elwaset"
                    +" left outer join "+m.elsiana.archive_table+" ar on ar.serial=" + table_name + ".serial and ar.id_archive="+m.elsiana.archive_value+" and ar.id in "
                    + "( select max(id) from "+m.elsiana.archive_table+" arr  where arr.serial= " + table_name + ".serial and arr.id_archive="+m.elsiana.archive_value+") "
                    + " order by " + table_name + ".serial asc" );

            //  int index = 1;
            while (rs.next()) {

                String id_client = rs.getString("id_client");
                String id_product = rs.getString("id_product");
                String quantity = rs.getString("quantity");
                String date_regist = rs.getString("date_regist");
                String hints = rs.getString("hints");
                String nezam_eldf3 = rs.getString("nezam_eldf3");
                String id_elmndob = rs.getString("id_elmndob");
                String clas = rs.getString("class");
                String siana_1 = rs.getString("siana_1");
                String siana_2 = rs.getString("siana_2");
                String siana_3 = rs.getString("siana_3");
                String siana_5 = rs.getString("siana_5");
                String siana_6 = rs.getString("siana_6");
                String siana_7 = rs.getString("siana_7");
                String dead_line = rs.getString("dead_line");
                String id_elmndob_elwaset = rs.getString("id_elmndob_elwaset");
                String num_month = rs.getString("num_month_remake_class");
                String elmosthdaf = rs.getString("elmosthdaf");
                String serial = rs.getString("serial");

                String home_num = "";
                String street = "";
                String region = "";
                home_num = rs.getString("home_num");
                street = rs.getString("street");
                region = rs.getString("region");
                // System.out.println("1");

                String name_client = "";

                String country = "";
                String phone = "";
                String jop = "";

                name_client = rs.getString("name_client");
                jop = rs.getString("job");
                country = rs.getString("country");
                phone = rs.getString("phone");

                String name_product = "";

                name_product = rs.getString("name_product");
                String type = rs.getString("type");
                String name_elmndob = rs.getString("name_elmndob");
                String name_elmndob_elwaset = rs.getString("name_elmndob_elwaset");

                m.model_trkeb.addRow(new Object[]{jop, id_client, name_client, home_num, street, region, country, phone,
                    id_product, name_product, type, quantity, date_regist, hints, nezam_eldf3, id_elmndob, clas,
                    siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, dead_line, num_month, elmosthdaf, id_elmndob_elwaset, serial, name_elmndob, name_elmndob_elwaset,rs.getString("ar.date")});
                m.model_trkeb_help.addRow(new Object[]{jop, id_client, name_client, home_num, street, region, country, phone,
                    id_product, name_product, type, quantity, date_regist, hints, nezam_eldf3, id_elmndob, clas,
                    siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, dead_line, num_month, elmosthdaf, id_elmndob_elwaset, serial, name_elmndob, name_elmndob_elwaset,rs.getString("ar.date")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(hr.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "عفوا حدث خطأ اثناء التسجيل");

        }
        m.jLabel_count.setText(String.valueOf(m.model_trkeb.getRowCount()));

    }

    void add_into_trkeb() {
        here:
        {
            int x = m.jTable_trkeb.getSelectedRow();
            //joptionpane.showMessageDialog(null, x);
            //  System.out.println(x);
            if (x != -1) {
                {
                    boolean flag_continue = true;
                    String job = String.valueOf(m.model_trkeb.getValueAt(x, 0));
                    String id_client = String.valueOf(m.model_trkeb.getValueAt(x, 1));
                    String name_client = String.valueOf(m.model_trkeb.getValueAt(x, 2));
                    String home_num = String.valueOf(m.model_trkeb.getValueAt(x, 3));
                    String street = String.valueOf(m.model_trkeb.getValueAt(x, 4));
                    String region = String.valueOf(m.model_trkeb.getValueAt(x, 5));
                    String country = String.valueOf(m.model_trkeb.getValueAt(x, 6));
                    String phone = String.valueOf(m.model_trkeb.getValueAt(x, 7));
                    String id_product = String.valueOf(m.model_trkeb.getValueAt(x, 8));
                    String name_product = String.valueOf(m.model_trkeb.getValueAt(x, 9));
                    String type = String.valueOf(m.model_trkeb.getValueAt(x, 10));
                    String quantity = String.valueOf(m.model_trkeb.getValueAt(x, 11));
                    String date_regist = String.valueOf(m.model_trkeb.getValueAt(x, 12));
                    String price = m.jTextField_price_trkeb.getText();

                    String hints = String.valueOf(m.model_trkeb.getValueAt(x, 13));
                    String nezam_eldf3 = String.valueOf(m.model_trkeb.getValueAt(x, 14));
                    String id_elmndob = String.valueOf(m.model_trkeb.getValueAt(x, 15));
                    String clas = String.valueOf(m.model_trkeb.getValueAt(x, 16));
                    String siana_1 = String.valueOf(m.model_trkeb.getValueAt(x, 17));
                    String siana_2 = String.valueOf(m.model_trkeb.getValueAt(x, 18));
                    String siana_3 = String.valueOf(m.model_trkeb.getValueAt(x, 19));
                    String siana_5 = String.valueOf(m.model_trkeb.getValueAt(x, 20));
                    String siana_6 = String.valueOf(m.model_trkeb.getValueAt(x, 21));
                    String siana_7 = String.valueOf(m.model_trkeb.getValueAt(x, 22));
                    String dead_line = String.valueOf(m.model_trkeb.getValueAt(x, 23));
                    String num_month_remake_class = String.valueOf(m.model_trkeb.getValueAt(x, 24));
                    String elmosthdaf = String.valueOf(m.model_trkeb.getValueAt(x, 25));
                    String id_elmndob_elwaset = String.valueOf(m.model_trkeb.getValueAt(x, 26));
                    String serial = String.valueOf(m.model_trkeb.getValueAt(x, 27));
                    String result = "";
                    String old_quantity = "";
                    String old_elb2e = "";
                    String total_elb2e = "";
                    String rsed1_ = "";
                    String rsed2_ = "";
                    String rsed3_ = "";
                    String rsed_5 = "";
                    String rsed_6 = "";
                    String rsed_7 = "";
                    String date_el2st_old = "";

//                String id_operation = jTextField_id_operation.getText();
//                String price_operation = jTextField_price_operation.getText();
                    String date = ((JTextField) m.jTextField_date_trkeb.getDateEditor().getUiComponent()).getText();
                    String id_elfne = m.jTextField_id_elfne_trkeb.getText();
                    String name_elfne = m.jTextField_name_elfne_trkeb.getText();
                    String phone_elfne = m.jTextField_phone_elfne_trkeb.getText();
                    String places = m.jTextField_place_trkeb.getText();

                    String re = "";

                    String time_now = date;
                    String date_1 = "";
                    String date_2 = "";
                    String date_3 = "";
                    String date_5 = "";
                    String date_6 = "";
                    String date_7 = "";

                    if (m.flag_insert_elfne_trkeb == true) {

                        if (m.ob.check_int(id_elfne) == false) {
                            m.jTextField_id_elfne_trkeb.setBackground(Color.PINK);
                            flag_continue = false;
                        } else {
                            if (m.ob.check_insert_elfne(id_elfne) == false) {
                                m.jTextField_id_elfne_trkeb.setBackground(Color.pink);
                                flag_continue = false;
                            }
                        }

                        if (m.ob.check_int(phone_elfne) == false) {
                            m.jTextField_phone_elfne_trkeb.setBackground(Color.PINK);
                            flag_continue = false;
                        }

                    }

                    if (m.ob.check_time(date) == false) {
                        m.jTextField_date_trkeb.setBackground(Color.pink);
                        flag_continue = false;
                    }

                    if (!date_regist.equals(date)) {
                        if (m.ob.time_compare(date_regist, date) == false) {
                            JOptionPane.showMessageDialog(null, "يجب ان يكون تاريخ التركيب بعد تاريخ التسجيل ");
                            flag_continue = false;
                        }
                    }

                    String elba2e = m.jTextField_elba2e_trkeb.getText();

                    if (m.ob.check_int(elba2e) == false
                            || Double.parseDouble(elba2e) < 0) {
                        flag_continue = false;
                        m.jTextField_elba2e_trkeb.setBackground(Color.pink);
                    } else {
                        if (nezam_eldf3.equals("0") && Double.parseDouble(elba2e) > 0) {
                            flag_continue = false;
                            JOptionPane.showMessageDialog(null, "عفوا نظام الدفع 0 يجب تغيره الي رقم اكبر من الصفر ");
                            m.jTextField_elba2e_trkeb.setBackground(Color.pink);
                        }
                    }

                    if (m.ob.check_int(price) == false || Double.parseDouble(price) < 0) {
                        m.jTextField_price_trkeb.setBackground(Color.pink);
                        flag_continue = false;
                    }
                    try {

                        m.ob.stmt = m.ob.conn.createStatement();
                        ResultSet rs = m.ob.stmt.executeQuery("select id_client ,quantity , elb2e , total_elb2e_sian , rsed1,rsed2,rsed3,rsed5,rsed6,rsed7, date_el2st"
                                + " from clients_product where id_client=" + id_client + " and id_product=" + id_product + " and date_buy= '"
                                + date + "'");

                        //
//            //system.out.println("select id_client ,quantity"
//                    + " from clients_product where id_client=" + id_client + " and id_product=" + id_product + " and date_buy= '"
//                    + date_buy + "'");
                        if (rs.next()) {
                            result = String.valueOf(rs.getString("id_client"));
                            old_quantity = String.valueOf(rs.getString("quantity"));
                            old_elb2e = String.valueOf(rs.getString("elb2e"));
                            total_elb2e = rs.getString(4);
                            rsed1_ = rs.getString(5);
                            rsed2_ = rs.getString(6);
                            rsed3_ = rs.getString(7);
                            rsed_5 = rs.getString(8);
                            rsed_6 = rs.getString(9);
                            rsed_7 = rs.getString(10);
                            date_el2st_old = rs.getString(11);
                            int ch = JOptionPane.showConfirmDialog(null, "يوجد عميل بهذه البيانات بجدول خدمه العملاء :-" + "\n"
                                    + "اذا كنت ترغب  بدمج الجهازين و تجمع الكميه و المبالغ المتبقيه و الأرصد قم بالضفط نعم و قم بالتأكد من تواريخ الأقساط و الصيانات للجهاز من جدول خدمه العملاء " + "\n"
                                    + "اذا كنت ترغب بجعل كل جهاز منفصل قم بالضغط لا و قم بتعديل تاريخ التركيب بتاريخ سابق او لاحق" + "\n"
                                    + "اذا كنت ترغب بألغاء عمليه التسجيل قم بالضغط ألغاء");
                            if (ch == 0) {
                            } else if (ch == 1) {
                                flag_continue = false;
                            } else {
                                flag_continue = false;
                            }

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (m.flag_trkeb_siana == true) {

                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d1.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d1.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }
                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d2.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d2.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }
                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d3.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d3.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }
                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d5.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d5.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }
                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d6.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d6.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }
                        if (m.ob.check_time(((JTextField) m.jTextField_ns_d7.getDateEditor().getUiComponent()).getText()) == false) {
                            ((JTextField) m.jTextField_ns_d7.getDateEditor().getUiComponent()).setBackground(Color.pink);
                            flag_continue = false;
//                            m.jDialog2.setVisible(true);
                        }

                    }

                    if (flag_continue == true) {
                        String archive_statment = "";
                        if (m.flag_trkeb_siana == false) {
                            if (type.equals("1")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));

                                date_2 = "0001-01-01";
                                date_3 = "0001-01-01";
                                date_5 = "0001-01-01";
                                date_6 = "0001-01-01";
                                date_7 = "0001-01-01";

                            } else if (type.equals("2")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));
                                date_2 = m.ob.time_month(time_now, Integer.parseInt(siana_2));

                                date_3 = "0001-01-01";
                                date_5 = "0001-01-01";
                                date_6 = "0001-01-01";
                                date_7 = "0001-01-01";

                            } else if (type.equals("3") || type.equals("4")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));
                                date_2 = m.ob.time_month(time_now, Integer.parseInt(siana_2));
                                date_3 = m.ob.time_month(time_now, Integer.parseInt(siana_3));

                                date_5 = "0001-01-01";
                                date_6 = "0001-01-01";
                                date_7 = "0001-01-01";

                            } else if (type.equals("5")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));
                                date_2 = m.ob.time_month(time_now, Integer.parseInt(siana_2));
                                date_3 = m.ob.time_month(time_now, Integer.parseInt(siana_3));
                                date_5 = m.ob.time_month(time_now, Integer.parseInt(siana_5));

                                date_6 = "0001-01-01";
                                date_7 = "0001-01-01";

                            } else if (type.equals("6")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));
                                date_2 = m.ob.time_month(time_now, Integer.parseInt(siana_2));
                                date_3 = m.ob.time_month(time_now, Integer.parseInt(siana_3));
                                date_5 = m.ob.time_month(time_now, Integer.parseInt(siana_5));
                                date_6 = m.ob.time_month(time_now, Integer.parseInt(siana_6));
                                date_7 = "0001-01-01";

                            } else if (type.equals("7")) {

                                date_1 = m.ob.time_month(time_now, Integer.parseInt(siana_1));
                                date_2 = m.ob.time_month(time_now, Integer.parseInt(siana_2));
                                date_3 = m.ob.time_month(time_now, Integer.parseInt(siana_3));
                                date_5 = m.ob.time_month(time_now, Integer.parseInt(siana_5));
                                date_6 = m.ob.time_month(time_now, Integer.parseInt(siana_6));
                                date_7 = m.ob.time_month(time_now, Integer.parseInt(siana_7));

                            }
                            archive_statment = ")";
                        } else {
                            date_1 = m.ob.time_month(((JTextField) m.jTextField_ns_d1.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_1));
                            date_2 = m.ob.time_month(((JTextField) m.jTextField_ns_d2.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_2));
                            date_3 = m.ob.time_month(((JTextField) m.jTextField_ns_d3.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_3));
                            date_5 = m.ob.time_month(((JTextField) m.jTextField_ns_d5.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_5));
                            date_6 = m.ob.time_month(((JTextField) m.jTextField_ns_d6.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_6));
                            date_7 = m.ob.time_month(((JTextField) m.jTextField_ns_d7.getDateEditor().getUiComponent()).getText(), Integer.parseInt(siana_7));
                            archive_statment = ",'" + m.jTextArea_new_servising_done.getText() + "')";
                        }

                        if (m.flag_insert_elfne_trkeb == true) {
                            re += m.ob.insert_into_elfne(id_elfne, name_elfne, phone_elfne, places);
                        }
                        if (re.length() != 0) {
                            break here;
                        }

                        String nextid = "";
                        try {

                            m.ob.stmt = m.ob.conn.createStatement();
                            ResultSet rs = stmt.executeQuery("SHOW TABLE STATUS WHERE `Name` = 'clients_product'");

                            if (rs.next()) {
                                nextid = rs.getString("Auto_increment");
                            }
                        } catch (Exception e) {
                        }

                        String wrongs = null;

                        try {
                            String date_el2st = "";
                            if (!elba2e.equals("0")) {
                                date_el2st = m.ob.time_month(date, Integer.parseInt(nezam_eldf3));
                            } else {
                                date_el2st = "0001-01-01";
                            }
                            re += m.ob.insert_into_clients_product(id_client, id_product, quantity, date, date_1, date_2, date_3,
                                    date_5, date_6, date_7, "0", "0", "0", "0", "0", "0",/*mark client in archive*/ hints.replaceAll("#~.*~" , ""), nezam_eldf3, date_el2st,
                                    elba2e, id_elmndob, id_elfne, wrongs, clas, "0", siana_1, siana_2, siana_3, siana_5,
                                    siana_6, siana_7, m.ob.time_month(date, Integer.parseInt(num_month_remake_class)),
                                    num_month_remake_class, elmosthdaf, id_elmndob_elwaset, home_num, street, region,
                                    result,
                                    old_quantity,
                                    old_elb2e,
                                    total_elb2e,
                                    rsed1_,
                                    rsed2_,
                                    rsed3_,
                                    rsed_5,
                                    rsed_6,
                                    rsed_7,
                                    date_el2st_old);

                            //ResultSet rs = ob.search_total_elba2e(id_client);
                            String mark = "";

                            if (m.ob.time_compare(date, dead_line) || date.equals(dead_line)) {
                                mark = "2";
                            } else {
                                mark = "1";
                            }

                            m.ob.stmt.executeUpdate("insert into " + table_name_arch + " values (default," + nextid + ",'" + date_regist + "','" + dead_line + "','" + date + "'," + id_elfne + "," + id_elmndob + ","
                                    + id_elmndob_elwaset + "," + mark + "," + price + archive_statment);

                            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            try {
                                String statment = "insert into hints values ";
                                m.ob.stmt = m.ob.conn.createStatement();
                                ResultSet rs_hints = m.ob.stmt.executeQuery("select hints , date  from " + table_name_hints + "  where serial=" + serial);

                                while (rs_hints.next()) {
                                    //  JOptionPane.showMessageDialog(null, rs_hints.getString(1));
                                    statment += "(default , " + nextid + ",'" + rs_hints.getString(1) + "','" + rs_hints.getString(2) + "') ";
                                    if (rs_hints.isLast()) {
                                        statment += ";";
                                        m.ob.stmt = m.ob.conn.createStatement();
                                        m.ob.stmt.executeUpdate(statment);
                                    } else {
                                        statment += ",";
                                    }
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "لم يتم نقل ملاحظات التركيب للعميل لجدول ملاحظات خدمه العملاء");
                            }

                          
                            /////////////////////////////////////////////////////////////////////////////////////////////////////
                            m.ob.stmt.executeUpdate("delete from " + table_name_hints + "  where serial=" + serial);

                            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            if (re.length() == 0) {
                                m.ob.stmt.executeUpdate("delete from " + table_name + " where serial=" + serial);
//                                for (int i = 0; i < m.model_trkeb_help.getRowCount(); i++) {
//                                    if (serial.equals(String.valueOf(m.model_trkeb_help.getValueAt(i, 27)))) {
//                                        m.model_trkeb_help.removeRow(i);
//                                        break;
//                                    }
//                                }
                                m.model_trkeb_help.removeRow(new help().serach_in_model(m.model_trkeb_help, 27, serial));
                                m.model_trkeb.removeRow(x);

//                            jTextField_id_elfne_trkeb.setVisible(false);
//                            jTextField_name_elfne_trkeb.setVisible(false);
//                            jTextField_phone_elfne_trkeb.setVisible(false);
//                            jTextField_place_trkeb.setVisible(false);
//                            jPanel_table_elfne_trkeb.setVisible(false);
//                            jTextField_date_trkeb.setVisible(false);
                                // jTextField_price_operation.setVisible(false);
                                m.jTextField_id_elfne_trkeb.setBackground(Color.white);

                                m.jTextField_phone_elfne_trkeb.setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d7.getDateEditor().getUiComponent()).setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d6.getDateEditor().getUiComponent()).setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d5.getDateEditor().getUiComponent()).setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d3.getDateEditor().getUiComponent()).setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d2.getDateEditor().getUiComponent()).setBackground(Color.white);
                                ((JTextField) m.jTextField_ns_d1.getDateEditor().getUiComponent()).setBackground(Color.white);

                                m.jTextField_date_trkeb.setBackground(Color.white);
                                // jTextField_price_operation.setBackground(Color.white);
                                m.jTextField_price_trkeb.setBackground(Color.white);
                            }

//                        jLabel_eltrkeb.setText("");
//                        jLabel_eltrkeb.setText(re);
//                            m.jDialog2.setVisible(false);
                            m.jLabel_count.setText(String.valueOf(m.model_trkeb_help.getRowCount()));
                            if (m.flag_trkeb_siana == false) {
                                m.jLabel_installation_notify.setText(m.jLabel_count.getText());
                            } else {
                                m.jLabel_new_servising_notify.setText(m.jLabel_count.getText());
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }
        }
    }

    void delete_to_canceled() {
        int x = m.jTable_trkeb.getSelectedRow();
        //joptionpane.showMessageDialog(null, x);

        if (x != -1) {
//                String table_name="";
//                if (m.flag_trkeb_siana==false)table_name="trkeb";
//                else table_name="siana_gdeda";
            String serial = String.valueOf(m.model_trkeb.getValueAt(x, 27));
            String id_client = String.valueOf(m.model_trkeb.getValueAt(x, 1));
            int g = JOptionPane.showConfirmDialog(null, "هل تريد حذف العميل ؟");
            if (g == 0) {
                try {
                    m.ob.stmt.executeUpdate("delete from " + table_name + " where serial=" + serial);

                    ResultSet rs = m.ob.search_client_product_id_client(id_client);
                    if (!rs.next()) {
                        m.ob.stmt.executeUpdate("delete from clients where id_client=" + id_client);
                    }

                    m.ob.stmt.executeUpdate("delete from  " + table_name_hints + " where serial=" + id_client);

                    String jop = String.valueOf(m.model_trkeb.getValueAt(x, 0));
                    String name_client = String.valueOf(m.model_trkeb.getValueAt(x, 2));
                    String phone = String.valueOf(m.model_trkeb.getValueAt(x, 7));
                    String reson = "";
//                if ( m.model_trkeb.getValueAt(x, 28)!=null&&!m.model_trkeb.getValueAt(x, 28).equals("") )   
//                {
//                     reson=String.valueOf(m.model_trkeb.getValueAt(x, 28));
//                }
//                  if ( m.model_trkeb.getValueAt(x, 29)!=null&&!m.model_trkeb.getValueAt(x, 29).equals("") )   
//                {
//                     reson+="-"+String.valueOf(m.model_trkeb.getValueAt(x, 29));
//                }
                    reson += JOptionPane.showInputDialog(null, "من فضلك قم بأدخال السبب لو امكن :-");
                    if (table_name.equals("trkeb")) {
                        m.ob.stmt.executeUpdate("insert into canceled_table values ( default ,'" + name_client + "','" + jop + "','" + phone + "','"
                                + reson + "','" + m.ob.time_now() + "'," + m.model_trkeb.getValueAt(x, 15) + "," + m.model_trkeb.getValueAt(x, 26) + ",'" + "تركيب"
                                + "')");
                    } else {
                        m.ob.stmt.executeUpdate("insert into canceled_table values ( default ,'" + name_client + "','" + jop + "','" + phone + "','"
                                + reson + "','" + m.ob.time_now() + "'," + m.model_trkeb.getValueAt(x, 15) + "," + m.model_trkeb.getValueAt(x, 26) + ",'" + "صيانة جديدة"
                                + "')");
                    }

                    m.model_trkeb.removeRow(x);
                    m.jLabel_installation_notify.setText(m.jLabel_count.getText());
                    for (int i = 0; i < m.model_trkeb_help.getRowCount(); i++) {
                        if (serial.equals(String.valueOf(m.model_trkeb_help.getValueAt(i, 27)))) {
                            m.model_trkeb_help.removeRow(i);
                            break;
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        m.jLabel_count.setText(String.valueOf(m.model_trkeb.getRowCount()));
        m.jLabel_installation_notify.setText(String.valueOf(m.model_trkeb.getRowCount()));
    }
    DefaultTableModel model = null;

    void search_trkeb() {
        int size = 0;
        if (m.jCheckBox_current_table_trkeb.isSelected()) {
            model = m.model_trkeb;

            size = m.model_trkeb.getRowCount();
        } else {
            model = m.model_trkeb_help;
            m.model_trkeb.setRowCount(0);
            size = m.model_trkeb_help.getRowCount();
        }
        String key = m.jTextField_search_siana1.getText();
        //    int index = 0;
        //  m.model_trkeb.setRowCount(0);
        if (m.jComboBox3.getSelectedIndex() == 2) {
            String key_2 = ((JTextField) m.jTextField_search_siana2.getDateEditor().getUiComponent()).getText();
            String key_3 = ((JTextField) m.jTextField_search_siana3.getDateEditor().getUiComponent()).getText();
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String date_regist = String.valueOf(model.getValueAt(i, 12));

                try {
                    if (m.ob.time_between(key_2, date_regist, key_3)) {
                        add_searh_trkeb(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (m.jComboBox3.getSelectedIndex() == 1) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));
                String country = String.valueOf(model.getValueAt(i, 6));

                if (country.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 0) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String name_client = String.valueOf(model.getValueAt(i, 2));

                if (name_client.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 3) {
            String key_2 = ((JTextField) m.jTextField_search_siana2.getDateEditor().getUiComponent()).getText();
            String key_3 = ((JTextField) m.jTextField_search_siana3.getDateEditor().getUiComponent()).getText();
            for (int i = 0; i < size; i++) {
                try {
                    // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                    String country = String.valueOf(model.getValueAt(i, 6));
                    String date_regist = String.valueOf(model.getValueAt(i, 12));
                    if (country.contains(key) && m.ob.time_between(key_2, date_regist, key_3)) {
                        add_searh_trkeb(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (m.jComboBox3.getSelectedIndex() == 4) {
            String key_2 = ((JTextField) m.jTextField_search_siana2.getDateEditor().getUiComponent()).getText();
            String key_3 = ((JTextField) m.jTextField_search_siana3.getDateEditor().getUiComponent()).getText();
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String date_regist = String.valueOf(model.getValueAt(i, 23));

                try {
                    if (m.ob.time_between(key_2, date_regist, key_3)) {
                        add_searh_trkeb(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (m.jComboBox3.getSelectedIndex() == 5) {
            String key_3 = ((JTextField) m.jTextField_search_siana3.getDateEditor().getUiComponent()).getText();
            String key_2 = ((JTextField) m.jTextField_search_siana2.getDateEditor().getUiComponent()).getText();
            for (int i = 0; i < size; i++) {
                try {
                    // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                    String country = String.valueOf(model.getValueAt(i, 6));
                    String date_regist = String.valueOf(model.getValueAt(i, 23));
                    if (country.contains(key) && m.ob.time_between(key_2, date_regist, key_3)) {
                        add_searh_trkeb(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (m.jComboBox3.getSelectedIndex() == 6) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String name_product = String.valueOf(model.getValueAt(i, 9));

                if (name_product.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 7) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String hint = String.valueOf(model.getValueAt(i, 13));

                if (hint.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 8) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String hint = String.valueOf(model.getValueAt(i, 13));

                if (!hint.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 9) {
            String key_2 = ((JTextField) m.jTextField_search_siana2.getDateEditor().getUiComponent()).getText();
            String key_3 = ((JTextField) m.jTextField_search_siana3.getDateEditor().getUiComponent()).getText();
            String serial = "";
            for (int i = 0; i < size - 1; i++) {

                serial += String.valueOf(model.getValueAt(i, 27)) + ",";
            }
            serial += String.valueOf(model.getValueAt(size - 1, 27));
            try {
                m.ob.stmt = m.ob.conn.createStatement();
                ResultSet rs = null;
                if (key.equals("خالي")) {
                    rs = m.ob.stmt.executeQuery("select  distinct(serial)  from " + table_name + " h where serial in (" + serial
                            + ") and (select count(*) from " + table_name_hints + " where h.serial=serial and date between '" + key_2 + "' and '" + key_3 + "') = 0"
                    );

                } else {
                    rs = m.ob.stmt.executeQuery("select  distinct(serial)  from " + table_name_hints + " where serial in (" + serial
                            + ") and hints like '%" + key + "%'"
                            + " and date between '" + key_2 + "' and '" + key_3 + "'");
                }
                while (rs.next()) {
                    add_searh_trkeb(new help().serach_in_model(model, 27, rs.getString(1)));
                }
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (m.jComboBox3.getSelectedIndex() == 10) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String street = String.valueOf(model.getValueAt(i, 4));

                if (street.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 11) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String street = String.valueOf(model.getValueAt(i, 28));

                if (street.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 12) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String street = String.valueOf(model.getValueAt(i, 29));

                if (street.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        } else if (m.jComboBox3.getSelectedIndex() == 13) {
            for (int i = 0; i < size; i++) {
                // String num=String.valueOf(model_trkeb_help.getValueAt(i, 0));

                String column_content = String.valueOf(model.getValueAt(i, m.jTable_trkeb.convertColumnIndexToModel(m.jTable_trkeb.getSelectedColumn())));

                if (column_content.contains(key)) {
                    add_searh_trkeb(i);
                }

            }
        }
        if (m.jCheckBox_current_table_trkeb.isSelected()) {

            for (int i = 0; i < size; i++) {

                model.removeRow(0);
            }
        }
        model = null;
        m.jLabel_count.setText(String.valueOf(m.model_trkeb.getRowCount()));
    }

    void update_client() {
        int i = m.jTable_trkeb.getSelectedRow();
        if (i != -1) {
            int ch = JOptionPane.showConfirmDialog(null, "are you sure to save ?");
            if (ch == 0) {
                try {

                    m.ob.stmt.executeUpdate("update clients set name_client='" + m.model_trkeb.getValueAt(i, 2) + "' , phone='" + m.model_trkeb.getValueAt(i, 7)
                            + "' , job='" + m.model_trkeb.getValueAt(i, 0) + "' where id_client=" + m.model_trkeb.getValueAt(i, 1));

                    m.ob.stmt.executeUpdate("update " + table_name + " set quantity=" + m.model_trkeb.getValueAt(i, 11) + " , hints='" + m.model_trkeb.getValueAt(i, 13) + "',"
                            + "  nezam_eldf3=" + m.model_trkeb.getValueAt(i, 14) + " , class='" + m.model_trkeb.getValueAt(i, 16) + "'"
                            + " , siana_1=" + m.model_trkeb.getValueAt(i, 17) + " , siana_2=" + m.model_trkeb.getValueAt(i, 18) + " , siana_3=" + m.model_trkeb.getValueAt(i, 19) + " ,"
                            + " siana_5=" + m.model_trkeb.getValueAt(i, 20) + " , siana_6=" + m.model_trkeb.getValueAt(i, 21) + " , siana_7=" + m.model_trkeb.getValueAt(i, 22) + " ,"
                            + " num_month_remake_class=" + m.model_trkeb.getValueAt(i, 24) + " , elmosthdaf=" + m.model_trkeb.getValueAt(i, 25)
                            + ", home_num=" + m.model_trkeb.getValueAt(i, 3) + " , dead_line='" + m.model_trkeb.getValueAt(i, 23) + "' , date_regist='" + m.model_trkeb.getValueAt(i, 12) + "' , "
                            + "street='" + m.model_trkeb.getValueAt(i, 4) + "'  where serial=" + m.model_trkeb.getValueAt(i, 27)
                    );
                    int rt = get_client_from_back_table((String) m.model_trkeb.getValueAt(i, 27));
                    if (rt != -1) {
                        for (int c = 0; c < m.model_trkeb.getColumnCount(); c++) {
                            m.model_trkeb_help.setValueAt(m.model_trkeb.getValueAt(i, c), rt, c);
                        }
                    }

                    JOptionPane.showMessageDialog(null, "تم الحفظ");
                    //      m.ob.stmt.executeUpdate("commit");
                } catch (SQLException ex) {

                    //  m.ob.stmt.executeUpdate("rollback to up");
                    JOptionPane.showMessageDialog(null, "Wrong \n" + ex.getMessage());

                }
            }
        }
    }

    int get_client_from_back_table(String serial) {
        for (int i = 0; i < m.model_trkeb_help.getRowCount(); i++) {
            if (serial.equals(m.model_trkeb_help.getValueAt(i, 27))) {
                return i;
            }
        }
        return -1;
    }

    void add_searh_trkeb(int r) {

        Object[] row = new Object[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            row[i] = (String) model.getValueAt(r, i);
        }
        m.model_trkeb.addRow(row);

    }

//    String get_pattern_trkeb() {
//        String pattern = "";
//        if (m.flag_trkeb_siana == false) {
//            pattern = "T"; 
//        } else {
//            pattern = "S";
//        }
//        
//        return pattern;
//    }
}
//change color of jlayeredpane http://stackoverflow.com/questions/4480196/how-to-set-a-background-color-on-a-jlayeredpane
