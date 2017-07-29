/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
///// old //////
package el7iah2;

//import com.sun.org.apache.bcel.internal.generic.GOTO;
import static el7iah2.connection.stmt;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.geom.Dimension2D;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import sun.java2d.pipe.RenderBuffer;
//import sun.security.util.BigInt;

/**
 *
 * @author ashraf
 */


//class elfne{
//        String id_elfne ;
//        String name_elfne ;
//        String phone_elfne ;
//        String places_elfne ;
//
//        public elfne(String id_elfne , String name_elfne , String phone_elfne , String places_elfne) {
//            this.id_elfne=id_elfne;this.name_elfne=name_elfne;
//            this.phone_elfne=phone_elfne;this.places_elfne=places_elfne;
//        }
//        
//    }
public class main extends javax.swing.JFrame {
    
    /**
     * Creates new form main
     */
    
    
//   public List<elfne>  elfne_list=new ArrayList<>();
    
    
    
    
    
    
    
    hr h ;
    connection ob = new connection();
   
    
   

    
    
    DefaultTableModel model_client_insert;
    DefaultTableModel model_product_insert;
    DefaultTableModel model_client_insert1;
    DefaultTableModel model_product_insert1;
    DefaultTableModel model_elfne_insert;
    DefaultTableModel model_elmndob_insert;
    DefaultTableModel model_elmndob_elwaset_insert;
    DefaultTableModel model_trkeb;
    DefaultTableModel model_trkeb_archive_done;
    DefaultTableModel model_trkeb_archive_not_done;
    DefaultTableModel model_trkeb_help;
    DefaultTableModel model_elfne_trkeb;
    DefaultTableModel model_siana;
    DefaultTableModel model_siana_help;
    DefaultTableModel model_add_3otl;
    DefaultTableModel model_trkeb1;
    DefaultTableModel model_mdene;
    DefaultTableModel model_product_insert2;
    DefaultTableModel model_fatorh_siana1;
    DefaultTableModel model_mdenen_el2st;
    DefaultTableModel model_mdenen_el2st_help;
    DefaultTableModel model_details;
    DefaultTableModel model_mdenen_all_el2st;
    DefaultTableModel model_masrofat;
    DefaultTableModel model_elfne_sianat;
    DefaultTableModel model_elmo7sl1;
    DefaultTableModel model_hints;
    DefaultTableModel model_hints_trkeb;
    DefaultTableModel model_canceled;
    DefaultTableModel model_region;
     DefaultTableModel model_siana_dmg;
      DefaultTableModel model_siana_dmg_reject;
     DefaultTableModel model_country_trkeb;
     DefaultTableModel model_country_siana;
    
    boolean flag_insert_client = true;
    boolean flag_insert_product = true;
    boolean flag_insert_elfne = true;
    boolean flag_insert_elmndob = true;
    boolean flag_insert_elmndob_elwaset=true ;
    boolean flag_insert_elfne_trkeb = true;
    int flag_3otl_siana = 0;
    boolean flag_siana_or_part = false;
    boolean flag_tok3_quantity = false;
    boolean flag_insert_mdenen = true;
    boolean flag_insert_region = true;
    boolean flag_trkeb_siana=true ;
    
    String quantity_eltok3 = "0";
    boolean flag_insert_elfne_sianat = true;
    CardLayout homeCard;
    CardLayout mainCard;
    Font   font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/fonts/Hacen Saudi Arabia.ttf").openStream());
    public int width, height;
    action_panel_add_client add_client;
    action_panel_trkeb trkeb ;
    action_panel_elsiiana elsiana ;
    int gap=0 ;
  
    public main(hr h) throws FontFormatException, IOException{
    
       
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         width = (int) screenSize.getWidth();
         height = (int) screenSize.getHeight();
         if (height>768){gap=height-768;}
     
 
     
        initComponents();    this.h=h ; 
    
        
      
        
      
    //    http://stackoverflow.com/questions/852631/java-swing-how-to-show-a-panel-on-top-of-another-panel
        jlayeredpane.add(jScrollPane45, new Integer(0), 0);
        jlayeredpane.add(jPanel_add_trkeb, new Integer(1), 0);
         jlayeredpane.add(jPanel34, new Integer(2), 0);

        jLayeredPane1.add(jScrollPane37, new Integer(0), 0);
        jLayeredPane1.add(jPanel11, new Integer(1), 0);
        jLayeredPane1.add(jPanel_classes, new Integer(2), 0);
        jLayeredPane1.add(jPanel26, new Integer(3), 0);
        
         jLayeredPane2.add(jScrollPane36, new Integer(0), 0);
        jLayeredPane2.add(jPanel22, new Integer(1), 0);

        jScrollPane37.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            // setResizable(false);
        opened_add_client=jPanel9;
        opened_main_screen=jPanel_background ;
       
           
            font = font.deriveFont(16f);
            jLabel_exit.setFont(font);
            jLabel_clients.setFont(font);
            jLabel_installation.setFont(font);
            jLabel_servising.setFont(font);
            jLabel_new_servising.setFont(font);
            jLabel_database.setFont(font);
            jLabel_users.setFont(font);
            jLabel_client_reports.setFont(font);
            jLabel_payments.setFont(font);
            jLabel_wrongs.setFont(font);
            jLabel_reports.setFont(font);
            jLabel_client_reports.setFont(font);
            jLabel_emp_reports.setFont(font);
            jLabel_company_reports.setFont(font);
            jLabel_sectors.setFont(font);
            jLabel_add_wrong.setFont(font);
            jLabel_wrongs_2.setFont(font);
            jLabel_change_passwordn.setFont(font);
            jCheckBox_autosave.setFont(font);
      

         //http://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel
       jLabel_back.setSize(width, height-100);
                    BufferedImage img = null;
                  
                 
                  try {
                 img = ImageIO.read(getClass().getResource("/ph/icons/customer-service-image-on-blackboard.jpg"));
             } catch (IOException e) {
                 e.printStackTrace();
             }
      // BufferedImage dimg =img.getScaledInstance(jLabel_back.getWidth(), jLabel_back.getHeight(),
      //  Image.SCALE_SMOOTH) ;
         ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(jLabel_back.getWidth(), jLabel_back.getHeight(),
        Image.SCALE_SMOOTH));
         jLabel_back.setIcon(imageIcon);
         
         
        jPanel_background.setSize(jPanel_background.getWidth(),height);
        jPanel_add_client.setSize(jPanel_background.getWidth(),0);
        jPanel_trkeb.setSize(jPanel_background.getWidth(),0);
        jPanel_elsiana_1.setSize(jPanel_background.getWidth(),0);
        jPanel_add_3otl.setSize(jPanel_background.getWidth(),0);
        jPanel9.setSize(jPanel9.getWidth(),height);
       
        jPanel_client_table.setVisible(true);
        jPanel_product_table.setVisible(false);
        jPanel_elfne_table.setVisible(false);
        jPanel_elmndob_table.setVisible(false);
        jPanel_elmndob_elwaset.setVisible(false);
        jPanel_region_table.setVisible(false);
        jTextField_search_siana2.setToolTipText("يرجي ادخال تاريخ اقل من او يساوي تاريخ التسجيل");
       
       
       
        jComboBox_client_hints.setToolTipText("عرض ملاحظات العميل بشكل رأسي حيث يتم الفصل بين الملاحظات ب #");
        
        ((JTextField)jTextField_date_el2st.getDateEditor().getUiComponent()).setText("0001-01-01");
         jTextField_trkeb_dead_line.setEnabled(false);
        //    elsiana.comp();

//jDialog1.setSize(200,200);

            
     
     

      

      
      
       
      
       
            
            
            
            
            
            
            
            
            
            
        model_client_insert = (DefaultTableModel) jTable_clients_insert.getModel();
        model_product_insert = (DefaultTableModel) jTable_product_insert1.getModel();
        


        model_elfne_insert = (DefaultTableModel) jTable_elfne_insert.getModel();
        model_elmndob_insert = (DefaultTableModel) jTable_elmndob_insert.getModel();
        model_elmndob_elwaset_insert = (DefaultTableModel) jTable_elmndob_elwaset__insert.getModel();
        model_trkeb = (DefaultTableModel) jTable_trkeb.getModel();
        model_trkeb_archive_done = (DefaultTableModel) jTable_trkeb_archive_done.getModel();
        model_trkeb_archive_not_done= (DefaultTableModel) jTable_trkeb_archive_not_done.getModel();
        model_trkeb_help = (DefaultTableModel) jTable_trkeb_help.getModel();
        model_elfne_trkeb = (DefaultTableModel) jTable_elfne_trkeb.getModel();
        model_siana = (DefaultTableModel) jTable_siana.getModel();
        model_siana_help = (DefaultTableModel) jTable_siana_help.getModel();
        model_add_3otl = (DefaultTableModel) jTable_add_3otl.getModel();
        model_canceled = (DefaultTableModel) jTable_canceled.getModel();
        model_region = (DefaultTableModel) jTable_region.getModel();
        model_hints=(DefaultTableModel) jTable_hints.getModel();
        model_hints_trkeb=(DefaultTableModel) jTable_hints1.getModel();
        model_elfne_sianat=(DefaultTableModel) jTable_elmo7sl.getModel();
        model_siana_dmg=(DefaultTableModel) jTable_siana_help_dmg.getModel();
        model_siana_dmg_reject=(DefaultTableModel) jTable_siana_help_dmg_reject.getModel();
        model_country_trkeb=(DefaultTableModel) jTable_country_trkeb.getModel();
         model_country_siana=(DefaultTableModel) jTable_country_trkeb1.getModel();
       
        jTextField_date_regist.setEnabled(false);
        jTextField_place_trkeb.setEditable(false);
       jTextField_places_elfne_sianat.setEditable(false);
       jTextField_places.setEditable(false);
     
        jDialog1.setSize(215, 260);
//        jDialog2.setSize(235,660);
         setExtendedState(MAXIMIZED_BOTH);
        jTextField_search_siana2.setVisible(false);

        jTextField_class.setEditable(false);
        homeCard = (CardLayout) jPanel8.getLayout();
         
        homeCard.show(jPanel8, "card_client");
       
        
        
        jLabel_com3_0.setVisible(true);
        jTextField_search_siana1.setVisible(true);
        jTextField_search_siana2.setVisible(false);
        jLabel_com_3_1.setVisible(false);
        jTextField_search_siana3.setVisible(false);
        jLabel_com_3_2.setVisible(false);
       
        
    }
 void init_objects()
 {
     add_client=new action_panel_add_client(this);
     trkeb=new action_panel_trkeb(this);
     elsiana=new action_panel_elsiiana(this);
   
 }

void add_hr_panels()
{ 
      
        jScrollPane47.add(h.jPanel_co_rep); 
        h.jPanel_co_rep.setSize(1700, 0);
        h.jPanel_co_rep.setLocation(0, 100);
        
        jScrollPane47.add(h.update_panel); 
        h.update_panel.setSize(1700, 0);
        h.update_panel.setLocation(0, 100);
        
        jScrollPane47.add(h.jPanel_login); 
        h.jPanel_login.setSize(250, height);
        h.jPanel_login.setLocation(800, 100);
      
        jScrollPane47.add(h.ekta3at); 
        h.ekta3at.setSize(jPanel_background.getWidth(), 0);
        h.ekta3at.setLocation(0, 100);
        
        jScrollPane47.add(h.jPanel_cl_rep); 
        h.jPanel_cl_rep.setSize(jPanel_background.getWidth(), 0);
        h.jPanel_cl_rep.setLocation(0, 100);
        
        jScrollPane47.add(h.jPanel_elfne); 
        h.jPanel_elfne.setSize(jPanel_background.getWidth(), 0);
        h.jPanel_elfne.setLocation(0, 100);
       
       jLayeredPane3.add(jPanel_background, new Integer(0), 0);
   
       jLayeredPane3.add(h.jPanel_login, new Integer(1), 0);
       jLayeredPane3.add(h.jPanel_elfne, new Integer(2), 0);
       jLayeredPane3.add(h.ekta3at, new Integer(3), 0);
       jLayeredPane3.add(h.update_panel, new Integer(4), 0);
       jLayeredPane3.add(h.jPanel_cl_rep, new Integer(5), 0);
       jLayeredPane3.add(h.jPanel_co_rep, new Integer(6), 0);
       jLayeredPane3.add(jPanel_add_client, new Integer(7), 0);
       jLayeredPane3.add(jPanel_add_trkeb, new Integer(8), 0);
       jLayeredPane3.add(jPanel_add_3otl, new Integer(9), 0);
       jLayeredPane3.add(jPanel_elsiana_1, new Integer(10), 0);
       
           jLayeredPane3.add(jPanel_drop_reports, new Integer(11), 0);
       jLayeredPane3.add(jPanel_drop_reports1, new Integer(12), 0);
       jLayeredPane3.add(jPanel_drop_reports2, new Integer(12), 0); 
     
}
 

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel_drop_reports2 = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        الشركه2 = new javax.swing.JSeparator();
        jLabel_change_passwordn = new javax.swing.JLabel();
        jCheckBox_autosave = new javax.swing.JCheckBox();
        الشركه3 = new javax.swing.JSeparator();
        jCheckBox_animate = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel_current_user = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel_installation_notify = new javax.swing.JLabel();
        jLabel_new_servising_notify = new javax.swing.JLabel();
        jLabel_wrong_notify = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_clients = new javax.swing.JLabel();
        jLabel_installation = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_servising = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_wrongs = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel_payments = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel_new_servising = new javax.swing.JLabel();
        jLabel_database = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel_users = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel_reports = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel_drop_reports = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        الشركه = new javax.swing.JSeparator();
        jLabel_client_reports = new javax.swing.JLabel();
        jLabel_company_reports = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel_emp_reports = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel_sectors = new javax.swing.JLabel();
        jPanel_drop_reports1 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        الشركه1 = new javax.swing.JSeparator();
        jLabel_add_wrong = new javax.swing.JLabel();
        jLabel_wrongs_2 = new javax.swing.JLabel();
        jPanel_background = new javax.swing.JPanel();
        jLabel_back = new javax.swing.JLabel();
        jPanel_trkeb = new javax.swing.JPanel();
        jlayeredpane = new javax.swing.JLayeredPane();
        jPanel_add_trkeb = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable_country_trkeb = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_elfne_trkeb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_name_elfne_trkeb = new javax.swing.JTextField();
        jLabel_name_client_trkeb = new javax.swing.JLabel();
        jTextField_id_elfne_trkeb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_place_trkeb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_phone_elfne_trkeb = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField_elba2e_trkeb = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField_date_trkeb = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jTextField_price_trkeb = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel_siaa_gdeda_dates = new javax.swing.JPanel();
        jLabel_id_client121 = new javax.swing.JLabel();
        jTextField_ns_d1 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client129 = new javax.swing.JLabel();
        jTextField_ns_d2 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client130 = new javax.swing.JLabel();
        jTextField_ns_d3 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client131 = new javax.swing.JLabel();
        jTextField_ns_d5 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client132 = new javax.swing.JLabel();
        jTextField_ns_d6 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client133 = new javax.swing.JLabel();
        jTextField_ns_d7 = new com.toedter.calendar.JDateChooser();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea_new_servising_done = new javax.swing.JTextArea();
        jLabel_id_client134 = new javax.swing.JLabel();
        jLabel_com_3_1 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTable_trkeb = new javax.swing.JTable(){
            public Component prepareRenderer(TableCellRenderer r , int rw , int col)
            {Component c=super.prepareRenderer( r, rw, col);
                try {

                    // c.setBackground(Color.WHITE);
                    String time_now=ob.time_now();
                    if (model_trkeb.getValueAt(rw, 30)!=null && String.valueOf(model_trkeb.getValueAt(rw, 30)).length()!=0)
                    {
                        c.setBackground(Color.GREEN);
                    }
                    //if (String.valueOf(model_trkeb.getValueAt(rw, 13)).contains("~"))
                    //            {
                        //                c.setBackground(Color.GREEN);
                        //            }
                    else if (ob.time_compare(String.valueOf(model_trkeb.getValueAt(rw, 23)),time_now ))

                    {
                        c.setBackground(Color.pink);
                    }
                    else if (String.valueOf(model_trkeb.getValueAt(rw, 23)).equals( time_now))
                    {
                        c.setBackground(Color.ORANGE);
                    }
                    else if (String.valueOf(model_trkeb.getValueAt(rw, 23)).equals( ob.time(time_now,1)))
                    {
                        c.setBackground(Color.yellow);
                    }

                    else
                    {
                        c.setBackground(Color.WHITE);
                    }
                }catch (Exception e){}

                return  c ;
            }
        };
        jTextField_search_siana1 = new javax.swing.JTextField();
        jLabel_count = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel_com3_0 = new javax.swing.JLabel();
        jTextField_search_siana2 = new com.toedter.calendar.JDateChooser();
        jLabel_search_trkeb = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable_hints1 = new javax.swing.JTable();
        jLabel_com_3_2 = new javax.swing.JLabel();
        jTextField_search_siana3 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel_delete_trkeb = new javax.swing.JLabel();
        jLabel_order_table_trkeb = new javax.swing.JLabel();
        jLabel_print_trkeb = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane50 = new javax.swing.JScrollPane();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTable_trkeb_archive_not_done = new javax.swing.JTable();
        jScrollPane52 = new javax.swing.JScrollPane();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTable_trkeb_archive_done = new javax.swing.JTable();
        jLabel_counter_trkeb_archive_not = new javax.swing.JLabel();
        jLabel_counter_trkeb_archive_done = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jComboBox_elfne_trkeb = new javax.swing.JComboBox();
        jCheckBox_current_table_trkeb = new javax.swing.JCheckBox();
        jLabel99 = new javax.swing.JLabel();
        jPanel_elsiana_1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_elmo7sl = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable_country_trkeb1 = new javax.swing.JTable();
        jLabel_name_elmo7sl = new javax.swing.JLabel();
        jLabel_telephone_elmo7sl = new javax.swing.JLabel();
        jTextField_name_elfne_sianat = new javax.swing.JTextField();
        jTextField_phone_elfne_sianat = new javax.swing.JTextField();
        jLabel_places_elmo7sl = new javax.swing.JLabel();
        jTextField_places_elfne_sianat = new javax.swing.JTextField();
        jLabel_id_elmo7sl = new javax.swing.JLabel();
        jTextField_id_elfne_sianat = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField_real_date_siana = new com.toedter.calendar.JDateChooser();
        jTextField_price_elsiana = new javax.swing.JTextField();
        jLabel_el2st_elsiana8 = new javax.swing.JLabel();
        jLabel_el2st_elsiana9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel_fatorh_siana_panel = new javax.swing.JPanel();
        jLabel_el2st_elsiana10 = new javax.swing.JLabel();
        jTextField_nsbt_el2mlah_before_elsiana = new javax.swing.JTextField();
        jTextField_nsbt_el2mlah_after_elsiana = new javax.swing.JTextField();
        jComboBox_type_elsiana = new javax.swing.JComboBox();
        jLabel_el2st_elsiana11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField_money_for_elb2e_elsianat = new javax.swing.JTextField();
        jCheckBox_elb2e_siana = new javax.swing.JCheckBox();
        jLabel_el2st_elsiana6 = new javax.swing.JLabel();
        jTextField_real_date_siana1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel_el2st_elsiana7 = new javax.swing.JLabel();
        jTextField_real_date_siana2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel_name_client_siana = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel_classes = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTable_siana = new javax.swing.JTable(){

            public Component prepareRenderer(TableCellRenderer r , int rw , int col)
            {String time_now=ob.time_now();
                Component c=super.prepareRenderer( r, rw, col);

                try
                {
                    if (model_siana.getValueAt(rw, 47)!=null&&String.valueOf(model_siana.getValueAt(rw, 47)).length()!=0)
                    {

                        c.setBackground(Color.green);

                    }
                    else
                    //            if (String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana()))c.setBackground(Color.GREEN);
                    //            else
                    {
                        if (flag_3otl_siana==0)
                        {
                            //                    if (String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana(0))||String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana(1)))
                            //                    {
                                //                        c.setBackground(Color.GREEN);
                                //                    }
                            //                    else
                            if (model_siana.getValueAt(rw, 17)!=null)
                            {
                                if (String.valueOf(model_siana.getValueAt(rw, 17)).length()!=0)
                                {
                                    c.setBackground(Color.pink);
                                }
                            }

                        }
                        else  if (flag_3otl_siana==1)
                        {

                            //                    if (String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana(0))||String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana(1)))
                            //                    {
                                //                        c.setBackground(Color.GREEN);
                                //                    }
                            //                    else
                            if (ob.time_compare(String.valueOf(model_siana.getValueAt(rw, 19)),
                                time_now)==true)

                        {
                            c.setBackground(Color.pink);
                        }
                        else if (
                            String.valueOf(model_siana.getValueAt(rw, 19)).equals(time_now))

                        {
                            c.setBackground(Color.ORANGE);
                        }
                        else if (
                            String.valueOf(model_siana.getValueAt(rw, 19)).equals(ob.time(time_now, 1)))

                        {
                            c.setBackground(Color.yellow);
                        }
                        else
                        {
                            c.setBackground(Color.WHITE);
                        }
                    }
                    //            else
                    //            {
                        //                if (String.valueOf(model_siana.getValueAt(rw, 4)).contains("~"+elsiana.get_pattern_siana(flag_3otl_siana)))
                        //                {
                            //                    c.setBackground(Color.GREEN);
                            //                }
                        //            }
                }
            }catch (Exception e){}

            return  c ;
        }};
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable_hints = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel_count_siana = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jComboBox_client_hints = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel_n = new javax.swing.JLabel();
        jTextField_n_p = new javax.swing.JTextField();
        jLabel_country = new javax.swing.JLabel();
        jTextField_two_n_p = new javax.swing.JTextField();
        jLabel_st = new javax.swing.JLabel();
        jTextField_st = new com.toedter.calendar.JDateChooser();
        jLabel_en = new javax.swing.JLabel();
        jTextField_en = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTable_siana_help_dmg = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTable_siana_help_dmg_reject = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel_counter_siana_archive_done = new javax.swing.JLabel();
        jLabel_counter_siana_archive_not = new javax.swing.JLabel();
        jCheckBox_current_table = new javax.swing.JCheckBox();
        jLabel90 = new javax.swing.JLabel();
        jComboBox_elnfe_siana = new javax.swing.JComboBox();
        jPanel_perioud_siana = new javax.swing.JPanel();
        jLabel_st1 = new javax.swing.JLabel();
        jTextField_submit_start = new com.toedter.calendar.JDateChooser();
        jLabel_en1 = new javax.swing.JLabel();
        jTextField_submit_end = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel_add_3otl = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel_id_client43 = new javax.swing.JLabel();
        jTextField_date_el3otl = new com.toedter.calendar.JDateChooser();
        jLabel_id_client42 = new javax.swing.JLabel();
        jTextField_date_end_line_el3otl = new com.toedter.calendar.JDateChooser();
        jPanel21 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel_id_client41 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jTextField_name_client_add_3otl = new javax.swing.JTextField();
        jScrollPane36 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable_add_3otl = new javax.swing.JTable();
        jLabel78 = new javax.swing.JLabel();
        jPanel_add_client = new javax.swing.JPanel();
        jLabel_add = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel_elmndob_table = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_elmndob_insert = new javax.swing.JTable();
        jPanel_product_table = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_product_insert1 = new javax.swing.JTable();
        jPanel_region_table = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable_region = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox_elwset1 = new javax.swing.JCheckBox();
        jPanel_elfne_table = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_elfne_insert = new javax.swing.JTable();
        jPanel_client_table = new javax.swing.JPanel();
        jCheckBox_elwset = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clients_insert = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable_canceled = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel_elmndob_elwaset = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_elmndob_elwaset__insert = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel_add_client_b1 = new javax.swing.JLabel();
        jLabel_add_client_b2 = new javax.swing.JLabel();
        jLabel_add_client_b3 = new javax.swing.JLabel();
        jLabel_add_client_b4 = new javax.swing.JLabel();
        jLabel_add_client_b5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField_xls = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel_add_client_p1 = new javax.swing.JPanel();
        jLabel_client_name = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_name_client = new javax.swing.JTextField();
        jLabel_id_client = new javax.swing.JLabel();
        jTextField_id_client = new javax.swing.JTextField();
        max_id_client = new javax.swing.JLabel();
        jLabel_id_client2 = new javax.swing.JLabel();
        jTextField_job = new javax.swing.JTextField();
        jLabel_id_client11 = new javax.swing.JLabel();
        jTextField_home_num = new javax.swing.JTextField();
        jLabel_id_client4 = new javax.swing.JLabel();
        jTextField_street = new javax.swing.JTextField();
        jLabel_id_client5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField_region = new javax.swing.JTextField();
        jTextField_country = new javax.swing.JTextField();
        jTextField_phone = new javax.swing.JTextField();
        jLabel_id_client6 = new javax.swing.JLabel();
        jLabel_id_client7 = new javax.swing.JLabel();
        jPanel_add_client_p2 = new javax.swing.JPanel();
        jLabel_id_client13 = new javax.swing.JLabel();
        jTextField_price_product = new javax.swing.JTextField();
        jLabel_id_client14 = new javax.swing.JLabel();
        jTextField_elmkdm = new javax.swing.JTextField();
        jTextField_el2st = new javax.swing.JTextField();
        jLabel_id_client15 = new javax.swing.JLabel();
        jLabel_id_client104 = new javax.swing.JLabel();
        jTextField_all_quantity = new javax.swing.JTextField();
        jLabel_id_client16 = new javax.swing.JLabel();
        jTextField_quantity = new javax.swing.JTextField();
        jLabel_id_client9 = new javax.swing.JLabel();
        max_id_product = new javax.swing.JLabel();
        jTextField_id_product = new javax.swing.JTextField();
        jLabel_id_client8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField_name_product = new javax.swing.JTextField();
        jLabel_id_client10 = new javax.swing.JLabel();
        jTextField_type = new javax.swing.JTextField();
        jPanel_add_client_p3 = new javax.swing.JPanel();
        jLabel_id_client21 = new javax.swing.JLabel();
        jTextField_date_7_in = new com.toedter.calendar.JDateChooser();
        jLabel_id_client57 = new javax.swing.JLabel();
        jTextField_rsed_1 = new javax.swing.JTextField();
        jLabel_id_client56 = new javax.swing.JLabel();
        jTextField_date_6_in = new com.toedter.calendar.JDateChooser();
        jTextField_date_5 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client20 = new javax.swing.JLabel();
        jTextField_date_3 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client55 = new javax.swing.JLabel();
        jTextField_date_2 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client19 = new javax.swing.JLabel();
        jTextField_date1 = new com.toedter.calendar.JDateChooser();
        jLabel_id_client18 = new javax.swing.JLabel();
        jTextField_dte_buy = new com.toedter.calendar.JDateChooser();
        jLabel_id_client17 = new javax.swing.JLabel();
        jPanel_add_client_p4 = new javax.swing.JPanel();
        jTextField_date_el2st = new com.toedter.calendar.JDateChooser();
        jLabel_id_client26 = new javax.swing.JLabel();
        jTextField_nezam_eldf3 = new javax.swing.JTextField();
        jLabel_id_client25 = new javax.swing.JLabel();
        jTextField_hints = new javax.swing.JTextField();
        jLabel_id_client24 = new javax.swing.JLabel();
        jTextField_rsed_7 = new javax.swing.JTextField();
        jLabel_id_client61 = new javax.swing.JLabel();
        jTextField_rsed_6 = new javax.swing.JTextField();
        jLabel_id_client60 = new javax.swing.JLabel();
        jTextField_rsed_5 = new javax.swing.JTextField();
        jLabel_id_client62 = new javax.swing.JLabel();
        jTextField_rsed_3 = new javax.swing.JTextField();
        jLabel_id_client59 = new javax.swing.JLabel();
        jTextField_rsed_2 = new javax.swing.JTextField();
        jLabel_id_client58 = new javax.swing.JLabel();
        jPanel_add_client_p5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_phone_elmndob = new javax.swing.JTextField();
        jLabel_id_client32 = new javax.swing.JLabel();
        jTextField_id_elmndob = new javax.swing.JTextField();
        jLabel_id_client35 = new javax.swing.JLabel();
        max_id_elmndob = new javax.swing.JLabel();
        jTextField_name_elmndob = new javax.swing.JTextField();
        jLabel_id_client28 = new javax.swing.JLabel();
        jTextField_places = new javax.swing.JTextField();
        jLabel_id_client31 = new javax.swing.JLabel();
        jTextField_phone_elfne = new javax.swing.JTextField();
        jLabel_id_client30 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_name_elfne = new javax.swing.JTextField();
        jLabel_id_client22 = new javax.swing.JLabel();
        jTextField_id_elfne = new javax.swing.JTextField();
        max_id_elfne = new javax.swing.JLabel();
        jLabel_id_client23 = new javax.swing.JLabel();
        jLabel_id_client27 = new javax.swing.JLabel();
        jTextField_elba2e = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jPanel_Add_client_p6 = new javax.swing.JPanel();
        jTextField_siana_6 = new javax.swing.JTextField();
        jLabel_id_client231 = new javax.swing.JLabel();
        jTextField_siana_5 = new javax.swing.JTextField();
        jLabel_id_client230 = new javax.swing.JLabel();
        jTextField_siana_3 = new javax.swing.JTextField();
        jLabel_id_client229 = new javax.swing.JLabel();
        jTextField_siana_2 = new javax.swing.JTextField();
        jLabel_id_client228 = new javax.swing.JLabel();
        jTextField_siana_1 = new javax.swing.JTextField();
        jLabel_id_client227 = new javax.swing.JLabel();
        jTextField_total_elb2e_siana = new javax.swing.JTextField();
        jTextField_class = new javax.swing.JTextField();
        jLabel_id_client63 = new javax.swing.JLabel();
        jComboBox_class_add_client = new javax.swing.JComboBox();
        jTextField_date_regist = new com.toedter.calendar.JDateChooser();
        jLabel_id_client33 = new javax.swing.JLabel();
        jLabel_id_client64 = new javax.swing.JLabel();
        jPanel_add_client_p7 = new javax.swing.JPanel();
        jLabel_ss2 = new javax.swing.JLabel();
        jTextField_elmosthdaf = new javax.swing.JTextField();
        jTextField_date_remake_class = new com.toedter.calendar.JDateChooser();
        jLabel_ss = new javax.swing.JLabel();
        jTextField_num_month_class = new javax.swing.JTextField();
        jLabel_ss1 = new javax.swing.JLabel();
        jTextField_trkeb_dead_line = new com.toedter.calendar.JDateChooser();
        jLabel_id_client29 = new javax.swing.JLabel();
        jTextField_phone_elmndob_elwaset = new javax.swing.JTextField();
        jLabel_id_client37 = new javax.swing.JLabel();
        jTextField_id_elmndob_elwaset = new javax.swing.JTextField();
        jLabel_id_client34 = new javax.swing.JLabel();
        max_id_elmndob_elwaset = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField_name_elmndob_elwaset = new javax.swing.JTextField();
        jLabel_id_client36 = new javax.swing.JLabel();
        jTextField_siana_7 = new javax.swing.JTextField();
        jLabel_id_client232 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel_add_client_b7 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel_add_client_b6 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel_help = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable_siana_help = new javax.swing.JTable(){
            public Component prepareRenderer(TableCellRenderer r , int rw , int col)
            {String time_now=ob.time_now();
                Component c=super.prepareRenderer( r, rw, col);

                try
                {

                    if (flag_3otl_siana==1)
                    {

                        if (ob.time_compare(String.valueOf(model_siana.getValueAt(rw, 19)),
                            time_now)==true)

                    {
                        c.setBackground(Color.pink);
                    }
                    else if (
                        String.valueOf(model_siana.getValueAt(rw, 19)).equals(time_now))

                    {
                        c.setBackground(Color.ORANGE);
                    }
                    else if (
                        String.valueOf(model_siana.getValueAt(rw, 19)).equals(ob.time(time_now, 1)))

                    {
                        c.setBackground(Color.yellow);
                    }
                    else
                    {
                        c.setBackground(Color.WHITE);
                    }
                }
                else
                {
                    c.setBackground(Color.WHITE);
                }

            }catch (Exception e){}

            return  c ;
        }
    };
    jScrollPane49 = new javax.swing.JScrollPane();
    jTable_trkeb_help = new javax.swing.JTable(){
        public Component prepareRenderer(TableCellRenderer r , int rw , int col)
        {Component c=super.prepareRenderer( r, rw, col);
            try {

                // c.setBackground(Color.WHITE);
                String time_now=ob.time_now();
                if (ob.time_compare(String.valueOf(model_trkeb.getValueAt(rw, 23)),time_now ))

                {
                    c.setBackground(Color.pink);
                }
                else if (String.valueOf(model_trkeb.getValueAt(rw, 23)).equals( time_now))
                {
                    c.setBackground(Color.ORANGE);
                }
                else if (String.valueOf(model_trkeb.getValueAt(rw, 23)).equals( ob.time(time_now,1)))
                {
                    c.setBackground(Color.yellow);
                }
                else
                {
                    c.setBackground(Color.WHITE);
                }
            }catch (Exception e){}

            return  c ;
        }
    };

    jDialog1.setSize(351, 177);
    jDialog1.getContentPane().setLayout(null);

    jPanel30.setBackground(new java.awt.Color(255, 255, 255));
    jPanel30.setLayout(null);

    jLabel7.setFont(font.deriveFont(12f)
    );
    jLabel7.setForeground(new java.awt.Color(72, 72, 72));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("كلمة السر القديمة");
    jPanel30.add(jLabel7);
    jLabel7.setBounds(29, 11, 150, 14);

    jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel30.add(jPasswordField1);
    jPasswordField1.setBounds(10, 36, 180, 30);

    jLabel8.setFont(font.deriveFont(12f)
    );
    jLabel8.setForeground(new java.awt.Color(72, 72, 72));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("كلمة السر الجديدة");
    jPanel30.add(jLabel8);
    jLabel8.setBounds(29, 84, 150, 14);

    jPasswordField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel30.add(jPasswordField2);
    jPasswordField2.setBounds(10, 109, 180, 31);

    jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/repeat-48.png"))); // NOI18N
    jLabel83.setToolTipText("تغير كلمه السر");
    jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel83MouseReleased(evt);
        }
    });
    jPanel30.add(jLabel83);
    jLabel83.setBounds(10, 160, 48, 53);

    jDialog1.getContentPane().add(jPanel30);
    jPanel30.setBounds(0, 0, 200, 220);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(0, 51, 204));
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
            formWindowClosing(evt);
        }
    });
    getContentPane().setLayout(null);

    jScrollPane47.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPane47.setPreferredSize(new java.awt.Dimension(3200, 2800));
    jScrollPane47.setRequestFocusEnabled(false);
    jScrollPane47.setLayout(null);

    jLayeredPane3.setBackground(new java.awt.Color(72, 72, 72));
    jLayeredPane3.setOpaque(true);

    jPanel_drop_reports2.setBackground(new java.awt.Color(72, 72, 72));
    jPanel_drop_reports2.setLayout(null);
    jPanel_drop_reports2.add(jSeparator14);
    jSeparator14.setBounds(0, 0, 170, 10);
    jPanel_drop_reports2.add(الشركه2);
    الشركه2.setBounds(10, 80, 150, 10);

    jLabel_change_passwordn.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_change_passwordn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_change_passwordn.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_change_passwordn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_change_passwordn.setText("تغير كلمه المرور");
    jLabel_change_passwordn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_change_passwordnMouseReleased(evt);
        }
    });
    jPanel_drop_reports2.add(jLabel_change_passwordn);
    jLabel_change_passwordn.setBounds(20, 10, 130, 22);

    jCheckBox_autosave.setForeground(new java.awt.Color(255, 255, 255));
    jCheckBox_autosave.setSelected(true);
    jCheckBox_autosave.setText("حفظ تلقائي");
    jCheckBox_autosave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jCheckBox_autosave.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jCheckBox_autosaveMouseReleased(evt);
        }
    });
    jPanel_drop_reports2.add(jCheckBox_autosave);
    jCheckBox_autosave.setBounds(20, 50, 130, 23);
    jPanel_drop_reports2.add(الشركه3);
    الشركه3.setBounds(10, 40, 150, 20);

    jCheckBox_animate.setFont(font.deriveFont(16f)
    );
    jCheckBox_animate.setForeground(new java.awt.Color(255, 255, 255));
    jCheckBox_animate.setText("الحركه");
    jCheckBox_animate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jCheckBox_animate.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jCheckBox_animateMouseReleased(evt);
        }
    });
    jPanel_drop_reports2.add(jCheckBox_animate);
    jCheckBox_animate.setBounds(20, 90, 130, 23);

    jLayeredPane3.add(jPanel_drop_reports2);
    jPanel_drop_reports2.setBounds(970, 40, 170, 0);

    jPanel13.setBackground(new java.awt.Color(74, 74, 74));

    jPanel16.setBackground(new java.awt.Color(192, 64, 65));
    jPanel16.setPreferredSize(new java.awt.Dimension(81, 30));
    jPanel16.setRequestFocusEnabled(false);
    jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel16MouseReleased(evt);
        }
    });

    jLabel_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel_exit.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel_exit.setText("خروج");

    jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/exit.png"))); // NOI18N

    javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
    jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel_exit)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel16Layout.setVerticalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
            .addContainerGap(12, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    jLabel_current_user.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
    jLabel_current_user.setForeground(new java.awt.Color(234, 183, 55));
    jLabel_current_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/userSeek.png"))); // NOI18N
    jLabel_current_user.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_current_userMouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(884, 884, 884)
            .addComponent(jLabel_current_user, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(1132, Short.MAX_VALUE))
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        .addComponent(jLabel_current_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jLayeredPane3.add(jPanel13);
    jPanel13.setBounds(0, 0, 2320, 40);
    jPanel13.setSize(width,40);

    jPanel23.setBackground(new java.awt.Color(234, 183, 55));
    jPanel23.setLayout(null);

    jLabel_installation_notify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel_installation_notify.setForeground(new java.awt.Color(255, 0, 0));
    jLabel_installation_notify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel_installation_notify.setText("+9");
    jPanel23.add(jLabel_installation_notify);
    jLabel_installation_notify.setBounds(982, 19, 30, 30);

    jLabel_new_servising_notify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel_new_servising_notify.setForeground(new java.awt.Color(255, 0, 0));
    jLabel_new_servising_notify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel_new_servising_notify.setText("+9");
    jPanel23.add(jLabel_new_servising_notify);
    jLabel_new_servising_notify.setBounds(523, 19, 30, 30);

    jLabel_wrong_notify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel_wrong_notify.setForeground(new java.awt.Color(255, 0, 0));
    jLabel_wrong_notify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel_wrong_notify.setText("+9");
    jPanel23.add(jLabel_wrong_notify);
    jLabel_wrong_notify.setBounds(788, 19, 30, 30);

    jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/home.png"))); // NOI18N
    jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel34MouseReleased(evt);
        }
    });
    jPanel23.add(jLabel34);
    jLabel34.setBounds(1173, 11, 22, 38);

    jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator1);
    jSeparator1.setBounds(1161, 12, 2, 38);

    jLabel_clients.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_clients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_clients.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_clients.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_clients.setText("العملاء");
    jLabel_clients.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_clientsMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_clients);
    jLabel_clients.setBounds(1099, 21, 50, 22);
    jLabel_clients.getAccessibleContext().setAccessibleName("");

    jLabel_installation.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_installation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_installation.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_installation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_installation.setText("التركيبات");
    jLabel_installation.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_installationMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_installation);
    jLabel_installation.setBounds(1000, 20, 80, 22);
    jLabel_installation.getAccessibleContext().setAccessibleName("");

    jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator2);
    jSeparator2.setBounds(1090, 10, 10, 38);

    jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator3);
    jSeparator3.setBounds(970, 10, 20, 38);

    jLabel_servising.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_servising.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_servising.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_servising.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_servising.setText("الصيانات");
    jLabel_servising.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_servisingMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_servising);
    jLabel_servising.setBounds(880, 20, 80, 22);
    jLabel_servising.getAccessibleContext().setAccessibleName("");

    jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator4);
    jSeparator4.setBounds(890, 10, 20, 38);

    jLabel_wrongs.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_wrongs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_wrongs.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_wrongs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_wrongs.setText("الأعطال");
    jLabel_wrongs.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_wrongsMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_wrongs);
    jLabel_wrongs.setBounds(820, 20, 56, 22);
    jLabel_wrongs.getAccessibleContext().setAccessibleName("");

    jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator5);
    jSeparator5.setBounds(774, 10, 20, 38);

    jLabel_payments.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_payments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_payments.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_payments.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_payments.setText("الأقساط");
    jLabel_payments.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_paymentsMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_payments);
    jLabel_payments.setBounds(705, 20, 58, 22);
    jLabel_payments.getAccessibleContext().setAccessibleName("");

    jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator6);
    jSeparator6.setBounds(690, 10, 20, 38);

    jLabel_new_servising.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_new_servising.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_new_servising.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_new_servising.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_new_servising.setText("الصايانات الجديده");
    jLabel_new_servising.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_new_servisingMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_new_servising);
    jLabel_new_servising.setBounds(556, 20, 123, 22);
    jLabel_new_servising.getAccessibleContext().setAccessibleName("");

    jLabel_database.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_database.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_database.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_database.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_database.setText("قواعد البيانات");
    jLabel_database.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_databaseMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_database);
    jLabel_database.setBounds(390, 20, 110, 22);
    jLabel_database.getAccessibleContext().setAccessibleName("");

    jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator7);
    jSeparator7.setBounds(510, 10, 20, 38);

    jLabel_users.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_users.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_users.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_users.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_users.setText("المستخدمين");
    jLabel_users.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_usersMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_users);
    jLabel_users.setBounds(280, 20, 96, 22);
    jLabel_users.getAccessibleContext().setAccessibleName("");

    jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator8);
    jSeparator8.setBounds(390, 10, 20, 38);

    jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
    jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
    jPanel23.add(jSeparator9);
    jSeparator9.setBounds(268, 10, 20, 38);

    jLabel_reports.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_reports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_reports.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_reports.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_reports.setText("التقارير");
    jLabel_reports.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_reportsMouseReleased(evt);
        }
    });
    jPanel23.add(jLabel_reports);
    jLabel_reports.setBounds(209, 20, 49, 22);

    jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/notify.png"))); // NOI18N
    jPanel23.add(jLabel30);
    jLabel30.setBounds(980, 20, 30, 30);

    jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/notify.png"))); // NOI18N
    jPanel23.add(jLabel35);
    jLabel35.setBounds(785, 20, 30, 30);

    jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/notify.png"))); // NOI18N
    jPanel23.add(jLabel36);
    jLabel36.setBounds(520, 20, 30, 30);

    jPanel25.setBackground(new java.awt.Color(227, 60, 67));

    javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
    jPanel25.setLayout(jPanel25Layout);
    jPanel25Layout.setHorizontalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 28, Short.MAX_VALUE)
    );
    jPanel25Layout.setVerticalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 4, Short.MAX_VALUE)
    );

    jPanel23.add(jPanel25);
    jPanel25.setBounds(1172, 56, 28, 4);

    jLayeredPane3.add(jPanel23);
    jPanel23.setBounds(0, 40, 2320, 60);
    jPanel23.setSize(width,60);

    jPanel_drop_reports.setBackground(new java.awt.Color(234, 183, 55));
    jPanel_drop_reports.setLayout(null);
    jPanel_drop_reports.add(jSeparator10);
    jSeparator10.setBounds(0, 0, 170, 10);
    jPanel_drop_reports.add(الشركه);
    الشركه.setBounds(10, 40, 150, 20);

    jLabel_client_reports.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_client_reports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_client_reports.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_client_reports.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_client_reports.setText("العميل");
    jLabel_client_reports.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_client_reportsMouseReleased(evt);
        }
    });
    jPanel_drop_reports.add(jLabel_client_reports);
    jLabel_client_reports.setBounds(20, 10, 130, 22);
    jLabel_client_reports.getAccessibleContext().setAccessibleName("");

    jLabel_company_reports.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_company_reports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_company_reports.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_company_reports.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_company_reports.setText("الشركة");
    jLabel_company_reports.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_company_reportsMouseReleased(evt);
        }
    });
    jPanel_drop_reports.add(jLabel_company_reports);
    jLabel_company_reports.setBounds(18, 50, 130, 22);
    jPanel_drop_reports.add(jSeparator12);
    jSeparator12.setBounds(10, 80, 150, 20);

    jLabel_emp_reports.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_emp_reports.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_emp_reports.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_emp_reports.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_emp_reports.setText("الموظفين");
    jLabel_emp_reports.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_emp_reportsMouseReleased(evt);
        }
    });
    jPanel_drop_reports.add(jLabel_emp_reports);
    jLabel_emp_reports.setBounds(20, 90, 130, 22);
    jPanel_drop_reports.add(jSeparator13);
    jSeparator13.setBounds(0, 130, 170, 10);

    jLabel_sectors.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_sectors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_sectors.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_sectors.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_sectors.setText("القطاعات");
    jLabel_sectors.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_sectorsMouseReleased(evt);
        }
    });
    jPanel_drop_reports.add(jLabel_sectors);
    jLabel_sectors.setBounds(10, 140, 140, 22);

    jLayeredPane3.add(jPanel_drop_reports);
    jPanel_drop_reports.setBounds(100, 99, 170, 0);

    jPanel_drop_reports1.setBackground(new java.awt.Color(234, 183, 55));
    jPanel_drop_reports1.setLayout(null);
    jPanel_drop_reports1.add(jSeparator11);
    jSeparator11.setBounds(0, 0, 170, 10);
    jPanel_drop_reports1.add(الشركه1);
    الشركه1.setBounds(10, 40, 130, 20);

    jLabel_add_wrong.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_add_wrong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_add_wrong.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_add_wrong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_add_wrong.setText("اضافه عطل");
    jLabel_add_wrong.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_wrongMouseReleased(evt);
        }
    });
    jPanel_drop_reports1.add(jLabel_add_wrong);
    jLabel_add_wrong.setBounds(40, 10, 100, 22);

    jLabel_wrongs_2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_wrongs_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_wrongs_2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel_wrongs_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_wrongs_2.setText("الأعطال");
    jLabel_wrongs_2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_wrongs_2MouseReleased(evt);
        }
    });
    jPanel_drop_reports1.add(jLabel_wrongs_2);
    jLabel_wrongs_2.setBounds(30, 50, 100, 22);

    jLayeredPane3.add(jPanel_drop_reports1);
    jPanel_drop_reports1.setBounds(740, 99, 150, 0);

    jPanel_background.setBackground(new java.awt.Color(153, 153, 153));
    jPanel_background.setLayout(null);
    jPanel_background.add(jLabel_back);
    jLabel_back.setBounds(0, 0, 2280, 1790);

    jLayeredPane3.add(jPanel_background);
    jPanel_background.setBounds(0, 100, 3200, 2600);

    jPanel_trkeb.setLayout(null);

    jlayeredpane.setBackground(new java.awt.Color(255, 255, 255));
    jlayeredpane.setForeground(new java.awt.Color(255, 255, 255));
    jlayeredpane.setOpaque(true);

    jPanel_add_trkeb.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(234, 183, 55), null));
    jPanel_add_trkeb.setLayout(null);

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel5MouseReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jLabel5);
    jLabel5.setBounds(390, 290, 24, 30);

    jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jPanel_add_trkeb.add(jLabel48);
    jLabel48.setBounds(580, 90, 24, 30);

    jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField2KeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField2);
    jTextField2.setBounds(570, 90, 150, 30);

    jTable_country_trkeb.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null},
            {null},
            {null},
            {null}
        },
        new String [] {
            "المحافظه"
        }
    ));
    jTable_country_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_country_trkebMouseReleased(evt);
        }
    });
    jScrollPane15.setViewportView(jTable_country_trkeb);

    jPanel_add_trkeb.add(jScrollPane15);
    jScrollPane15.setBounds(570, 120, 150, 120);

    jTable_elfne_trkeb.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "كود الفني ", "اسم الفني", "تليفون الفني", "الأماكن"
        }
    ));
    jTable_elfne_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_elfne_trkebMouseReleased(evt);
        }
    });
    jScrollPane6.setViewportView(jTable_elfne_trkeb);

    jPanel_add_trkeb.add(jScrollPane6);
    jScrollPane6.setBounds(10, 90, 550, 150);

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(font.deriveFont(14f)
    );
    jLabel1.setForeground(new java.awt.Color(72, 72, 72));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("اسم الفني ");
    jPanel_add_trkeb.add(jLabel1);
    jLabel1.setBounds(610, 290, 90, 32);

    jTextField_name_elfne_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_elfne_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_elfne_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_elfne_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_name_elfne_trkeb);
    jTextField_name_elfne_trkeb.setBounds(380, 290, 220, 32);

    jLabel_name_client_trkeb.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_name_client_trkeb.setFont(font.deriveFont(14f)
    );
    jLabel_name_client_trkeb.setForeground(new java.awt.Color(0, 173, 239));
    jLabel_name_client_trkeb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jPanel_add_trkeb.add(jLabel_name_client_trkeb);
    jLabel_name_client_trkeb.setBounds(240, 30, 180, 32);

    jTextField_id_elfne_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_elfne_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_elfne_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_elfne_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_id_elfne_trkeb);
    jTextField_id_elfne_trkeb.setBounds(380, 250, 220, 32);

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setFont(font.deriveFont(14f)
    );
    jLabel4.setForeground(new java.awt.Color(72, 72, 72));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("الاماكن ");
    jPanel_add_trkeb.add(jLabel4);
    jLabel4.setBounds(610, 370, 90, 32);

    jTextField_place_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_place_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_place_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_place_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_place_trkeb);
    jTextField_place_trkeb.setBounds(380, 370, 220, 32);

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(font.deriveFont(14f)
    );
    jLabel3.setForeground(new java.awt.Color(72, 72, 72));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("تليفون الفني ");
    jPanel_add_trkeb.add(jLabel3);
    jLabel3.setBounds(610, 330, 90, 30);

    jTextField_phone_elfne_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_phone_elfne_trkeb.setAutoscrolls(false);
    jTextField_phone_elfne_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone_elfne_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phone_elfne_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_phone_elfne_trkeb);
    jTextField_phone_elfne_trkeb.setBounds(380, 330, 220, 30);

    jLabel26.setBackground(new java.awt.Color(255, 255, 255));
    jLabel26.setFont(font.deriveFont(14f)
    );
    jLabel26.setForeground(new java.awt.Color(72, 72, 72));
    jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel26.setText("الباقي");
    jPanel_add_trkeb.add(jLabel26);
    jLabel26.setBounds(270, 250, 90, 32);

    jTextField_elba2e_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_elba2e_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_elba2e_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_elba2e_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_elba2e_trkeb);
    jTextField_elba2e_trkeb.setBounds(50, 250, 210, 32);

    jLabel24.setBackground(new java.awt.Color(255, 255, 255));
    jLabel24.setFont(font.deriveFont(14f)
    );
    jLabel24.setForeground(new java.awt.Color(72, 72, 72));
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel24.setText("التاريخ");
    jPanel_add_trkeb.add(jLabel24);
    jLabel24.setBounds(270, 330, 90, 32);

    jTextField_date_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_trkeb.setDateFormatString("yyyy-MM-dd");
    jPanel_add_trkeb.add(jTextField_date_trkeb);
    jTextField_date_trkeb.setBounds(50, 330, 210, 32);

    jLabel31.setBackground(new java.awt.Color(255, 255, 255));
    jLabel31.setFont(font.deriveFont(14f)
    );
    jLabel31.setForeground(new java.awt.Color(72, 72, 72));
    jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel31.setText("اجمالي الفاتوره");
    jPanel_add_trkeb.add(jLabel31);
    jLabel31.setBounds(270, 290, 90, 32);

    jTextField_price_trkeb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_price_trkeb.setText("0");
    jTextField_price_trkeb.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_price_trkeb.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_price_trkebKeyReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jTextField_price_trkeb);
    jTextField_price_trkeb.setBounds(50, 290, 210, 32);
    jPanel_add_trkeb.add(jLabel49);
    jLabel49.setBounds(50, 340, 0, 0);

    jPanel19.setBackground(new java.awt.Color(0, 173, 239));
    jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel19MouseReleased(evt);
        }
    });

    jLabel50.setFont(font.deriveFont(14f)
    );
    jLabel50.setForeground(new java.awt.Color(255, 255, 255));
    jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel50.setText("ادخال عميل");

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(55, Short.MAX_VALUE))
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel_add_trkeb.add(jPanel19);
    jPanel19.setBounds(40, 380, 230, 50);

    jLabel52.setBackground(new java.awt.Color(255, 255, 255));
    jLabel52.setFont(font.deriveFont(14f)
    );
    jLabel52.setForeground(new java.awt.Color(72, 72, 72));
    jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel52.setText("كود الفني ");
    jPanel_add_trkeb.add(jLabel52);
    jLabel52.setBounds(610, 250, 90, 32);

    jLabel53.setBackground(new java.awt.Color(255, 255, 255));
    jLabel53.setFont(font.deriveFont(14f)
    );
    jLabel53.setForeground(new java.awt.Color(72, 72, 72));
    jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel53.setText("العميل :-");
    jPanel_add_trkeb.add(jLabel53);
    jLabel53.setBounds(420, 30, 80, 32);

    jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/clear.png"))); // NOI18N
    jLabel88.setToolTipText("مسح الأماكن");
    jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel88MouseReleased(evt);
        }
    });
    jPanel_add_trkeb.add(jLabel88);
    jLabel88.setBounds(350, 370, 30, 30);

    jPanel_siaa_gdeda_dates.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_siaa_gdeda_dates.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_siaa_gdeda_dates.setForeground(new java.awt.Color(255, 255, 255));
    jPanel_siaa_gdeda_dates.setLayout(null);

    jLabel_id_client121.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client121.setFont(font.deriveFont(12f)
    );
    jLabel_id_client121.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client121.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client121.setText("تاريخ الشمعه 1");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client121);
    jLabel_id_client121.setBounds(550, 10, 120, 30);

    jTextField_ns_d1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d1.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d1.setFocusTraversalPolicyProvider(true);
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d1);
    jTextField_ns_d1.setBounds(350, 10, 220, 30);

    jLabel_id_client129.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client129.setFont(font.deriveFont(12f)
    );
    jLabel_id_client129.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client129.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client129.setText("تاريخ الشمعه 2");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client129);
    jLabel_id_client129.setBounds(550, 50, 120, 30);

    jTextField_ns_d2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d2.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d2.setFocusTraversalPolicyProvider(true);
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d2);
    jTextField_ns_d2.setBounds(350, 50, 220, 30);

    jLabel_id_client130.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client130.setFont(font.deriveFont(12f)
    );
    jLabel_id_client130.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client130.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client130.setText("تاريخ الشمعه 3");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client130);
    jLabel_id_client130.setBounds(550, 90, 120, 30);

    jTextField_ns_d3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d3.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d3.setFocusTraversalPolicyProvider(true);
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d3);
    jTextField_ns_d3.setBounds(350, 90, 220, 30);

    jLabel_id_client131.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client131.setFont(font.deriveFont(12f)
    );
    jLabel_id_client131.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client131.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client131.setText("تاريخ الشمعه 5");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client131);
    jLabel_id_client131.setBounds(550, 130, 120, 30);

    jTextField_ns_d5.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d5.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d5.setFocusTraversalPolicyProvider(true);
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d5);
    jTextField_ns_d5.setBounds(350, 130, 220, 30);

    jLabel_id_client132.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client132.setFont(font.deriveFont(12f)
    );
    jLabel_id_client132.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client132.setText("تاريخ الشمعه 6");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client132);
    jLabel_id_client132.setBounds(230, 20, 120, 20);

    jTextField_ns_d6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d6.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d6.setFocusTraversalPolicyProvider(true);
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d6);
    jTextField_ns_d6.setBounds(20, 10, 210, 30);

    jLabel_id_client133.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client133.setFont(font.deriveFont(12f)
    );
    jLabel_id_client133.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client133.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client133.setText("ما تم");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client133);
    jLabel_id_client133.setBounds(230, 90, 120, 30);

    jTextField_ns_d7.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_ns_d7.setDateFormatString("yyyy-MM-dd");
    jTextField_ns_d7.setFocusTraversalPolicyProvider(true);
    jTextField_ns_d7.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_ns_d7KeyReleased(evt);
        }
    });
    jPanel_siaa_gdeda_dates.add(jTextField_ns_d7);
    jTextField_ns_d7.setBounds(20, 50, 210, 30);

    jTextArea_new_servising_done.setColumns(20);
    jTextArea_new_servising_done.setRows(5);
    jScrollPane21.setViewportView(jTextArea_new_servising_done);

    jPanel_siaa_gdeda_dates.add(jScrollPane21);
    jScrollPane21.setBounds(20, 90, 210, 90);

    jLabel_id_client134.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client134.setFont(font.deriveFont(12f)
    );
    jLabel_id_client134.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client134.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client134.setText("تاريخ الشمعه 7");
    jPanel_siaa_gdeda_dates.add(jLabel_id_client134);
    jLabel_id_client134.setBounds(230, 50, 120, 30);

    jPanel_add_trkeb.add(jPanel_siaa_gdeda_dates);
    jPanel_siaa_gdeda_dates.setBounds(30, 470, 690, 190);

    jlayeredpane.add(jPanel_add_trkeb);
    jPanel_add_trkeb.setBounds(20, 10, 750, 0);

    jLabel_com_3_1.setBackground(new java.awt.Color(0, 0, 0));
    jLabel_com_3_1.setFont(font.deriveFont(12f)
    );
    jLabel_com_3_1.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_com_3_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_com_3_1.setText("من");
    jlayeredpane.add(jLabel_com_3_1);
    jLabel_com_3_1.setBounds(773, 69, 77, 30);

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setPreferredSize(new java.awt.Dimension(5000, 181));
    jPanel5.setVerifyInputWhenFocusTarget(false);
    jPanel5.setLayout(null);

    jTable_trkeb.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "الوظيفه", "كود العميل", "اسم العميل", "رقم المنزل", "الشارع", "المركز", "المحافظه", "تليفون", "كود المنتج", "اسم المنتج", "عدد شمعات المنتج", "الكميه", "تاريخ التسجل", "ملاحظات", "نظام الدفع", "كود المندوب", "الفئه", "موعد الشمعه 1", "موعد الشمعه 2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه 6", "موعد الشمعه 7", "تاريخ الموت", "الشهور لتعديل الفئه", "المستهدف", "كود المندوب الوسيط", "الرقم المسلسل", "اسم المندوب", "اسم المندوب الوسيط", "تاريخ الأضافة للسجل"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false, true, true, true, false, false, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_trkeb.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_trkeb.setName("إخطارات التركيبات"); // NOI18N
    jTable_trkeb.setSelectionBackground(new java.awt.Color(255, 255, 255));
    jTable_trkeb.setSelectionForeground(new java.awt.Color(0, 0, 204));
    jTable_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_trkebMouseReleased(evt);
        }
    });
    jScrollPane48.setViewportView(jTable_trkeb);

    jScrollPane48.setSize(5000, 270);

    jPanel5.add(jScrollPane48);
    jScrollPane48.setBounds(0, 0, 5000, 240);

    jScrollPane45.setViewportView(jPanel5);

    jlayeredpane.add(jScrollPane45);
    jScrollPane45.setBounds(10, 150, 1190, 270);
    jScrollPane45.setSize(width-20, 270);

    jTextField_search_siana1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_search_siana1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_search_siana1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_search_siana111KeyReleased(evt);
        }
    });
    jlayeredpane.add(jTextField_search_siana1);
    jTextField_search_siana1.setBounds(863, 99, 160, 31);

    jLabel_count.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_count.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel_count.setForeground(new java.awt.Color(0, 0, 102));
    jlayeredpane.add(jLabel_count);
    jLabel_count.setBounds(20, 10, 90, 40);

    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/outgoing-call-folded-icon.png"))); // NOI18N
    jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel29MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel29);
    jLabel29.setBounds(350, 90, 50, 50);

    jLabel_com3_0.setBackground(new java.awt.Color(0, 0, 0));
    jLabel_com3_0.setFont(font.deriveFont(12f)
    );
    jLabel_com3_0.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_com3_0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_com3_0.setText(" الأسم");
    jlayeredpane.add(jLabel_com3_0);
    jLabel_com3_0.setBounds(893, 69, 130, 30);

    jTextField_search_siana2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_search_siana2.setDateFormatString("yyyy-MM-dd");
    jTextField_search_siana2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_search_siana2KeyReleased(evt);
        }
    });
    jlayeredpane.add(jTextField_search_siana2);
    jTextField_search_siana2.setBounds(693, 99, 160, 30);

    jLabel_search_trkeb.setForeground(new java.awt.Color(0, 0, 204));
    jLabel_search_trkeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Search-icon.png"))); // NOI18N
    jLabel_search_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_search_trkebMouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel_search_trkeb);
    jLabel_search_trkeb.setBounds(470, 90, 50, 50);

    jTextArea3.setColumns(20);
    jTextArea3.setRows(5);
    jScrollPane17.setViewportView(jTextArea3);

    jlayeredpane.add(jScrollPane17);
    jScrollPane17.setBounds(90, 430, 1110, 40);
    jScrollPane17.setSize(width-100, 40);

    jTable_hints1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "الكود", "ملاحظات", "التاريخ"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_hints1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    jTable_hints1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTable_hints1KeyReleased(evt);
        }
    });
    jScrollPane18.setViewportView(jTable_hints1);

    jlayeredpane.add(jScrollPane18);
    jScrollPane18.setBounds(90, 480, 1110, 100);
    jScrollPane18.setSize(width-100,110+gap );

    jLabel_com_3_2.setBackground(new java.awt.Color(0, 0, 0));
    jLabel_com_3_2.setFont(font.deriveFont(12f)
    );
    jLabel_com_3_2.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_com_3_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_com_3_2.setText("الي ");
    jlayeredpane.add(jLabel_com_3_2);
    jLabel_com_3_2.setBounds(603, 69, 77, 30);

    jTextField_search_siana3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_search_siana3.setDateFormatString("yyyy-MM-dd");
    jTextField_search_siana3.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_search_siana3KeyReleased(evt);
        }
    });
    jlayeredpane.add(jTextField_search_siana3);
    jTextField_search_siana3.setBounds(523, 99, 160, 30);

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/bill.png"))); // NOI18N
    jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel12MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel12);
    jLabel12.setBounds(900, 10, 50, 50);

    jComboBox3.setFont(font.deriveFont(11f)
    );
    jComboBox3.setForeground(new java.awt.Color(72, 72, 72));
    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "الأسم", "المحافظه", "تاريخ التسجيل", "المحافظه و تاريخ التسجيل", "تاريخ الحد الاقصي", "المحافظه و تاريخ الحد الاقصي", "اسم الجهاز", "ملاحظات=", "ملاحظات!=", "الملاحظات الأضافيه", "الشارع", "اسم المندوب", "اسم المندوب الوسيط", "العمود المحدد", "خطة الفني" }));
    jComboBox3.setBorder(null);
    jComboBox3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox3ActionPerformed(evt);
        }
    });
    jlayeredpane.add(jComboBox3);
    jComboBox3.setBounds(1030, 80, 170, 30);

    jLabel_delete_trkeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/delete-contact-folded-icon.png"))); // NOI18N
    jLabel_delete_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_delete_trkebMouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel_delete_trkeb);
    jLabel_delete_trkeb.setBounds(410, 90, 50, 50);

    jLabel_order_table_trkeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/floppy-disk-48.png"))); // NOI18N
    jLabel_order_table_trkeb.setText("jLabel13");
    jLabel_order_table_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_order_table_trkebMouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel_order_table_trkeb);
    jLabel_order_table_trkeb.setBounds(290, 90, 50, 50);

    jLabel_print_trkeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/print-icon.png"))); // NOI18N
    jLabel_print_trkeb.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_print_trkebMouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel_print_trkeb);
    jLabel_print_trkeb.setBounds(230, 90, 50, 50);

    jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel63.setToolTipText("اضافه للملاحظات");
    jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel63MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel63);
    jLabel63.setBounds(20, 430, 50, 50);

    jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel64.setToolTipText("مسح الملاحظه");
    jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel64MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel64);
    jLabel64.setBounds(20, 490, 50, 50);

    jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/repeat-48.png"))); // NOI18N
    jLabel66.setToolTipText("تحديث بيانات العميل");
    jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel66MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel66);
    jLabel66.setBounds(170, 90, 50, 50);

    jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/archive.png"))); // NOI18N
    jLabel84.setToolTipText("عرض السجلات");
    jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel84MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel84);
    jLabel84.setBounds(1020, 10, 50, 50);

    jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel85.setToolTipText("مسح الكل من الخطة");
    jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel85MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel85);
    jLabel85.setBounds(1080, 10, 50, 50);

    jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/print-icon.png"))); // NOI18N
    jLabel86.setToolTipText("طباعه السجل");
    jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel86MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel86);
    jLabel86.setBounds(960, 10, 50, 50);

    jPanel34.setBackground(new java.awt.Color(255, 255, 255));
    jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel34.setLayout(null);

    jLabel91.setFont(font.deriveFont(16f)
    );
    jLabel91.setForeground(new java.awt.Color(51, 204, 0));
    jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel91.setText("سجل الخطة");
    jPanel34.add(jLabel91);
    jLabel91.setBounds(440, 30, 120, 50);

    jLabel92.setFont(font.deriveFont(16f)
    );
    jLabel92.setForeground(new java.awt.Color(204, 0, 51));
    jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel92.setText("سجل الرفض");
    jPanel34.add(jLabel92);
    jLabel92.setBounds(440, 300, 120, 50);

    jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel93.setToolTipText("مسح العميل من جدول الرفض");
    jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel93MouseReleased(evt);
        }
    });
    jPanel34.add(jLabel93);
    jLabel93.setBounds(30, 300, 70, 50);

    jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel94.setToolTipText("مسح العميل من جدول الخطة");
    jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel94MouseReleased(evt);
        }
    });
    jPanel34.add(jLabel94);
    jLabel94.setBounds(30, 30, 70, 50);

    jPanel37.setBackground(new java.awt.Color(255, 255, 255));
    jPanel37.setPreferredSize(new java.awt.Dimension(5000, 181));
    jPanel37.setLayout(null);

    jTable_trkeb_archive_not_done.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "الوظيفه", "كود العميل", "اسم العميل", "رقم المنزل", "الشارع", "المركز", "المحافظه", "تليفون", "كود المنتج", "اسم المنتج", "عدد شمعات المنتج", "الكميه", "تاريخ التسجل", "ملاحظات", "نظام الدفع", "كود المندوب", "الفئه", "موعد الشمعه 1", "موعد الشمعه 2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه 6", "موعد الشمعه 7", "تاريخ الموت", "الشهور لتعديل الفئه", "المستهدف", "كود المندوب الوسيط", "الرقم المسلسل", "اسم المندوب", "اسم المندوب الوسيط", "تاريخ الأضافة للسجل", "اخر ملاحظة", "تاريخ اخر ملاحظة"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false, true, true, true, false, false, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_trkeb_archive_not_done.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_trkeb_archive_not_done.setName("سجل الرفض للتركيبات"); // NOI18N
    jTable_trkeb_archive_not_done.setSelectionBackground(new java.awt.Color(0, 51, 153));
    jTable_trkeb_archive_not_done.setSelectionForeground(new java.awt.Color(204, 0, 204));
    jTable_trkeb_archive_not_done.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_trkeb_archive_not_doneMouseReleased(evt);
        }
    });
    jScrollPane51.setViewportView(jTable_trkeb_archive_not_done);

    jPanel37.add(jScrollPane51);
    jScrollPane51.setBounds(0, 0, 5000, 160);

    jScrollPane50.setViewportView(jPanel37);

    jPanel34.add(jScrollPane50);
    jScrollPane50.setBounds(20, 360, 970, 190);
    jScrollPane50.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jPanel38.setBackground(new java.awt.Color(255, 255, 255));
    jPanel38.setPreferredSize(new java.awt.Dimension(5000, 181));
    jPanel38.setLayout(null);

    jTable_trkeb_archive_done.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "الوظيفه", "كود العميل", "اسم العميل", "رقم المنزل", "الشارع", "المركز", "المحافظه", "تليفون", "كود المنتج", "اسم المنتج", "عدد شمعات المنتج", "الكميه", "تاريخ التسجل", "ملاحظات", "نظام الدفع", "كود المندوب", "الفئه", "موعد الشمعه 1", "موعد الشمعه 2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه 6", "موعد الشمعه 7", "تاريخ الموت", "الشهور لتعديل الفئه", "المستهدف", "كود المندوب الوسيط", "الرقم المسلسل", "اسم المندوب", "اسم المندوب الوسيط", "تاريخ الأضافة للسجل", "اخر ملاحظة", "تاريخ اخر ملاحظة"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false, true, true, true, false, false, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_trkeb_archive_done.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_trkeb_archive_done.setName("سجل الخطه للتركيبات"); // NOI18N
    jTable_trkeb_archive_done.setSelectionBackground(new java.awt.Color(0, 51, 153));
    jTable_trkeb_archive_done.setSelectionForeground(new java.awt.Color(204, 0, 204));
    jTable_trkeb_archive_done.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_trkeb_archive_doneMouseReleased(evt);
        }
    });
    jScrollPane53.setViewportView(jTable_trkeb_archive_done);

    jPanel38.add(jScrollPane53);
    jScrollPane53.setBounds(0, 0, 5000, 160);

    jScrollPane52.setViewportView(jPanel38);

    jPanel34.add(jScrollPane52);
    jScrollPane52.setBounds(10, 90, 970, 190);
    jScrollPane52.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jLabel_counter_trkeb_archive_not.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel34.add(jLabel_counter_trkeb_archive_not);
    jLabel_counter_trkeb_archive_not.setBounds(850, 320, 90, 30);

    jLabel_counter_trkeb_archive_done.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel34.add(jLabel_counter_trkeb_archive_done);
    jLabel_counter_trkeb_archive_done.setBounds(860, 50, 90, 30);

    jlayeredpane.add(jPanel34);
    jPanel34.setBounds(5, 10, 1000, 0);

    jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel95.setToolTipText("اضافه الكل للسجل");
    jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel95MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel95);
    jLabel95.setBounds(1140, 10, 50, 50);

    jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel96.setToolTipText("اضافه العميل للخطة");
    jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel96MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel96);
    jLabel96.setBounds(110, 90, 50, 50);

    jComboBox_elfne_trkeb.setFont(font.deriveFont(11f)
    );
    jComboBox_elfne_trkeb.setForeground(new java.awt.Color(72, 72, 72));
    jComboBox_elfne_trkeb.setBorder(null);
    jComboBox_elfne_trkeb.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox_elfne_trkebActionPerformed(evt);
        }
    });
    jlayeredpane.add(jComboBox_elfne_trkeb);
    jComboBox_elfne_trkeb.setBounds(530, 100, 490, 30);
    jComboBox_elfne_trkeb.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    jComboBox_elfne_trkeb.setVisible(false);

    jCheckBox_current_table_trkeb.setFont(font.deriveFont(12f)
    );
    jCheckBox_current_table_trkeb.setText("الجدول الحالي");
    jCheckBox_current_table_trkeb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jlayeredpane.add(jCheckBox_current_table_trkeb);
    jCheckBox_current_table_trkeb.setBounds(1090, 120, 110, 23);

    jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel99.setToolTipText("مسح العميل من الخطة");
    jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel99MouseReleased(evt);
        }
    });
    jlayeredpane.add(jLabel99);
    jLabel99.setBounds(50, 90, 50, 50);

    jPanel_trkeb.add(jlayeredpane);
    jlayeredpane.setBounds(0, 0, 2024, 1024);

    jLayeredPane3.add(jPanel_trkeb);
    jPanel_trkeb.setBounds(0, 100, 1700, 700);

    jPanel_elsiana_1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_elsiana_1.setLayout(null);

    jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
    jLayeredPane1.setOpaque(true);

    jPanel11.setBackground(new java.awt.Color(216, 215, 184));
    jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(234, 183, 55), null));
    jPanel11.setLayout(null);

    jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/clear.png"))); // NOI18N
    jLabel89.setToolTipText("مسح الأماكن");
    jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel89MouseReleased(evt);
        }
    });
    jPanel11.add(jLabel89);
    jLabel89.setBounds(670, 200, 30, 20);

    jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField3KeyReleased(evt);
        }
    });
    jPanel11.add(jTextField3);
    jTextField3.setBounds(530, 50, 130, 30);

    jTable_elmo7sl.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "الكود", "الأسم", "التليفون", "الاماكن"
        }
    ));
    jTable_elmo7sl.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_elmo7slMouseReleased(evt);
        }
    });
    jScrollPane7.setViewportView(jTable_elmo7sl);

    jPanel11.add(jScrollPane7);
    jScrollPane7.setBounds(10, 50, 515, 200);

    jTable_country_trkeb1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null},
            {null},
            {null},
            {null}
        },
        new String [] {
            "المحافظه"
        }
    ));
    jTable_country_trkeb1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_country_trkeb1MouseReleased(evt);
        }
    });
    jScrollPane16.setViewportView(jTable_country_trkeb1);

    jPanel11.add(jScrollPane16);
    jScrollPane16.setBounds(530, 80, 130, 170);

    jLabel_name_elmo7sl.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_name_elmo7sl.setFont(font.deriveFont(14f)
    );
    jLabel_name_elmo7sl.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_name_elmo7sl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_name_elmo7sl.setText("اسم الفني");
    jPanel11.add(jLabel_name_elmo7sl);
    jLabel_name_elmo7sl.setBounds(720, 100, 150, 20);

    jLabel_telephone_elmo7sl.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_telephone_elmo7sl.setFont(font.deriveFont(14f)
    );
    jLabel_telephone_elmo7sl.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_telephone_elmo7sl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_telephone_elmo7sl.setText("تليفون ");
    jPanel11.add(jLabel_telephone_elmo7sl);
    jLabel_telephone_elmo7sl.setBounds(720, 150, 150, 20);

    jTextField_name_elfne_sianat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_elfne_sianat.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_name_elfne_sianatActionPerformed(evt);
        }
    });
    jTextField_name_elfne_sianat.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_elfne_sianat3KeyReleased(evt);
        }
    });
    jPanel11.add(jTextField_name_elfne_sianat);
    jTextField_name_elfne_sianat.setBounds(670, 120, 200, 30);

    jTextField_phone_elfne_sianat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone_elfne_sianat.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phone_elfne_sianatKeyReleased(evt);
        }
    });
    jPanel11.add(jTextField_phone_elfne_sianat);
    jTextField_phone_elfne_sianat.setBounds(670, 170, 200, 30);

    jLabel_places_elmo7sl.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_places_elmo7sl.setFont(font.deriveFont(14f)
    );
    jLabel_places_elmo7sl.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_places_elmo7sl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_places_elmo7sl.setText("اماكن ");
    jPanel11.add(jLabel_places_elmo7sl);
    jLabel_places_elmo7sl.setBounds(720, 200, 150, 20);

    jTextField_places_elfne_sianat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_places_elfne_sianat.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_places_elfne_sianatKeyReleased(evt);
        }
    });
    jPanel11.add(jTextField_places_elfne_sianat);
    jTextField_places_elfne_sianat.setBounds(670, 220, 200, 30);

    jLabel_id_elmo7sl.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_elmo7sl.setFont(font.deriveFont(14f)
    );
    jLabel_id_elmo7sl.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_elmo7sl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_elmo7sl.setText("كود الفني");
    jPanel11.add(jLabel_id_elmo7sl);
    jLabel_id_elmo7sl.setBounds(720, 50, 150, 20);

    jTextField_id_elfne_sianat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_elfne_sianat.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_elfne_sianatKeyReleased(evt);
        }
    });
    jPanel11.add(jTextField_id_elfne_sianat);
    jTextField_id_elfne_sianat.setBounds(670, 70, 200, 30);

    jPanel4.setBackground(new java.awt.Color(216, 215, 184));
    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    jPanel4.setForeground(new java.awt.Color(255, 255, 255));
    jPanel4.setLayout(null);

    jTextField_real_date_siana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_real_date_siana.setDateFormatString("yyyy-MM-dd");
    jPanel4.add(jTextField_real_date_siana);
    jTextField_real_date_siana.setBounds(30, 130, 190, 30);

    jTextField_price_elsiana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_price_elsiana.setText("0");
    jTextField_price_elsiana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel4.add(jTextField_price_elsiana);
    jTextField_price_elsiana.setBounds(30, 70, 190, 30);

    jLabel_el2st_elsiana8.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana8.setFont(font.deriveFont(14f)
    );
    jLabel_el2st_elsiana8.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana8.setText("التاريخ");
    jPanel4.add(jLabel_el2st_elsiana8);
    jLabel_el2st_elsiana8.setBounds(50, 100, 170, 30);

    jLabel_el2st_elsiana9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana9.setFont(font.deriveFont(14f)
    );
    jLabel_el2st_elsiana9.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana9.setText("اجمالي");
    jPanel4.add(jLabel_el2st_elsiana9);
    jLabel_el2st_elsiana9.setBounds(60, 40, 160, 30);

    jLabel13.setFont(font.deriveFont(18f));
    jLabel13.setForeground(new java.awt.Color(234, 183, 55));
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel13.setText("فاتوره الصيانه");
    jPanel4.add(jLabel13);
    jLabel13.setBounds(0, 0, 220, 35);

    jPanel7.setBackground(new java.awt.Color(0, 173, 239));
    jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel7MouseReleased(evt);
        }
    });

    jLabel74.setFont(font.deriveFont(14f));
    jLabel74.setForeground(new java.awt.Color(255, 255, 255));
    jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel74.setText("ادخال الفاتوره");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    jPanel4.add(jPanel7);
    jPanel7.setBounds(20, 270, 200, 40);

    jPanel_fatorh_siana_panel.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_fatorh_siana_panel.setLayout(null);

    jLabel_el2st_elsiana10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana10.setFont(font.deriveFont(12f)
    );
    jLabel_el2st_elsiana10.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana10.setText("نسبة الأملاح بعد");
    jPanel_fatorh_siana_panel.add(jLabel_el2st_elsiana10);
    jLabel_el2st_elsiana10.setBounds(10, 0, 90, 30);

    jTextField_nsbt_el2mlah_before_elsiana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_nsbt_el2mlah_before_elsiana.setText("0");
    jTextField_nsbt_el2mlah_before_elsiana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_fatorh_siana_panel.add(jTextField_nsbt_el2mlah_before_elsiana);
    jTextField_nsbt_el2mlah_before_elsiana.setBounds(110, 30, 90, 30);

    jTextField_nsbt_el2mlah_after_elsiana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_nsbt_el2mlah_after_elsiana.setText("0");
    jTextField_nsbt_el2mlah_after_elsiana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_fatorh_siana_panel.add(jTextField_nsbt_el2mlah_after_elsiana);
    jTextField_nsbt_el2mlah_after_elsiana.setBounds(10, 30, 90, 30);

    jComboBox_type_elsiana.setFont(font.deriveFont(12f)
    );
    jPanel_fatorh_siana_panel.add(jComboBox_type_elsiana);
    jComboBox_type_elsiana.setBounds(0, 70, 200, 30);
    jComboBox_type_elsiana.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jLabel_el2st_elsiana11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana11.setFont(font.deriveFont(12f)
    );
    jLabel_el2st_elsiana11.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana11.setText("نسبة الأملاح قبل");
    jPanel_fatorh_siana_panel.add(jLabel_el2st_elsiana11);
    jLabel_el2st_elsiana11.setBounds(110, 0, 90, 30);

    jPanel4.add(jPanel_fatorh_siana_panel);
    jPanel_fatorh_siana_panel.setBounds(20, 160, 210, 110);

    jPanel11.add(jPanel4);
    jPanel4.setBounds(310, 260, 240, 320);

    jPanel6.setBackground(new java.awt.Color(216, 215, 184));
    jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    jPanel6.setLayout(null);

    jTextField_money_for_elb2e_elsianat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_money_for_elb2e_elsianat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel6.add(jTextField_money_for_elb2e_elsianat);
    jTextField_money_for_elb2e_elsianat.setBounds(20, 80, 200, 31);

    jCheckBox_elb2e_siana.setBackground(new java.awt.Color(255, 255, 255));
    jCheckBox_elb2e_siana.setFont(font.deriveFont(14f)
    );
    jCheckBox_elb2e_siana.setForeground(new java.awt.Color(72, 72, 72));
    jCheckBox_elb2e_siana.setText("الباقي من الصيانات");
    jCheckBox_elb2e_siana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jCheckBox_elb2e_siana.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox_elb2e_sianaActionPerformed(evt);
        }
    });
    jPanel6.add(jCheckBox_elb2e_siana);
    jCheckBox_elb2e_siana.setBounds(80, 50, 140, 30);

    jLabel_el2st_elsiana6.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana6.setFont(font.deriveFont(14f)
    );
    jLabel_el2st_elsiana6.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana6.setText("التاريخ");
    jPanel6.add(jLabel_el2st_elsiana6);
    jLabel_el2st_elsiana6.setBounds(70, 110, 150, 30);

    jTextField_real_date_siana1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_real_date_siana1.setDateFormatString("yyyy-MM-dd");
    jPanel6.add(jTextField_real_date_siana1);
    jTextField_real_date_siana1.setBounds(20, 140, 200, 30);

    jLabel9.setFont(font.deriveFont(18f));
    jLabel9.setForeground(new java.awt.Color(234, 183, 55));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("فاتوره الباقي من الصيانه");
    jPanel6.add(jLabel9);
    jLabel9.setBounds(0, 0, 220, 35);

    jPanel2.setBackground(new java.awt.Color(0, 173, 239));
    jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel2MouseReleased(evt);
        }
    });

    jLabel73.setFont(font.deriveFont(14f));
    jLabel73.setForeground(new java.awt.Color(255, 255, 255));
    jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel73.setText("ادخال الفاتوره");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(19, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    jPanel6.add(jPanel2);
    jPanel2.setBounds(20, 270, 200, 40);

    jPanel11.add(jPanel6);
    jPanel6.setBounds(590, 260, 240, 320);

    jPanel10.setBackground(new java.awt.Color(216, 215, 184));
    jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    jPanel10.setLayout(null);

    jLabel_el2st_elsiana7.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_el2st_elsiana7.setFont(font.deriveFont(14f)
    );
    jLabel_el2st_elsiana7.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_el2st_elsiana7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_el2st_elsiana7.setText("التاريخ");
    jPanel10.add(jLabel_el2st_elsiana7);
    jLabel_el2st_elsiana7.setBounds(80, 50, 140, 30);

    jTextField_real_date_siana2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_real_date_siana2.setDateFormatString("yyyy-MM-dd");
    jPanel10.add(jTextField_real_date_siana2);
    jTextField_real_date_siana2.setBounds(30, 80, 190, 30);

    jLabel2.setFont(font.deriveFont(18f));
    jLabel2.setForeground(new java.awt.Color(234, 183, 55));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("تأجيل الصيانه");
    jPanel10.add(jLabel2);
    jLabel2.setBounds(0, 0, 220, 35);

    jPanel20.setBackground(new java.awt.Color(0, 173, 239));
    jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel20MouseReleased(evt);
        }
    });

    jLabel75.setFont(font.deriveFont(14f));
    jLabel75.setForeground(new java.awt.Color(255, 255, 255));
    jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel75.setText("تأجيل");

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(21, Short.MAX_VALUE))
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    jPanel10.add(jPanel20);
    jPanel20.setBounds(20, 270, 200, 40);

    jPanel11.add(jPanel10);
    jPanel10.setBounds(20, 260, 240, 320);

    jLabel_name_client_siana.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_name_client_siana.setFont(font.deriveFont(14f)
    );
    jLabel_name_client_siana.setForeground(new java.awt.Color(0, 173, 239));
    jLabel_name_client_siana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jPanel11.add(jLabel_name_client_siana);
    jLabel_name_client_siana.setBounds(200, 10, 300, 32);

    jLabel76.setBackground(new java.awt.Color(255, 255, 255));
    jLabel76.setFont(font.deriveFont(14f)
    );
    jLabel76.setForeground(new java.awt.Color(72, 72, 72));
    jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel76.setText("العميل :-");
    jPanel11.add(jLabel76);
    jLabel76.setBounds(500, 10, 80, 32);

    jLayeredPane1.add(jPanel11);
    jPanel11.setBounds(10, 10, 885, 0);

    jPanel_classes.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_classes.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_classes.setLayout(null);
    jLayeredPane1.add(jPanel_classes);
    jPanel_classes.setBounds(1030, 150, 150, 0);
    jPanel_classes.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setPreferredSize(new java.awt.Dimension(7000, 270));

    jTable_siana.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "كود العميل", "اسم العميل", "المركز", "تليفون", "ملاحظات", "كود المنتج", "اسم المنتج", "الكميه", "تاريخ الشراء", "موعد الشمعه1", "موعد الشمعه2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه6", "موعد الشمعه 7", "نوع الصيانه", "العطل", "تاريخ العطل", "نظام الدفع", "تاريخ الحد الأقصي للعطل", "القسط", "تاريخ القسط", "المبلغ المتبقي", "مده شمعه1", "مده شمعه 2", "مده شمعه 3", "مده شمعه5", "مده شمعه6", "مده شمعه7", "رصيد الشمعه1", "رصيد الشمعه2", "رصيد الشمعه3", "رصيد الشمعه5", "رصيد الشمعه6", "رصيد الشمعه7", "المبلغ المتبقي من الصيانات", "الفئه", "المستهدف", "تاريخ تعديل الفئه", "شهور تعديل الفئه", "رقم المنزل", "الشارع", "المحافظه", "الرقم المسلسل", "اخر عملية", "تاريخ اخر عملية", "الوظيفة", "تاريخ ألاضافة للسجل", "اخر أضافة للسجل"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, true, true, true, true, true, false, false, false, false, false, false, false, false, false, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_siana.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_siana.setName("الصيانات"); // NOI18N
    jTable_siana.setSelectionBackground(new java.awt.Color(255, 255, 255));
    jTable_siana.setSelectionForeground(new java.awt.Color(0, 0, 153));
    jTable_siana.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_sianaMouseReleased(evt);
        }
    });
    jTable_siana.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTable_sianaKeyReleased(evt);
        }
    });
    jScrollPane39.setViewportView(jTable_siana);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 7000, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 45, Short.MAX_VALUE))
    );

    jScrollPane37.setViewportView(jPanel1);

    jLayeredPane1.add(jScrollPane37);
    jScrollPane37.setBounds(10, 150, 1180, 250);
    jScrollPane37.setSize(width-20, 250);

    jTable_hints.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "الكود", "ملاحظات", "التاريخ"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_hints.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTable_hintsKeyReleased(evt);
        }
    });
    jScrollPane9.setViewportView(jTable_hints);

    jLayeredPane1.add(jScrollPane9);
    jScrollPane9.setBounds(70, 470, 1110, 70);
    jScrollPane9.setSize(width-80, 110+gap);

    jTextArea2.setColumns(20);
    jTextArea2.setRows(5);
    jScrollPane10.setViewportView(jTextArea2);

    jLayeredPane1.add(jScrollPane10);
    jScrollPane10.setBounds(70, 410, 1110, 50);
    jScrollPane10.setSize(width-80, 50);

    jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/outgoing-call-folded-icon.png"))); // NOI18N
    jLabel10.setToolTipText("الأتصال");
    jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel10MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel10);
    jLabel10.setBounds(250, 30, 48, 50);

    jLabel_count_siana.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_count_siana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel_count_siana.setForeground(new java.awt.Color(72, 72, 72));
    jLayeredPane1.add(jLabel_count_siana);
    jLabel_count_siana.setBounds(20, 90, 100, 50);

    jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel16.setToolTipText("اضافة الكل للخطة");
    jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel16MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel16);
    jLabel16.setBounds(1140, 10, 48, 50);

    jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/print-icon.png"))); // NOI18N
    jLabel62.setToolTipText("طباعه السجل");
    jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel62MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel62);
    jLabel62.setBounds(960, 10, 50, 50);

    jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel65.setToolTipText("مسح الكل من الخطة");
    jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel65MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel65);
    jLabel65.setBounds(1080, 10, 50, 50);

    jComboBox_client_hints.setBackground(new java.awt.Color(51, 0, 255));
    jComboBox_client_hints.setEditable(true);
    jComboBox_client_hints.setFont(font.deriveFont(12f)
    );
    jComboBox_client_hints.setForeground(new java.awt.Color(255, 255, 255));
    jLayeredPane1.add(jComboBox_client_hints);
    jComboBox_client_hints.setBounds(130, 150, 920, 0);

    jComboBox1.setFont(font.deriveFont(12f)
    );
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "الأسم", "المركز", "التاريخ", "المركز و التاريخ", "المحافظه", "المحافظه و المركز", "المحافظه و التاريخ", "الملاحظات =", "الملاحظات !=", "ملاحظات اضافيه", "نوع الصيانه أو العطل", "الشارع", "الشارع و التاريخ", "نوع الصيانه أو العطل و المركز", "العمود المحدد", "خطة الفني", "اخر عملية" }));
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1ActionPerformed(evt);
        }
    });
    jLayeredPane1.add(jComboBox1);
    jComboBox1.setBounds(1010, 80, 180, 30);

    jLabel_n.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_n.setFont(font.deriveFont(14f));
    jLabel_n.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_n.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_n.setText("الأسم");
    jLayeredPane1.add(jLabel_n);
    jLabel_n.setBounds(880, 80, 120, 20);

    jTextField_n_p.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_n_p.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_n_p.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_n_p11KeyReleased(evt);
        }
    });
    jLayeredPane1.add(jTextField_n_p);
    jTextField_n_p.setBounds(850, 105, 152, 30);

    jLabel_country.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_country.setFont(font.deriveFont(14f));
    jLabel_country.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_country.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_country.setText("المحافظه");
    jLayeredPane1.add(jLabel_country);
    jLabel_country.setBounds(698, 80, 142, 20);

    jTextField_two_n_p.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_two_n_p.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_two_n_p11KeyReleased(evt);
        }
    });
    jLayeredPane1.add(jTextField_two_n_p);
    jTextField_two_n_p.setBounds(690, 105, 152, 31);

    jLabel_st.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_st.setFont(font.deriveFont(14f));
    jLabel_st.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_st.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_st.setText("من");
    jLayeredPane1.add(jLabel_st);
    jLabel_st.setBounds(640, 80, 40, 20);

    jTextField_st.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_st.setDateFormatString("yyyy-MM-dd");
    jLayeredPane1.add(jTextField_st);
    jTextField_st.setBounds(530, 106, 150, 30);

    jLabel_en.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_en.setFont(font.deriveFont(14f));
    jLabel_en.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_en.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_en.setText("الي");
    jLayeredPane1.add(jLabel_en);
    jLabel_en.setBounds(480, 80, 40, 20);

    jTextField_en.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_en.setDateFormatString("yyyy-MM-dd");
    jLayeredPane1.add(jTextField_en);
    jTextField_en.setBounds(370, 106, 150, 30);

    jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Search-icon.png"))); // NOI18N
    jLabel14.setToolTipText("بحث للعملاء");
    jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel14MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel14);
    jLabel14.setBounds(310, 90, 50, 50);

    jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/floppy-disk-48.png"))); // NOI18N
    jLabel67.setToolTipText("حفظ ترتيب الجدول");
    jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel67MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel67);
    jLabel67.setBounds(840, 10, 50, 50);

    jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/print-icon.png"))); // NOI18N
    jLabel69.setToolTipText("طباعه ");
    jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel69MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel69);
    jLabel69.setBounds(250, 90, 50, 50);

    jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Button-hint-icon.png"))); // NOI18N
    jLabel68.setToolTipText("ملاحظات العميل");
    jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel68MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel68);
    jLabel68.setBounds(310, 30, 50, 50);

    jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/bill.png"))); // NOI18N
    jLabel70.setToolTipText("الفاتوره");
    jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel70MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel70);
    jLabel70.setBounds(900, 10, 48, 50);

    jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel71.setToolTipText("اضافه للملاحظات");
    jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel71MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel71);
    jLabel71.setBounds(10, 420, 48, 48);

    jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel72.setToolTipText("مسح الملاحظه");
    jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel72MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel72);
    jLabel72.setBounds(10, 480, 48, 48);

    jLabel25.setFont(font.deriveFont(12f)
    );
    jLabel25.setForeground(new java.awt.Color(72, 72, 72));
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel25.setText("فلتر الفئات");
    jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel25MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel25);
    jLabel25.setBounds(1120, 110, 70, 40);

    jLabel27.setFont(font.deriveFont(12f)
    );
    jLabel27.setForeground(new java.awt.Color(72, 72, 72));
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/filter.png"))); // NOI18N
    jLayeredPane1.add(jLabel27);
    jLabel27.setBounds(1110, 110, 30, 40);

    jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel32.setText("jLabel32");
    jLabel32.setToolTipText("اضافه العميل للخطة");
    jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel32MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel32);
    jLabel32.setBounds(190, 90, 50, 50);

    jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/archive.png"))); // NOI18N
    jLabel51.setToolTipText("عرض السجل");
    jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel51MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel51);
    jLabel51.setBounds(1020, 10, 50, 50);

    jPanel26.setBackground(new java.awt.Color(255, 255, 255));
    jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel26.setLayout(null);

    jPanel27.setBackground(new java.awt.Color(255, 255, 255));

    jTable_siana_help_dmg.setBackground(new java.awt.Color(204, 204, 204));
    jTable_siana_help_dmg.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "كود العميل", "اسم العميل", "المركز", "تليفون", "ملاحظات", "كود المنتج", "اسم المنتج", "الكميه", "تاريخ الشراء", "موعد الشمعه1", "موعد الشمعه2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه6", "موعد الشمعه 7", "نوع الصيانه", "العطل", "تاريخ العطل", "نظام الدفع", "تاريخ الحد الأقصي للعطل", "القسط", "تاريخ القسط", "المبلغ المتبقي", "مده شمعه1", "مده شمعه 2", "مده شمعه 3", "مده شمعه5", "مده شمعه6", "مده شمعه7", "رصيد الشمعه1", "رصيد الشمعه2", "رصيد الشمعه3", "رصيد الشمعه5", "رصيد الشمعه6", "رصيد الشمعه7", "المبلغ المتبقي من الصيانات", "الفئه", "المستهدف", "تاريخ تعديل الفئه", "شهور تعديل الفئه", "رقم المنزل", "الشارع", "المحافظه", "الرقم المسلسل", "اخر صيانة", "تاريخ اخر صيانة", "الوظيفة", "تاريخ الأضافة للخطة", "اخر اضافة للخطة", "اخر ملاحظة", "تاريخ اخر ملاحظة"
        }
    ));
    jTable_siana_help_dmg.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_siana_help_dmg.setName("سجل الخطة"); // NOI18N
    jTable_siana_help_dmg.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_siana_help_dmgMouseReleased(evt);
        }
    });
    jScrollPane38.setViewportView(jTable_siana_help_dmg);

    javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
    jPanel27.setLayout(jPanel27Layout);
    jPanel27Layout.setHorizontalGroup(
        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 7000, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    jPanel27Layout.setVerticalGroup(
        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel27Layout.createSequentialGroup()
            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 220, Short.MAX_VALUE))
    );

    jScrollPane8.setViewportView(jPanel27);

    jPanel26.add(jScrollPane8);
    jScrollPane8.setBounds(10, 90, 980, 200);
    jScrollPane8.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jPanel28.setBackground(new java.awt.Color(255, 255, 255));

    jTable_siana_help_dmg_reject.setBackground(new java.awt.Color(204, 204, 204));
    jTable_siana_help_dmg_reject.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "كود العميل", "اسم العميل", "المركز", "تليفون", "ملاحظات", "كود المنتج", "اسم المنتج", "الكميه", "تاريخ الشراء", "موعد الشمعه1", "موعد الشمعه2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه6", "موعد الشمعه 7", "نوع الصيانه", "العطل", "تاريخ العطل", "نظام الدفع", "تاريخ الحد الأقصي للعطل", "القسط", "تاريخ القسط", "المبلغ المتبقي", "مده شمعه1", "مده شمعه 2", "مده شمعه 3", "مده شمعه5", "مده شمعه6", "مده شمعه7", "رصيد الشمعه1", "رصيد الشمعه2", "رصيد الشمعه3", "رصيد الشمعه5", "رصيد الشمعه6", "رصيد الشمعه7", "المبلغ المتبقي من الصيانات", "الفئه", "المستهدف", "تاريخ تعديل الفئه", "شهور تعديل الفئه", "رقم المنزل", "الشارع", "المحافظه", "الرقم المسلسل", "اخر صيانة", "تاريخ اخر صيانة", "الوظيفة", "تاريخ الاضافة للخطة", "اخر اضافة للخطة", "اخر ملاحظة", "تاريخ اخر ملاحظة"
        }
    ));
    jTable_siana_help_dmg_reject.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_siana_help_dmg_reject.setName("سجل الرفض"); // NOI18N
    jTable_siana_help_dmg_reject.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_siana_help_dmg_rejectMouseReleased(evt);
        }
    });
    jScrollPane40.setViewportView(jTable_siana_help_dmg_reject);

    javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
    jPanel28.setLayout(jPanel28Layout);
    jPanel28Layout.setHorizontalGroup(
        jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 7000, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    jPanel28Layout.setVerticalGroup(
        jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel28Layout.createSequentialGroup()
            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 231, Short.MAX_VALUE))
    );

    jScrollPane20.setViewportView(jPanel28);

    jPanel26.add(jScrollPane20);
    jScrollPane20.setBounds(10, 360, 980, 200);
    jScrollPane20.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jLabel79.setFont(font.deriveFont(16f)
    );
    jLabel79.setForeground(new java.awt.Color(51, 204, 0));
    jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel79.setText("سجل الخطة");
    jPanel26.add(jLabel79);
    jLabel79.setBounds(440, 30, 120, 50);

    jLabel80.setFont(font.deriveFont(16f)
    );
    jLabel80.setForeground(new java.awt.Color(204, 0, 51));
    jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel80.setText("سجل الرفض");
    jPanel26.add(jLabel80);
    jLabel80.setBounds(440, 300, 120, 50);

    jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel81.setToolTipText("مسح العميل من جدول الرفض");
    jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel81MouseReleased(evt);
        }
    });
    jPanel26.add(jLabel81);
    jLabel81.setBounds(30, 300, 70, 50);

    jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel82.setToolTipText("مسح العميل من سجل الخطة");
    jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel82MouseReleased(evt);
        }
    });
    jPanel26.add(jLabel82);
    jLabel82.setBounds(30, 30, 70, 50);

    jLabel_counter_siana_archive_done.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel26.add(jLabel_counter_siana_archive_done);
    jLabel_counter_siana_archive_done.setBounds(860, 50, 90, 30);

    jLabel_counter_siana_archive_not.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel26.add(jLabel_counter_siana_archive_not);
    jLabel_counter_siana_archive_not.setBounds(850, 320, 90, 30);

    jLayeredPane1.add(jPanel26);
    jPanel26.setBounds(10, 10, 1000, 0);

    jCheckBox_current_table.setFont(font.deriveFont(12f)
    );
    jCheckBox_current_table.setText("الجدول الحالي");
    jLayeredPane1.add(jCheckBox_current_table);
    jCheckBox_current_table.setBounds(1010, 120, 90, 23);

    jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/delete-contact-folded-icon.png"))); // NOI18N
    jLabel90.setToolTipText("مسح العطل");
    jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel90MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel90);
    jLabel90.setBounds(130, 30, 50, 50);

    jComboBox_elnfe_siana.setFont(font.deriveFont(12f)
    );
    jComboBox_elnfe_siana.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox_elnfe_sianaActionPerformed(evt);
        }
    });
    jLayeredPane1.add(jComboBox_elnfe_siana);
    jComboBox_elnfe_siana.setBounds(380, 100, 620, 30);
    jComboBox_elnfe_siana.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    jPanel_perioud_siana.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_perioud_siana.setLayout(null);

    jLabel_st1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_st1.setFont(font.deriveFont(14f));
    jLabel_st1.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_st1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_st1.setText("من");
    jPanel_perioud_siana.add(jLabel_st1);
    jLabel_st1.setBounds(370, 0, 40, 20);

    jTextField_submit_start.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_submit_start.setDateFormatString("yyyy-MM-dd");
    jPanel_perioud_siana.add(jTextField_submit_start);
    jTextField_submit_start.setBounds(250, 20, 160, 30);

    jLabel_en1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_en1.setFont(font.deriveFont(14f));
    jLabel_en1.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_en1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_en1.setText("الي");
    jPanel_perioud_siana.add(jLabel_en1);
    jLabel_en1.setBounds(200, 0, 40, 20);

    jTextField_submit_end.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_submit_end.setDateFormatString("yyyy-MM-dd");
    jPanel_perioud_siana.add(jTextField_submit_end);
    jTextField_submit_end.setBounds(80, 20, 160, 30);

    jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Search-icon.png"))); // NOI18N
    jLabel15.setToolTipText("بحث للخطه");
    jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel15MouseReleased(evt);
        }
    });
    jPanel_perioud_siana.add(jLabel15);
    jLabel15.setBounds(10, 10, 50, 50);

    jLayeredPane1.add(jPanel_perioud_siana);
    jPanel_perioud_siana.setBounds(400, 10, 420, 60);

    jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/repeat-48.png"))); // NOI18N
    jLabel97.setToolTipText("تحديث بيانات العميل");
    jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel97MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel97);
    jLabel97.setBounds(190, 30, 50, 50);

    jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Error-icon.png"))); // NOI18N
    jLabel98.setToolTipText("مسح العميل من الخطة");
    jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel98MouseReleased(evt);
        }
    });
    jLayeredPane1.add(jLabel98);
    jLabel98.setBounds(130, 90, 50, 50);

    jPanel_elsiana_1.add(jLayeredPane1);
    jLayeredPane1.setBounds(0, 0, 2024, 1024);

    jLayeredPane3.add(jPanel_elsiana_1);
    jPanel_elsiana_1.setBounds(0, 100, 0, 0);

    jPanel_add_3otl.setLayout(null);

    jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
    jLayeredPane2.setOpaque(true);

    jPanel22.setBackground(new java.awt.Color(216, 215, 184));
    jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel22.setLayout(null);

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane12.setViewportView(jTextArea1);

    jPanel22.add(jScrollPane12);
    jScrollPane12.setBounds(260, 20, 260, 200);

    jLabel_id_client43.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client43.setFont(font.deriveFont(12f)
    );
    jLabel_id_client43.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client43.setText("تاريخ العطل");
    jPanel22.add(jLabel_id_client43);
    jLabel_id_client43.setBounds(60, 10, 160, 30);

    jTextField_date_el3otl.setDateFormatString("yyyy-MM-dd");
    jTextField_date_el3otl.setFocusTraversalPolicyProvider(true);
    jPanel22.add(jTextField_date_el3otl);
    jTextField_date_el3otl.setBounds(20, 40, 220, 29);

    jLabel_id_client42.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client42.setFont(font.deriveFont(12f)
    );
    jLabel_id_client42.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client42.setText("تاريخ الحد الأقصي");
    jPanel22.add(jLabel_id_client42);
    jLabel_id_client42.setBounds(50, 70, 170, 30);

    jTextField_date_end_line_el3otl.setDateFormatString("yyyy-MM-dd");
    jTextField_date_end_line_el3otl.setFocusTraversalPolicyProvider(true);
    jPanel22.add(jTextField_date_end_line_el3otl);
    jTextField_date_end_line_el3otl.setBounds(20, 100, 220, 29);

    jPanel21.setBackground(new java.awt.Color(0, 173, 239));
    jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jPanel21MouseReleased(evt);
        }
    });

    jLabel17.setFont(font.deriveFont(14f)
    );
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel17.setText("ادخال عطل");

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(63, Short.MAX_VALUE))
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jPanel22.add(jPanel21);
    jPanel21.setBounds(20, 160, 220, 50);

    jLayeredPane2.add(jPanel22);
    jPanel22.setBounds(100, 10, 550, 0);

    jLabel_id_client41.setBackground(new java.awt.Color(255, 255, 255));
    jLabel_id_client41.setFont(font.deriveFont(12f)
    );
    jLabel_id_client41.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client41.setText("اسم العميل");
    jLayeredPane2.add(jLabel_id_client41);
    jLabel_id_client41.setBounds(1090, 50, 100, 30);

    jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLayeredPane2.add(jLabel77);
    jLabel77.setBounds(870, 50, 30, 30);

    jTextField_name_client_add_3otl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_client_add_3otl.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_client_add_3otl.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_client_add_3otlKeyReleased(evt);
        }
    });
    jLayeredPane2.add(jTextField_name_client_add_3otl);
    jTextField_name_client_add_3otl.setBounds(860, 50, 220, 31);

    jTable_add_3otl.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "كود العميل", "اسم العميل", "المركز", "تليفون", "ملاحظات", "كود المنتج", "اسم المنتج", "الكميه", "تاريخ الشراء", "موعد الشمعه1", "موعد الشمعه 2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه 6", "موعد الشمعه 7", "تاريخ القسط", "المبلغ المتبقي", "الرقم المسلسل"
        }
    ));
    jTable_add_3otl.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_add_3otl.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_add_3otlMouseReleased(evt);
        }
    });
    jScrollPane11.setViewportView(jTable_add_3otl);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 4000, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 20, Short.MAX_VALUE))
    );

    jScrollPane36.setViewportView(jPanel3);

    jLayeredPane2.add(jScrollPane36);
    jScrollPane36.setBounds(10, 90, 1200, 480);
    jScrollPane36.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    jScrollPane36.setSize(width-20, 440);

    jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel78.setToolTipText("اضافه العطل");
    jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel78MouseReleased(evt);
        }
    });
    jLayeredPane2.add(jLabel78);
    jLabel78.setBounds(20, 10, 60, 60);

    jPanel_add_3otl.add(jLayeredPane2);
    jLayeredPane2.setBounds(0, 0, 2000, 1024);

    jLayeredPane3.add(jPanel_add_3otl);
    jPanel_add_3otl.setBounds(0, 100, 0, 0);

    jPanel_add_client.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_add_client.setPreferredSize(new java.awt.Dimension(5000, 721));
    jPanel_add_client.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jPanel_add_clientKeyReleased(evt);
        }
    });
    jPanel_add_client.setLayout(null);

    jLabel_add.setBackground(new java.awt.Color(0, 0, 0));
    jLabel_add.setForeground(new java.awt.Color(255, 255, 255));
    jPanel_add_client.add(jLabel_add);
    jLabel_add.setBounds(1500, 550, 236, 31);

    jLabel55.setBackground(new java.awt.Color(255, 255, 255));
    jLabel55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel55.setForeground(new java.awt.Color(255, 255, 255));
    jLabel55.setText("2");
    jPanel_add_client.add(jLabel55);
    jLabel55.setBounds(625, 135, 20, 50);

    jLabel56.setBackground(new java.awt.Color(255, 255, 255));
    jLabel56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel56.setForeground(new java.awt.Color(255, 255, 255));
    jLabel56.setText("3");
    jPanel_add_client.add(jLabel56);
    jLabel56.setBounds(505, 135, 20, 50);

    jLabel57.setBackground(new java.awt.Color(255, 255, 255));
    jLabel57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel57.setForeground(new java.awt.Color(255, 255, 255));
    jLabel57.setText("4");
    jPanel_add_client.add(jLabel57);
    jLabel57.setBounds(385, 135, 20, 50);

    jLabel58.setBackground(new java.awt.Color(255, 255, 255));
    jLabel58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel58.setForeground(new java.awt.Color(255, 255, 255));
    jLabel58.setText("5");
    jPanel_add_client.add(jLabel58);
    jLabel58.setBounds(265, 130, 20, 60);

    jLabel59.setBackground(new java.awt.Color(255, 255, 255));
    jLabel59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel59.setForeground(new java.awt.Color(255, 255, 255));
    jLabel59.setText("1");
    jPanel_add_client.add(jLabel59);
    jLabel59.setBounds(745, 135, 20, 50);

    jPanel18.setBackground(new java.awt.Color(1, 74, 129));

    jLabel47.setFont(font.deriveFont(14f));
    jLabel47.setForeground(new java.awt.Color(255, 255, 255));
    jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/proSteps.png"))); // NOI18N
    jLabel47.setText("ادخال العميل");
    jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel47MouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 55, Short.MAX_VALUE))
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel_add_client.add(jPanel18);
    jPanel18.setBounds(10, 540, 240, 40);

    jPanel8.setBackground(new java.awt.Color(153, 153, 255));
    jPanel8.setLayout(new java.awt.CardLayout());

    jPanel_elmndob_table.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_elmndob_table.setLayout(null);

    jTable_elmndob_insert.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "كود المندوب ", "اسم المندوب", "التليفون"
        }
    ));
    jTable_elmndob_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jTable_elmndob_insert.setUpdateSelectionOnSort(false);
    jTable_elmndob_insert.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_elmndob_insertMouseReleased(evt);
        }
    });
    jScrollPane4.setViewportView(jTable_elmndob_insert);
    jScrollPane4.setSize(width-300, 300);

    jPanel_elmndob_table.add(jScrollPane4);
    jScrollPane4.setBounds(10, 30, 920, 259);
    jScrollPane4.setSize(width-320, 259);

    jPanel8.add(jPanel_elmndob_table, "card_elmndob");

    jPanel_product_table.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_product_table.setLayout(null);

    jTable_product_insert1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null}
        },
        new String [] {
            "كود المنتج", "اسم المنتج", "النوع", "السعر", "المقدم", "القسط", "الكميه"
        }
    ));
    jTable_product_insert1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_product_insert1MouseReleased(evt);
        }
    });
    jScrollPane2.setViewportView(jTable_product_insert1);

    jPanel_product_table.add(jScrollPane2);
    jScrollPane2.setBounds(10, 21, 920, 268);
    jScrollPane2.setSize(width-320, 270);

    jPanel8.add(jPanel_product_table, "card_product");

    jPanel_region_table.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_region_table.setLayout(null);

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel6MouseReleased(evt);
        }
    });
    jPanel_region_table.add(jLabel6);
    jLabel6.setBounds(720, 10, 30, 30);

    jTable_region.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "المركز", "المحافظه"
        }
    ));
    jTable_region.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_regionMouseReleased(evt);
        }
    });
    jScrollPane14.setViewportView(jTable_region);

    jPanel_region_table.add(jScrollPane14);
    jScrollPane14.setBounds(10, 40, 920, 240);
    jScrollPane14.setSize(width-320, 240);

    jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField1KeyReleased(evt);
        }
    });
    jPanel_region_table.add(jTextField1);
    jTextField1.setBounds(710, 10, 206, 28);

    jCheckBox_elwset1.setBackground(new java.awt.Color(255, 255, 255));
    jCheckBox_elwset1.setFont(font.deriveFont(12f));
    jCheckBox_elwset1.setForeground(new java.awt.Color(72, 72, 72));
    jCheckBox_elwset1.setText("الفني");
    jCheckBox_elwset1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jCheckBox_elwset1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox_elwset1ActionPerformed(evt);
        }
    });
    jPanel_region_table.add(jCheckBox_elwset1);
    jCheckBox_elwset1.setBounds(10, 10, 60, 30);

    jPanel8.add(jPanel_region_table, "card_region");

    jPanel_elfne_table.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_elfne_table.setLayout(null);

    jTable_elfne_insert.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "كود الفني", "اسم الفني", "التليفون", "الاماكن"
        }
    ));
    jTable_elfne_insert.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_elfne_insertMouseReleased(evt);
        }
    });
    jScrollPane3.setViewportView(jTable_elfne_insert);

    jPanel_elfne_table.add(jScrollPane3);
    jScrollPane3.setBounds(10, 28, 930, 261);
    jScrollPane3.setSize(width-320, 260);

    jPanel8.add(jPanel_elfne_table, "card_elfne");

    jPanel_client_table.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_client_table.setLayout(null);

    jCheckBox_elwset.setBackground(new java.awt.Color(153, 153, 153));
    jCheckBox_elwset.setFont(font.deriveFont(12f));
    jCheckBox_elwset.setForeground(new java.awt.Color(72, 72, 72));
    jCheckBox_elwset.setText("مندوب وسيط");
    jCheckBox_elwset.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jCheckBox_elwset.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox_elwsetActionPerformed(evt);
        }
    });
    jPanel_client_table.add(jCheckBox_elwset);
    jCheckBox_elwset.setBounds(750, 0, 160, 30);

    jTable_clients_insert.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "كود العميل ", "اسم العميل ", "المهنه", "التليفون"
        }
    ));
    jTable_clients_insert.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_clients_insertMouseReleased(evt);
        }
    });
    jScrollPane1.setViewportView(jTable_clients_insert);

    jPanel_client_table.add(jScrollPane1);
    jScrollPane1.setBounds(10, 40, 908, 120);
    jScrollPane1.setSize(width-320, 112);

    jTable_canceled.setBackground(new java.awt.Color(255, 153, 153));
    jTable_canceled.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
        },
        new String [] {
            "كود العميل", "اسم العميل", "الوظيفه", "التليفون", "سبب الألغاء", "التاريخ"
        }
    ));
    jTable_canceled.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_canceledMouseReleased(evt);
        }
    });
    jScrollPane13.setViewportView(jTable_canceled);

    jPanel_client_table.add(jScrollPane13);
    jScrollPane13.setBounds(10, 210, 910, 80);
    jScrollPane13.setSize(width-320, 90);

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/delete.png"))); // NOI18N
    jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel11MouseReleased(evt);
        }
    });
    jPanel_client_table.add(jLabel11);
    jLabel11.setBounds(10, 160, 50, 45);

    jPanel8.add(jPanel_client_table, "card_client");

    jPanel_elmndob_elwaset.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_elmndob_elwaset.setLayout(null);

    jTable_elmndob_elwaset__insert.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "كود المندوب الوسيط", "اسم المندوب الوسيط", "التليفون"
        }
    ));
    jTable_elmndob_elwaset__insert.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_elmndob_elwaset__insertMouseReleased(evt);
        }
    });
    jScrollPane5.setViewportView(jTable_elmndob_elwaset__insert);

    jPanel_elmndob_elwaset.add(jScrollPane5);
    jScrollPane5.setBounds(10, 38, 920, 242);
    jScrollPane5.setSize(width-320, 260);

    jPanel8.add(jPanel_elmndob_elwaset, "card_elmndob_elwaset");

    jPanel_add_client.add(jPanel8);
    jPanel8.setBounds(0, 225, 940, 300);
    jPanel8.setSize(width-310, 300);

    jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/addProject.png"))); // NOI18N
    jPanel_add_client.add(jLabel45);
    jLabel45.setBounds(830, 20, 70, 60);

    jLabel46.setFont(font.deriveFont(24f));
    jLabel46.setForeground(new java.awt.Color(153, 153, 153));
    jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel46.setText("اضافه عميل ");
    jPanel_add_client.add(jLabel46);
    jLabel46.setBounds(520, 30, 300, 40);
    jPanel_add_client.add(jSeparator16);
    jSeparator16.setBounds(600, 80, 340, 10);

    jLabel_add_client_b1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel_add_client_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b1MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b1);
    jLabel_add_client_b1.setBounds(720, 130, 70, 60);

    jLabel_add_client_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b2MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b2);
    jLabel_add_client_b2.setBounds(600, 130, 64, 60);

    jLabel_add_client_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b3MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b3);
    jLabel_add_client_b3.setBounds(480, 130, 64, 60);

    jLabel_add_client_b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b4MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b4);
    jLabel_add_client_b4.setBounds(360, 130, 64, 60);

    jLabel_add_client_b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b5MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b5);
    jLabel_add_client_b5.setBounds(240, 130, 64, 60);

    jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Settings-icon.png"))); // NOI18N
    jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel54MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel54);
    jLabel54.setBounds(830, 130, 64, 60);

    jPanel9.setBackground(new java.awt.Color(216, 215, 184));
    jPanel9.setLayout(null);

    jLabel28.setFont(font.deriveFont(14f));
    jLabel28.setForeground(new java.awt.Color(72, 72, 72));
    jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel28.setText("بحث تلقائي");
    jPanel9.add(jLabel28);
    jLabel28.setBounds(100, 10, 130, 40);

    jLabel39.setFont(font.deriveFont(14f));
    jLabel39.setForeground(new java.awt.Color(72, 72, 72));
    jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel39.setText("صيانه جديده");
    jPanel9.add(jLabel39);
    jLabel39.setBounds(100, 110, 130, 40);

    jLabel38.setFont(font.deriveFont(14f));
    jLabel38.setForeground(new java.awt.Color(72, 72, 72));
    jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel38.setText("عميل جديد");
    jPanel9.add(jLabel38);
    jLabel38.setBounds(100, 60, 130, 40);

    jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
    jCheckBox2.setForeground(new java.awt.Color(72, 72, 72));
    jPanel9.add(jCheckBox2);
    jCheckBox2.setBounds(10, 10, 230, 40);

    jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
    jCheckBox1.setForeground(new java.awt.Color(72, 72, 72));
    jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox1ActionPerformed(evt);
        }
    });
    jPanel9.add(jCheckBox1);
    jCheckBox1.setBounds(10, 60, 230, 40);

    jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
    jCheckBox7.setForeground(new java.awt.Color(72, 72, 72));
    jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox7ActionPerformed(evt);
        }
    });
    jPanel9.add(jCheckBox7);
    jCheckBox7.setBounds(10, 110, 230, 40);

    jPanel12.setBackground(new java.awt.Color(0, 173, 239));

    jLabel37.setFont(font.deriveFont(14f));
    jLabel37.setForeground(new java.awt.Color(255, 255, 255));
    jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/uplaodPic.png"))); // NOI18N
    jLabel37.setText("استيرد جدول اكسل");
    jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel37MouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 25, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel9.add(jPanel12);
    jPanel12.setBounds(10, 200, 230, 40);

    jTextField_xls.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_xls.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(234, 183, 55), null));
    jPanel9.add(jTextField_xls);
    jTextField_xls.setBounds(10, 270, 230, 30);

    jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(72, 72, 72));
    jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel40.setText("رقم الصف");
    jPanel9.add(jLabel40);
    jLabel40.setBounds(140, 240, 100, 30);

    jLabel41.setFont(font.deriveFont(16f));
    jLabel41.setForeground(new java.awt.Color(72, 72, 72));
    jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/add-icon.png"))); // NOI18N
    jLabel41.setText("قرأه");
    jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel41MouseReleased(evt);
        }
    });
    jPanel9.add(jLabel41);
    jLabel41.setBounds(80, 300, 110, 60);

    jPanel14.setBackground(new java.awt.Color(134, 33, 165));

    jLabel42.setFont(font.deriveFont(14f));
    jLabel42.setForeground(new java.awt.Color(255, 255, 255));
    jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/uplaodPic.png"))); // NOI18N
    jLabel42.setText("استيرد لخانات الكتابه ");
    jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel42MouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel14Layout.createSequentialGroup()
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 12, Short.MAX_VALUE))
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel9.add(jPanel14);
    jPanel14.setBounds(10, 410, 230, 40);

    jPanel15.setBackground(new java.awt.Color(134, 33, 165));

    jLabel43.setFont(font.deriveFont(14f));
    jLabel43.setForeground(new java.awt.Color(255, 255, 255));
    jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/Download (2).png"))); // NOI18N
    jLabel43.setText("تصدير خانات الكتابه   ");
    jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel43MouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
    jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 12, Short.MAX_VALUE))
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel9.add(jPanel15);
    jPanel15.setBounds(10, 460, 230, 40);

    jPanel17.setBackground(new java.awt.Color(134, 33, 165));

    jLabel44.setFont(font.deriveFont(14f));
    jLabel44.setForeground(new java.awt.Color(255, 255, 255));
    jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/exit.png"))); // NOI18N
    jLabel44.setText("مسح خانات الكتابه   ");
    jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel44MouseReleased(evt);
        }
    });

    javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
    jPanel17.setLayout(jPanel17Layout);
    jPanel17Layout.setHorizontalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel17Layout.createSequentialGroup()
            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 12, Short.MAX_VALUE))
    );
    jPanel17Layout.setVerticalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel9.add(jPanel17);
    jPanel17.setBounds(10, 510, 230, 40);
    jPanel9.add(jSeparator15);
    jSeparator15.setBounds(0, 380, 260, 10);
    jPanel9.add(jSeparator17);
    jSeparator17.setBounds(0, 170, 260, 10);

    jPanel_add_client.add(jPanel9);
    jPanel9.setBounds(950, 0, 250, 600);
    jPanel9.setSize(250,height);
    jPanel9.setLocation(width-280, 0);

    jPanel_add_client_p1.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p1.setLayout(null);

    jLabel_client_name.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_client_name.setFont(font.deriveFont(14f)
    );
    jLabel_client_name.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_client_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_client_name.setText("اسم العميل");
    jLabel_client_name.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_client_name);
    jLabel_client_name.setBounds(170, 110, 70, 30);

    jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel18MouseReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jLabel18);
    jLabel18.setBounds(20, 140, 30, 30);

    jTextField_name_client.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_name_client.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_client.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_client.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_name_client.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_name_client.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_clientKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_name_client);
    jTextField_name_client.setBounds(10, 140, 230, 31);

    jLabel_id_client.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client.setFont(font.deriveFont(14f)
    );
    jLabel_id_client.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client.setText("كود العميل");
    jLabel_id_client.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client);
    jLabel_id_client.setBounds(170, 50, 70, 30);

    jTextField_id_client.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_id_client.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_client.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_client.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_id_client.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_id_client.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField_id_clientActionPerformed(evt);
        }
    });
    jTextField_id_client.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_clientKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_id_client);
    jTextField_id_client.setBounds(10, 80, 230, 31);

    max_id_client.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    max_id_client.setForeground(new java.awt.Color(72, 72, 72));
    max_id_client.setText("0");
    jPanel_add_client_p1.add(max_id_client);
    max_id_client.setBounds(20, 50, 110, 30);

    jLabel_id_client2.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client2.setFont(font.deriveFont(14f)
    );
    jLabel_id_client2.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client2.setText("وظيفه العميل");
    jLabel_id_client2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client2);
    jLabel_id_client2.setBounds(150, 170, 90, 30);

    jTextField_job.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_job.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_job.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_job.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_job.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_job.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_jobKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_job);
    jTextField_job.setBounds(10, 200, 230, 31);

    jLabel_id_client11.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client11.setFont(font.deriveFont(14f)
    );
    jLabel_id_client11.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client11.setText("رقم المنزل");
    jLabel_id_client11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client11);
    jLabel_id_client11.setBounds(170, 230, 70, 30);

    jTextField_home_num.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_home_num.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_home_num.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_home_num.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_home_num.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_home_num.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_home_numKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_home_num);
    jTextField_home_num.setBounds(10, 260, 230, 31);

    jLabel_id_client4.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client4.setFont(font.deriveFont(14f)
    );
    jLabel_id_client4.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client4.setText("الشارع");
    jLabel_id_client4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client4);
    jLabel_id_client4.setBounds(170, 290, 70, 30);

    jTextField_street.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_street.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_street.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_street.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_street.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_street.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_streetKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_street);
    jTextField_street.setBounds(10, 320, 230, 31);

    jLabel_id_client5.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client5.setFont(font.deriveFont(14f)
    );
    jLabel_id_client5.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client5.setText("المركز");
    jLabel_id_client5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client5);
    jLabel_id_client5.setBounds(170, 350, 70, 30);

    jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel23MouseReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jLabel23);
    jLabel23.setBounds(20, 380, 30, 30);

    jTextField_region.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_region.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_region.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_region.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_region.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_region.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_regionKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_region);
    jTextField_region.setBounds(10, 380, 230, 31);

    jTextField_country.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_country.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_country.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_country.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_country.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_country.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_countryKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_country);
    jTextField_country.setBounds(10, 440, 230, 31);

    jTextField_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_phone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_phone.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone.setCaretColor(new java.awt.Color(234, 183, 55));
    jTextField_phone.setDisabledTextColor(new java.awt.Color(234, 183, 55));
    jTextField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phoneKeyReleased(evt);
        }
    });
    jPanel_add_client_p1.add(jTextField_phone);
    jTextField_phone.setBounds(10, 500, 230, 31);

    jLabel_id_client6.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client6.setFont(font.deriveFont(14f)
    );
    jLabel_id_client6.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client6.setText("المحافظه");
    jLabel_id_client6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client6);
    jLabel_id_client6.setBounds(170, 410, 70, 30);

    jLabel_id_client7.setBackground(new java.awt.Color(72, 72, 72));
    jLabel_id_client7.setFont(font.deriveFont(14f)
    );
    jLabel_id_client7.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client7.setText("التليفون");
    jLabel_id_client7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
    jPanel_add_client_p1.add(jLabel_id_client7);
    jLabel_id_client7.setBounds(170, 470, 70, 30);

    jPanel_add_client.add(jPanel_add_client_p1);
    jPanel_add_client_p1.setBounds(950, 0, 250, 0);
    jPanel_add_client_p1.setLocation(width-280, 0);

    jPanel_add_client_p2.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p2.setLayout(null);

    jLabel_id_client13.setBackground(java.awt.Color.white);
    jLabel_id_client13.setFont(font.deriveFont(14f));
    jLabel_id_client13.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client13.setText("سعر المنتج");
    jPanel_add_client_p2.add(jLabel_id_client13);
    jLabel_id_client13.setBounds(20, 230, 220, 30);
    jLabel_id_client13.getAccessibleContext().setAccessibleName("");

    jTextField_price_product.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_price_product.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_price_product.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_price_product.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_price_productKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_price_product);
    jTextField_price_product.setBounds(10, 260, 230, 31);

    jLabel_id_client14.setBackground(java.awt.Color.white);
    jLabel_id_client14.setFont(font.deriveFont(14f));
    jLabel_id_client14.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client14.setText("المقدم");
    jPanel_add_client_p2.add(jLabel_id_client14);
    jLabel_id_client14.setBounds(30, 290, 210, 30);
    jLabel_id_client14.getAccessibleContext().setAccessibleName("");

    jTextField_elmkdm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_elmkdm.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_elmkdm.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_elmkdm.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_elmkdmKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_elmkdm);
    jTextField_elmkdm.setBounds(10, 320, 230, 31);

    jTextField_el2st.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_el2st.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_el2st.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_el2st.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_el2stKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_el2st);
    jTextField_el2st.setBounds(10, 380, 230, 31);

    jLabel_id_client15.setBackground(java.awt.Color.white);
    jLabel_id_client15.setFont(font.deriveFont(14f));
    jLabel_id_client15.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client15.setText("القسط");
    jPanel_add_client_p2.add(jLabel_id_client15);
    jLabel_id_client15.setBounds(30, 350, 210, 30);
    jLabel_id_client15.getAccessibleContext().setAccessibleName("");

    jLabel_id_client104.setBackground(java.awt.Color.white);
    jLabel_id_client104.setFont(font.deriveFont(14f));
    jLabel_id_client104.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client104.setText("الكميه المتاحه");
    jPanel_add_client_p2.add(jLabel_id_client104);
    jLabel_id_client104.setBounds(20, 410, 220, 30);
    jLabel_id_client104.getAccessibleContext().setAccessibleName("");

    jTextField_all_quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_all_quantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_all_quantity.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_all_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_all_quantityKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_all_quantity);
    jTextField_all_quantity.setBounds(10, 440, 230, 31);

    jLabel_id_client16.setBackground(java.awt.Color.white);
    jLabel_id_client16.setFont(font.deriveFont(14f));
    jLabel_id_client16.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client16.setText("الكميه المطلوبه");
    jPanel_add_client_p2.add(jLabel_id_client16);
    jLabel_id_client16.setBounds(20, 470, 220, 30);
    jLabel_id_client16.getAccessibleContext().setAccessibleName("");

    jTextField_quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_quantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_quantity.setText("1");
    jTextField_quantity.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_quantityKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_quantity);
    jTextField_quantity.setBounds(10, 500, 230, 31);

    jLabel_id_client9.setBackground(java.awt.Color.white);
    jLabel_id_client9.setFont(font.deriveFont(14f));
    jLabel_id_client9.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client9.setText("كود المنتج ");
    jPanel_add_client_p2.add(jLabel_id_client9);
    jLabel_id_client9.setBounds(150, 50, 90, 30);
    jLabel_id_client9.getAccessibleContext().setAccessibleName("");

    max_id_product.setText("0");
    jPanel_add_client_p2.add(max_id_product);
    max_id_product.setBounds(20, 50, 110, 30);

    jTextField_id_product.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_id_product.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_product.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_product.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_productKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_id_product);
    jTextField_id_product.setBounds(10, 80, 230, 30);

    jLabel_id_client8.setBackground(java.awt.Color.white);
    jLabel_id_client8.setFont(font.deriveFont(14f));
    jLabel_id_client8.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client8.setText("اسم المنتج");
    jPanel_add_client_p2.add(jLabel_id_client8);
    jLabel_id_client8.setBounds(150, 110, 90, 30);
    jLabel_id_client8.getAccessibleContext().setAccessibleName("");

    jLabel20.setForeground(new java.awt.Color(72, 72, 72));
    jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel20MouseReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jLabel20);
    jLabel20.setBounds(20, 140, 30, 30);

    jTextField_name_product.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_name_product.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_product.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_product.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_product11KeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_name_product);
    jTextField_name_product.setBounds(10, 140, 230, 31);

    jLabel_id_client10.setBackground(java.awt.Color.white);
    jLabel_id_client10.setFont(font.deriveFont(14f));
    jLabel_id_client10.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client10.setText("عدد شمعات المنتج");
    jPanel_add_client_p2.add(jLabel_id_client10);
    jLabel_id_client10.setBounds(60, 170, 180, 30);
    jLabel_id_client10.getAccessibleContext().setAccessibleName("");

    jTextField_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_type.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_type.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_type.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_typeKeyReleased(evt);
        }
    });
    jPanel_add_client_p2.add(jTextField_type);
    jTextField_type.setBounds(10, 200, 230, 31);

    jPanel_add_client.add(jPanel_add_client_p2);
    jPanel_add_client_p2.setBounds(950, 0, 250, 0);
    jPanel_add_client_p2.setLocation(width-280, 0);

    jPanel_add_client_p3.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p3.setLayout(null);

    jLabel_id_client21.setBackground(java.awt.Color.white);
    jLabel_id_client21.setFont(font.deriveFont(14f));
    jLabel_id_client21.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client21.setText("تاريخ الشمعه7");
    jPanel_add_client_p3.add(jLabel_id_client21);
    jLabel_id_client21.setBounds(20, 410, 220, 30);

    jTextField_date_7_in.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_7_in.setDateFormatString("yyyy-MM-dd");
    jTextField_date_7_in.setFocusTraversalPolicyProvider(true);
    jTextField_date_7_in.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p3.add(jTextField_date_7_in);
    jTextField_date_7_in.setBounds(10, 440, 230, 30);

    jLabel_id_client57.setBackground(java.awt.Color.white);
    jLabel_id_client57.setFont(font.deriveFont(14f));
    jLabel_id_client57.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client57.setText("رصيد الشمعه1");
    jPanel_add_client_p3.add(jLabel_id_client57);
    jLabel_id_client57.setBounds(20, 470, 220, 30);

    jTextField_rsed_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_1.setText("0");
    jTextField_rsed_1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_rsed_1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_rsed_1KeyReleased(evt);
        }
    });
    jPanel_add_client_p3.add(jTextField_rsed_1);
    jTextField_rsed_1.setBounds(10, 500, 230, 30);

    jLabel_id_client56.setBackground(java.awt.Color.white);
    jLabel_id_client56.setFont(font.deriveFont(14f));
    jLabel_id_client56.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client56.setText("تاريخ الشمعه 6");
    jPanel_add_client_p3.add(jLabel_id_client56);
    jLabel_id_client56.setBounds(20, 350, 220, 30);

    jTextField_date_6_in.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_6_in.setDateFormatString("yyyy-MM-dd");
    jTextField_date_6_in.setFocusTraversalPolicyProvider(true);
    jTextField_date_6_in.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p3.add(jTextField_date_6_in);
    jTextField_date_6_in.setBounds(10, 380, 230, 30);

    jTextField_date_5.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_5.setDateFormatString("yyyy-MM-dd");
    jTextField_date_5.setFocusTraversalPolicyProvider(true);
    jTextField_date_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p3.add(jTextField_date_5);
    jTextField_date_5.setBounds(10, 320, 230, 30);

    jLabel_id_client20.setBackground(java.awt.Color.white);
    jLabel_id_client20.setFont(font.deriveFont(14f));
    jLabel_id_client20.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client20.setText("تاريخ الشمعه 5");
    jPanel_add_client_p3.add(jLabel_id_client20);
    jLabel_id_client20.setBounds(20, 290, 220, 30);

    jTextField_date_3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_3.setDateFormatString("yyyy-MM-dd");
    jTextField_date_3.setFocusTraversalPolicyProvider(true);
    jTextField_date_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p3.add(jTextField_date_3);
    jTextField_date_3.setBounds(10, 260, 230, 30);

    jLabel_id_client55.setBackground(java.awt.Color.white);
    jLabel_id_client55.setFont(font.deriveFont(14f));
    jLabel_id_client55.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client55.setText("تاريخ الشمعه 3");
    jPanel_add_client_p3.add(jLabel_id_client55);
    jLabel_id_client55.setBounds(30, 230, 210, 30);

    jTextField_date_2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_2.setDateFormatString("yyyy-MM-dd");
    jTextField_date_2.setFocusTraversalPolicyProvider(true);
    jTextField_date_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p3.add(jTextField_date_2);
    jTextField_date_2.setBounds(10, 200, 230, 30);

    jLabel_id_client19.setBackground(java.awt.Color.white);
    jLabel_id_client19.setFont(font.deriveFont(14f));
    jLabel_id_client19.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client19.setText("تاريخ الشمعه 2");
    jPanel_add_client_p3.add(jLabel_id_client19);
    jLabel_id_client19.setBounds(110, 170, 130, 30);

    jTextField_date1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date1.setDateFormatString("yyyy-MM-dd");
    jTextField_date1.setFocusTraversalPolicyProvider(true);
    jTextField_date1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_date1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_date1KeyReleased(evt);
        }
    });
    jPanel_add_client_p3.add(jTextField_date1);
    jTextField_date1.setBounds(10, 140, 230, 30);

    jLabel_id_client18.setBackground(java.awt.Color.white);
    jLabel_id_client18.setFont(font.deriveFont(14f));
    jLabel_id_client18.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client18.setText("تاريخ الشمعه 1");
    jPanel_add_client_p3.add(jLabel_id_client18);
    jLabel_id_client18.setBounds(120, 110, 120, 30);

    jTextField_dte_buy.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_dte_buy.setDateFormatString("yyyy-MM-dd");
    jTextField_dte_buy.setFocusTraversalPolicyProvider(true);
    jTextField_dte_buy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_dte_buy.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_dte_buyKeyReleased(evt);
        }
    });
    jPanel_add_client_p3.add(jTextField_dte_buy);
    jTextField_dte_buy.setBounds(10, 80, 230, 30);

    jLabel_id_client17.setBackground(java.awt.Color.white);
    jLabel_id_client17.setFont(font.deriveFont(14f));
    jLabel_id_client17.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client17.setText("تاريخ الشراء");
    jPanel_add_client_p3.add(jLabel_id_client17);
    jLabel_id_client17.setBounds(140, 50, 100, 30);

    jPanel_add_client.add(jPanel_add_client_p3);
    jPanel_add_client_p3.setBounds(950, 0, 250, 0);
    jPanel_add_client_p3.setLocation(width-280, 0);

    jPanel_add_client_p4.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p4.setLayout(null);

    jTextField_date_el2st.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_el2st.setDateFormatString("yyyy-MM-dd");
    jTextField_date_el2st.setFocusTraversalPolicyProvider(true);
    jTextField_date_el2st.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p4.add(jTextField_date_el2st);
    jTextField_date_el2st.setBounds(10, 440, 230, 30);

    jLabel_id_client26.setBackground(java.awt.Color.white);
    jLabel_id_client26.setFont(font.deriveFont(14f));
    jLabel_id_client26.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client26.setText("تاريخ القسط");
    jPanel_add_client_p4.add(jLabel_id_client26);
    jLabel_id_client26.setBounds(20, 410, 220, 30);

    jTextField_nezam_eldf3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_nezam_eldf3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_nezam_eldf3.setText("0");
    jTextField_nezam_eldf3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_nezam_eldf3.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_nezam_eldf3KeyReleased(evt);
        }
    });
    jPanel_add_client_p4.add(jTextField_nezam_eldf3);
    jTextField_nezam_eldf3.setBounds(10, 380, 230, 31);

    jLabel_id_client25.setBackground(java.awt.Color.white);
    jLabel_id_client25.setFont(font.deriveFont(14f));
    jLabel_id_client25.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client25.setText("نظام الدفع");
    jPanel_add_client_p4.add(jLabel_id_client25);
    jLabel_id_client25.setBounds(30, 350, 210, 30);

    jTextField_hints.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_hints.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_hints.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_hints.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_hintsKeyReleased(evt);
        }
    });
    jPanel_add_client_p4.add(jTextField_hints);
    jTextField_hints.setBounds(10, 500, 230, 31);

    jLabel_id_client24.setBackground(java.awt.Color.white);
    jLabel_id_client24.setFont(font.deriveFont(14f));
    jLabel_id_client24.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client24.setText("ملاحظات");
    jPanel_add_client_p4.add(jLabel_id_client24);
    jLabel_id_client24.setBounds(20, 470, 220, 30);

    jTextField_rsed_7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_rsed_7.setText("0");
    jTextField_rsed_7.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p4.add(jTextField_rsed_7);
    jTextField_rsed_7.setBounds(10, 320, 230, 31);

    jLabel_id_client61.setBackground(java.awt.Color.white);
    jLabel_id_client61.setFont(font.deriveFont(14f));
    jLabel_id_client61.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client61.setText("رصيد الشمعه 7");
    jPanel_add_client_p4.add(jLabel_id_client61);
    jLabel_id_client61.setBounds(30, 290, 210, 30);

    jTextField_rsed_6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_rsed_6.setText("0");
    jTextField_rsed_6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p4.add(jTextField_rsed_6);
    jTextField_rsed_6.setBounds(10, 260, 230, 31);

    jLabel_id_client60.setBackground(java.awt.Color.white);
    jLabel_id_client60.setFont(font.deriveFont(14f));
    jLabel_id_client60.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client60.setText("رصيد الشمعه 6");
    jPanel_add_client_p4.add(jLabel_id_client60);
    jLabel_id_client60.setBounds(20, 230, 220, 30);

    jTextField_rsed_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_rsed_5.setText("0");
    jTextField_rsed_5.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p4.add(jTextField_rsed_5);
    jTextField_rsed_5.setBounds(10, 200, 230, 31);

    jLabel_id_client62.setBackground(java.awt.Color.white);
    jLabel_id_client62.setFont(font.deriveFont(14f));
    jLabel_id_client62.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client62.setText("رصيد الشمعه 5");
    jPanel_add_client_p4.add(jLabel_id_client62);
    jLabel_id_client62.setBounds(20, 170, 220, 30);

    jTextField_rsed_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_rsed_3.setText("0");
    jTextField_rsed_3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p4.add(jTextField_rsed_3);
    jTextField_rsed_3.setBounds(10, 140, 230, 31);

    jLabel_id_client59.setBackground(java.awt.Color.white);
    jLabel_id_client59.setFont(font.deriveFont(14f));
    jLabel_id_client59.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client59.setText("رصيد الشمعه 3");
    jPanel_add_client_p4.add(jLabel_id_client59);
    jLabel_id_client59.setBounds(20, 110, 220, 30);

    jTextField_rsed_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_rsed_2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_rsed_2.setText("0");
    jTextField_rsed_2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p4.add(jTextField_rsed_2);
    jTextField_rsed_2.setBounds(10, 80, 230, 31);

    jLabel_id_client58.setBackground(java.awt.Color.white);
    jLabel_id_client58.setFont(font.deriveFont(14f));
    jLabel_id_client58.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client58.setText("رصيد الشمعه 2");
    jPanel_add_client_p4.add(jLabel_id_client58);
    jLabel_id_client58.setBounds(20, 50, 220, 30);

    jPanel_add_client.add(jPanel_add_client_p4);
    jPanel_add_client_p4.setBounds(950, 0, 250, 0);
    jPanel_add_client_p4.setLocation(width-280, 0);

    jPanel_add_client_p5.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p5.setLayout(null);

    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel22MouseReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jLabel22);
    jLabel22.setBounds(20, 380, 32, 30);

    jTextField_phone_elmndob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_phone_elmndob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_phone_elmndob.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone_elmndob.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phone_elmndobKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_phone_elmndob);
    jTextField_phone_elmndob.setBounds(10, 500, 230, 30);

    jLabel_id_client32.setBackground(java.awt.Color.white);
    jLabel_id_client32.setFont(font.deriveFont(14f));
    jLabel_id_client32.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client32.setText("تليفون المندوب ");
    jPanel_add_client_p5.add(jLabel_id_client32);
    jLabel_id_client32.setBounds(10, 470, 230, 30);

    jTextField_id_elmndob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_id_elmndob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_elmndob.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_elmndob.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_elmndobKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_id_elmndob);
    jTextField_id_elmndob.setBounds(10, 440, 230, 31);

    jLabel_id_client35.setBackground(java.awt.Color.white);
    jLabel_id_client35.setFont(font.deriveFont(14f));
    jLabel_id_client35.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client35.setText("كود المندوب ");
    jPanel_add_client_p5.add(jLabel_id_client35);
    jLabel_id_client35.setBounds(120, 410, 120, 30);

    max_id_elmndob.setForeground(new java.awt.Color(72, 72, 72));
    max_id_elmndob.setText("0");
    jPanel_add_client_p5.add(max_id_elmndob);
    max_id_elmndob.setBounds(20, 410, 110, 30);

    jTextField_name_elmndob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_name_elmndob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_elmndob.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_elmndob.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_elmndobKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_name_elmndob);
    jTextField_name_elmndob.setBounds(10, 380, 230, 31);

    jLabel_id_client28.setBackground(java.awt.Color.white);
    jLabel_id_client28.setFont(font.deriveFont(14f));
    jLabel_id_client28.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client28.setText("اسم المندوب ");
    jPanel_add_client_p5.add(jLabel_id_client28);
    jLabel_id_client28.setBounds(10, 350, 230, 30);

    jTextField_places.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_places.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_places.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_places.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_placesKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_places);
    jTextField_places.setBounds(10, 320, 230, 31);

    jLabel_id_client31.setBackground(java.awt.Color.white);
    jLabel_id_client31.setFont(font.deriveFont(14f));
    jLabel_id_client31.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client31.setText("اماكن الفني");
    jPanel_add_client_p5.add(jLabel_id_client31);
    jLabel_id_client31.setBounds(70, 290, 170, 30);

    jTextField_phone_elfne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_phone_elfne.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_phone_elfne.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone_elfne.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phone_elfneKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_phone_elfne);
    jTextField_phone_elfne.setBounds(10, 260, 230, 31);

    jLabel_id_client30.setBackground(java.awt.Color.white);
    jLabel_id_client30.setFont(font.deriveFont(14f));
    jLabel_id_client30.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client30.setText("تليفون الفني");
    jPanel_add_client_p5.add(jLabel_id_client30);
    jLabel_id_client30.setBounds(20, 230, 220, 30);

    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel21MouseReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jLabel21);
    jLabel21.setBounds(20, 200, 32, 30);

    jTextField_name_elfne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_name_elfne.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_elfne.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_elfne.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_elfne3KeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_name_elfne);
    jTextField_name_elfne.setBounds(10, 200, 230, 31);

    jLabel_id_client22.setBackground(java.awt.Color.white);
    jLabel_id_client22.setFont(font.deriveFont(14f));
    jLabel_id_client22.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client22.setText("اسم الفني");
    jPanel_add_client_p5.add(jLabel_id_client22);
    jLabel_id_client22.setBounds(20, 170, 220, 30);

    jTextField_id_elfne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_id_elfne.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_elfne.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_elfne.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_elfneKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_id_elfne);
    jTextField_id_elfne.setBounds(10, 140, 230, 31);

    max_id_elfne.setForeground(new java.awt.Color(72, 72, 72));
    max_id_elfne.setText("0");
    jPanel_add_client_p5.add(max_id_elfne);
    max_id_elfne.setBounds(20, 110, 130, 30);

    jLabel_id_client23.setBackground(java.awt.Color.white);
    jLabel_id_client23.setFont(font.deriveFont(14f));
    jLabel_id_client23.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client23.setText("كود الفني");
    jPanel_add_client_p5.add(jLabel_id_client23);
    jLabel_id_client23.setBounds(160, 110, 80, 30);

    jLabel_id_client27.setBackground(java.awt.Color.white);
    jLabel_id_client27.setFont(font.deriveFont(14f));
    jLabel_id_client27.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client27.setText("الباقي");
    jPanel_add_client_p5.add(jLabel_id_client27);
    jLabel_id_client27.setBounds(20, 50, 220, 30);

    jTextField_elba2e.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_elba2e.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_elba2e.setText("0");
    jTextField_elba2e.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_elba2e.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_elba2eKeyReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jTextField_elba2e);
    jTextField_elba2e.setBounds(10, 80, 230, 31);

    jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/clear.png"))); // NOI18N
    jLabel87.setToolTipText("مسح الأماكن");
    jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel87MouseReleased(evt);
        }
    });
    jPanel_add_client_p5.add(jLabel87);
    jLabel87.setBounds(10, 290, 30, 30);

    jPanel_add_client.add(jPanel_add_client_p5);
    jPanel_add_client_p5.setBounds(950, 0, 250, 0);
    jPanel_add_client_p5.setLocation(width-280, 0);

    jPanel_Add_client_p6.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_Add_client_p6.setLayout(null);

    jTextField_siana_6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_6.setText("24");
    jTextField_siana_6.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_siana_6.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_siana_6KeyReleased(evt);
        }
    });
    jPanel_Add_client_p6.add(jTextField_siana_6);
    jTextField_siana_6.setBounds(10, 500, 230, 31);

    jLabel_id_client231.setBackground(java.awt.Color.white);
    jLabel_id_client231.setFont(font.deriveFont(14f));
    jLabel_id_client231.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client231.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client231.setText("موعد الشمعه  6");
    jPanel_Add_client_p6.add(jLabel_id_client231);
    jLabel_id_client231.setBounds(10, 470, 230, 30);

    jTextField_siana_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_5.setText("12");
    jTextField_siana_5.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_Add_client_p6.add(jTextField_siana_5);
    jTextField_siana_5.setBounds(10, 440, 230, 31);

    jLabel_id_client230.setBackground(java.awt.Color.white);
    jLabel_id_client230.setFont(font.deriveFont(14f));
    jLabel_id_client230.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client230.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client230.setText("موعد الشمعه 5");
    jPanel_Add_client_p6.add(jLabel_id_client230);
    jLabel_id_client230.setBounds(20, 410, 220, 30);

    jTextField_siana_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_3.setText("4");
    jTextField_siana_3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_Add_client_p6.add(jTextField_siana_3);
    jTextField_siana_3.setBounds(10, 380, 230, 31);

    jLabel_id_client229.setBackground(java.awt.Color.white);
    jLabel_id_client229.setFont(font.deriveFont(14f));
    jLabel_id_client229.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client229.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client229.setText("موعد الشمعه 3");
    jPanel_Add_client_p6.add(jLabel_id_client229);
    jLabel_id_client229.setBounds(20, 350, 220, 30);

    jTextField_siana_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_2.setText("4");
    jTextField_siana_2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_Add_client_p6.add(jTextField_siana_2);
    jTextField_siana_2.setBounds(10, 320, 230, 31);

    jLabel_id_client228.setBackground(java.awt.Color.white);
    jLabel_id_client228.setFont(font.deriveFont(14f));
    jLabel_id_client228.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client228.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client228.setText("موعد الشمعه 2");
    jPanel_Add_client_p6.add(jLabel_id_client228);
    jLabel_id_client228.setBounds(20, 290, 220, 30);

    jTextField_siana_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_1.setText("2");
    jTextField_siana_1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_Add_client_p6.add(jTextField_siana_1);
    jTextField_siana_1.setBounds(10, 260, 230, 31);

    jLabel_id_client227.setBackground(java.awt.Color.white);
    jLabel_id_client227.setFont(font.deriveFont(14f));
    jLabel_id_client227.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client227.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client227.setText("موعد الشمعه 1");
    jPanel_Add_client_p6.add(jLabel_id_client227);
    jLabel_id_client227.setBounds(20, 230, 220, 30);

    jTextField_total_elb2e_siana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_total_elb2e_siana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_total_elb2e_siana.setText("0");
    jTextField_total_elb2e_siana.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_total_elb2e_siana.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_total_elb2e_sianaKeyReleased(evt);
        }
    });
    jPanel_Add_client_p6.add(jTextField_total_elb2e_siana);
    jTextField_total_elb2e_siana.setBounds(10, 200, 230, 30);

    jTextField_class.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_class.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_class.setText("A");
    jTextField_class.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_class.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_classKeyReleased(evt);
        }
    });
    jPanel_Add_client_p6.add(jTextField_class);
    jTextField_class.setBounds(120, 140, 110, 30);

    jLabel_id_client63.setBackground(java.awt.Color.white);
    jLabel_id_client63.setFont(font.deriveFont(14f));
    jLabel_id_client63.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client63.setText("الفئه");
    jPanel_Add_client_p6.add(jLabel_id_client63);
    jLabel_id_client63.setBounds(70, 110, 170, 30);

    jComboBox_class_add_client.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox_class_add_clientActionPerformed(evt);
        }
    });
    jPanel_Add_client_p6.add(jComboBox_class_add_client);
    jComboBox_class_add_client.setBounds(10, 140, 110, 30);

    jTextField_date_regist.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_regist.setDateFormatString("yyyy-MM-dd");
    jTextField_date_regist.setFocusTraversalPolicyProvider(true);
    jTextField_date_regist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_Add_client_p6.add(jTextField_date_regist);
    jTextField_date_regist.setBounds(10, 80, 230, 30);

    jLabel_id_client33.setBackground(java.awt.Color.white);
    jLabel_id_client33.setFont(font.deriveFont(14f));
    jLabel_id_client33.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client33.setText("تاريخ التسجل");
    jPanel_Add_client_p6.add(jLabel_id_client33);
    jLabel_id_client33.setBounds(20, 50, 220, 30);

    jLabel_id_client64.setBackground(java.awt.Color.white);
    jLabel_id_client64.setFont(font.deriveFont(14f));
    jLabel_id_client64.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client64.setText("المتبقي من الصيانه");
    jPanel_Add_client_p6.add(jLabel_id_client64);
    jLabel_id_client64.setBounds(20, 170, 220, 30);

    jPanel_add_client.add(jPanel_Add_client_p6);
    jPanel_Add_client_p6.setBounds(950, 0, 250, 0);
    jPanel_Add_client_p6.setLocation(width-280, 0);

    jPanel_add_client_p7.setBackground(new java.awt.Color(216, 215, 184));
    jPanel_add_client_p7.setLayout(null);

    jLabel_ss2.setBackground(java.awt.Color.white);
    jLabel_ss2.setFont(font.deriveFont(14f));
    jLabel_ss2.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_ss2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_ss2.setText("المستهدف");
    jPanel_add_client_p7.add(jLabel_ss2);
    jLabel_ss2.setBounds(30, 480, 210, 30);

    jTextField_elmosthdaf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_elmosthdaf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_elmosthdaf.setText("6");
    jTextField_elmosthdaf.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_elmosthdaf.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_elmosthdafKeyReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jTextField_elmosthdaf);
    jTextField_elmosthdaf.setBounds(10, 510, 230, 30);

    jTextField_date_remake_class.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_date_remake_class.setDateFormatString("yyyy-MM-dd");
    jTextField_date_remake_class.setFocusTraversalPolicyProvider(true);
    jTextField_date_remake_class.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p7.add(jTextField_date_remake_class);
    jTextField_date_remake_class.setBounds(10, 450, 230, 30);

    jLabel_ss.setBackground(java.awt.Color.white);
    jLabel_ss.setFont(font.deriveFont(14f));
    jLabel_ss.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_ss.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_ss.setText("تاريخ تعديل الفئه");
    jPanel_add_client_p7.add(jLabel_ss);
    jLabel_ss.setBounds(20, 420, 220, 30);

    jTextField_num_month_class.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_num_month_class.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_num_month_class.setText("12");
    jTextField_num_month_class.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_num_month_class.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_num_month_classKeyReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jTextField_num_month_class);
    jTextField_num_month_class.setBounds(10, 380, 230, 31);

    jLabel_ss1.setBackground(java.awt.Color.white);
    jLabel_ss1.setFont(font.deriveFont(14f));
    jLabel_ss1.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_ss1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_ss1.setText("عدد الشهور لتعديل الفئه");
    jPanel_add_client_p7.add(jLabel_ss1);
    jLabel_ss1.setBounds(20, 350, 220, 30);

    jTextField_trkeb_dead_line.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_trkeb_dead_line.setDateFormatString("yyyy-MM-dd");
    jTextField_trkeb_dead_line.setFocusTraversalPolicyProvider(true);
    jTextField_trkeb_dead_line.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jPanel_add_client_p7.add(jTextField_trkeb_dead_line);
    jTextField_trkeb_dead_line.setBounds(10, 320, 230, 30);

    jLabel_id_client29.setBackground(java.awt.Color.white);
    jLabel_id_client29.setFont(font.deriveFont(14f));
    jLabel_id_client29.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client29.setText("تاريخ الموت لتركيب");
    jPanel_add_client_p7.add(jLabel_id_client29);
    jLabel_id_client29.setBounds(20, 290, 220, 30);

    jTextField_phone_elmndob_elwaset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_phone_elmndob_elwaset.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_phone_elmndob_elwaset.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_phone_elmndob_elwaset.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_phone_elmndob_elwasetKeyReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jTextField_phone_elmndob_elwaset);
    jTextField_phone_elmndob_elwaset.setBounds(10, 260, 230, 31);

    jLabel_id_client37.setBackground(java.awt.Color.white);
    jLabel_id_client37.setFont(font.deriveFont(14f));
    jLabel_id_client37.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client37.setText("تليفون المندوب الوسيط");
    jPanel_add_client_p7.add(jLabel_id_client37);
    jLabel_id_client37.setBounds(30, 230, 210, 30);

    jTextField_id_elmndob_elwaset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_id_elmndob_elwaset.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_id_elmndob_elwaset.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_id_elmndob_elwaset.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_id_elmndob_elwasetKeyReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jTextField_id_elmndob_elwaset);
    jTextField_id_elmndob_elwaset.setBounds(10, 200, 230, 31);

    jLabel_id_client34.setBackground(java.awt.Color.white);
    jLabel_id_client34.setFont(font.deriveFont(14f));
    jLabel_id_client34.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client34.setText("كود المندوب الوسيط");
    jPanel_add_client_p7.add(jLabel_id_client34);
    jLabel_id_client34.setBounds(110, 170, 130, 30);

    max_id_elmndob_elwaset.setText("0");
    jPanel_add_client_p7.add(max_id_elmndob_elwaset);
    max_id_elmndob_elwaset.setBounds(20, 170, 90, 30);

    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/search.png"))); // NOI18N
    jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel19MouseReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jLabel19);
    jLabel19.setBounds(20, 140, 24, 30);

    jTextField_name_elmndob_elwaset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_name_elmndob_elwaset.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_name_elmndob_elwaset.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jTextField_name_elmndob_elwaset.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField_name_elmndob_elwasetKeyReleased(evt);
        }
    });
    jPanel_add_client_p7.add(jTextField_name_elmndob_elwaset);
    jTextField_name_elmndob_elwaset.setBounds(10, 140, 230, 31);

    jLabel_id_client36.setBackground(java.awt.Color.white);
    jLabel_id_client36.setFont(font.deriveFont(14f));
    jLabel_id_client36.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client36.setText("اسم المندوب الوسيط");
    jPanel_add_client_p7.add(jLabel_id_client36);
    jLabel_id_client36.setBounds(90, 110, 150, 30);

    jTextField_siana_7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jTextField_siana_7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    jTextField_siana_7.setText("24");
    jTextField_siana_7.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(234, 183, 55)));
    jPanel_add_client_p7.add(jTextField_siana_7);
    jTextField_siana_7.setBounds(10, 80, 230, 31);

    jLabel_id_client232.setBackground(java.awt.Color.white);
    jLabel_id_client232.setFont(font.deriveFont(14f));
    jLabel_id_client232.setForeground(new java.awt.Color(72, 72, 72));
    jLabel_id_client232.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel_id_client232.setText("موعد الشمعه  7");
    jPanel_add_client_p7.add(jLabel_id_client232);
    jLabel_id_client232.setBounds(20, 50, 220, 30);

    jPanel_add_client.add(jPanel_add_client_p7);
    jPanel_add_client_p7.setBounds(950, 0, 250, 0);
    jPanel_add_client_p7.setLocation(width-280, 0);

    jLabel60.setBackground(new java.awt.Color(255, 255, 255));
    jLabel60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel60.setForeground(new java.awt.Color(255, 255, 255));
    jLabel60.setText("7");
    jPanel_add_client.add(jLabel60);
    jLabel60.setBounds(45, 135, 20, 50);

    jLabel_add_client_b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b7MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b7);
    jLabel_add_client_b7.setBounds(20, 130, 64, 60);

    jLabel61.setBackground(new java.awt.Color(255, 255, 255));
    jLabel61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel61.setForeground(new java.awt.Color(255, 255, 255));
    jLabel61.setText("6");
    jPanel_add_client.add(jLabel61);
    jLabel61.setBounds(155, 135, 20, 50);

    jLabel_add_client_b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph/icons/playstation-circle-dark-icon.png"))); // NOI18N
    jLabel_add_client_b6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jLabel_add_client_b6MouseReleased(evt);
        }
    });
    jPanel_add_client.add(jLabel_add_client_b6);
    jLabel_add_client_b6.setBounds(130, 130, 64, 60);

    jPanel24.setBackground(new java.awt.Color(227, 60, 67));

    javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
    jPanel24.setLayout(jPanel24Layout);
    jPanel24Layout.setHorizontalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 70, Short.MAX_VALUE)
    );
    jPanel24Layout.setVerticalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 4, Short.MAX_VALUE)
    );

    jPanel_add_client.add(jPanel24);
    jPanel24.setBounds(830, 200, 70, 4);

    jLayeredPane3.add(jPanel_add_client);
    jPanel_add_client.setBounds(0, 100, 1700, 700);
    jPanel_add_client.getAccessibleContext().setAccessibleName("");

    jScrollPane47.add(jLayeredPane3);
    jLayeredPane3.setBounds(0, 0, 3200, 2600);

    getContentPane().add(jScrollPane47);
    jScrollPane47.setBounds(0, 0, 3200, 2600);

    jTable_siana_help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
    jTable_siana_help.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "كود العميل", "اسم العميل", "المركز", "تليفون", "ملاحظات", "كود المنتج", "اسم المنتج", "الكميه", "تاريخ الشراء", "موعد الشمعه1", "موعد الشمعه2", "موعد الشمعه3", "موعد الشمعه 5", "موعد الشمعه6", "موعد الشمعه7", "نوع الصيانه", "العطل", "تاريخ العطل", "نظام الدفع", "تاريخ الحد الأقصي للعطل", "قسط المنتج", "تاريخ القسط", "المبلغ المتبقي", "مده الشمعه1", "مده الشمعه2", "مده الشمعه3", "مده الشمعه5", "مده الشمعه6", "مده الشمعه7", "رصيد الشمعه1", "رصيد الشمعه2", "رصيد الشمعه3", "رصيد الشمعه 5", "رصيد الشمعه 6", "رصيد الشمعه 7", "المبلغ المتبقي من الصيانات", "الفئه", "المستهدف", "تاريخ تعديل الفئه", "تعدد الشهول لتعديل الفئه", "رقم المنزل", "الشارع", "المحافظه", "الرقم المسلسل", "اخر صيانة", "تاريخ اخر صيانة", "الوظيفة", "الي", "Title 49", "Title 50", "Title 51"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, true, true, true, true, false, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_siana_help.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_siana_help.setSelectionBackground(new java.awt.Color(0, 51, 153));
    jTable_siana_help.setSelectionForeground(new java.awt.Color(204, 0, 204));
    jTable_siana_help.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_siana_helpMouseReleased(evt);
        }
    });
    jTable_siana_help.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTable_siana_helpKeyReleased(evt);
        }
    });
    jScrollPane19.setViewportView(jTable_siana_help);

    jTable_trkeb_help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
    jTable_trkeb_help.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "الوظيفه", "كود العميل", "اسم العميل", "رقم المنزل", "الشارع", "المركز", "المحافظه", "تليفون", "كود المنتج", "اسم المنتج", "عدد شمعات المنتج", "الكميه", "تاريخ التسجل", "ملاحظات", "نظام الدفع", "كود المندوب", "الفئه", "موعد الشمعه 1", "موعد الشمعه 2", "موعد الشمعه 3", "موعد الشمعه 5", "موعد الشمعه 6", "موعد الشمعه 7", "تاريخ الموت", "الشهور لتعديل الفئه", "المستهدف", "كود المندوب الوسيط", "الرقم المسلسل", "اسم المندوب", "اسم المندوب الوسيط", "تاريخ الأضافة للسجل", "اخر اضافة للسجل"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false, true, true, true, true, true, true, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable_trkeb_help.setGridColor(new java.awt.Color(0, 0, 0));
    jTable_trkeb_help.setSelectionBackground(new java.awt.Color(0, 51, 153));
    jTable_trkeb_help.setSelectionForeground(new java.awt.Color(204, 0, 204));
    jTable_trkeb_help.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            jTable_trkeb_helpMouseReleased(evt);
        }
    });
    jScrollPane49.setViewportView(jTable_trkeb_help);

    javax.swing.GroupLayout jPanel_helpLayout = new javax.swing.GroupLayout(jPanel_help);
    jPanel_help.setLayout(jPanel_helpLayout);
    jPanel_helpLayout.setHorizontalGroup(
        jPanel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel_helpLayout.createSequentialGroup()
            .addGap(811, 811, 811)
            .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 3500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_helpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 3025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1286, Short.MAX_VALUE)))
    );
    jPanel_helpLayout.setVerticalGroup(
        jPanel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel_helpLayout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addContainerGap(316, Short.MAX_VALUE))
        .addGroup(jPanel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_helpLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    getContentPane().add(jPanel_help);
    jPanel_help.setBounds(0, 0, 0, 0);

    setSize(new java.awt.Dimension(1536, 998));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_elmndob_insertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_elmndob_insertMouseReleased
        flag_insert_elmndob = false;
        int x = jTable_elmndob_insert.getSelectedRow();
       

            jTextField_name_elmndob.setText(String.valueOf(model_elmndob_insert.getValueAt(x, 1)));
        jTextField_id_elmndob.setText(String.valueOf(model_elmndob_insert.getValueAt(x, 0)));
        jTextField_phone_elmndob.setText(String.valueOf(model_elmndob_insert.getValueAt(x, 2)));
     
        

    }//GEN-LAST:event_jTable_elmndob_insertMouseReleased
void type_pro()
{
     String key = jTextField_type.getText();
        if (key.equals("1")) {
              ((JTextField)jTextField_date_2.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_3.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_5.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_6_in.getDateEditor().getUiComponent()).setText("0001-01-01");
                 ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
       else if (key.equals("2")) {
            
              ((JTextField)jTextField_date_3.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_5.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_6_in.getDateEditor().getUiComponent()).setText("0001-01-01");
                 ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
        else if (key.equals("3")) {

          ((JTextField)jTextField_date_5.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_6_in.getDateEditor().getUiComponent()).setText("0001-01-01");
                 ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
          else if (key.equals("4")) {
            
             
              ((JTextField)jTextField_date_5.getDateEditor().getUiComponent()).setText("0001-01-01");
              ((JTextField)jTextField_date_6_in.getDateEditor().getUiComponent()).setText("0001-01-01");
                 ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
          
        else if (key.equals("5")) {
           ((JTextField)jTextField_date_6_in.getDateEditor().getUiComponent()).setText("0001-01-01");
   ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
          else if (key.equals("6")) {
            
              
                 ((JTextField)jTextField_date_7_in.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
}
void search_elfne_trkeb()
{
     String text = jTextField_name_elfne_trkeb.getText();
        System.out.println();
        model_elfne_trkeb.setRowCount(0);

        try {

            
            ResultSet rs = ob.search_elfne(text);

            while (rs.next()) {
                String id_elfne = String.valueOf(rs.getString("id_elfne"));
                String name_elfne = rs.getString("name_elfne");
                String phone = String.valueOf(rs.getString("phone"));
                String places = rs.getString("places");
                model_elfne_trkeb.addRow(new Object[]{id_elfne, name_elfne, phone, places});

            }

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jTextField_name_elfne_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_elfne_trkebKeyReleased
        flag_insert_elfne_trkeb = true;
search_elfne_trkeb();
       
    }//GEN-LAST:event_jTextField_name_elfne_trkebKeyReleased

    private void jTable_elfne_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_elfne_trkebMouseReleased
     
flag_insert_elfne_trkeb = false;
        int x = jTable_elfne_trkeb.getSelectedRow();
        if (x!=-1)
        {
             jTextField_name_elfne_trkeb.setText(String.valueOf(model_elfne_trkeb.getValueAt(x, 1)));
        jTextField_id_elfne_trkeb.setText(String.valueOf(model_elfne_trkeb.getValueAt(x, 0)));
        jTextField_phone_elfne_trkeb.setText(String.valueOf(model_elfne_trkeb.getValueAt(x, 2)));
        jTextField_place_trkeb.setText(String.valueOf(model_elfne_trkeb.getValueAt(x, 3)));
        }
       
    }//GEN-LAST:event_jTable_elfne_trkebMouseReleased

    private void jTextField_id_elfne_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_elfne_trkebKeyReleased
        flag_insert_elfne_trkeb = true;
    }//GEN-LAST:event_jTextField_id_elfne_trkebKeyReleased
    private void jTextField_phone_elfne_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phone_elfne_trkebKeyReleased
        flag_insert_elfne_trkeb = true;
    }//GEN-LAST:event_jTextField_phone_elfne_trkebKeyReleased

    private void jTextField_place_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_place_trkebKeyReleased
        flag_insert_elfne_trkeb = true;
    }//GEN-LAST:event_jTextField_place_trkebKeyReleased

    private void jTable_add_3otlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_add_3otlMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_add_3otlMouseReleased

    private void jTextField_name_client_add_3otlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_client_add_3otlKeyReleased
        // TODO add your handling code here:model_add_3otl.setRowCount(0);
        String name_client_search = jTextField_name_client_add_3otl.getText();

        model_add_3otl.setRowCount(0);
        try {
            ResultSet rs = ob.stmt.executeQuery("select * from clients_product cs "
                    + " left outer join  clients c on c.id_client=cs.id_client "
                    + " left outer join product p on p.id_product=cs.id_product "
                    + " where c.name_client like '%"+name_client_search+"%'");
           
            while (rs.next()) {

                String id_client = String.valueOf(rs.getString("id_client"));
                String name_client = rs.getString("name_client");

               
                String phone = rs.getString("phone");
//
//                ResultSet rs_client_product = ob.search_client_product_id_client(id_client);
//
//
//                while (rs_client_product.next()) 
                {

                    String id_procuct = rs.getString("id_product");

                    String quantity = rs.getString("quantity");
                    String date_buy = rs.getString("date_buy");
                    String date1 = rs.getString("date1");
                    String date2 = rs.getString("date2");
                    String date3 = rs.getString("date3");
                    String date5 = rs.getString("date5");
                    String date6 = rs.getString("date6");
                    String date7 = rs.getString("date7");
                     String region = rs.getString("region");
                    String id_elfne = (rs.getString("id_elfne"));
                    String hints = rs.getString("hints");
                    String id_elmndob = (rs.getString("id_elmndob"));
                    String nezam_eldf3 = (rs.getString("nezam_eldf3"));
                    String date_el2st = rs.getString("date_el2st");
                    String elba2e = (rs.getString("elb2e"));
//                    ResultSet rs_product = ob.search_id_product(id_procuct);
//                    
                  String name_product ="";
//                    if (rs_product.next())
                    {
                  //  String id_product = String.valueOf(rs_product.getString("id_product"));
                     name_product = rs.getString("name_product");
                    }
                    model_add_3otl.addRow(new Object[]{id_client, name_client, region, phone,
                                hints, id_procuct, name_product, quantity, date_buy, date1,
                                date2, date3, date5, date6, date7, date_el2st, elba2e,rs.getString("serial")});

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTextField_name_client_add_3otlKeyReleased

    
   
   
    void max()
    {
          try {
          //   ob. conn.setAutoCommit(false);
            ResultSet rs=null ;
            ob.stmt=ob.conn.createStatement();
            String m="";
            rs=ob.stmt.executeQuery("select max(id_client) from clients ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_client.setText(m);
    if (rs.getString(1)!=null) if (jTextField_id_client.getText().length()==0)            jTextField_id_client.setText(String.valueOf(Integer.parseInt(m)+1));
                        
                
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_product) from product ");
            if (rs.next())
            {
               m=rs.getString(1);
                max_id_product.setText(m);
    if (rs.getString(1)!=null)  if (jTextField_id_product.getText().length()==0)                  jTextField_id_product.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elfne) from elfne ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_elfne.setText(m);
       //     if (jTextField_id_elfne.getText().length()==0)            jTextField_id_elfne.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elmndob) from elmndob ");
            if (rs.next())
            {
               m=rs.getString(1);
                max_id_elmndob.setText(m);
               // jTextField_id_elmndob.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elmndob_elwaset) from elmndob_elwaset ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_elmndob_elwaset.setText(m);
             //   jTextField_id_elmndob_elwaset.setText(String.valueOf(Integer.parseInt(m)+1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      void max_low()
    {
          try {
          //   ob. conn.setAutoCommit(false);
            ResultSet rs=null ;
            ob.stmt=ob.conn.createStatement();
            String m="";
            rs=ob.stmt.executeQuery("select max(id_client) from clients ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_client.setText(m);
              //  jTextField_id_client.setText(String.valueOf(Integer.parseInt(m)+1));
                        
                
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_product) from product ");
            if (rs.next())
            {
               m=rs.getString(1);
                max_id_product.setText(m);
              //  jTextField_id_product.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elfne) from elfne ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_elfne.setText(m);
              //  jTextField_id_elfne.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elmndob) from elmndob ");
            if (rs.next())
            {
               m=rs.getString(1);
                max_id_elmndob.setText(m);
               // jTextField_id_elmndob.setText(String.valueOf(Integer.parseInt(m)+1));
            }
            ob.stmt=ob.conn.createStatement();
            rs=ob.stmt.executeQuery("select max(id_elmndob_elwaset) from elmndob_elwaset ");
            if (rs.next())
            {
                m=rs.getString(1);
                max_id_elmndob_elwaset.setText(m);
             //   jTextField_id_elmndob_elwaset.setText(String.valueOf(Integer.parseInt(m)+1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jTextField_search_siana111KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_siana111KeyReleased
if (!jCheckBox_current_table_trkeb.isSelected())     
       trkeb.search_trkeb();
    }//GEN-LAST:event_jTextField_search_siana111KeyReleased

    private void jTextField_name_elfne_sianat3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_elfne_sianat3KeyReleased
        // TODO add your handling code here:
        flag_insert_elfne_sianat = true;
        model_elfne_sianat.setRowCount(0);
        String key = jTextField_name_elfne_sianat.getText();
        ResultSet rs=null;
       
        try {
          if (flag_3otl_siana==0||flag_3otl_siana==1) 
          {rs = ob.search_elfne(key);
          while (rs.next())
            { String id_elfne = String.valueOf(rs.getString("id_elfne"));
                String name_elfne = rs.getString("name_elfne");
                String phone = String.valueOf(rs.getString("phone"));
                String places = rs.getString("places");
                model_elfne_sianat.addRow(new Object[]{id_elfne, name_elfne, phone, places});
                }
          }
          
          else
          {rs=ob.search_elmo7sl(key);
           while (rs.next())
            { String id_elfne = String.valueOf(rs.getString("id_elmo7sl"));
                String name_elfne = rs.getString("name_elmo7sl");
                String phone = String.valueOf(rs.getString("phone"));
                String places = rs.getString("places");
                model_elfne_sianat.addRow(new Object[]{id_elfne, name_elfne, phone, places});
          }
            
            }
        }
         catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTextField_name_elfne_sianat3KeyReleased

    private void jTextField_id_elfne_sianatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_elfne_sianatKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne_sianat = true;
    }//GEN-LAST:event_jTextField_id_elfne_sianatKeyReleased

    private void jTextField_phone_elfne_sianatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phone_elfne_sianatKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne_sianat = true;
    }//GEN-LAST:event_jTextField_phone_elfne_sianatKeyReleased

    private void jTextField_places_elfne_sianatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_places_elfne_sianatKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne_sianat = true;
    }//GEN-LAST:event_jTextField_places_elfne_sianatKeyReleased

    String make_type_siana(String date1,String date2,String date3,String date5,String date6,String date7, String month_year_day_end)
    {
         String type_siana = "";
                           

                                boolean flag1 = false;
                                boolean flag2 = false;
                                boolean flag3 = false;
                                boolean flag5 = false;
                                boolean flag6 = false;
                                boolean flag7 = false;
                               
                                flag1 = ob.time_compare(date1, month_year_day_end);
                                flag2 = ob.time_compare(date2, month_year_day_end);
                                flag3 = ob.time_compare(date3, month_year_day_end);
                                flag5 = ob.time_compare(date5, month_year_day_end);
                                
                                flag6 = ob.time_compare(date6, month_year_day_end);
                                flag7 = ob.time_compare(date7, month_year_day_end);
// System.out.println(month_year_day_end+" "+flag1);
                                //joptionpane.showMessageDialog(null, flag1 + " " + flag2_3 + " " + flag5 + " " + flag6_7 + " ");
                                if (flag1 == true|| date1.equals(month_year_day_end)) {
                                    type_siana += "1";
                                }
                                if (flag2 == true|| date2.equals(month_year_day_end)) {
                                    type_siana += "-2";
                                }
                                if (flag3 == true|| date3.equals(month_year_day_end)) {
                                    type_siana += "-3";
                                }
                                if (flag5 == true|| date5.equals(month_year_day_end)) {
                                    type_siana += "-5";
                                }
                                //JOptionPane.showMessageDialog(null, flag6);
                                if (flag6 == true|| date6.equals(month_year_day_end)) {
                                    type_siana += "-6";
                                }
                                if (flag7 == true|| date7.equals(month_year_day_end)) {
                                    type_siana += "-7";
                                }
                           
                            return type_siana;
    }
    void add_siana_el2st(ResultSet rs , String month_year_day_end , String name_operation)
    {try {
          while (rs.next()) {
            
           
                String id_client = String.valueOf(rs.getString("id_client"));
                String id_product = String.valueOf(rs.getString("id_product"));
                String quantity = String.valueOf(rs.getString("quantity"));
                String hints = rs.getString("hints");
                String date_buy = rs.getString("date_buy");
                String date1 = rs.getString("date1");
                String date2 = rs.getString("date2");
                String date3 = rs.getString("date3");
                //joptionpane.showMessageDialog(null, id_client);
                String date5 = rs.getString("date5");
                String date6 = rs.getString("date6");
                String date7 = rs.getString("date7");
                String siana_1 = rs.getString("siana_1");
                String siana_2 = rs.getString("siana_2");
                String siana_3 = rs.getString("siana_3");
                String siana_5 = rs.getString("siana_5");
                String siana_6 = rs.getString("siana_6");
                String siana_7 = rs.getString("siana_7");
                String rsed_1 = rs.getString("rsed1");
                String rsed_2 = rs.getString("rsed2");
                String rsed_3 = rs.getString("rsed3");
                String rsed_5 = rs.getString("rsed5");
                String rsed_6 = rs.getString("rsed6");
                String rsed_7 = rs.getString("rsed7");
                String nezam_eldf3 = String.valueOf(rs.getString("nezam_eldf3"));
                String date_el2st = rs.getString("date_el2st");
                String elb2e = String.valueOf(rs.getString("elb2e"));
                  String region = rs.getString("region");
                  String home_num = rs.getString("home_num");
                  String street = rs.getString("street");

                String siana_elb2e = rs.getString("total_elb2e_sian");
                String clas = rs.getString("class");
                String elmosthdaf = rs.getString("elmosthdaf");
                String num_month_remake_class = rs.getString("num_month_remake_class");
                String date_remake_class = rs.getString("date_remake_class");
                String serial = rs.getString("serial");
                String wrongs = "";
                String date_wrong = "";
                String date_end = "";

{

                  wrongs = rs.getString("wrong");
                 date_wrong = rs.getString("date");
                 date_end = rs.getString("dead_line");
}
String type_siana=make_type_siana(date1, date2, date3, date5, date6, date7, month_year_day_end);


                String name_client = rs.getString("name_client");
                String job = String.valueOf(rs.getString("job"));
               
                String phone = String.valueOf(rs.getString("phone"));
               

                String name_product = "";
                 String el2st_product = "";

                { name_product = rs.getString("name_product");
                 el2st_product = rs.getString("el2st");
                
                }
                //joptionpane.showMessageDialog(null, date5);
               
               String country=rs.getString("country");
              
            
                  model_siana.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                      wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                      date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation), rs.getString("si.date"), job
                   , rs.getString("ar.date") ,  rs.getString("ar2.date")});
                  model_siana_help.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                      wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                      date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation), rs.getString("si.date"), job
                   , rs.getString("ar.date") ,  rs.getString("ar2.date")});
              
                        } 
    } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
      void add_siana_el2st_2(ResultSet rs , String month_year_day_end , String name_operation)
    {try {
          while (rs.next()) {
            
           
                String id_client = String.valueOf(rs.getString("id_client"));
                String id_product = String.valueOf(rs.getString("id_product"));
                String quantity = String.valueOf(rs.getString("quantity"));
                String hints = rs.getString("hints");
                String date_buy = rs.getString("date_buy");
                String date1 = rs.getString("date1");
                String date2 = rs.getString("date2");
                String date3 = rs.getString("date3");
                //joptionpane.showMessageDialog(null, id_client);
                String date5 = rs.getString("date5");
                String date6 = rs.getString("date6");
                String date7 = rs.getString("date7");
                String siana_1 = rs.getString("siana_1");
                String siana_2 = rs.getString("siana_2");
                String siana_3 = rs.getString("siana_3");
                String siana_5 = rs.getString("siana_5");
                String siana_6 = rs.getString("siana_6");
                String siana_7 = rs.getString("siana_7");
                String rsed_1 = rs.getString("rsed1");
                String rsed_2 = rs.getString("rsed2");
                String rsed_3 = rs.getString("rsed3");
                String rsed_5 = rs.getString("rsed5");
                String rsed_6 = rs.getString("rsed6");
                String rsed_7 = rs.getString("rsed7");
                String nezam_eldf3 = String.valueOf(rs.getString("nezam_eldf3"));
                String date_el2st = rs.getString("date_el2st");
                String elb2e = String.valueOf(rs.getString("elb2e"));
                  String region = rs.getString("region");
                  String home_num = rs.getString("home_num");
                  String street = rs.getString("street");

                String siana_elb2e = rs.getString("total_elb2e_sian");
                String clas = rs.getString("class");
                String elmosthdaf = rs.getString("elmosthdaf");
                String num_month_remake_class = rs.getString("num_month_remake_class");
                String date_remake_class = rs.getString("date_remake_class");
                String serial = rs.getString("serial");
                String wrongs = "";
                String date_wrong = "";
                String date_end = "";

{

                  wrongs = rs.getString("wrong");
                 date_wrong = rs.getString("date");
                 date_end = rs.getString("dead_line");
}
String type_siana=make_type_siana(date1, date2, date3, date5, date6, date7, month_year_day_end);


                String name_client = rs.getString("name_client");
                String job = String.valueOf(rs.getString("job"));
               
                String phone = String.valueOf(rs.getString("phone"));
               

                String name_product = "";
                 String el2st_product = "";

                { name_product = rs.getString("name_product");
                 el2st_product = rs.getString("el2st");
                
                }
                //joptionpane.showMessageDialog(null, date5);
               
               String country=rs.getString("country");
              
              
                  String type_el3otl = rs.getString("el.type_el3otl");
                  if (type_el3otl!=null
//                          &&(type_el3otl.contains("1") || type_el3otl.contains("2")
//                          || type_el3otl.contains("3") || type_el3otl.contains("5")
//                          || type_el3otl.contains("6") || type_el3otl.contains("7"))
                          ) {
                      model_siana.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                          wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                          date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation) + "\n\n" + type_el3otl, rs.getString("si.date") + "\n\n" + rs.getString("el.date"), job
                       , rs.getString("ar.date") ,  rs.getString("ar2.date")});
                      model_siana_help.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                          wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                          date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation) + "\n\n" + type_el3otl, rs.getString("si.date") + "\n\n" + rs.getString("el.date"), job 
                       , rs.getString("ar.date") ,  rs.getString("ar2.date")});
                  }
                  else
                  {
                        model_siana.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                      wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                      date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation), rs.getString("si.date"), job
                         , rs.getString("ar.date") ,  rs.getString("ar2.date")});
                  model_siana_help.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                      wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                      date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7, rsed_1, rsed_2, rsed_3, rsed_5, rsed_6, rsed_7, siana_elb2e, clas, elmosthdaf, date_remake_class, num_month_remake_class, home_num, street, country, serial, rs.getString(name_operation), rs.getString("si.date"), job
                   , rs.getString("ar.date") ,  rs.getString("ar2.date")});
                  }
             
                        } 
    } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void jCheckBox_elb2e_sianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_elb2e_sianaActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_elb2e_siana.isSelected())
        {
            try {
                model_siana.setRowCount(0);
                  model_siana_help.setRowCount(0);
                ob.stmt=ob.conn.createStatement();
                 ResultSet rs = ob.stmt.executeQuery( "select * from clients_product cs left outer join clients c on cs.id_client=c.id_client left outer join product p on p.id_product=cs.id_product left outer join countries co on co.region=cs.region left outer join wrongs w on w.serial=cs.serial "
                               + " left outer join history_siana_elb2e si on si.serial=cs.serial and si.date in "
                                        + "( select max(date) from history_siana_elb2e sii  where sii.serial= cs.serial)"
                                
                                +" where total_elb2e_sian not like 0 ");
                 
         
                String month_year_day = "";

                int y = 0;
                String time_now = ob.time_now();

                for (; y < time_now.length(); y++) {
                    month_year_day += time_now.charAt(y);
                    if (time_now.charAt(y) == '-') {
                        break;
                    }

                }
                y++;
                for (; y < time_now.length(); y++) {
                    month_year_day += time_now.charAt(y);
                    if (time_now.charAt(y) == '-') {
                        break;
                    }

                }
                month_year_day += "01";
             
                    month_year_day = ob.time_month(month_year_day, 1);
               
                add_siana_el2st(rs, month_year_day,"price");

                
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else 
       {
            
//            jScrollPane47.setVisible(true);
//            jPanel_elsiana_1.setVisible(false);
           model_siana.setRowCount(0);
           model_siana_help.setRowCount(0);
        }
          jLabel_count_siana.setText(String.valueOf(model_siana.getRowCount()));
    }//GEN-LAST:event_jCheckBox_elb2e_sianaActionPerformed

    private void jTable_elmo7slMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_elmo7slMouseReleased
        // TODO add your handling code here:
       
        int x = jTable_elmo7sl.getSelectedRow();
    if (x!=-1)
    {flag_insert_elfne_sianat = false;
            jTextField_name_elfne_sianat.setText(String.valueOf(model_elfne_sianat.getValueAt(x, 1)));
            jTextField_id_elfne_sianat.setText(String.valueOf(model_elfne_sianat.getValueAt(x, 0)));
            jTextField_phone_elfne_sianat.setText(String.valueOf(model_elfne_sianat.getValueAt(x, 2)));
            jTextField_places_elfne_sianat.setText(String.valueOf(model_elfne_sianat.getValueAt(x, 3)));
            
    }
    }//GEN-LAST:event_jTable_elmo7slMouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        elsiana.comp();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField_n_p11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_n_p11KeyReleased
        // TODO add your handling code here:
     
    if (!jCheckBox_current_table.isSelected())    elsiana.search();
    }//GEN-LAST:event_jTextField_n_p11KeyReleased

    private void jTable_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_trkebMouseReleased
        try {
            //  jTextField_date_regist.setEnabled(true);
//        jTextField_id_elfne_trkeb.setVisible(true);
//        jTextField_name_elfne_trkeb.setVisible(true);
//        jTextField_phone_elfne_trkeb.setVisible(true);
//        jTextField_place_trkeb.setVisible(true);
//        jPanel_table_elfne_trkeb.setVisible(true);
//        jTextField_date_trkeb.setVisible(true);
//       // jTextField_price_operation.setVisible(true);
//        jLabel1.setVisible(true);
//        jLabel2.setVisible(true);
//        jLabel3.setVisible(true);
//        jLabel4.setVisible(true);
//        jLabel_com_3_1.setVisible(true);
            // jLabel6.setVisible(true);
         
            int i = jTable_trkeb.getSelectedRow();
            if (i!=-1){
                if (jComboBox3.getSelectedIndex()==13)jLabel_com3_0.setText(jTable_trkeb.getColumnName(jTable_trkeb.getSelectedColumn()));
                jLabel_name_client_trkeb.setText((String)model_trkeb.getValueAt(i, 2  ) );
//              if (flag_trkeb_siana==true ) jDialog2.setVisible(true );
            String serial = 
          String.valueOf(model_trkeb.getValueAt(i, 27));
            model_hints_trkeb.setRowCount(0);
            ob.stmt = ob.conn.createStatement();
            ResultSet rs = ob.stmt.executeQuery("select id , hints , date from "+trkeb.table_name_hints+" " + " where serial =" + serial+" order by date desc "
                );
            while (rs.next()) {
                String id = rs.getString("id");
                String hints = rs.getString("hints");
                String date = rs.getString("date");
                model_hints_trkeb.addRow(new Object[]{id ,hints, date});
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable_trkebMouseReleased
void comp_trkeb()
{
     if (jComboBox3.getSelectedIndex()==0)
        {
            jLabel_com3_0.setText("الأسم");
             jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
            jComboBox_elfne_trkeb.setVisible(false);
          
        }
        else  if (jComboBox3.getSelectedIndex()==1)
        {
            jLabel_com3_0.setText("المحافظه");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
             jComboBox_elfne_trkeb.setVisible(false);
            
        } 
        else  if (jComboBox3.getSelectedIndex()==2)
        {
            jLabel_com3_0.setVisible(false);
            jTextField_search_siana1.setVisible(false);
            jTextField_search_siana2.setVisible(true);
            jLabel_com_3_1.setVisible(true);
             jTextField_search_siana3.setVisible(true);
            jLabel_com_3_2.setVisible(true);
              jComboBox_elfne_trkeb.setVisible(false);
        } 
        else  if (jComboBox3.getSelectedIndex()==3)
        {
            jLabel_com3_0.setText("المحافظه");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(true);
            jLabel_com_3_1.setVisible(true);
             jTextField_search_siana3.setVisible(true);
            jLabel_com_3_2.setVisible(true);
          jComboBox_elfne_trkeb.setVisible(false);
        } 
          else  if (jComboBox3.getSelectedIndex()==4)
        {
            jLabel_com3_0.setVisible(false);
            jTextField_search_siana1.setVisible(false);
            jTextField_search_siana2.setVisible(true);
            jLabel_com_3_1.setVisible(true);
             jTextField_search_siana3.setVisible(true);
            jLabel_com_3_2.setVisible(true);
              jComboBox_elfne_trkeb.setVisible(false);
        } 
        else  if (jComboBox3.getSelectedIndex()==5)
        {
            jLabel_com3_0.setText("المحافظه");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(true);
            jLabel_com_3_1.setVisible(true);
             jTextField_search_siana3.setVisible(true);
            jLabel_com_3_2.setVisible(true);
            jComboBox_elfne_trkeb.setVisible(false);
        } 
        else if (jComboBox3.getSelectedIndex()==6)
        {
              jLabel_com3_0.setText("اسم الجهاز");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
             jComboBox_elfne_trkeb.setVisible(false);
        }
         else if (jComboBox3.getSelectedIndex()==7)
        {
              jLabel_com3_0.setText("الملاحظات");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
             jComboBox_elfne_trkeb.setVisible(false);
        }
          else if (jComboBox3.getSelectedIndex()==8)
        {
              jLabel_com3_0.setText("الملاحظات");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
              jComboBox_elfne_trkeb.setVisible(false);
        }
        else  if (jComboBox3.getSelectedIndex()==9)
        {
            jLabel_com3_0.setText("الملاحظات الأضافيه");
            jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(true);
            jLabel_com_3_1.setVisible(true);
             jTextField_search_siana3.setVisible(true);
            jLabel_com_3_2.setVisible(true);
              jComboBox_elfne_trkeb.setVisible(false);
        } 
         else  if (jComboBox3.getSelectedIndex()==10)
        {
         jLabel_com3_0.setText("الشارع");
             jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
             jComboBox_elfne_trkeb.setVisible(false);
        }
         else  if (jComboBox3.getSelectedIndex()==11)
        {
         jLabel_com3_0.setText("المندوب");
             jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
           jComboBox_elfne_trkeb.setVisible(false);
        }
         else  if (jComboBox3.getSelectedIndex()==12)
        {
         jLabel_com3_0.setText("المندوب الوسيط");
             jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
           jComboBox_elfne_trkeb.setVisible(false);
        }
         else if (jComboBox3.getSelectedIndex()==13)
        {
          if (jTable_trkeb.getSelectedColumn()!=-1)  jLabel_com3_0.setText(jTable_trkeb.getColumnName(jTable_trkeb.getSelectedColumn()));
          else {jComboBox3.setSelectedIndex(0);JOptionPane.showMessageDialog(null, "قم بتحديد عمود اولا");}
             jLabel_com3_0.setVisible(true);
            jTextField_search_siana1.setVisible(true);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
             jComboBox_elfne_trkeb.setVisible(false);
        }
        else  if (jComboBox3.getSelectedIndex()==14)
        {
         
             jLabel_com3_0.setVisible(false);
            jTextField_search_siana1.setVisible(false);
            jTextField_search_siana2.setVisible(false);
            jLabel_com_3_1.setVisible(false);
             jTextField_search_siana3.setVisible(false);
            jLabel_com_3_2.setVisible(false);
            jComboBox_elfne_trkeb.setVisible(true);
            elsiana.select_elfneen(jComboBox_elfne_trkeb);
        }
}
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
       comp_trkeb();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField_search_siana2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_siana2KeyReleased
        // TODO add your handling code here:
        trkeb.search_trkeb();
    }//GEN-LAST:event_jTextField_search_siana2KeyReleased

    private void jTextField_two_n_p11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_two_n_p11KeyReleased
        // TODO add your handling code here:
      
     if (!jCheckBox_current_table.isSelected())    elsiana.search();
    }//GEN-LAST:event_jTextField_two_n_p11KeyReleased

    private void jTable_siana_help_dmgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_siana_help_dmgMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_siana_help_dmgMouseReleased
void save()
{
      int x=JOptionPane.showConfirmDialog(null, "are you want to save changes");
            if (x==0)
            {
                try {
                     System.out.println("commit check");
                    ob.stmt.executeUpdate("commit");
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (x==1)
            {
                try {
                     System.out.println("rollback check");
                    ob.stmt.executeUpdate("rollback to hhh ;");
                     ob.stmt.executeUpdate("commit");
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
}
    private void jCheckBox_autosaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_autosaveMouseReleased
        // TODO add your handling code here:
         animation(jPanel_drop_reports2, 80);
        if (jCheckBox_autosave.isSelected())
        {
          save();
            }
           
       
        else
        {
          
            try {
                 System.out.println("start tran check");
              ob.stmt.executeUpdate("start TRANSACTION ;");
                ob.stmt.executeUpdate(" savepoint  hhh ; ");
               
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }
    }//GEN-LAST:event_jCheckBox_autosaveMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     h.f_log.log_off();
        if(!jCheckBox_autosave.isSelected())
      {
         save(); 
      }
        
        
    }//GEN-LAST:event_formWindowClosing
void get_hints(String hints)
{
    jComboBox_client_hints.removeAllItems();
   
    String t="";
   for (int i=0 ; i<hints.length() ; i++)
   {
       if (hints.charAt(i)=='#')
       {
           jComboBox_client_hints.addItem(t);
           t="";
       }
           else t+=hints.charAt(i);
       
    }
    jComboBox_client_hints.addItem(t);
   
}
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
      try {
        
            
            model_country_trkeb.setRowCount(0);
            String text=jTextField2.getText();
          
            ob.stmt=ob.conn.createStatement();
                System.out.println("select  distinct country   from countries where country like '"+text+"%'");
    ResultSet rs_can=ob.stmt.executeQuery("select  distinct country   from countries where country like '"+text+"%'");
      while (rs_can.next())
      {
         model_country_trkeb.addRow(new Object[]
         {
            
         rs_can.getString(1) 
         
         });
      } 
            
           
    } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTable_country_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_country_trkebMouseReleased
    int x=jTable_country_trkeb.getSelectedRow();
      
               flag_insert_elfne_trkeb = true;
               if (!jTextField_place_trkeb.getText().contains(String.valueOf(model_country_trkeb.getValueAt(x, 0))))
               {
            if (jTextField_place_trkeb.getText().length()!=0)
            jTextField_place_trkeb.setText(jTextField_place_trkeb.getText()+"#"+(String)model_country_trkeb.getValueAt(x, 0));  
            else
                   jTextField_place_trkeb.setText((String)model_country_trkeb.getValueAt(x, 0));  
               }
        
    }//GEN-LAST:event_jTable_country_trkebMouseReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
     try {
        
            
            model_country_siana.setRowCount(0);
            String text=jTextField3.getText();
          
            ob.stmt=ob.conn.createStatement();
                System.out.println("select  distinct country   from countries where country like '"+text+"%'");
    ResultSet rs_can=ob.stmt.executeQuery("select  distinct country   from countries where country like '"+text+"%'");
      while (rs_can.next())
      {
         model_country_siana.addRow(new Object[]
         {
            
         rs_can.getString(1) 
         
         });
      } 
            
           
    } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTable_country_trkeb1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_country_trkeb1MouseReleased
      int x=jTable_country_trkeb1.getSelectedRow();
      
               flag_insert_elfne_sianat = true;
               if (!jTextField_places_elfne_sianat.getText().contains(String.valueOf(model_country_siana.getValueAt(x, 0))))
               {
            if (jTextField_places_elfne_sianat.getText().length()!=0)
            jTextField_places_elfne_sianat.setText(jTextField_places_elfne_sianat.getText()+"#"+(String)model_country_siana.getValueAt(x, 0));  
            else
                   jTextField_places_elfne_sianat.setText((String)model_country_siana.getValueAt(x, 0));  
               }
    }//GEN-LAST:event_jTable_country_trkeb1MouseReleased

    private void jTextField_elba2e_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_elba2e_trkebKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_elba2e_trkebKeyReleased
 File inputWorkbook=null ;
    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
     elsiana.search_plan();
    }//GEN-LAST:event_jLabel15MouseReleased

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        // TODO add your handling code here:
         elsiana.  search();
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel_search_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_search_trkebMouseReleased
        // TODO add your handling code here:
           trkeb.search_trkeb();
    }//GEN-LAST:event_jLabel_search_trkebMouseReleased

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
     if (jTable_siana.getSelectedRow()!=-1)
     {
        h.get_numbers((String)model_siana.getValueAt(jTable_siana.getSelectedRow(), 0),(String)model_siana.getValueAt(jTable_siana.getSelectedRow(), 1), (String)model_siana.getValueAt(jTable_siana.getSelectedRow(), 3));
         h.jDialog1.setVisible(true);
     
     }
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseReleased
        if (jTable_trkeb.getSelectedRow()!=-1)
        {
            h.get_numbers((String)model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 1),(String)model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 2), (String)model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 7));
            h.jDialog1.setVisible(true);

        }
    }//GEN-LAST:event_jLabel29MouseReleased

    private void jTextField_search_siana3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_siana3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_search_siana3KeyReleased

    private void jTable_hintsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_hintsKeyReleased
      
              int x=jTable_hints.getSelectedRow();
   if (x!=-1)
   {
        if (evt.getKeyCode()==10)
      {
          if (jTable_hints.getSelectedColumn()==1)
          {
           
            try {
                ob.stmt.executeUpdate("update hints set hints='"+model_hints.getValueAt(x, 1) 
                        +"' "
                        +"where id="+String.valueOf(model_hints.getValueAt(x, 0)));
                JOptionPane.showMessageDialog(null,"عمليه ناجحه");
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
          else  if (jTable_hints.getSelectedColumn()==2)
          {
              try {
                ob.stmt.executeUpdate("update hints set "
                        +" date='"+model_hints.getValueAt(x, 2)+"' "
                        +"where id="+String.valueOf(model_hints.getValueAt(x, 0)));
                JOptionPane.showMessageDialog(null,"عمليه ناجحه");
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      }
   }
    }//GEN-LAST:event_jTable_hintsKeyReleased

    private void jTextField_ns_d7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ns_d7KeyReleased
        // TODO add your handling code here:
        System.out.println(String.valueOf(jTextField_date1.getDate()));
    }//GEN-LAST:event_jTextField_ns_d7KeyReleased

    private void jTextField_name_elfne_sianatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_name_elfne_sianatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_name_elfne_sianatActionPerformed

    private void jPanel_add_clientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel_add_clientKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_add_clientKeyReleased
void set_flags_insert()
{
    flag_insert_client=true ;
    flag_insert_region=true ;
    flag_insert_product=true ;
    
    flag_insert_elfne=true ;
    flag_insert_elmndob=true ;
    flag_insert_elmndob_elwaset=true ;
    
}
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        jCheckBox7.setSelected(false);  add_client.checked_main();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed

        jCheckBox1.setSelected(false);add_client.checked_main();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jTable_elmndob_elwaset__insertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_elmndob_elwaset__insertMouseReleased
        // TODO add your handling code here:
        flag_insert_elmndob_elwaset = false;
        int x = jTable_elmndob_elwaset__insert.getSelectedRow();

        jTextField_name_elmndob_elwaset.setText(String.valueOf(model_elmndob_elwaset_insert.getValueAt(x, 1)));
        jTextField_id_elmndob_elwaset.setText(String.valueOf(model_elmndob_elwaset_insert.getValueAt(x, 0)));
        jTextField_phone_elmndob_elwaset.setText(String.valueOf(model_elmndob_elwaset_insert.getValueAt(x, 2)));

    }//GEN-LAST:event_jTable_elmndob_elwaset__insertMouseReleased

    private void jTable_canceledMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_canceledMouseReleased
        // TODO add your handling code here:
        int x=jTable_canceled.getSelectedRow();
        if (x!=-1)
        {
            flag_insert_client=true ;
            jTextField_name_client.setText(String.valueOf(model_canceled.getValueAt(x, 1)));
            jTextField_job.setText(String.valueOf(model_canceled.getValueAt(x, 2)));
            //        jTextField_home_num.setText(String.valueOf(model_canceled.getValueAt(x, 3)));
            //        jTextField_street.setText(String.valueOf(model_canceled.getValueAt(x, 4)));
            //        jTextField_region.setText(String.valueOf(model_canceled.getValueAt(x, 5)));
            //        jTextField_country.setText(String.valueOf(model_canceled.getValueAt(x, 6)));
            jTextField_phone.setText(String.valueOf(model_canceled.getValueAt(x, 3)));
        }
    }//GEN-LAST:event_jTable_canceledMouseReleased

    private void jCheckBox_elwsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_elwsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_elwsetActionPerformed

    private void jTable_clients_insertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clients_insertMouseReleased
        int x = jTable_clients_insert.getSelectedRow();
        if (jCheckBox_elwset.isSelected())
        {
            flag_insert_elmndob_elwaset=true ;
            jTextField_id_elmndob_elwaset.setText(String.valueOf(model_client_insert.getValueAt(x, 0)));
            jTextField_name_elmndob_elwaset.setText(String.valueOf(model_client_insert.getValueAt(x, 1)));
            jTextField_phone_elmndob_elwaset.setText(String.valueOf(model_client_insert.getValueAt(x, 3)));
        }
        else
        {
            jTextField_id_client.setText(String.valueOf(model_client_insert.getValueAt(x, 0)));
            jTextField_name_client.setText(String.valueOf(model_client_insert.getValueAt(x, 1)));
            jTextField_job.setText(String.valueOf(model_client_insert.getValueAt(x, 2)));
            jTextField_phone.setText(String.valueOf(model_client_insert.getValueAt(x, 3)));

            flag_insert_client = false;
            System.out.println(flag_insert_client);

        }

    }//GEN-LAST:event_jTable_clients_insertMouseReleased

    private void jTable_elfne_insertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_elfne_insertMouseReleased
        flag_insert_elfne = false;
        int x = jTable_elfne_insert.getSelectedRow();

        jTextField_name_elfne.setText(String.valueOf(model_elfne_insert.getValueAt(x, 1)));
        jTextField_id_elfne.setText(String.valueOf(model_elfne_insert.getValueAt(x, 0)));
        jTextField_phone_elfne.setText(String.valueOf(model_elfne_insert.getValueAt(x, 2)));
        jTextField_places.setText(String.valueOf(model_elfne_insert.getValueAt(x, 3)));

    }//GEN-LAST:event_jTable_elfne_insertMouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        add_client.search_region();
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jCheckBox_elwset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_elwset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_elwset1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
if (jCheckBox2.isSelected())       add_client. search_region();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable_regionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_regionMouseReleased
        // TODO add your handling code here:
        int x=jTable_region.getSelectedRow();
        if (x!=-1)
        {
        if (jCheckBox_elwset1.isSelected())
        {
            flag_insert_elfne=true ;
            if (!jTextField_places.getText().contains(String.valueOf(model_region.getValueAt(x, 1))))
            { if (jTextField_places.getText().length()!=0)

                jTextField_places.setText(jTextField_places.getText()+"#"+(String)model_region.getValueAt(x, 1));
                else
                jTextField_places.setText((String)model_region.getValueAt(x, 1));
            }
        }
        else
        {

            flag_insert_region=false ;

            jTextField_region.setText((String)model_region.getValueAt(x, 0));
            jTextField_country.setText((String)model_region.getValueAt(x, 1));
        }
        }
    }//GEN-LAST:event_jTable_regionMouseReleased

    private void jTable_product_insert1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_product_insert1MouseReleased
        flag_insert_product = false;

        int x = jTable_product_insert1.getSelectedRow();
        jTextField_name_product.setText(String.valueOf(model_product_insert.getValueAt(x, 1)));
        jTextField_id_product.setText(String.valueOf(model_product_insert.getValueAt(x, 0)));
        jTextField_type.setText(String.valueOf(model_product_insert.getValueAt(x, 2)));
        jTextField_price_product.setText(String.valueOf(model_product_insert.getValueAt(x, 3)));
        jTextField_elmkdm.setText(String.valueOf(model_product_insert.getValueAt(x, 4)));
        jTextField_el2st.setText(String.valueOf(model_product_insert.getValueAt(x, 5)));
        jTextField_all_quantity.setText(String.valueOf(model_product_insert.getValueAt(x, 6)));
   

        type_pro();
    }//GEN-LAST:event_jTable_product_insert1MouseReleased

    private void jLabel23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseReleased
        // TODO add your handling code here:
       homeCard.show(jPanel8,"card_region");
     add_client.search_region_insert();
    }//GEN-LAST:event_jLabel23MouseReleased

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_elmndob");
        add_client.search_elmndob_insert();
    }//GEN-LAST:event_jLabel22MouseReleased

    private void jLabel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_elfne");
       add_client.search_elfne_insert();
    }//GEN-LAST:event_jLabel21MouseReleased

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
        // TODO add your handling code here:
        
        homeCard.show(jPanel8,"card_product");
      add_client.search_product_insert();
    }//GEN-LAST:event_jLabel20MouseReleased

    private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_elmndob_elwaset");
       add_client. search_elmndob_elwaset_insert();
    }//GEN-LAST:event_jLabel19MouseReleased

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        // TODO add your handling code here:
      homeCard.show(jPanel8,"card_client");
      add_client. search_client_insert();
    }//GEN-LAST:event_jLabel18MouseReleased

    private void jTextField_dte_buyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dte_buyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dte_buyKeyReleased

    private void jTextField_date1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_date1KeyReleased
        // TODO add your handling code here:
        System.out.println(String.valueOf(jTextField_date1.getDate()));
    }//GEN-LAST:event_jTextField_date1KeyReleased

    private void jTextField_elmosthdafKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_elmosthdafKeyReleased
     if (evt.getKeyCode()==10)action_Add_client_p0();
    }//GEN-LAST:event_jTextField_elmosthdafKeyReleased

    private void jTextField_phone_elmndob_elwasetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phone_elmndob_elwasetKeyReleased
        homeCard.show(jPanel8,"card_elmndob_elwaset");
        flag_insert_elmndob_elwaset = true;
    }//GEN-LAST:event_jTextField_phone_elmndob_elwasetKeyReleased

    private void jTextField_name_elmndob_elwasetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_elmndob_elwasetKeyReleased
        // TODO add your handling code here:
        if (!jCheckBox_elwset.isSelected())
        homeCard.show(jPanel8,"card_elmndob_elwaset");
        else homeCard.show(jPanel8,"card_client");
        flag_insert_elmndob_elwaset = true;
        
        if (jCheckBox2.isSelected())
        {
          add_client. search_elmndob_elwaset_insert();
        }
    }//GEN-LAST:event_jTextField_name_elmndob_elwasetKeyReleased

    private void jTextField_num_month_classKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_num_month_classKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_num_month_classKeyReleased

    private void jTextField_name_product11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_product11KeyReleased
        homeCard.show(jPanel8,"card_product");
        flag_insert_product = true;
        if (jCheckBox2.isSelected())
        {
            add_client.search_product_insert();        }
    }//GEN-LAST:event_jTextField_name_product11KeyReleased

    private void jTextField_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==10)action_add_client_p2();
        else {
        homeCard.show(jPanel8,"card_client");
        flag_insert_client = true;
        System.out.println(flag_insert_client);
        }
    }//GEN-LAST:event_jTextField_phoneKeyReleased

    private void jTextField_id_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_productKeyReleased
        // TODO add your handling code here:
        flag_insert_product = true;
        homeCard.show(jPanel8,"card_product");
    }//GEN-LAST:event_jTextField_id_productKeyReleased

    private void jTextField_countryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_countryKeyReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_region");
        flag_insert_region=true ;

    }//GEN-LAST:event_jTextField_countryKeyReleased

    private void jTextField_regionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_regionKeyReleased
            homeCard.show(jPanel8,"card_region");
            flag_insert_region=true ;   
            // TODO add your handling code here:
            // flag_insert_client = true;
           if (jCheckBox2.isSelected())
            {
              add_client. search_region_insert();

                }
           
    }//GEN-LAST:event_jTextField_regionKeyReleased

    private void jTextField_typeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_typeKeyReleased
        type_pro();
        flag_insert_product = true;
        homeCard.show(jPanel8,"card_product");
    }//GEN-LAST:event_jTextField_typeKeyReleased

    private void jTextField_name_clientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_clientKeyReleased
       flag_insert_client = true;  
       
        //  list_client ob_list_client=new list_client();
      
       homeCard.show(jPanel8,"card_client");
        if (jCheckBox2.isSelected())
        {
           add_client. search_client_insert();
            
        }
    }//GEN-LAST:event_jTextField_name_clientKeyReleased

    private void jTextField_home_numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_home_numKeyReleased
        // TODO add your handling code here:
        //  flag_insert_client = true;
        homeCard.show(jPanel8,"card_client");

    }//GEN-LAST:event_jTextField_home_numKeyReleased

    private void jTextField_streetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_streetKeyReleased
        // TODO add your handling code here:
        //     flag_insert_client = true;
        homeCard.show(jPanel8,"card_client");
    }//GEN-LAST:event_jTextField_streetKeyReleased

    private void jTextField_id_clientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_clientKeyReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_client");
        flag_insert_client = true;
        System.out.println(flag_insert_client);
    }//GEN-LAST:event_jTextField_id_clientKeyReleased

    private void jTextField_id_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_id_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_id_clientActionPerformed

    private void jTextField_jobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_jobKeyReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_client");
        flag_insert_client = true;
        System.out.println(flag_insert_client);
    }//GEN-LAST:event_jTextField_jobKeyReleased

    private void jTextField_elmkdmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_elmkdmKeyReleased
        // TODO add your handling code here:
        flag_insert_product = true;
        homeCard.show(jPanel8,"card_product");
    }//GEN-LAST:event_jTextField_elmkdmKeyReleased

    private void jTextField_el2stKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_el2stKeyReleased
        // TODO add your handling code here:
        flag_insert_product = true;
        homeCard.show(jPanel8,"card_product");
    }//GEN-LAST:event_jTextField_el2stKeyReleased

    private void jTextField_price_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_price_productKeyReleased
        // TODO add your handling code here:
        flag_insert_product = true;
        homeCard.show(jPanel8,"card_product");

    }//GEN-LAST:event_jTextField_price_productKeyReleased

    private void jTextField_all_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_all_quantityKeyReleased
        homeCard.show(jPanel8,"card_product");
        flag_insert_product = true;
    }//GEN-LAST:event_jTextField_all_quantityKeyReleased

    private void jTextField_id_elmndob_elwasetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_elmndob_elwasetKeyReleased
        homeCard.show(jPanel8,"card_elmndob_elwaset");
        flag_insert_elmndob_elwaset = true;
    }//GEN-LAST:event_jTextField_id_elmndob_elwasetKeyReleased

    private void jTextField_placesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_placesKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne = true;
        homeCard.show(jPanel8,"card_region");
       
    }//GEN-LAST:event_jTextField_placesKeyReleased

    private void jTextField_name_elmndobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_elmndobKeyReleased
        homeCard.show(jPanel8,"card_elmndob");
        flag_insert_elmndob = true;
        if (jCheckBox2.isSelected())
        {
           add_client. search_elmndob_insert();
        }
    }//GEN-LAST:event_jTextField_name_elmndobKeyReleased

    private void jTextField_elba2eKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_elba2eKeyReleased
        // TODO add your handling code here:
        String key = jTextField_elba2e.getText();
        if (key.equals("0")) {
            ((JTextField)jTextField_date_el2st.getDateEditor().getUiComponent()).setText("0001-01-01");
        }
    }//GEN-LAST:event_jTextField_elba2eKeyReleased

    private void jTextField_phone_elfneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phone_elfneKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne = true;
        homeCard.show(jPanel8,"card_elfne");
    }//GEN-LAST:event_jTextField_phone_elfneKeyReleased

    private void jTextField_id_elmndobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_elmndobKeyReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_elmndob");
        flag_insert_elmndob = true;
    }//GEN-LAST:event_jTextField_id_elmndobKeyReleased

    private void jTextField_id_elfneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_id_elfneKeyReleased
        // TODO add your handling code here:
        flag_insert_elfne = true;
        homeCard.show(jPanel8,"card_elfne");
    }//GEN-LAST:event_jTextField_id_elfneKeyReleased

    private void jTextField_name_elfne3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_name_elfne3KeyReleased
        // TODO add your handling code here:
        homeCard.show(jPanel8,"card_elfne");
        flag_insert_elfne = true;
        if (jCheckBox2.isSelected())
        {
          add_client.search_elfne_insert();
        }
    }//GEN-LAST:event_jTextField_name_elfne3KeyReleased

    private void jTextField_phone_elmndobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phone_elmndobKeyReleased
        // TODO add your handling code here:
         if (evt.getKeyCode()==10)action_add_client_p6();
         else { homeCard.show(jPanel8,"card_elmndob");
        flag_insert_elmndob = true;}
    }//GEN-LAST:event_jTextField_phone_elmndobKeyReleased

    private void jTextField_total_elb2e_sianaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_total_elb2e_sianaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_total_elb2e_sianaKeyReleased

    private void jTextField_classKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_classKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_classKeyReleased

    private void jComboBox_class_add_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_class_add_clientActionPerformed
        int x=jComboBox_class_add_client.getSelectedIndex();
        jTextField_class.setText(h.class_list.get(x).class_);
        jTextField_siana_1.setText(h.class_list.get(x).p1);
        jTextField_siana_2.setText(h.class_list.get(x).p2);
        jTextField_siana_3.setText(h.class_list.get(x).p3);
        jTextField_siana_5.setText(h.class_list.get(x).p5);
        jTextField_siana_6.setText(h.class_list.get(x).p6);
        jTextField_siana_7.setText(h.class_list.get(x).p7);
    }//GEN-LAST:event_jComboBox_class_add_clientActionPerformed

    private void jTextField_price_trkebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_price_trkebKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_price_trkebKeyReleased

    private void jTable_siana_helpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_siana_helpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_siana_helpMouseReleased

    private void jTable_siana_helpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_siana_helpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_siana_helpKeyReleased

    private void jTable_trkeb_helpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_trkeb_helpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_trkeb_helpMouseReleased

    private void jTable_sianaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_sianaMouseReleased
        // TODO add your handling code here:
         try {
            
         
            int x = jTable_siana.getSelectedRow();
            if (x!=-1)
            {
                jLabel_name_client_siana.setText((String)model_siana.getValueAt(x, 1));
           // quantity_eltok3 = String.valueOf(model_siana.getValueAt(x, 7));
            //System.out.println("quantity      " + quantity_eltok3);
            //flag_siana_or_part = false;
          String hints_client=(String)model_siana.getValueAt(x, 4);
          get_hints(hints_client);
          selected_siana_row=jTable_siana.getSelectedRow();
          selected_siana_column= jTable_siana.convertColumnIndexToModel(jTable_siana.getSelectedColumn()) ;
          
          
            int i = jTable_siana.getSelectedRow();

            String serial =
           String.valueOf(model_siana.getValueAt(i, 43));
            model_hints.setRowCount(0);
            ob.stmt = ob.conn.createStatement();
            ResultSet rs = ob.stmt.executeQuery("select id , hints , date from hints " + " where serial =" +serial+" order by date desc "
                   );
            while (rs.next()) {
                 String id = rs.getString("id");
                String hints = rs.getString("hints");
                String date = rs.getString("date");
                model_hints.addRow(new Object[]{id ,hints, date});
            }
            
            if (jComboBox1.getSelectedIndex()==14) jLabel_n.setText(jTable_siana.getColumnName(jTable_siana.getSelectedColumn()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       jTable_siana.requestFocus();
    }//GEN-LAST:event_jTable_sianaMouseReleased
int selected_siana_row=-1 ; int selected_siana_column=-1 ;
    private void jTable_sianaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_sianaKeyReleased
    
       
            if (evt.getKeyCode() == 10&&selected_siana_row!=-1) {
               
                String serial =String.valueOf(model_siana.getValueAt(selected_siana_row, 43));
//               if (selected_siana_column==4)
//               {
//                try {
//                    ob.stmt.executeUpdate("update clients_product set hints='" + (String) model_siana.getValueAt(selected_siana_row, 4) + "' where serial="+serial
//                         );
//                   
//                    JOptionPane.showMessageDialog(null, "successful operation");
//                } catch (SQLException ex) {
//                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               }
//               else if (selected_siana_column==36)
//               {
//                    try {
//                    ob.stmt.executeUpdate("update clients_product set class='" + (String) model_siana.getValueAt(selected_siana_row, 36) + "' where serial="+serial
//                         );
//                   
//                    JOptionPane.showMessageDialog(null, "successful operation");
//                } catch (SQLException ex) {
//                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//                }
//               }
//                else
                   if (selected_siana_column==15&&flag_3otl_siana==0)
               {
                   
                    String date[] = new String[6];
                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("1")) {
                       date[0] = String.valueOf(model_siana.getValueAt(selected_siana_row, 9));
                   }

                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("2")) {
                       date[1] = String.valueOf(model_siana.getValueAt(selected_siana_row, 10));
                   }

                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("3")) {
                       date[2] = String.valueOf(model_siana.getValueAt(selected_siana_row, 11));
                   }

                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("5")) {
                       date[3] = String.valueOf(model_siana.getValueAt(selected_siana_row, 12));
                   }

                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("6")) {
                       date[4] = String.valueOf(model_siana.getValueAt(selected_siana_row, 13));
                   }

                   if (String.valueOf(model_siana.getValueAt(selected_siana_row, 15)).contains("7")) {
                       date[5] = String.valueOf(model_siana.getValueAt(selected_siana_row, 14));
                   }
                   String s_e_m[]=ob.get_start_end_of_month();
                   int flag_in = elsiana.check_in_el5ta(date, s_e_m[0],
                           s_e_m[1]);
                   int flag_before = elsiana.check_before_el5ta(date, s_e_m[0]);
                   int flag_after = elsiana.check_after_el5ta(date, s_e_m[1]);
                
                   System.out.println(flag_before+" "+flag_in+" "+flag_after);
                   System.out.println(date[0]+" "+date[1]+" "+date[2]+" "+date[3]+" "+date[4]+" "+date[5]);
                   for (int i=0 ; i<elsiana.type_elsiana_list.size() ; i++)
                   {
                       if (elsiana.type_elsiana_list.get(i).getAll_siana_after_el5ta()==1)
                       {
                         if (flag_after<2)
                         {
                             continue ;
                         }
                       }
                       if (elsiana.type_elsiana_list.get(i).getAll_siana_in_el5ta()==1)
                       {
                         if (flag_in<2)
                         {
                             continue ;
                         }
                       }
                        if (elsiana.type_elsiana_list.get(i).getAll_siana_before_el5ta()==1)
                       {
                         if (flag_before<2)
                         {
                             continue ;
                         }
                       }
                         if (elsiana.type_elsiana_list.get(i).getSome_siana_after_el5ta()==1)
                       {
                         if (flag_after<1)
                         {
                             continue ;
                         }
                       }
                       if (elsiana.type_elsiana_list.get(i).getSome_siana_in_el5ta()==1)
                       {
                         if (flag_in<1)
                         {
                             continue ;
                         }
                       }
                        if (elsiana.type_elsiana_list.get(i).getSome_siana_before_el5ta()==1)
                       {
                         if (flag_before<1)
                         {
                             continue ;
                         }
                       }
                       
                       jComboBox_type_elsiana.setSelectedIndex(i);
                       break ;
                   }

               }
            }
     
    }//GEN-LAST:event_jTable_sianaKeyReleased

    private void jLabel_clientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clientsMouseReleased
        if (jLabel_clients.getName().equals("T")) 
        {
         if (opened_main_screen!=jPanel_add_client&& opened_main_screen.getHeight()>=height)
       {
         
           animation(opened_main_screen, height);
           animation(jPanel_add_client, height); 
           opened_main_screen=jPanel_add_client;
       }  
       max();   
        animate_separator_x(jPanel25, 1100);
        jPanel25.setSize(55, 4);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_clientsMouseReleased
void enter_trkeb_screen(int location , int width)
{
        animate_separator_x(jPanel25, location);
        jPanel25.setSize(width, 4);
        if (opened_main_screen!=jPanel_trkeb&&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(jPanel_trkeb, height); 
           opened_main_screen=jPanel_trkeb;
        
       }  
}
    private void jLabel_installationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_installationMouseReleased
         if (jLabel_installation.getName().equals("T")) 
        { 
        System.out.println("********************************************trkeb*****************************************");
        elsiana.archive_value=archive.archive_trkeb ;
        elsiana.archive_table="archive_trkeb";
       flag_trkeb_siana=false ;
          trkeb.table_name="trkeb";
        trkeb.table_name_arch="eltrkebat"; 
        trkeb.table_name_hints="hints_trkeb";
        jTable_trkeb.setName("إخطارات التركيبات");
jTable_trkeb_archive_not_done.setName("سجل الرفض للتركيبات");
jTable_trkeb_archive_done.setName("سجل الخطه للتركيبات");
            model_trkeb.setRowCount(0);
        model_trkeb_help.setRowCount(0);
//            jPanel_trkeb.setVisible(true);
//           
//            jScrollPane47.setVisible(false);
        enter_trkeb_screen(1015,75);
       
trkeb.enter_eltrkebat();
 jLabel_installation_notify.setText(jLabel_count.getText());
       
        }
           else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_installationMouseReleased
void clear_text_siana()
{
     jTextField_id_elfne_sianat.setText("");
         jTextField_name_elfne_sianat.setText("");
         jTextField_places_elfne_sianat.setText("");
         jTextField_phone_elfne_sianat.setText("");
}
    private void jLabel_servisingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_servisingMouseReleased
 if (jLabel_servising.getName().equals("T")) 
        {
            elsiana.archive_value=archive.archive_siana ;
             elsiana.archive_table="archive";
            jPanel_fatorh_siana_panel.setVisible(true);
            jComboBox_type_elsiana.setVisible(true);
            jPanel_perioud_siana.setVisible(true);
        jTextField_real_date_siana2.setEnabled(true);
        jPanel20.setName("true");
       jLabel_id_elmo7sl.setText("كود الفني");
       jLabel_name_elmo7sl.setText("اسم الفني");
       flag_insert_elfne_sianat=true ;
       jLabel13.setText("فاتوره الصيانه");
        flag_3otl_siana = 0;
        jTable_siana.setName("جدول الصيانات");
        jTable_siana_help_dmg.setName("سجل الخطة للصيانات");
        jTable_siana_help_dmg_reject.setName("سجل الرفض للصيانات");
        // jPanel_add_client.setVisible(false);
//        jScrollPane47.setVisible(false);
//        //  jPanel_trkeb.setVisible(false);
//        jPanel_elsiana_1.setVisible(true);
          open_elsiana_screen(900,70);
       model_elfne_sianat.setRowCount(0);
        
        clear_text_siana();
        
       
        model_siana.setRowCount(0);
        model_siana_help.setRowCount(0);
     //   System.out.println("enter siana");
      
        elsiana.get_type_elsiana();
        }
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_servisingMouseReleased

    private void jLabel_databaseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_databaseMouseReleased
        // h.client_report();
        
       // h.select_db();
         if (jLabel_database.getName().equals("T")) 
        {
      if (opened_main_screen!=h.update_panel&&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(h.update_panel, height); 
           opened_main_screen=h.update_panel;
           animate_separator_x(jPanel25, 397);
        jPanel25.setSize(110, 4);
       }  
       
        }
           else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_databaseMouseReleased

    private void jLabel_usersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_usersMouseReleased
 if (jLabel_users.getName().equals("T")) 
        {
        h.privilages.start("users");
           animate_separator_x(jPanel25, 275);
        jPanel25.setSize(110, 4);
        }
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_usersMouseReleased
void open_elsiana_screen(int location , int width)
{
     if (opened_main_screen!=jPanel_elsiana_1&&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(jPanel_elsiana_1, height); 
           opened_main_screen=jPanel_elsiana_1;
            
       }  
     animate_separator_x(jPanel25, location);
        jPanel25.setSize(width, 4);
}
    private void jLabel_paymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_paymentsMouseReleased
 if (jLabel_payments.getName().equals("T")) 
        {
             elsiana.archive_value=archive.archive_el2st ;
              elsiana.archive_table="archive";
             jPanel_fatorh_siana_panel.setVisible(false);
             jPanel_perioud_siana.setVisible(true);
        jTextField_real_date_siana2.setEnabled(false);
        jPanel20.setName("false");
        jLabel_id_elmo7sl.setText("كود المحصل");
       jLabel_name_elmo7sl.setText("اسم المحصل");
        flag_3otl_siana = 2;
        flag_insert_elfne_sianat=true ;
         jLabel13.setText("فاتوره الأقساط");
          clear_text_siana();
          jTable_siana.setName("جدول الأقساط");
        jTable_siana_help_dmg.setName("سجل الخطة للأقساط");
        jTable_siana_help_dmg_reject.setName("سجل الرفض للأقساط");
        // jPanel_add_client.setVisible(false);
//        jScrollPane47.setVisible(false);
//        //  jPanel_trkeb.setVisible(false);
//        jPanel_elsiana_1.setVisible(true);
       
        open_elsiana_screen(700,70);
        model_siana.setRowCount(0);
        model_siana_help.setRowCount(0);
           model_elfne_sianat.setRowCount(0);
     
        }  
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_paymentsMouseReleased

    private void jLabel_new_servisingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_new_servisingMouseReleased
 if (jLabel_new_servising.getName().equals("T")) 
        {
        elsiana.archive_value=archive.archive_siana_gdeda ;
         elsiana.archive_table="archive_siana_gdeda";
        flag_trkeb_siana=true ;
         trkeb.table_name="siana_gdeda";
        trkeb.table_name_arch="siana_gdeda_archive";
         trkeb.table_name_hints="hints_siana_gdeda";
         jTable_trkeb.setName("إخطارات الصيانات الجديدة");
jTable_trkeb_archive_not_done.setName("سجل الرفض للصيانات الجديدة");
jTable_trkeb_archive_done.setName("سجل الخطه للصيانات الجديدة");
        model_trkeb.setRowCount(0);
        model_trkeb_help.setRowCount(0);
//            jlayeredpane.setVisible(true);
//            
//            jScrollPane47.setVisible(false);
          enter_trkeb_screen(550,140);
      trkeb.enter_eltrkebat();
      jLabel_new_servising_notify.setText(jLabel_count.getText());
        } 
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_new_servisingMouseReleased

   
    private void jLabel_reportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_reportsMouseReleased
 if (jLabel_reports.getName().equals("T")) 
        {
        animation(jPanel_drop_reports ,170);
       
        }
    }//GEN-LAST:event_jLabel_reportsMouseReleased

    private void jLabel_client_reportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_client_reportsMouseReleased
 if (jLabel_client_reports.getName().equals("T")) 
        {

        h.client_report(null,null);
       if (opened_main_screen!=h.jPanel_cl_rep&&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(h.jPanel_cl_rep, height);
           opened_main_screen=h.jPanel_cl_rep;
          
           animation(jPanel_drop_reports ,170);
         animate_separator_x(jPanel25, 195);
        jPanel25.setSize(70, 4);
       }
        }
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
   
    }//GEN-LAST:event_jLabel_client_reportsMouseReleased

    private void jLabel_company_reportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_company_reportsMouseReleased
 if (jLabel_company_reports.getName().equals("T")) 
        {     
        if (opened_main_screen!=h.jPanel_co_rep &&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(h.jPanel_co_rep, height); 
           opened_main_screen=h.jPanel_co_rep;
           
           
           animation(jPanel_drop_reports ,170);
         animate_separator_x(jPanel25, 195);
        jPanel25.setSize(70, 4);
       }  
        }
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_company_reportsMouseReleased

    private void jLabel_emp_reportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_emp_reportsMouseReleased
       if (jLabel_emp_reports.getName().equals("T")) 
        {
        if (opened_main_screen!=h.jPanel_elfne &&opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
           animation(h.jPanel_elfne, height); 
           opened_main_screen=h.jPanel_elfne;
           
           
           animation(jPanel_drop_reports ,170);
         animate_separator_x(jPanel25, 195);
        jPanel25.setSize(70, 4);
       }  
        }
         else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_emp_reportsMouseReleased

    private void jLabel_sectorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sectorsMouseReleased
       
         if (jLabel_sectors.getName().equals("T")) 
        {
            if (opened_main_screen!=h.ekta3at &&opened_main_screen.getHeight()>=height)
        { 
            animation(opened_main_screen, height);
            animation(h.ekta3at, height);
            opened_main_screen=h.ekta3at;
            
            
           animation(jPanel_drop_reports ,170);
         animate_separator_x(jPanel25, 195);
        jPanel25.setSize(70, 4);
           
        }
        h.load_regions();
        }
           else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_sectorsMouseReleased

    private void jLabel_add_wrongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_wrongMouseReleased
 if (jLabel_add_wrong.getName().equals("T")) 
        {       
        animation(jPanel_drop_reports1, 80); 
        if (opened_main_screen!=jPanel_add_3otl&&opened_main_screen.getHeight()>=height)
        {
            animation(opened_main_screen, height);
            animation(jPanel_add_3otl, height);
            opened_main_screen=jPanel_add_3otl;
            animate_separator_x(jPanel25, 815);
            jPanel25.setSize(75, 4);
        }
        }
   else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_add_wrongMouseReleased

    private void jLabel_wrongs_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_wrongs_2MouseReleased
       if (jLabel_wrongs_2.getName().equals("T")) 
        {
             elsiana.archive_value=archive.archive_el3otl ;
              elsiana.archive_table="archive";
             jTable_siana.setName("جدول الأعطال");
        jTable_siana_help_dmg.setName("سجل الخطة للأعطال");
        jTable_siana_help_dmg_reject.setName("سجل الرفض للأعطال");
        animation(jPanel_drop_reports1, 80);
        jTextField_real_date_siana2.setEnabled(false);
       jPanel20.setName("false");
        jLabel_id_elmo7sl.setText("كود الفني");
       jLabel_name_elmo7sl.setText("اسم الفني");   
        model_siana.setRowCount(0);
        model_siana_help.setRowCount(0);
        jLabel_id_elmo7sl.setVisible(true);
        jLabel_name_elmo7sl.setVisible(true);
        jLabel_telephone_elmo7sl.setVisible(true);
        jLabel_places_elmo7sl.setVisible(true);
        flag_insert_elfne_sianat=true ;
         jLabel13.setText("فاتوره الأعطال");
          clear_text_siana();
        jTextField_id_elfne_sianat.setVisible(true);
        jTextField_name_elfne_sianat.setVisible(true);
        jTextField_phone_elfne_sianat.setVisible(true);
        jTextField_places_elfne_sianat.setVisible(true);
        //jScrollPane49.setVisible(true);
        flag_3otl_siana = 1;
//        jScrollPane47.setVisible(false);
//       jPanel_elsiana_1.setVisible(true);
      
     open_elsiana_screen(815,75);
        model_siana.setRowCount(0);
        model_siana_help.setRowCount(0);
           model_elfne_sianat.setRowCount(0);
        try {
            ob.stmt=ob.conn.createStatement();
    String []s_e_m=ob.get_start_end_of_month();
           ResultSet rs = ob.stmt.executeQuery(
                                "select * from wrongs w left outer join clients_product cs on w.serial=cs.serial "
                                        + " left outer join clients c on cs.id_client=c.id_client "
                                        + "left outer join product p on p.id_product=cs.id_product "
                                        + "left outer join countries co on co.region=cs.region"
                                        + " left outer join el3otl si on si.serial=cs.serial and si.id in "
                                        + "( select max(id) from el3otl sii  where sii.serial= cs.serial) "
                                        + "left outer join elsiana si2 on si2.serial=cs.serial and si2.id in "
                                        + "( select max(id) from elsiana sii2  where sii2.serial= cs.serial) "
                             +" left outer join archive ar on ar.serial=cs.serial and ar.id_archive="+elsiana.archive_value+"  and ar.id in "
                            + "( select max(id) from archive arr  where arr.serial= cs.serial and arr.id_archive="+elsiana.archive_value+"   and arr.date "+ "between '" + s_e_m[0] + "' and '" + s_e_m[1] + "') " 
                           
                            +" left outer join archive ar2 on ar2.serial=cs.serial and ar2.id_archive="+elsiana.archive_value+"  and ar2.id in "
                            + "( select max(id) from archive arr2  where arr2.serial= cs.serial and arr2.id_archive="+elsiana.archive_value+"   and arr2.date <'" + s_e_m[0] + "' )"
                            
                                
                              );
           
  while (rs.next()) {
            
           
                String id_client = String.valueOf(rs.getString("id_client"));
                String id_product = String.valueOf(rs.getString("id_product"));
                String quantity = String.valueOf(rs.getString("quantity"));
                String hints = rs.getString("hints");
                String date_buy = rs.getString("date_buy");
                String date1 = rs.getString("date1");
                String date2 = rs.getString("date2");
                String date3 = rs.getString("date3");
                //joptionpane.showMessageDialog(null, id_client);
                String date5 = rs.getString("date5");
                String date6 = rs.getString("date6");
                String date7 = rs.getString("date7");
                String siana_1 = rs.getString("siana_1");
                String siana_2 = rs.getString("siana_2");
                String siana_3 = rs.getString("siana_3");
                String siana_5 = rs.getString("siana_5");
                String siana_6 = rs.getString("siana_6");
                String siana_7 = rs.getString("siana_7");
                String rsed_1 = rs.getString("rsed1");
                String rsed_2 = rs.getString("rsed2");
                String rsed_3 = rs.getString("rsed3");
                String rsed_5 = rs.getString("rsed5");
                String rsed_6 = rs.getString("rsed6");
                String rsed_7 = rs.getString("rsed7");
                String nezam_eldf3 = String.valueOf(rs.getString("nezam_eldf3"));
                String date_el2st = rs.getString("date_el2st");
                String elb2e = String.valueOf(rs.getString("elb2e"));
                  String region = rs.getString("region");
                  String home_num = rs.getString("home_num");
                  String street = rs.getString("street");

                String siana_elb2e = rs.getString("total_elb2e_sian");
                String clas = rs.getString("class");
                String elmosthdaf = rs.getString("elmosthdaf");
                String num_month_remake_class = rs.getString("num_month_remake_class");
                String date_remake_class = rs.getString("date_remake_class");
                String serial = rs.getString("serial");
                String wrongs = "";
                String date_wrong = "";
                String date_end = "";

{

                  wrongs = rs.getString("wrong");
                 date_wrong = rs.getString("date");
                 date_end = rs.getString("dead_line");
}



                String name_client = rs.getString("name_client");
               String job = String.valueOf(rs.getString("job"));
                String phone = String.valueOf(rs.getString("phone"));
               

                String name_product = "";
                 String el2st_product = "";

                { name_product = rs.getString("name_product");
                 el2st_product = rs.getString("el2st");
                System.out.println("select name_product from product where id_product =" + id_product);
                }
                //joptionpane.showMessageDialog(null, date5);
               
               String country=rs.getString("country");
                  String month_year_day="";
                       
int y=0 ;
for (; y<date_end.length();y++)
{
    month_year_day+=date_end.charAt(y);
    if (date_end.charAt(y)=='-')
    {
        break ;
    }
    
}
                    y++;          
for ( ; y<date_end.length();y++)
{
    System.out.println(date_end.charAt(y));
    month_year_day+=date_end.charAt(y);
    if (date_end.charAt(y)=='-')
    {
        break ;
    }
}
month_year_day+="01";
String type_siana="";
      System.out.println(id_client);
                System.out.println(date1);
                    type_siana = make_type_siana(date1, date2, date3, date5, date6, date7,ob.time_month(month_year_day, 1));
                
           model_siana.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7,type_siana,
                                wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                                date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7,rsed_1, rsed_2, rsed_3, rsed_5
                    , rsed_6, rsed_7,siana_elb2e,clas,elmosthdaf,date_remake_class,num_month_remake_class,home_num,street,country,serial,rs.getString("si2.type_elsiana")+"\n"+"\n"+rs.getString("type_el3otl"),rs.getString("si2.date")+"\n"+"\n"+rs.getString("si.date"),job
             , rs.getString("ar.date") ,  rs.getString("ar2.date")});
              model_siana_help.addRow(new Object[]{id_client, name_client, region, phone, hints, id_product, name_product, quantity, date_buy, date1, date2, date3, date5, date6, date7, type_siana,
                                wrongs, date_wrong, nezam_eldf3, date_end, el2st_product,
                                date_el2st, elb2e, siana_1, siana_2, siana_3, siana_5, siana_6, siana_7,rsed_1, rsed_2, rsed_3, rsed_5
                    , rsed_6, rsed_7,siana_elb2e,clas,elmosthdaf,date_remake_class,num_month_remake_class,home_num,street,country,serial,rs.getString("si2.type_elsiana")+"\n"+"\n"+rs.getString("type_el3otl"),rs.getString("si2.date")+"\n"+"\n"+rs.getString("si.date"),job
                , rs.getString("ar.date") ,  rs.getString("ar2.date")});
           
                        }     
                    
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
jLabel_count_siana.setText(String.valueOf(model_siana.getRowCount()));
jLabel_wrong_notify.setText(jLabel_count_siana.getText());
        }
         else
        {
            JOptionPane.showMessageDialog(null, "عفوا ليس لديك الصلاحيه للدخول");
        }
    }//GEN-LAST:event_jLabel_wrongs_2MouseReleased

    private void jLabel_change_passwordnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_change_passwordnMouseReleased
        jDialog1.setVisible(true);  
         animation(jPanel_drop_reports2, 80);
    }//GEN-LAST:event_jLabel_change_passwordnMouseReleased

    private void jLabel_wrongsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_wrongsMouseReleased
      //System.out.println("con"+jLabel_wrongs.getName().equals("T"));
        if (jLabel_wrongs.getName().equals("T")) 
        {
             jPanel_fatorh_siana_panel.setVisible(true);
             jComboBox_type_elsiana.setVisible(false);
             jPanel_perioud_siana.setVisible(false);
        animation(jPanel_drop_reports1, 80);
       

        }
        
    }//GEN-LAST:event_jLabel_wrongsMouseReleased

    private void jLabel_current_userMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_current_userMouseReleased
     if (jLabel_current_user.getName().equals("T")) 
        {
        animation(jPanel_drop_reports2, 110);
        }
    }//GEN-LAST:event_jLabel_current_userMouseReleased

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
    add_client.delete_client_from_canceled_table();
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseReleased
       add_client.import_from_excel();
    }//GEN-LAST:event_jLabel37MouseReleased

    private void jLabel41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseReleased
        add_client.read_client_from_excel();
    }//GEN-LAST:event_jLabel41MouseReleased

    private void jLabel42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseReleased
     add_client.read_client_from_text();
    }//GEN-LAST:event_jLabel42MouseReleased

    private void jLabel43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseReleased
           add_client.write_client_to_text();
    }//GEN-LAST:event_jLabel43MouseReleased

    private void jLabel44MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseReleased
      add_client.clear_textS();
    }//GEN-LAST:event_jLabel44MouseReleased

    private void jLabel47MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseReleased
        add_client.add_client();
    }//GEN-LAST:event_jLabel47MouseReleased

   void action_Add_client_p0()
   {
        if (opened_add_client!=jPanel9  &&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel9, height); 
           opened_add_client=jPanel9;
         
           animate_separator_x(jPanel24 ,830);
        
       }  
   }
    private void jLabel54MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseReleased
       action_Add_client_p0();
    }//GEN-LAST:event_jLabel54MouseReleased

    void action_add_client_p1()
    {
          if (opened_add_client!=jPanel_add_client_p1&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p1, height); 
           opened_add_client=jPanel_add_client_p1;
        animate_separator_x(jPanel24 ,720);
       }  
    }
    private void jLabel_add_client_b1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b1MouseReleased
        action_add_client_p1();
    }//GEN-LAST:event_jLabel_add_client_b1MouseReleased
void go_to_main_screen()
{
        if (opened_main_screen!=jPanel_background && opened_main_screen.getHeight()>=height)
       {
           animation(opened_main_screen, height);
          
           animation(jPanel_background, height); 
           opened_main_screen=jPanel_background;
           jPanel25.setSize(28,4);
           jPanel25.setLocation(1172, 56);
       }  
}
    private void jLabel34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseReleased
      go_to_main_screen();
    }//GEN-LAST:event_jLabel34MouseReleased
void action_add_client_p2()
{
     if (opened_add_client!=jPanel_add_client_p2&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p2, height); 
           opened_add_client=jPanel_add_client_p2;
          animate_separator_x(jPanel24,600);
       }  
}
    private void jLabel_add_client_b2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b2MouseReleased
     action_add_client_p2();
    }//GEN-LAST:event_jLabel_add_client_b2MouseReleased

    void action_add_client_p3()
    {
         if (opened_add_client!=jPanel_add_client_p3&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p3, height); 
           opened_add_client=jPanel_add_client_p3;
            animate_separator_x(jPanel24 ,480);
          
       }  
    }
    private void jLabel_add_client_b3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b3MouseReleased
action_add_client_p3();
    }//GEN-LAST:event_jLabel_add_client_b3MouseReleased

      void action_add_client_p4()
    {
         if (opened_add_client!=jPanel_add_client_p4&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p4, height); 
           opened_add_client=jPanel_add_client_p4;
       animate_separator_x(jPanel24 ,360);
       }  
    }
    private void jLabel_add_client_b4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b4MouseReleased
      action_add_client_p4();
    }//GEN-LAST:event_jLabel_add_client_b4MouseReleased
  void action_add_client_p5()
    {
         if (opened_add_client!=jPanel_add_client_p5&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p5, height); 
           opened_add_client=jPanel_add_client_p5;
          animate_separator_x(jPanel24 ,240);
          
       }  
    }
    private void jLabel_add_client_b5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b5MouseReleased
       action_add_client_p5();
    }//GEN-LAST:event_jLabel_add_client_b5MouseReleased
 void action_add_client_p6()
    {
         if (opened_add_client!=jPanel_Add_client_p6&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_Add_client_p6, height); 
           opened_add_client=jPanel_Add_client_p6;
         animate_separator_x(jPanel24 ,130);
       }  
    }
    private void jLabel_add_client_b6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b6MouseReleased
      action_add_client_p6();
    }//GEN-LAST:event_jLabel_add_client_b6MouseReleased

    void action_add_client_p7()
    {
         if (opened_add_client!=jPanel_add_client_p7&&opened_add_client.getHeight()>=height)
       {
           animation(opened_add_client, height);
           animation(jPanel_add_client_p7, height); 
           opened_add_client=jPanel_add_client_p7;
          animate_separator_x(jPanel24 ,20);
       }  
    }
    private void jLabel_add_client_b7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_add_client_b7MouseReleased
      action_add_client_p7();
    }//GEN-LAST:event_jLabel_add_client_b7MouseReleased

    private void jTextField_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_quantityKeyReleased
        if (evt.getKeyCode()==10)action_add_client_p3();
    }//GEN-LAST:event_jTextField_quantityKeyReleased

    private void jTextField_rsed_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rsed_1KeyReleased
       if (evt.getKeyCode()==10)action_add_client_p4();
    }//GEN-LAST:event_jTextField_rsed_1KeyReleased

    private void jTextField_siana_6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_siana_6KeyReleased
      if (evt.getKeyCode()==10)action_add_client_p7();
    }//GEN-LAST:event_jTextField_siana_6KeyReleased

    private void jTextField_nezam_eldf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nezam_eldf3KeyReleased
     if (jTextField_nezam_eldf3.getText().equals("0"))((JTextField)jTextField_date_el2st.getDateEditor().getUiComponent()).setText("0001-01-01");
    }//GEN-LAST:event_jTextField_nezam_eldf3KeyReleased

    private void jPanel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseReleased
      trkeb.add_into_trkeb();
    }//GEN-LAST:event_jPanel19MouseReleased

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
       if (flag_trkeb_siana==false)
       animation(jPanel_add_trkeb, 460);
       else animation(jPanel_add_trkeb, 660);
       
      
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel_delete_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_delete_trkebMouseReleased
       trkeb.delete_to_canceled();
    }//GEN-LAST:event_jLabel_delete_trkebMouseReleased

    private void jLabel_order_table_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_order_table_trkebMouseReleased
        h.sort_table.save_sorted_columns(jTable_trkeb, "installation_table.txt");
    }//GEN-LAST:event_jLabel_order_table_trkebMouseReleased

    private void jLabel_print_trkebMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_print_trkebMouseReleased
     try {
              int ch = JOptionPane.showConfirmDialog(null, "للطباعه اضغط نعم و للتصدير اضغط لا ؟");
        if (ch == 0) {
            h.print_object.set_table(jTable_trkeb);
            h.print_object.Load();
            h.jDialog_print.setVisible(true);
        } else if (ch == 1) {
        ob.write_excel(jTable_trkeb);
        }
             
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_print_trkebMouseReleased

    private void jLabel63MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseReleased
        int i =jTable_trkeb.getSelectedRow();
        if (i!=-1)
        {
                            String serial = 
                            String.valueOf(model_trkeb.getValueAt(i, 27));
     
                            String text=jTextArea3.getText();
                            String date=ob.time_now();
                            
            try {
                ob.stmt=ob.conn.createStatement();
            ResultSet rs = ob.stmt.executeQuery("SHOW TABLE STATUS WHERE `Name` = '"+trkeb.table_name_hints+"'");
           if (rs.next())
           {
            String nextid = rs.getString("Auto_increment");
           
           
                ob.stmt.executeUpdate("insert into "+trkeb.table_name_hints+" values ("+nextid+","+serial+",'"+ jLabel_current_user.getText()+": "+text+"','"
                        +date+"')"); 
                model_hints_trkeb.addRow(new Object[]{nextid,jLabel_current_user.getText()+": "+text,date});
                jTextArea3.setText("");
                
           }
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel63MouseReleased

    private void jLabel64MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseReleased
        int x=jTable_hints1.getSelectedRow();
   if (x!=-1)
   {
            try {
                ob.stmt.executeUpdate("delete from "+trkeb.table_name_hints+" where id="+String.valueOf(model_hints_trkeb.getValueAt(x, 0)));
                model_hints_trkeb.removeRow(x);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    }//GEN-LAST:event_jLabel64MouseReleased

    private void jLabel62MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseReleased
         int ch = JOptionPane.showConfirmDialog(null, "للطباعه اضغط نعم و للتصدير اضغط لا ؟");
        if (ch == 0) {
            int ch2=JOptionPane.showConfirmDialog(null, "لطباعة سجل الخطة اضغط نعم لسجل الرفض اضغط لا ؟");
            if (ch2==0)
            {
            h.print_object.set_table(jTable_siana_help_dmg);
            h.print_object.Load();
            h.jDialog_print.setVisible(true);
            }
           else if (ch2==1)
            {
            h.print_object.set_table(jTable_siana_help_dmg_reject);
            h.print_object.Load();
            h.jDialog_print.setVisible(true);
            }
        } else if (ch == 1) {
             int ch2=JOptionPane.showConfirmDialog(null, "لتصدير سجل الخطة اضغط نعم لسجل الرفض اضغط لا ؟");
            if (ch2==0)
            {
        elsiana.  short_sheet(jTable_siana_help_dmg);
            }
            else  if (ch2==1)
            {
        elsiana.  short_sheet(jTable_siana_help_dmg_reject);
            }
        }
    }//GEN-LAST:event_jLabel62MouseReleased

    private void jLabel65MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseReleased
    
        
         if (String.valueOf(JOptionPane.showInputDialog(null, "لمسح جميع العملاء بالجدول الحالي من الخطة قم بكاتبة مسح جميع العملاء من الخطة")).equals("مسح جميع العملاء من الخطة")) {
            for (int i = 0; i < model_siana.getRowCount(); i++) {
                if (model_siana.getValueAt(i, 47) != null || String.valueOf(model_siana.getValueAt(i, 47)).length() > 0) {
                    if (elsiana.delete_from_archive((String) model_siana.getValueAt(i, 43))) {
                        model_siana.setValueAt(null, i, 47);
                        int rt = ob.get_client_from_back_table((String) model_siana.getValueAt(i, 43), model_siana_help, 43);
                        if (rt != -1) {
                            model_siana_help.setValueAt(null, rt, 47);
                        }

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "لم نتمكن من مسح العميل برقم مسلسل "+model_siana.getValueAt(i, 43)+" من الخطة");
                    }
                }
            }
        }
         else
     {
         JOptionPane.showMessageDialog(null, "برجاء التأكد من كتابة الجمله المطلوبة بشكل صحيح");
     }
        
//        int ch=JOptionPane.showConfirmDialog(null, "لمسح سجل الخطة اضغط نعم لمسح سجل الرفض اضغط لا ؟");
//    if (ch==0)
//    {
//        model_siana_dmg.setRowCount(0);
//        jLabel_counter_siana_archive_done.setText("0");
//    }
//    else if (ch==1)
//    {
//         model_siana_dmg_reject.setRowCount(0);
//           jLabel_counter_siana_archive_not.setText("0");
//    }
        
        
        
//        String ch = JOptionPane.showInputDialog(null, "لمسح الكل من الخطة قم بكتابة مسح الخطة");
//        if (ch.equals("مسح الخطة")) {
//            try {
//                if (flag_3otl_siana==0||flag_3otl_siana==1)
//                {
//                for (int i = 0; i < model_siana_help.getRowCount(); i++) {
//
//                  if (String.valueOf(model_siana_help.getValueAt(i, 4)).contains("~["+elsiana.get_pattern_siana(0)+","+elsiana.get_pattern_siana(1)+"]"))
//                      elsiana.mark_client_in_archive(String.valueOf(model_siana_help.getValueAt(i, 4))
//                              .replaceAll("~["+elsiana.get_pattern_siana(0)+","+elsiana.get_pattern_siana(1)+"]", "~"),
//                            String.valueOf(model_siana_help.getValueAt(1, 43)), "clients_product");
//
//                }
//                }
//                else
//                {
//                    for (int i = 0; i < model_siana_help.getRowCount(); i++) {
//
//                  if (String.valueOf(model_siana_help.getValueAt(i, 4)).contains("~["+elsiana.get_pattern_siana(0)+","+elsiana.get_pattern_siana(1)+"]"))
//                      elsiana.mark_client_in_archive(String.valueOf(model_siana_help.getValueAt(i, 4))
//                              .replaceAll("~["+elsiana.get_pattern_siana(0)+","+elsiana.get_pattern_siana(1)+"]", "~"),
//                            String.valueOf(model_siana_help.getValueAt(1, 43)), "clients_product");
//
//                }
//                }
//                JOptionPane.showMessageDialog(null, "تم الحفظ");
//            } catch (SQLException ex) {
//                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
      
    }//GEN-LAST:event_jLabel65MouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
    int ch=JOptionPane.showConfirmDialog(null, "للأضافة للخطة اضغط نعم لأضافه لسجل الرفض اضغط لا ؟");
     
    if (ch==0)
    {
     if (String.valueOf(JOptionPane.showInputDialog(null,"لتسجيل جميع العملاء بالجدول الحالي لسجل الخطة قم بكتابة اضافة جميع العملاء للخطة")).equals("اضافة جميع العملاء للخطة")){
         elsiana.add_all_to_archive(model_siana, model_siana_dmg,model_siana_help , "hints", 43 ,47 ,true
//                 ,4,elsiana.get_pattern_siana(flag_3otl_siana),"clients_product" ,model_siana_help
         );
           jLabel_counter_siana_archive_done.setText(String.valueOf(model_siana_dmg.getRowCount()));
     }
     else
     {
         JOptionPane.showMessageDialog(null, "برجاء التأكد من كتابة الجمله المطلوبة بشكل صحيح");
     }
    }
    else if (ch==1)
    {
        elsiana.add_all_to_archive(model_siana, model_siana_dmg_reject,model_siana_help, "hints", 43 ,47, false
//                ,-1,null,null,model_siana_help
        );
          jLabel_counter_siana_archive_not.setText(String.valueOf(model_siana_dmg_reject.getRowCount()));
    }
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel67MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseReleased
        h.sort_table.save_sorted_columns(jTable_siana, "customer_service_table.txt");
    }//GEN-LAST:event_jLabel67MouseReleased
 
    private void jLabel69MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseReleased
      int ch = JOptionPane.showConfirmDialog(null, "للطباعه اضغط نعم و للتصدير اضغط لا ؟");
        if (ch == 0) {
            h.print_object.set_table(jTable_siana);
            h.print_object.Load();
            h.jDialog_print.setVisible(true);
        } else if (ch == 1) {
        elsiana. short_sheet(jTable_siana);
        }
    }//GEN-LAST:event_jLabel69MouseReleased

    private void jLabel70MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseReleased
        animation(jPanel11, 570);
    }//GEN-LAST:event_jLabel70MouseReleased

    private void jLabel71MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseReleased
      elsiana.add_hint();
    }//GEN-LAST:event_jLabel71MouseReleased
    boolean flag_jcomb=false ;
    private void jLabel68MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseReleased
      if (flag_jcomb)
      {
          jComboBox_client_hints.hidePopup();
         flag_jcomb=false ;
      }
      else
      {
           jComboBox_client_hints.showPopup();
           flag_jcomb=true;
      }
    }//GEN-LAST:event_jLabel68MouseReleased

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
       elsiana.add_elba2e_siana_fatorh();
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased
       elsiana.add_fatorh_elsiana();
    }//GEN-LAST:event_jPanel7MouseReleased

    private void jPanel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseReleased
if (jPanel20.getName().equals("true"))      elsiana.t2gel();
    }//GEN-LAST:event_jPanel20MouseReleased

    private void jPanel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseReleased
        here:
        {
            int x = jTable_add_3otl.getSelectedRow();
           
if (x!=-1)
{ String wrong = jTextArea1.getText();

              String date_el3otl =  ((JTextField)jTextField_date_el3otl.getDateEditor().getUiComponent()).getText();
               boolean flag_date_el3otl = true;
            
                flag_date_el3otl = ob.check_time(date_el3otl);
           
            if (flag_date_el3otl == false) {
                jTextField_date_el3otl.setBackground(Color.pink);
            }
              
            String date_end =  ((JTextField)jTextField_date_end_line_el3otl.getDateEditor().getUiComponent()).getText();
            boolean flag_end = true;
           
                flag_end = ob.check_time(date_end);
           
            if (flag_end == false) {
                jTextField_date_end_line_el3otl.setBackground(Color.pink);
            }
           
                if (date_el3otl.equals(date_end)||ob.time_compare(date_el3otl, date_end)==false)
                {
                    JOptionPane.showMessageDialog(null,"يجب ان يكون الحد الأقصي بعد تاريخ تسجيل العطل");
                    flag_end=false ;
                }
           
            String serial = String.valueOf(model_add_3otl.getValueAt(x, 17));
            if (serial.length() != 0 
                    && wrong.length() != 0 && flag_end == true&&flag_date_el3otl==true) {
                try {


                    ob.stmt=ob.conn.createStatement();
                    ResultSet rs_check=ob.stmt.executeQuery("select wrong from wrongs where serial="+serial);
                    if (rs_check.next())
                    {
                        String old_wrong=rs_check.getString(1);
                     int ch=   JOptionPane.showConfirmDialog(null," تم تسجيل عطل لذلك العميل من قبل هل تريد اضافه العطل الي العطل القديم  "+"\n"
                                +old_wrong);
                        if (ch==0)
                        {
                          ob.stmt.executeUpdate("update wrongs set wrong='"+old_wrong+"-"+wrong+"' , date='"+date_el3otl+"' , dead_line='"
                                    + date_end+"' "
                                    + "  where serial="+serial
                                 );
                        }
                      
                    }
                    else
                    {
                    ob.stmt.executeUpdate("insert into wrongs values ("+"default"+","+serial+",'"+
                            jLabel_current_user.getText()+" :"+wrong+"','"+date_end+"','"+date_el3otl+"')");
                    
                    }
                      jTextArea1.setText("");
                    ((JTextField)jTextField_date_el3otl.getDateEditor().getUiComponent()).setText("");
                    jTextField_date_el3otl.setBackground(Color.white);
                     ((JTextField)jTextField_date_end_line_el3otl.getDateEditor().getUiComponent()).setText("");
                    jTextField_date_end_line_el3otl.setBackground(Color.white); 
                     
                        
                          h.alarm_damage();
                            
                    
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
}else {
                JOptionPane.showMessageDialog(null, "لم يتم تحديد عميل ");
            }
        }
    }//GEN-LAST:event_jPanel21MouseReleased

    private void jLabel78MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseReleased
        animation(jPanel22, 240);
    }//GEN-LAST:event_jLabel78MouseReleased

    private void jPanel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseReleased
    if (!jLabel_current_user.getText().equals(""))
    {  h.f_log.log_off();
        if (!jCheckBox_autosave.isSelected()) {
            save();
        }
        System.exit(0);
    }
    }//GEN-LAST:event_jPanel16MouseReleased

    private void jCheckBox_animateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_animateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_animateMouseReleased

    private void jTextField_hintsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_hintsKeyReleased
         if (evt.getKeyCode()==10)action_add_client_p5();
    }//GEN-LAST:event_jTextField_hintsKeyReleased

    private void jLabel72MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseReleased
       elsiana.delete_hint();
    }//GEN-LAST:event_jLabel72MouseReleased

    private void jLabel25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseReleased
        animation(jPanel_classes, h.class_list.size()*30);
        
    }//GEN-LAST:event_jLabel25MouseReleased

    private void jLabel32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseReleased
        int ch = JOptionPane.showConfirmDialog(null, "للأضافة للخطة اضغط نعم لأضافه لسجل الرفض اضغط لا ؟");
        if (ch == 0) {

            if (jTable_siana.getSelectedRow() != -1) {
               elsiana.add_row_to_archive(model_siana, model_siana_dmg,model_siana_help , "hints", 43, 47 , jTable_siana.getSelectedRow() ,true
                //              ,4,elsiana.get_pattern_siana(flag_3otl_siana),"clients_product",model_siana_help
                );
//                model_siana.setValueAt(re, jTable_siana.getSelectedRow(), 47);
//                int rt = ob.get_client_from_back_table((String) model_siana.getValueAt(jTable_siana.getSelectedRow(), 43), model_siana_help, 43);
//                if (rt != -1) {
//                    model_siana_help.setValueAt(re, rt, 47);
//                }
                jLabel_counter_siana_archive_done.setText(String.valueOf(model_siana_dmg.getRowCount()));
//             

            }
    }
    else  if (ch==1)
    {
      if(jTable_siana.getSelectedRow()!=-1)  
      {elsiana.add_row_to_archive(model_siana ,model_siana_dmg_reject,model_siana_help ,"hints",43, 47,jTable_siana.getSelectedRow() ,false
//              ,-1,null,null,model_siana_help
      );
        jLabel_counter_siana_archive_not.setText(String.valueOf(model_siana_dmg_reject.getRowCount()));
      
      }
    }
    
    }//GEN-LAST:event_jLabel32MouseReleased

    private void jLabel51MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseReleased
        animation(jPanel26, 550);
    }//GEN-LAST:event_jLabel51MouseReleased

    private void jLabel66MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseReleased

     trkeb.update_client();
    }//GEN-LAST:event_jLabel66MouseReleased

    private void jTable_siana_help_dmg_rejectMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_siana_help_dmg_rejectMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_siana_help_dmg_rejectMouseReleased

    private void jLabel82MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseReleased
        int rows[] = jTable_siana_help_dmg.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
           
                model_siana_dmg.removeRow(rows[i]-i);
         
        }
          jLabel_counter_siana_archive_done.setText(String.valueOf(model_siana_dmg.getRowCount()));
    }//GEN-LAST:event_jLabel82MouseReleased

    private void jLabel81MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseReleased
    
         int rows[] = jTable_siana_help_dmg_reject.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
           
                model_siana_dmg_reject.removeRow(rows[i]-i);
         
        }
        jLabel_counter_siana_archive_not.setText(String.valueOf(model_siana_dmg_reject.getRowCount()));
    }//GEN-LAST:event_jLabel81MouseReleased

    private void jLabel83MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseReleased
      if (h.password.equals(jPasswordField1.getText()))
{
        if (jPasswordField2.getText().length()>0||jPasswordField2.getText().length()<200)
   {     if (h.f_log.change_password(jPasswordField2.getText())==true)
      {
        try {
           
            
            java.sql.PreparedStatement st2 = ob.conn.prepareStatement("update users set password=password(?) where user_name=? and password=password(?)");
            st2.setString(1, jPasswordField2.getText());
            st2.setString(2, h.user_name);
            st2.setString(3, jPasswordField1.getText());
            st2.execute();
            st2.close();  
            h.password=  jPasswordField2.getText(); 
            JOptionPane.showMessageDialog(null, "تم الحفظ");
       
        jDialog1.setVisible(false );
//         setVisible(false);
//         
//       
//         h.setSize(700, 480);
//        
//       h.setLocation((int)(h.width /2-300),(int)( h.height/2-300) );
//      h.setVisible(true);   h.jPanel_login.setVisible(true);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "خطأ حاول مرة ثانية");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      }
   }
        else
        {
           JOptionPane.showMessageDialog(null, "تأكد  من عدد حروف كلمه السر"); 
        }

    }
else
{
    JOptionPane.showMessageDialog(null, "تأكد من كلمة المرور القديمة");
}
    }//GEN-LAST:event_jLabel83MouseReleased

    private void jLabel93MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseReleased
        int rows[] = jTable_trkeb_archive_not_done.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {

           model_trkeb_archive_not_done.removeRow(rows[i] - i);

        }
       
//        if (jTable_trkeb_archive_not_done.getSelectedRow()!=-1)
//      {
//          model_trkeb_archive_not_done.removeRow(jTable_trkeb_archive_not_done.getSelectedRow());
//           jLabel_counter_trkeb_archive_not.setText(String.valueOf(model_trkeb_archive_not_done.getRowCount()));
//      }
         jLabel_counter_trkeb_archive_not.setText(String.valueOf(model_trkeb_archive_not_done.getRowCount()));
    }//GEN-LAST:event_jLabel93MouseReleased

    private void jLabel94MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseReleased
        int rows[] = jTable_trkeb_archive_done.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {

            model_trkeb_archive_done.removeRow(rows[i] - i);

        }
//        if (jTable_trkeb_archive_done.getSelectedRow()!=-1)
//      {
//          model_trkeb_archive_done.removeRow(jTable_trkeb_archive_done.getSelectedRow());
//          jLabel_counter_trkeb_archive_done.setText(String.valueOf(model_trkeb_archive_done.getRowCount()));
//      } 
        jLabel_counter_trkeb_archive_done.setText(String.valueOf(model_trkeb_archive_done.getRowCount()));
    }//GEN-LAST:event_jLabel94MouseReleased

    private void jTable_trkeb_archive_not_doneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_trkeb_archive_not_doneMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_trkeb_archive_not_doneMouseReleased

    private void jTable_trkeb_archive_doneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_trkeb_archive_doneMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_trkeb_archive_doneMouseReleased

    private void jLabel95MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseReleased
     
      
            int ch=JOptionPane.showConfirmDialog(null, "للأضافة للخطة اضغط نعم لأضافه لسجل الرفض اضغط لا ؟");
    if (ch==0)
    {
//        String pattern=trkeb.get_pattern_trkeb() ;
        if (String.valueOf(JOptionPane.showInputDialog(null,"لتسجيل جميع العملاء بالجدول الحالي لسجل الخطة قم بكتابة اضافة جميع العملاء للخطة")).equals("اضافة جميع العملاء للخطة")){
       elsiana.add_all_to_archive(model_trkeb, model_trkeb_archive_done,model_trkeb_help , trkeb.table_name_hints, 27,30,true
//               , 13 , trkeb.get_pattern_trkeb(), trkeb.table_name,model_trkeb_help
       );
         jLabel_counter_trkeb_archive_done.setText(String.valueOf(model_trkeb_archive_done.getRowCount()));
        }
       else
     {
         JOptionPane.showMessageDialog(null, "برجاء التأكد من كتابة الجمله المطلوبة بشكل صحيح");
     }
     
    }
    else if (ch==1)
    {
        elsiana.add_all_to_archive(model_trkeb, model_trkeb_archive_not_done,model_trkeb_help, trkeb.table_name_hints, 27,30,false
//                ,-1,null,null,model_trkeb_help
        );
         jLabel_counter_trkeb_archive_not.setText(String.valueOf(model_trkeb_archive_not_done.getRowCount()));
       
      
    }
         
       
    }//GEN-LAST:event_jLabel95MouseReleased

    private void jLabel96MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseReleased
if (jTable_trkeb.getSelectedRow()!=-1)
{
            int ch=JOptionPane.showConfirmDialog(null, "للأضافة للخطة اضغط نعم لأضافه لسجل الرفض اضغط لا ؟");
    if (ch==0)
    {
         elsiana.add_row_to_archive(model_trkeb, model_trkeb_archive_done,model_trkeb_help , trkeb.table_name_hints, 27,30,jTable_trkeb.getSelectedRow() ,true
//                 ,13,trkeb.get_pattern_trkeb() ,trkeb.table_name,model_trkeb_help
         );
         jLabel_counter_trkeb_archive_done.setText(String.valueOf(model_trkeb_archive_done.getRowCount()));
       
       
    }
    else if (ch==1)
    {
        
       elsiana.add_row_to_archive(model_trkeb, model_trkeb_archive_not_done, model_trkeb_help ,trkeb.table_name_hints, 27, 30,jTable_trkeb.getSelectedRow() ,false
//               ,-1,null,null,model_trkeb_help
       );
         jLabel_counter_trkeb_archive_not.setText(String.valueOf(model_trkeb_archive_not_done.getRowCount()));
      
       
    }
}
    }//GEN-LAST:event_jLabel96MouseReleased

    private void jLabel85MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseReleased
     
        if (String.valueOf(JOptionPane.showInputDialog(null, "لمسح جميع العملاء بالجدول الحالي من الخطة قم بكاتبة مسح جميع العملاء من الخطة")).equals("مسح جميع العملاء من الخطة")) {
            for (int i = 0; i < model_trkeb.getRowCount(); i++) {
                if (model_trkeb.getValueAt(i, 30) != null || String.valueOf(model_trkeb.getValueAt(i, 30)).length() > 0) {
                    if (elsiana.delete_from_archive((String) model_trkeb.getValueAt(i, 27))) {
                        model_trkeb.setValueAt(null, i, 30);
                        int rt = ob.get_client_from_back_table((String) model_trkeb.getValueAt(i, 27), model_trkeb_help, 27);
                        if (rt != -1) {
                            model_trkeb_help.setValueAt(null, rt, 27);
                        }

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "لم نتمكن من مسح العميل برقم مسلسل "+model_trkeb.getValueAt(i, 27)+" من الخطة");
                    }
                }
            }
        }
        else
     {
         JOptionPane.showMessageDialog(null, "برجاء التأكد من كتابة الجمله المطلوبة بشكل صحيح");
     }
        
        
//        int ch=JOptionPane.showConfirmDialog(null, "للمسح للخطة اضغط نعم للمسح لسجل الرفض اضغط لا ؟");
//    if (ch==0)
//    {
//       
//      model_trkeb_archive_done.setRowCount(0);
//      jLabel_counter_trkeb_archive_done.setText("0");
//        JOptionPane.showMessageDialog(null, "تم الحفظ");
//       
//    }
//    else if (ch==1)
//    {
//        
//      model_trkeb_archive_not_done.setRowCount(0);
//           jLabel_counter_trkeb_archive_not.setText("0");
//        JOptionPane.showMessageDialog(null, "تم الحفظ");
//       
//    }
    }//GEN-LAST:event_jLabel85MouseReleased

    private void jLabel86MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseReleased
     
           int ch2 = JOptionPane.showConfirmDialog(null, "للطباعه اضغط نعم و للتصدير اضغط لا ؟");
        if (ch2 == 0) {
            int ch = JOptionPane.showConfirmDialog(null, "للطباعه للخطة اضغط نعم للطباعه لسجل الرفض اضغط لا ؟");
            if (ch == 0) {
                h.print_object.set_table(jTable_trkeb_archive_done);
                h.print_object.Load();
                h.jDialog_print.setVisible(true);
            } else {
                h.print_object.set_table(jTable_trkeb_archive_not_done);
                h.print_object.Load();
                h.jDialog_print.setVisible(true);
            }

        } else if (ch2 == 1) {
            try {
                int ch = JOptionPane.showConfirmDialog(null, "للطباعه للخطة اضغط نعم للطباعه لسجل الرفض اضغط لا ؟");
                if (ch == 0) {
                    ob.write_excel(jTable_trkeb_archive_done);
                } else {
                    ob.write_excel(jTable_trkeb_archive_not_done);
                }
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (WriteException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jLabel86MouseReleased

    private void jLabel84MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseReleased
       animation(jPanel34, 550);
    }//GEN-LAST:event_jLabel84MouseReleased

    private void jLabel87MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseReleased
    jTextField_places.setText("");
    }//GEN-LAST:event_jLabel87MouseReleased

    private void jLabel88MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseReleased
     jTextField_place_trkeb.setText("");
    }//GEN-LAST:event_jLabel88MouseReleased

    private void jLabel89MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseReleased
       jTextField_places_elfne_sianat.setText("");
    }//GEN-LAST:event_jLabel89MouseReleased

    private void jComboBox_elfne_trkebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_elfne_trkebActionPerformed
      if (jComboBox_elfne_trkeb.getSelectedIndex()!=-1)
      {
        elsiana.filter_elfne(model_trkeb_help, model_trkeb,6 , elsiana.elfneen_list.get(jComboBox_elfne_trkeb.getSelectedIndex()).getPlace());
           jLabel_count.setText(String.valueOf(model_trkeb.getRowCount()));  
      }
    }//GEN-LAST:event_jComboBox_elfne_trkebActionPerformed

    private void jLabel90MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseReleased
       elsiana.delete_wrong();
    }//GEN-LAST:event_jLabel90MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        search_elfne_trkeb();
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jComboBox_elnfe_sianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_elnfe_sianaActionPerformed
       
    if (jComboBox_elnfe_siana.getSelectedIndex()!=-1)
    {
          
            elsiana.filter_elfne(model_siana_help, model_siana,42 , elsiana.elfneen_list.get(jComboBox_elnfe_siana.getSelectedIndex()).getPlace());
            jLabel_count_siana.setText(String.valueOf(model_siana.getRowCount()));
    }
    }//GEN-LAST:event_jComboBox_elnfe_sianaActionPerformed

    private void jLabel97MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseReleased

        int i = jTable_siana.getSelectedRow();
        if (i != -1) {
            int ch = JOptionPane.showConfirmDialog(null, "are you sure to save ?");
            if (ch == 0) {
                try {
                    //                    m.ob.stmt.executeUpdate("start TRANSACTION ");
                    //                    m.ob.stmt.executeUpdate("savepoint up");
                    String region = String.valueOf(model_siana.getValueAt(i, 2));
                    String rsed_1 = String.valueOf(model_siana.getValueAt(i, 29));
                    String rsed_2 = String.valueOf(model_siana.getValueAt(i, 30));
                    String rsed_3 = String.valueOf(model_siana.getValueAt(i, 31));
                    String rsed_5 = String.valueOf(model_siana.getValueAt(i, 32));
                    String rsed_6 = String.valueOf(model_siana.getValueAt(i, 33));
                    String rsed_7 = String.valueOf(model_siana.getValueAt(i, 34));
                    String home_num = String.valueOf(model_siana.getValueAt(i, 40));
                    String street = String.valueOf(model_siana.getValueAt(i, 41));
                    String country = String.valueOf(model_siana.getValueAt(i, 42));

                    String id_client = "";
                    String id_product = "";
                    String date_buy = "";
                    String name_client = String.valueOf(model_siana.getValueAt(i, 1));

                    String phone = String.valueOf(model_siana.getValueAt(i, 3));
                    String hints = String.valueOf(model_siana.getValueAt(i, 4));

                    String date1 = String.valueOf(model_siana.getValueAt(i, 9));
                    String date2 = String.valueOf(model_siana.getValueAt(i, 10));
                    String date3 = String.valueOf(model_siana.getValueAt(i, 11));
                    String date5 = String.valueOf(model_siana.getValueAt(i, 12));
                    String date6 = String.valueOf(model_siana.getValueAt(i, 13));
                    String date7 = String.valueOf(model_siana.getValueAt(i, 14));

                    id_client = String.valueOf(model_siana.getValueAt(i, 0));
                    id_product = String.valueOf(model_siana.getValueAt(i, 5));
                    date_buy = String.valueOf(model_siana.getValueAt(i, 8));
                    String name_product = String.valueOf(model_siana.getValueAt(i, 6));
                    String quantitty = String.valueOf(model_siana.getValueAt(i, 7));
                    String siana_1 = String.valueOf(model_siana.getValueAt(i, 23));
                    String siana_2 = String.valueOf(model_siana.getValueAt(i, 24));
                    String siana_3 = String.valueOf(model_siana.getValueAt(i, 25));
                    String siana_5 = String.valueOf(model_siana.getValueAt(i, 26));
                    String siana_6 = String.valueOf(model_siana.getValueAt(i, 27));
                    String siana_7 = String.valueOf(model_siana.getValueAt(i, 28));
                    String type_3otl = String.valueOf(model_siana.getValueAt(i, 16));
                    String date_wrong = String.valueOf(model_siana.getValueAt(i, 17));
                    String date_end = String.valueOf(model_siana.getValueAt(i, 19));
                    String wrongs = String.valueOf(model_siana.getValueAt(i, 16));
                    String nezam_eldf3 = String.valueOf(model_siana.getValueAt(i, 18));
                    String el2st_product = String.valueOf(model_siana.getValueAt(i, 20));
                    String date_el2st = String.valueOf(model_siana.getValueAt(i, 21));

                    String elb2e = String.valueOf(model_siana.getValueAt(i, 22));
                    String quantity = String.valueOf(model_siana.getValueAt(i, 7));
                    String siana_elb2e = String.valueOf(model_siana.getValueAt(i, 35));
                    String clas = String.valueOf(model_siana.getValueAt(i, 36));
                    String elmosthdaf = String.valueOf(model_siana.getValueAt(i, 37));
                    String date_remake_class = String.valueOf(model_siana.getValueAt(i, 38));
                    String num_month_remake_class = String.valueOf(model_siana.getValueAt(i, 39));
                    String type_siana = String.valueOf(model_siana.getValueAt(i, 15));

                      ob.stmt.executeUpdate("update clients set name_client='" + name_client + "' , phone='" + phone + "' where id_client=" + id_client);

                    ob.stmt.executeUpdate("update clients_product set quantity=" + quantity +" , date_buy='"+date_buy+ "' , date1='" + date1 + "' , date2='" + date2 + "', "
                        + "date3='" + date3 + "' , date5='" + date5 + "' , date6='" + date6 + "' , date7='" + date7 + "' , hints='" + hints + "',"
                        + "  nezam_eldf3=" + nezam_eldf3 + " , date_el2st='" + date_el2st + "' , elb2e=" + elb2e + ",rsed1=" + rsed_1 + " ,"
                        + "rsed2=" + rsed_2 + " , rsed3=" + rsed_3 + " , rsed5=" + rsed_5 + " ,rsed6=" + rsed_6 + " , rsed7=" + rsed_7 + " , class='" + clas + "'"
                        + " , total_elb2e_sian=" + siana_elb2e + " , siana_1=" + siana_1 + " , siana_2=" + siana_2 + " , siana_3=" + siana_3 + " ,"
                        + " siana_5=" + siana_5 + " , siana_6=" + siana_6 + " , siana_7=" + siana_7 + " , date_remake_class='" + date_remake_class + "' ,"
                        + " num_month_remake_class=" + num_month_remake_class + " , elmosthdaf=" + elmosthdaf + ", home_num=" + home_num + " , "
                        + "street='" + street + "' , region='" + region + "' where serial=" + String.valueOf(model_siana.getValueAt(i, 43))
                    );
                    int rt = ob.get_client_from_back_table(String.valueOf(model_siana.getValueAt(i, 43)) ,model_siana_help , 43 );
                    if (rt != -1) {
                        for (int c = 0; c < model_siana.getColumnCount(); c++) {
                            model_siana_help.setValueAt(model_siana.getValueAt(i, c), rt, c);
                        }
                    }
                  
                    JOptionPane.showMessageDialog(null, "تم الحفظ");
                  
                } catch (SQLException ex) {

                   
                    JOptionPane.showMessageDialog(null, "Wrong \n" + ex.getMessage());

                }
            }
        }
    }//GEN-LAST:event_jLabel97MouseReleased

    private void jLabel98MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseReleased
        if (jTable_siana.getSelectedRow() != -1&&JOptionPane.showConfirmDialog(null, "هل تريد مسح العميل من الخطة ؟")==0) {
            if (model_siana.getValueAt(jTable_siana.getSelectedRow(), 47) != null || String.valueOf(model_siana.getValueAt(jTable_siana.getSelectedRow(), 47)).length() > 0) {
                if (elsiana.delete_from_archive((String) model_siana.getValueAt(jTable_siana.getSelectedRow(), 43))) {
                    model_siana.setValueAt(null, jTable_siana.getSelectedRow(), 47);
                    int rt = ob.get_client_from_back_table((String) model_siana.getValueAt(jTable_siana.getSelectedRow(), 43), model_siana_help, 43);
                    if (rt != -1) {
                        model_siana_help.setValueAt(null, rt, 47);
                    }

                }
            }

        }
    }//GEN-LAST:event_jLabel98MouseReleased

    private void jLabel99MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseReleased
        if (jTable_trkeb.getSelectedRow() != -1&&JOptionPane.showConfirmDialog(null, "هل تريد مسح العميل من الخطة ؟")==0) {
            if (model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 30) != null || String.valueOf(model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 30)).length() > 0) {
                if (elsiana.delete_from_archive((String) model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 27))) {
                    model_trkeb.setValueAt(null, jTable_trkeb.getSelectedRow(), 30);
                    int rt = ob.get_client_from_back_table((String) model_trkeb.getValueAt(jTable_trkeb.getSelectedRow(), 27), model_trkeb_help, 27);
                    if (rt != -1) {
                        model_trkeb_help.setValueAt(null, rt, 27);
                    }

                }
            }

        }
    }//GEN-LAST:event_jLabel99MouseReleased

    private void jTable_hints1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_hints1KeyReleased
         int x=jTable_hints1.getSelectedRow();
   if (x!=-1)
   {
        if (evt.getKeyCode()==10)
      {
          if (jTable_hints1.getSelectedColumn()==1)
          {
           
            try {
                ob.stmt.executeUpdate("update "+trkeb.table_name_hints+" set hints='"+model_hints_trkeb.getValueAt(x, 1) 
                        +"' "
                        +"where id="+String.valueOf(model_hints_trkeb.getValueAt(x, 0)));
                JOptionPane.showMessageDialog(null,"عمليه ناجحه");
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
          else  if (jTable_hints1.getSelectedColumn()==2)
          {
              try {
                ob.stmt.executeUpdate("update "+trkeb.table_name_hints+" set "
                        +" date='"+model_hints_trkeb.getValueAt(x, 2)+"' "
                        +"where id="+String.valueOf(model_hints_trkeb.getValueAt(x, 0)));
                JOptionPane.showMessageDialog(null,"عمليه ناجحه");
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
      }
   }
    }//GEN-LAST:event_jTable_hints1KeyReleased
   
    
    JPanel opened_add_client=null ;
   
    JPanel opened_main_screen=null ;
    int rate_animation=30 ;
    void animation(final JPanel panel_in ,final int orignal_height )
  {
 
 // final int width=panel.getWidth() ;
 final JPanel panel=panel_in ;
if (jCheckBox_animate.isSelected())
{
    

 new Thread()
  {
      public  void  run()
      {
          if (panel.getHeight()>0)
          {
             
             while(panel.getHeight()>=0)
             { panel.setSize(new Dimension(panel.getWidth(),panel.getHeight()-rate_animation));
               
           
                 
              try {
                  sleep(1);
              } catch (InterruptedException ex) {
                  Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
              }
               //  System.out.println("close:"+opened_main_screen.getName());
             
             }
            
          }
          else
          {
            
                while(panel.getHeight()<=orignal_height)
             { panel.setSize(new Dimension(panel.getWidth(),panel.getHeight()+rate_animation));
               
              try {
                  sleep(1);
              } catch (InterruptedException ex) {
                  Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    
              }//System.out.println("opened:"+opened_main_screen.getName()+panel.getHeight());
              
             }
          }
      }
  }.start();
 
}
else
{
     if (panel.getHeight()>0)
     {
        panel.setSize(new Dimension(panel.getWidth(),0));
     }
     else
     {
          panel.setSize(new Dimension(panel.getWidth(),orignal_height+10));
     }
}
  }
    int rate_separator=10 ;
  void animate_separator_x(final JPanel panel ,final int orinal_x)
  {
   
   if (jCheckBox_animate.isSelected())
   {
      new Thread()
      {
          @Override
          public void run()
          {
            
              if (panel.getX()>orinal_x)
              {
                  while(panel.getX()>orinal_x)
                  {
                      panel.setLocation(panel.getX()-rate_separator, panel.getY());
                      
                      try {
                          sleep(1);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                      }
                   
                  }
                  
              }
              else
              {
                   while(panel.getX()<orinal_x)
                  {
                      panel.setLocation(panel.getX()+rate_separator, panel.getY());
                      
                         try {
                          sleep(1);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                      }
                        
                  }
              }
            
          }
      }.start();
   }
  else  panel.setLocation(orinal_x, panel.getY());
  }
  
  void animate_separator_y(final JPanel panel ,final int orinal_y)
  {
   
   if (jCheckBox_animate.isSelected()){
      new Thread()
      {
          public void run()
          {
            
              if (panel.getY()>orinal_y)
              {
                  while(panel.getY()>orinal_y)
                  {
                      panel.setLocation(panel.getX(), panel.getY()-rate_separator);
                      
                      try {
                          sleep(10);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     
                  }
                  
              }
              else
              {
                   while(panel.getY()<orinal_y)
                  {
                      panel.setLocation(panel.getX(), panel.getY()+rate_separator);
                      
                         try {
                          sleep(10);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                      }
                       
                  }
              }
            
          }
      }.start();
   }
  
       else    panel.setLocation(panel.getX(), orinal_y);
  
  }
   
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        // new main().setVisible(true);
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        //    java.awt.EventQueue.invokeLater(new Runnable() {
//
//        // public void run() {
//        //   //joptionpane.showMessageDialog(null, "main");
//        main m = new main(null);
//        m.setVisible(true);
//        // }
//        //  });
//
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JCheckBox jCheckBox2;
    public javax.swing.JCheckBox jCheckBox7;
    public javax.swing.JCheckBox jCheckBox_animate;
    public javax.swing.JCheckBox jCheckBox_autosave;
    public javax.swing.JCheckBox jCheckBox_current_table;
    public javax.swing.JCheckBox jCheckBox_current_table_trkeb;
    public javax.swing.JCheckBox jCheckBox_elb2e_siana;
    public javax.swing.JCheckBox jCheckBox_elwset;
    public javax.swing.JCheckBox jCheckBox_elwset1;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox3;
    public javax.swing.JComboBox jComboBox_class_add_client;
    public javax.swing.JComboBox jComboBox_client_hints;
    public javax.swing.JComboBox jComboBox_elfne_trkeb;
    public javax.swing.JComboBox jComboBox_elnfe_siana;
    public javax.swing.JComboBox jComboBox_type_elsiana;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabel_add;
    public javax.swing.JLabel jLabel_add_client_b1;
    public javax.swing.JLabel jLabel_add_client_b2;
    public javax.swing.JLabel jLabel_add_client_b3;
    public javax.swing.JLabel jLabel_add_client_b4;
    public javax.swing.JLabel jLabel_add_client_b5;
    public javax.swing.JLabel jLabel_add_client_b6;
    public javax.swing.JLabel jLabel_add_client_b7;
    public javax.swing.JLabel jLabel_add_wrong;
    private javax.swing.JLabel jLabel_back;
    public javax.swing.JLabel jLabel_change_passwordn;
    public javax.swing.JLabel jLabel_client_name;
    public javax.swing.JLabel jLabel_client_reports;
    public javax.swing.JLabel jLabel_clients;
    private javax.swing.JLabel jLabel_com3_0;
    private javax.swing.JLabel jLabel_com_3_1;
    private javax.swing.JLabel jLabel_com_3_2;
    public javax.swing.JLabel jLabel_company_reports;
    public javax.swing.JLabel jLabel_count;
    public javax.swing.JLabel jLabel_count_siana;
    private javax.swing.JLabel jLabel_counter_siana_archive_done;
    private javax.swing.JLabel jLabel_counter_siana_archive_not;
    private javax.swing.JLabel jLabel_counter_trkeb_archive_done;
    private javax.swing.JLabel jLabel_counter_trkeb_archive_not;
    public javax.swing.JLabel jLabel_country;
    public javax.swing.JLabel jLabel_current_user;
    public javax.swing.JLabel jLabel_database;
    public javax.swing.JLabel jLabel_delete_trkeb;
    private javax.swing.JLabel jLabel_el2st_elsiana10;
    private javax.swing.JLabel jLabel_el2st_elsiana11;
    private javax.swing.JLabel jLabel_el2st_elsiana6;
    private javax.swing.JLabel jLabel_el2st_elsiana7;
    private javax.swing.JLabel jLabel_el2st_elsiana8;
    private javax.swing.JLabel jLabel_el2st_elsiana9;
    public javax.swing.JLabel jLabel_emp_reports;
    public javax.swing.JLabel jLabel_en;
    private javax.swing.JLabel jLabel_en1;
    private javax.swing.JLabel jLabel_exit;
    public javax.swing.JLabel jLabel_id_client;
    public javax.swing.JLabel jLabel_id_client10;
    public javax.swing.JLabel jLabel_id_client104;
    public javax.swing.JLabel jLabel_id_client11;
    private javax.swing.JLabel jLabel_id_client121;
    private javax.swing.JLabel jLabel_id_client129;
    public javax.swing.JLabel jLabel_id_client13;
    private javax.swing.JLabel jLabel_id_client130;
    private javax.swing.JLabel jLabel_id_client131;
    private javax.swing.JLabel jLabel_id_client132;
    private javax.swing.JLabel jLabel_id_client133;
    private javax.swing.JLabel jLabel_id_client134;
    public javax.swing.JLabel jLabel_id_client14;
    public javax.swing.JLabel jLabel_id_client15;
    public javax.swing.JLabel jLabel_id_client16;
    public javax.swing.JLabel jLabel_id_client17;
    public javax.swing.JLabel jLabel_id_client18;
    public javax.swing.JLabel jLabel_id_client19;
    public javax.swing.JLabel jLabel_id_client2;
    public javax.swing.JLabel jLabel_id_client20;
    public javax.swing.JLabel jLabel_id_client21;
    public javax.swing.JLabel jLabel_id_client22;
    public javax.swing.JLabel jLabel_id_client227;
    public javax.swing.JLabel jLabel_id_client228;
    public javax.swing.JLabel jLabel_id_client229;
    public javax.swing.JLabel jLabel_id_client23;
    public javax.swing.JLabel jLabel_id_client230;
    public javax.swing.JLabel jLabel_id_client231;
    public javax.swing.JLabel jLabel_id_client232;
    public javax.swing.JLabel jLabel_id_client24;
    public javax.swing.JLabel jLabel_id_client25;
    public javax.swing.JLabel jLabel_id_client26;
    public javax.swing.JLabel jLabel_id_client27;
    public javax.swing.JLabel jLabel_id_client28;
    public javax.swing.JLabel jLabel_id_client29;
    public javax.swing.JLabel jLabel_id_client30;
    public javax.swing.JLabel jLabel_id_client31;
    public javax.swing.JLabel jLabel_id_client32;
    public javax.swing.JLabel jLabel_id_client33;
    public javax.swing.JLabel jLabel_id_client34;
    public javax.swing.JLabel jLabel_id_client35;
    public javax.swing.JLabel jLabel_id_client36;
    public javax.swing.JLabel jLabel_id_client37;
    public javax.swing.JLabel jLabel_id_client4;
    private javax.swing.JLabel jLabel_id_client41;
    private javax.swing.JLabel jLabel_id_client42;
    private javax.swing.JLabel jLabel_id_client43;
    public javax.swing.JLabel jLabel_id_client5;
    public javax.swing.JLabel jLabel_id_client55;
    public javax.swing.JLabel jLabel_id_client56;
    public javax.swing.JLabel jLabel_id_client57;
    public javax.swing.JLabel jLabel_id_client58;
    public javax.swing.JLabel jLabel_id_client59;
    public javax.swing.JLabel jLabel_id_client6;
    public javax.swing.JLabel jLabel_id_client60;
    public javax.swing.JLabel jLabel_id_client61;
    public javax.swing.JLabel jLabel_id_client62;
    public javax.swing.JLabel jLabel_id_client63;
    public javax.swing.JLabel jLabel_id_client64;
    public javax.swing.JLabel jLabel_id_client7;
    public javax.swing.JLabel jLabel_id_client8;
    public javax.swing.JLabel jLabel_id_client9;
    private javax.swing.JLabel jLabel_id_elmo7sl;
    public javax.swing.JLabel jLabel_installation;
    public javax.swing.JLabel jLabel_installation_notify;
    public javax.swing.JLabel jLabel_n;
    private javax.swing.JLabel jLabel_name_client_siana;
    private javax.swing.JLabel jLabel_name_client_trkeb;
    private javax.swing.JLabel jLabel_name_elmo7sl;
    public javax.swing.JLabel jLabel_new_servising;
    public javax.swing.JLabel jLabel_new_servising_notify;
    public javax.swing.JLabel jLabel_order_table_trkeb;
    public javax.swing.JLabel jLabel_payments;
    private javax.swing.JLabel jLabel_places_elmo7sl;
    public javax.swing.JLabel jLabel_print_trkeb;
    public javax.swing.JLabel jLabel_reports;
    public javax.swing.JLabel jLabel_search_trkeb;
    public javax.swing.JLabel jLabel_sectors;
    public javax.swing.JLabel jLabel_servising;
    public javax.swing.JLabel jLabel_ss;
    public javax.swing.JLabel jLabel_ss1;
    public javax.swing.JLabel jLabel_ss2;
    public javax.swing.JLabel jLabel_st;
    private javax.swing.JLabel jLabel_st1;
    private javax.swing.JLabel jLabel_telephone_elmo7sl;
    public javax.swing.JLabel jLabel_users;
    public javax.swing.JLabel jLabel_wrong_notify;
    public javax.swing.JLabel jLabel_wrongs;
    public javax.swing.JLabel jLabel_wrongs_2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Add_client_p6;
    private javax.swing.JPanel jPanel_add_3otl;
    private javax.swing.JPanel jPanel_add_client;
    private javax.swing.JPanel jPanel_add_client_p1;
    private javax.swing.JPanel jPanel_add_client_p2;
    private javax.swing.JPanel jPanel_add_client_p3;
    private javax.swing.JPanel jPanel_add_client_p4;
    private javax.swing.JPanel jPanel_add_client_p5;
    private javax.swing.JPanel jPanel_add_client_p7;
    private javax.swing.JPanel jPanel_add_trkeb;
    private javax.swing.JPanel jPanel_background;
    public javax.swing.JPanel jPanel_classes;
    private javax.swing.JPanel jPanel_client_table;
    public javax.swing.JPanel jPanel_drop_reports;
    public javax.swing.JPanel jPanel_drop_reports1;
    public javax.swing.JPanel jPanel_drop_reports2;
    private javax.swing.JPanel jPanel_elfne_table;
    private javax.swing.JPanel jPanel_elmndob_elwaset;
    private javax.swing.JPanel jPanel_elmndob_table;
    private javax.swing.JPanel jPanel_elsiana_1;
    private javax.swing.JPanel jPanel_fatorh_siana_panel;
    private javax.swing.JPanel jPanel_help;
    private javax.swing.JPanel jPanel_perioud_siana;
    private javax.swing.JPanel jPanel_product_table;
    private javax.swing.JPanel jPanel_region_table;
    private javax.swing.JPanel jPanel_siaa_gdeda_dates;
    private javax.swing.JPanel jPanel_trkeb;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane36;
    public javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    public javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JPanel jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    public javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable jTable_add_3otl;
    public javax.swing.JTable jTable_canceled;
    public javax.swing.JTable jTable_clients_insert;
    public javax.swing.JTable jTable_country_trkeb;
    public javax.swing.JTable jTable_country_trkeb1;
    public javax.swing.JTable jTable_elfne_insert;
    public javax.swing.JTable jTable_elfne_trkeb;
    public javax.swing.JTable jTable_elmndob_elwaset__insert;
    public javax.swing.JTable jTable_elmndob_insert;
    public javax.swing.JTable jTable_elmo7sl;
    public javax.swing.JTable jTable_hints;
    public javax.swing.JTable jTable_hints1;
    public javax.swing.JTable jTable_product_insert1;
    public javax.swing.JTable jTable_region;
    public javax.swing.JTable jTable_siana;
    public javax.swing.JTable jTable_siana_help;
    public javax.swing.JTable jTable_siana_help_dmg;
    public javax.swing.JTable jTable_siana_help_dmg_reject;
    public javax.swing.JTable jTable_trkeb;
    public javax.swing.JTable jTable_trkeb_archive_done;
    public javax.swing.JTable jTable_trkeb_archive_not_done;
    public javax.swing.JTable jTable_trkeb_help;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JTextArea jTextArea3;
    public javax.swing.JTextArea jTextArea_new_servising_done;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField_all_quantity;
    public javax.swing.JTextField jTextField_class;
    public javax.swing.JTextField jTextField_country;
    public com.toedter.calendar.JDateChooser jTextField_date1;
    public com.toedter.calendar.JDateChooser jTextField_date_2;
    public com.toedter.calendar.JDateChooser jTextField_date_3;
    public com.toedter.calendar.JDateChooser jTextField_date_5;
    public com.toedter.calendar.JDateChooser jTextField_date_6_in;
    public com.toedter.calendar.JDateChooser jTextField_date_7_in;
    public com.toedter.calendar.JDateChooser jTextField_date_el2st;
    private com.toedter.calendar.JDateChooser jTextField_date_el3otl;
    private com.toedter.calendar.JDateChooser jTextField_date_end_line_el3otl;
    public com.toedter.calendar.JDateChooser jTextField_date_regist;
    public com.toedter.calendar.JDateChooser jTextField_date_remake_class;
    public com.toedter.calendar.JDateChooser jTextField_date_trkeb;
    public com.toedter.calendar.JDateChooser jTextField_dte_buy;
    public javax.swing.JTextField jTextField_el2st;
    public javax.swing.JTextField jTextField_elba2e;
    public javax.swing.JTextField jTextField_elba2e_trkeb;
    public javax.swing.JTextField jTextField_elmkdm;
    public javax.swing.JTextField jTextField_elmosthdaf;
    public com.toedter.calendar.JDateChooser jTextField_en;
    public javax.swing.JTextField jTextField_hints;
    public javax.swing.JTextField jTextField_home_num;
    public javax.swing.JTextField jTextField_id_client;
    public javax.swing.JTextField jTextField_id_elfne;
    public javax.swing.JTextField jTextField_id_elfne_sianat;
    public javax.swing.JTextField jTextField_id_elfne_trkeb;
    public javax.swing.JTextField jTextField_id_elmndob;
    public javax.swing.JTextField jTextField_id_elmndob_elwaset;
    public javax.swing.JTextField jTextField_id_product;
    public javax.swing.JTextField jTextField_job;
    public javax.swing.JTextField jTextField_money_for_elb2e_elsianat;
    public javax.swing.JTextField jTextField_n_p;
    public javax.swing.JTextField jTextField_name_client;
    private javax.swing.JTextField jTextField_name_client_add_3otl;
    public javax.swing.JTextField jTextField_name_elfne;
    public javax.swing.JTextField jTextField_name_elfne_sianat;
    public javax.swing.JTextField jTextField_name_elfne_trkeb;
    public javax.swing.JTextField jTextField_name_elmndob;
    public javax.swing.JTextField jTextField_name_elmndob_elwaset;
    public javax.swing.JTextField jTextField_name_product;
    public javax.swing.JTextField jTextField_nezam_eldf3;
    public com.toedter.calendar.JDateChooser jTextField_ns_d1;
    public com.toedter.calendar.JDateChooser jTextField_ns_d2;
    public com.toedter.calendar.JDateChooser jTextField_ns_d3;
    public com.toedter.calendar.JDateChooser jTextField_ns_d5;
    public com.toedter.calendar.JDateChooser jTextField_ns_d6;
    public com.toedter.calendar.JDateChooser jTextField_ns_d7;
    public javax.swing.JTextField jTextField_nsbt_el2mlah_after_elsiana;
    public javax.swing.JTextField jTextField_nsbt_el2mlah_before_elsiana;
    public javax.swing.JTextField jTextField_num_month_class;
    public javax.swing.JTextField jTextField_phone;
    public javax.swing.JTextField jTextField_phone_elfne;
    public javax.swing.JTextField jTextField_phone_elfne_sianat;
    public javax.swing.JTextField jTextField_phone_elfne_trkeb;
    public javax.swing.JTextField jTextField_phone_elmndob;
    public javax.swing.JTextField jTextField_phone_elmndob_elwaset;
    public javax.swing.JTextField jTextField_place_trkeb;
    public javax.swing.JTextField jTextField_places;
    public javax.swing.JTextField jTextField_places_elfne_sianat;
    public javax.swing.JTextField jTextField_price_elsiana;
    public javax.swing.JTextField jTextField_price_product;
    public javax.swing.JTextField jTextField_price_trkeb;
    public javax.swing.JTextField jTextField_quantity;
    public com.toedter.calendar.JDateChooser jTextField_real_date_siana;
    public com.toedter.calendar.JDateChooser jTextField_real_date_siana1;
    public com.toedter.calendar.JDateChooser jTextField_real_date_siana2;
    public javax.swing.JTextField jTextField_region;
    public javax.swing.JTextField jTextField_rsed_1;
    public javax.swing.JTextField jTextField_rsed_2;
    public javax.swing.JTextField jTextField_rsed_3;
    public javax.swing.JTextField jTextField_rsed_5;
    public javax.swing.JTextField jTextField_rsed_6;
    public javax.swing.JTextField jTextField_rsed_7;
    public javax.swing.JTextField jTextField_search_siana1;
    public com.toedter.calendar.JDateChooser jTextField_search_siana2;
    public com.toedter.calendar.JDateChooser jTextField_search_siana3;
    public javax.swing.JTextField jTextField_siana_1;
    public javax.swing.JTextField jTextField_siana_2;
    public javax.swing.JTextField jTextField_siana_3;
    public javax.swing.JTextField jTextField_siana_5;
    public javax.swing.JTextField jTextField_siana_6;
    public javax.swing.JTextField jTextField_siana_7;
    public com.toedter.calendar.JDateChooser jTextField_st;
    public javax.swing.JTextField jTextField_street;
    public com.toedter.calendar.JDateChooser jTextField_submit_end;
    public com.toedter.calendar.JDateChooser jTextField_submit_start;
    public javax.swing.JTextField jTextField_total_elb2e_siana;
    public com.toedter.calendar.JDateChooser jTextField_trkeb_dead_line;
    public javax.swing.JTextField jTextField_two_n_p;
    public javax.swing.JTextField jTextField_type;
    public javax.swing.JTextField jTextField_xls;
    private javax.swing.JLayeredPane jlayeredpane;
    public javax.swing.JLabel max_id_client;
    public javax.swing.JLabel max_id_elfne;
    public javax.swing.JLabel max_id_elmndob;
    public javax.swing.JLabel max_id_elmndob_elwaset;
    public javax.swing.JLabel max_id_product;
    private javax.swing.JSeparator الشركه;
    private javax.swing.JSeparator الشركه1;
    private javax.swing.JSeparator الشركه2;
    private javax.swing.JSeparator الشركه3;
    // End of variables declaration//GEN-END:variables
}
