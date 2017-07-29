/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ashraf_atef
 */
public class sort_tables_columns {

    hr h ;
    public sort_tables_columns(hr h) {
        this.h=h ;
    }
    
    void save_sorted_columns(JTable new_order_table, String file_name) {

        Writer w;
        try {
            try {
                w = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(h.directory.getAbsolutePath()+"/"+file_name), "UTF8"));
                try {

                    for (int i = 0; i < new_order_table.getColumnCount(); i++) {

                        w.append(new_order_table.getColumnModel().getColumn(i).getWidth() + "#");

                        w.append(new_order_table.getColumnName(i)+"\n");

                    }
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
    }

    
    void reload_sorted_columns_trkeb()
    {
          File f=new File(h.directory,"installation_table.txt");
          if (f.exists())
          {
              Scanner s;
              try {
                  s = new Scanner(f);
              int column_number=0 ;
              String column_name="";
            
              while (s.hasNext())
                {
                 int column_width=s.nextInt();
                 column_name=s.nextLine();
                 column_name=column_name.substring(1, column_name.length());
                  
                  for (int i=column_number+1 ; i<h.m.jTable_trkeb.getColumnCount() ; i++)
                  {
                      if (column_name.equals(h.m.jTable_trkeb.getColumnName(i)))
                      {
                          h.m.jTable_trkeb.moveColumn(i, column_number);
                          h.m.jTable_trkeb.getColumnModel().getColumn(column_number).setPreferredWidth(column_width);
                          
                          break ;
                      }
                  }
                  column_number++;
                 
                }
              
              } catch (FileNotFoundException ex) {
                  Logger.getLogger(sort_tables_columns.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }
          
        
    }
    
    void reload_sorted_columns_customer_service()
    {
          File f=new File(h.directory,"customer_service_table.txt");
         if (f.exists())
          {
              
              Scanner s;
              try {
                  s = new Scanner(f);
              int column_number=0 ;
              String column_name="";
              
              while (s.hasNext())
                {
                 int column_width=s.nextInt();
               
                  column_name=s.nextLine();
                  column_name=column_name.substring(1, column_name.length());
                  
                  for (int i=column_number ; i<h.m.jTable_siana.getColumnCount() ; i++)
                  {
                     // System.out.println("cmp:"+column_name+"-"+(String)h.m.jTable_siana.getColumnName(i));
                      if (column_name.equals((String)h.m.jTable_siana.getColumnName(i)))
                      {
                        
                          h.m.jTable_siana.moveColumn(i, column_number);
                          h.jTable_siana.moveColumn(i, column_number);
                          h.m.jTable_siana.getColumnModel().getColumn(column_number).setPreferredWidth(column_width);
                          h.jTable_siana.getColumnModel().getColumn(column_number).setPreferredWidth(column_width);
                        // System.out.println(i+column_name+column_number);
                        
                          break ;
                      }
                  }
                  
                 column_number++;
                }
              
              } catch (FileNotFoundException ex) {
                  Logger.getLogger(sort_tables_columns.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }
    }
    
    
    void reload_sorted_columns(String filename , JTable table)
    {
//          File f=new File(h.directory,filename);
//          if (f.exists())
//          {
//              Scanner s;
//              try {
//                  s = new Scanner(f);
//              int column_number=0 ;
//              String column_name="";
//            
//              while (s.hasNext())
//                {
//                 int column_width=s.nextInt();
//                 column_name=s.nextLine();
//                 column_name=column_name.substring(1, column_name.length());
//                  
//                  for (int i=column_number ; i<table.getColumnCount() ; i++)
//                  {
//                      if (column_name.equals(table.getColumnName(i)))
//                      {
//                          table.moveColumn(i, column_number);
//                          table.getColumnModel().getColumn(column_number).setPreferredWidth(column_width);
//                          
//                          break ;
//                      }
//                  }
//                  column_number++;
//                 
//                }
//              
//              } catch (FileNotFoundException ex) {
//                  Logger.getLogger(sort_tables_columns.class.getName()).log(Level.SEVERE, null, ex);
//              }
//              
//          }
          
         try {
            File fileDir = new File(h.directory, filename);

            if (fileDir.exists())
            {
                System.out.println(filename);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF8"));

            String str;
            int column_number = 0;
            while ((str = in.readLine()) != null) {
                String[] split_str = str.split("#");
                int column_width = Integer.parseInt(split_str[0]);
                String column_name = split_str[1];
                System.out.println(column_width+"-"+column_name);
                for (int i = column_number; i < table.getColumnCount(); i++) {
                    if (column_name.equals(table.getColumnName(i))) {
                        table.moveColumn(i, column_number);
                        table.getColumnModel().getColumn(column_number).setPreferredWidth(column_width);

                        break;
                    }
                }
                column_number++;
            }

            in.close();
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
