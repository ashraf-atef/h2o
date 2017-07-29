/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el7iah2;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ashraf
 */
public class MyTableModel extends DefaultTableModel {
//    private int rows;
//    private int cols;
//    private Boolean[][] matrix;

//    MyTableModel(int rows, int cols) {
//        this.rows = rows;
//        this.cols = cols;
//        matrix = new Boolean[rows][cols];
//    }

    public void deleteColumn(int col) {
       Vector vector=getDataVector();
        System.out.println("Main Vector :"+vector.size());
       for (int i=0 ; i<vector.size() ; i++)
       {
            System.out.println("Child Vector "+i+" :"+((Vector)vector.get(i)).size());
       ((Vector)vector.get(i)).remove(col);
       
       }
        System.out.println("End _________________________________________________________________________________________");
       fireTableStructureChanged() ;
        System.out.println("End _________________________________________________________________________________________");
    }

  
    
}
