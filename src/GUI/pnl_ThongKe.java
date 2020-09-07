/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class pnl_ThongKe extends javax.swing.JPanel {


    /**
     * Creates new form pnl_ThongKe
     */
    public static pnl_ThongKe form;

    public pnl_ThongKe() {
        initComponents();
        form = this;
        BLL.BLL_ThongKe.DoBangTatCa(tbl_HoaDon);
        ResultSet rs = DAO.DAO_ThongKe.LayTatCaLuong();
        BLL.BLL_ThongKe.DoBangLuong(tbl_Luong, rs);
        DoField();
    }

    private void DoField() {
        
        ResultSet rs = DAO.DAO_ThongKe.LayTatCa2();
        try {
            if (rs.next()) {
                lbl_DV.setText(ChuyenDoi.DinhDangSo(rs.getDouble("dichvu")));
                lbl_TienPhong.setText(ChuyenDoi.DinhDangSo(rs.getDouble("tienphong")));
                lbl_Tong.setText(ChuyenDoi.DinhDangSo(rs.getDouble("doanhthu")));
                lbl_SoHD.setText(rs.getString("SoHD"));
            }
        } catch (SQLException ex) {

        }

        //Lương
        ResultSet rsLuong = DAO.DAO_ThongKe.LayTatCaLuong2();
        try {
            if (rsLuong.next()) {
                lbl_TongLuong.setText(ChuyenDoi.DinhDangSo(rsLuong.getDouble("tongnhan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        lbl_ThongKeHD = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        date_ngay1 = new com.toedter.calendar.JDateChooser();
        lbl_Den = new javax.swing.JLabel();
        date_ngay2 = new com.toedter.calendar.JDateChooser();
        btn_Xem = new javax.swing.JButton();
        pnl3 = new javax.swing.JPanel();
        lbl_TienDV = new javax.swing.JLabel();
        lbl_TienPhong = new javax.swing.JLabel();
        lbl_TienPhong2 = new javax.swing.JLabel();
        lbl_DV = new javax.swing.JLabel();
        lbl_TongDoanhThu = new javax.swing.JLabel();
        lbl_Tong = new javax.swing.JLabel();
        lbl_TongHD = new javax.swing.JLabel();
        lbl_SoHD = new javax.swing.JLabel();
        pnl4 = new javax.swing.JPanel();
        pnl5 = new javax.swing.JPanel();
        lbl_ThongKeLuong = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Luong = new javax.swing.JTable();
        pnl6 = new javax.swing.JPanel();
        lbl_TongLuong2 = new javax.swing.JLabel();
        lbl_TongLuong = new javax.swing.JLabel();
        date_ngay3 = new com.toedter.calendar.JDateChooser();
        date_ngay4 = new com.toedter.calendar.JDateChooser();
        lbl_Den2 = new javax.swing.JLabel();
        btn_Xem2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setBackground(new java.awt.Color(204, 204, 255));
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ThongKeHD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_ThongKeHD.setText("THỐNG KÊ HÓA ĐƠN");
        pnl1.add(lbl_ThongKeHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 470, 60));

        pnl2.setBackground(new java.awt.Color(255, 255, 204));
        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tiền phòng", "Tiền dịch vụ", "Thành tiền", "Phụ thu", "Ngay thanh toán"
            }
        ));
        jScrollPane1.setViewportView(tbl_HoaDon);

        pnl2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 280));
        pnl2.add(date_ngay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 130, 20));

        lbl_Den.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl_Den.setText("đến");
        pnl2.add(lbl_Den, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 20));
        pnl2.add(date_ngay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 20));

        btn_Xem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Xem.setText("Xem");
        btn_Xem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XemActionPerformed(evt);
            }
        });
        pnl2.add(btn_Xem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 15, -1, 20));

        pnl3.setBackground(new java.awt.Color(255, 255, 204));
        pnl3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_TienDV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_TienDV.setText("Tiền dịch vụ:");

        lbl_TienPhong.setBackground(new java.awt.Color(255, 255, 102));
        lbl_TienPhong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_TienPhong.setOpaque(true);

        lbl_TienPhong2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_TienPhong2.setText("Tiền phòng:");

        lbl_DV.setBackground(new java.awt.Color(255, 255, 102));
        lbl_DV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_DV.setOpaque(true);

        lbl_TongDoanhThu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_TongDoanhThu.setText("Tổng doanh thu:");

        lbl_Tong.setBackground(new java.awt.Color(255, 255, 102));
        lbl_Tong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Tong.setOpaque(true);

        lbl_TongHD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_TongHD.setText("Tổng số hóa đơn:");

        lbl_SoHD.setBackground(new java.awt.Color(255, 255, 102));
        lbl_SoHD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_SoHD.setOpaque(true);

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_TienDV)
                    .addComponent(lbl_TienPhong2)
                    .addComponent(lbl_TienPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(lbl_DV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TongDoanhThu)
                    .addComponent(lbl_Tong, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TongHD)
                    .addComponent(lbl_SoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TienDV)
                    .addComponent(lbl_TongDoanhThu))
                .addGap(18, 18, 18)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TienPhong2)
                    .addComponent(lbl_TongHD))
                .addGroup(pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_SoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl2.add(pnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 470, 180));

        add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 470, 510));

        pnl4.setBackground(new java.awt.Color(204, 204, 255));
        pnl4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl5.setBackground(new java.awt.Color(255, 255, 204));

        lbl_ThongKeLuong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_ThongKeLuong.setText("THỐNG KÊ LƯƠNG NHÂN VIÊN");

        javax.swing.GroupLayout pnl5Layout = new javax.swing.GroupLayout(pnl5);
        pnl5.setLayout(pnl5Layout);
        pnl5Layout.setHorizontalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl5Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lbl_ThongKeLuong)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnl5Layout.setVerticalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ThongKeLuong)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl4.add(pnl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        tbl_Luong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên nhân viên", "Số ngày nghỉ", "Số ngày làm", "Ngày nhận", "Tổng nhận"
            }
        ));
        jScrollPane2.setViewportView(tbl_Luong);

        pnl4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 500, 260));

        pnl6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_TongLuong2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_TongLuong2.setText("Tổng lương:");

        lbl_TongLuong.setBackground(new java.awt.Color(255, 255, 255));
        lbl_TongLuong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_TongLuong.setOpaque(true);

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TongLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl6Layout.createSequentialGroup()
                        .addComponent(lbl_TongLuong2)
                        .addGap(0, 370, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongLuong2)
                .addGap(18, 18, 18)
                .addComponent(lbl_TongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pnl4.add(pnl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 500, 180));
        pnl4.add(date_ngay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, -1));
        pnl4.add(date_ngay4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        lbl_Den2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl_Den2.setText("đến");
        pnl4.add(lbl_Den2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 20));

        btn_Xem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Xem2.setText("Xem");
        btn_Xem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Xem2ActionPerformed(evt);
            }
        });
        pnl4.add(btn_Xem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        add(pnl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 520, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XemActionPerformed
        SimpleDateFormat C = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = date_ngay1.getDate();
        Date date2 = date_ngay2.getDate();
        try {
            BLL.BLL_ThongKe.DoBang(tbl_HoaDon, C.format(date1), C.format(date2));
        } catch (Exception e) {
            thongbao.thongbao("Chọn ngày", "");
            return;
        }
        ResultSet rs = DAO.DAO_ThongKe.LayTheoKhoangTG2(C.format(date1), C.format(date2));
        try {
            if (rs.next()) {
                lbl_DV.setText(ChuyenDoi.DinhDangSo(rs.getDouble("dichvu")));
                lbl_TienPhong.setText(ChuyenDoi.DinhDangSo(rs.getDouble("tienphong")));
                lbl_Tong.setText(ChuyenDoi.DinhDangSo(rs.getDouble("doanhthu")));
                lbl_SoHD.setText(rs.getString("SoHD"));
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btn_XemActionPerformed

    private void btn_Xem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Xem2ActionPerformed
        SimpleDateFormat C = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = date_ngay4.getDate();
        Date date2 = date_ngay3.getDate();
        try {
            ResultSet rs= DAO.DAO_ThongKe.LayLuongTheoTG(C.format(date1), C.format(date2));
            BLL.BLL_ThongKe.DoBangLuong(tbl_Luong, rs);
        } catch (Exception e) {
            thongbao.thongbao("Chọn ngày", "");
            return;
        }
        ResultSet rs1=DAO.DAO_ThongKe.LayTheoKhoangTG2(C.format(date1), C.format(date2));
        try {
            if (rs1.next()) {
                lbl_TongLuong.setText(ChuyenDoi.DinhDangSo(rs1.getDouble("tongnhan")));
            }
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btn_Xem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Xem;
    private javax.swing.JButton btn_Xem2;
    private com.toedter.calendar.JDateChooser date_ngay1;
    private com.toedter.calendar.JDateChooser date_ngay2;
    private com.toedter.calendar.JDateChooser date_ngay3;
    private com.toedter.calendar.JDateChooser date_ngay4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_DV;
    private javax.swing.JLabel lbl_Den;
    private javax.swing.JLabel lbl_Den2;
    private javax.swing.JLabel lbl_SoHD;
    private javax.swing.JLabel lbl_ThongKeHD;
    private javax.swing.JLabel lbl_ThongKeLuong;
    private javax.swing.JLabel lbl_TienDV;
    private javax.swing.JLabel lbl_TienPhong;
    private javax.swing.JLabel lbl_TienPhong2;
    private javax.swing.JLabel lbl_Tong;
    private javax.swing.JLabel lbl_TongDoanhThu;
    private javax.swing.JLabel lbl_TongHD;
    private javax.swing.JLabel lbl_TongLuong;
    private javax.swing.JLabel lbl_TongLuong2;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl5;
    private javax.swing.JPanel pnl6;
    private javax.swing.JTable tbl_HoaDon;
    private javax.swing.JTable tbl_Luong;
    // End of variables declaration//GEN-END:variables
}
