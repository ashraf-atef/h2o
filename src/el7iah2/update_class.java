/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import com.sun.mail.imap.Rights;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author ashraf_atef
 */
public class update_class {

    hr h;
    public List<JTextField> fields = new ArrayList<>();
    public List<JComboBox> combs = new ArrayList<>();
    public List<Integer> primary = new ArrayList<>();
    String db;
    String table_name;
    DefaultTableModel model;
    int row;
    int col;
    String condition = "";

    public update_class(hr h, String db) {
        this.h = h;

        this.db = db;

    }

    void set_row_col(int row, int col) {
        this.row = row;
        this.col = col;
        // System.out.println(this.row+" "+this.col);
    }
    String old_value = "";

    void set_old_value() {
        old_value = (String) model.getValueAt(row, col);
    }

    JFrame last_frame;
    JFrame frame = null;

    void Start(String table_name, DefaultTableModel model) {

        try {
            last_frame.setVisible(false);
        } catch (Exception e) {
        }

        frame = new JFrame();
        last_frame = frame;

        JPanel main_panel = new JPanel();
        main_panel.setBackground(Color.white);
        main_panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        this.model = model;
        this.table_name = table_name;
        model.setColumnCount(0);
        combs.clear();
        fields.clear();
        primary.clear();
        //  System.out.println("primary size : "+primary.size());
        main_panel.setLayout(new GridLayout(0, 1, 0, 10));

        try {

            h.m.ob.stmt = h.m.ob.conn.createStatement();
            ResultSet rs = h.m.ob.stmt.executeQuery("describe " + table_name);

            String name = "";
            String pri = "";
            int index = 0;
            String items[] = {"يساوي", "لا يساوي",
                "يحتوي",
                "يبدأ",
                "ينتهي",
                "بين"};
            String current = "";
            while (rs.next()) {
                name = rs.getString(1);
                current = hm_countries.get(name);
                JTextField f = new JTextField("");
                f.setPreferredSize(new Dimension(180, 30));
                f.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                JLabel l = new JLabel(current);
                l.setPreferredSize(new Dimension(120, 30));
                l.setForeground(new Color(70, 70, 70));
                l.setFont(h.m.font.deriveFont(13f));
                l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                JComboBox comb = new JComboBox(items);
                comb.setPreferredSize(new Dimension(100, 30));
                comb.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                comb.setFont(h.m.font.deriveFont(12f));

                JPanel p = new JPanel();
                p.setBackground(Color.white);
                p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                p.setPreferredSize(new Dimension(450, 35));
                p.setLayout(new FlowLayout(10, 10, 10));

                p.add(l);
                p.add(f);
                p.add(comb);
                fields.add(f);
                combs.add(comb);
                main_panel.add(p);

                //////////////////////////////////
                pri = rs.getString(4);
                model.addColumn(current);

                if (pri.equals("PRI")) {
                    primary.add(index);

                }
                index++;
            }

            JLabel label_search = new JLabel("Search");
            label_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Search-icon.png")));
            label_search.setPreferredSize(new Dimension(50, 50));
            JLabel label_insert = new JLabel("Insert");
            label_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png")));
            label_insert.setPreferredSize(new Dimension(50, 50));
            JPanel px = new JPanel();
            px.setPreferredSize(new Dimension(450, 50));
            px.setBackground(Color.white);
            px.add(label_search);
            px.add(label_insert);
            main_panel.add(px);
            label_search.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    search();
                }
            });
            label_insert.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    insert();
                }
            });
            JScrollPane sc = new JScrollPane(main_panel);

            sc.getVerticalScrollBar().setUnitIncrement(16);
            frame.setSize(490, h.m.height - 50);
            frame.add(sc);
            frame.setLocation(0, 0);
            frame.setVisible(true);
            frame.setResizable(false);

            select_all();

        } catch (SQLException ex) {
            Logger.getLogger(update_class.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void search() {
        String search_sql = "select * from " + table_name + " where ";
        boolean flag_search = false;
        int i = 0;

        for (; i < fields.size(); i++) {
            String txt_field = fields.get(i).getText();
            if (txt_field.length() != 0) {
                flag_search = true;

                search_sql += " " + search_hm(model.getColumnName(i)) + " ";
                if (combs.get(i).getSelectedIndex() == 0) {
                    search_sql += "='";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 1) {
                    search_sql += "<>'";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 2) {
                    search_sql += " like '%";
                    search_sql += txt_field + "%' ";
                } else if (combs.get(i).getSelectedIndex() == 3) {
                    search_sql += " like '";
                    search_sql += txt_field + "%' ";
                } else if (combs.get(i).getSelectedIndex() == 4) {
                    search_sql += " like '%";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 5) {

                    String start = "";
                    String end = "";
                    int g = 0;
                    for (; g < txt_field.length(); g++) {

                        if (txt_field.charAt(g) == ',') {
                            g++;
                            break;
                        }
                        start += txt_field.charAt(g);
                    }
                    for (; g < txt_field.length(); g++) {

                        end += txt_field.charAt(g);
                    }
                    search_sql += " between '" + start + "' and '" + end + "' ";

                }
                i++;
                break;
            }

        }
        //////////////////////////////////////////////////////////////////////////////
        for (; i < fields.size(); i++) {
            String txt_field = fields.get(i).getText();
            if (txt_field.length() != 0) {
                flag_search = true;
                search_sql += " and ";

                search_sql += " " + search_hm(model.getColumnName(i)) + " ";
                if (combs.get(i).getSelectedIndex() == 0) {
                    search_sql += "='";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 1) {
                    search_sql += "<>'";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 2) {
                    search_sql += " like '%";
                    search_sql += txt_field + "%' ";
                } else if (combs.get(i).getSelectedIndex() == 3) {
                    search_sql += " like '";
                    search_sql += txt_field + "%' ";
                } else if (combs.get(i).getSelectedIndex() == 4) {
                    search_sql += " like '%";
                    search_sql += txt_field + "' ";
                } else if (combs.get(i).getSelectedIndex() == 5) {

                    String start = "";
                    String end = "";
                    int g = 0;
                    for (; g < txt_field.length(); g++) {

                        if (txt_field.charAt(g) == ',') {
                            g++;
                            break;
                        }
                        start += txt_field.charAt(g);
                    }
                    for (; g < txt_field.length(); g++) {

                        end += txt_field.charAt(g);
                    }
                    search_sql += " between '" + start + "' and '" + end + "' ";

                }

            }

        }

        if (flag_search == true) {
            System.out.println(search_sql);
            try {
                model.setRowCount(0);
                h.m.ob.stmt = h.m.ob.conn.createStatement();
                ResultSet rs = h.m.ob.stmt.executeQuery(search_sql);
                while (rs.next()) {
                    Object obb[] = new Object[model.getColumnCount()];

                    for (int y = 0; y < model.getColumnCount(); y++) {
                        obb[y] = (String) rs.getString(y + 1);
                    }

                    model.addRow(obb);
                }
                h.jLabel_update_count.setText(String.valueOf(h.jTable_update.getRowCount()));
            } catch (SQLException ex) {
                Logger.getLogger(update_class.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    void select_all() {

        model.setRowCount(0);
        try {
            h.m.ob.stmt = h.m.ob.conn.createStatement();
            ResultSet rs = h.m.ob.stmt.executeQuery("select * from " + table_name);
            while (rs.next()) {
                Object obb[] = new Object[model.getColumnCount()];

                for (int y = 0; y < model.getColumnCount(); y++) {
                    obb[y] = (String) rs.getString(y + 1);
                }
                model.addRow(obb);
            }
            h.jLabel_update_count.setText(String.valueOf(h.jTable_update.getRowCount()));
            if (model.getRowCount() > 0  ) {
                if (h.m.ob.check_int(String.valueOf(model.getValueAt(model.getRowCount() - 1, primary.get(0)))))
                fields.get(primary.get(0)).setText(String.valueOf(Integer.parseInt((String) model.getValueAt(model.getRowCount() - 1, primary.get(0))) + 1));
                else 
               fields.get(primary.get(0)).setText(String.valueOf(model.getValueAt(model.getRowCount() - 1, primary.get(0))));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(update_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  System.out.println(model.getRowCount());
    }

    void condition() {
        condition = "";

        if (primary.size() != 0) {
            condition = " where ";

            for (int i = 0; i < primary.size() - 1; i++) {
        //   System.out.println("primary value : "+model.getValueAt(row,primary.get(i)));

                condition += " " + search_hm(model.getColumnName(primary.get(i))) + "='" + model.getValueAt(row, primary.get(i)) + "' and ";

            }
            condition += " " + search_hm(model.getColumnName(primary.get(primary.size() - 1))) + "='" + model.getValueAt(row, primary.get(primary.size() - 1)) + "' ";

        }
    }

    void condition_all() {
        condition = "";
        if (primary.size() != 0) {
            condition = " where ";

            for (int i = 0; i < primary.size() - 1; i++) {

                condition += " " + search_hm(model.getColumnName(primary.get(i))) + " in (";
                for (int t = 0; t < model.getRowCount() - 1; t++) {
                    condition += "'" + (String) model.getValueAt(t, primary.get(i)) + "' ,";
                }
                condition += "'" + (String) model.getValueAt(model.getRowCount() - 1, primary.get(i)) + "' ) and ";

            }
            condition += " " + search_hm(model.getColumnName(primary.get(primary.size() - 1))) + " in (";
            for (int t = 0; t < model.getRowCount() - 1; t++) {
                condition += "'" + (String) model.getValueAt(t, primary.get(primary.size() - 1)) + "' ,";
            }
            condition += "'" + (String) model.getValueAt(model.getRowCount() - 1, primary.get(primary.size() - 1)) + "' )  ";

        }
    }

    void action_update() {

        // condition();
        String sql = "";
        if (model.getValueAt(row, col).equals("null")) {
            sql = "update " + table_name + " set " + search_hm(model.getColumnName(col)) + " =" + null + " "
                    + condition;
        } else {
            sql = "update " + table_name + " set " + search_hm(model.getColumnName(col)) + " ='" + model.getValueAt(row, col) + "' "
                    + condition;
        }

        System.out.println(sql);
        try {
            h.m.ob.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "updated successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage()
                    + " \n please try again");
            model.setValueAt(old_value, row, col);
        }
    }

    void update_all() {

        String new_value = JOptionPane.showInputDialog(null, "قم بادخال التحديث");
        if (new_value != null) {

            condition_all();

            String sql = "";
            if (new_value.equals("null")) {
                sql = "update " + table_name + " set " + search_hm(model.getColumnName(col)) + " =" + null + " "
                        + condition;
            } else {
                sql = "update " + table_name + " set " + search_hm(model.getColumnName(col)) + " ='" + new_value + "' "
                        + condition;
            }

            System.out.println(sql);
            try {
                h.m.ob.stmt.executeUpdate(sql);
                for (int g = 0; g < model.getRowCount(); g++) {
                    model.setValueAt(new_value, g, col);
                }
                JOptionPane.showMessageDialog(null, "تم الحفظ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage()
                        + " \n please try again");

            }
        } else {
            JOptionPane.showMessageDialog(null, "لم يتم التحديث");
        }
    }

    void action_delete() {
        // condition();
        String sql = "delete from " + table_name + condition;
        System.out.println(sql);
        try {
            h.m.ob.stmt.executeUpdate(sql);
            model.removeRow(row);
            JOptionPane.showMessageDialog(null, "deleted successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage()
                    + "\n please try again");
        }
        h.jLabel_update_count.setText(String.valueOf(h.jTable_update.getRowCount()));
    }

    void delete_all() {
        condition_all();
        String sql = "delete from " + table_name + condition;
        System.out.println(sql);
        try {
            h.m.ob.stmt.executeUpdate(sql);
            model.removeRow(row);
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "deleted successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage()
                    + "\n please try again");
        }
        h.jLabel_update_count.setText(String.valueOf(h.jTable_update.getRowCount()));
    }

    void insert() {
        String sql_stmt = "insert into " + table_name + " values ('";
        Object obb[] = new Object[model.getColumnCount()];
        for (int i = 0; i < fields.size() - 1; i++) {
            obb[i] = fields.get(i).getText();
            sql_stmt += fields.get(i).getText() + "','";
        }
        sql_stmt += fields.get(fields.size() - 1).getText() + "')";
        obb[fields.size() - 1] = fields.get(fields.size() - 1).getText();
        try {

            h.m.ob.stmt.executeUpdate(sql_stmt);
            model.addRow(obb);
            JOptionPane.showMessageDialog(null, "Inserted successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage()
                    + "\n please try again");
        }
        h.jLabel_update_count.setText(String.valueOf(h.jTable_update.getRowCount()));
    }
    HashMap<String, String> hm_countries = new HashMap<String, String>();

    void insert_hashmap() {

        hm_countries.put("canceled_table", "جدول الألغاء");
        hm_countries.put("client_class_history", "سجل تقييم العملاء");
        hm_countries.put("clients", "العملاء");
        hm_countries.put("clients_product", "خدمه العملاء");
        hm_countries.put("contacts", "الأتصالات");
        hm_countries.put("countries", "المحافظات");
        hm_countries.put("el2st", "سجل الأقساط");
        hm_countries.put("el3otl", "سجل الأعطال");
        hm_countries.put("elfne", "الفني");
        hm_countries.put("elkta3", "القطاعات");
        hm_countries.put("elkta3_dependant", "مراكز القطاعات");
        hm_countries.put("elmndob", "المندوب");
        hm_countries.put("elmndob_elwaset", "المندوب الوسيط");
        hm_countries.put("elmo7sl", "المحصل");
        hm_countries.put("elsiana", "سجل الصيانات");
        hm_countries.put("eltrkebat", "سجل التركيبات");
        hm_countries.put("hints", "الملاحظات");
        hm_countries.put("history_rsed", "سجل الأصده");
        hm_countries.put("history_siana_elb2e", "سجل باقي الصيانات");
        hm_countries.put("information_hr", "اعدادات البرنامج");
        hm_countries.put("num_operation", "سجل العمليات الشهريه");
        hm_countries.put("product", "المنتجات");
        hm_countries.put("siana_gdeda", "الصيانات الجديده");
        hm_countries.put("siana_gdeda_archive", "سجل الصيانات الجديده");
        hm_countries.put("trkeb", "التركيبات");
        hm_countries.put("users", "المتسخدمين");
        hm_countries.put("wrongs", "الأعطال");
        hm_countries.put("classes", "الفئات");
        hm_countries.put("print_history", "سجل الطباعة");
//////////////////////////////////////////////////////////////////////////////////////////////////////////+
        hm_countries.put("percent", "النسبه");
        hm_countries.put("id_client", "كود العميل");
        hm_countries.put("name_client", "اسم العميل");
        hm_countries.put("job", "الوظيفه");
        hm_countries.put("telephone", "التليفون");
        hm_countries.put("id_product", "كود المنتج");
        hm_countries.put("date_buy", "تاريخ الشراء");
        hm_countries.put("old_class", "الفئه القديمه");
        hm_countries.put("new_class", "الفئه الجديده");
        hm_countries.put("num_sianat", "عدد الصيانات");
        hm_countries.put("date", "التاريخ");
        hm_countries.put("phone", "رقم التليفون");
        hm_countries.put("quantity", "الكميه");
        hm_countries.put("date1", "تاريخ الشمعه1");
        hm_countries.put("date2", "تارخ الشمعه2");
        hm_countries.put("date3", "تاريخ الشمعه3");
        hm_countries.put("date5", "تاريخ الشمعه5");
        hm_countries.put("date6", "تاريخ الشمعه6");
        hm_countries.put("date7", "تاريخ الشمعه7");
        hm_countries.put("id_elfne", "كود الفني");
//hm_countries.put("hints","الملاحظات");
        hm_countries.put("id_elmndob", "كود المندوب");
        hm_countries.put("nezam_eldf3", "نظام الدفع");
        hm_countries.put("date_el2st", "تاريخ القسط");
        hm_countries.put("elb2e", "الباقي من الجهاز");
        hm_countries.put("rsed1", "رصيد الشمعه1");
        hm_countries.put("rsed2", "رصيد الشمعه2");
        hm_countries.put("rsed3", "رصيد الشمعه3");
        hm_countries.put("rsed5", "رصيد الشمعه5");
        hm_countries.put("rsed6", "رصيد الشمعه6");
        hm_countries.put("rsed7", "رصيد الشمعه7");
        hm_countries.put("class", "الفئه");
        hm_countries.put("total_elb2e_sian", "باقي الصيانات");
        hm_countries.put("siana_1", "مده الشمعه1");
        hm_countries.put("siana_2", "مده الشمعه2");
        hm_countries.put("siana_3", "مده الشمعه3");
        hm_countries.put("siana_5", "مده الشمعه5");
        hm_countries.put("siana_6", "مده الشمعه6");
        hm_countries.put("siana_7", "مده الشمعه7");
        hm_countries.put("date_remake_class", "تاريخ تعديل الفئه");
        hm_countries.put("num_month_remake_class", "عدد الشهور لتعديل الفئه");
        hm_countries.put("elmosthdaf", "المستهدف");
        hm_countries.put("id_elmndob_elwset", "كود المندوب الوسيط");
        hm_countries.put("home_num", "رقم المنزل");
        hm_countries.put("street", "الشارع");
        hm_countries.put("region", "المركز");
        hm_countries.put("user_name", "اسم المستخدم");
        hm_countries.put("name", "الأسم");
        hm_countries.put("country", "المحافظه");
        hm_countries.put("price", "السعر");
        hm_countries.put("resion", "السبب");
        hm_countries.put("eltok3", "التوقع");
        hm_countries.put("id_elmo7sl", "كود المحصل");
        hm_countries.put("type_el3otl", "نوع العطل");
        hm_countries.put("mark", "الدرجه");
        hm_countries.put("date_regist", "تاريخ التسجيل");
        hm_countries.put("date_dead_line", "تاريخ خط النهايه");
        hm_countries.put("name_elfne", "اسم الفني");
        hm_countries.put("places", "الأماكن");
        hm_countries.put("id_elkta3", "كود القطاع");
        hm_countries.put("name_elkta3", "اسم القطاع");
        hm_countries.put("date_construct", "تاريخ التأسيس");
        hm_countries.put("name_manager", "اسم المدير");
        hm_countries.put("name_elmndob", "اسم المندوب");
        hm_countries.put("id_elmndob_elwaset", "كود المندوب الوسيط");
        hm_countries.put("name_elmndob_elwaset", "اسم المندوب الوسيط");
        hm_countries.put("name_elmo7sl", "اسم المحصل");
        hm_countries.put("type_elsiana", "تاريخ الصيانه");
        hm_countries.put("ID", "الكود");
        hm_countries.put("q_rsed1", "عدد الشمعات1");
        hm_countries.put("q_rsed2", "عدد الشمعات2");
        hm_countries.put("q_rsed3", "عدد الشمعات3");
        hm_countries.put("q_rsed5", "عدد الشمعات5");
        hm_countries.put("q_rsed6", "عدد الشمعات6");
        hm_countries.put("q_rsed7", "عدد الشمعات7");
        hm_countries.put("class_A", "الفئه A");
        hm_countries.put("class_B", "الفئه B");
        hm_countries.put("class_C", "الفئه C");
        hm_countries.put("enable", "تشغيل خاصيه التقييم");
        hm_countries.put("black_list", "القائمه السوداء");
        hm_countries.put("date_backup", "تاريخ النسخه الأحطياطيه");
        hm_countries.put("gmail_account", "حساب خادم جوجل");
        hm_countries.put("password_gmail_account", "كلمه سر خادم جوجل");
        hm_countries.put("num_clients", "عدد عملاء الصيانه");
        hm_countries.put("num_clients_el2st", "عدد عملاء القسط");
        hm_countries.put("name_product", "اسم المنتج");
        hm_countries.put("type", "عدد شمعات المنتج");
        hm_countries.put("elmokdm", "مقدم الجهاز");
//hm_countries.put("el2st","قسط الجهاز");
        hm_countries.put("dead_line", "تاريخ خط النهاية");
        hm_countries.put("password", "كلمه السر");
        hm_countries.put("button_clients", "زر العملاء");
        hm_countries.put("button_installation", "زر التركيبات");
        hm_countries.put("button_servising", "زر الصيانات");
        hm_countries.put("button_add_damage", "زر اضافه الأعطال");
        hm_countries.put("button_c_damage", "زر الأعطال");
        hm_countries.put("button_co_rep", "زر تقارير الشركه");
        hm_countries.put("button_cl_rep", "زر تقارير العميل");
        hm_countries.put("button_tecniacl_delegate", "زر تقارير الموظفين");
        hm_countries.put("button_db", "زر قاعده البيانات");
        hm_countries.put("button_users", "زر المتسخدمين");
        hm_countries.put("button_sectors", "زر القطاعات");
        hm_countries.put("button_payments", "زر الأقساط");
        hm_countries.put("button_siana_gdeda", "زر الصيانات الجديده");
        hm_countries.put("table_canceled_table", "جدول الألغاء ");
        hm_countries.put("table_clients", "جدول العملاء");
        hm_countries.put("table_clients_product", "جدول خدمه العملاء");
        hm_countries.put("table_countries", "جدول المحافظات");
        hm_countries.put("table_el3otl", "جدول سجل الأعطال");
        hm_countries.put("table_elfne", "جدول الفني");
        hm_countries.put("table_elkta3", "جدول القطاعات");
        hm_countries.put("table_elkta3_dependant", "جدول مراكز القطاعات");
        hm_countries.put("table_elmndob", "جدول المندوب");
        hm_countries.put("table_elmndob_elwaset", "جدول المندوب الوسيط");
        hm_countries.put("table_elsiana", "جدول سجل الصيانات");
        hm_countries.put("table_eltrkebat", "جدول سجل التركيبات");
        hm_countries.put("table_hints", "جدول الملاحظات");
        hm_countries.put("table_history_rsed", "جدول سجل الأرصده");
        hm_countries.put("table_history_siana_elb2e", "جدول سجل الباقي من الصيانات");
        hm_countries.put("table_information_hr", "جدول معلومات أساسيه للبرنامج");
        hm_countries.put("table_num_operation", "جدول عدد العمليات الشهريه");
        hm_countries.put("table_product", "جدول المنتجات");
        hm_countries.put("table_trkeb", "جدول التركيبات");
        hm_countries.put("table_users", "جدول المستخدمين");
        hm_countries.put("table_wrongs", "جدول الأعطال");
        hm_countries.put("table_client_class_history", "جدول سجل تقيمم العملاء");
        hm_countries.put("table_el2st", "جدول سجل الأقساط");
        hm_countries.put("table_elmo7sl", "جدول المحصل");
        hm_countries.put("table_contacts", "جدول الأتصالات");
        hm_countries.put("table_siana_gdeda", "جدول صيانه جديده");
        hm_countries.put("table_siana_gdeda_archive", "جدول سجل الصيانات الجديده");
        hm_countries.put("table_classes", "جدول الفئات");
        hm_countries.put("wrong", "العطل");
        hm_countries.put("wrong", "العطل");
        hm_countries.put("hints_trkeb", "ملاحظات التركيب");
        hm_countries.put("table_hints_trkeb", "جدول ملاحظات التركيب");
        hm_countries.put("hints_siana_gdeda", "ملاحظات الصيانات الجديدة");
        hm_countries.put("table_hints_siana_gdeda", "جدول ملاحظات الصيانة الجديدة");
        hm_countries.put("id", "الكود");
        hm_countries.put("serial", "الرقم المسلسل");
        hm_countries.put("table_name", "أسم الجدول");
        hm_countries.put("table_number", "أرقام أعمدة الجدول");
        hm_countries.put("table_size", "عرض أعمدة الجدول");
        hm_countries.put("table_header", "أسماء أعمده الجدول");
        hm_countries.put("table_font", "حجم خط الجدول");
        hm_countries.put("header_font", "حجم خط أعمده الجدول");
        hm_countries.put("what_done", "ما تم");
        hm_countries.put("operation", "العملية");
        hm_countries.put("report_headers", "عناوين التقرير");
        hm_countries.put("report_headers_levels", "مستوي عناوين التقرير");
        hm_countries.put("report_headers_positions", "أماكن عناوين التقرير");
        hm_countries.put("report_footers", "ذيول التقرير ");
        hm_countries.put("report_footers_levels", "مستوي ذيول التقرير");
        hm_countries.put("report_footers_positions", "أماكن ذيول التقرير");
        hm_countries.put("enable_insert", "الأدخال من جميع الشاشات");

        hm_countries.put("table_print_history", "جدول سجل الطباعة");
        hm_countries.put("table_type_elsiana", "جدول أنواع الصيانات");
        hm_countries.put("table_call_log", "جدول سجل المكالمات");
        hm_countries.put("time", "الوقت");
        hm_countries.put("type_call", "نوع المكالمة");
        hm_countries.put("id_type_elsiana", "كود نوع الصيانة");
        hm_countries.put("type", "النوع");
        hm_countries.put("all_siana_before_el5ta", "جميع الصيانة قبل الخطة");
        hm_countries.put("all_siana_in_el5ta", "جميع الصيانة بالخطة");
        hm_countries.put("all_siana_after_el5ta", "جميع الصيانة خارج الخطة");
        hm_countries.put("some_siana_before_el5ta", "بعض الصيانة قبل الخطة");
        hm_countries.put("some_siana_in_el5ta", "بعض الصيانة بالخطة");
        hm_countries.put("some_siana_after_el5ta", "بعض الصيانة خارج الخطة");
        hm_countries.put("type_elsiana", "نوع الصيانة");
        hm_countries.put("call_log", "سجل المكالمات");
        hm_countries.put("previous_dates", "تاريخ الشمعات الماضية");
        hm_countries.put("nsbt_el2mla7_before", "نسبة الاملاح قبل");
        hm_countries.put("nsbt_el2mla7_after", "سجل نسبة الأملاح بعد");
        hm_countries.put("id_els7b", "كود السحب للأرصدة");
        hm_countries.put("enable_num_el23tal_in_detect_class", "تفعيل خاصية النظر للأعطال عند التقييم");
        hm_countries.put("archive", "سجل الخطة");
         hm_countries.put("archive_trkeb", "سجل خطة التركيبات");
          hm_countries.put("archive_siana_gdeda", "سجل خطة الصيانات الجديدة");
        hm_countries.put("id_archive", "كود السجل");
        hm_countries.put("archive_siana_value", "قيمه سجل الصيانة");
        hm_countries.put("archive_el3otl_value", "قيمة سجل العطل");
        hm_countries.put("archive_el2st_value", "قيمة سجل القسط");
        hm_countries.put("archive_trkeb_value", "قيمة سجل التركيب");
        hm_countries.put("archive_siana_gdeda_value", "قيمة سجل الصيانة الجديدة");
         hm_countries.put("table_archive","جدول سجل الخطة");
          hm_countries.put("table_archive_trkeb","جدول سجل الخطة للتركيبات");
           hm_countries.put("table_archive_siana_gdeda","جدول سجل الخطة للصيانات الجديده");
           hm_countries.put("sort_statement", "ترتيب العملاء بالجدول");

    }

    String search_hm(String text) {
        for (Map.Entry ms : hm_countries.entrySet()) {
            if (ms.getValue().equals(text)) {
                return (String) ms.getKey();
            }
        }
        return null;
    }

}
