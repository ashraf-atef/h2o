/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import static el7iah2.connection.stmt;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author ashraf_atef
 */
public class action_panel_add_client {

 main m ;

    public  action_panel_add_client(main m) {
         this.m=m ;
        m.jTable_elmndob_elwaset__insert.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_elmndob_elwaset__insert, m.font));
        m.jTable_elmndob_insert.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_elmndob_insert, m.font));
        m.jTable_product_insert1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_product_insert1, m.font));
        m.jTable_clients_insert.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_clients_insert, m.font));
        m.jTable_canceled.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_canceled, m.font));
        m.jTable_region.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_region, m.font));
        m.jTable_elfne_insert.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_elfne_insert, m.font));
        m.jTable_trkeb.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_trkeb, m.font));
        m.jTable_country_trkeb.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_country_trkeb, m.font));
        m.jTable_elfne_trkeb.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_elfne_trkeb, m.font));
        m.jTable_hints1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_hints1, m.font));
        m.jTable_elmo7sl.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_elmo7sl, m.font));
        m.jTable_country_trkeb1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_country_trkeb1, m.font));
        m.jTable_hints.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_hints, m.font));
        m.h.jTable_clients_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_clients_siana, m.font));
        m.h.jTable_clients_el23tal.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_clients_el23tal, m.font));
        m.h.jTable_co_el2st.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_co_el2st, m.font));
        m.h.jTable_elkta3_info.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elkta3_info, m.font));
        m.h.jTable_elkta3_info1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elkta3_info1, m.font));
        m.h.jTable_fatorh_elsiana2.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_fatorh_elsiana2, m.font));
        m.h.jTable_fatorh_elsiana3.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_fatorh_elsiana3, m.font));
        m.h.jTable_elMNDOB_ELMNDOB1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elMNDOB_ELMNDOB1, m.font));
        m.h.r.jTable_reports.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.r.jTable_reports, m.font));
        m.h.r.jTable_report_elfne.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.r.jTable_report_elfne, m.font));
        m.h.r.jTable_report_elmndob.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.r.jTable_report_elmndob, m.font));
        m.h.r.jTable_report_elmndob_elwaset.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.r.jTable_report_elmndob_elwaset, m.font));
        m.h.r.jTable_report_elmo7sl.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.r.jTable_report_elmo7sl, m.font));
        m.h.jTable_numbers.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_numbers, m.font));
        m.h.jTable_print.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_print, m.font));
        m.h.jTable_print_columns.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_print_columns, m.font));
        m.jTable_siana_help_dmg.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_siana_help_dmg, m.font));
        m.jTable_siana_help_dmg_reject.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_siana_help_dmg_reject, m.font));
        m.jTable_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_siana, m.font));
        m.jTable_trkeb_archive_done.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_trkeb_archive_done, m.font));
        m.jTable_trkeb_archive_not_done.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_trkeb_archive_not_done, m.font));
        m.h.jTable_headers.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_headers, m.font));
        m.h.jTable_footers.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_footers, m.font));
        m.h.jTable_elmndob_canceled.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elmndob_canceled, m.font));
           m.h.jTable_elmndob_elwaset_canceled.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elmndob_elwaset_canceled, m.font));
        
        
         m.h.jTable_main_elkta3.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_main_elkta3, m.font));
          m.h.jTable_update.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_update, m.font));
          m.h.jTable_db.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_db, m.font));
          m.jTable_add_3otl.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_add_3otl, m.font));
          m.h.jTable_elkt3at.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elkt3at, m.font));
          m.h.jTable_region_elkta3.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_region_elkta3, m.font));
          m.h.jTable_all_regions.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_all_regions, m.font));
          m.h.jTable_cl_rep_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_cl_rep_siana, m.font));
          m.h.jTable_hints.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_hints, m.font));
          m.h.jTable_elmo7sl1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elmo7sl1, m.font));
          m.h.jTable_el2rsdh.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_el2rsdh, m.font));
          m.h.jTable_elb2e_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elb2e_siana, m.font));
          m.h.jTable_el2st_client.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_el2st_client, m.font));
          m.h.jTable_class_client.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_class_client, m.font));
          m.h.jTable_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_siana, m.font));
          m.h.jTable_operations_ELFNE.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_operations_ELFNE, m.font));
          m.h.jTable_operations_ELFNE1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_operations_ELFNE1, m.font));
          m.h.jTable_operations_ELMNDOB.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_operations_ELMNDOB, m.font));
          m.h.jTable_operations_ELMNDOB_elwset.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_operations_ELMNDOB_elwset, m.font));
          m.h.jTable_elfne_ELFNE.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elfne_ELFNE, m.font));
          m.h.jTable_elfne_ELFNE1.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elfne_ELFNE1, m.font));
          m.h.jTable_elMNDOB_ELMNDOB.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_elMNDOB_ELMNDOB, m.font));
          m.jTable_siana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.jTable_siana, m.font));
          m.h.jTable_type_elsiana.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_type_elsiana, m.font));
          m.h.jTable_calls_client.setDefaultRenderer(Object.class, new MultiLineTableCellRenderer(m.h.jTable_calls_client, m.font));


   }
    
   void disable_insert()
   {
     
       m.jTextField_country.setEditable(false);

       m.jTextField_id_product.setEditable(false);
       m.jTextField_type.setEditable(false);
       m.jTextField_price_product.setEditable(false);
       m.jTextField_elmkdm.setEditable(false);
       m.jTextField_el2st.setEditable(false);
       m.jTextField_all_quantity.setEditable(false);

       m.jTextField_id_elfne.setEditable(false);
       m.jTextField_phone_elfne.setEditable(false);
       m.jTextField_places.setEditable(false);

       m.jTextField_id_elmndob.setEditable(false);
       m.jTextField_phone_elmndob.setEditable(false);
       
       m.jTextField_id_elmndob_elwaset.setEditable(false);
       m.jTextField_phone_elmndob_elwaset.setEditable(false);
       
       m.jTextField_id_elfne_sianat.setEditable(false);
       m.jTextField_phone_elfne_sianat.setEditable(false);
       m.jTextField_places_elfne_sianat.setEditable(false);
       
       m.jTextField_id_elfne_trkeb.setEditable(false);
       m.jTextField_phone_elfne_trkeb.setEditable(false);
       m.jTextField_place_trkeb.setEditable(false);
       
   }
    void add_client()
    {
        String id_client = m.jTextField_id_client.getText();
        String name_client = m.jTextField_name_client.getText();
        String job = m.jTextField_job.getText();
        String home_num = m.jTextField_home_num.getText();
        String street = m.jTextField_street.getText();
        String region = m.jTextField_region.getText();
        String phone = m.jTextField_phone.getText();
        String country = m.jTextField_country.getText();
        String id_product = m.jTextField_id_product.getText();
        String name_product = m.jTextField_name_product.getText();
        String type = m.jTextField_type.getText();
        String price = m.jTextField_price_product.getText();
        String elmokdm = m.jTextField_elmkdm.getText();
        String el2st = m.jTextField_el2st.getText();
        String quantity = m.jTextField_quantity.getText();
        String date_buy = ((JTextField)m.jTextField_dte_buy.getDateEditor().getUiComponent()).getText();
        String date1 = ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).getText();

        String date2 = ((JTextField)m.jTextField_date_2.getDateEditor().getUiComponent()).getText();
        String date3 = ((JTextField)m.jTextField_date_3.getDateEditor().getUiComponent()).getText();
        String date5 = ((JTextField)m.jTextField_date_5.getDateEditor().getUiComponent()).getText();
        String date6 = ((JTextField)m.jTextField_date_6_in.getDateEditor().getUiComponent()).getText();
        String date_7 = ((JTextField)m.jTextField_date_7_in.getDateEditor().getUiComponent()).getText();
        String rsed1 = m.jTextField_rsed_1.getText();
        String rsed2 = m.jTextField_rsed_2.getText();
        String rsed3 = m.jTextField_rsed_3.getText();
        String rsed5 = m.jTextField_rsed_5.getText();
        String rsed6 = m.jTextField_rsed_6.getText();
        String rsed7 = m.jTextField_rsed_7.getText();
        String siana_1 = m.jTextField_siana_1.getText();
        String siana_2 = m.jTextField_siana_2.getText();
        String siana_3 = m.jTextField_siana_3.getText();
        String siana_5 = m.jTextField_siana_5.getText();
        String siana_6 = m.jTextField_siana_6.getText();
        String siana_7 = m.jTextField_siana_7.getText();
        String hints = m.jTextField_hints.getText();
        String nezam_eldf3 = m.jTextField_nezam_eldf3.getText();
        String date_el2st = ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).getText();
        String elba2e = m.jTextField_elba2e.getText();
        String id_elfne = m.jTextField_id_elfne.getText();
        String name_elfne = m.jTextField_name_elfne.getText();
        String phone_elfne = m.jTextField_phone_elfne.getText();
        String places = m.jTextField_places.getText();
        String id_elmndob = m.jTextField_id_elmndob.getText();
        String name_elmndob = m.jTextField_name_elmndob.getText();
        String phone_elmndob = m.jTextField_phone_elmndob.getText();
        String date_regist = ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).getText();
        String all_quantity = m.jTextField_all_quantity.getText();
        String trkeb_dead_line=((JTextField)m.jTextField_trkeb_dead_line.getDateEditor().getUiComponent()).getText();
        String date_remake_class=((JTextField)m.jTextField_date_remake_class.getDateEditor().getUiComponent()).getText();
        String num_month_class=m.jTextField_num_month_class.getText();
        String elmosthdaf=m.jTextField_elmosthdaf.getText();
        String id_elmndob_elwaset = m.jTextField_id_elmndob_elwaset.getText();
        String name_elmndob_elwaset = m.jTextField_name_elmndob_elwaset.getText();
        String phone_elmndob_elwaset = m.jTextField_phone_elmndob_elwaset.getText();
        String re = "";
        boolean flag_continue=true ;

        if (m.flag_insert_region==true)
        {

            if (m.ob.check_insert_region(region)==false || region.length()>199||region.length()==0)
            {
                flag_continue=false ;
                m.jTextField_region.setBackground(Color.pink);
                m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            if (country.length()>99||country.length()==0)
            {
                 flag_continue=false ;
                 m.jTextField_country.setBackground(Color.pink);
               m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

        }

        if (m.flag_insert_client == true) {

            if (m.ob.check_int(id_client) == false) {
                flag_continue=false ;
                m.jTextField_id_client.setBackground(Color.PINK);
               m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            else
            {
                if ( m.ob.check_insert_client(id_client)== false||id_client.length()>10) {
                    m.jTextField_id_client.setBackground(Color.pink);
                    flag_continue=false ;
                   m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }
            }
         if (name_client.length()==0||name_client.length()>49)
         {
                flag_continue=false ;
                 m.jTextField_name_client.setBackground(Color.pink);
                     m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
         }
         if (job.length()>49)
         {
                flag_continue=false ;
                 m.jTextField_job.setBackground(Color.pink);
                     m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
         }
         if (phone.length()==0||phone.length()>100)
         {
             flag_continue=false;
             m.jTextField_phone.setBackground(Color.pink);
                 m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
         }
        }

        if (m.ob.check_int(home_num) == false||home_num.length()>6) {
            flag_continue=false ;
            m.jTextField_home_num.setBackground(Color.PINK);
                m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }
        ////////////////////////////////////////////////////

        if (m.flag_insert_product == true) {

            if ( m.ob.check_int(id_product)== false ||id_product.length()>10) {
                m.jTextField_id_product.setBackground(Color.PINK);
                flag_continue=false ;
                    m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            else
            {

                if ( m.ob.check_insert_product(id_product)== false) {
                    m.jTextField_id_product.setBackground(Color.pink);
                    flag_continue=false ;
                     m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }

            }

            if (m.ob.check_int(price)== false||price.length()>19) {
                m.jTextField_price_product.setBackground(Color.PINK);
                flag_continue=false ;
                 m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            try { // to check paresing
                int int_type= Integer.parseInt(type);
                if (m.ob.check_int(type) == false || int_type<0 ||int_type>7 ) {

                    m.jTextField_type.setBackground(Color.PINK);
                    flag_continue=false ;
                     m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }
            }catch (Exception e)
            { m.jTextField_type.setBackground(Color.PINK);
                flag_continue=false ;
             m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));}

            if ( m.ob.check_int(elmokdm)== false||elmokdm.length()>19) {
                m.jTextField_elmkdm.setBackground(Color.PINK);
                flag_continue=false ;
                 m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if ( m.ob.check_int(el2st)== false||el2st.length()>19) {
                m.jTextField_el2st.setBackground(Color.PINK);
                flag_continue=false ;
                 m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(all_quantity)== false||all_quantity.length()>6) {
                m.jTextField_all_quantity.setBackground(Color.pink);
                flag_continue=false ;
                 m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            if (name_product.length()>30||name_product.length()==0)
            {
                m.jTextField_name_product.setBackground(Color.pink);
                flag_continue=false ;
                 m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

        }
        /////////////////////////////////////////////////////////////////////////

        if (m.ob.check_int(quantity) == false||quantity.length()>6) {
            m.jTextField_quantity.setBackground(Color.PINK);
            flag_continue=false ;
             m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(nezam_eldf3)== false||nezam_eldf3.length()>1) {
            m.jTextField_nezam_eldf3.setBackground(Color.PINK);
            flag_continue=false ;
             m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(num_month_class)== false||num_month_class.length()>3) {
            m.jTextField_num_month_class.setBackground(Color.PINK);
            flag_continue=false ;
             m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if ( m.ob.check_int(elmosthdaf)== false||elmosthdaf.length()>3||Integer.parseInt(elmosthdaf)<1) {
            m.jTextField_elmosthdaf.setBackground(Color.PINK);
            flag_continue=false ;
             m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
             JOptionPane.showMessageDialog(null, "عفوا المستهدف يجب ان يكون أكبر من 0 و اقل من 999");
        }

        ////////////////////////////

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
        String result_2 = "";
        String old_quantity_2 = "";

        String elb2e_siana = m.jTextField_total_elb2e_siana.getText();

        if (!m.jCheckBox1.isSelected()&&!m.jCheckBox7.isSelected()) {

            if (m.ob.check_time(date_remake_class) == false) {
                m.jTextField_date_remake_class.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(elb2e_siana)== false||elb2e_siana.length()>19) {
                m.jTextField_total_elb2e_siana.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed1)== false||rsed1.length()>5) {
                m.jTextField_rsed_1.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed2)== false||rsed2.length()>5) {
                m.jTextField_rsed_2.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed3)== false||rsed3.length()>5) {
                m.jTextField_rsed_3.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed5)== false||rsed5.length()>5) {
                m.jTextField_rsed_5.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed6)== false||rsed6.length()>5) {
                m.jTextField_rsed_6.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(rsed7)== false||rsed7.length()>5) {
                m.jTextField_rsed_7.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_int(elba2e)== false||elba2e.length()>19) {
                m.jTextField_elba2e.setBackground(Color.PINK);
                flag_continue = false;
                 m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (  m.ob.check_time(date_buy)== false) {
                m.jTextField_dte_buy.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if ( m.ob.check_time(date1)== false) {
                m.jTextField_date1.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_time(date2)== false) {
                m.jTextField_date_2.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_time(date3)== false) {
                m.jTextField_date_3.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if ( m.ob.check_time(date5)== false) {
                m.jTextField_date_5.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_time(date6)== false) {
                m.jTextField_date_6_in.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if ( m.ob.check_time(date_7)== false) {
                m.jTextField_date_7_in.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            if (m.ob.check_time(date_el2st)== false) {
                m.jTextField_date_el2st.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }

            ///////////////////////////////////////

            if (m.flag_insert_elfne == true) {

                if (id_elfne.length() != 0 || name_elfne.length() != 0 || phone_elfne.length() != 0
                    || places.length() != 0) {

                    if (m.ob.check_int(id_elfne)== false||id_elfne.length()>10) {
                        m.jTextField_id_elfne.setBackground(Color.PINK);
                        flag_continue = false;
                         m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                    }
                    else
                    {
                        if (m.ob.check_insert_elfne(id_elfne)== false) {
                            m.jTextField_id_elfne.setBackground(Color.pink);
                            flag_continue = false;
                             m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                        }

                    }
                    if (name_elfne.length()==0||name_elfne.length()>50)
                    {
                        m.jTextField_name_elfne.setBackground(Color.pink);
                        flag_continue=false ;
                         m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                    }

                    if (m.ob.check_int(phone_elfne) == false||phone_elfne.length()>19) {
                        m.jTextField_phone_elfne.setBackground(Color.PINK);
                        flag_continue = false;
                         m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                    }

                }
            }

            try {

                stmt=m.ob.conn.createStatement();
                ResultSet rs = m.ob.stmt.executeQuery("select id_client ,quantity , elb2e , total_elb2e_sian , rsed1,rsed2,rsed3,rsed5,rsed6,rsed7, date_el2st"
                    + " from clients_product where id_client=" + id_client + " and id_product=" + id_product + " and date_buy= '"
                    + date_buy + "'");
                if (rs.next())
                {
                    result = String.valueOf(rs.getString("id_client"));
                    old_quantity = String.valueOf(rs.getString("quantity"));
                    old_elb2e = String.valueOf(rs.getString("elb2e"));
                    total_elb2e=rs.getString(4);
                    rsed1_=rs.getString(5);
                    rsed2_=rs.getString(6);
                    rsed3_=rs.getString(7);
                    rsed_5=rs.getString(8);
                    rsed_6=rs.getString(9);
                    rsed_7=rs.getString(10);
                    date_el2st_old=rs.getString(11);
                    int ch=JOptionPane.showConfirmDialog(null, "يوجد عميل بهذه البيانات بجدول خدمه العملاء :-"+"\n"
                        +"اذا كنت ترغب  بدمج الجهازين و تجمع الكميه و المبالغ المتبقيه و الأرصد قم بالضفط نعم و قم بالتأكد من تواريخ الأقساط و الصيانات للجهاز من جدول خدمه العملاء "+"\n"
                        +"اذا كنت ترغب بجعل كل جهاز منفصل قم بالضغط لا و قم بتعديل تاريخ الشراء بتاريخ سابق او لاحق"+"\n"
                        +"اذا كنت ترغب بألغاء عمليه التسجيل قم بالضغط ألغاء");
                    if (ch==0){}
                    else if (ch==1){ flag_continue = false;}
                    else { flag_continue = false;}

                }
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else
        {
            if (m.ob.check_time(date_regist)==false)
            {
                m.jTextField_date_regist.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            if (m.ob.check_time(trkeb_dead_line)==false)
            {m.jTextField_trkeb_dead_line.setBackground(Color.pink);
                flag_continue = false;
                 m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            if (m.ob.time_compare(date_regist,trkeb_dead_line)==false)
            {
                JOptionPane.showMessageDialog(null, "عفوا يجب ان يكون الحد الأقصي للتركيب بعد تاريخ التسجيل");
                flag_continue = false;
                 m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
            }
            if (m.jCheckBox1.isSelected())
            {

                try {
                    stmt=m.ob.conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select id_client ,quantity"
                        + " from trkeb where id_client=" + id_client + " and id_product=" + id_product + " and date_regist='"+date_regist+"'");

                    if ( rs.next())
                    {
                        result_2 = String.valueOf(rs.getString("id_client"));
                        old_quantity_2 = String.valueOf(rs.getString("quantity"));

                        int ch=JOptionPane.showConfirmDialog(null, "يوجد عميل بهذه البيانات بجدول التركيبات :-"+"\n"
                            +"اذا كنت ترغب  بدمج الجهازين و تجميع الكميه قم بالضفط نعم "+"\n"
                            +"اذا كنت ترغب بجعل كل جهاز منفصل قم بالضغط لا و قم بتعديل تاريخ التسجيل بتاريخ سابق او لاحق"+"\n"
                            +"اذا كنت ترغب بألغاء عمليه التسجيل قم بالضغط ألغاء");
                        if (ch==0){}
                        else if (ch==1){ flag_continue = false;}
                        else { flag_continue = false;}
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            else if (m.jCheckBox7.isSelected())
            {

                try {
                    stmt=m.ob.conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select id_client ,quantity"
                        + " from siana_gdeda where id_client=" + id_client + " and id_product=" + id_product + " and date_regist='"+date_regist+"'");

                    if ( rs.next())
                    {
                        result_2 = String.valueOf(rs.getString("id_client"));
                        old_quantity_2 = String.valueOf(rs.getString("quantity"));

                        int ch=JOptionPane.showConfirmDialog(null, "يوجد عميل بهذه البيانات بجدول الصيانات الجديده :-"+"\n"
                            +"اذا كنت ترغب  بدمج الجهازين و تجميع الكميه قم بالضفط نعم "+"\n"
                            +"اذا كنت ترغب بجعل كل جهاز منفصل قم بالضغط لا و قم بتعديل تاريخ التسجيل بتاريخ سابق او لاحق"+"\n"
                            +"اذا كنت ترغب بألغاء عمليه التسجيل قم بالضغط ألغاء");
                        if (ch==0){}
                        else if (ch==1){ flag_continue = false;}
                        else { flag_continue = false;}
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        ////////////////////////////////

        if (name_elmndob.length() != 0 || id_elmndob.length() != 0 || phone_elmndob.length() != 0) {

            if (m.flag_insert_elmndob == true) {
                if (m.ob.check_int(id_elmndob) == false||id_elmndob.length()>10) {
                    m.jTextField_id_elmndob.setBackground(Color.PINK);
                    flag_continue = false;
                     m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                } else {
                    if (m.ob.check_insert_elmndob(id_elmndob) == false) {
                        m.jTextField_id_elmndob.setBackground(Color.pink);
                        flag_continue = false;
                         m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                    }
                }

                if(name_elmndob.length()>50||name_elmndob.length()==0)
                {
                    m.jTextField_name_elmndob.setBackground(Color.pink);
                    flag_continue=false ;
                     m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }
                
                if (m.ob.check_int(phone_elmndob)== false||phone_elmndob.length()>19) {
                    m.jTextField_phone_elmndob.setBackground(Color.PINK);
                    flag_continue = false;
                     m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }

            }
        }
        ///////////////////////////////////////////////////////

        if (name_elmndob_elwaset.length() != 0 || id_elmndob_elwaset.length() != 0 || phone_elmndob_elwaset.length() != 0) {
            if (m.flag_insert_elmndob_elwaset == true) {

                if (m.ob.check_int(id_elmndob_elwaset) == false||id_elmndob_elwaset.length()>10) {
                    m.jTextField_id_elmndob_elwaset.setBackground(Color.PINK);
                    flag_continue = false;
                     m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                } else {
                    if (m.ob.check_insert_elmndob_elwaset(id_elmndob_elwaset) == false) {
                        m.jTextField_id_elmndob_elwaset.setBackground(Color.pink);
                        flag_continue = false;
                         m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                    }
                }

                if (name_elmndob_elwaset.length()==0||name_elmndob_elwaset.length()>200)
                {
                    m.jTextField_name_elmndob_elwaset.setBackground(Color.pink);
                    flag_continue=false;
                     m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }
                if (phone_elmndob_elwaset.length()>100)
                {
                     flag_continue=false;
                     m.jTextField_phone_elmndob_elwaset.setBackground(Color.pink);
                      m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
                }
                
            }

        }//else{id_elmndob="0";}

        /////////////////////////////////////////////////////////////////

        String clas = m.jTextField_class.getText();
        if (clas.length()==0){ flag_continue=false ; m.jTextField_class.setBackground(Color.pink);  
        m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));}
        if (m.ob.check_int(siana_1)== false||siana_1.length()>3) {
            m.jTextField_siana_1.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(siana_2)== false||siana_2.length()>3) {
            m.jTextField_siana_2.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(siana_3)== false||siana_3.length()>3) {
            m.jTextField_siana_3.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(siana_5)== false||siana_5.length()>3) {
            m.jTextField_siana_5.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(siana_6)== false||siana_6.length()>3) {
            m.jTextField_siana_6.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }

        if (m.ob.check_int(siana_7)== false||siana_7.length()>3) {
            m.jTextField_siana_7.setBackground(Color.pink); flag_continue = false;
             m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
        }
       if (street.length()>200)
       {
           m.jTextField_street.setBackground(Color.pink);
           flag_continue=false ;
            m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-icon.png")));
       }
        //////////////////////////////////////////////////////////// check //////////////////////////////

        ///////////////////////////////////////////////////////////////////////////////
System.out.println(flag_continue);
        if (  flag_continue == true) {
            here : {
              
//               
                if (m.flag_insert_region==true)
                {
                    re+= m.ob.insert_region(region, country);
                }
                if (re.length()!=0)
                {
                    
                    break here ;
                }
              

                if (m.flag_insert_client == true) {
                  
                    re += m.ob.insert_clients(id_client, name_client,job, phone);
                    if (re.length()!=0)
                    {
                       
                        break here ;
                    }
                }

                if (m.flag_insert_product == true) {
                 

                    re += m.ob.insert_into_product(id_product, name_product, type, price, elmokdm, el2st, all_quantity);
                 
                    if (re.length()!=0)
                    {
                       
                        break here ;
                    }
                }

                if (name_elmndob.length() != 0 || id_elmndob.length() != 0 || phone_elmndob.length() != 0) {
                    if (m.flag_insert_elmndob == true) {
                    

                        re += m.ob.insert_into_elmndob( id_elmndob, name_elmndob, phone_elmndob);
                   
                        if (re.length()!=0)
                        {
                            
                            break here ;
                        }

                    }
                }
                if (name_elmndob_elwaset.length() != 0 || id_elmndob_elwaset.length() != 0 || phone_elmndob_elwaset.length() != 0) {
                    if (m.flag_insert_elmndob_elwaset == true) {

                        re+=  m.ob.insert_into_elmndob_elwaset( id_elmndob_elwaset, name_elmndob_elwaset, phone_elmndob_elwaset);

                        if (re.length()!=0)
                        {
                          
                            break here ;
                        }

                    }
                }
            
                if (m.jCheckBox1.isSelected()) {

                   
                     if (id_elfne.length() == 0) {
                        id_elfne = null;
                    }
                    if (id_elmndob.length() == 0) {
                        id_elmndob = null;
                    }
                    if (id_elmndob_elwaset.length()==0)
                    {
                        id_elmndob_elwaset=null;
                    }
                   
                    re +=m. ob.insert_into_trkeb("trkeb",id_client, id_product, quantity, hints,
                        nezam_eldf3, id_elmndob, date_regist, clas, siana_1, siana_2, siana_3, siana_5,
                        siana_6, siana_7,trkeb_dead_line,num_month_class,elmosthdaf,id_elmndob_elwaset,  home_num, street, region, result_2,old_quantity_2);
                  

                    if (re.length()!=0)
                    {
                       
                        break here ;
                    }

                    m.h.alarm_trkeb();
                }
                else  if (m.jCheckBox7.isSelected()) {

                  
                    if (id_elfne.length() == 0) {
                        id_elfne = null;
                    }
                    if (id_elmndob.length() == 0) {
                        id_elmndob = null;
                    }
                    if (id_elmndob_elwaset.length()==0)
                    {
                        id_elmndob_elwaset=null;
                    }
                
                    re += m.ob.insert_into_trkeb("siana_gdeda",id_client, id_product, quantity, hints,
                        nezam_eldf3, id_elmndob, date_regist, clas, siana_1, siana_2, siana_3, siana_5,
                        siana_6, siana_7,trkeb_dead_line,num_month_class,elmosthdaf,id_elmndob_elwaset,  home_num, street, region, result_2,old_quantity_2);
                 

                    if (re.length()!=0)
                    {
                        
                        break here ;
                    }

                  m.h.alarm_siana_gdeda();

                }
                else {

                  
                    if (id_elfne.length() != 0 || name_elfne.length() != 0 || phone_elfne.length() != 0
                        || places.length() != 0) {
                        if (m.flag_insert_elfne == true) {
                           

                            re += m.ob.insert_into_elfne(id_elfne, name_elfne, phone_elfne, places);
                        
                            if (re.length()!=0)
                            {
                             
                                break here ;
                            }

                        }
                    }

                    if (id_elfne.length() == 0) {
                        id_elfne = null;
                    }
                    if (id_elmndob.length() == 0) {
                        id_elmndob = null;
                    }
                    if (id_elmndob_elwaset.length()==0)
                    {
                        id_elmndob_elwaset=null;
                    }
                  
                    String wrongs = null;

                    re += m.ob.insert_into_clients_product(id_client, id_product, quantity, date_buy,
                        m.ob.time_month(date1, Integer.parseInt(siana_1)) ,m.ob.time_month(date2, Integer.parseInt(siana_2)),
                       m. ob.time_month(date3, Integer.parseInt(siana_3)), m.ob.time_month(date5, Integer.parseInt(siana_5)),
                       m. ob.time_month(date6, Integer.parseInt(siana_6)),m. ob.time_month(date_7, Integer.parseInt(siana_7)),
                        rsed1, rsed2, rsed3, rsed5, rsed6, rsed7, hints, nezam_eldf3, m. ob.time_month(date_el2st, Integer.parseInt(nezam_eldf3)), elba2e, id_elmndob, id_elfne, wrongs, clas,
                        elb2e_siana, siana_1, siana_2, siana_3, siana_5,
                        siana_6, siana_7, m.ob.time_month(date_remake_class, Integer.parseInt(num_month_class)),num_month_class,elmosthdaf ,id_elmndob_elwaset, home_num, street, region
                        ,  result ,
                        old_quantity ,
                        old_elb2e ,
                        total_elb2e ,
                        rsed1_ ,
                        rsed2_ ,
                        rsed3_ ,
                        rsed_5 ,
                        rsed_6,
                        rsed_7 ,
                        date_el2st_old );

                    if (re.length()!=0)
                    {
                       
                        break here ;
                    }

                }

                if (re.length() == 0) {
 
                     m. action_Add_client_p0();
                    m.jTextField_id_client.setText("");
                    m.jTextField_name_client.setText("");
                    m.jTextField_job.setText("");
                    m.jTextField_home_num.setText("");
                    m.jTextField_street.setText("");
                    m.jTextField_region.setText("");
                    m.jTextField_phone.setText("");
                    m.jTextField_country.setText("");
                    m.jTextField_id_product.setText("");
                    m.jTextField_name_product.setText("");
                    m.jTextField_type.setText("");
                    m.jTextField_price_product.setText("");
                    m.jTextField_elmkdm.setText("");
                    m.jTextField_el2st.setText("");
                    //  m.jTextField_quantity.setText("");
                    ((JTextField) m.jTextField_dte_buy.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).setText("");

                    ((JTextField)m.jTextField_date_2.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)m.jTextField_date_3.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)m.jTextField_date_5.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)m.jTextField_date_6_in.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)m.jTextField_date_7_in.getDateEditor().getUiComponent()).setText("");
                    m.jTextField_rsed_1.setText("0");
                    m.jTextField_rsed_2.setText("0");
                    m.jTextField_rsed_3.setText("0");
                    m.jTextField_rsed_5.setText("0");
                    m.jTextField_rsed_6.setText("0");
                    m.jTextField_rsed_7.setText("0");

                    ((JTextField)m.jTextField_trkeb_dead_line.getDateEditor().getUiComponent()).setText("");

                    //             int d=0;
                    //                if (Integer.parseInt(id_client) > Integer.parseInt(max_id_client.getText())) {
                        //                    max_id_client.setText(id_client);
                        //                    m.jTextField_id_client.setText(String.valueOf(Integer.parseInt(id_client)+1));
                        //                }
                    //                else
                    //                {
                        //                    d=Integer.parseInt(max_id_client.getText());
                        //
                        //                      m.jTextField_id_client.setText(String.valueOf(d+1));
                        //                }
                    //                if (Integer.parseInt(id_product) > Integer.parseInt(max_id_product.getText())) {
                        //                     max_id_product.setText(id_product);
                        //                    m.jTextField_id_product.setText(String.valueOf(Integer.parseInt(id_product)+1));
                        //                   // max_id_product.setText(id_product);
                        //                }
                    //                else
                    //                {
                        //                     d=Integer.parseInt(max_id_product.getText());
                        //
                        //                      m.jTextField_id_product.setText(String.valueOf(d+1));
                        //                }
                    //                if (Integer.parseInt(id_elfne) > Integer.parseInt(max_id_elfne.getText())) {
                        //                    max_id_elfne.setText(id_elfne);
                        //                    m.jTextField_id_elfne.setText(String.valueOf(Integer.parseInt(id_elfne)+1));
                        //                   // max_id_elfne.setText(id_elfne);
                        //
                        //                }
                    //                else
                    //                {
                        //                     d=Integer.parseInt(max_id_elfne.getText());
                        //
                        //                      m.jTextField_id_elfne.setText(String.valueOf(d+1));
                        //                }
                    //                if (Integer.parseInt(id_elmndob) > Integer.parseInt(max_id_elmndob.getText())) {
                        //                    max_id_elmndob.setText(id_elmndob);
                        //                }
                    //                if (Integer.parseInt(id_elmndob_elwaset) > Integer.parseInt(max_id_elmndob_elwaset.getText())) {
                        //                    max_id_elmndob_elwaset.setText(id_elmndob_elwaset);
                        //                }

                    m.jTextField_hints.setText("");
                    //  m.jTextField_nezam_eldf3.setText("");
                    ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).setText("");
                    m.jTextField_elba2e.setText("");
                    m.jTextField_id_elfne.setText("");
                    m.jTextField_name_elfne.setText("");
                    m.jTextField_phone_elfne.setText("");
                    m.jTextField_places.setText("");
                    m.jTextField_id_elmndob.setText("");
                    m.jTextField_name_elmndob.setText("");
                    m.jTextField_phone_elmndob.setText("");
                    ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).setText("");
                    m.jTextField_all_quantity.setText("");
                 //   //m.jTextField_class.setText("");
                    // m.jTextField_total_elb2e_siana.setText("");
                //   // ((JTextField)m.jTextField_date_remake_class.getDateEditor().getUiComponent()).setText("");
                    // m.jTextField_num_month_class.setText("");
                    //  m.jTextField_elmosthdaf.setText("");

                    m.jTextField_class.setBackground(Color.white);
                    m.jTextField_id_elmndob_elwaset.setText("");
                    m.jTextField_name_elmndob_elwaset.setText("");
                    m.jTextField_phone_elmndob_elwaset.setText("");
                    m.max();
                    m.jTextField_id_client.setBackground(Color.white);
                    m.jTextField_name_client.setBackground(Color.white);
                    m.jTextField_job.setBackground(Color.white);
                    m.jTextField_home_num.setBackground(Color.white);
                    m.jTextField_street.setBackground(Color.white);
                    m.jTextField_region.setBackground(Color.white);
                    m.jTextField_phone.setBackground(Color.white);
                    m.jTextField_country.setBackground(Color.white);
                    m.jTextField_id_product.setBackground(Color.white);
                    m.jTextField_name_product.setBackground(Color.white);
                    m.jTextField_type.setBackground(Color.white);
                    m.jTextField_price_product.setBackground(Color.white);
                    m.jTextField_elmkdm.setBackground(Color.white);
                    m.jTextField_el2st.setBackground(Color.white);
                    m.jTextField_quantity.setBackground(Color.white);
                    m.jTextField_dte_buy.setBackground(Color.white);
                    m.jTextField_dte_buy.setBackground(Color.white);
                    m.jTextField_date1.setBackground(Color.white);
                    m.jTextField_date_2.setBackground(Color.white);
                    m.jTextField_date_3.setBackground(Color.white);
                    m.jTextField_date_5.setBackground(Color.white);
                    m.jTextField_date_6_in.setBackground(Color.white);
                    m.jTextField_date_7_in.setBackground(Color.white);
                    m.jTextField_rsed_1.setBackground(Color.white);
                    m.jTextField_rsed_2.setBackground(Color.white);
                    m.jTextField_rsed_3.setBackground(Color.white);
                    m.jTextField_rsed_5.setBackground(Color.white);
                    m.jTextField_rsed_6.setBackground(Color.white);
                    m.jTextField_rsed_7.setBackground(Color.white);
                    m.jTextField_hints.setBackground(Color.white);
                    m.jTextField_nezam_eldf3.setBackground(Color.white);
                    m.jTextField_date_el2st.setBackground(Color.white);
                    m.jTextField_elba2e.setBackground(Color.white);
                    m.jTextField_id_elfne.setBackground(Color.white);
                    m.jTextField_name_elfne.setBackground(Color.white);
                    m.jTextField_phone_elfne.setBackground(Color.white);
                    m.jTextField_places.setBackground(Color.white);
                    m.jTextField_id_elmndob.setBackground(Color.white);
                    m.jTextField_name_elmndob.setBackground(Color.white);
                    m.jTextField_phone_elmndob.setBackground(Color.white);
                    m.jTextField_id_elmndob_elwaset.setBackground(Color.white);
                    m.jTextField_name_elmndob_elwaset.setBackground(Color.white);
                    m.jTextField_phone_elmndob_elwaset.setBackground(Color.white);
                    m.jTextField_date_regist.setBackground(Color.white);
                    m.jTextField_all_quantity.setBackground(Color.white);
                    m.jTextField_class.setBackground(Color.white);
                    m.jTextField_total_elb2e_siana.setBackground(Color.white);
                    m.jTextField_trkeb_dead_line.setBackground(Color.white);
                    m.jTextField_date_remake_class.setBackground(Color.white);
                    m.jTextField_num_month_class.setBackground(Color.white);
                    m.jTextField_elmosthdaf.setBackground(Color.white);
                    m.jTextField_date_regist.setBackground(Color.white);
                    m.jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                    m.jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png")));
                JOptionPane.showMessageDialog(null, "تم الحفظ بنجاح");
                }

            }
        }
        else
        {
            m.max_low();
        }
    }
    void search_region()
{
        try {
            // TODO add your handling code here:
          // flag_insert_client = true;
      
            if (m.jCheckBox_elwset1.isSelected())
            {
            m.model_region.setRowCount(0);
            String text=m.jTextField1.getText();
           
            m.ob.stmt=m.ob.conn.createStatement();
              
    ResultSet rs_can=m.ob.stmt.executeQuery("select  distinct country   from countries where country like '%"+text+"%'");
      while (rs_can.next())
      {
         m.model_region.addRow(new Object[]
         {
             "" ,
         rs_can.getString(1) ,
         
         });
      } 
            
            }
    } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
    void checked_main()
{
     if (m.jCheckBox1.isSelected()||m.jCheckBox7.isSelected()) {

            m.jTextField_class.setText("A");
            m.jTextField_date_regist.setEnabled(true);
           ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).setText("");
           ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).setText(m.ob.time_now());
            m.jTextField_date1.setEnabled(false);
            m.jTextField_date_2.setEnabled(false);
            m.jTextField_date_3.setEnabled(false);
           m. jTextField_date_6_in.setEnabled(false);

           m. jTextField_date_5.setEnabled(false);
            m.jTextField_date_7_in.setEnabled(false);
           m. jTextField_rsed_1.setEnabled(false);
           m. jTextField_rsed_2.setEnabled(false);
            m.jTextField_rsed_3.setEnabled(false);
            m.jTextField_rsed_5.setEnabled(false);
            m.jTextField_rsed_6.setEnabled(false);
            m.jTextField_rsed_7.setEnabled(false);
            m.jTextField_total_elb2e_siana.setEnabled(false);

            m.jTextField_dte_buy.setEnabled(false);

            m.jTextField_id_elfne.setEnabled(false);
            m.jTextField_name_elfne.setEnabled(false);
            m.jTextField_phone_elfne.setEnabled(false);
            m.jTextField_places.setEnabled(false);

            m.jTextField_date_el2st.setEnabled(false);
            m.jTextField_elba2e.setEnabled(false);
            m.jTextField_trkeb_dead_line.setEnabled(true);
            m.jTextField_date_remake_class.setEnabled(false);

        } else {
            m.jTextField_date_regist.setEnabled(false);

 m.jTextField_class.setText("");
             

            m.jTextField_date1.setEnabled(true);
            m.jTextField_date_2.setEnabled(true);
            m.jTextField_date_3.setEnabled(true);
            m.jTextField_date_6_in.setEnabled(true);

            m.jTextField_date_5.setEnabled(true);
            m.jTextField_date_7_in.setEnabled(true);
            m.jTextField_rsed_1.setEnabled(true);
            m.jTextField_rsed_2.setEnabled(true);
            m.jTextField_rsed_3.setEnabled(true);
            m.jTextField_rsed_5.setEnabled(true);
            m.jTextField_rsed_6.setEnabled(true);
            m.jTextField_rsed_7.setEnabled(true);
            m.jTextField_total_elb2e_siana.setEnabled(true);
            m.jTextField_dte_buy.setEnabled(true);

            m.jTextField_id_elfne.setEnabled(true);
            m.jTextField_name_elfne.setEnabled(true);
            m.jTextField_phone_elfne.setEnabled(true);
            m.jTextField_places.setEnabled(true);
              m.        jTextField_trkeb_dead_line.setEnabled(false);
           m. jTextField_date_el2st.setEnabled(true);
            m.jTextField_elba2e.setEnabled(true);
            m.jTextField_date_remake_class.setEnabled(true);
        }

}
    
    void  import_from_excel()
    {
         JFileChooser ch=new JFileChooser();
        String path="";
        if (ch.showOpenDialog(null)==ch.OPEN_DIALOG)
        {
            path=String.valueOf(ch.getSelectedFile()) ;
            m.inputWorkbook = new File(path);
        }
    }
    
    void read_client_from_excel()
    {
         if (m.inputWorkbook!=null&&m.ob.check_int(m.jTextField_xls.getText())==true)
        {
            Workbook w=null;
            try {
                try {
                    w = Workbook.getWorkbook(m.inputWorkbook);
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                // Get the first sheet
                Sheet sheet = w.getSheet(0);
                // Loop over first 10 column and lines
                //int i=0 ;
                int j=Integer.parseInt(m.jTextField_xls.getText())-1;

                Cell cell = sheet.getCell(0, j);
                m.jTextField_id_client.setText(cell.getContents());
                 cell = sheet.getCell(1, j);
                m.jTextField_name_client.setText(cell.getContents());
                cell = sheet.getCell(2, j);
                m.jTextField_job.setText(cell.getContents());
                cell = sheet.getCell(3, j);
                m.jTextField_home_num.setText(cell.getContents());
                cell = sheet.getCell(4, j);
                m.jTextField_street.setText(cell.getContents());
                cell = sheet.getCell(5, j);
                m.jTextField_phone.setText(cell.getContents());
                cell = sheet.getCell(6, j);
                ((JTextField) m.jTextField_dte_buy.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(7, j);
                ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(8, j);
                ((JTextField) m.jTextField_date_2.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(9, j);
                ((JTextField) m.jTextField_date_3.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(10, j);
                ((JTextField)m. jTextField_date_5.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(11, j);
                ((JTextField) m.jTextField_date_6_in.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(12, j);
                ((JTextField) m.jTextField_date_7_in.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(13, j);
                m.jTextField_hints.setText(cell.getContents());
                cell = sheet.getCell(14, j);
                ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).setText(cell.getContents());
                cell = sheet.getCell(15, j);
                m.jTextField_elba2e.setText(cell.getContents());
                cell = sheet.getCell(16, j);
                m.jTextField_total_elb2e_siana.setText(cell.getContents());
                 cell = sheet.getCell(17, j);
                m.jTextField_name_product.setText(cell.getContents());
                cell = sheet.getCell(18, j);
                m.jTextField_region.setText(cell.getContents());
                cell = sheet.getCell(19, j);
                m.jTextField_country.setText(cell.getContents());
m.set_flags_insert();
            } catch (Exception e) {

            }

            m.jTextField_xls.setText(String.valueOf(Integer.parseInt(m.jTextField_xls.getText())+1));
        }

    }
    
    void read_client_from_text()
    {
        
        JFileChooser ch=new JFileChooser();
        ch.showOpenDialog(null);
        String pass= ch.getSelectedFile().toString() ;
        java.io.File file=new java.io.File(pass);
        System.out.println("ok1");
        Scanner input=null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {

        }
        System.out.println("ok2");

        if (input.hasNext())
        {
            m.jTextField_name_client.setText(input.nextLine());
            m.jTextField_id_client.setText(input.nextLine());

            m.jTextField_job.setText(input.nextLine());
            m.jTextField_home_num.setText(input.nextLine());
            m.jTextField_street.setText(input.nextLine());
            m.jTextField_region.setText(input.nextLine());m.jTextField_country.setText(input.nextLine());
            m.jTextField_phone.setText(input.nextLine());
            m.jTextField_name_product.setText(input.nextLine());
            m.jTextField_id_product.setText(input.nextLine());

            m.jTextField_type.setText(input.nextLine());
            m.jTextField_price_product.setText(input.nextLine());
            m.jTextField_elmkdm.setText(input.nextLine());
            m.jTextField_el2st.setText(input.nextLine());
            m.jTextField_all_quantity.setText(input.nextLine());
            m.jTextField_quantity.setText(input.nextLine());
            ((JTextField) m.jTextField_dte_buy.getDateEditor().getUiComponent()).setText(input.nextLine());
            ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).setText(input.nextLine());

            ((JTextField)m.jTextField_date_2.getDateEditor().getUiComponent()).setText(input.nextLine());
            ((JTextField)m.jTextField_date_3.getDateEditor().getUiComponent()).setText(input.nextLine());
            ((JTextField)m.jTextField_date_5.getDateEditor().getUiComponent()).setText(input.nextLine());
            ((JTextField)m.jTextField_date_6_in.getDateEditor().getUiComponent()).setText(input.nextLine());
            ((JTextField)m.jTextField_date_7_in.getDateEditor().getUiComponent()).setText(input.nextLine());
            m.jTextField_rsed_1.setText(input.nextLine());
            m.jTextField_rsed_2.setText(input.nextLine());
            m.jTextField_rsed_3.setText(input.nextLine());
            m.jTextField_rsed_5.setText(input.nextLine());
            m.jTextField_rsed_6.setText(input.nextLine());
            m.jTextField_rsed_7.setText(input.nextLine());

            m.jTextField_hints.setText(input.nextLine());
            m.jTextField_nezam_eldf3.setText(input.nextLine());
            ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).setText(input.nextLine());
            m.jTextField_elba2e.setText(input.nextLine());

            m.jTextField_name_elfne.setText(input.nextLine());
            m.jTextField_id_elfne.setText(input.nextLine());

            m.jTextField_phone_elfne.setText(input.nextLine());
            m.jTextField_places.setText(input.nextLine());
            m.jTextField_name_elmndob.setText(input.nextLine());
            m.jTextField_id_elmndob.setText(input.nextLine());

           m. jTextField_phone_elmndob.setText(input.nextLine());
            ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).setText(input.nextLine());

            m.jTextField_class.setText(input.nextLine());
            m.jTextField_total_elb2e_siana.setText(input.nextLine());
            m.jTextField_siana_1.setText(input.nextLine());
            m.jTextField_siana_2.setText(input.nextLine());
            m.jTextField_siana_3.setText(input.nextLine());
            m.jTextField_siana_5.setText(input.nextLine());
            m.jTextField_siana_6.setText(input.nextLine());
            m.jTextField_siana_7.setText(input.nextLine());
            m.jTextField_name_elmndob_elwaset.setText(input.nextLine());
            m.jTextField_id_elmndob_elwaset.setText(input.nextLine());

            m.jTextField_phone_elmndob_elwaset.setText(input.nextLine());
            ((JTextField)m.jTextField_trkeb_dead_line.getDateEditor().getUiComponent()).setText(input.nextLine());
            m.jTextField_num_month_class.setText(input.nextLine());
            ((JTextField)m.jTextField_date_remake_class.getDateEditor().getUiComponent()).setText(input.nextLine());

            m.jTextField_elmosthdaf.setText(input.nextLine());
m.set_flags_insert();
        }

    }
    
    void write_client_to_text()
    {
            java.io.PrintWriter out=null;
        try {
            // TODO add your handling code here:
            JFileChooser ch=new JFileChooser();
            String path="";
            if (ch.showOpenDialog(null)==ch.OPEN_DIALOG)
            {
                path=String.valueOf(ch.getSelectedFile()) ;
            }
            java.io.File file=new java.io.File(path);
            out = new java.io.PrintWriter(file);

            String name_client = m.jTextField_name_client.getText(); String id_client = m.jTextField_id_client.getText();
            String job = m.jTextField_job.getText();
            String home_num = m.jTextField_home_num.getText();
            String street = m.jTextField_street.getText();
            String region = m.jTextField_region.getText();
            out.println(name_client);out.println(id_client);
            out.println(job);out.println(home_num);out.println(street);out.println(region);

            String country = m.jTextField_country.getText();String phone = m.jTextField_phone.getText();

            String name_product = m.jTextField_name_product.getText();String id_product = m.jTextField_id_product.getText();
            String type = m.jTextField_type.getText();
            out.println(country);out.println(phone);out.println(name_product);out.println(id_product);out.println(type);
            String price = m.jTextField_price_product.getText();
            String elmokdm = m.jTextField_elmkdm.getText();
            String el2st = m.jTextField_el2st.getText();
            String quantity = m.jTextField_quantity.getText();
            String all_quantity = m.jTextField_all_quantity.getText();
            String date_buy = ((JTextField)m.jTextField_dte_buy.getDateEditor().getUiComponent()).getText();
            String date1 = ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).getText();
            out.println(price);out.println(elmokdm);out.println(el2st);out.println(all_quantity);out.println(quantity);out.println(date_buy);out.println(date1);
            String date2 = ((JTextField)m.jTextField_date_2.getDateEditor().getUiComponent()).getText();
            String date3 = ((JTextField)m.jTextField_date_3.getDateEditor().getUiComponent()).getText();
            String date5 = ((JTextField)m.jTextField_date_5.getDateEditor().getUiComponent()).getText();
            String date6 = ((JTextField)m.jTextField_date_6_in.getDateEditor().getUiComponent()).getText();
            String date_7 = ((JTextField)m.jTextField_date_7_in.getDateEditor().getUiComponent()).getText();
            out.println(date2);out.println(date3);out.println(date5);out.println(date6);out.println(date_7);
            String rsed1 = m.jTextField_rsed_1.getText();
            String rsed2 = m.jTextField_rsed_2.getText();
            String rsed3 = m.jTextField_rsed_3.getText();
            String rsed5 = m.jTextField_rsed_5.getText();
            String rsed6 = m.jTextField_rsed_6.getText();
            String rsed7 = m.jTextField_rsed_7.getText();
            String siana_1 = m.jTextField_siana_1.getText();
            String siana_2 = m.jTextField_siana_2.getText();
            String siana_3 = m.jTextField_siana_3.getText();
            String siana_5 = m.jTextField_siana_5.getText();
            String siana_6 = m.jTextField_siana_6.getText();
            String siana_7 = m.jTextField_siana_7.getText();
            out.println(rsed1);out.println(rsed2);out.println(rsed3);out.println(rsed5);out.println(rsed6);out.println(rsed7);
            // out.println(siana_1);out.println(siana_2);out.println(siana_3);out.println(siana_5);out.println(siana_6);out.println(siana_7);
            String elb2e_siana = m.jTextField_total_elb2e_siana.getText();
            String hints = m.jTextField_hints.getText();
            String nezam_eldf3 = m.jTextField_nezam_eldf3.getText();
            String date_el2st = ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).getText();
            String elba2e = m.jTextField_elba2e.getText();
            String id_elfne = m.jTextField_id_elfne.getText();
            String name_elfne = m.jTextField_name_elfne.getText();
            String phone_elfne = m.jTextField_phone_elfne.getText();
            String places = m.jTextField_places.getText();
            String id_elmndob = m.jTextField_id_elmndob.getText();
            String name_elmndob = m.jTextField_name_elmndob.getText();
            String phone_elmndob = m.jTextField_phone_elmndob.getText();
            String date_regist = ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).getText();
            String clas = m.jTextField_class.getText();
            String trkeb_dead_line=((JTextField)m.jTextField_trkeb_dead_line.getDateEditor().getUiComponent()).getText();
            String date_remake_class=((JTextField)m.jTextField_date_remake_class.getDateEditor().getUiComponent()).getText();
            String num_month_class=m.jTextField_num_month_class.getText();
            String elmosthdaf=m.jTextField_elmosthdaf.getText();
            String id_elmndob_elwaset = m.jTextField_id_elmndob_elwaset.getText();
            String name_elmndob_elwaset = m.jTextField_name_elmndob_elwaset.getText();
            String phone_elmndob_elwaset = m.jTextField_phone_elmndob_elwaset.getText();
            out.println(hints);out.println(nezam_eldf3);out.println(date_el2st);out.println(elba2e);out.println(name_elfne);out.println(id_elfne);out.println(phone_elfne);
            out.println(places);out.println(name_elmndob);out.println(id_elmndob);out.println(phone_elmndob);out.println(date_regist);out.println(clas);out.println(elb2e_siana);
            out.println(siana_1);out.println(siana_2);out.println(siana_3);out.println(siana_5);out.println(siana_6);out.println(siana_7);
            out.println(name_elmndob_elwaset);out.println(id_elmndob_elwaset);out.println(phone_elmndob_elwaset);out.println(trkeb_dead_line);
            out.println(num_month_class);out.println(date_remake_class);out.println(elmosthdaf);
            //        out.println(hints);out.println(nezam_eldf3);out.println(date_el2st);out.println(elba2e);out.println(id_elfne);
            //        out.println(name_elfne);out.println(phone_elfne);out.println(places);out.println(id_elmndob);out.println(name_elmndob);
            //        out.println(phone_elmndob);out.println(date_regist);out.println(all_quantity);out.println(trkeb_dead_line);out.println(date_remake_class);
            //        out.println(num_month_class);out.println(elmosthdaf);out.println(id_elmndob_elwaset);out.println(name_elmndob_elwaset);out.println(phone_elmndob_elwaset);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }
    
    void clear_textS()
    {
          m.jTextField_id_client.setText("");
        m.jTextField_name_client.setText("");
        m.jTextField_job.setText("");
        m.jTextField_home_num.setText("");
        m.jTextField_street.setText("");
        m.jTextField_region.setText("");
        m.jTextField_phone.setText("");
        m.jTextField_country.setText("");
        m.jTextField_id_product.setText("");
        m.jTextField_name_product.setText("");
        m.jTextField_type.setText("");
        m.jTextField_price_product.setText("");
        m.jTextField_elmkdm.setText("");
        m.jTextField_el2st.setText("");
        m.jTextField_quantity.setText("");
        ((JTextField) m.jTextField_dte_buy.getDateEditor().getUiComponent()).setText("");
        ((JTextField)m.jTextField_date1.getDateEditor().getUiComponent()).setText("");

        ((JTextField)m.jTextField_date_2.getDateEditor().getUiComponent()).setText("");
        ((JTextField)m.jTextField_date_3.getDateEditor().getUiComponent()).setText("");
        ((JTextField)m.jTextField_date_5.getDateEditor().getUiComponent()).setText("");
        ((JTextField)m.jTextField_date_6_in.getDateEditor().getUiComponent()).setText("");
        ((JTextField)m.jTextField_date_7_in.getDateEditor().getUiComponent()).setText("");

        ((JTextField)m.jTextField_trkeb_dead_line.getDateEditor().getUiComponent()).setText("");

        m.jTextField_hints.setText("");
        m.jTextField_nezam_eldf3.setText("");
        ((JTextField)m.jTextField_date_el2st.getDateEditor().getUiComponent()).setText("");
        m.jTextField_elba2e.setText("");
        m.jTextField_id_elfne.setText("");
        m.jTextField_name_elfne.setText("");
        m.jTextField_phone_elfne.setText("");
        m.jTextField_places.setText("");
        m.jTextField_id_elmndob.setText("");
        m.jTextField_name_elmndob.setText("");
        m.jTextField_phone_elmndob.setText("");
        ((JTextField)m.jTextField_date_regist.getDateEditor().getUiComponent()).setText("");
        m.jTextField_all_quantity.setText("");
        m.jTextField_class.setText("");
        // m.jTextField_total_elb2e_siana.setText("");
        ((JTextField)m.jTextField_date_remake_class.getDateEditor().getUiComponent()).setText("");
        // m.jTextField_num_month_class.setText("");
        //  m.jTextField_elmosthdaf.setText("");

        m.jTextField_id_elmndob_elwaset.setText("");
        m.jTextField_name_elmndob_elwaset.setText("");
        m.jTextField_phone_elmndob_elwaset.setText("");

        m.jTextField_id_client.setBackground(Color.white);
        m.jTextField_name_client.setBackground(Color.white);
        m.jTextField_job.setBackground(Color.white);
        m.jTextField_home_num.setBackground(Color.white);
        m.jTextField_street.setBackground(Color.white);
        m.jTextField_region.setBackground(Color.white);
        m.jTextField_phone.setBackground(Color.white);
        m.jTextField_country.setBackground(Color.white);
        m.jTextField_id_product.setBackground(Color.white);
        m.jTextField_name_product.setBackground(Color.white);
        m.jTextField_type.setBackground(Color.white);
        m.jTextField_price_product.setBackground(Color.white);
        m.jTextField_elmkdm.setBackground(Color.white);
        m.jTextField_el2st.setBackground(Color.white);
        m.jTextField_quantity.setBackground(Color.white);
        m.jTextField_dte_buy.setBackground(Color.white);
        m.jTextField_dte_buy.setBackground(Color.white);
        m.jTextField_date1.setBackground(Color.white);
        m.jTextField_date_2.setBackground(Color.white);
        m.jTextField_date_3.setBackground(Color.white);
        m.jTextField_date_5.setBackground(Color.white);
        m.jTextField_date_6_in.setBackground(Color.white);
        m.jTextField_date_7_in.setBackground(Color.white);
        m.jTextField_rsed_1.setBackground(Color.white);
        m.jTextField_rsed_2.setBackground(Color.white);
        m.jTextField_rsed_3.setBackground(Color.white);
        m.jTextField_rsed_5.setBackground(Color.white);
        m.jTextField_rsed_6.setBackground(Color.white);
        m.jTextField_rsed_7.setBackground(Color.white);
        m.jTextField_hints.setBackground(Color.white);
        m.jTextField_nezam_eldf3.setBackground(Color.white);
        m.jTextField_date_el2st.setBackground(Color.white);
        m.jTextField_elba2e.setBackground(Color.white);
        m.jTextField_id_elfne.setBackground(Color.white);
        m.jTextField_name_elfne.setBackground(Color.white);
        m.jTextField_phone_elfne.setBackground(Color.white);
        m.jTextField_places.setBackground(Color.white);
        m.jTextField_id_elmndob.setBackground(Color.white);
        m.jTextField_name_elmndob.setBackground(Color.white);
        m.jTextField_phone_elmndob.setBackground(Color.white);
        m.jTextField_id_elmndob_elwaset.setBackground(Color.white);
        m.jTextField_name_elmndob_elwaset.setBackground(Color.white);
        m.jTextField_phone_elmndob_elwaset.setBackground(Color.white);
        m.jTextField_date_regist.setBackground(Color.white);
        m.jTextField_all_quantity.setBackground(Color.white);
        m.jTextField_class.setBackground(Color.white);
        m.jTextField_total_elb2e_siana.setBackground(Color.white);
        m.jTextField_trkeb_dead_line.setBackground(Color.white);
        m.jTextField_date_remake_class.setBackground(Color.white);
        m.jTextField_num_month_class.setBackground(Color.white);
        m.jTextField_elmosthdaf.setBackground(Color.white);
        m.jTextField_date_regist.setBackground(Color.white);
    }
    void search_client_insert()
{
    
        String text = m.jTextField_name_client.getText();

        m.model_client_insert.setRowCount(0);

        try {

            ResultSet rs = m.ob.search_client(text);

            while (rs.next()) {
                String id_client = String.valueOf(rs.getString("id_client"));
                String name_client = rs.getString("name_client");
                String job = rs.getString("job");

                String phone = String.valueOf(rs.getString("phone"));

                m.model_client_insert.addRow(new Object[]{id_client, name_client, job, phone});

            }

            m.model_canceled.setRowCount(0);

            m.ob.stmt=m.ob.conn.createStatement();
            ResultSet rs_can=m.ob.stmt.executeQuery("select * from canceled_table where name_client like '"+text+"%'");
            while (rs_can.next())
            {
               m. model_canceled.addRow(new Object[]
                    {
                        rs_can.getString(1) ,
                        rs_can.getString(2) ,
                        rs_can.getString(3) ,

                        rs_can.getString(4) ,
                        rs_can.getString(5) ,
                         rs_can.getString(6)
                               

                    });
                }

            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    
    void search_region_insert()
{
      try {
            
            m.model_region.setRowCount(0);
            String text=m.jTextField_region.getText();

            m.ob.stmt=m.ob.conn.createStatement();
            ResultSet rs_can=m.ob.stmt.executeQuery("select * from countries where region like '%"+text+"%'");
            while (rs_can.next())
            {
                m.model_region.addRow(new Object[]
                    {
                        rs_can.getString(1) ,
                        rs_can.getString(2) ,

                    });
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    
    void search_product_insert()
{
      m.model_product_insert.setRowCount(0);
String text = m.jTextField_name_product.getText();
        try {

            ResultSet rs = m.ob.search_product(text);

            while (rs.next()) {
                String id_product = String.valueOf(rs.getString("id_product"));
                String name_product = rs.getString("name_product");
                String type = String.valueOf(rs.getString("type"));
                String price = String.valueOf(rs.getString("price"));
                String elmokdm = String.valueOf(rs.getString("elmokdm"));
                String el2st = String.valueOf(rs.getString("el2st"));
                String quantity = String.valueOf(rs.getString("quantity"));

                m.model_product_insert.addRow(new Object[]{id_product, name_product, type, price,
                    elmokdm, el2st, quantity});

        }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);

        }
}

    void search_elmndob_insert()
{
    String text = m.jTextField_name_elmndob.getText();

       m. model_elmndob_insert.setRowCount(0);

        try {

            ResultSet rs = m.ob.search_elmndob(text);

            while (rs.next()) {
                String id_elmndob = String.valueOf(rs.getString("id_elmndob"));
                String name_elmndob = rs.getString("name_elmndob");
                String phone = String.valueOf(rs.getString("phone"));
                m.model_elmndob_insert.addRow(new Object[]{id_elmndob, name_elmndob, phone});

            }

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    
 void search_elfne_insert()
{
     String text = m.jTextField_name_elfne.getText();
        System.out.println();
        m.model_elfne_insert.setRowCount(0);

        try {

            ResultSet rs = m.ob.search_elfne(text);

            while (rs.next()) {
                String id_elfne = String.valueOf(rs.getString("id_elfne"));
                String name_elfne = rs.getString("name_elfne");
                String phone = String.valueOf(rs.getString("phone"));
                String places = rs.getString("places");
                m.model_elfne_insert.addRow(new Object[]{id_elfne, name_elfne, phone, places});

            }

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
}   
    
    
  void search_elmndob_elwaset_insert()
{
     if (m.jCheckBox_elwset.isSelected())
        {
           m. model_client_insert.setRowCount(0);

            try {
                String text = m.jTextField_name_elmndob_elwaset.getText();
                ResultSet rs = m.ob.search_client(text);

                while (rs.next()) {
                    String id_client = String.valueOf(rs.getString("id_client"));
                    String name_client = rs.getString("name_client");
                    String job = rs.getString("job");

                    String phone = String.valueOf(rs.getString("phone"));
                    System.out.println(phone);

                    System.out.println(phone);
                    m.model_client_insert.addRow(new Object[]{id_client, name_client, job, phone});
                }

            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
          
            String text = m.jTextField_name_elmndob_elwaset.getText();

           m. model_elmndob_elwaset_insert.setRowCount(0);

            try {

                ResultSet rs = m.ob.search_elmndob_elwaset(text);

                while (rs.next()) {
                    String id_elmndob = String.valueOf(rs.getString("id_elmndob_elwaset"));
                    String name_elmndob = rs.getString("name_elmndob_elwaset");
                    String phone = String.valueOf(rs.getString("telephone"));
                    m.model_elmndob_elwaset_insert.addRow(new Object[]{id_elmndob, name_elmndob, phone});
                   // System.out.println("id_elmn_wa : "+id_elmndob);
                }

            } catch (SQLException ex) {
               
            }
        }
}  
    
    
    
    void delete_client_from_canceled_table()
    {
         int x=m.jTable_canceled.getSelectedRow();
        if (x!=-1)
        {
            int ch=JOptionPane.showConfirmDialog(null, "هل تريد حذف العميل ؟") ;
            if (ch==0)
            {
                try {
                    m.ob.stmt.executeUpdate("delete from canceled_table where id_client="+(String.valueOf(m.model_canceled.getValueAt(x, 0))));
                    m.model_canceled.removeRow(x);
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
    
    
    void set_action_labels(String flag)
    {
        m.jLabel_clients.setName(flag);
        m.jLabel_installation.setName(flag);
        m.jLabel_servising.setName(flag);
        m.jLabel_add_wrong.setName(flag);
        m.jLabel_wrongs_2.setName(flag);
        m.jLabel_new_servising.setName(flag);
        m.jLabel_users.setName(flag);
        m.jLabel_payments.setName(flag);
        m.jLabel_database.setName(flag);
        m.jLabel_company_reports.setName(flag);
        m.jLabel_client_reports.setName(flag);
        m.jLabel_emp_reports.setName(flag);
        m.jLabel_sectors.setName(flag);
       

        
    }
    
    void set_action_pansels(String flag)
    {
      m.jLabel_current_user.setName(flag);
      m.jLabel_wrongs.setName(flag);
      m.jLabel_reports.setName(flag);
    }
    
    void set_action_label_condition(String condition , String flag)
    {
        if (m.jLabel_clients.getName().equals(condition)) m.jLabel_clients.setName(flag);
        if (m.jLabel_installation.getName().equals(condition)) m.jLabel_installation.setName(flag);
        if (m.jLabel_servising.getName().equals(condition))m.jLabel_servising.setName(flag);
        if (m.jLabel_add_wrong.getName().equals(condition))m.jLabel_add_wrong.setName(flag);
        if (m.jLabel_wrongs_2.getName().equals(condition))m.jLabel_wrongs_2.setName(flag);
        if (m.jLabel_new_servising.getName().equals(condition))m.jLabel_new_servising.setName(flag);
        if (m.jLabel_users.getName().equals(condition))m.jLabel_users.setName(flag);
        if (m.jLabel_payments.getName().equals(condition))m.jLabel_payments.setName(flag);
        if (m.jLabel_database.getName().equals(condition))m.jLabel_database.setName(flag);
        if (m.jLabel_company_reports.getName().equals(condition))m.jLabel_company_reports.setName(flag);
        if (m.jLabel_client_reports.getName().equals(condition))m.jLabel_client_reports.setName(flag);
        if (m.jLabel_emp_reports.getName().equals(condition))m.jLabel_emp_reports.setName(flag);
        if (m.jLabel_sectors.getName().equals(condition))m.jLabel_sectors.setName(flag);
      
    }
    
}


/* text align http://stackoverflow.com/questions/7493369/jtable-right-align-header*/
/* oriantation rtl http://stackoverflow.com/questions/11069372/arranging-jtable-columns-from-right-to-left*/
/*font header http://stackoverflow.com/questions/4408644/how-can-i-change-the-font-of-a-jtables-header
  grid line http://stackoverflow.com/questions/14300580/java-jtable-not-showing-gridlines
background of jtable http://stackoverflow.com/questions/11606852/change-background-color-of-jtable
horizontal alignment http://stackoverflow.com/questions/2408541/align-the-values-of-the-cells-in-jtable
header http://stackoverflow.com/questions/11686535/how-to-change-jtable-header-height
*/
//class HeaderRenderer implements TableCellRenderer {
//
//  DefaultTableCellRenderer renderer;  
//  JTableHeader header ;
//    public HeaderRenderer(JTable table ,Font font) {
//        header = table.getTableHeader();
//        header.setPreferredSize(new Dimension(header.getWidth(),30));
//        header.setBackground(new Color(234, 183, 55));
//        header.setForeground(new Color(80, 80, 80));
//        header .setFont(font.deriveFont(16f));
//        
//        table.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//         table.setShowGrid(true);
//        // table.setBackground(Color.red);
//         table.setGridColor(new Color(234, 183, 55));
//         table.setRowHeight(25);
//         table.setFont(font.deriveFont(14f));
//     
//         
//         
//        
//        table.setOpaque(true);
//        table.setFillsViewportHeight(true);
//       
//        table.setBackground(new Color(216, 215, 184));
//        table.getTableHeader().setBackground(new Color(216, 215, 184));
//    
//       
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
//        for (int i = 0; i < table.getColumnCount(); i++) {
//            table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
//        }
//         
//        
//        renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
//        renderer.setHorizontalAlignment(JLabel.CENTER);
//        
//        
//    }
//
//    @Override
//    public Component getTableCellRendererComponent(
//        JTable table, Object value, boolean isSelected,
//        boolean hasFocus, int row, int col) {
//        return renderer.getTableCellRendererComponent(
//            table, value, isSelected, hasFocus, row, col);
//    }
//
//   
//}
//http://stackoverflow.com/questions/16620353/how-to-remove-set-jtextarea-border-in-jtable-cell-in-nimbus-look-and-feel
// https://www.youtube.com/watch?v=60utT_e-oak
class MultiLineTableCellRenderer extends JTextArea 
implements TableCellRenderer {
/**
 * 
 */
private static final long serialVersionUID = 1L;
private List<List<Integer>> rowColHeight = new ArrayList<List<Integer>>();
Font font ;
public MultiLineTableCellRenderer(JTable table ,Font font) {
    
    
    this.font=font ;
  setLineWrap(true);
  setWrapStyleWord(true);
  setOpaque(true);
  
  JTableHeader header ;
      header = table.getTableHeader();
        header.setPreferredSize(new Dimension(header.getWidth(),30));
        //https://community.oracle.com/thread/1352240?start=0&tstart=0
        header.setBackground(new java.awt.Color(234, 183, 55));  
        header.setForeground(new java.awt.Color(72, 72, 72));
        header .setFont(font.deriveFont(14f));
       DefaultTableCellRenderer renderer;  
         renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        
        table.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         table.setShowGrid(true);
        // table.setBackground(Color.red);
         table.setGridColor(new Color(234, 183, 55));
         table.setRowHeight(25);
        
          table.setBackground(new Color(216, 215, 184));
        
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
       
        
        table.getTableHeader().setBackground(new Color(216, 215, 184));
        
        
            setFont(font.deriveFont(14f));
         setBackground(new Color(216, 215, 184));
         setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       //  http://stackoverflow.com/questions/17188117/i-would-like-to-add-a-right-padding-to-a-jtable-column-is-it-possible
         setBorder(BorderFactory.createEmptyBorder(3, 5, 0, 5));
}

@Override
public Component getTableCellRendererComponent(
    JTable table, Object value, boolean isSelected, boolean hasFocus,
    int row, int column) {
    

       
         
     
        
//    
//       
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
//        for (int i = 0; i < table.getColumnCount(); i++) {
//            table.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
//        }
       if (isSelected) {
    setForeground(table.getSelectionForeground());
    setBackground(table.getSelectionBackground());
  } else {
    setForeground(table.getForeground());
    setBackground(table.getBackground());
  }  
        
  if (value != null) {
    setText(value.toString());
  } else {
    setText("");
  }
  adjustRowHeight(table, row, column);
  return this;
}

/**
 * Calculate the new preferred height for a given row, and sets the height on the table.
 */
private void adjustRowHeight(JTable table, int row, int column) {
  //The trick to get this to work properly is to set the width of the column to the 
  //textarea. The reason for this is that getPreferredSize(), without a width tries 
  //to place all the text in one line. By setting the size with the with of the column, 
  //getPreferredSize() returnes the proper height which the row should have in
  //order to make room for the text.
    
  int cWidth = table.getTableHeader().getColumnModel().getColumn(column).getWidth();
  setSize(new Dimension(cWidth, 1000));
  
  int prefH = getPreferredSize().height;
  
  while (rowColHeight.size() <= row) {
    rowColHeight.add(new ArrayList<Integer>(column));
  }
  List<Integer> colHeights = rowColHeight.get(row);
  while (colHeights.size() <= column) {
    colHeights.add(0);
  }
  colHeights.set(column, prefH);
  int maxH = prefH;
  for (Integer colHeight : colHeights) {
    if (colHeight > maxH) {
      maxH = colHeight;
    }
  }
  if (table.getRowHeight(row) != maxH)
  {
    table.setRowHeight(row, maxH+5);
     
  }
    
}

}