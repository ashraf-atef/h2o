/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashraf Atef
 */
public class print_class {

    hr h ;
    public print_class(hr h) {
        this.h=h ;
    }
    JTable table ;DefaultTableModel model ;
    void set_table( JTable table )
    {
        this.table=table ;
        this.model=(DefaultTableModel)table.getModel(); ;
        h.jLabel_print_name.setText(table.getName());
    }
    void reload()
    {
         h.model_print.setColumnCount(0); 
           h.model_print_columns.setRowCount(0); 
           
           h.model_print.setRowCount(0); 
                for (int i=0 ; i<model.getColumnCount() ; i++)
                {
                     h.model_print.addColumn(model.getColumnName(i));
                    h.model_print_columns.addRow(new Object[]{i,model.getColumnName(i)});
                }
                
                for (int r=0 ; r<model.getRowCount() ;r++)
                {
                   
                    Object[]ob=new Object[model.getColumnCount()];
                    for (int c=0 ;c<model.getColumnCount() ; c++ )
                    {
                       ob[c]=model.getValueAt(r, c);
                    }
                    h.model_print.addRow(ob);
                }
    }
    public void Load( )
    {
        
        try {
        
            
           h.model_print.setColumnCount(0); 
           h.model_print_columns.setRowCount(0);
            h.model_print.setRowCount(0); 
            h.model_headers.setRowCount(0); 
            h.model_footers.setRowCount(0); 
           h.jLabel_print_name.setText(table.getName());
            h.m.ob.stmt=h.m.ob.conn.createStatement();
            ResultSet rs= h.m.ob.stmt.executeQuery("select * from print_history where table_name='"+table.getName()+"' and user_name='"+h.m.jLabel_current_user.getText()+"'");
            System.out.println("select * from print_history where table_name='"+table.getName()+"' and user_name='"+h.m.jLabel_current_user.getText()+"'");
            if(rs.next())
            {
           
                String []columns_number=rs.getString(2).split("#");
                String []columns_size=rs.getString(3).split("#");
                String []columns_headers=rs.getString(4).split("#");
                
                   String []reports_headers=rs.getString(7).split("#");
                String []reports_headers_levels=rs.getString(8).split("#");
                String []reports_headers_positions=rs.getString(9).split("#");
                
                   String []reports_footers=rs.getString(10).split("#");
                String []reports_footers_levels=rs.getString(11).split("#");
                String []reports_footers_positions=rs.getString(12).split("#");
             
                h.jTable_print.setFont(h.m.font.deriveFont(Float.parseFloat(rs.getString("table_font")+"f")));
                h.jTable_print.getTableHeader().setFont(h.m.font.deriveFont(Float.parseFloat(rs.getString("header_font")+"f")));
                h.jTextField_header_font.setText(rs.getString("header_font"));
                h.jTextField_table_font.setText(rs.getString("table_font"));
                int column_number , column_size ;
                
                 for (int i=0 ; i<columns_number.length ; i++)
                        {
                              h.model_print.addColumn(columns_headers[i]);
                   
                     h.model_print_columns.addRow(new Object[]{columns_number[i],columns_headers[i]});
                        }
               
              for (int i=0 ; i<columns_number.length ; i++)  
              { column_size=Integer.parseInt(columns_size[i]);
             h.jTable_print .getColumnModel().getColumn(i).setPreferredWidth(column_size); }  
              
//               h.model_print.setRowCount(model.getRowCount()); 
//                for (int i=0 ; i<columns_number.length ; i++)
//                {
//                   
//                   
//                      if (!columns_number[i].equals("*"))
//                    {    
//                    column_number=Integer.parseInt(columns_number[i]);
//                    
//                     for (int r=0 ; r<model.getRowCount() ; r++)
//                     {
//                         h.model_print.setValueAt(model.getValueAt(r, column_number), r,i);
//                     }
//                    }
//                   
//                }
               
                for (int r=0 ; r<model.getRowCount() ; r++)
                {
                    
                    Object [] ob=new Object[columns_number.length] ;
                   for (int i=0 ; i<columns_number.length ; i++)
                   {
                        if (!columns_number[i].equals("*"))
                        {
                            ob[i]=model.getValueAt(r, Integer.parseInt(columns_number[i]));
                        }
                   }
                   h.model_print.addRow(ob);
                }
              
                
                // headers of reports 
                if (!reports_headers_levels[0].equals(""))
                {for (int i=0 ; i<reports_headers.length ; i++)
                {
                    h.model_headers.addRow(new Object[]{reports_headers[i],reports_headers_levels[i],reports_headers_positions[i]});
                }
                }
                
                
                // footers of reports 
               if (!reports_footers_levels[0].equals(""))
               {for (int i=0 ; i<reports_footers.length ; i++)
                {
                    h.model_footers.addRow(new Object[]{reports_footers[i],reports_footers_levels[i],reports_footers_positions[i]});
                }
               }
                
            }
            else
            {
              
                for (int i=0 ; i<model.getColumnCount() ; i++)
                {
                     h.model_print.addColumn(model.getColumnName(i));
                    h.model_print_columns.addRow(new Object[]{i,model.getColumnName(i)});
                }
                
                for (int r=0 ; r<model.getRowCount() ;r++)
                {
                   
                    Object[]ob=new Object[model.getColumnCount()];
                    for (int c=0 ;c<model.getColumnCount() ; c++ )
                    {
                       ob[c]=model.getValueAt(r, c);
                    }
                    h.model_print.addRow(ob);
                }
                 h.jTextField_header_font.setText("14");
                h.jTextField_table_font.setText("14");
            }
        } catch (SQLException ex) {
            Logger.getLogger(print_class.class.getName()).log(Level.SEVERE, null, ex);
        }
       
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
//        for (int i = 0; i <h.jTable_print.getColumnCount(); i++) {
//            h.jTable_print.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
//        }
        
       // System.out.println("row_height"+h.jTable_print.getRowHeight(0));
    }
  
    void save_table()
    {
        try {
            h.m.ob.stmt=h.m.ob.conn.createStatement();
            ResultSet rs= h.m.ob.stmt.executeQuery("select table_name from print_history where table_name='"+table.getName()+"' and user_name='"+h.m.jLabel_current_user.getText()+"'");
          //  System.out.println("select table_name from print_history where table_name='"+h.jLabel_print_name.getText()+"'");
            String headers ="";
            String sizes="";
            String numbers="";
            String report_headers="";
            String report_headers_levels="";
            String report_headers_positions="";
            
            String report_footers="";
            String report_footers_levels="";
            String report_footers_positions="";
            
            for (int i=0 ; i<h.model_print_columns.getRowCount() ; i++)
            {
              //  System.out.println("s"+h.jTable_print.getColumnCount());
               // System.out.println(i+h.model_print.getColumnName(i));
                if (h.model_print_columns.getValueAt(i, 1)==null || h.model_print_columns.getValueAt(i, 1).equals(""))
                {headers+="*";}
                else
                {headers+=String.valueOf(h.model_print_columns.getValueAt(i, 1)+"#");}
                
               
                numbers+=String.valueOf(h.model_print_columns.getValueAt(i, 0))+"#";
                
                sizes+= String.valueOf(h.jTable_print .getColumnModel().getColumn(i).getPreferredWidth())+"#";
            }
            
            for (int i=0 ; i<h.model_headers.getRowCount() ; i++)
            {
                report_headers+=String.valueOf(h.model_headers.getValueAt(i, 0))+"#";
                report_headers_levels+=String.valueOf(h.model_headers.getValueAt(i, 1))+"#";
                report_headers_positions+=String.valueOf(h.model_headers.getValueAt(i, 2))+"#";
            }
            for (int i=0 ; i<h.model_footers.getRowCount() ; i++)
            {
                report_footers+=String.valueOf(h.model_footers.getValueAt(i, 0))+"#";
                report_footers_levels+=String.valueOf(h.model_footers.getValueAt(i, 1))+"#";
                report_footers_positions+=String.valueOf(h.model_footers.getValueAt(i, 2))+"#";
            }
            if (rs.next()){
           
                h.m.ob.stmt.executeUpdate("update print_history set table_number='"+numbers+"' , table_size='"+sizes+"' , table_header='"+headers+"' , "
                        +"table_font="+h.jTable_print.getFont().getSize()+" , header_font="+h.jTable_print.getTableHeader().getFont().getSize()
                        +" , report_headers ='"+report_headers+"' , report_headers_levels= '"+report_headers_levels+"' , report_headers_positions='"+report_headers_positions+"' , "
                         +"  report_footers='"+report_footers+"' , report_footers_levels='"+report_footers_levels+"' , report_footers_positions='"+report_footers_positions+"'  "
                        + " where table_name='"+table.getName()+"' and user_name='"+h.m.jLabel_current_user.getText()+"'");
            }
            else
            {
            
           h.m.ob.stmt.executeUpdate("insert into print_history values('"+table.getName()+"','"+numbers+"','"+sizes+"','"+headers+"',"
                   +h.jTable_print.getTableHeader().getFont().getSize()+","+h.jTable_print.getFont().getSize()+",'"+report_headers+"','"
                   +report_headers_levels+"','"+report_headers_positions+"','"+report_footers+"','"+report_footers_levels+"','"+report_footers_positions+"','"+h.m.jLabel_current_user.getText()+"',default)");
            }
            JOptionPane.showMessageDialog(null, "تم الحفظ");
             } catch (SQLException ex) {
            Logger.getLogger(print_class.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    boolean validations_headers_footers(String name , String levels , String positions)
    {
        boolean flag=true ;
        if (name==null || name.length()==0)
        {
            h.jTextField_name_hf.setBackground(Color.pink);
            flag=false ;
        }
        if (levels==null || levels.length()==0 || h.m.ob.check_int(levels)==false || Integer.parseInt(positions)<1 )
        {
              h.jTextField_level_hf.setBackground(Color.pink);
            flag=false ;
        }
        if (positions==null || positions.length()==0 || h.m.ob.check_int(positions)==false || Integer.parseInt(positions)<1||Integer.parseInt(positions)>3 )
        {
              h.jTextField_positin_hf.setBackground(Color.pink);
            flag=false ;
        }
        return flag ;
    }
   
}
