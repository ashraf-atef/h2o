
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ashraf_atef
 */
public class class_privilages {
    hr h ;
    public class_privilages(hr h) {
        this.h=h ;
    }
    JFrame frame ;
      JTextField user_name=new JTextField();
      JPasswordField password=new JPasswordField();
      public  List<JCheckBox> boxs = new ArrayList<>();
         JCheckBox all;
         int pading=10;
    void start(String table_name)
    {
     //   h.update.insert_hashmap();
        frame=new JFrame();
        boxs.clear(); 
        JPanel  panel=new JPanel(new FlowLayout(0, 0, 0));
        panel.setBackground(Color.white);
        panel.setSize(180, 30);
     
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        JPanel main_panel=new JPanel();
        main_panel.setBackground(Color.white);
        main_panel.setBorder(new EmptyBorder(10, 10,0, 10) );
        main_panel.setLayout(new GridLayout(0, 1, 0, 0));
        main_panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
     
        
        JLabel l=new JLabel("اسم المستخدم");
        l.setPreferredSize(new Dimension(100, 30));
        l.setForeground(new Color(72,72,72));
        l.setFont(h.m.font.deriveFont(13f));
        l.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);  
       panel.add(l);
       
       
        ///////////////////////////////////////////////////////////////////////////
      
      
        user_name.setPreferredSize(new Dimension(150,30));
        panel.add(user_name);
         main_panel.add(panel);
        /////////////////////////////////////////////////////////////////////////
        panel=new JPanel(new FlowLayout(0, 0, 0));
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
          panel.setPreferredSize(new Dimension(180,35));
           panel.setBackground(Color.white);
        l=new JLabel("كلمة المرور");
         l.setPreferredSize(new Dimension(90, 30));
        l.setForeground(new Color(72,72,72));
        l.setFont(h.m.font.deriveFont(13f));
          l.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
       
        panel.add(l);
      ////////////////////////////////////////////////////////////////////////////////
        
        password.setPreferredSize(new Dimension(150, 30));
        panel.add(password);
        
        main_panel.add(panel);
      
        try {
            
            h.m.ob.stmt=h.m.ob.conn.createStatement();
            ResultSet rs=h.m.ob.stmt.executeQuery("describe "+table_name);
           if(rs.next()){}
          if (rs.next()){}
                       
//                 panel=new JPanel(new FlowLayout(10, 10, 10));
//                 panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                 all=new JCheckBox("تحديد الكل");
                 all.setForeground(new Color(72,72,72));
                 all.setFont(h.m.font.deriveFont(13f));
                 all.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                 //panel.add(all);
                 main_panel.add(all);
                 all.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                 select_all_boxs();
                }
            });
                 
            while(rs.next())
            {
//                 panel=new JPanel(new FlowLayout(10, 10, 10));
//                panel.setPreferredSize(new Dimension(200, 15));
                
                JCheckBox box=new JCheckBox(
                        h.update.hm_countries.get(
                        rs.getString(1)
                )
                );
                box.setPreferredSize(new Dimension(120, 15));
                box.setForeground(new Color(72,72,72));
                 box.setFont(h.m.font.deriveFont(13f));
                 box.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                boxs.add(box);
               // panel.add(box);
                main_panel.add(box);
            }
             l=new JLabel( );
            l.setIcon(new ImageIcon(getClass().getResource("/ph/icons/add-icon.png")));
             l.setPreferredSize(new Dimension(50, 50));
             l.setToolTipText("ادخال مستخدم");
//             JPanel px=new JPanel();
//             px.setPreferredSize(new Dimension(300, 50));
           //  px.add(button);
             main_panel.add(l);
            l.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    insert();
                }
            });
             JScrollPane sc=new JScrollPane(main_panel);
               
       
       
       sc.getVerticalScrollBar().setUnitIncrement(16);
            frame.setSize(300, (int)h.m.height-50);
            frame.add(sc);
            frame.setLocation((int)h.m.width-300, 0);
            frame.setVisible(true);
            frame.setResizable(false);
        } catch (SQLException ex) {
            Logger.getLogger(class_privilages.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
  
    void insert()
    {
        String sql="insert into users values('"+user_name.getText()+"',password('"+password.getText()+"'),'";
        for (int i=0 ; i<boxs.size()-1;i++)
        {
            
           
                
           if (boxs.get(i).isSelected())
           {
                sql+="1','";
           }
           else
           {
                  sql+="0','";
           }
           
        }
        if (boxs.get(boxs.size()-1).isSelected())
        {
            sql+="1')";
        }
        else
        {
             sql+="0')";
        }
        try {
            System.out.println(sql);
            h.m.ob.stmt.executeUpdate(sql);
            h.m.ob.stmt.executeUpdate("insert into contacts values ('"+user_name.getText()+"' , '','')");
            JOptionPane.showMessageDialog(null, "sucessful operation");
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "عفوا هذا المستخدم موجود بالفعل");
        }
        
    }
    
    void select_all_boxs()
    {
        for (int i= 0 ; i<boxs.size() ; i++)
        {
          if (all.isSelected())  boxs.get(i).setSelected(true);
          else  boxs.get(i).setSelected(false);
        }
    }
}
