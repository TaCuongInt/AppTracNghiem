/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConnectToSQLServer;
import Controller.CreateExcel;
import Model.BaiKiemTra;
import CustomModel.CustomTable_DanhSachBaiKiemTra;
import Model.CT_SV_BKT;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Jonan
 */
public class DanhSachBaiKiemTraForm extends javax.swing.JFrame {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    ArrayList<BaiKiemTra> danhSachBaiKiemTra = new ArrayList<>();
    int dongChon_BaiKiemTra = -1;
    
    ArrayList<CT_SV_BKT> danhSachDiem = new ArrayList<>();

    /**
     * Creates new form DanhSachBaiKiemTraForm
     */

    public DanhSachBaiKiemTraForm() {
        initComponents();
        loadDataTable_BangDanhSachBaiKiemTra();
    }

    public DanhSachBaiKiemTraForm(String maLop) {
        initComponents();
        loadDataTable_BangDanhSachBaiKiemTra(maLop);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DanhSachBaiKiemTra = new javax.swing.JTable();
        jButton_TroLai1 = new javax.swing.JButton();
        jButton_LayDiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(705, 439));
        setSize(new java.awt.Dimension(705, 440));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DANH S??CH B??I KI???M TRA");

        jTable_DanhSachBaiKiemTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_DanhSachBaiKiemTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DanhSachBaiKiemTraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_DanhSachBaiKiemTra);

        jButton_TroLai1.setText("Tr??? l???i");
        jButton_TroLai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TroLai1ActionPerformed(evt);
            }
        });

        jButton_LayDiem.setText("L???y ??i???m");
        jButton_LayDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LayDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_LayDiem)
                .addGap(79, 79, 79)
                .addComponent(jButton_TroLai1)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LayDiem)
                    .addComponent(jButton_TroLai1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_DanhSachBaiKiemTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DanhSachBaiKiemTraMouseClicked
        // TODO add your handling code here:
        dongChon_BaiKiemTra = jTable_DanhSachBaiKiemTra.rowAtPoint(evt.getPoint());
        if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1) {
            new ChiTietBaiKiemTraForm(danhSachBaiKiemTra.get(dongChon_BaiKiemTra).getMaBKT()).setVisible(true);
        }

    }//GEN-LAST:event_jTable_DanhSachBaiKiemTraMouseClicked

    private void jButton_TroLai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TroLai1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton_TroLai1ActionPerformed

    private void jButton_LayDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LayDiemActionPerformed
        // TODO add your handling code here:
        String maBKT = jTable_DanhSachBaiKiemTra.getValueAt(dongChon_BaiKiemTra, 0).toString();
        
        String query = "SELECT * "
                    + "FROM dbo.[CT_SV_BKT] INNER JOIN dbo.[SINHVIEN] ON CT_SV_BKT.MaSV = SINHVIEN.MaSV  "
                    + "INNER JOIN dbo.[BAIKIEMTRA] ON CT_SV_BKT.MaBKT = BAIKIEMTRA.MaBKT "
                    + "WHERE BAIKIEMTRA.MaBKT='"+ maBKT +"'";
        ArrayList<CT_SV_BKT> danhSachDiem = ConnectToSQLServer.layData_BangCT_SV_BKT(query);
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("L??u file");
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));

        int userSelection = fileChooser.showSaveDialog(this);
        System.out.println("getSelectedFile() : " + fileChooser.getSelectedFile());
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            CreateExcel file = new CreateExcel();
            try {
                String localPathOfFile = fileChooser.getSelectedFile().toString() + ".xls";
                file.TaoFileDiem(danhSachDiem, localPathOfFile);
            } catch (IOException ex) {
                Logger.getLogger(DanhSachBaiKiemTraForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }//GEN-LAST:event_jButton_LayDiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DanhSachBaiKiemTraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachBaiKiemTraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachBaiKiemTraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachBaiKiemTraForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachBaiKiemTraForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LayDiem;
    private javax.swing.JButton jButton_TroLai1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DanhSachBaiKiemTra;
    // End of variables declaration//GEN-END:variables

    private void loadDataTable_BangDanhSachBaiKiemTra() {
    }

    private void loadDataTable_BangDanhSachBaiKiemTra(String maLop) {
        danhSachBaiKiemTra.clear();
        String query = "SELECT * FROM dbo.[BAIKIEMTRA] INNER JOIN dbo.[LOP] ON BAIKIEMTRA.MaLop = LOP.MaLop WHERE LOP.MaLop='" +maLop+"'";
        danhSachBaiKiemTra = ConnectToSQLServer.layData_BangBaiKiemTra(query);

        jTable_DanhSachBaiKiemTra.setModel(new CustomTable_DanhSachBaiKiemTra(danhSachBaiKiemTra));
    }

}
