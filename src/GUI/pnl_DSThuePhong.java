/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTO_HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.util.Calendar;

/**
 *
 * @author ADMIN
 */
public class pnl_DSThuePhong extends javax.swing.JPanel {

    /**
     * Creates new form frm_DSThuePhong
     */
    public static pnl_DSThuePhong form;

    public pnl_DSThuePhong() {
        initComponents();
        form = this;
        BLL.BLL_DichVu.DoDuLieuBangDatPhong(tbl_DSThuePhong);
        btn_DichVU.setEnabled(false);
       

    }
    public static DTO.DTO_HoaDon HD = new DTO_HoaDon();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DSThuePhong = new javax.swing.JTable();
        lbl_DSThuePhong = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        lbl_ChiTiet = new javax.swing.JLabel();
        btn_ThanhToan = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        lbl_MaDatPhong = new javax.swing.JLabel();
        lbl_MaDP = new javax.swing.JLabel();
        lbl_TenKhachHang = new javax.swing.JLabel();
        lbl_Phong = new javax.swing.JLabel();
        lbl_NgayThue = new javax.swing.JLabel();
        lbl_NgayRaDuKien = new javax.swing.JLabel();
        lbl_SoNguoi = new javax.swing.JLabel();
        lbl_NguoiTao = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        txt_Phong = new javax.swing.JTextField();
        txt_NgayThue = new javax.swing.JTextField();
        txt_NgayRa = new javax.swing.JTextField();
        txt_SoNguoi = new javax.swing.JTextField();
        txt_NguoiTao = new javax.swing.JTextField();
        btn_Tru = new javax.swing.JButton();
        btn_Cong = new javax.swing.JButton();
        btn_DichVU = new javax.swing.JButton();
        lbl_Vuot = new javax.swing.JLabel();
        lbl_NgayVuot = new javax.swing.JLabel();
        lbl_Ngay = new javax.swing.JLabel();
        lbl_TongCong2 = new javax.swing.JLabel();
        lbl_TienPhong2 = new javax.swing.JLabel();
        lbl_TienDV2 = new javax.swing.JLabel();
        lbl_TienPhong = new javax.swing.JLabel();
        lbl_TienDV = new javax.swing.JLabel();
        lbl_vnd = new javax.swing.JLabel();
        lbl_vnd2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_TongCong = new javax.swing.JLabel();
        lbl_vnd3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_PhuThuCheckIn = new javax.swing.JLabel();
        lbl_PhuThuCheckOut = new javax.swing.JLabel();
        txt_CheckIn = new javax.swing.JTextField();
        txt_checkout = new javax.swing.JTextField();
        lbl_Dau = new javax.swing.JLabel();
        lbl_Dau2 = new javax.swing.JLabel();
        lbl_Dau3 = new javax.swing.JLabel();
        lbl_TienCoc2 = new javax.swing.JLabel();
        lbl_TienCoc = new javax.swing.JLabel();
        lbl_Dau4 = new javax.swing.JLabel();
        lbl_vnd4 = new javax.swing.JLabel();
        lbl_vnd5 = new javax.swing.JLabel();
        lbl_vnd6 = new javax.swing.JLabel();
        lbl_KM = new javax.swing.JLabel();
        txt_GiamGia = new javax.swing.JTextField();
        lbl_PhanTram = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 660));
        setRequestFocusEnabled(false);

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_DSThuePhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đặt phòng", "Tên khách hàng", "Phòng", "Loại thuê", "Ngày thuê"
            }
        ));
        tbl_DSThuePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DSThuePhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DSThuePhong);
        if (tbl_DSThuePhong.getColumnModel().getColumnCount() > 0) {
            tbl_DSThuePhong.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_DSThuePhong.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lbl_DSThuePhong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_DSThuePhong.setText("Danh sách thuê phòng");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(lbl_DSThuePhong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(lbl_DSThuePhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pnl2.setBackground(new java.awt.Color(204, 204, 255));

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ChiTiet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ChiTiet.setText("Chi tiết");
        pnl3.add(lbl_ChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        btn_ThanhToan.setBackground(new java.awt.Color(102, 255, 102));
        btn_ThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ThanhToan.setText("Thanh toán");
        btn_ThanhToan.setEnabled(false);
        btn_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThanhToanActionPerformed(evt);
            }
        });
        pnl3.add(btn_ThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 360, 42));

        btn_Sua.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon_server.png"))); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });
        pnl3.add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, -1));

        lbl_MaDatPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_MaDatPhong.setText("Mã đặt phòng");
        pnl3.add(lbl_MaDatPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 14, -1, -1));

        lbl_MaDP.setBackground(new java.awt.Color(255, 255, 255));
        lbl_MaDP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_MaDP.setOpaque(true);
        pnl3.add(lbl_MaDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 109, 28));

        lbl_TenKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TenKhachHang.setText("Tên khách hàng");
        pnl3.add(lbl_TenKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 52, -1, -1));

        lbl_Phong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Phong.setText("Phòng");
        pnl3.add(lbl_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 93, -1, -1));

        lbl_NgayThue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NgayThue.setText("Ngày thuê");
        pnl3.add(lbl_NgayThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 134, -1, -1));

        lbl_NgayRaDuKien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NgayRaDuKien.setText("Ngày ra dự kiến");
        pnl3.add(lbl_NgayRaDuKien, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 175, -1, -1));

        lbl_SoNguoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_SoNguoi.setText("Số người");
        pnl3.add(lbl_SoNguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lbl_NguoiTao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NguoiTao.setText("Người tạo");
        pnl3.add(lbl_NguoiTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_TenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3.add(txt_TenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 49, 165, -1));

        txt_Phong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3.add(txt_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 90, 165, -1));

        txt_NgayThue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3.add(txt_NgayThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 131, 165, -1));

        txt_NgayRa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3.add(txt_NgayRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 172, 165, -1));

        txt_SoNguoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SoNguoi.setText("0");
        pnl3.add(txt_SoNguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, -1));

        txt_NguoiTao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3.add(txt_NguoiTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, -1));

        btn_Tru.setBackground(new java.awt.Color(255, 255, 255));
        btn_Tru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Tru.setText("-");
        btn_Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TruActionPerformed(evt);
            }
        });
        pnl3.add(btn_Tru, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        btn_Cong.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Cong.setText("+");
        btn_Cong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CongActionPerformed(evt);
            }
        });
        pnl3.add(btn_Cong, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btn_DichVU.setBackground(new java.awt.Color(153, 255, 153));
        btn_DichVU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_DichVU.setText("Mở dịch vụ");
        btn_DichVU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DichVUActionPerformed(evt);
            }
        });
        pnl3.add(btn_DichVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lbl_Vuot.setText("vượt quá:");
        pnl3.add(lbl_Vuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));
        pnl3.add(lbl_NgayVuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 47, 23));

        lbl_Ngay.setText("(ngày)");
        pnl3.add(lbl_Ngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 40, -1));

        lbl_TongCong2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TongCong2.setText("Tổng cộng");
        pnl3.add(lbl_TongCong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        lbl_TienPhong2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TienPhong2.setText("Tiền phòng");
        pnl3.add(lbl_TienPhong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 308, -1, -1));

        lbl_TienDV2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TienDV2.setText("Tiền dịch vụ");
        pnl3.add(lbl_TienDV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        lbl_TienPhong.setBackground(new java.awt.Color(102, 255, 204));
        lbl_TienPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienPhong.setText("0");
        lbl_TienPhong.setOpaque(true);
        pnl3.add(lbl_TienPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 140, 24));

        lbl_TienDV.setBackground(new java.awt.Color(102, 255, 204));
        lbl_TienDV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienDV.setText("0");
        lbl_TienDV.setOpaque(true);
        pnl3.add(lbl_TienDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 140, 25));

        lbl_vnd.setText("(VNĐ)");
        pnl3.add(lbl_vnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        lbl_vnd2.setText("(VNĐ)");
        pnl3.add(lbl_vnd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnl3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 227, 10));

        lbl_TongCong.setBackground(new java.awt.Color(102, 255, 204));
        lbl_TongCong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TongCong.setText("0");
        lbl_TongCong.setOpaque(true);
        pnl3.add(lbl_TongCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 140, 28));

        lbl_vnd3.setText("(VNĐ)");
        pnl3.add(lbl_vnd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));
        pnl3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 285, 760, 10));

        lbl_PhuThuCheckIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PhuThuCheckIn.setText("Phụ thu check in sớm");
        pnl3.add(lbl_PhuThuCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        lbl_PhuThuCheckOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PhuThuCheckOut.setText("Phụ thu check out muộn");
        pnl3.add(lbl_PhuThuCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        txt_CheckIn.setBackground(new java.awt.Color(102, 255, 204));
        txt_CheckIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_CheckIn.setText("0");
        txt_CheckIn.setFocusable(false);
        pnl3.add(txt_CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, -1));

        txt_checkout.setBackground(new java.awt.Color(102, 255, 204));
        txt_checkout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_checkout.setText("0");
        txt_checkout.setFocusable(false);
        pnl3.add(txt_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 140, -1));

        lbl_Dau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Dau.setText("-");
        pnl3.add(lbl_Dau, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 10, 10));

        lbl_Dau2.setText("+");
        pnl3.add(lbl_Dau2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        lbl_Dau3.setText("+");
        pnl3.add(lbl_Dau3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        lbl_TienCoc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TienCoc2.setText("Tiền đặt cọc");
        pnl3.add(lbl_TienCoc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        lbl_TienCoc.setBackground(new java.awt.Color(51, 255, 204));
        lbl_TienCoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienCoc.setText("0");
        lbl_TienCoc.setOpaque(true);
        pnl3.add(lbl_TienCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 140, 30));

        lbl_Dau4.setText("+");
        pnl3.add(lbl_Dau4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        lbl_vnd4.setText("(VNĐ)");
        pnl3.add(lbl_vnd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        lbl_vnd5.setText("(VNĐ)");
        pnl3.add(lbl_vnd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        lbl_vnd6.setText("(VNĐ)");
        pnl3.add(lbl_vnd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        lbl_KM.setText("Khuyễn mãi");
        pnl3.add(lbl_KM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        txt_GiamGia.setBackground(new java.awt.Color(51, 255, 204));
        txt_GiamGia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_GiamGia.setText("0");
        txt_GiamGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_GiamGiaKeyReleased(evt);
            }
        });
        pnl3.add(txt_GiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 60, 30));

        lbl_PhanTram.setText("%");
        pnl3.add(lbl_PhanTram, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, 20));

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DichVUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DichVUActionPerformed
        frm_QuanLyChinh frm = frm_QuanLyChinh.b;

        try {
            frm.tab.setSelectedComponent(pnl_DichVuPhong.form);
            pnl_DichVuPhong.form.ChonDatPhong((MaDP));
        } catch (Exception e) {
            pnl_DichVuPhong pnl = new pnl_DichVuPhong();
            frm.tab.add("Dịch vụ của phòng", pnl);
            frm.tab.setSelectedComponent(pnl);
            pnl.form.ChonDatPhong((MaDP));
            BLL.BLL_DichVu.DoDuLieuDichVu(pnl.form.tbl_DV, MaDP);
        }


    }//GEN-LAST:event_btn_DichVUActionPerformed
    public static Date ngayRaDuKien, GioThue;

    public static int songuoi;

    public void DienDuLieuVaoField(String MaDP) {
        ResultSet rs = DAO.DAO_ThuePhong.LayTheoMa(MaDP);
        SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat C = new SimpleDateFormat("dd/MM/yyyy");
        String tenKH = "";
        try {
            if (rs.next()) {
                lbl_MaDP.setText(String.valueOf(rs.getInt("MaDatPhong")));
                ResultSet kh = DAO.DAO_KhachHang.LayKHMa(rs.getString("MaKhachHang"));
                if (kh.next()) {
                    txt_TenKH.setText(kh.getString("TenKhachHang"));
                    tenKH = kh.getString("TenKhachHang");
                    ResultSet LoaiKH=DAO.DAO_LoaiKH.LayTHeoMa(kh.getString("MaLoaiKH"));
                    if (LoaiKH.next()) {
                        txt_GiamGia.setText(String.valueOf(LoaiKH.getInt("TienGiam")));
                    }
                }
                txt_Phong.setText(rs.getString("MaPhong"));
                txt_NgayThue.setText(D.format(rs.getTimestamp("NgayThue")));
                GioThue = rs.getTimestamp("NgayThue");

                txt_NgayRa.setText(C.format(rs.getDate("NgayRaDuKien")));
                ngayRaDuKien = rs.getDate("NgayRaDuKien");
                txt_SoNguoi.setText(String.valueOf(rs.getInt("SoNguoi")));
                songuoi = rs.getInt("SoNguoi");
                txt_NguoiTao.setText(rs.getString("TenUser"));
                lbl_TienCoc.setText(ChuyenDoi.DinhDangSo(rs.getDouble("TienDatCoc")));
                if (rs.getBoolean("LoaiHinhThue")) {
                    TinhTienTheoGio();
                    TinhGioCheckOut(false);
                    txt_CheckIn.setText("0");
                } else {
                    TinhTienTheoNgay();
                    TinhGioCheckOut(true);
                    TinhGioCheckIn();
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_DSThuePhong.class.getName()).log(Level.SEVERE, null, ex);
        }

        TinhNgay();

    }

    private void TinhNgay() {
        try {
            long soNgay;
            Date ngayRa = new Date();
            SimpleDateFormat D = new SimpleDateFormat("yyyy-MM-dd");
            //   System.out.println("Ngày ra " + D.format(ngayRa));
            // System.out.println("ngayRaDuKien" + ngayRaDuKien);
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            c1.setTime(ngayRaDuKien);
            c2.setTime(ngayRa);
            // soNgay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);                     
            if (ngayRaDuKien.equals(ngayRa)) {
                soNgay = 0;
            } else if (ngayRaDuKien.before(ngayRa)) // Hoặc  else if (date1.after(date2)== false)
            {
                soNgay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
            } else {
                soNgay = 0;
            }

            lbl_NgayVuot.setText(String.valueOf(soNgay));
        } catch (Exception e) {
        }

    }

    private void TinhTienTheoGio() {

        Date NgayGioRa = new Date();
        SimpleDateFormat D = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long soGio = ((NgayGioRa.getTime() - GioThue.getTime()) / (3600 * 1000));
        // System.out.println("số giờ ở là " + soGio);
        ResultSet rs = DAO.DAO_ThuePhong.LayTienGio(MaDP);
        double TienGio = 0;
        double Tien = 0;
        try {
            if (rs.next()) {
                TienGio = rs.getDouble("GiaTheoGio");
                //System.out.println("gia theo gio" + TienGio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_DSThuePhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (soGio == 0) {
            soGio = 1;
        }
        Tien = TienGio * soGio;

        //DTO hóa đơn
        HD.setSoGioThue(soGio);
        System.out.println("Giờ thuê HD" + HD.getSoGioThue());
        //
        lbl_TienPhong.setText(ChuyenDoi.DinhDangSo(Tien));
    }
    //Date GioHienTai = new Date();
//    SimpleDateFormat Time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public long TinhGioCheckIn() {//tính giờ checkIn sơm
        Date GioCheckIn = null;
        int MocCheckIn1 = 0, MocCheckIn2 = 0, phantram = 0, phantram2 = 0;
        double phuthu = 0, TienNgay = 0;

        ResultSet rs = DAO.DAO_Khac.LayBangKhac(3);
        ResultSet rs2 = DAO.DAO_Khac.LayBangKhac(4);
        ResultSet rs3 = DAO.DAO_ThuePhong.LayTienGio(MaDP);
        ResultSet rs4 = DAO.DAO_Khac.LayBangKhac(7);
        ResultSet rs5 = DAO.DAO_Khac.LayBangKhac(8);
        try {

            if (rs.next()) {
                GioCheckIn = rs.getTime("GiaTriTG");
//                System.out.println("gio check in la " + GioCheckIn);
                MocCheckIn1 = rs.getInt("GiaTriSo");
            }
            if (rs2.next()) {
                MocCheckIn2 = rs2.getInt("GiaTriSo");
            }
            if (rs3.next()) {
                TienNgay = rs3.getDouble("GiaTheoNgay");

            }
            if (rs4.next()) {
                phantram = rs4.getInt("GiaTriSo");
                // System.out.println(phantram+"%");
            }
            if (rs5.next()) {
                phantram2 = rs5.getInt("GiaTriSo");
                //  System.out.println(phantram2+"%");
            }
        } catch (SQLException ex) {

        }
        long sosanh = (GioCheckIn.getHours() - +GioThue.getHours());
        System.out.println("ss checkin" + sosanh);
        if (sosanh > MocCheckIn1) {
//            txt_CheckIn.setText("có phụ thu checkin sớm 4 tiếng");
            // phantram = Integer.parseInt(lbl_checkIn.getText());
            phuthu = TienNgay * phantram2 / 100;
            txt_CheckIn.setText(ChuyenDoi.DinhDangSo(phuthu));
        } else if (sosanh > MocCheckIn2 && sosanh <= MocCheckIn1) {
//         txt_CheckIn.setText("có phụ thu checkin sớm 2 tiếng");
            //phantram = Integer.parseInt(lbl_checkIn1.getText());
            phuthu = TienNgay * phantram / 100;
            txt_CheckIn.setText(ChuyenDoi.DinhDangSo(phuthu));
        } else {
            txt_CheckIn.setText("0");
        }
        return sosanh;
    }

    public void TinhGioCheckOut(boolean kt) {
        if (kt) {

            Date d = new Date();
            Time t = new Time(d.getTime());
            // System.out.println("thời gian hiện tại"+t);
            Time GioCheckOut = null;
            int Moc1 = 0, Moc2 = 0, phantram = 0, phantram2 = 0;
            double phuthu = 0, TienNgay = 0;
            ResultSet rs = DAO.DAO_Khac.LayBangKhac(5);
            ResultSet rs2 = DAO.DAO_Khac.LayBangKhac(6);
            ResultSet rs3 = DAO.DAO_ThuePhong.LayTienGio(MaDP);
            ResultSet rs4 = DAO.DAO_Khac.LayBangKhac(7);
            ResultSet rs5 = DAO.DAO_Khac.LayBangKhac(8);
            try {
                if (rs.next()) {
                    GioCheckOut = rs.getTime("GiaTriTG");
                    Moc2 = rs.getInt("GiaTriSo");
                }
                if (rs2.next()) {
                    Moc1 = rs2.getInt("GiaTriSo");
                }
                if (rs3.next()) {
                    TienNgay = rs3.getDouble("GiaTheoNgay");

                }
                if (rs4.next()) {
                    phantram = rs4.getInt("GiaTriSo");
                    // System.out.println(phantram+"%");
                }
                if (rs5.next()) {
                    phantram2 = rs5.getInt("GiaTriSo");
                    //  System.out.println(phantram2+"%");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pnl_DSThuePhong.class.getName()).log(Level.SEVERE, null, ex);
            }

            //System.out.println(GioCheckOut);
            Time t2 = new Time(GioCheckOut.getTime());
            long sosanh = (t.getHours() - t2.getHours());
            if (sosanh > Moc1) {
//                txt_checkout.setText("checkout muộn từ 2 -4 giờ");
                phuthu = TienNgay * phantram / 100;
                txt_checkout.setText(ChuyenDoi.DinhDangSo(phuthu));
            } else if (sosanh <= Moc1 && sosanh > Moc2) {
//                txt_checkout.setText("checkout muộn từ 0-2 giờ");
                phuthu = TienNgay * phantram2 / 100;
                txt_checkout.setText(ChuyenDoi.DinhDangSo(phuthu));
            } else {

            }
        } else {
            txt_checkout.setText("0");
        }
        // System.out.println("thời gian ra so với mốc checkout"+sosanh);
//        long sosanh=
    }

    private void TinhTienTheoNgay() {
        try {

            Date NgayGioRa = new Date();
            SimpleDateFormat D = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            c1.setTime(GioThue);
            //System.out.println("ngày ở" + GioThue);
            c2.setTime(NgayGioRa);
            // System.out.println("Ngày ra" + NgayGioRa);
            long soNgay = ((c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000));

//            System.out.println("Ngày ở là " + soNgay);
            ResultSet rs = DAO.DAO_ThuePhong.LayTienGio(MaDP);
            double TienNgay = 0;
            double Tien = 0;
            if (rs.next()) {
                TienNgay = rs.getDouble("GiaTheoNgay");

            }
            if (soNgay == 0) {
                soNgay = 1;
            }
            Tien = TienNgay * soNgay;

            lbl_TienPhong.setText(ChuyenDoi.DinhDangSo(Tien));
            //DTO hóa đơn
            HD.setSoNgayThue(soNgay);
            System.out.println("số ngày HD" + HD.getSoNgayThue());
            //
        } catch (Exception e) {
        }

    }

    private void LamMoi() {
        frm_QuanLyChinh frm = frm_QuanLyChinh.b;
        frm.tab.remove(form);
        pnl_DSThuePhong pnl = new pnl_DSThuePhong();
        frm.tab.add("Danh sách thuê phòng", pnl);
        frm.tab.setSelectedComponent(pnl);
    }

    private void SoNguoi(int giatri) {
        songuoi = songuoi + (giatri);
        txt_SoNguoi.setText(String.valueOf(songuoi));
    }
    public static String MaDP, MaPhong;
    private void tbl_DSThuePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DSThuePhongMouseClicked
        if (tbl_DSThuePhong.getSelectedRowCount() == 1) {
            int vitri = tbl_DSThuePhong.getSelectedRow();
            MaDP = tbl_DSThuePhong.getValueAt(vitri, 0).toString();
            MaPhong = tbl_DSThuePhong.getValueAt(vitri, 2).toString();
            DienDuLieuVaoField(MaDP);
            txt_NgayThue.setFocusable(false);
            txt_NgayRa.setFocusable(false);
            txt_NguoiTao.setFocusable(false);
            txt_Phong.setFocusable(false);
            txt_TenKH.setFocusable(false);
            txt_SoNguoi.setFocusable(false);
            btn_DichVU.setEnabled(true);
            btn_ThanhToan.setEnabled(true);
            btn_Sua.setEnabled(true);
            TienDV(MaDP);
            TongTien();

//DTO hóa đơn
            Date ngaythanhtoan = new Date();
            SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
            HD.setTienPhong(ChuyenDoi.ChuyenSangSo(lbl_TienPhong.getText()));
            HD.setTienDV(ChuyenDoi.ChuyenSangSo(lbl_TienDV.getText()));
            HD.setThanhTien(ChuyenDoi.ChuyenSangSo(lbl_TongCong.getText()));
            HD.setMaDP(Integer.parseInt(MaDP));
            HD.setMaPhong(MaPhong);
            HD.setTenUser(BLL.BLL_DangNhap.TenUser);
            HD.setTenKH(txt_TenKH.getText());
            HD.setPhuThuCheckin(ChuyenDoi.ChuyenSangSo(txt_CheckIn.getText()));
            HD.setPhuThuCheckout(ChuyenDoi.ChuyenSangSo(txt_checkout.getText()));
            HD.setNgayThanhToan(D.format(ngaythanhtoan));
        }

    }//GEN-LAST:event_tbl_DSThuePhongMouseClicked

    private void btn_TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TruActionPerformed
        if (songuoi > 1) {
            SoNguoi(-1);
        }
    }//GEN-LAST:event_btn_TruActionPerformed

    private void btn_CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CongActionPerformed
        SoNguoi(1);
    }//GEN-LAST:event_btn_CongActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        int songuoi = Integer.parseInt(txt_SoNguoi.getText());
        DAO.DAO_ThuePhong.Sua(songuoi, MaDP);
        BLL.BLL_DichVu.DoDuLieuBangDatPhong(tbl_DSThuePhong);
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThanhToanActionPerformed

        DAO.DAO_Phong.Update2(MaPhong);
        DAO.DAO_ThuePhong.TraPhong(MaDP);
        ThemHD();
        LamMoi();
//xuất hóa đơn
        XuatHoaDon(Integer.parseInt(MaDP));

        //tải lại form thuê phòng nếu có
    }//GEN-LAST:event_btn_ThanhToanActionPerformed

    private void txt_GiamGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GiamGiaKeyReleased
        try {
            int sl = Integer.parseInt(txt_GiamGia.getText());
   TongTien();
        } catch (Exception e) {
            txt_GiamGia.setText("0");
          
        }
    }//GEN-LAST:event_txt_GiamGiaKeyReleased
    public void XuatHoaDon(int idhd) {
        try {

            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("src/GUI/rpt_demo2.jrxml");

            map.put("MaDP", idhd);

            JasperPrint p = JasperFillManager.fillReport(report, map, DAO.connection.conn);
            JasperViewer.viewReport(p, false);
            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void ThemHD() {

        DAO.DAO_HoaDon.ThemHD(HD);
        // System.out.println(HD);
    }

    private void TienDV(String MaDP) {
        double TienDV = 0;
        ResultSet rs = DAO.DAO_CTDV.LayCTDV((MaDP));
        try {
            while (rs.next()) {
                TienDV = TienDV + (rs.getDouble("ThanhTien"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_DSThuePhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl_TienDV.setText(ChuyenDoi.DinhDangSo(TienDV));

    }

    private void TongTien() {
        double TienP = ChuyenDoi.ChuyenSangSo(lbl_TienPhong.getText());
        double TienDV = ChuyenDoi.ChuyenSangSo(lbl_TienDV.getText());
        double phuthucheckin = ChuyenDoi.ChuyenSangSo(txt_CheckIn.getText());
        double phuthucheckout = ChuyenDoi.ChuyenSangSo(txt_checkout.getText());
        double tiencoc = ChuyenDoi.ChuyenSangSo(lbl_TienCoc.getText());
        int GiamGia=Integer.parseInt(txt_GiamGia.getText());
        double tong = TienP + TienDV + phuthucheckin + phuthucheckout - tiencoc;
        tong=tong-(tong*GiamGia/100);
        lbl_TongCong.setText(ChuyenDoi.DinhDangSo(tong));
    }

    public void SelectedDP(String MaP) {

        for (int i = 0; i < tbl_DSThuePhong.getRowCount(); i++) {
            if (tbl_DSThuePhong.getValueAt(i, 2).equals(MaP)) {
                MaPhong = MaP;
//System.out.println(MaP);
                tbl_DSThuePhong.setRowSelectionInterval(i, i);
                MaDP = tbl_DSThuePhong.getValueAt(i, 0).toString();
                DienDuLieuVaoField(MaDP);
                txt_NgayThue.setFocusable(false);
                txt_NgayRa.setFocusable(false);
                txt_NguoiTao.setFocusable(false);
                txt_Phong.setFocusable(false);
                txt_TenKH.setFocusable(false);
                txt_SoNguoi.setFocusable(false);
                btn_DichVU.setEnabled(true);
//                btn_ThanhToan.setEnabled(true);
                TienDV(MaDP);
                TongTien();
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cong;
    private javax.swing.JButton btn_DichVU;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_ThanhToan;
    private javax.swing.JButton btn_Tru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_ChiTiet;
    private javax.swing.JLabel lbl_DSThuePhong;
    private javax.swing.JLabel lbl_Dau;
    private javax.swing.JLabel lbl_Dau2;
    private javax.swing.JLabel lbl_Dau3;
    private javax.swing.JLabel lbl_Dau4;
    private javax.swing.JLabel lbl_KM;
    private javax.swing.JLabel lbl_MaDP;
    private javax.swing.JLabel lbl_MaDatPhong;
    private javax.swing.JLabel lbl_Ngay;
    private javax.swing.JLabel lbl_NgayRaDuKien;
    private javax.swing.JLabel lbl_NgayThue;
    private javax.swing.JLabel lbl_NgayVuot;
    private javax.swing.JLabel lbl_NguoiTao;
    private javax.swing.JLabel lbl_PhanTram;
    private javax.swing.JLabel lbl_Phong;
    private javax.swing.JLabel lbl_PhuThuCheckIn;
    private javax.swing.JLabel lbl_PhuThuCheckOut;
    private javax.swing.JLabel lbl_SoNguoi;
    private javax.swing.JLabel lbl_TenKhachHang;
    private javax.swing.JLabel lbl_TienCoc;
    private javax.swing.JLabel lbl_TienCoc2;
    private javax.swing.JLabel lbl_TienDV;
    private javax.swing.JLabel lbl_TienDV2;
    private javax.swing.JLabel lbl_TienPhong;
    private javax.swing.JLabel lbl_TienPhong2;
    private javax.swing.JLabel lbl_TongCong;
    private javax.swing.JLabel lbl_TongCong2;
    private javax.swing.JLabel lbl_Vuot;
    private javax.swing.JLabel lbl_vnd;
    private javax.swing.JLabel lbl_vnd2;
    private javax.swing.JLabel lbl_vnd3;
    private javax.swing.JLabel lbl_vnd4;
    private javax.swing.JLabel lbl_vnd5;
    private javax.swing.JLabel lbl_vnd6;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    public javax.swing.JTable tbl_DSThuePhong;
    private javax.swing.JTextField txt_CheckIn;
    private javax.swing.JTextField txt_GiamGia;
    private javax.swing.JTextField txt_NgayRa;
    private javax.swing.JTextField txt_NgayThue;
    private javax.swing.JTextField txt_NguoiTao;
    private javax.swing.JTextField txt_Phong;
    private javax.swing.JTextField txt_SoNguoi;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_checkout;
    // End of variables declaration//GEN-END:variables
}
