/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN_DOC_GHI_FILE;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89
 */
public class Main extends javax.swing.JFrame {

  IStudentService _iSinhVienService;
  DefaultTableModel _dDefaultTableModel;
  DefaultComboBoxModel _dComboBoxModel;
  Utilities _Utilities;
  boolean flag = true;
  String path = "C:\\New folder\\New Text Document.txt";

  public Main() {
    initComponents();
    _iSinhVienService = new StudentService();
    _Utilities = new Utilities();
    cbcGioiTinh();
    radioNganh();
    txt_Id.setEnabled(false);//Làm mờ ô text box và không cho can thiệp vào dữ liệu
    txt_msv.setEnabled(false);
    getMAXID();//Tự động nhẩy ID ở trên GUI
    btn_sua.setEnabled(false);
    btn_xoa.setEnabled(false);
//    _iSinhVienService.docFile(path);
//     loadData(_iSinhVienService.getlstStudents());

  }

  void loadData(List<Student> data) {
    _dDefaultTableModel = (DefaultTableModel) tbl_sinhvien.getModel();
    _dDefaultTableModel.setRowCount(0);
    int stt = 1;
    for (Student x : data) {
      _dDefaultTableModel.addRow(new Object[]{stt++, x.getId(), x.getTen(), x.getSdt(), x.getMsv(), x.getNganhHoc(), x.getGioiTinh() == 1 ? "Nam" : x.getGioiTinh() == 0 ? "Nữ" : "Không xác định"});
    }
    getMAXID();
  }

  void getMAXID() {
    txt_Id.setText(String.valueOf(_iSinhVienService.getMaxID()));
  }

  Student getDataGui() {//Trả 1 về 1 đối tượng lấy từ Control
    //Nếu không code được đoạn này khai báo 1 Student xong rồi chấm từng thuộc tính gán cho control      
    return new Student(txt_msv.getText(),
            (cbc_sex.getSelectedItem() == "Nam" ? 1 : cbc_sex.getSelectedItem() == "Nữ" ? 0 : 2), rdb_Mob.isSelected() ? "MOB" : rdb_udpm.isSelected() ? "UDPM" : "WEB ", Integer.parseInt(txt_Id.getText()), txt_ten.getText(), txt_sdt.getText());
  }

  void cbcGioiTinh() {
    _dComboBoxModel = new DefaultComboBoxModel();
    _dComboBoxModel.addElement("Nam");
    _dComboBoxModel.addElement("Nữ");
    _dComboBoxModel.addElement("Không xác định");
    cbc_sex.setModel(_dComboBoxModel);
  }

  void radioNganh() {
    ButtonGroup btng = new ButtonGroup();
    btng.add(rdb_Mob);
    btng.add(rdb_udpm);
    btng.add(rdb_web);
    rdb_udpm.setSelected(true);
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btn_fakeData = new javax.swing.JButton();
    btn_sua = new javax.swing.JButton();
    btn_them = new javax.swing.JButton();
    btn_Clear = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_sinhvien = new javax.swing.JTable();
    txt_timkiem = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    txt_Id = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    rdb_Mob = new javax.swing.JRadioButton();
    jLabel11 = new javax.swing.JLabel();
    cbc_sex = new javax.swing.JComboBox<>();
    jLabel12 = new javax.swing.JLabel();
    btn_xoa = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txt_ten = new javax.swing.JTextField();
    txt_sdt = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txt_msv = new javax.swing.JTextField();
    rdb_udpm = new javax.swing.JRadioButton();
    rdb_web = new javax.swing.JRadioButton();
    btn_DocFile = new javax.swing.JButton();
    btn_LuuFile = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btn_fakeData.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_fakeData.setText("Fake Data");
    btn_fakeData.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_fakeDataActionPerformed(evt);
      }
    });

    btn_sua.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_sua.setText("Sửa");
    btn_sua.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_suaActionPerformed(evt);
      }
    });

    btn_them.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_them.setText("Thêm");
    btn_them.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_themActionPerformed(evt);
      }
    });

    btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Clear.setText("Clear");
    btn_Clear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ClearActionPerformed(evt);
      }
    });

    tbl_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null}
      },
      new String [] {
        "STT", "ID", "TÊN", "SĐT", "MSV", "NGÀNH HỌC", "SEX"
      }
    ));
    tbl_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_sinhvienMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_sinhvien);

    txt_timkiem.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_timkiemCaretUpdate(evt);
      }
    });
    txt_timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseExited(java.awt.event.MouseEvent evt) {
        txt_timkiemMouseExited(evt);
      }
    });
    txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txt_timkiemKeyPressed(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel8.setText("Msv:");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("ID:");

    txt_Id.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel9.setText("btn");

    jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel10.setText("txt");

    rdb_Mob.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Mob.setText("MOB");

    jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel11.setText("rdb");

    cbc_sex.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel12.setText("cbc");

    btn_xoa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_xoa.setText("Xóa");
    btn_xoa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_xoaActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("Quản lý sinh viên FPOLY SP22");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel3.setText("Tên: ");

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel4.setText("Sđt:");

    txt_ten.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_ten.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_tenCaretUpdate(evt);
      }
    });
    txt_ten.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseExited(java.awt.event.MouseEvent evt) {
        txt_tenMouseExited(evt);
      }
    });

    txt_sdt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel5.setText("lbl");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel6.setText("Ngành:");

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel7.setText("Sex:");

    txt_msv.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    rdb_udpm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_udpm.setText("UDPM");

    rdb_web.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_web.setText("WEB");

    btn_DocFile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_DocFile.setText("Đọc File");
    btn_DocFile.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_DocFileActionPerformed(evt);
      }
    });

    btn_LuuFile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_LuuFile.setText("Lưu File");
    btn_LuuFile.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_LuuFileActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(81, 81, 81)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addComponent(txt_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                          .addComponent(txt_sdt))
                        .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(btn_fakeData)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                      .addComponent(btn_them)))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(btn_Clear)
                    .addGap(417, 417, 417)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(btn_sua)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_xoa)
                    .addGap(271, 271, 271))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel6)
                      .addComponent(jLabel7)
                      .addComponent(jLabel8))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(cbc_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(rdb_Mob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb_udpm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb_web))
                      .addComponent(txt_msv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(236, 236, 236)
                    .addComponent(btn_LuuFile)
                    .addGap(18, 18, 18)
                    .addComponent(btn_DocFile)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel10)
                  .addComponent(jLabel5)
                  .addComponent(jLabel11)
                  .addComponent(jLabel9)
                  .addComponent(jLabel12))
                .addGap(14, 14, 14))))
          .addGroup(layout.createSequentialGroup()
            .addGap(244, 244, 244)
            .addComponent(jLabel2)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(36, 36, 36))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btn_Clear)
            .addGap(18, 18, 18)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(rdb_Mob)
          .addComponent(rdb_udpm)
          .addComponent(rdb_web))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7)
          .addComponent(cbc_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_fakeData)
          .addComponent(btn_them)
          .addComponent(btn_sua)
          .addComponent(btn_xoa))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_DocFile)
          .addComponent(btn_LuuFile))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel9)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel10)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel11)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel12)
        .addGap(152, 152, 152))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_fakeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fakeDataActionPerformed
    _iSinhVienService.fake5Data();
    loadData(_iSinhVienService.getlstStudents());
    btn_fakeData.setEnabled(false);//Chỉ được phép bấm nút Fake 1 lần duy nhất

  }//GEN-LAST:event_btn_fakeDataActionPerformed

  private void txt_tenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tenMouseExited
    if (txt_ten.getText().isBlank()) {
      return;
    }
    txt_ten.setText(_Utilities.convertFullName(txt_ten.getText()));
  }//GEN-LAST:event_txt_tenMouseExited

  private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.add(getDataGui()));
    loadData(_iSinhVienService.getlstStudents());

  }//GEN-LAST:event_btn_themActionPerformed

  private void txt_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyPressed


  }//GEN-LAST:event_txt_timkiemKeyPressed

  private void txt_timkiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timkiemMouseExited

  }//GEN-LAST:event_txt_timkiemMouseExited

  private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.delete(Integer.parseInt(txt_Id.getText())));
    loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_xoaActionPerformed

  private void txt_tenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_tenCaretUpdate
    if (txt_ten.getText().isBlank()) {
      txt_msv.setText("");//Khi mà ô Text box tên bị xóa trắng thì sẽ xóa trắng ô MSV
      return;
    }
    txt_msv.setText(_Utilities.msvFpoly(txt_ten.getText(), Integer.parseInt(txt_Id.getText()), 0));
  }//GEN-LAST:event_txt_tenCaretUpdate

  private void tbl_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sinhvienMouseClicked
    int indexClick = tbl_sinhvien.getSelectedRow();
    //Sau khi người sử dụng bấm data tren bảng sẽ biết được index dòng bấm.
    var sv = _iSinhVienService.getlstStudents().get(indexClick);
    txt_Id.setText(String.valueOf(sv.getId()));
    txt_ten.setText(sv.getTen());
    txt_sdt.setText(sv.getSdt());
    txt_msv.setText(sv.getMsv());
    rdb_Mob.setSelected(sv.getNganhHoc().equals("MOB") ? true : false);
    rdb_udpm.setSelected(sv.getNganhHoc().equals("UDPM") ? true : false);
    rdb_web.setSelected(sv.getNganhHoc().equals("WEB") ? true : false);
    cbc_sex.setSelectedItem(sv.getGioiTinh() == 1 ? "Nam" : sv.getGioiTinh() == 0 ? "Nữ" : "Không xác định");
    //Sau khi bấm vào table thì nút thêm sẽ bị ẩn đi
    btn_them.setEnabled(false);
    btn_sua.setEnabled(true);
    btn_xoa.setEnabled(true);
  }//GEN-LAST:event_tbl_sinhvienMouseClicked

  private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.edit(getDataGui()));
    loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_suaActionPerformed

  private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
//     Đưa GUI về mặc định để có thêm mới
    btn_them.setEnabled(true);
    txt_ten.setText("");
    txt_sdt.setText("");
    txt_msv.setText("");
    rdb_udpm.setSelected(true);
    cbc_sex.setSelectedIndex(0);
    getMAXID();
    btn_sua.setEnabled(false);
    btn_xoa.setEnabled(false);
  }//GEN-LAST:event_btn_ClearActionPerformed

  private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
    loadData(_iSinhVienService.find(txt_timkiem.getText()));
  }//GEN-LAST:event_txt_timkiemCaretUpdate

  private void btn_DocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocFileActionPerformed
   JOptionPane.showMessageDialog(this, _iSinhVienService.docFile(path));
    loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_DocFileActionPerformed

  private void btn_LuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuFileActionPerformed
   JOptionPane.showMessageDialog(this, _iSinhVienService.ghiFile(path));
    loadData(_iSinhVienService.getlstStudents());
  }//GEN-LAST:event_btn_LuuFileActionPerformed

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
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Main().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Clear;
  private javax.swing.JButton btn_DocFile;
  private javax.swing.JButton btn_LuuFile;
  private javax.swing.JButton btn_fakeData;
  private javax.swing.JButton btn_sua;
  private javax.swing.JButton btn_them;
  private javax.swing.JButton btn_xoa;
  private javax.swing.JComboBox<String> cbc_sex;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JRadioButton rdb_Mob;
  private javax.swing.JRadioButton rdb_udpm;
  private javax.swing.JRadioButton rdb_web;
  private javax.swing.JTable tbl_sinhvien;
  private javax.swing.JTextField txt_Id;
  private javax.swing.JTextField txt_msv;
  private javax.swing.JTextField txt_sdt;
  private javax.swing.JTextField txt_ten;
  private javax.swing.JTextField txt_timkiem;
  // End of variables declaration//GEN-END:variables
}
