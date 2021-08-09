package View;


import Controller.ConnectToSQLServer;
import Model.Lop;
import Model.SinhVien;
import Model.TaiKhoan;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

public class Home extends javax.swing.JFrame {
    Connection connection = ConnectToSQLServer.ketNoiCSDL();
    
    ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();
    ArrayList<Lop> danhSachLop = new ArrayList<>();
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    
    int count = 0;
    static String sql;
    
    Border borderError = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 0, 0));
    Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(204, 204, 204));
    
    public Home(){
        initComponents();
        
        //this.setLocationRelativeTo(null);
        
        jPanel_DangNhap.setVisible(false);
        jPanel_DangKy.setVisible(false);
        jLabel_BackgroundImage.setIcon(new ImageIcon(getClass().getResource("HaUI.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Container = new javax.swing.JPanel();
        jPanel_Main = new javax.swing.JPanel();
        jLabel_DangKy = new javax.swing.JLabel();
        jLabel_DangNhap = new javax.swing.JLabel();
        jPanel_DangNhap = new javax.swing.JPanel();
        jTextField_DangNhap_TenDangNhap = new javax.swing.JTextField();
        jButton_DangNhap = new javax.swing.JButton();
        jLabel_DangNhap_Username = new javax.swing.JLabel();
        jLabel_DangNhap_Password = new javax.swing.JLabel();
        jTextField_DangNhap_MatKhau = new javax.swing.JTextField();
        jLabel_DangNhap_LoaiTaiKhoan = new javax.swing.JLabel();
        jComboBox_DangNhap_LoaiTaiKhoan = new javax.swing.JComboBox<>();
        jPanel_DangKy = new javax.swing.JPanel();
        jButton_DangKy = new javax.swing.JButton();
        jLabel_DangKy_Username = new javax.swing.JLabel();
        jLabel_DangKy_Password = new javax.swing.JLabel();
        jTextField_DangKy_MaSinhVien = new javax.swing.JTextField();
        jTextField_DangKy_TenDangNhap = new javax.swing.JTextField();
        jLabel_DangKy_ConfirmPassword = new javax.swing.JLabel();
        jTextField_DangKy_XacNhanMatKhau = new javax.swing.JTextField();
        jComboBox_ChonLop = new javax.swing.JComboBox<>();
        jTextField_DangKy_MatKhau = new javax.swing.JTextField();
        jTextField_DangKy_TenSinhVien = new javax.swing.JTextField();
        jLabel_DangKy_Username1 = new javax.swing.JLabel();
        jLabel_DangKy_Username2 = new javax.swing.JLabel();
        jLabel_DangKy_ConfirmPassword1 = new javax.swing.JLabel();
        jLabel_BackgroundImage = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_Container.setBackground(new java.awt.Color(224, 224, 224));
        jPanel_Container.setPreferredSize(new java.awt.Dimension(408, 500));

        jPanel_Main.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_DangKy.setBackground(new java.awt.Color(42, 187, 155));
        jLabel_DangKy.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel_DangKy.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DangKy.setText("Đăng ký");
        jLabel_DangKy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel_DangKy.setOpaque(true);
        jLabel_DangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DangKyMouseClicked(evt);
            }
        });

        jLabel_DangNhap.setBackground(new java.awt.Color(42, 187, 155));
        jLabel_DangNhap.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel_DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DangNhap.setText("Đăng nhập");
        jLabel_DangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel_DangNhap.setOpaque(true);
        jLabel_DangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DangNhapMouseClicked(evt);
            }
        });

        jPanel_DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_DangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_DangNhap_TenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangNhap_TenDangNhap.setForeground(new java.awt.Color(105, 105, 105));

        jButton_DangNhap.setBackground(new java.awt.Color(255, 204, 102));
        jButton_DangNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_DangNhap.setText("Đăng nhập");
        jButton_DangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangNhapActionPerformed(evt);
            }
        });

        jLabel_DangNhap_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangNhap_Username.setText("Tên tài khoản:");

        jLabel_DangNhap_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangNhap_Password.setText("Mật khẩu:");

        jTextField_DangNhap_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangNhap_MatKhau.setForeground(new java.awt.Color(105, 105, 105));

        jLabel_DangNhap_LoaiTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangNhap_LoaiTaiKhoan.setText("Loại tài khoản:");

        jComboBox_DangNhap_LoaiTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_DangNhap_LoaiTaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảng viên", "Sinh viên" }));

        javax.swing.GroupLayout jPanel_DangNhapLayout = new javax.swing.GroupLayout(jPanel_DangNhap);
        jPanel_DangNhap.setLayout(jPanel_DangNhapLayout);
        jPanel_DangNhapLayout.setHorizontalGroup(
            jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DangNhap_Password)
                    .addComponent(jLabel_DangNhap_Username)
                    .addComponent(jLabel_DangNhap_LoaiTaiKhoan))
                .addGap(26, 26, 26)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_DangNhap_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DangNhap_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_DangNhap_LoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_DangNhapLayout.setVerticalGroup(
            jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangNhap_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DangNhap_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_DangNhap_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DangNhap_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_DangNhap_LoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DangNhap_LoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel_DangKy.setBackground(new java.awt.Color(255, 255, 255));

        jButton_DangKy.setBackground(new java.awt.Color(255, 204, 102));
        jButton_DangKy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_DangKy.setText("Đăng ký");
        jButton_DangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangKyActionPerformed(evt);
            }
        });

        jLabel_DangKy_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_Username.setText("Tên tài khoản:");

        jLabel_DangKy_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_Password.setText("Mật khẩu:");

        jTextField_DangKy_MaSinhVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangKy_MaSinhVien.setForeground(new java.awt.Color(105, 105, 105));

        jTextField_DangKy_TenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangKy_TenDangNhap.setForeground(new java.awt.Color(105, 105, 105));

        jLabel_DangKy_ConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_ConfirmPassword.setText("Xác nhận mật khẩu:");

        jTextField_DangKy_XacNhanMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangKy_XacNhanMatKhau.setForeground(new java.awt.Color(105, 105, 105));

        jComboBox_ChonLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField_DangKy_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangKy_MatKhau.setForeground(new java.awt.Color(105, 105, 105));

        jTextField_DangKy_TenSinhVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangKy_TenSinhVien.setForeground(new java.awt.Color(105, 105, 105));

        jLabel_DangKy_Username1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_Username1.setText("Mã sinh viên:");

        jLabel_DangKy_Username2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_Username2.setText("Tên sinh viên:");

        jLabel_DangKy_ConfirmPassword1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DangKy_ConfirmPassword1.setText("Chọn lớp:");

        javax.swing.GroupLayout jPanel_DangKyLayout = new javax.swing.GroupLayout(jPanel_DangKy);
        jPanel_DangKy.setLayout(jPanel_DangKyLayout);
        jPanel_DangKyLayout.setHorizontalGroup(
            jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DangKyLayout.createSequentialGroup()
                        .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DangKyLayout.createSequentialGroup()
                        .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel_DangKy_ConfirmPassword1)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel_DangKy_ConfirmPassword)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_DangKy_Username2)
                                    .addComponent(jLabel_DangKy_Username1)
                                    .addComponent(jLabel_DangKy_Password)
                                    .addComponent(jLabel_DangKy_Username))
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_DangKy_XacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_DangKy_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_DangKy_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_DangKy_TenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_DangKy_MaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_ChonLop, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel_DangKyLayout.setVerticalGroup(
            jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addComponent(jLabel_DangKy_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_DangKy_Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addComponent(jTextField_DangKy_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_DangKy_MaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addComponent(jTextField_DangKy_TenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_DangKy_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addComponent(jLabel_DangKy_Username2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_DangKy_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DangKy_XacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ChonLop)
                    .addComponent(jLabel_DangKy_ConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
        jPanel_Main.setLayout(jPanel_MainLayout);
        jPanel_MainLayout.setHorizontalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MainLayout.createSequentialGroup()
                .addComponent(jLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MainLayout.createSequentialGroup()
                    .addContainerGap(90, Short.MAX_VALUE)
                    .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        jPanel_MainLayout.setVerticalGroup(
            jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MainLayout.createSequentialGroup()
                .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MainLayout.createSequentialGroup()
                    .addGap(0, 66, Short.MAX_VALUE)
                    .addComponent(jPanel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MainLayout.createSequentialGroup()
                    .addContainerGap(121, Short.MAX_VALUE)
                    .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jLabel_Title.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Title.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("PHẦN MỀM THI TRẮC NGHIỆM");

        javax.swing.GroupLayout jPanel_ContainerLayout = new javax.swing.GroupLayout(jPanel_Container);
        jPanel_Container.setLayout(jPanel_ContainerLayout);
        jPanel_ContainerLayout.setHorizontalGroup(
            jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        jPanel_ContainerLayout.setVerticalGroup(
            jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ContainerLayout.createSequentialGroup()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_DangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangNhapMouseClicked
        jLabel_DangNhap.setBackground(Color.white);
        jLabel_DangNhap.setForeground(Color.black);
        
        jLabel_DangKy.setBackground(new Color(42, 187, 155));
        jLabel_DangKy.setForeground(Color.white);
        
        jTextField_DangNhap_TenDangNhap.setBorder(border);
        jTextField_DangNhap_MatKhau.setBorder(border);
        jTextField_DangNhap_TenDangNhap.setText("");
        jTextField_DangNhap_MatKhau.setText("");
        
        jPanel_DangNhap.setVisible(true); 
        jPanel_DangKy.setVisible(false);
    }//GEN-LAST:event_jLabel_DangNhapMouseClicked

    private void jLabel_DangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangKyMouseClicked
        jLabel_DangKy.setBackground(Color.white);
        jLabel_DangKy.setForeground(Color.black);
        
        jLabel_DangNhap.setBackground(new Color(42, 187, 155));
        jLabel_DangNhap.setForeground(Color.white);
        
        jTextField_DangKy_TenDangNhap.setBorder(border);
        jTextField_DangKy_MaSinhVien.setBorder(border);
        jTextField_DangKy_TenDangNhap.setText("");
        jTextField_DangKy_MaSinhVien.setText("");
        jTextField_DangKy_XacNhanMatKhau.setText("");
        jTextField_DangKy_MaSinhVien.setText("");
        jTextField_DangKy_TenSinhVien.setText("");
        
        layDanhSachLop_JCombox();
        
        jPanel_DangKy.setVisible(true);
        jPanel_DangNhap.setVisible(false);
    }//GEN-LAST:event_jLabel_DangKyMouseClicked

    private void jButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangNhapActionPerformed
        StringBuilder sb = new StringBuilder();
        String tenDN = new String(jTextField_DangNhap_TenDangNhap.getText());
        String matKhau = new String(jTextField_DangNhap_MatKhau.getText());
        String loaiTK = jComboBox_DangNhap_LoaiTaiKhoan.getSelectedItem().toString();
        //TaiKhoan temp = new TaiKhoan();
        
        try{
            if(count > 2){
                JOptionPane.showMessageDialog(this, "\nNhập sai tối đa 3 lần\n");
            }
            else{
                if(tenDN.equals("")){
                    sb.append("\nTên tài khoản không hợp lệ\n");
                    jTextField_DangNhap_TenDangNhap.setBorder(borderError);
                }
                else{
                    jTextField_DangNhap_TenDangNhap.setBorder(border);
                }

                if(matKhau.equals("")){
                    sb.append("\nMật khẩu không hợp lệ\n");
                    jTextField_DangNhap_MatKhau.setBorder(borderError);
                }
                else{
                    jTextField_DangNhap_MatKhau.setBorder(border);
                }

                if(sb.length() > 0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                else{
                    if(loaiTK.equals("Giảng viên")){
                        sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap='" +tenDN+ "' and MatKhau='" +matKhau+ "' and LoaiTaiKhoan=N'Giảng viên'";
                        danhSachTaiKhoan = ConnectToSQLServer.layData_BangTaiKhoan(sql);
                    }
                    else{
                        sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap='" +tenDN+ "' and MatKhau='" +matKhau+ "' and LoaiTaiKhoan=N'Sinh viên'";
                        danhSachTaiKhoan = ConnectToSQLServer.layData_BangTaiKhoan(sql);
                    }
                } 

                if(danhSachTaiKhoan.size() == 0){
                    count++;
                    JOptionPane.showMessageDialog(this, "\nTài khoản hoặc mật khẩu không đúng\n");
                }               
                else{
                    if(loaiTK.equals("Giảng viên")){
                        new MainMenuGiangVien(tenDN).setVisible(true);
                        this.setVisible(false);
                    }
                    else
                    {
                       new MainSinhVienF(tenDN).setVisible(true);
                       this.setVisible(false);
                    }
                }
            }  
        } 
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "\nĐăng nhập thất bại\n" + "Lỗi: " + ex.toString());
        }
    }//GEN-LAST:event_jButton_DangNhapActionPerformed

    private void jButton_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangKyActionPerformed
        StringBuilder sb = new StringBuilder();
        String tenDN = new String(jTextField_DangKy_TenDangNhap.getText());
        String maSV = new String(jTextField_DangKy_MaSinhVien.getText());
        String tenSV = new String(jTextField_DangKy_TenSinhVien.getText());
        String matKhau = new String(jTextField_DangKy_MatKhau.getText());
        String xacThuc = new String(jTextField_DangKy_XacNhanMatKhau.getText());
        String maLop = new String(jComboBox_ChonLop.getSelectedItem().toString());

        
        try{
            if(tenDN.equals("")){
                sb.append("\nTên tài khoản không hợp lệ\n");
                jTextField_DangKy_TenDangNhap.setBorder(borderError);
            }
            else{
                jTextField_DangKy_TenDangNhap.setBorder(border);
            }

            if(matKhau.equals("")){
                sb.append("\nMật khẩu không hợp lệ\n");
                jTextField_DangKy_MaSinhVien.setBorder(borderError);
            }
            else{
                jTextField_DangKy_MaSinhVien.setBorder(border);
            }

            if(!xacThuc.equals(matKhau)){
                sb.append("\nMật khẩu xác thực không trùng khớp\n");
                jTextField_DangKy_XacNhanMatKhau.setBorder(borderError);
            }
            else{
                jTextField_DangKy_XacNhanMatKhau.setBorder(border);  
            }

            if(sb.length() > 0){
                JOptionPane.showMessageDialog(this, sb.toString());
                return;
            }
            else{
                if(kiemTraTaiKhoanDaTonTai(tenDN))
                {
                    jTextField_DangKy_TenDangNhap.setBorder(borderError);
                    JOptionPane.showMessageDialog(this, "\nTên tài khoản đã tồn tại\n");
                } 
                else if(kiemTraSinhVienDaTonTai(maSV))
                {
                    jTextField_DangKy_MaSinhVien.setBorder(borderError);
                    JOptionPane.showMessageDialog(this, "\nSinh viên này đã có tài khoản\n");
                }
                else
                {
                    String sql_1 = "INSERT INTO TAIKHOAN VALUES('" +tenDN+ "', '" +matKhau+ "', 'Sinh viên')"; 
                    String sql_2 = "INSERT INTO SINHVIEN VALUES ('" +maSV+ "', '" +tenSV+ "', '"+maLop+"', '" +tenDN+ "')";
//                    ConnectToSQLServer.thucHienLenhSQL(sql_1);
//                    ConnectToSQLServer.thucHienLenhSQL(sql_2);
                    if(ConnectToSQLServer.thucHienLenhSQL(sql_1) && ConnectToSQLServer.thucHienLenhSQL(sql_2)){
                        JOptionPane.showMessageDialog(this, "\nĐăng ký hoàn tất\n");
                        jTextField_DangKy_TenDangNhap.setText("");
                        jTextField_DangKy_MaSinhVien.setText("");
                        jTextField_DangKy_XacNhanMatKhau.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "\nĐăng ký thất bại\n");
                    }
                }
                
                

//                danhSachTaiKhoan = ConnectToSQLServer.layData_BangTaiKhoan(sql);
//                if(danhSachTaiKhoan.get(0).getTenDangNhap()== null){
//                    
//                }            
//                else{
//                    jTextField_DangKy_TenDangNhap.setBorder(borderError);
//                    JOptionPane.showMessageDialog(this, "\nTên tài khoản đã tồn tại\n");
//                }
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "\nĐăng ký thất bại\n" + "Lỗi: " + ex.toString());
        }
    }//GEN-LAST:event_jButton_DangKyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangKy;
    private javax.swing.JButton jButton_DangNhap;
    private javax.swing.JComboBox<String> jComboBox_ChonLop;
    private javax.swing.JComboBox<String> jComboBox_DangNhap_LoaiTaiKhoan;
    private javax.swing.JLabel jLabel_BackgroundImage;
    private javax.swing.JLabel jLabel_DangKy;
    private javax.swing.JLabel jLabel_DangKy_ConfirmPassword;
    private javax.swing.JLabel jLabel_DangKy_ConfirmPassword1;
    private javax.swing.JLabel jLabel_DangKy_Password;
    private javax.swing.JLabel jLabel_DangKy_Username;
    private javax.swing.JLabel jLabel_DangKy_Username1;
    private javax.swing.JLabel jLabel_DangKy_Username2;
    private javax.swing.JLabel jLabel_DangNhap;
    private javax.swing.JLabel jLabel_DangNhap_LoaiTaiKhoan;
    private javax.swing.JLabel jLabel_DangNhap_Password;
    private javax.swing.JLabel jLabel_DangNhap_Username;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel_Container;
    private javax.swing.JPanel jPanel_DangKy;
    private javax.swing.JPanel jPanel_DangNhap;
    private javax.swing.JPanel jPanel_Main;
    private javax.swing.JTextField jTextField_DangKy_MaSinhVien;
    private javax.swing.JTextField jTextField_DangKy_MatKhau;
    private javax.swing.JTextField jTextField_DangKy_TenDangNhap;
    private javax.swing.JTextField jTextField_DangKy_TenSinhVien;
    private javax.swing.JTextField jTextField_DangKy_XacNhanMatKhau;
    private javax.swing.JTextField jTextField_DangNhap_MatKhau;
    private javax.swing.JTextField jTextField_DangNhap_TenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void layDanhSachLop_JCombox() {
        sql = "SELECT * FROM Lop INNER JOIN GIANGVIEN ON Lop.MaGV = GIANGVIEN.MaGV";
        danhSachLop = ConnectToSQLServer.layData_BangLop(sql);

        ArrayList<String> danhSachMaLop = new ArrayList<>();
        Iterator<Lop> it = danhSachLop.iterator();
        while(it.hasNext())
        {
            danhSachMaLop.add(it.next().getMaLop());
        }

        jComboBox_ChonLop.setModel(new DefaultComboBoxModel(danhSachMaLop.toArray()));
    }

    private boolean kiemTraTaiKhoanDaTonTai(String tenDN) {
        sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap='" +tenDN+ "'";
        danhSachTaiKhoan = ConnectToSQLServer.layData_BangTaiKhoan(sql);
        if(danhSachTaiKhoan.size() == 0)
            return false;
        return true;
    }

    private boolean kiemTraSinhVienDaTonTai(String maSV) {
        sql = "SELECT * FROM SINHVIEN "
                + "INNER JOIN LOP ON SINHVIEN.MaLop = LOP.MaLop "
                + "WHERE MaSV='" +maSV+ "'";
        danhSachSinhVien = ConnectToSQLServer.layData_BangSinhVien(sql);
        if(danhSachSinhVien.size() == 0)
            return false;
        return true;
    }
}
