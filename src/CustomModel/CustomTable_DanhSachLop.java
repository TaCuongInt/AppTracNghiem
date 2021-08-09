package CustomModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Lop;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachLop extends AbstractTableModel{
    String[] tenCot = {"Mã lớp", "Tên lớp"};
    Class[] kieuDuLieu = {String.class, String.class};
    
    ArrayList<Lop> ds = new ArrayList<>();

    public CustomTable_DanhSachLop() {
    }
    
    public CustomTable_DanhSachLop(ArrayList<Lop> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return tenCot.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMaLop();
            case 1: return ds.get(rowIndex).getTenLop();
            default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return kieuDuLieu[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return tenCot[column];
    }
     
}
